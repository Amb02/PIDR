#ifndef CHECK_FILE
#define CHECK_FILE

#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <time.h>

#define TIME_BEFORE_ALARM 30

#define STRING_BUFFER_SIZE 2048
#define SMALL_BUFFER_SIZE 128

pid_t pid;

FILE * unfinished;
FILE * different;

char * current_file;
int check_for_parent;
int is_parent_safe;

void  handle_alarm       (int);
void  write_file         (FILE *);
void  check_parent   ();
void  open_logs          ();
void  close_logs         ();
void  add_header_to_logs ();
int		sizeOfFile		     (FILE* file);
void	executeProverif	   (char* file);
int		isSecure		       (char* file);
void	runFile			       (char* file);

#endif
