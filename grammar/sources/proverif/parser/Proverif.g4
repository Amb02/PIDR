grammar Proverif;

options {
		language=Java;
}

@header {
	package proverif.parser;
}

// PARSER

programme
	: declaration* PROCESS process
	| declaration* EQUIVALENCE process process
	;

declaration
	: TYPE ident proverifOptions POINT
	| CHANNEL  (ident COMMA)* ident POINT
	| FREE (ident COMMA)* ident	COLON typeid proverifOptionsFree POINT
	| CONST (ident COMMA)* ident COLON typeid proverifOptionsFun POINT
	| FUN ident LEFTPARENTHESIS ((typeid COMMA)* typeid)? RIGHTPARENTHESIS COLON typeid proverifOptionsFun POINT
	| LETFUN ident ( LEFTPARENTHESIS (typedecl)? RIGHTPARENTHESIS)? EQUAL pterm POINT
	| REDUC reduc proverifOptionsFree POINT
	| FUN ident LEFTPARENTHESIS ((typeid COMMA)* typeid)? RIGHTPARENTHESIS COLON typeid REDUC reducprime proverifOptionsFun POINT
	| EQUATION eqlist proverifOptions POINT
	| PRED ident ( LEFTPARENTHESIS ((typeid COMMA)* typeid)? RIGHTPARENTHESIS )? proverifOptionsPred POINT
	| TABLE ident LEFTPARENTHESIS ((typeid COMMA)* typeid)? RIGHTPARENTHESIS POINT
	| LET ident ( LEFTPARENTHESIS (typedecl)? RIGHTPARENTHESIS)? EQUAL process POINT
	| SET name EQUAL value POINT
	| EVENT ident ( LEFTPARENTHESIS ((typeid COMMA)* typeid)? RIGHTPARENTHESIS )? POINT
	| QUERY (typedecl SEMICOLON)? query POINT
	| NONINTERF (typedecl SEMICOLON)? ((nidecl COMMA)* nidecl)? POINT
	| WEAKSECRET ident POINT
	| NOT (typedecl SEMICOLON)? gterm POINT
	| NOUNIF (typedecl SEMICOLON)? nounifdecl POINT
	| ELIMTRUE (failtypedecl SEMICOLON)? term POINT
	| CLAUSES clauses POINT
	| PARAM (ident COMMA)* ident proverifOptions POINT
	| PROBA ident POINT
	| DEF ident ((typeid COMMA)* typeid)? CURLYBRACKETLEFT (declaration)* CURLYBRACKETRIGHT POINT
	| EXPAND ident ((typeid COMMA)* typeid)? POINT
	;

nidecl
	: ident (AMONG (term COMMA)* term)?
	;

reduc
	: (FORALL typedecl SEMICOLON)? term EQUAL term (SEMICOLON reduc)?
	;

reducprime
	: (FORALL failtypedecl SEMICOLON)? ident LEFTPARENTHESIS ((mayfailterm COMMA)* mayfailterm)? RIGHTPARENTHESIS (OTHERWISE reducprime)?
	;

eqlist
	: (FORALL typedecl SEMICOLON) term EQUAL term (SEMICOLON eqlist)?
	;

name
	: id
	;

value
	: id
	;

query
	:	gterm (SEMICOLON query)?
	|	PUTBEGIN EVENT COLON (ident COMMA)* ident (SEMICOLON query)?
	|	PUTBEGIN INJEVENT COLON (ident COMMA)* ident (SEMICOLON query)?
	;

gterm
	:	(ident | ident LEFTPARENTHESIS ((gterm COMMA)* gterm)? RIGHTPARENTHESIS (PHASE integer)? | EVENT LEFTPARENTHESIS ((gterm COMMA)* gterm)? RIGHTPARENTHESIS | INJEVENT LEFTPARENTHESIS ((gterm COMMA)* gterm)? RIGHTPARENTHESIS | gtermSequence | NEW ident (LEFTBRACKET (gbinding)? RIGHTBRACKET )? | LET ident EQUAL gterm IN gterm) (EQUAL gterm | DIFF gterm | OR gterm | AND gterm | IMPLICATES gterm)*
	;

gtermSequence
	: LEFTPARENTHESIS ((gterm COMMA)* gterm)? RIGHTPARENTHESIS
	;

gbinding
 	:	EXCLAMATION integer EQUAL gterm (SEMICOLON gbinding)?
 	|	ident EQUAL gterm (SEMICOLON gbinding)?
 	;

nounifdecl
	:	LET ident EQUAL gformat IN nounifdecl
	|	ident (LEFTPARENTHESIS ((gformat COMMA)* gformat)? RIGHTPARENTHESIS (PHASE integer)? )? (SLASH integer)?
	;

gformat
	:	ident
	|	ident LEFTPARENTHESIS ((gformat COMMA)* gformat)? RIGHTPARENTHESIS
	|	NOT LEFTPARENTHESIS ((gformat COMMA)* gformat)? RIGHTPARENTHESIS
	|	LEFTPARENTHESIS ((gformat COMMA)* gformat)? gformat RIGHTPARENTHESIS
	|	NEW ident ( LEFTBRACKET ( fbinding )? RIGHTBRACKET )?
	|	LET ident EQUAL gformat IN gformat
	;

fbinding
	:	EXCLAMATION integer EQUAL gformat (SEMICOLON fbinding)?
 	|	ident EQUAL gformat (SEMICOLON fbinding)?
 	;

clauses
	:	(FORALL failtypedecl SEMICOLON)? clause (SEMICOLON clauses)?
	;

clause
	:	term
	|	term ARROW term
	|	term DOUBLEARROW term
	|	term EQUIVALENT term
	;

process
	:	(ZERO | YIELD | ident ( LEFTPARENTHESIS ((pterm COMMA)* pterm)? RIGHTPARENTHESIS)? | LEFTPARENTHESIS process RIGHTPARENTHESIS | EXCLAMATION process | EXCLAMATION ident REVERSEIMPLICATES ident process | FOREACH ident REVERSEIMPLICATES ident DO process | NEW ident ( LEFTBRACKET ((ident COMMA)* ident)? RIGHTBRACKET )? COLON typeid (SEMICOLON process )? | ident REVERSEARROWR typeid (SEMICOLON process )? | IF pterm THEN process (ELSE process )? | IN LEFTPARENTHESIS pterm COMMA pattern RIGHTPARENTHESIS (SEMICOLON process)? | OUT LEFTPARENTHESIS pterm COMMA pterm RIGHTPARENTHESIS (SEMICOLON process)? | LET pattern EQUAL pterm (IN process (ELSE process)? )? | ident (COLON typeid )? REVERSEARROW pterm (SEMICOLON process)? | LET typedecl SUCHTHAT pterm (IN process (ELSE process)? )? | INSERT ident LEFTPARENTHESIS ((pterm COMMA)* pterm)? RIGHTPARENTHESIS (SEMICOLON process)? | GET ident LEFTPARENTHESIS ((pattern COMMA)* pattern)? RIGHTPARENTHESIS (SUCHTHAT pterm)? (IN process (ELSE process)? )? | EVENT ident ( LEFTPARENTHESIS((pterm COMMA)* pterm)? RIGHTPARENTHESIS )? (SEMICOLON process)? | PHASE integer (SEMICOLON process)?) (PIPE process)*
 	;


pterm
	:	(ident | ptermSequence | ident LEFTPARENTHESIS ((gterm COMMA)* gterm)? RIGHTPARENTHESIS | CHOICE LEFTBRACKET pterm COMMA pterm RIGHTBRACKET | NOT LEFTPARENTHESIS pterm RIGHTPARENTHESIS | NEW ident (LEFTBRACKET ((ident COMMA)* ident)? RIGHTBRACKET)? COLON typeid SEMICOLON pterm | ident REVERSEARROWR typeid SEMICOLON pterm | IF pterm THEN pterm (ELSE pterm)? | LET pattern | ident (COLON typeid)? REVERSEARROW pterm SEMICOLON pterm | LET typedecl SUCHTHAT pterm IN pterm (ELSE pterm)? |  INSERT ident	LEFTPARENTHESIS ((pterm COMMA)* pterm)? RIGHTPARENTHESIS SEMICOLON pterm | GET ident LEFTPARENTHESIS ((pattern COMMA)* pattern)? RIGHTPARENTHESIS (SUCHTHAT pterm)? IN pterm (ELSE pterm)? | EVENT ident (LEFTPARENTHESIS ((pterm COMMA)* pterm)? RIGHTPARENTHESIS)? SEMICOLON pterm) (EQUAL pterm | DIFF pterm | AND pterm | OR pterm)*
	;

ptermSequence
	:	LEFTPARENTHESIS ((pterm  COMMA)* pterm)? RIGHTPARENTHESIS
	;

term
	:	(ident | LEFTPARENTHESIS ((term COMMA)* term)? RIGHTPARENTHESIS | ident LEFTPARENTHESIS ((term COMMA)* term)? RIGHTPARENTHESIS | NOT LEFTPARENTHESIS term RIGHTPARENTHESIS) (EQUAL term | DIFF term | AND term | OR term)*
	;

pattern
  : ident
	|	ident COLON typeid
	|	patternSequence
	|	ident LEFTPARENTHESIS ((pattern COMMA)* pattern)? RIGHTPARENTHESIS
	|	EQUAL pterm
	;

patternSequence
	: LEFTPARENTHESIS ((pattern {} COMMA)* pattern)? RIGHTPARENTHESIS
	;

mayfailterm
	:	term
	|	FAIL
	;

typedecl
	:	ident COLON typeid (COMMA typedecl)?
	;

failtypedecl
	:	ident COLON typeid (ORWORD FAIL)? (COMMA typedecl)?
	;

proverifOptionsFree
	: (LEFTBRACKET PRIVATE RIGHTBRACKET)?
	;

proverifOptionsFun
	: (LEFTBRACKET (optionfun COMMA)* optionfun RIGHTBRACKET)?
	;

proverifOptionsPred
	: (LEFTBRACKET (optionpred COMMA)* optionpred RIGHTBRACKET)?
	;

proverifOptions
	: (LEFTBRACKET (ident COMMA)* ident RIGHTBRACKET)?
	;

optionfun : DATA | PRIVATE | TYPECONVERTER;
optionpred : MEMBEROPTIM | BLOCKOPTION;

ident : id;
id : ID;

integer : INT ;
typeid : CHANNEL | ID;

// LEXER

ZERO : '0';
POINT : '.';
COMMA : ',';
SEMICOLON : ';';
RIGHTPARENTHESIS : ')';
LEFTPARENTHESIS : '(';
COLON : ':';
EQUAL : '=';
LEFTBRACKET : '[';
RIGHTBRACKET : ']';
IN : 'in';
DIFF : '<>';
OR : '||';
AND : '&&';
IMPLICATES : '==>';
SLASH : '/';
EXCLAMATION : '!';
ARROW : '->';
REVERSEARROW : '<-';
REVERSEARROWR : '<-R';
ARROWR : '->R';
DOUBLEARROW : '<->';
EQUIVALENT : '<=>';
REVERSEIMPLICATES : '<=';
PIPE : '|';
CURLYBRACKETLEFT : '{';
CURLYBRACKETRIGHT : '}';

WEAKSECRET : 'weaksecret';
ELIMTRUE : 'elimtrue';
CLAUSES : 'clauses';
PARAM : 'param';
PROBA : 'proba';
DEF : 'def';
EXPAND : 'expand';
PROCESS : 'process';
EQUIVALENCE : 'equivalence';
CHANNEL : 'channel';
FREE : 'free';
REDUC : 'reduc';
FUN : 'fun';
CONST : 'const';
EQUATION : 'equation';
TABLE : 'table';
PRED : 'pred';
LET : 'let';
SET : 'set';
EVENT : 'event';
QUERY : 'query';
NOT : 'not';
NOUNIF : 'nounif';
FORALL : 'forall';
OTHERWISE: 'otherwise';
PUTBEGIN : 'putbegin';
INJEVENT : 'inj-event';
PHASE : 'phase';
NEW : 'new';
YIELD : 'yield';
DO : 'do';
OUT : 'out';
ELSE : 'else';
SUCHTHAT : 'suchthat';
INSERT : 'insert';
IF : 'if';
THEN : 'then';
GET : 'get';
FAIL : 'fail';
ORWORD : 'or';
FOREACH : 'foreach';
CHOICE : 'choice';
TYPE : 'type';
LETFUN : 'letfun';
NONINTERF : 'noninterf';
AMONG : 'among';

DATA : 'data';
PRIVATE : 'private';
TYPECONVERTER : 'typeConverter';
MEMBEROPTIM : 'memberOptim';
BLOCKOPTION : 'blockOption';

ID : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\'')*;

INT : '0'..'9'+;

FLOAT
	: ('0'..'9')+ '.' ('0'..'9')+
	| '.' ('0'..'9')+
	| ('0'..'9')+
	;

SINGLELINECOMMENT : '//' ~[\r\n]* -> channel(HIDDEN);
MULTIPLELINESCOMMENT : '(*' .*? '*)' -> channel(HIDDEN);
WS : [ \r\t\n]+ -> channel(HIDDEN);
