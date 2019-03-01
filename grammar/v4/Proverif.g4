grammar Proverif;

options {
		language=Java;
}

programme
	: declaration* 'process' process
	;

declaration
	: 'type' ident proverifOptions '.'
	| 'channel'  (ident ',')* ident '.'
	| 'free' (ident ',')* ident	':' typeid proverifOptions '.'
	| 'const' (ident ',')* ident ':' typeid proverifOptions '.'
	| 'fun' ident '(' ((typeid ',')* typeid)? ')' ':' typeid proverifOptions '.'
	| 'reduc' reduc proverifOptions '.'
	| 'fun' ident '(' ((typeid ',')* typeid)? ')' ':' typeid 'reduc' reducprime proverifOptions '.'
	| 'equation' eqlist proverifOptions '.'
	| 'pred' ident ( '(' ((typeid ',')* typeid)? ')' )? proverifOptions '.'
	| 'table' ident '(' ((typeid ',')* typeid)? ')' '.'
	| 'let' ident ( '(' (typedecl)? ')')? '=' process '.'
	| 'set' name '=' value '.'
	| 'event' ident ( '(' ((typeid ',')* typeid)? ')' )? '.'
	| 'query' (typedecl ';')? query '.'
	| 'not' (typedecl ';')? gterm '.'
	| 'nounif' (typedecl ';')? nounifdecl '.'
	;

reduc
	: ('forall' typedecl ';')? term '=' term (';' reduc)?
	;

reducprime
	: ('forall' failtypedecl ';')? ident '(' ((mayfailterm ',')* mayfailterm)? ')' ('otherwise' reducprime)?
	;

eqlist
	: ('forall' typedecl ';') term '=' term (';' eqlist)?
	;

name
	: id//See Section 6.2.2
	;

value
	: id//See Section 6.2.2
	;

query //See Figure A.3
	:	gterm (';' query)?
	|	'putbegin' 'event' ':' (ident ',')* ident (';' query)?
	|	'putbegin' 'inj-event' ':' (ident ',')* ident (';' query)?
	;

gterm //See Figure A.3
	:	(ident | ident '(' ((gterm ',')* gterm)? ')' ('phase' integer)? | 'event' '(' ((gterm ',')* gterm)? gterm ')' | 'inj-event' '(' ((gterm ',')* gterm)? gterm ')' | '(' ((gterm ',')* gterm)? gterm ')' | 'new' ident ('[' (gbinding)? ']' )? | 'let' ident '=' gterm 'in' gterm) ('=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm)*
	;

gbinding
 	:	'!' integer '=' gterm (';' gbinding)?
 	|	ident '=' gterm (';' gbinding)?
 	;

nounifdecl //See Figure A.4
	:	'let' ident '=' gformat 'in' nounifdecl
	|	ident ('(' ((gformat ',')* gformat)? ')' ('phase' integer)? )? ('/'integer)?
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
	:	'!' integer '=' gformat (';' fbinding)?
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
	:	('0' | 'yield' | ident ( '(' ((pterm ',')* pterm)? ')')? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ((ident ',')* ident)? ']' )? ':' typeid (';' process )? | ident '<-R' typeid (';' process )? | 'if' pterm 'then' process ('else' process )? | 'in' '('pterm ',' pattern ')' (';' process)? | 'out' '('pterm ',' pterm')' (';'process)? | 'let' pattern '=' pterm ('in' process ('else' process)? )? | ident (':' typeid )? '<-' pterm (';' process)? | 'let' typedecl 'suchthat' pterm ('in' process ('else' process)? )? | 'insert' ident '(' ((pterm ',')* pterm)? ')' (';' process)? | 'get' ident '(' ((pattern ',')* pattern)? ')' ('suchthat' pterm)? ('in' process ('else' process)? )? | 'event' ident ( '('((pterm ',')* pterm)? ')' )? (';' process)? | 'phase' integer (';' process)?) ('|' process)*
 	;


pterm
	:	(ident | '(' ((pterm ',')* pterm)? ')' | ident '(' ((pterm ',')* pterm)? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ('[' ((ident ',')* ident)? ']')? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ('else' pterm)? | 'let' pattern | ident (':' typeid)? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ('else' pterm)? | 'insert' ident	'(' ((pterm ',')* pterm)? ')' ';' pterm | 'get' ident '(' ((pattern ',')* pattern)? ')' ('suchthat' pterm)? 'in' pterm ('else' pterm)? | 'event' ident ('(' ((pterm ',')* pterm)? ')')? ';' pterm) ('=' pterm | '<>' pterm | '&&' pterm | '||' pterm)*
	;

term
	:	(ident | '(' ((term ',')* term)? ')' | ident '(' ((term ',')* term)? ')' | 'not' '(' term ')') ('=' term | '<>' term | '&&' term | '||' term)*
	;

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
	: ('[' (optionChoice ',')* optionChoice ']' )?
	;

optionChoice
    : 'data' | 'private' | 'typeConverter' | 'memberOptim' | 'block'
    ;

ident
	: id
	;

id
	: ID
	;

integer
	: INT
	;

typeid
	: 'channel' | ID
	;

ID
	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

INT
	: '0'..'9'+
	;

FLOAT
	: ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
	| '.' ('0'..'9')+ EXPONENT?
	| ('0'..'9')+ EXPONENT
	;

COMMENT
	: '//' ~('\n'|'\r')* '\r'? '\n'
	| '(*' * '*)'
	;

WS
	: (' ' | '\t' | '\r' | '\n')+
	;


fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;


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