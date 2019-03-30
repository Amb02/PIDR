#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/stat.h>
#include <fcntl.h>

void usageError(){
	fprintf(stderr, "Use \"run\" like this :\n$ ./run [fileName.pv]\nexit...\n");
	exit(3);
}

int runFile(char* file){
	char *command[] = {
		"../../proverif2.00/proverif",
		file,
		NULL
	};

	int fileOutput = open(".temp_file", O_CREAT|O_WRONLY, 0002);
	dup2(fileOutput,1);

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
		//printf("Father : continue\n");
		int status;
		waitpid(pid, &status, 0);
	} else {
		//printf("Child : exec\n");
		runFile(filename);
		fprintf(stderr, "after exec\n" );
		exit(2);
	}
	return 0;
}