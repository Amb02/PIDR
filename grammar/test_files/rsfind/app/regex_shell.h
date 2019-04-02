/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 06/10/2018
 *
 */

#ifndef REGEX_SHELL_H //protect from circular includes
#define REGEX_SHELL_H

#include "includes.h"
#include <glob.h>

extern glob_t results;

void create_glob_t_results (char* path , char* regex_origin);
void handle_glob_error     (int   error);
int  parse_regex           (char* name);

#endif
