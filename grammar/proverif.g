grammar proverif;

options {
    language=Java;
}

/*term	:	'(' 'seq' term ')'
	|	ident '(' 'seq' term ')'
	|	term '=' term
	|	term '<>' term
	|	term '&&' term
	|	term '||' term
	|	'not' '(' term ')'
	;*/

//the same as the last one but without left-recursivity
term	:	('(' 'seq' term ')' | ident '(' 'seq' term ')' | 'not' '(' term ')') ('=' term | '<>' term | '&&' term | '||' term)*
	;


/*pterm	:	ident
	|	'(' 'seq' pterm ')'
	|	ident '(' 'seq' pterm ')'
	|	'choice' '[' pterm ',' pterm ']
	|	pterm '=' pterm
	|	pterm '<>' pterm
	|	pterm '&&' pterm
	|	pterm '||' pterm
	|	'not' '(' pterm ')'
	|	'new' ident ('[' 'seq' ident ']')? : typeid ';' pterm
	|	ident '<-' 'R' typeid ';' pterm
	;*/

//the same as the last one but without left-recursivity
pterm	:	(ident | '(' 'seq' pterm ')' | ident '(' 'seq' pterm ')' | 'choice' '[' pterm ',' pterm ']
 | 'not' '(' pterm ')' | 'new' ident ('[' 'seq' ident ']')? : typeid ';' pterm | ident '<-' 'R' typeid ';' pterm) ('=' pterm | '<>' pterm | '&&' pterm | '||' pterm)*
	;

pattern	:
	;

typedecl
	:
	;

typeid	:
	;



ident	:	;
/*
*This grammar "knows" as lexical items :
	Identifier
	Integers
	Float
	Comments--------------------------------------------------------> [TO DO] delete // and replace /*...*\/ by (*....*) ?
		"//" and
		"/* [...]*\/" without the last backslash of course
	String
	Caracters
	White space
		"\t",
		"\n",
		"\r"

*/


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

