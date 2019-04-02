/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 06/10/2018
 *
 */

#include "find.h"

/**
 * Checks if the entity is either the parent or the current directory
 */
int is_parent_or_current (struct dirent * entity) {
  return is_parent(entity) || is_current(entity);;
}

/**
 * Checks if the entity is the parent directory
 */
int is_parent (struct dirent * entity) {
  return strcmp(entity->d_name, "..") == 0;
}

/**
 * Checks if the entity is the current directory
 */
int is_current (struct dirent * entity) {
  return strcmp(entity->d_name, ".") == 0;
}

/**
 * Returns whether or not the file is a directory
 */
int is_directory (struct dirent * entity){
   return (entity->d_type == DT_DIR);
}

/**
 * Loads an image plugin and checks if the path contains an image
 */
int is_ignored_from_image_plugin (char * path) {
  int    is_ignored = FALSE;
  char * error      = NULL;
  int (*plugin_main)(char * path) = NULL;
  void * plugin;

  // loads the plugin
  plugin = dlopen("lib/image_plugin.so", RTLD_LAZY);
  if (!plugin) {
    fprintf(stderr, "%s\n", dlerror());
    exit(EXIT_FAILURE);
  }

  // gets the main function
  plugin_main = dlsym(plugin, "is_image");
  error = dlerror();
  if (error != NULL) {
    perror(error);
    dlclose(plugin_main);
    exit(EXIT_FAILURE);
  }

  // main function call
  is_ignored = (*plugin_main)(path);

  // closing plugin
  dlclose(plugin);

  return !is_ignored;
}

int build_path(char* path, char* dest, char* name){
  if (strlen(path)>2){
    sprintf(dest,"%s/%s",path,name);
  }
  return 1;
}

/**
 * Returns true if the file should be printed
 */
int be_ignored (struct dirent * entity, option_t * arguments [ARGUMENTS_NUMBER], char * path, char * relative_path){ // var "path" includes the name of the file
  int be_ignored = is_parent_or_current(entity);

  if (!be_ignored){
    be_ignored=(strcmp(entity->d_name,".rsfind_result_search.txt")==0);
  }

  if (!be_ignored && is_set(arguments[FILE_NAME_EQUALS_STRING])) {
    be_ignored = (strcmp(entity->d_name, option_arg(arguments[FILE_NAME_EQUALS_STRING])));
  }

  if (!be_ignored && is_set(arguments[FILE_CONTAINING_STRING])) {
    be_ignored = !compare(entity, path,option_arg(arguments[FILE_CONTAINING_STRING]));
  }

  if (!be_ignored && is_set(arguments[IMAGE])) {
    be_ignored = is_ignored_from_image_plugin(path);
  }

  if (!be_ignored && is_set(arguments[FILE_NAME_REGEX])) { // -ename

    char*pathtempregex=malloc(10*strlen(relative_path)*sizeof(char)); //comme subpath pointe, pour ne pas le modifier aveac create_glob_t, on envoie une copie temporaire
    strcpy(pathtempregex,relative_path);
    create_glob_t_results(pathtempregex,option_arg(arguments[FILE_NAME_REGEX])); //creation de (glob_t) results dans regex_shell.c
    free(pathtempregex);

    be_ignored = !parse_regex(path);
  }

  if (!be_ignored && is_set(arguments[FILE_CONTAINING_REGEX])) { // -T
    be_ignored = !compare_regex(entity, path,option_arg(arguments[FILE_CONTAINING_REGEX]));
  }

  return be_ignored;
}

/**
 * Prints the file
 */
int print_file (char * path, option_t * arguments [ARGUMENTS_NUMBER], int sortie) {
  int error = NO_ERROR;

  if (is_set(arguments[LONG_LISTING_ALIGNED]) || is_set(arguments[LONG_LISTING])){ // -l
    if (is_set(arguments[LONG_LISTING_ALIGNED])) error = long_listing_stats(path);
    else error = long_listing_not_aligned(path);
  } else if (is_set(arguments[PRINT])) {
    write(1, path, strlen(path));
    write(1, "\n", sizeof(char));
  }

  if (is_set(arguments[VERIFICATION]) || is_set(arguments[EXEC_CMD]) || is_set(arguments[LONG_LISTING_ALIGNED])) {
    write(sortie, path, strlen(path));
    write(sortie, "\n", sizeof(char));
  }

  return error;
}

int file_size (int file) {
  int file_size = lseek(file, 0, SEEK_END);
  lseek(file, 0, SEEK_SET);

  return file_size;
}

char * full_file (struct dirent * entity, char * path) {
  int size_file = 0;
  int file      = 0;
  char * buffer;

  if (!is_directory(entity)) {
    file = open(path, O_RDONLY);
    size_file = file_size(file);
    buffer = (char *) malloc(size_file * sizeof(char));
    if (read(file, buffer, size_file) < 0) {
      print_error(READING_FILE_ERROR);
      exit(EXIT_FAILURE);
    }
    close(file);
  } else {
    buffer = (char *) malloc (STANDARD_SMALL_BUFFER_SIZE * sizeof(char));
  }

  return buffer;
}

/**
* Returns TRUE if the motif is present in the file (path)
*/
int compare(struct dirent * entity, char* path, char* motif) {
  int    result = FALSE;
  char * buffer;
  char * point;

  buffer = full_file(entity, path);

  point  = strstr(buffer, motif);
  result = (point != NULL);

  free(buffer);
  return result;
}

int compare_regex(struct dirent * entity, char* path, char* motif) {
  int    result = FALSE;
  char * buffer;

  buffer = full_file(entity, path);

  result = is_accepted_standard(motif , buffer ); // here, the motif is the option and the option is the regex

  free(buffer);
  return result;
}

/**
 * Lists the content of a directory from a given path
 * handles no option for now
 */
int find (char * path, option_t * arguments [ARGUMENTS_NUMBER], int sortie) { //Fonction find sans option et avec affichage correct des dossiers, sous-dossiers, et leur contenu, dans le même ordre que find.

  int error         = NO_ERROR;
  char* subpath     = malloc(STANDARD_BUFFER_SIZE * sizeof(char));
  char* subpathtemp = malloc(STANDARD_BUFFER_SIZE * sizeof(char)); //sert à stocker le sous-chemin d'un dossier à passer en paramètre lors de l'appel récursif
  strcpy(subpath,path); //subpath stockera les chemins des sous-dossiers

  DIR           * directory  = NULL;
  struct dirent * entite     = NULL; //entite pourra pointer vers un dossier ou un fichier

  //int             new_dir   = FALSE;

  directory = opendir(subpath); //Ouverture du dossier

  char*pathtempregex=malloc(10*strlen(subpath)*sizeof(char)); //comme subpath pointe, pour ne pas le modifier aveac create_glob_t, on envoie une copie temporaire
  strcpy(pathtempregex,subpath);

/*  if (is_set(arguments[FILE_NAME_REGEX])){
    create_glob_t_results(pathtempregex,option_arg(arguments[FILE_NAME_REGEX])); //creation de (glob_t) results dans regex_shell.h
  }*/

  free(pathtempregex);

  if (directory == NULL){ //Dossier non ouvert
    if (errno == ERRNO_PERMISSION_DENIED) {
      error = PERMISSION_DENIED;
    } else {
      error = PATH_DOES_NOT_EXIST;
    }
  } else {
    entite = readdir(directory);

    //new_dir=TRUE;

    while (entite != NULL && error == NO_ERROR){ //vaut NULL lorsqu'il n'y a plus rien a lire

      full_path(subpathtemp, subpath, entite->d_name);

      // fprintf(stderr, "subpath %s, subpathtemp %s\n",subpath,subpathtemp);

      // if there is no error and the current file should not be ignored then print it
      if (!be_ignored(entite, arguments, subpathtemp, subpath) && error == NO_ERROR) {
      	error = print_file(subpathtemp, arguments, sortie);
      }

      // if it is a directory but not . or .. and there is still no error and -d option is not active then recursively call find
      if (!is_set(arguments[DIRECTORY]) && is_directory(entite) && !is_parent_or_current(entite) && error == NO_ERROR) { //&& !is_set(arguments[FILE_NAME_REGEX]) car fonction glob déjà récursive
      	error = find(subpathtemp, arguments, sortie);
      }

      entite = readdir(directory);
      //new_dir=FALSE;
    }

    if (closedir(directory) == -1 && error == NO_ERROR) {
      error = CANNOT_CLOSE_PATH_DIRECTORY;
    }
  }

  free(subpathtemp);
  free(subpath);
  return error;
}

/**
 * Check if the path needs a '/' or not and concatenates it with a file name
 */
void full_path (char * destination, char * path, char * file_name) {
  if (strcmp(file_name, ".") == 0)                        sprintf(destination, "%s", path);
  else if (path[strlen(path) - 1] != '/')                 sprintf(destination,"%s/%s", path, file_name);
  else                                                    sprintf(destination, "%s%s", path, file_name);
}

int rsfind (option_t * arguments [ARGUMENTS_NUMBER]) {
  int error = NO_ERROR;
  int sortie = 1; //sortie standard

  if (is_set(arguments[VERIFICATION]) || is_set(arguments[EXEC_CMD]) || is_set(arguments[LONG_LISTING_ALIGNED])){
    error = create_result_file(&sortie); //si --exec : redirection de stdout vers un fichier stockant les résultats des requêtes
  }

  // research title if necessary
  if (should_handle_path(arguments)) {
    error = handle_path(arguments, sortie);
  }

  if (error == NO_ERROR) {

    error = find(option_arg(arguments[PATH]), arguments, sortie);
    post_treatment(arguments);
  }

  if (is_set(arguments[VERIFICATION]) || is_set(arguments[EXEC_CMD]) || is_set(arguments[LONG_LISTING_ALIGNED])) error = remove_file();


  return error;
}


int should_handle_path (option_t * arguments [ARGUMENTS_NUMBER]) {
  return !is_set(arguments[LONG_LISTING_ALIGNED])
    && !is_set(arguments[FILE_NAME_EQUALS_STRING])
    && !is_set(arguments[IMAGE])
    && !is_set(arguments[FILE_CONTAINING_STRING])
    && !is_set(arguments[FILE_CONTAINING_REGEX])
    && !is_set(arguments[FILE_NAME_REGEX]);
}

int handle_path (option_t * arguments [ARGUMENTS_NUMBER], int sortie) {
  char * path = option_arg(arguments[PATH]);
  int error = NO_ERROR;

  if (is_set(arguments[LONG_LISTING])) {
    error = long_listing_not_aligned(path);
  } else  {
    write(sortie, path, strlen(path));
    write(sortie, "\n", sizeof(char));
  }

  return error;
}

int post_treatment (option_t * arguments [ARGUMENTS_NUMBER]) {
  int error = NO_ERROR;

  if (should_display_long_listing_aligned(arguments)) {
      error = long_listing_display_from_file();
  }
  if (is_set(arguments[EXEC_CMD])){
    error = execute_command(arguments);
  }
  if (is_set(arguments[VERIFICATION])){
    error = execute_proverif();
  }

  return error;
}

int should_display_long_listing_aligned (option_t * arguments [ARGUMENTS_NUMBER]) {
  return (is_set(arguments[LONG_LISTING_ALIGNED]) && !is_set(arguments[EXEC_CMD]))
    || (is_set(arguments[LONG_LISTING_ALIGNED]) && is_set(arguments[EXEC_CMD]) && is_set(arguments[PRINT]))
    || (is_set(arguments[LONG_LISTING_ALIGNED]) && is_set(arguments[VERIFICATION]) && is_set(arguments[PRINT]));
}
