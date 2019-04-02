#ifndef REGEX_H
#define REGEX_H

#include "includes.h"
#include <pcre.h>

void gest_error(int error);

int sizeconform(char* regex);
void conform(char regex[],char* regex_txt);

int is_accepted(char* regex, char* string_test);
int is_accepted_standard(char* regex, char* string_test);
int is_accepted_evolue(char* regex_origin, char* string_test);

#endif
