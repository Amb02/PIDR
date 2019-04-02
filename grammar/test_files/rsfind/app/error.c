/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 06/10/2018
 *
 */

#include "error.h"

void print_error (int error_code) {
    switch (error_code) {
    case NO_ERROR :
      // better print nothing when no error is detected
      //puts("NO_ERROR code : no error detected");
      break;
    case PATH_DOES_NOT_EXIST :
      fprintf(stderr, "PATH_DOES_NOT_EXIST code : impossible to find the given path\n");
      break;
    case CANNOT_CLOSE_PATH_DIRECTORY :
      fprintf(stderr, "CANNOT_CLOSE_DIRECTORY code : impossible to close the previously opened directory\n");
      break;
    case IMPOSSIBLE_TO_GET_STATS :
      fprintf(stderr, "IMPOSSIBLE_TO_GET_STATS code : impossible to get the stats of the file when long listing\n");
      break;
    case IMPOSSIBLE_TO_OPEN_FILE :
      fprintf(stderr, "IMPOSSIBLE_TO_OPEN_FILE code : impossible to open the file when using the open function\n");
      break;
    case CONFLICTING_OPTIONS :
      fprintf(stderr, "CONFLICTING_OPTIONS code : conflict between options detected (--print and -l cannot be activated together)\n");
      print_usage();
      break;
    case READING_FILE_ERROR :
      fprintf(stderr, "READING_FILE_ERROR code : impossible to read a file\n");
      break;
    case CREATING_OR_READING_FILE_ERROR :
      fprintf(stderr, "CREATING_OR_READING_FILE_ERROR code : impossible to open the file or create it (if it does not exist) when using the open function\n");
      break;
    case DELETE_FILE_ERROR :
      fprintf(stderr, "DELETE_FILE_ERROR code : impossible to delete a file\n");
      break;
    case EXEC_OPTION_IS_TOO_LONG :
      fprintf(stderr, "EXEC_OPTION_IS_TOO_LONG code : the option you entered is too long for --exec (keep it below 20 words)\n");
      break;
    case CREATING_FORK_ERROR :
      fprintf(stderr, "CREATING_FORK_ERROR code : impossible to create a fork\n");
      break;
    case EXEC_RETURNED :
      fprintf(stderr, "EXEC_RETURNED code : the exec function returned to the main program (it should not)\n");
      break;
    case EMPTY_EXEC_OPTION :
      fprintf(stderr, "EMPTY_EXEC_OPTION code : the exec function cannot handle empty options\n");
      break;
    case FILE_IS_DIRECTORY :
      fprintf(stderr, "FILE_IS_DIRECTORY code : the tested file is in fact a directory\n");
      break;
    case PERMISSION_DENIED :
      fprintf(stderr, "PERMISSION_DENIED code : impossible to open file or directory\n");
      break;
    default :
      fprintf(stderr, "This error code (%d) is not listed\n", error_code);
    }
}

int no_error (int error_code) {
  return (error_code == NO_ERROR);
}
