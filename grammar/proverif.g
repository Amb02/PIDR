grammar proverif;

options {
		language=Java;
}

ident
	:
	;

id
	:
	;

typeid
	:
	;

options
	:
	;

programme
	: declaration* 'process' process
	;

declaration
	: 'type' ident options
	| 'channel' seq+ ident
	| 'free' seq+ ident	':' typeid options
	| 'const' seq+ ident ':' typeid options
	| 'fun' ident '(' seq typeid ')' ':' typeid options
	| 'reduc' reduc options
	| 'fun' ident '(' seq typeid ')' ':' typeid 'reduc' reducprime options
	| 'equation' eqlist options
	| 'pred' ident ( '(' seq typeid ')' )? options
	| 'table' ident '(' seq typeid ')'
	| 'let' ident ( '(' (typedecl)? ')')? '=' process
	| 'set' name '=' value
	| 'event' ident ( '(' seq typeid ')' )?
	| 'query' (typedecl ';')? query
	| 'not' (typedecl ';')? gterm
	| 'nounif' (typedecl ';')? nounifdecl
	;

reduc
	: ('forall' typedecl ';')? term '=' term (';' reduc) ?
	;

reducprime
	: ('forall' failtypedecl ';')? ident '(' seq mayfailterm ')' ('otherwise' reducprime)?
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
	|	'putbegin' 'event' ':' seq+ ident (';' query)?
	|	'putbegin' 'inj-event' ':' seq+ ident (';' query)?
	;

gterm //See Figure A.3
	:	ident
	|	ident '(' seq gterm ')' ('phase' int)?
	|	gterm '=' gterm
	|	gterm '<>' gterm
	|	gterm '||' gterm
	|	gterm '&&' gterm
	|	'event' '(' seq gterm ')'
	|	'inj-event' '(' seq gterm ')'
	|	gterm '==>' gterm
	|	'(' seq gterm ')'
	|	'new' ident ('[' (gbinding)? ']' )?
	|	'let' ident '=' gterm 'in' gterm
	;

gbinding 
 	:	'!' int '=' gterm (';' gbinding)?
 	|	ident '=' gterm (';' gbinding)?
 	;

nounifdecl //See Figure A.4
	:	'let' ident '=' gformat 'in' nounifdecl
	|	ident ('(' seq gformat ')' ('phase' int)? )? ('/'int)? 
	;

gformat
	:	ident
	|	*ident
	|	ident '(' seq gformat ')'
	|	'not' '(' seq gformat ')'
	|	'(' seq gformat ')'
	|	'new' ident ( '[' ( fbinding )? ']' )?
	|	'let' ident '=' gformat 'in' gformat' 
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
	:	'0'
 	|	 'yield'
 	|	ident ( '(' seq pterm ')')?
 	|	 '('process')'
 	|	process '|' process
 	|	'!' process
 	|	'!' ident '<=' ident process
 	|	'foreach' ident '<=' ident 'do' process
 	|	'new' ident ( '[' seq ident ']' )? ':' typeid (';' process )?
 	|	ident '<-R' typeid (';' process ')'?
 	|	'if' pterm 'then' process ('else' process )?
 	|	'in' '('pterm ',' pattern ')' (';' process)?
 	|	'out' '('pterm,pterm')' (';'process)?
 	|	'let' pattern '=' pterm ('in' process ('else' process)? )?
 	|	ident (':' typeid )? '<-' pterm (';' process)?
 	|	'let' typedecl 'suchthat' pterm ('in' process ('else' process)? )?
 	|	'insert' ident '(' seq pterm ')' (';' process)?
 	|	'get' ident(seq pattern) ['suchthat' pterm] ('in' process ('else' process)? )?
 	|	'event' ident ( '('seq pterm ')' )? (';' process)?
 	|	'phase' int (';' process)?
 	|	'sync' int ('[' tag ']')? (';' process)?
 	;

/*
term
	:	'(' 'seq' term ')'
	|	ident '(' 'seq' term ')'
	|	term '=' term
	|	term '<>' term
	|	term '&&' term
	|	term '||' term
	|	'not' '(' term ')'
	;
*/

//the same as the last one but without left-recursivity
term
	:	('(' 'seq' term ')' | ident '(' 'seq' term ')' | 'not' '(' term ')') ('=' term | '<>' term | '&&' term | '||' term)*
	;

pterm
	:	ident
	|	'(' 'seq' pterm ')'
	|	ident '(' 'seq' pterm ')'
	|	'choice' '[' pterm ',' pterm ']
	|	pterm '=' pterm
	|	pterm '<>' pterm
	|	pterm '&&' pterm
	|	pterm '||' pterm
	|	'not' '(' pterm ')'
	|	'new' ident ('[' 'seq' ident ']')? ':' typeid ';' pterm //pb
	|	ident '<-' 'R' typeid ';' pterm
	|	'if' pterm 'then' pterm ('else' pterm)?
	|	'let' pattern
	|	ident (':' typeid)? '<-' pterm ';' pterm
	|	'let' typedecl 'suchthat' pterm 'in' pterm ('else' pterm)?
	|	'insert' ident	'(' 'seq' pterm ')' ';' pterm
	|	'get' ident '(' 'seq' pattern ')' ('suchthat' pterm)? 'in' pterm ('else' pterm)?
	|	'event' ident ('(' 'seq' pterm ')')? ';' pterm
	;

//the same as the last one but without left-recursivity
/*
pterm
	:	(ident | '(' 'seq' pterm ')' | ident '(' 'seq' pterm ')' | 'choice' '[' pterm ',' pterm ']
	| 'not' '(' pterm ')'
	| 'new' ident ('[' 'seq' ident ']')? ':' typeid ';' pterm
	| ident '<-' 'R' typeid ';' pterm
	| 'if' pterm 'then' pterm ('else' pterm)?
	| 'let' pattern
	| ident (':' typeid)? '<-' pterm ';' pterm
	| 'let' typedecl 'suchthat' pterm 'in' pterm ('else' pterm)?
	| 'insert' ident	'(' 'seq' pterm ')' ';' pterm
	| 'get' ident '(' 'seq' pattern ')' ('suchthat' pterm)? 'in' pterm ('else' pterm)? | 'event' ident ('(' 'seq' pterm ')')? ';' pterm) ('=' pterm | '<>' pterm | '&&' pterm | '||' pterm)*
	;
	*/

pattern	:	ident
	|	ident ':' typeid
	|	'(' 'seq' pattern ')'
	|	ident '(' 'seq' pattern ')'
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
	|	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
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
