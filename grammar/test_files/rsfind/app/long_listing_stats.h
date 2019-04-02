/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 08/11/2018
 *
 */

#ifndef LONG_LISTING_STATS
#define LONG_LISTING_STATS

#include "includes.h"
#include "defines.h"

typedef struct s_long_listing_stats {
  int maximum_sizes [NECESSARY_STATS];
} long_listing_stats_t;

enum {
  SYMBOLIC_LINKS,
  OWNER_NAME,
  GROUP_NAME,
  FILE_SIZE,
};

extern long_listing_stats_t * stats;

int                    max              (int, int);

void                   initialise_stats ();
void                   set_stat         (int, int);
int                    get_stat         (int);
void                   update_stat      (int, int);

long_listing_stats_t * get_stats        ();

void                   display_stats    ();
void                   display_stat     (int, int);

#endif
