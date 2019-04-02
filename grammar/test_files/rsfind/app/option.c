/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 03/10/2018
 *
 */

#include "option.h"

/**
 * Creates a new option
 */
option_t *  new_option () {
  option_t * option = (option_t*) malloc(sizeof(option_t));
  option->flag = FALSE;
  option->arg = (char *) malloc(STANDARD_BUFFER_SIZE * sizeof(char));
  if (option->arg == NULL) {
    fprintf(stderr, "error when allocating memory to a new option structure\n");
    free(option);
    exit(EXIT_FAILURE);
  }

  strcpy(option->arg, "");

  return option;
}

/**
 * Returns the flag
 */
int option_flag (option_t * option) {
  return option->flag;
}

/**
 * Returns whether or not the buffer is used
 */
int is_set (option_t * option) {
  return option_flag(option);
}

/**
 * Returns the argument of an option
 */
char * option_arg (option_t * option) {
  return option->arg;
}

/**
 * Returns whether or not the function has an argument
 */
int has_argument (option_t * option) {
  return strcmp(option_arg(option), "") != 0;
}

/**
 * Sets the option flag to the given value
 */
void set_option_flag (option_t * option, int flag) {
  option->flag = flag;
}

/**
 * Sets the option argument to the given value
 */
void set_option_argument (option_t * option, char * argument) {
  strcpy(option->arg, argument);
}

/**
 * Function that sets an argument as used and returns if the argument is set
 */
int set_argument (option_t * arguments [ARGUMENTS_NUMBER], int index, char * argument) {
  int error = FALSE;
  if (argument == NULL || argument[0] == '-') {
    error = TRUE;
  } else {
    set_option_flag(arguments[index], TRUE);
    set_option_argument(arguments[index], argument);
  }

  return error;
}

/**
 * Prints the current state of the option
 */
void print_option_state (option_t * option) {
  puts(" __________________________________________");
  puts("|               OPTION                     |");

  printf("\tstate    : %s \n", is_set(option) ? "activated" : "not activated");
  printf("\targument : %s\n", has_argument(option) ? option_arg(option) : "no argument");

  puts("|__________________________________________|");
  puts("");
}

/**
 * Free an option structure
 */
void free_option (option_t * option) {
  free(option_arg(option));
  free(option);
}


/**
 * Initialises the arguments array containing all the possible options
 */
void initialise_arguments_array (option_t * arguments [ARGUMENTS_NUMBER]) {
  int i = 0;
  int j = 0;

  for (i = 0; i < ARGUMENTS_NUMBER; i ++) {
    arguments[i] = new_option();

    // check if the allocation went as expected
    // if not free all that has already been allocated and exit
    if (arguments[i] == NULL) {
      fprintf(stderr, "error when allocating an option to the arguments array");
      for (j = 0; j < i; j ++) {
        free_option(arguments[j]);
      }
      exit(EXIT_FAILURE);
    }
  }
}

char * get_path (option_t * arguments [ARGUMENTS_NUMBER]) {
    return option_arg(arguments[PATH]);
}

void print_all_options_states (option_t * arguments [ARGUMENTS_NUMBER]) {
  puts("PATH option :");
  print_option_state(arguments[PATH]);

  puts("LONG LISTING (-l) option");
  print_option_state(arguments[LONG_LISTING]);

  puts("LONG LISTING ALIGNED (--laligned) option");
  print_option_state(arguments[LONG_LISTING_ALIGNED]);

  puts("FILE_CONTAINING_STRING (-t) option");
  print_option_state(arguments[FILE_CONTAINING_STRING]);

  puts("IMAGE option (-i) option");
  print_option_state(arguments[IMAGE]);

  puts("FILE_NAME_EQUALS_STRING (--name) option");
  print_option_state(arguments[FILE_NAME_EQUALS_STRING]);

  puts("EXEC_CMD (--exec) option");
  print_option_state(arguments[EXEC_CMD]);

  puts("PRINT (--print) option");
  print_option_state(arguments[PRINT]);

  puts("FILE_NAME_REGEX (-ename) option");
  print_option_state(arguments[FILE_NAME_REGEX]);

  puts("FILE_CONTAINING_REGEX (-T) option");
  print_option_state(arguments[FILE_CONTAINING_REGEX]);

  puts("VERIFICATION (--proverif) option");
  print_option_state(arguments[VERIFICATION]);

  puts("DIRECTORY (-d) option");
  print_option_state(arguments[DIRECTORY]);

  puts("DEBUG option");
  print_option_state(arguments[DEBUG]);
}

/**
 * Frees the array of options
 */
void free_arguments (option_t * arguments  [ARGUMENTS_NUMBER]) {
  int i = 0;
  for (i = 0; i < ARGUMENTS_NUMBER; i ++) {
    free_option(arguments[i]);
  }
}

/**
 * Function that handles the rsfind options
 * for now it only activates local flags to check
 * if the option is set or not
 */
void option_handler (int argc, char ** argv, option_t * arguments [ARGUMENTS_NUMBER]) {
  int error = NO_ERROR;

  struct option long_options [] = {
    // template : {option_name, has_arg, flag, val}
    {"listing"                , no_argument      , NULL, 'l'},
    {"laligned"               , no_argument      , NULL, 'L'},
    {"file_containing_string" , required_argument, NULL, 't'},
    {"image"                  , no_argument      , NULL, 'i'},
    {"name"                   , required_argument, NULL, 'n'},
    {"exec"                   , required_argument, NULL, 'e'},
    {"print"                  , no_argument      , NULL, 'p'},
    {"file_containing_regex"  , required_argument, NULL, 'T'},
    {"ename"                  , required_argument, NULL, 'E'},
    {"proverif"               , no_argument      , NULL, 'P'},
    {"directory"              , no_argument      , NULL, 'd'},
    {"debug"                  , no_argument      , NULL, 'D'},
    {0, 0, 0, 0}
  };

  puts_options_flags(argc, argv, long_options, arguments, &error);
  verify_options_settings(error, arguments);

  int remaining_arguments = optind - argc;
  handle_remaining_arguments(argc, argv, remaining_arguments, arguments);
}

void puts_options_flags (int argc, char ** argv, struct option long_options [ARGUMENTS_NUMBER], option_t * arguments [ARGUMENTS_NUMBER], int * error) {
  int result = 0;
  int option_index = 0;

  while ((result = getopt_long_only(argc, argv, "lt:ie:n:pT:E:DdP", long_options, &option_index)) != -1 && no_error(*error)) {
    switch (result) {
    case 'l' :
      set_option_flag(arguments[LONG_LISTING], TRUE);
      break;
    case 'L' :
      set_option_flag(arguments[LONG_LISTING_ALIGNED], TRUE);
      break;
    case 't' :
      *error = set_argument(arguments, FILE_CONTAINING_STRING, optarg);
      break;
    case 'i' :
      set_option_flag(arguments[IMAGE], TRUE);
      break;
    case 'n' :
      *error = set_argument(arguments, FILE_NAME_EQUALS_STRING, optarg);
      break;
    case 'e' :
      *error = set_argument(arguments, EXEC_CMD, optarg);
      break;
    case 'p' :
      set_option_flag(arguments[PRINT], TRUE);
      break;
    case 'T' :
      *error = set_argument(arguments, FILE_CONTAINING_REGEX, optarg);
      break;
    case 'E' :
      *error = set_argument(arguments, FILE_NAME_REGEX, optarg);
      break;
    case 'D' :
      set_option_flag(arguments[DEBUG], TRUE);
      break;
    case 'd' :
      set_option_flag(arguments[DIRECTORY], TRUE);
      break;
    case 'P' :
      set_option_flag(arguments[VERIFICATION], TRUE);
      break;
    case '?' :
    default  :
      *error = TRUE;
      break;
    }
  }
}

void verify_options_settings (int error_code, option_t * arguments [ARGUMENTS_NUMBER]) {
  if (!no_error(error_code)) {
    exit_sequence_with_usage(arguments);
  }
}

void exit_sequence_with_usage (option_t * arguments [ARGUMENTS_NUMBER]) {
  print_usage();
  free_arguments(arguments);
  exit(EXIT_FAILURE);
}

void handle_remaining_arguments (int argc, char ** argv, int remaining_amount, option_t * arguments [ARGUMENTS_NUMBER]) {
  if (remaining_amount > 2) {
    exit_sequence_with_usage(arguments);
  } else {
    if (remaining_amount != 0) {
      set_argument(arguments, PATH, argv[argc - 1]);
    }
  }
}

void set_default_arguments (option_t * arguments [ARGUMENTS_NUMBER]) {
  if (!is_set(arguments[PATH])) {
    set_argument(arguments, PATH, ".");
  }

  if (!is_set(arguments[PRINT]) && (!is_set(arguments[LONG_LISTING]) || !is_set(arguments[LONG_LISTING_ALIGNED])) && !(is_set(arguments[VERIFICATION])) && !(is_set(arguments[LONG_LISTING_ALIGNED]))) {
    set_option_flag(arguments[PRINT], TRUE);
  }

  if (is_set(arguments[EXEC_CMD]) && !is_set(arguments[PRINT])){
    set_option_flag(arguments[PRINT], FALSE);
  }
}

int check_options (option_t * arguments [ARGUMENTS_NUMBER]) {
  int error = NO_ERROR;
  if (is_set(arguments[LONG_LISTING]) && is_set(arguments[PRINT])) error = NO_ERROR;
  return error;
}

void print_usage () {
  puts("usage : rsfind [OPTION] ... [CHEMIN]");
  puts("see rsfind description at https://gitlab.telecomnancy.univ-lorraine.fr/Marceau.Dida/rs2018-baudot-dida/blob/master/README.md");
}
