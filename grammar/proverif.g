grammar proverif;

options {
		language=Java;
		backtrack=true;
}

programme
	: declaration* 'process' process
	;

declaration
	: 'type' ident proverifOptions
	| 'channel'  (ident ',')* ident
	| 'free' (ident ',')* ident	':' typeid proverifOptions
	| 'const' (ident ',')* ident ':' typeid proverifOptions
	| 'fun' ident '(' ((typeid ',')* typeid)? ')' ':' typeid proverifOptions
	| 'reduc' reduc proverifOptions
	| 'fun' ident '(' ((typeid ',')* typeid)? ')' ':' typeid 'reduc' reducprime proverifOptions
	| 'equation' eqlist proverifOptions
	| 'pred' ident ( '(' ((typeid ',')* typeid)? ')' )? proverifOptions
	| 'table' ident '(' ((typeid ',')* typeid)? ')'
	| 'let' ident ( '(' (typedecl)? ')')? '=' process
	| 'set' name '=' value
	| 'event' ident ( '(' ((typeid ',')* typeid)? ')' )?
	| 'query' (typedecl ';')? query
	| 'not' (typedecl ';')? gterm
	| 'nounif' (typedecl ';')? nounifdecl
	;

reduc
	: ('forall' typedecl ';')? term '=' term (';' reduc) ?
	;

reducprime
	: ('forall' failtypedecl ';')? ident '(' ((mayfailterm ',')* mayfailterm)? ')' ('otherwise' reducprime)?
	;

eqlist
	: ('forall' typedecl ';') term '=' term (';' eqlist)?
	;

name
	: //See Section 6.2.2
	;

value
	: //See Section 6.2.2
	;

query //See Figure A.3
	:	gterm (';' query)?
	|	'putbegin' 'event' ':' (ident ',')* ident (';' query)?
	|	'putbegin' 'inj-event' ':' (ident ',')* ident (';' query)?
	;

gterm //See Figure A.3
	:	(ident | ident '(' ((gterm ',')* gterm)? ')' ('phase' int)? | 'event' '(' ((gterm ',')* gterm)? gterm ')' | 'inj-event' '(' ((gterm ',')* gterm)? gterm ')' | '(' ((gterm ',')* gterm)? gterm ')' | 'new' ident ('[' (gbinding)? ']' )? | 'let' ident '=' gterm 'in' gterm) ('=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm)*
	;

gbinding
 	:	'!' int '=' gterm (';' gbinding)?
 	|	ident '=' gterm (';' gbinding)?
 	;

nounifdecl //See Figure A.4
	:	'let' ident '=' gformat 'in' nounifdecl
	|	ident ('(' ((gformat ',')* gformat)? ')' ('phase' int)? )? ('/'int)?
	;

gformat
	:	ident
	|	ident '(' ((gformat ',')* gformat)? ')'
	|	'not' '(' ((gformat ',')* gformat)? ')'
	|	'(' ((gformat ',')* gformat)? gformat ')'
	|	'new' ident ( '[' ( fbinding )? ']' )?
	|	'let' ident '=' gformat 'in' gformat
	;
	
	
fbinding
	:	'!' int '=' gformat (';' fbinding)?
 	|	ident '=' gformat (';' fbinding)?
 	;


clauses
	:	('forall' failtypedecl ';')? clause (';' clauses )?
	;
	
clause
	:	term
	|	term '->' term
	|	term '<->' term
	|	term '<=>' term
	;

process
	:	('0' | 'yield' | ident ( '(' ((pterm ',')* pterm)? ')')? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ((ident ',')* ident)? ']' )? ':' typeid (';' process )? | ident '<-R' typeid (';' process )? | 'if' pterm 'then' process ('else' process )? | 'in' '('pterm ',' pattern ')' (';' process)? | 'out' '('pterm ',' pterm')' (';'process)? | 'let' pattern '=' pterm ('in' process ('else' process)? )? | ident (':' typeid )? '<-' pterm (';' process)? | 'let' typedecl 'suchthat' pterm ('in' process ('else' process)? )? | 'insert' ident '(' ((pterm ',')* pterm)? ')' (';' process)? | 'get' ident '(' ((pattern ',')* pattern)? ')' ('suchthat' pterm)? ('in' process ('else' process)? )? | 'event' ident ( '('((pterm ',')* pterm)? ')' )? (';' process)? | 'phase' int (';' process)?) ('|' process)*
 	;


pterm
	:	(ident | '(' ((pterm ',')* pterm)? ')' | ident '(' ((pterm ',')* pterm)? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ('[' ((ident ',')* ident)? ']')? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ('else' pterm)? | 'let' pattern | ident (':' typeid)? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ('else' pterm)? | 'insert' ident	'(' ((pterm ',')* pterm)? ')' ';' pterm | 'get' ident '(' ((pattern ',')* pattern)? ')' ('suchthat' pterm)? 'in' pterm ('else' pterm)? | 'event' ident ('(' ((pterm ',')* pterm)? ')')? ';' pterm) ('=' pterm | '<>' pterm | '&&' pterm | '||' pterm)*
	;
	
//the same as the last one but without left-recursivity
term
	:	('(' ((term ',')* term)? ')' | ident '(' ((term ',')* term)? ')' | 'not' '(' term ')') ('=' term | '<>' term | '&&' term | '||' term)*
	;



//the same as the last one but without left-recursivity) ('=' pterm | '<>' pterm | '&&' pterm | '||' pterm)*
/*
pterm
	:	(ident | '(' ((pterm ',')* pterm)? ')' | ident '(' ((pterm ',')* pterm)? ')' | 'choice' '[' pterm ',' pterm ']
	| 'not' '(' pterm ')'
	| 'new' ident ('[' ((ident ',')* ident)? ']')? ':' typeid ';' pterm
	| ident '<-' 'R' typeid ';' pterm
	| 'if' pterm 'then' pterm ('else' pterm)?
	| 'let' pattern
	| ident (':' typeid)? '<-' pterm ';' pterm
	| 'let' typedecl 'suchthat' pterm 'in' pterm ('else' pterm)?
	| 'insert' ident	'(' ((pterm ',')* pterm)? ')' ';' pterm
	| 'get' ident '(' ((pattern ',')* pattern)? ')' ('suchthat' pterm)? 'in' pterm ('else' pterm)? | 'event' ident ('(' ((pattern ',')* pattern)? ')')? ';' pterm) ('=' pterm | '<>' pterm | '&&' pterm | '||' pterm)*
	;
	*/

pattern
  : ident
	|	ident ':' typeid
	|	'(' ((pattern ',')* pattern)? ')'
	|	ident '(' ((pattern ',')* pattern)? ')'
	|	'=' pterm
	;

mayfailterm
	:	term
	|	'fail'
	;

typedecl
	:	ident ':' typeid (',' typedecl)?
	;

failtypedecl
	:	ident ':' typeid ('or' 'fail')? (',' typedecl)?
	;

proverifOptions
	: ((ident ',')* ident)?
	;
	
ident
	: ID
	;

id
	: ID
	;

int 
	: INT
	;

typeid
	: ID
	;
	
/*
*This grammar "knows" as lexical items :
	Identifier
	Integers
	Float
	Comments--------------------------------------------------------> [TO DO] delete // and replace /*...*\/ by (*....*) ?
		"//" and
		"/* [...]*\/" without the last backslash of course
	String
	Characters
	White space
		"\t",
		"\n",
		11"\r"
*/


ID	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
		;

INT :	'0'..'9'+
		;

FLOAT
	:	 ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
	|	 '.' ('0'..'9')+ EXPONENT?
	|	 ('0'..'9')+ EXPONENT
	;

COMMENT
	:	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	|	 '(*' ( options {greedy=false;} : . )* '*)' {$channel=HIDDEN;}
	;

WS
	:	 ( ' '
	| '\t'
	| '\r'
	| '\n'
	) {$channel=HIDDEN;}
	;

STRING
	:	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'
	;

CHAR
	:	'\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
	;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
	: '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	| UNICODE_ESC
	| OCTAL_ESC
	;

fragment
OCTAL_ESC
	: '\\' ('0'..'3') ('0'..'7') ('0'..'7')
	| '\\' ('0'..'7') ('0'..'7')
	| '\\' ('0'..'7')
	;

fragment
UNICODE_ESC
	: '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
	;
