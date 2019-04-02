/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 07/11/2018
 *
 */

#ifndef LONG_LISTING_H
#define LONG_LISTING_H

#include "defines.h"
#include "includes.h"
#include "long_listing_stats.h"

#include <time.h>
#include <sys/stat.h>
#include <unistd.h>
#include <fcntl.h>
#include <pwd.h>
#include <grp.h>

void        write_one_space                ();
void        write_new_line                 ();
int         get_number_length              (long long);

struct stat get_file_stats                 (char *     , int *);
int         check_stat_return_value        (int);

// permissions display
int         is_directory_stat              (struct stat);
int         has_owner_reading_right        (struct stat);
int         has_owner_writing_right        (struct stat);
int         has_owner_executing_right      (struct stat);

int         has_group_reading_right        (struct stat);
int         has_group_writing_right        (struct stat);
int         has_group_executing_right      (struct stat);

int         has_others_reading_right       (struct stat);
int         has_others_writing_right       (struct stat);
int         has_others_executing_right     (struct stat);

void        display_is_directory_or_file   (struct stat);
void        display_owner_permissions      (struct stat);
void        display_group_permissions      (struct stat);
void        display_others_permissions     (struct stat);

void        display_file_permissions       (struct stat);

// symbolic_links display
void        write_symbolic_links_block     (long);
void        write_symbolic_links           (long);
long        get_symbolic_links             (struct stat);
char *      symbolic_links_char_builder    (long);

void        display_symbolic_links         (struct stat);
void        display_symbolic_links_not_aligned (struct stat);

// ower_name display
void        write_owner_name               (char *);
void        write_owner_name_block         (char *);
char *      get_owner_name                 (struct stat);

void        display_owner_name             (struct stat);
void        display_owner_name_not_aligned (struct stat);
// group_name display
void        write_group_name               (char *);
void        write_group_name_block         (char *);
char *      get_group_name                 (struct stat);

void        display_group_name             (struct stat);
void        display_group_name_not_aligned (struct stat);

// size display
void        write_file_size                (long long);
void        write_file_size_block          (long long);
long long   get_file_size                  (struct stat);
char *      file_size_char_builder         (long long);

void        display_file_size              (struct stat);
void        display_file_size_not_aligned  (struct stat);
// last update date display
void        write_last_update_date         (char *);
void        write_last_update_date_block   (char *);
char *      get_last_update_date           (struct stat);

void        display_last_update_date       (struct stat);

// file_name display
void        write_file_name                (char *);
void        write_directory_name           (char *);

void        display_file_name              (struct stat, char *);

// long_format display
void        display_file_long_format       (struct stat, char *);
void        display_file_long_format_not_aligned (struct stat, char *);
// stats update
void        update_stats_from_file         (struct stat);
void        update_symbolic_links_stat     (struct stat);
void        update_owner_name_stat         (struct stat);
void        update_group_name_stat         (struct stat);
void        update_file_size_stat          (struct stat);

// long listing
int         long_listing_display_from_file ();
int         long_listing_display           (char *     , char *);
int         long_listing_stats             (char *);
int         long_listing_not_aligned       (char *);
#endif
