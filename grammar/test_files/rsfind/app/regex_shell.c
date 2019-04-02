/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 01/10/2018
 *
 */

 #include "regex_shell.h"
#include "find.h"

void create_glob_t_results(char * path, char * regex){
  char * cmd = (char *) malloc(STANDARD_BUFFER_SIZE * sizeof(char));
  int error = 0;

  full_path(cmd, path, regex);

  error = glob(cmd, 0, NULL, &results);

  handle_glob_error(error);
}

void handle_glob_error (int error) {
  if (error != 0) {
    if (error != GLOB_NOMATCH) fprintf(stderr, "glob error : ");
    switch (error){
    case GLOB_ABORTED:
      fprintf(stderr, "filesystem problem\n");
      break;
    case GLOB_NOMATCH:
      //fprintf(stderr, "no match of pattern\n");
      break;
    case GLOB_NOSPACE:
      fprintf(stderr, "no dynamic memory\n");
      break;
    default:
      fprintf(stderr, "unknown error");
    }
  }
}


int parse_regex(char * name){

	int found = 0;
	int i = 0;
	while (!found && i < (int) results.gl_pathc) {
	  found = (strcmp(results.gl_pathv[i], name) == 0);
	  i = i + 1;
	}

	return found;
}
