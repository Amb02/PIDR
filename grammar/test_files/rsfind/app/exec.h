/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 17/10/2018
 *
 */

#ifndef EXEC_H
#define EXEC_H

#include "defines.h"
#include "includes.h"

#include <unistd.h>
#include <fcntl.h>
#include <sys/wait.h>


int  create_result_file        (int  * sortie);
int  execute                   (char** cmd_cut                         , char * path_file                       , int len_cmd);
void simple_exec_fork          (int * error                            , char * command_path                    , char ** cmd_cut);
void pipe_exec_fork            (int * error                            , char * command_path                    , char ** cmd_cut                    , char ** cmd_cut_after_pipe);
void fork_exec                 (int  * error                           , int    after_pipe                      , char * command_path                , char** cmd_cut            , char ** cmd_cut_after_pipe);
int  command_parsing           (char ** command                        , int command_length                     , char * path_file                   , int * changed_string_index, char ** cmd_cut_after_pipe, int * is_pipe);
int  execute_command           (option_t * arguments [ARGUMENTS_NUMBER]);
int  cut_cmd                   (char** cmd_cut                         , char * cmd                             , int * len_cmd);
void parsing_cmd               (char** cmd_cut                         , char * cmd                             , int * len_cmd);
void parsing_results_searches  (char** cmd_cut                         , int  * error                           , int * len_cmd);
int  remove_file               ();

#endif
