#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

void usageError(){
	fprintf(stderr, "Use \"run\" like this :\n$ ./run [fileName.pv]\nexit...\n");
	exit(3);
}

int runFile(char* file){
	char * fileCmd = malloc((strlen(file)+10)*sizeof(char));
//	strcpy(fileCmd,"proverif ");
	strcpy(fileCmd,"echo ");
	strcat(fileCmd, file);
	char *command[] = {
//		"/mnt/c/Users/ambro/Documents/Installateurs/ProVerif/proverif2.00.tar/proverif2.00/",
		"/bin/bash",
		"-c",
		fileCmd,
		NULL
	};
	execvp(command[0], command);
	return 0;
}

int main(int argc, char *argv[]){

	char* filename;
	if (argc!=2){usageError();}
	else {filename = argv[1];}

	pid_t parent = getpid();
	pid_t pid = fork();

	if (pid == -1){
		fprintf(stderr, "Fork error\n" );
		exit(1);
	} 
	else if (pid > 0){
		printf("Father : continue\n");
		int status;
		waitpid(pid, &status, 0);
	} else {
		printf("Child : exec\n");
		runFile(filename);
		fprintf(stderr, "after exec\n" );
		exit(2);
	}
	return 0;
}