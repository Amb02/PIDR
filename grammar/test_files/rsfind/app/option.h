/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 03/10/2018
 *
 */

#ifndef OPTION_H //protect from circular includes
#define OPTION_H

#include "includes.h"
#include "defines.h"

#include <getopt.h>


enum {
  PATH, // no need for a particular option / default = "."
  LONG_LISTING, // -l
  LONG_LISTING_ALIGNED,
  FILE_CONTAINING_STRING, // -t STRING
  IMAGE, //-i
  FILE_NAME_EQUALS_STRING, //--name STRING
  EXEC_CMD, //--exec "CMD"
  PRINT, //--print
  FILE_NAME_REGEX, // -ename STRING
  FILE_CONTAINING_REGEX, // -T STRING
  VERIFICATION = 100, // --proverif
  DIRECTORY,
  DEBUG,
};

#define ARGUMENTS_NUMBER 13

/**
 * option structure contains a flag and an argument
 */
typedef struct s_option_t {
  int    flag;
  char * arg;
} option_t;

option_t * new_option                 ();
int        option_flag                (option_t * option);
int        is_set                     (option_t * option);
char     * option_arg                 (option_t * option);
int        has_argument               (option_t * option);
void       set_option_flag            (option_t * option                      , int    flag);
void       set_option_argument        (option_t * option                      , char * argument);
int        set_argument               (option_t * arguments [ARGUMENTS_NUMBER], int    index   , char * argument);
void       print_option_state         (option_t * option);
void       free_option                (option_t * option);

void       initialise_arguments_array (option_t * arguments [ARGUMENTS_NUMBER]);
char     * get_path                   (option_t * arguments [ARGUMENTS_NUMBER]);
void       free_arguments             (option_t * arguments [ARGUMENTS_NUMBER]);
void       print_all_options_states   (option_t * arguments [ARGUMENTS_NUMBER]);
void       set_default_arguments      (option_t * arguments [ARGUMENTS_NUMBER]);
void       option_handler             (int argc                               , char ** argv   , option_t * arguments [ARGUMENTS_NUMBER]);
void       handle_remaining_arguments (int , char **, int, option_t * arguments [ARGUMENTS_NUMBER]);
void       exit_sequence_with_usage   (option_t * arguments [ARGUMENTS_NUMBER]);
void       verify_options_settings    (int, option_t * arguments [ARGUMENTS_NUMBER]);
void       puts_options_flags         (int, char **, struct option long_options [ARGUMENTS_NUMBER], option_t * arguments [ARGUMENTS_NUMBER], int *);
int        check_options              (option_t * arguments [ARGUMENTS_NUMBER]);
void       print_usage                ();
int        post_treatment             (option_t * arguments [ARGUMENTS_NUMBER]);
int        should_display_long_listing_aligned (option_t * arguments [ARGUMENTS_NUMBER]);

#endif
