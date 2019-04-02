/**
 * Projet RS - TELECOM Nancy 2A 2018/2019
 *
 * Ambroise Baudot - Marceau Dida
 *
 * 20/10/2018
 *
 */


#include "defines.h"
#include "includes.h"

#include <magic.h>


/**
 * Checks if the file in the path is an image
 * using MIME type with libmagic
 * path parameter needs to be an accurate path towards a file else segmentation fault 
 */
int is_image (char * path) {  
  int          result    = FALSE;
  magic_t      magic;
  const char * mime;
  const char * pattern   = "image/";
  const char * data_base = NULL; // default database : "/usr/share/misc/magic";
  char       * temp;

  
  magic = magic_open(MAGIC_MIME_TYPE);
  magic_load(magic, data_base);
    
  // get the file MIME type
  mime = magic_file(magic, path);
  
  // checks if the beginning is equal to image/
  result = strlen(mime) >= strlen(pattern);
  if (result) {
    temp = (char *) malloc(strlen(pattern) * sizeof(char));    
    strncpy(temp, mime, strlen(pattern));
    result = strcmp(temp, pattern) == 0;
    
    free(temp);
  }

  magic_close(magic);

  return result;
}
