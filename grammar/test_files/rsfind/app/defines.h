/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 03/10/2018
 *
 */

#ifndef DEFINES_H
#define DEFINES_H

#define TRUE  1
#define FALSE 0

#define ERRNO_PERMISSION_DENIED 13

#define STANDARD_LARGE_BUFFER_SIZE 1024
#define STANDARD_BUFFER_SIZE       512
#define STANDARD_SMALL_BUFFER_SIZE 32

#define EXEC_CMD_SIZE              20

#define COLORED_LONG_LISTING_DISPLAY 0

// output colors
#define ANSI_COLOR_RED      "\x1b[31m"
#define ANSI_COLOR_GREEN    "\x1b[32m"
#define ANSI_COLOR_BG_GREEN "\x1b[42m"
#define ANSI_COLOR_YELLOW   "\x1b[33m"
#define ANSI_COLOR_BLUE     "\x1b[34m"
#define ANSI_COLOR_BG_BLUE  "\x1b[44m"
#define ANSI_COLOR_MAGENTA  "\x1b[35m"
#define ANSI_COLOR_CYAN     "\x1b[36m"
#define ANSI_COLOR_RESET    "\x1b[0m"

#define EXEC_FILE_CHARACTER '{'
#define EXEC_PIPE_CHARACTER '|'

#define NECESSARY_STATS         4
#define STARTING_MAX_STAT_VALUE 0

#endif
