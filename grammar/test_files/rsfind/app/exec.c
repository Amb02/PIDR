/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 17/10/2018
 *
 */

#include "exec.h"

/**
 * Creates a file which will contain the results of the searches rsfind and redirect stdout to this file
 */
int create_result_file (int * sortie) {
  int error = NO_ERROR;

  remove(".rsfind_result_search.txt");
  int file = open(".rsfind_result_search.txt", O_WRONLY | O_CREAT, 0744);

  if (file < 0){
    error= CREATING_OR_READING_FILE_ERROR;
  }
  
  *sortie = file; //pointeur vers un fichier pour stocker les résultats
  
  return error;
}

/**
 * Parses the command and replaces the location where a file name should be put
 * as well as creating an after_pipe command if the command contains a pipe structure
 */ 
int command_parsing (char ** command, int command_length, char * path_file, int * changed_string_index, char ** command_after_pipe, int * is_pipe) {
  int i              = 0;
  int k              = 0;
  int len_after_pipe = 0;
  int error          = NO_ERROR;
  
  // replaces the { character with the file name
  // and checks if the command is piped
  for (i = 0; i < command_length; i ++) { 
    if (command[i][0] == EXEC_FILE_CHARACTER) {
      *changed_string_index = i; // keeps the previous value in memory for the future calls to this function
      strcpy(command[i], path_file);
    }

    if (command[i][0] == EXEC_PIPE_CHARACTER) {
      *is_pipe       = TRUE;
      len_after_pipe = command_length - i - 1;  // -1 car '|' ne compte pas

      //déplacement de la fin de cmd_cut dans cmd_cut_after_pipe
      for (k = 0; k < len_after_pipe; k ++) {
        command_after_pipe[k] = (char*) malloc(STANDARD_BUFFER_SIZE * sizeof(char));
        strcpy(command_after_pipe[k],command[k + i + 1]); // copie la fin de la commande dans cmd_cut_after_pipe
        command[k + i] = NULL; // "supprime" la fin de cmd_cut
      }
      
      command[command_length - 1] = NULL;
      command_length              = i;
    }
  }

  return error;
}

/**
 * Create the array(s) containing the command and execute the programme "fork_exec" with this/theses array(s)
 */
int execute(char** cmd_cut, char* path_file, int len_cmd) {
  int i               = 0;
  int index           = 0;
  int after_pipe      = FALSE;
  int error           = NO_ERROR;
  int len_after_pipe  = 0;

  char  * command_path       = (char *) malloc(STANDARD_SMALL_BUFFER_SIZE * sizeof(char));
  char ** cmd_cut_after_pipe = (char **) malloc(EXEC_CMD_SIZE * sizeof(char*));
  
  error = command_parsing(cmd_cut, len_cmd, path_file, &index, cmd_cut_after_pipe, &after_pipe);

  fork_exec(&error, after_pipe, command_path, cmd_cut, cmd_cut_after_pipe);

  // puts the cmd_cut back to where it was before the function call
  strcpy(cmd_cut[index], "{}");
  
  //libération de l'espace alloué  
  free(command_path);
  for (i = 0; i < len_after_pipe; i ++) {
    free(cmd_cut_after_pipe[i]);
  }
  free(cmd_cut_after_pipe);

  return error;
}

/**
 * Execute a simple command with a fork and the exec function
 */
void simple_exec_fork (int * error, char * command_path, char ** cmd_cut) {
   switch (fork()) {
    case - 1 :
      *error = CREATING_FORK_ERROR;
      break;
    case   0 :
      sprintf(command_path, "/bin/%s", cmd_cut[0]); 
      execv(command_path, cmd_cut);
      fprintf(stderr, "%s\n", strerror(errno));
      exit(EXIT_FAILURE);
      break;
    default  :
      wait(NULL); // wait for the son's end
      break;
    }
}

void pipe_exec_fork (int * error, char * command_path, char ** cmd_cut, char ** cmd_cut_after_pipe) {
  int tube[2];
  pipe(tube);
    
  switch (fork()) {
  case - 1 :
    *error = CREATING_FORK_ERROR;
    break;
  case   0 :
    // closing reading
    close(tube[0]);
    // duplicate stdout in tube[1]
    dup2(tube[1], 1);
    close(tube[1]);
      
    sprintf(command_path, "/bin/%s", cmd_cut[0]); // bin nécessaire
    execv(command_path, cmd_cut);
    exit(EXIT_FAILURE);
    break;
  default  :
    switch (fork()) {
    case - 1 :
      *error = CREATING_FORK_ERROR;
      break;
    case   0 :
      // closing writing
      close(tube[1]);
      // duplicate stdin in tube[0]
      dup2(tube[0], 0);
      close(tube[0]);
      
      sprintf(command_path, "%s", cmd_cut_after_pipe[0]); // /bin/%s? 
      execvp(command_path, cmd_cut_after_pipe);
      exit(EXIT_FAILURE);  
      break;
    default  :
      close(tube[0]);
      close(tube[1]);
      wait(NULL); // wait for the sons' end
      wait(NULL);
      break;
    }
    break;
  }
}

/**
* fork+exec à partir du/des tableau(x) de commande cmd_cut(_after_pipe)
*/
void fork_exec(int* error, int after_pipe, char* command_path, char** cmd_cut, char** cmd_cut_after_pipe){
  if (!after_pipe){ // exec sans pipe
    simple_exec_fork(error, command_path, cmd_cut);
  } else { // exec avec pipe
    pipe_exec_fork(error, command_path, cmd_cut, cmd_cut_after_pipe);
  }
}

/**
 * Cuts the commands in pieces
 */
int cut_cmd(char** cmd_cut, char* cmd, int* len_cmd){ //cmd_cut is an array of char* , each char* contains a key-word of the cmd
  int error  = NO_ERROR;
  int i      = 0;
  char* word = (char*) malloc(STANDARD_SMALL_BUFFER_SIZE * sizeof(char));
  
  if (strcmp(cmd, "")) word = strtok(cmd, " ");
  else error = EMPTY_EXEC_OPTION;
  
  while (word != NULL && error == NO_ERROR) {
    strcpy(cmd_cut[i], word);
    i = i + 1;
    
    if (i == EXEC_CMD_SIZE) {
      error = EXEC_OPTION_IS_TOO_LONG;
    } else {
      word = strtok(NULL, " ");
    }
  }
  
  if (error == NO_ERROR) {
    cmd_cut[i] = NULL;
    *len_cmd = i;
    free(word);
  }

  return error;
}

/**
 * Goes through the temporary file and calls the execute function on the listed files
 */
void parsing_results_searches(char** cmd_cut, int * error, int * len_cmd){
  char   buffer;
  int    nb;
  char * ligne_courante = (char*) calloc(STANDARD_BUFFER_SIZE, sizeof(char));
  int    file           = open(".rsfind_result_search.txt", O_RDONLY);

  if (file == -1) {
    *error = IMPOSSIBLE_TO_OPEN_FILE;
  } else {
    nb = read(file, &buffer, sizeof(char));
    sprintf(ligne_courante, "%c", buffer);
    while (nb > 0 && *error == NO_ERROR) {
      nb = read(file, &buffer, sizeof(char));
      if ((buffer == '\n') && (nb != 0)){
        *error = execute(cmd_cut, ligne_courante, *len_cmd);
        strcpy(ligne_courante,"");
      } else {
        sprintf(ligne_courante,"%s%c", ligne_courante, buffer);
      }
    }
    
    close(file);
  }

  free(ligne_courante);
}

/**
 * removes the temporary file 
 */
int remove_file () {
  int rm = remove(".rsfind_result_search.txt");
  int error=NO_ERROR;
  if (rm != 0) {
    error=DELETE_FILE_ERROR;
  }
  
  return error;
}

/**
 * Handles all the process from the exec argument to the command execution
 */
int execute_command (option_t * arguments [ARGUMENTS_NUMBER]) {
  char ** cmd_cut;
  int     i       = 0;
  int     len_cmd = 0;
  int     error   = NO_ERROR;
  char  * command = option_arg(arguments[EXEC_CMD]);

  cmd_cut = (char **) malloc((EXEC_CMD_SIZE + 1) * sizeof(char*));
  for (int i = 0; i < EXEC_CMD_SIZE + 1; i++){
    cmd_cut[i] = (char*) malloc(STANDARD_BUFFER_SIZE * sizeof(char));
  }
  
  error = cut_cmd(cmd_cut, command, &len_cmd);
  if (error == NO_ERROR) parsing_results_searches(cmd_cut, &error, &len_cmd);

  // free all allocated space 
  for (i = 0; i < EXEC_CMD_SIZE + 1; i ++) {
    free(cmd_cut[i]);
  }
  
  free(cmd_cut);

  return error;
}

