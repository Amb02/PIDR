/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 06/10/2018
 *
 */

#ifndef ERROR_H //protect from circular includes
#define ERROR_H

#include "includes.h"
#include "defines.h"

// list all the possible errors
enum {
    NO_ERROR,
    CONFLICTING_OPTIONS,
    PATH_DOES_NOT_EXIST,
    CANNOT_CLOSE_PATH_DIRECTORY,
    IMPOSSIBLE_TO_GET_STATS,
    IMPOSSIBLE_TO_OPEN_FILE,
    READING_FILE_ERROR,
    CREATING_OR_READING_FILE_ERROR,
    DELETE_FILE_ERROR,
    EXEC_OPTION_IS_TOO_LONG,
    CREATING_FORK_ERROR,
    EXEC_RETURNED,
    EMPTY_EXEC_OPTION,
    FILE_IS_DIRECTORY, 
    PERMISSION_DENIED
};

void print_error (int error_code);
int  no_error    (int error_code);

#endif
