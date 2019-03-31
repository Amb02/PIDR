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

int sizeOfFile(FILE* file){
	fseek(file, 0, SEEK_END); 
	int size = ftell(file);
	fseek(file, 0, SEEK_SET); 
	return size;
}

void executeProverif(char* file){
	char *command[] = {
		"../../proverif2.00/proverif",
		file,
		NULL
	};

	int fileOutput = open(".temp_file", O_CREAT|O_WRONLY, 0002);

	pid_t pid = fork();

	if (pid == -1){
		fprintf(stderr, "Fork-exec error\n" );
		exit(1);
	} 
	else if (pid > 0){
		int status;
		waitpid(pid, &status, 0);
	} else {
		dup2(fileOutput,1);
		execvp(command[0], command);
		fprintf(stderr, "Just after exec\n" );
		exit(2);
	}
}

int isSecure(char* file){
	FILE* resultsFile = fopen(".temp_file","r");
	if (resultsFile==NULL){printf("error openning the results\n");}

	int size = sizeOfFile(resultsFile);
	char * inFile= malloc(size*sizeof(char)); // size/8 ?
	fread(inFile, 1, size, resultsFile);
	fclose(resultsFile);

	int secure = (strstr(inFile,"A trace has been found")!=NULL);
	free(inFile);

	return secure;
}


void runFile(char* file){
	executeProverif(file);
	fprintf(stderr, "Exec done\n" );

	if (isSecure(file)){printf("trace found\n");} else {printf("no trace\n");}
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