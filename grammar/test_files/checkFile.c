#include "checkFile.h"

int alarm_flag;

void handle_alarm (int sig) {
	fprintf(stdout, "The proverif execution took more than 30 seconds...\n");
	alarm_flag = 1;
	kill(pid, SIGKILL);
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

	pid = fork();

	if (pid == -1){
		fprintf(stderr, "Fork-exec error\n" );
		exit(1);
	}
	else if (pid > 0){
		int status;
		struct timespec time_before, time_after;
		double time;
		clock_gettime(CLOCK_MONOTONIC, &time_before);

		alarm_flag = 0;
		signal(SIGALRM, handle_alarm);
		alarm(TIME_BEFORE_ALARM);

		waitpid(pid, &status, 0);
		if (!alarm_flag) {
			clock_gettime(CLOCK_MONOTONIC, &time_after);
			time = (time_after.tv_sec - time_before.tv_sec) + (time_after.tv_nsec - time_before.tv_nsec) / 1E9;

			fprintf(stdout, "Execution time : %lf\n", time);
		}

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
	if (!alarm_flag) {
		fprintf(stderr, "Exec done\n" );
		if (isSecure(file)){printf("trace found\n");} else {printf("no trace\n");}
	}

	if (remove(".temp_file")!=0) fprintf(stderr, "Error removing temp_file\n");
}
