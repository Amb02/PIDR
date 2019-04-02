/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 07/11/2018
 *
 */

#include "long_listing.h"

void write_one_space () {
  write(1, " ", sizeof(char));
}

void write_n_spaces (int n) {
  int i = 0;
  for (i = 0; i < n; i ++) {
    write_one_space();
  }
}

void write_new_line () {
  write(1, "\n", sizeof(char));
}

int get_number_length (long long number) {
  int length   = 0;
 
  while (number > 0) {
    number = number / 10;
    length = length + 1;
  }

  return length;
}

int check_stat_return_value (int return_value) {
  return (return_value < 0) ? IMPOSSIBLE_TO_GET_STATS : NO_ERROR;
}

char * symbolic_links_char_builder (long symbolic_links) {
  int    number_length = get_number_length((long long) symbolic_links);
  char * buffer        = (char *) malloc(number_length * sizeof(char));

  sprintf(buffer, "%ld", symbolic_links);

  return buffer;
}

char * file_size_char_builder (long long size) {
  int    number_length = get_number_length(size);
  char * buffer        = (char *) malloc(number_length * sizeof(char));

  sprintf(buffer, "%lld", size);

  return buffer;
}

struct stat get_file_stats(char * path, int * error) {
  struct stat file_stats;
  int         stat_return_value;

  stat_return_value = stat(path, &file_stats);
  *error = check_stat_return_value(stat_return_value);

  return file_stats;
}

int is_directory_stat (struct stat file_stats) {
  return S_ISDIR(file_stats.st_mode);
}

int has_owner_reading_right (struct stat file_stats) {
  return file_stats.st_mode & S_IRUSR;
}

int has_owner_writing_right (struct stat file_stats) {
  return file_stats.st_mode & S_IWUSR;
}

int has_owner_executing_right (struct stat file_stats) {
  return file_stats.st_mode & S_IXUSR;
}

int has_group_reading_right (struct stat file_stats) {
  return file_stats.st_mode & S_IRGRP;
}

int has_group_writing_right (struct stat file_stats) {
  return file_stats.st_mode & S_IWGRP;
}

int has_group_executing_right (struct stat file_stats) {
  return file_stats.st_mode & S_IXGRP;
}

int has_others_reading_right (struct stat file_stats) {
  return file_stats.st_mode & S_IROTH;
}

int has_others_writing_right (struct stat file_stats) {
  return file_stats.st_mode & S_IWOTH;
}

int has_others_executing_right (struct stat file_stats) {
  return file_stats.st_mode & S_IXOTH;
}

void display_is_directory_or_file (struct stat file_stats) {
  size_t size = sizeof(char);

  write(1, (is_directory_stat(file_stats)) ? "d" : "-", size);
}

void display_owner_permissions (struct stat file_stats) {
  size_t size = sizeof(char);
  
  write(1, (has_owner_reading_right(file_stats))    ? "r" : "-", size);
  write(1, (has_owner_writing_right(file_stats))    ? "w" : "-", size);
  write(1, (has_owner_executing_right(file_stats))  ? "x" : "-", size);

}

void display_group_permissions (struct stat file_stats) {
  size_t size = sizeof(char);

  write(1, (has_group_reading_right(file_stats))    ? "r" : "-", size);
  write(1, (has_group_writing_right(file_stats))    ? "w" : "-", size);
  write(1, (has_group_executing_right(file_stats))  ? "x" : "-", size);
}

void display_others_permissions (struct stat file_stats) {
  size_t size = sizeof(char);

  write(1, (has_others_reading_right(file_stats))   ? "r" : "-", size);
  write(1, (has_others_writing_right(file_stats))   ? "w" : "-", size);
  write(1, (has_others_executing_right(file_stats)) ? "x" : "-", size);
}

void write_symbolic_links_block (long symbolic_links) {
  write_one_space();
  write_symbolic_links(symbolic_links);
}

void write_owner_name_block (char * name) {
  write_one_space();
  write_owner_name(name);
}

void write_group_name_block(char * name) {
  write_one_space();
  write_group_name(name);
}

void write_file_size_block (long long file_size) {
  write_one_space();
  write_file_size(file_size);
}

void write_last_update_date_block (char * date) {
  write_one_space();
  write_last_update_date(date);
  write_one_space();
}

void write_directory_name (char * file_name) {
  printf(ANSI_COLOR_BG_GREEN "%s" ANSI_COLOR_RESET "\n", file_name);
}

void write_file_name (char * file_name) {
  printf(ANSI_COLOR_GREEN    "%s" ANSI_COLOR_RESET "\n", file_name);
}

// aligned writer
void aligned_spaces_writer (int stat_name, int word_length) {
  int    number_of_aligned_spaces;
  number_of_aligned_spaces = get_stat(stat_name) - word_length;
  write_n_spaces(number_of_aligned_spaces);
}

void write_symbolic_links (long symbolic_links) {
  char * symbolic_links_string;

  symbolic_links_string = symbolic_links_char_builder(symbolic_links);
  
  aligned_spaces_writer(SYMBOLIC_LINKS, strlen(symbolic_links_string));
  write(1, symbolic_links_string, strlen(symbolic_links_string));
  
  free(symbolic_links_string);
}

void write_owner_name (char * name) {
  aligned_spaces_writer(OWNER_NAME, strlen(name));
  write(1, name, strlen(name));
}

void write_group_name (char * name) {
  aligned_spaces_writer(GROUP_NAME, strlen(name));
  write(1, name, strlen(name));
}

void write_file_size (long long file_size) {
  char * file_size_string;
  
  file_size_string = file_size_char_builder(file_size);
  
  aligned_spaces_writer(FILE_SIZE, strlen(file_size_string));
  write(1, file_size_string, strlen(file_size_string));

  free(file_size_string);
}

void write_last_update_date (char * date) {
  write(1, date, strlen(date));
}

// getter
long get_symbolic_links (struct stat file_stats) {
  return file_stats.st_nlink;
}

char * get_owner_name (struct stat file_stats) {
  struct passwd * owner;
  owner = getpwuid(file_stats.st_uid);
  return owner->pw_name;
}

char * get_group_name (struct stat file_stats) {
  struct group * group;
  group = getgrgid(file_stats.st_gid);
  return group->gr_name;
}

long long get_file_size (struct stat file_stats) {
  return file_stats.st_size;
}

char * get_last_update_date (struct stat file_stats) {
  // last modification date : st_mtime
  // last access       date : st_atime
  // last state change date : st_ctime
  time_t t = file_stats.st_mtime;
  char * time_string = (char *) malloc(STANDARD_BUFFER_SIZE * sizeof(char));
 
  struct tm *tmp;
  
  tmp = localtime(&t);
  strftime(time_string, STANDARD_BUFFER_SIZE, "%b %e %H:%M", tmp);
  
  return time_string;
}

// display

void display_file_permissions (struct stat file_stats) {
  display_is_directory_or_file(file_stats);
  display_owner_permissions(file_stats);
  display_group_permissions(file_stats);
  display_others_permissions(file_stats);
}

void display_symbolic_links (struct stat file_stats) {
  long symbolic_links = get_symbolic_links(file_stats);
  write_symbolic_links_block(symbolic_links);
}

void display_symbolic_links_not_aligned (struct stat file_stats) {
  long symbolic_links = get_symbolic_links(file_stats);
  char * symbolic_links_string = symbolic_links_char_builder(symbolic_links);
  
  write_one_space();
  write(1, symbolic_links_string, strlen(symbolic_links_string));

  free(symbolic_links_string);
}

void display_owner_name_not_aligned (struct stat file_stats) {
  char * name = get_owner_name(file_stats);

  write_one_space();
  write(1, name, strlen(name));
}

void display_group_name_not_aligned (struct stat file_stats) {
  char * name = get_group_name(file_stats);

  write_one_space();
  write(1, name, strlen(name));
}

void display_file_size_not_aligned (struct stat file_stats) {
  long long file_size = get_file_size(file_stats);
  char * file_string = file_size_char_builder(file_size);

  write_one_space();
  write(1, file_string, strlen(file_string));

  free(file_string);
}

void display_owner_name (struct stat file_stats) {
  char * name = get_owner_name(file_stats);
  write_owner_name_block(name);
}

void display_group_name (struct stat file_stats) {
  char * name = get_group_name(file_stats);
  write_group_name_block(name);
}

void display_file_size (struct stat file_stats) {
  long long file_size = get_file_size(file_stats);
  write_file_size_block(file_size);
}

void display_last_update_date (struct stat file_stats) {
  char * date = get_last_update_date(file_stats);
  write_last_update_date_block(date);
  free(date);
}

void display_file_name (struct stat file_stats, char * file_name) {
  if (COLORED_LONG_LISTING_DISPLAY) {
    if (is_directory_stat(file_stats)) write_directory_name(file_name);
    else                               write_file_name(file_name);
  } else {
    write(1, file_name, strlen(file_name));
    write_new_line();
  }
}

void display_file_long_format (struct stat file_stats, char * file_name) {
  display_file_permissions(file_stats);
  display_symbolic_links(file_stats);
  display_owner_name(file_stats); 
  display_group_name(file_stats);
  display_file_size(file_stats);
  display_last_update_date(file_stats);
  display_file_name(file_stats, file_name);    
}

void display_file_long_format_not_aligned (struct stat file_stats, char * path) {
  display_file_permissions(file_stats);
  display_symbolic_links_not_aligned(file_stats);
  display_owner_name_not_aligned(file_stats);
  display_group_name_not_aligned(file_stats);
  display_file_size_not_aligned(file_stats);
  display_last_update_date(file_stats);
  display_file_name(file_stats, path);
}

// stats 
void update_symbolic_links_stat (struct stat file_stats) {
  long   symbolic_links = get_symbolic_links(file_stats);
  char * buffer         = symbolic_links_char_builder(symbolic_links);

  update_stat(SYMBOLIC_LINKS, strlen(buffer));

  free(buffer);
}

void update_owner_name_stat (struct stat file_stats) {
  char * name = get_owner_name(file_stats);
  update_stat(OWNER_NAME, strlen(name));
}

void update_group_name_stat (struct stat file_stats) {
  char * name = get_group_name(file_stats);
  update_stat(GROUP_NAME, strlen(name));
}

void update_file_size_stat (struct stat file_stats) {
  long long file_size = get_file_size(file_stats);
  char * buffer = file_size_char_builder(file_size);

  update_stat(FILE_SIZE, strlen(buffer));
  
  free(buffer);
}

void update_stats_from_file (struct stat file_stats) {
  update_symbolic_links_stat(file_stats);
  update_owner_name_stat(file_stats);
  update_group_name_stat(file_stats);
  update_file_size_stat(file_stats);
}

/**
 * File display with the option -l (LONG LISTING)
 *
 * format : permission symbolic_links owner_name group_name size creation_date name
 */
int long_listing_display (char * path, char * file_name) {
  int error = NO_ERROR;
  
  // get the file informations
  struct stat file_stats = get_file_stats(path, &error);
  
  if (no_error(error)) {
    display_file_long_format(file_stats, file_name);
  }
  
  return error;
}

int long_listing_not_aligned (char * path) {
  int error = NO_ERROR;
  struct stat file_stats = get_file_stats(path, &error);

  if(no_error(error)) {
    display_file_long_format_not_aligned(file_stats, path);
  }

  return error;
}

int long_listing_stats (char * path) {
  int error = NO_ERROR;

  struct stat file_stats = get_file_stats(path, &error);

  if (no_error(error)) {
    update_stats_from_file(file_stats);
  }

  return error;
}

char * get_file_name_from_path (char * path) {
  char * tmp = (char *) calloc(STANDARD_BUFFER_SIZE, sizeof(char));
  char * file_name = (char *) calloc(STANDARD_BUFFER_SIZE, sizeof(char));
  strcpy(tmp, path);
  tmp = strtok(tmp, "/");
  while(tmp != NULL) {
    strcpy(file_name, tmp);
    tmp = strtok(NULL, "/");
  }
  free(tmp);
  
  return file_name;
}

int long_listing_display_from_file () {
  int    error = NO_ERROR;
  char   buffer;
  int    nb;
  char * ligne_courante = (char*) calloc(STANDARD_BUFFER_SIZE, sizeof(char));
  char * file_name;
  int    file           = open(".rsfind_result_search.txt", O_RDONLY);

  if (file == -1) {
    error = IMPOSSIBLE_TO_OPEN_FILE;
  } else {
    nb = read(file, &buffer, sizeof(char));
    sprintf(ligne_courante, "%c", buffer);
    while (nb > 0 && error == NO_ERROR) {
      nb = read(file, &buffer, sizeof(char));
      if ((buffer == '\n') && (nb != 0)){
	file_name = get_file_name_from_path(ligne_courante);
        error = long_listing_display(ligne_courante, file_name);
	
        strcpy(ligne_courante, "");
      } else {
        sprintf(ligne_courante,"%s%c", ligne_courante, buffer);
      }
    }
    
    close(file);
  }

  free(ligne_courante);
  free(file_name);

  return error;
}
