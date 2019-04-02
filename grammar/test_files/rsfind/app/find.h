/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 06/10/2018
 *
 */

#ifndef FIND_H //protect from circular includes
#define FIND_H

#include "defines.h"
#include "includes.h"
#include "exec.h"
#include "regex.h"
#include "long_listing.h"
#include "proverif.h"

#include <unistd.h>
#include <fcntl.h>
#include <dirent.h>
#include <sys/types.h>
#include <time.h>
#include <dlfcn.h> // installation nécessaire

int is_parent                    (struct dirent * entity);
int is_current                   (struct dirent * entity);
int is_parent_or_current         (struct dirent * entity);

int is_image                     (char * path);
int be_ignored                   (struct dirent * entity                , option_t * arguments [ARGUMENTS_NUMBER], char * path    , char * relative_path);
int is_ignored_from_image_plugin (char * path);
int is_directory                 (struct dirent * entity);
int print_file                   (char * path                           , option_t * arguments [ARGUMENTS_NUMBER], int sortie  );
int compare                      (struct dirent * entity                , char * path                            , char * motif);
int compare_regex                (struct dirent * entity                , char * path                            , char * motif);
int find                         (char * path                           , option_t * arguments [ARGUMENTS_NUMBER], int sortie);
int rsfind                       (option_t * arguments [ARGUMENTS_NUMBER]);
void full_path                   (char * destination                    , char * path                            , char * file_name                       );
char* full_file                    (struct dirent * entity                , char * path                            );
int file_size                    (int file);
int  should_handle_path          (option_t * arguments [ARGUMENTS_NUMBER]);
int  handle_path                 (option_t * arguments [ARGUMENTS_NUMBER], int sortie);


#endif
