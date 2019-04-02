#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>
#include <dirent.h>
#include <unistd.h>

#include "checkFile.h"

#define PARENT_DIRECTORY ".."
#define CURRENT_DIRECTORY "."

void usageError() {
	fprintf(stderr, "Use \"run\" like this :\n$ ./run [fileName.pv]\nexit...\n");
	exit(3);
}

int isDirectory (struct dirent * file) {
	return file != NULL && file->d_type == DT_DIR;
}

int is_parent (struct dirent *file) {
	const char * name = file->d_name;

	return strcmp(name, PARENT_DIRECTORY) == 0;
}

int is_current (struct dirent * file) {
	const char * name = file->d_name;

	return strcmp(name, CURRENT_DIRECTORY) == 0;
}

void validate_directory (DIR * directory) {
	if (directory == NULL) {
		fprintf(stderr, "Impossible to open the directory\n");
		exit(EXIT_FAILURE);
	}
}

void browse_directory (char * file_name) {
	char * path;
	struct dirent * file_reader = NULL;
	DIR * directory;

	directory = opendir(file_name);
	if (directory == NULL) {
		runFile(file_name);
	} else {
		path = (char *) malloc(STRING_BUFFER_SIZE * sizeof(char));

		while ((file_reader = readdir(directory)) != NULL) {
			if (isDirectory(file_reader)) {
				if (!is_parent(file_reader) && !is_current(file_reader)) {
					strcpy(path, file_name);
					if(path[strlen(path) - 1] != '/') strcat(path, "/");
					strcat(path, file_reader->d_name);
					check_parent();
					browse_directory(path);
				}
			} else {
				char * name = file_reader->d_name;
				strcpy(path, file_name);
				if(path[strlen(path) - 1] != '/') strcat(path, "/");
				strcat(path, name);

				fprintf(stdout, "File being investigated : %s\n", name);

				runFile(path);
			}
		}

		free(path);
		closedir(directory);
	}
}

int main(int argc, char *argv[]) {
	char* file_name;
	if (argc!=2){usageError();}
	else {file_name = argv[1];}

	open_logs();
	browse_directory(file_name);
	close_logs();

	return 0;
}
