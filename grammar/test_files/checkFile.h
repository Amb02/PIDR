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

pid_t pid;

int		sizeOfFile		(FILE* file);
void	executeProverif	(char* file);
int		isSecure		(char* file);
void	runFile			(char* file);

#endif
