#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>

#include "checkFile.h"

void usageError(){
	fprintf(stderr, "Use \"run\" like this :\n$ ./run [fileName.pv]\nexit...\n");
	exit(3);
}

int main(int argc, char *argv[]){
	char* filename;
	if (argc!=2){usageError();}
	else {filename = argv[1];}

	/*pid_t parent = getpid();
	pid_t pid = fork();

	if (pid == -1){
		fprintf(stderr, "Fork error\n" );
		exit(1);
	} 
	else if (pid > 0){
		//printf("Father : continue\n");
		int status;
		waitpid(pid, &status, 0);
	} else {
		//printf("Child : exec\n");
		runFile(filename);
		fprintf(stderr, "after exec\n" );
		exit(2);
	}*/

	runFile(filename);
	return 0;
}