#include "checkFile.h"

int alarm_flag;

void handle_alarm (int sig) {
	alarm_flag = 1;
	fprintf(stderr, "Took more than %d seconds to finish\nLogging in.\n", TIME_BEFORE_ALARM);
	write_file(unfinished, "");

	kill(pid, SIGKILL);
}

void write_file (FILE * file, char * details) {
	char * message = (char *) malloc (SMALL_BUFFER_SIZE * sizeof(char));
	sprintf(message, "%s %s\n", current_file, details);
	fwrite(message, strlen(message), 1, file);

	free(message);
}

void get_file_name_from_path (char * path) {
	char * pch;
	if (path[strlen(path) - 1] == '/') path[strlen(path) - 1] = '\0';

	pch = strrchr(path,'/');

	strcpy(path, ++pch);
}

void open_logs (char * file_name) {
	char file_name_usage [128];
	char unfinished_file_name [128];
	char different_file_name [128];

	current_file = (char *) malloc(SMALL_BUFFER_SIZE * sizeof(char));
	check_parent();

	strcpy(file_name_usage, file_name);
	get_file_name_from_path(file_name_usage);

	sprintf(unfinished_file_name, "results/unfinished_%s.txt", file_name_usage);
	sprintf(different_file_name, "results/different_%s.txt", file_name_usage);

	unfinished = fopen(unfinished_file_name, "w");
	different  = fopen(different_file_name, "w");

	if (unfinished == NULL || different == NULL) {
		fprintf(stderr, "Impossible to create log files\n");
		fprintf(stderr, "Trying to create the following files : \n\t.%s\n\t.%s\n", unfinished_file_name, different_file_name);
		perror("Error : ");
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
	else if (pid > 0) {
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
		exit(2);
	}


	close(fileOutput);
}

int isSecure(char* file){
	FILE* resultsFile = fopen(".temp_file","r");
	int secure = SAFE;

	if (resultsFile==NULL){
		perror("Error ");
		exit(3);
	}

	int size = sizeOfFile(resultsFile);
	char * inFile= malloc(size*sizeof(char));

	fread(inFile, 1, size, resultsFile);

	fclose(resultsFile);

	if (strstr(inFile,"A trace has been found") != NULL) {
		secure = NOT_SAFE;
	} else if (strstr(inFile, "cannot be proved") != NULL) {
		secure = CANNOT_PROVE;
	}

	free(inFile);

	return secure;
}

void check_parent () {
	check_for_parent = 1;
}

void runFile (char* file) {
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

				char result_string [20];
				if (secured == SAFE) {
					strcpy(result_string, "No attack");
				} else if (secured == NOT_SAFE) {
					strcpy(result_string, "Attack");
				} else {
					strcpy(result_string, "Not proven");
				}

				write_file(different, result_string);
			}
		}

	}

	fprintf(stdout, "\n");

	if (remove(".temp_file")!=0) fprintf(stderr, "Error removing temp_file\n");
}
