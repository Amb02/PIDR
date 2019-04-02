/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 01/10/2018
 *
 */

#include "includes.h"
#include "find.h"

long_listing_stats_t * stats;
glob_t results;

int main (int argc, char ** argv) {  
  int error_code = NO_ERROR;

  // array containing structure with flag and argument
  option_t * arguments [ARGUMENTS_NUMBER];
  initialise_arguments_array(arguments);
  
  option_handler(argc, argv, arguments);
  set_default_arguments(arguments);
  error_code = check_options(arguments);
  
  if (is_set(arguments[LONG_LISTING_ALIGNED])) {
    initialise_stats();
  }

  if (error_code == NO_ERROR) {
    // find the desired files
    error_code = rsfind(arguments);
  }
  
  if (is_set(arguments[DEBUG])) print_error(error_code);
  
  free_arguments(arguments);
  free(stats);
  globfree(&results);

  return error_code ? EXIT_FAILURE : EXIT_SUCCESS;
}
