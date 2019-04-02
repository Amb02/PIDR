/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 08/11/2018
 *
 */

#include "long_listing_stats.h"

int max (int a, int b) {
  return (a >= b) ? a : b;
}

void initialise_stats () {
  stats = (long_listing_stats_t *) malloc(sizeof(long_listing_stats_t));

  int i = 0;

  for (i = 0; i < NECESSARY_STATS; i ++) {
    set_stat(i, STARTING_MAX_STAT_VALUE);
  }
}

void free_stats () {
  free(stats);
}

void set_stat (int stat_name, int new_size) {
  stats->maximum_sizes[stat_name] = new_size;
}

long_listing_stats_t * get_stats () {
  return stats;
}

int get_stat (int stat_name) {
  return stats->maximum_sizes[stat_name];
}

void update_stat (int stat_name, int candidate_stat) {
  if (get_stat(stat_name) < candidate_stat) {
    set_stat(stat_name, candidate_stat);
  }
}

void display_stats () {
  int i = 0;

  for (i = 0; i < NECESSARY_STATS; i ++) {
    display_stat(get_stat(i), i);
  }
}

void display_stat (int size_stat, int stat_name) {
  printf("The ");
  switch (stat_name) {
  case SYMBOLIC_LINKS :
    printf("symbolic links ");
    break;
  case OWNER_NAME     :
    printf("owner name ");
    break;
  case GROUP_NAME     :
    printf("group name ");
    break;
  case FILE_SIZE      :
    printf("file size ");
    break;
  }

  printf("maximum size is %d\n", size_stat);
}
