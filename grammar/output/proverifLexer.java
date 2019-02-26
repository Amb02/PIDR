// $ANTLR 3.5.1 D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g 2019-02-26 21:36:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class proverifLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int HEX_DIGIT=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int OCTAL_ESC=12;
	public static final int STRING=13;
	public static final int UNICODE_ESC=14;
	public static final int WS=15;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public proverifLexer() {} 
	public proverifLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public proverifLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:7:7: ( '!' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:7:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:8:7: ( '&&' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:8:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:9:7: ( '(' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:9:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:10:7: ( ')' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:10:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:11:7: ( ',' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:12:7: ( '->' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:12:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:13:7: ( '/' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:13:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:14:7: ( '0' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:14:9: '0'
			{
			match('0'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:15:7: ( ':' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:15:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:16:7: ( ';' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:16:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:7: ( '<-' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:9: '<-'
			{
			match("<-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:18:7: ( '<->' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:18:9: '<->'
			{
			match("<->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:7: ( '<-R' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:9: '<-R'
			{
			match("<-R"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:20:7: ( '<=' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:20:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:7: ( '<=>' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:9: '<=>'
			{
			match("<=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:22:7: ( '<>' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:22:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:23:7: ( '=' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:23:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:24:7: ( '==>' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:24:9: '==>'
			{
			match("==>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:7: ( '[' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:26:7: ( ']' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:26:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:27:7: ( 'channel' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:27:9: 'channel'
			{
			match("channel"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:28:7: ( 'choice' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:28:9: 'choice'
			{
			match("choice"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:29:7: ( 'const' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:29:9: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:30:7: ( 'do' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:30:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:31:7: ( 'else' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:31:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:32:7: ( 'equation' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:32:9: 'equation'
			{
			match("equation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:33:7: ( 'event' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:33:9: 'event'
			{
			match("event"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:34:7: ( 'fail' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:34:9: 'fail'
			{
			match("fail"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:35:7: ( 'forall' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:35:9: 'forall'
			{
			match("forall"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:7: ( 'foreach' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:9: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:37:7: ( 'free' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:37:9: 'free'
			{
			match("free"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:38:7: ( 'fun' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:38:9: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:39:7: ( 'get' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:39:9: 'get'
			{
			match("get"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:40:7: ( 'if' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:40:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:41:7: ( 'in' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:41:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:42:7: ( 'inj-event' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:42:9: 'inj-event'
			{
			match("inj-event"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:43:7: ( 'insert' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:43:9: 'insert'
			{
			match("insert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:44:7: ( 'let' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:44:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:45:7: ( 'new' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:45:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:46:7: ( 'not' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:46:9: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:47:7: ( 'nounif' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:47:9: 'nounif'
			{
			match("nounif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:48:7: ( 'or' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:48:9: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:49:7: ( 'otherwise' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:49:9: 'otherwise'
			{
			match("otherwise"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:50:7: ( 'out' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:50:9: 'out'
			{
			match("out"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:51:7: ( 'phase' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:51:9: 'phase'
			{
			match("phase"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:52:7: ( 'pred' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:52:9: 'pred'
			{
			match("pred"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:53:7: ( 'process' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:53:9: 'process'
			{
			match("process"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:54:7: ( 'putbegin' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:54:9: 'putbegin'
			{
			match("putbegin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:55:7: ( 'query' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:55:9: 'query'
			{
			match("query"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:56:7: ( 'reduc' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:56:9: 'reduc'
			{
			match("reduc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:57:7: ( 'set' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:57:9: 'set'
			{
			match("set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:7: ( 'suchthat' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:9: 'suchthat'
			{
			match("suchthat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:59:7: ( 'table' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:59:9: 'table'
			{
			match("table"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:60:7: ( 'then' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:60:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:61:7: ( 'type' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:61:9: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:62:7: ( 'yield' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:62:9: 'yield'
			{
			match("yield"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:63:7: ( '|' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:63:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:64:7: ( '||' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:64:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:188:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:188:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:188:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:191:5: ( ( '0' .. '9' )+ )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:191:7: ( '0' .. '9' )+
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:191:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:195:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:195:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:195:5: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:195:21: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:195:33: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:195:33: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:196:5: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:196:9: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:196:21: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:196:21: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:197:5: ( '0' .. '9' )+ EXPONENT
					{
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:197:5: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:201:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '(*' ( options {greedy=false; } : . )* '*)' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				alt13=1;
			}
			else if ( (LA13_0=='(') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:201:5: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:201:10: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:201:24: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:201:24: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:202:5: '(*' ( options {greedy=false; } : . )* '*)'
					{
					match("(*"); 

					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:202:10: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1==')') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '(')||(LA12_1 >= '*' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:202:38: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*)"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:206:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:206:5: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:214:2: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:214:4: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:214:8: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:214:10: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:214:20: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:218:2: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:218:4: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:218:9: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:218:11: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:218:21: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:223:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:223:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:223:22: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:223:33: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:226:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:230:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt18=1;
					}
					break;
				case 'u':
					{
					alt18=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt18=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:230:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:231:4: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:232:4: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:237:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				int LA19_1 = input.LA(2);
				if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
					int LA19_2 = input.LA(3);
					if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
						int LA19_4 = input.LA(4);
						if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
						alt19=3;
					}

				}
				else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
					int LA19_3 = input.LA(3);
					if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
						alt19=2;
					}

					else {
						alt19=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:237:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:238:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:239:4: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:244:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:244:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt20=65;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:46: T__22
				{
				mT__22(); 

				}
				break;
			case 8 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:52: T__23
				{
				mT__23(); 

				}
				break;
			case 9 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:58: T__24
				{
				mT__24(); 

				}
				break;
			case 10 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:64: T__25
				{
				mT__25(); 

				}
				break;
			case 11 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:70: T__26
				{
				mT__26(); 

				}
				break;
			case 12 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:76: T__27
				{
				mT__27(); 

				}
				break;
			case 13 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:82: T__28
				{
				mT__28(); 

				}
				break;
			case 14 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:88: T__29
				{
				mT__29(); 

				}
				break;
			case 15 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:94: T__30
				{
				mT__30(); 

				}
				break;
			case 16 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:100: T__31
				{
				mT__31(); 

				}
				break;
			case 17 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:106: T__32
				{
				mT__32(); 

				}
				break;
			case 18 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:112: T__33
				{
				mT__33(); 

				}
				break;
			case 19 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:118: T__34
				{
				mT__34(); 

				}
				break;
			case 20 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:124: T__35
				{
				mT__35(); 

				}
				break;
			case 21 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:130: T__36
				{
				mT__36(); 

				}
				break;
			case 22 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:136: T__37
				{
				mT__37(); 

				}
				break;
			case 23 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:142: T__38
				{
				mT__38(); 

				}
				break;
			case 24 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:148: T__39
				{
				mT__39(); 

				}
				break;
			case 25 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:154: T__40
				{
				mT__40(); 

				}
				break;
			case 26 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:160: T__41
				{
				mT__41(); 

				}
				break;
			case 27 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:166: T__42
				{
				mT__42(); 

				}
				break;
			case 28 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:172: T__43
				{
				mT__43(); 

				}
				break;
			case 29 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:178: T__44
				{
				mT__44(); 

				}
				break;
			case 30 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:184: T__45
				{
				mT__45(); 

				}
				break;
			case 31 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:190: T__46
				{
				mT__46(); 

				}
				break;
			case 32 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:196: T__47
				{
				mT__47(); 

				}
				break;
			case 33 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:202: T__48
				{
				mT__48(); 

				}
				break;
			case 34 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:208: T__49
				{
				mT__49(); 

				}
				break;
			case 35 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:214: T__50
				{
				mT__50(); 

				}
				break;
			case 36 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:220: T__51
				{
				mT__51(); 

				}
				break;
			case 37 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:226: T__52
				{
				mT__52(); 

				}
				break;
			case 38 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:232: T__53
				{
				mT__53(); 

				}
				break;
			case 39 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:238: T__54
				{
				mT__54(); 

				}
				break;
			case 40 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:244: T__55
				{
				mT__55(); 

				}
				break;
			case 41 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:250: T__56
				{
				mT__56(); 

				}
				break;
			case 42 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:256: T__57
				{
				mT__57(); 

				}
				break;
			case 43 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:262: T__58
				{
				mT__58(); 

				}
				break;
			case 44 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:268: T__59
				{
				mT__59(); 

				}
				break;
			case 45 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:274: T__60
				{
				mT__60(); 

				}
				break;
			case 46 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:280: T__61
				{
				mT__61(); 

				}
				break;
			case 47 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:286: T__62
				{
				mT__62(); 

				}
				break;
			case 48 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:292: T__63
				{
				mT__63(); 

				}
				break;
			case 49 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:298: T__64
				{
				mT__64(); 

				}
				break;
			case 50 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:304: T__65
				{
				mT__65(); 

				}
				break;
			case 51 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:310: T__66
				{
				mT__66(); 

				}
				break;
			case 52 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:316: T__67
				{
				mT__67(); 

				}
				break;
			case 53 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:322: T__68
				{
				mT__68(); 

				}
				break;
			case 54 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:328: T__69
				{
				mT__69(); 

				}
				break;
			case 55 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:334: T__70
				{
				mT__70(); 

				}
				break;
			case 56 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:340: T__71
				{
				mT__71(); 

				}
				break;
			case 57 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:346: T__72
				{
				mT__72(); 

				}
				break;
			case 58 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:352: T__73
				{
				mT__73(); 

				}
				break;
			case 59 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:358: ID
				{
				mID(); 

				}
				break;
			case 60 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:361: INT
				{
				mINT(); 

				}
				break;
			case 61 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:365: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 62 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:371: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 63 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:379: WS
				{
				mWS(); 

				}
				break;
			case 64 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:382: STRING
				{
				mSTRING(); 

				}
				break;
			case 65 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:1:389: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "194:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\3\uffff\1\46\3\uffff\1\47\1\50\3\uffff\1\55\2\uffff\17\37\1\115\1\uffff"+
		"\1\116\10\uffff\1\121\1\123\3\uffff\2\37\1\127\10\37\1\140\1\143\3\37"+
		"\1\150\15\37\10\uffff\3\37\1\uffff\6\37\1\u0081\1\u0082\1\uffff\2\37\1"+
		"\uffff\1\u0085\1\u0086\1\u0087\1\37\1\uffff\1\37\1\u008a\6\37\1\u0091"+
		"\10\37\1\u009a\2\37\1\u009d\2\37\1\u00a0\3\uffff\1\37\3\uffff\2\37\1\uffff"+
		"\1\37\1\u00a5\4\37\1\uffff\2\37\1\u00ac\1\u00ad\3\37\1\u00b1\1\uffff\1"+
		"\37\1\u00b3\1\uffff\2\37\1\uffff\3\37\1\u00b9\1\uffff\2\37\1\u00bc\1\u00bd"+
		"\1\37\1\u00bf\2\uffff\1\u00c0\1\37\1\u00c2\1\uffff\1\37\1\uffff\1\u00c4"+
		"\1\37\1\u00c6\1\u00c7\1\37\1\uffff\2\37\2\uffff\1\37\2\uffff\1\u00cc\1"+
		"\uffff\1\37\1\uffff\1\u00ce\2\uffff\1\37\1\u00d0\2\37\1\uffff\1\u00d3"+
		"\1\uffff\1\37\1\uffff\1\u00d5\1\u00d6\1\uffff\1\u00d7\3\uffff";
	static final String DFA20_eofS =
		"\u00d8\uffff";
	static final String DFA20_minS =
		"\1\11\2\uffff\1\52\3\uffff\1\57\1\56\2\uffff\1\55\1\75\2\uffff\1\150\1"+
		"\157\1\154\1\141\1\145\1\146\2\145\1\162\1\150\1\165\2\145\1\141\1\151"+
		"\1\174\1\uffff\1\56\10\uffff\2\76\3\uffff\1\141\1\156\1\60\1\163\1\165"+
		"\1\145\1\151\1\162\1\145\1\156\1\164\2\60\1\164\1\167\1\164\1\60\1\150"+
		"\1\164\1\141\1\145\1\164\1\145\1\144\1\164\1\143\1\142\1\145\1\160\1\145"+
		"\10\uffff\1\156\1\151\1\163\1\uffff\1\145\1\141\1\156\1\154\1\141\1\145"+
		"\2\60\1\uffff\1\55\1\145\1\uffff\3\60\1\156\1\uffff\1\145\1\60\1\163\1"+
		"\144\1\143\1\142\1\162\1\165\1\60\1\150\1\154\1\156\1\145\1\154\1\156"+
		"\1\143\1\164\1\60\2\164\1\60\1\154\1\141\1\60\3\uffff\1\162\3\uffff\1"+
		"\151\1\162\1\uffff\1\145\1\60\2\145\1\171\1\143\1\uffff\1\164\1\145\2"+
		"\60\1\144\2\145\1\60\1\uffff\1\151\1\60\1\uffff\1\154\1\143\1\uffff\1"+
		"\164\1\146\1\167\1\60\1\uffff\1\163\1\147\2\60\1\150\1\60\2\uffff\1\60"+
		"\1\154\1\60\1\uffff\1\157\1\uffff\1\60\1\150\2\60\1\151\1\uffff\1\163"+
		"\1\151\2\uffff\1\141\2\uffff\1\60\1\uffff\1\156\1\uffff\1\60\2\uffff\1"+
		"\163\1\60\1\156\1\164\1\uffff\1\60\1\uffff\1\145\1\uffff\2\60\1\uffff"+
		"\1\60\3\uffff";
	static final String DFA20_maxS =
		"\1\174\2\uffff\1\52\3\uffff\1\57\1\145\2\uffff\1\76\1\75\2\uffff\2\157"+
		"\1\166\1\165\1\145\1\156\1\145\1\157\3\165\1\145\1\165\1\171\1\151\1\174"+
		"\1\uffff\1\145\10\uffff\1\122\1\76\3\uffff\1\157\1\156\1\172\1\163\1\165"+
		"\1\145\1\151\1\162\1\145\1\156\1\164\2\172\1\164\1\167\1\165\1\172\1\150"+
		"\1\164\1\141\1\157\1\164\1\145\1\144\1\164\1\143\1\142\1\145\1\160\1\145"+
		"\10\uffff\1\156\1\151\1\163\1\uffff\1\145\1\141\1\156\1\154\2\145\2\172"+
		"\1\uffff\1\55\1\145\1\uffff\3\172\1\156\1\uffff\1\145\1\172\1\163\1\144"+
		"\1\143\1\142\1\162\1\165\1\172\1\150\1\154\1\156\1\145\1\154\1\156\1\143"+
		"\1\164\1\172\2\164\1\172\1\154\1\141\1\172\3\uffff\1\162\3\uffff\1\151"+
		"\1\162\1\uffff\1\145\1\172\2\145\1\171\1\143\1\uffff\1\164\1\145\2\172"+
		"\1\144\2\145\1\172\1\uffff\1\151\1\172\1\uffff\1\154\1\143\1\uffff\1\164"+
		"\1\146\1\167\1\172\1\uffff\1\163\1\147\2\172\1\150\1\172\2\uffff\1\172"+
		"\1\154\1\172\1\uffff\1\157\1\uffff\1\172\1\150\2\172\1\151\1\uffff\1\163"+
		"\1\151\2\uffff\1\141\2\uffff\1\172\1\uffff\1\156\1\uffff\1\172\2\uffff"+
		"\1\163\1\172\1\156\1\164\1\uffff\1\172\1\uffff\1\145\1\uffff\2\172\1\uffff"+
		"\1\172\3\uffff";
	static final String DFA20_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\2\uffff\1\11\1\12\2\uffff\1\23\1"+
		"\24\20\uffff\1\73\1\uffff\1\75\1\77\1\100\1\101\1\76\1\3\1\7\1\10\2\uffff"+
		"\1\20\1\22\1\21\36\uffff\1\72\1\71\1\74\1\14\1\15\1\13\1\17\1\16\3\uffff"+
		"\1\30\10\uffff\1\42\2\uffff\1\43\4\uffff\1\52\30\uffff\1\40\1\41\1\44"+
		"\1\uffff\1\46\1\47\1\50\2\uffff\1\54\6\uffff\1\63\10\uffff\1\31\2\uffff"+
		"\1\34\2\uffff\1\37\4\uffff\1\56\6\uffff\1\66\1\67\3\uffff\1\27\1\uffff"+
		"\1\33\5\uffff\1\55\2\uffff\1\61\1\62\1\uffff\1\65\1\70\1\uffff\1\26\1"+
		"\uffff\1\35\1\uffff\1\45\1\51\4\uffff\1\25\1\uffff\1\36\1\uffff\1\57\2"+
		"\uffff\1\32\1\uffff\1\60\1\64\1\53";
	static final String DFA20_specialS =
		"\u00d8\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\42\2\uffff\1\42\22\uffff\1\42\1\1\1\43\3\uffff\1\2\1\44\1\3\1\4\2"+
			"\uffff\1\5\1\6\1\41\1\7\1\10\11\40\1\11\1\12\1\13\1\14\3\uffff\32\37"+
			"\1\15\1\uffff\1\16\1\uffff\1\37\1\uffff\2\37\1\17\1\20\1\21\1\22\1\23"+
			"\1\37\1\24\2\37\1\25\1\37\1\26\1\27\1\30\1\31\1\32\1\33\1\34\4\37\1\35"+
			"\1\37\1\uffff\1\36",
			"",
			"",
			"\1\45",
			"",
			"",
			"",
			"\1\45",
			"\1\41\1\uffff\12\40\13\uffff\1\41\37\uffff\1\41",
			"",
			"",
			"\1\51\17\uffff\1\52\1\53",
			"\1\54",
			"",
			"",
			"\1\56\6\uffff\1\57",
			"\1\60",
			"\1\61\4\uffff\1\62\4\uffff\1\63",
			"\1\64\15\uffff\1\65\2\uffff\1\66\2\uffff\1\67",
			"\1\70",
			"\1\71\7\uffff\1\72",
			"\1\73",
			"\1\74\11\uffff\1\75",
			"\1\76\1\uffff\1\77\1\100",
			"\1\101\11\uffff\1\102\2\uffff\1\103",
			"\1\104",
			"\1\105",
			"\1\106\17\uffff\1\107",
			"\1\110\6\uffff\1\111\20\uffff\1\112",
			"\1\113",
			"\1\114",
			"",
			"\1\41\1\uffff\12\40\13\uffff\1\41\37\uffff\1\41",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\117\23\uffff\1\120",
			"\1\122",
			"",
			"",
			"",
			"\1\124\15\uffff\1\125",
			"\1\126",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\11\37\1\141\10\37\1\142\7"+
			"\37",
			"\1\144",
			"\1\145",
			"\1\146\1\147",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154\11\uffff\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\167",
			"\1\170",
			"\1\171",
			"",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176\3\uffff\1\177",
			"\1\u0080",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u0083",
			"\1\u0084",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u0088",
			"",
			"\1\u0089",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u009b",
			"\1\u009c",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u009e",
			"\1\u009f",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"",
			"\1\u00a1",
			"",
			"",
			"",
			"\1\u00a2",
			"\1\u00a3",
			"",
			"\1\u00a4",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"",
			"\1\u00aa",
			"\1\u00ab",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u00b2",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u00b4",
			"\1\u00b5",
			"",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u00ba",
			"\1\u00bb",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u00be",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u00c1",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u00c3",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u00c5",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u00c8",
			"",
			"\1\u00c9",
			"\1\u00ca",
			"",
			"",
			"\1\u00cb",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u00cd",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"\1\u00cf",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u00d1",
			"\1\u00d2",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u00d4",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
