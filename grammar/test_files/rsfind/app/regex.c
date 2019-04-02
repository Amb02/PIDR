#include "regex.h"


void gest_error(int error) {
	int temporary_error = error;
	switch (temporary_error){
		case 1  : fprintf(stderr, "Compilation impossible\n");                      break;
		case 2  : fprintf(stderr, "Optimizsation impossible\n");                    break;
		//case 3  : fprintf(stderr, "Not accepted\n");                                break;
		case 4  : fprintf(stderr, "Something was null\n");                          break;
		case 5  : fprintf(stderr, "A bad option was passed\n");                     break;
		case 6  : fprintf(stderr, "Magic number bad (compiled re corrupt?)\n");     break;
		case 7  : fprintf(stderr, "Something kooky in the compiled re\n");          break;
		case 8  : fprintf(stderr, "Ran out of memory\n");                           break;
		case 9  : fprintf(stderr, "Unkown error calling pcre_exec\n");              break;
		default : fprintf(stderr, "Unkown error\n");                                break; 
	}
}

int sizeconform(char* regex){
	int size=strlen(regex);

	for (int i=0;i<(int)strlen(regex);i++){
		switch (regex[i]){
			case '*':
				size=size+2;
				break;
			case '.':
				size--;
				break;
			default :
				size++;
		}
	}

	return size;

}

void conform(char regex[],char* regex_origin){
	
	int curseur=0; //index où l'on écrit le prochain caractère dans (new) regex

	for (int i = 0; i < (int)strlen(regex_origin); ++i){
		
		switch (regex_origin[i]){
			case '*':
				regex[curseur]='.';
				regex[curseur+1]='*';
				curseur=curseur+2;
				break;
			case '.':
				break;
			default :
				regex[curseur]=regex_origin[i];
				curseur++;
		}
	}

}

int is_accepted(char* regex, char* string_test){

	//fprintf(stderr, "%s\n",regex);

	int			result=1;

	pcre*		reCompiled;
	pcre_extra*	pcreExtra;
	int			pcreExecRet;
	int			subStrVec[30];
	const char*	pcreErrorStr;
	int			pcreErrorOffset;
	char*			aStrRegex;

	aStrRegex = regex;  
	reCompiled = pcre_compile(aStrRegex, 0, &pcreErrorStr, &pcreErrorOffset, NULL);
	if(reCompiled == NULL) gest_error(1);

	// Optimization
	pcreExtra = pcre_study(reCompiled, 0, &pcreErrorStr);
	if(pcreErrorStr != NULL) gest_error(2);

	pcreExecRet = pcre_exec(reCompiled,pcreExtra,string_test,strlen(string_test),0,0,subStrVec,30);

	if(pcreExecRet < 0) {
	  switch(pcreExecRet) {
	//  case PCRE_ERROR_NOMATCH      : gest_error(3); break;
		case PCRE_ERROR_NOMATCH      : result=0     ; break; // Not accepted
		case PCRE_ERROR_NULL         : gest_error(4); break;
		case PCRE_ERROR_BADOPTION    : gest_error(5); break;
		case PCRE_ERROR_BADMAGIC     : gest_error(6); break;
		case PCRE_ERROR_UNKNOWN_NODE : gest_error(7); break;
		case PCRE_ERROR_NOMEMORY     : gest_error(8); break;
		default                      : gest_error(9); break;
	}
	} else {
	///fprintf(stderr,"Accepted\n");

		if(pcreExecRet == 0) {
	    	fprintf(stderr,"Too many substrings found to fit in subStrVec!\n");
	    	pcreExecRet = 30 / 3;
		}

	}
  
	pcre_free(reCompiled);

	if(pcreExtra != NULL) {
	#ifdef PCRE_CONFIG_JIT
		pcre_free_study(pcreExtra);
	#else
		pcre_free(pcreExtra);
	#endif
	}

	return result;

}



int is_accepted_standard(char* regex, char* string_test){ // regex strictes
	return is_accepted(regex,string_test);
}


int is_accepted_evolue(char* regex_origin, char* string_test){ // "*"->".*" et "."->""
	int		size	= sizeconform(regex_origin);
	char*	regex	= malloc(size*sizeof(char));

	conform(regex,regex_origin);
	return is_accepted(regex,string_test);
}
