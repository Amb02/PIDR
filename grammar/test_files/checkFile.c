#include "checkFile.h"

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
	char * inFile= malloc(size*sizeof(char));
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
	if (remove(".temp_file")!=0) fprintf(stderr, "Error removing temp_file\n");
}