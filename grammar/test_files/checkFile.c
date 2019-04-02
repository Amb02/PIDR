#include "checkFile.h"

int alarm_flag;

void handle_alarm (int sig) {
	alarm_flag = 1;
	fprintf(stderr, "Took more than %d seconds to finish\nLogging in.\n", TIME_BEFORE_ALARM);
	write_file(unfinished);

	kill(pid, SIGKILL);
}

void write_file (FILE * file) {
	char * message = (char *) malloc (SMALL_BUFFER_SIZE * sizeof(char));
	sprintf(message, "%s\n", current_file);
	fwrite(message, strlen(message), 1, file);

	free(message);
}
void open_logs () {
	current_file = (char *) malloc(SMALL_BUFFER_SIZE * sizeof(char));
	check_parent();

	unfinished = fopen("unfinished.txt", "w");
	different  = fopen("different.txt", "w");

	if (unfinished == NULL || different == NULL) {
		fprintf(stderr, "Impossible to create log files\n");
		exit(3);
	}

	add_header_to_logs();
}

void add_header_to_logs () {
	char * message_unfinished = (char *) malloc(STRING_BUFFER_SIZE * sizeof(char));
	sprintf(message_unfinished, "The following files did not end under %d seconds :\n", TIME_BEFORE_ALARM);
	fwrite(message_unfinished, strlen(message_unfinished), 1, unfinished);
	free(message_unfinished);

	char * message_different = (char *) malloc(STRING_BUFFER_SIZE * sizeof(char));
	sprintf(message_different, "The following files did not match the results of their parent file : \n");
	fwrite(message_different, strlen(message_different), 1, different);
	free(message_different);
}

void close_logs () {
	fclose(unfinished);
	fclose(different);
	free(current_file);
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
	if (resultsFile==NULL){printf("error openning the results\n"); exit(3);}

	int size = sizeOfFile(resultsFile);
	char * inFile= malloc(size*sizeof(char));

	fread(inFile, 1, size, resultsFile);

	fclose(resultsFile);

	int secure = (strstr(inFile,"A trace has been found") == NULL);
	free(inFile);

	return secure;
}

void check_parent () {
	check_for_parent = 1;
}

void runFile(char* file){
	int secured = 0;
	strcpy(current_file, file);

	executeProverif(file);
	if (!alarm_flag) {
		secured = isSecure(file);

		if (check_for_parent) {
			is_parent_safe = secured;
			check_for_parent = 0;
			fprintf(stdout, "Parent file analysed");
			fprintf(stdout, "\n%s\n", (secured) ? "Secured" : "Not secured");
		} else {
			if (secured == is_parent_safe) {
				fprintf(stdout, "File matching parent results\n");
			} else {
				fprintf(stdout, "File not matching parent results\nLogging in");

				write_file(different);
			}
		}

	}

	fprintf(stdout, "\n");

	if (remove(".temp_file")!=0) fprintf(stderr, "Error removing temp_file\n");
}
