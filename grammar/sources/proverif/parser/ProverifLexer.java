// Generated from proverif/parser/Proverif.g4 by ANTLR 4.7.1

	package proverif.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProverifLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZERO=1, POINT=2, COMMA=3, SEMICOLON=4, RIGHTPARENTHESIS=5, LEFTPARENTHESIS=6, 
		COLON=7, EQUAL=8, LEFTBRACKET=9, RIGHTBRACKET=10, IN=11, DIFF=12, OR=13, 
		AND=14, IMPLICATES=15, SLASH=16, EXCLAMATION=17, ARROW=18, REVERSEARROW=19, 
		REVERSEARROWR=20, ARROWR=21, DOUBLEARROW=22, EQUIVALENT=23, REVERSEIMPLICATES=24, 
		PIPE=25, CURLYBRACKETLEFT=26, CURLYBRACKETRIGHT=27, WEAKSECRET=28, ELIMTRUE=29, 
		CLAUSES=30, PARAM=31, PROBA=32, DEF=33, EXPAND=34, PROCESS=35, EQUIVALENCE=36, 
		CHANNEL=37, FREE=38, REDUC=39, FUN=40, CONST=41, EQUATION=42, TABLE=43, 
		PRED=44, LET=45, SET=46, EVENT=47, QUERY=48, NOT=49, NOUNIF=50, FORALL=51, 
		OTHERWISE=52, PUTBEGIN=53, INJEVENT=54, PHASE=55, NEW=56, YIELD=57, DO=58, 
		OUT=59, ELSE=60, SUCHTHAT=61, INSERT=62, IF=63, THEN=64, GET=65, FAIL=66, 
		ORWORD=67, FOREACH=68, CHOICE=69, TYPE=70, LETFUN=71, NONINTERF=72, AMONG=73, 
		DATA=74, PRIVATE=75, TYPECONVERTER=76, MEMBEROPTIM=77, BLOCKOPTION=78, 
		ID=79, INT=80, FLOAT=81, SINGLELINECOMMENT=82, MULTIPLELINESCOMMENT=83, 
		WS=84;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ZERO", "POINT", "COMMA", "SEMICOLON", "RIGHTPARENTHESIS", "LEFTPARENTHESIS", 
		"COLON", "EQUAL", "LEFTBRACKET", "RIGHTBRACKET", "IN", "DIFF", "OR", "AND", 
		"IMPLICATES", "SLASH", "EXCLAMATION", "ARROW", "REVERSEARROW", "REVERSEARROWR", 
		"ARROWR", "DOUBLEARROW", "EQUIVALENT", "REVERSEIMPLICATES", "PIPE", "CURLYBRACKETLEFT", 
		"CURLYBRACKETRIGHT", "WEAKSECRET", "ELIMTRUE", "CLAUSES", "PARAM", "PROBA", 
		"DEF", "EXPAND", "PROCESS", "EQUIVALENCE", "CHANNEL", "FREE", "REDUC", 
		"FUN", "CONST", "EQUATION", "TABLE", "PRED", "LET", "SET", "EVENT", "QUERY", 
		"NOT", "NOUNIF", "FORALL", "OTHERWISE", "PUTBEGIN", "INJEVENT", "PHASE", 
		"NEW", "YIELD", "DO", "OUT", "ELSE", "SUCHTHAT", "INSERT", "IF", "THEN", 
		"GET", "FAIL", "ORWORD", "FOREACH", "CHOICE", "TYPE", "LETFUN", "NONINTERF", 
		"AMONG", "DATA", "PRIVATE", "TYPECONVERTER", "MEMBEROPTIM", "BLOCKOPTION", 
		"ID", "INT", "FLOAT", "SINGLELINECOMMENT", "MULTIPLELINESCOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", "'.'", "','", "';'", "')'", "'('", "':'", "'='", "'['", "']'", 
		"'in'", "'<>'", "'||'", "'&&'", "'==>'", "'/'", "'!'", "'->'", "'<-'", 
		"'<-R'", "'->R'", "'<->'", "'<=>'", "'<='", "'|'", "'{'", "'}'", "'weaksecret'", 
		"'elimtrue'", "'clauses'", "'param'", "'proba'", "'def'", "'expand'", 
		"'process'", "'equivalence'", "'channel'", "'free'", "'reduc'", "'fun'", 
		"'const'", "'equation'", "'table'", "'pred'", "'let'", "'set'", "'event'", 
		"'query'", "'not'", "'nounif'", "'forall'", "'otherwise'", "'putbegin'", 
		"'inj-event'", "'phase'", "'new'", "'yield'", "'do'", "'out'", "'else'", 
		"'suchthat'", "'insert'", "'if'", "'then'", "'get'", "'fail'", "'or'", 
		"'foreach'", "'choice'", "'type'", "'letfun'", "'noninterf'", "'among'", 
		"'data'", "'private'", "'typeConverter'", "'memberOptim'", "'blockOption'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZERO", "POINT", "COMMA", "SEMICOLON", "RIGHTPARENTHESIS", "LEFTPARENTHESIS", 
		"COLON", "EQUAL", "LEFTBRACKET", "RIGHTBRACKET", "IN", "DIFF", "OR", "AND", 
		"IMPLICATES", "SLASH", "EXCLAMATION", "ARROW", "REVERSEARROW", "REVERSEARROWR", 
		"ARROWR", "DOUBLEARROW", "EQUIVALENT", "REVERSEIMPLICATES", "PIPE", "CURLYBRACKETLEFT", 
		"CURLYBRACKETRIGHT", "WEAKSECRET", "ELIMTRUE", "CLAUSES", "PARAM", "PROBA", 
		"DEF", "EXPAND", "PROCESS", "EQUIVALENCE", "CHANNEL", "FREE", "REDUC", 
		"FUN", "CONST", "EQUATION", "TABLE", "PRED", "LET", "SET", "EVENT", "QUERY", 
		"NOT", "NOUNIF", "FORALL", "OTHERWISE", "PUTBEGIN", "INJEVENT", "PHASE", 
		"NEW", "YIELD", "DO", "OUT", "ELSE", "SUCHTHAT", "INSERT", "IF", "THEN", 
		"GET", "FAIL", "ORWORD", "FOREACH", "CHOICE", "TYPE", "LETFUN", "NONINTERF", 
		"AMONG", "DATA", "PRIVATE", "TYPECONVERTER", "MEMBEROPTIM", "BLOCKOPTION", 
		"ID", "INT", "FLOAT", "SINGLELINECOMMENT", "MULTIPLELINESCOMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ProverifLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Proverif.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u028f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3"+
		"G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3"+
		"J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\7P\u024e\nP\fP\16P\u0251\13P\3Q\6Q\u0254"+
		"\nQ\rQ\16Q\u0255\3R\6R\u0259\nR\rR\16R\u025a\3R\3R\6R\u025f\nR\rR\16R"+
		"\u0260\3R\3R\6R\u0265\nR\rR\16R\u0266\3R\6R\u026a\nR\rR\16R\u026b\5R\u026e"+
		"\nR\3S\3S\3S\3S\7S\u0274\nS\fS\16S\u0277\13S\3S\3S\3T\3T\3T\3T\7T\u027f"+
		"\nT\fT\16T\u0282\13T\3T\3T\3T\3T\3T\3U\6U\u028a\nU\rU\16U\u028b\3U\3U"+
		"\3\u0280\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\3\2\6\5\2C\\aac|\7\2))\62;C\\aac"+
		"|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0299\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2"+
		"\2\5\u00ad\3\2\2\2\7\u00af\3\2\2\2\t\u00b1\3\2\2\2\13\u00b3\3\2\2\2\r"+
		"\u00b5\3\2\2\2\17\u00b7\3\2\2\2\21\u00b9\3\2\2\2\23\u00bb\3\2\2\2\25\u00bd"+
		"\3\2\2\2\27\u00bf\3\2\2\2\31\u00c2\3\2\2\2\33\u00c5\3\2\2\2\35\u00c8\3"+
		"\2\2\2\37\u00cb\3\2\2\2!\u00cf\3\2\2\2#\u00d1\3\2\2\2%\u00d3\3\2\2\2\'"+
		"\u00d6\3\2\2\2)\u00d9\3\2\2\2+\u00dd\3\2\2\2-\u00e1\3\2\2\2/\u00e5\3\2"+
		"\2\2\61\u00e9\3\2\2\2\63\u00ec\3\2\2\2\65\u00ee\3\2\2\2\67\u00f0\3\2\2"+
		"\29\u00f2\3\2\2\2;\u00fd\3\2\2\2=\u0106\3\2\2\2?\u010e\3\2\2\2A\u0114"+
		"\3\2\2\2C\u011a\3\2\2\2E\u011e\3\2\2\2G\u0125\3\2\2\2I\u012d\3\2\2\2K"+
		"\u0139\3\2\2\2M\u0141\3\2\2\2O\u0146\3\2\2\2Q\u014c\3\2\2\2S\u0150\3\2"+
		"\2\2U\u0156\3\2\2\2W\u015f\3\2\2\2Y\u0165\3\2\2\2[\u016a\3\2\2\2]\u016e"+
		"\3\2\2\2_\u0172\3\2\2\2a\u0178\3\2\2\2c\u017e\3\2\2\2e\u0182\3\2\2\2g"+
		"\u0189\3\2\2\2i\u0190\3\2\2\2k\u019a\3\2\2\2m\u01a3\3\2\2\2o\u01ad\3\2"+
		"\2\2q\u01b3\3\2\2\2s\u01b7\3\2\2\2u\u01bd\3\2\2\2w\u01c0\3\2\2\2y\u01c4"+
		"\3\2\2\2{\u01c9\3\2\2\2}\u01d2\3\2\2\2\177\u01d9\3\2\2\2\u0081\u01dc\3"+
		"\2\2\2\u0083\u01e1\3\2\2\2\u0085\u01e5\3\2\2\2\u0087\u01ea\3\2\2\2\u0089"+
		"\u01ed\3\2\2\2\u008b\u01f5\3\2\2\2\u008d\u01fc\3\2\2\2\u008f\u0201\3\2"+
		"\2\2\u0091\u0208\3\2\2\2\u0093\u0212\3\2\2\2\u0095\u0218\3\2\2\2\u0097"+
		"\u021d\3\2\2\2\u0099\u0225\3\2\2\2\u009b\u0233\3\2\2\2\u009d\u023f\3\2"+
		"\2\2\u009f\u024b\3\2\2\2\u00a1\u0253\3\2\2\2\u00a3\u026d\3\2\2\2\u00a5"+
		"\u026f\3\2\2\2\u00a7\u027a\3\2\2\2\u00a9\u0289\3\2\2\2\u00ab\u00ac\7\62"+
		"\2\2\u00ac\4\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae\6\3\2\2\2\u00af\u00b0"+
		"\7.\2\2\u00b0\b\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\n\3\2\2\2\u00b3\u00b4"+
		"\7+\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\16\3\2\2\2\u00b7\u00b8"+
		"\7<\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\22\3\2\2\2\u00bb\u00bc"+
		"\7]\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7_\2\2\u00be\26\3\2\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7>\2\2\u00c3\u00c4"+
		"\7@\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7~\2\2\u00c6\u00c7\7~\2\2\u00c7\34"+
		"\3\2\2\2\u00c8\u00c9\7(\2\2\u00c9\u00ca\7(\2\2\u00ca\36\3\2\2\2\u00cb"+
		"\u00cc\7?\2\2\u00cc\u00cd\7?\2\2\u00cd\u00ce\7@\2\2\u00ce \3\2\2\2\u00cf"+
		"\u00d0\7\61\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7#\2\2\u00d2$\3\2\2\2\u00d3"+
		"\u00d4\7/\2\2\u00d4\u00d5\7@\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7"+
		"\u00d8\7/\2\2\u00d8(\3\2\2\2\u00d9\u00da\7>\2\2\u00da\u00db\7/\2\2\u00db"+
		"\u00dc\7T\2\2\u00dc*\3\2\2\2\u00dd\u00de\7/\2\2\u00de\u00df\7@\2\2\u00df"+
		"\u00e0\7T\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7/\2\2\u00e3"+
		"\u00e4\7@\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7\7?\2\2\u00e7"+
		"\u00e8\7@\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7?\2\2\u00eb"+
		"\62\3\2\2\2\u00ec\u00ed\7~\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\7}\2\2\u00ef"+
		"\66\3\2\2\2\u00f0\u00f1\7\177\2\2\u00f18\3\2\2\2\u00f2\u00f3\7y\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7m\2\2\u00f6\u00f7\7u\2\2"+
		"\u00f7\u00f8\7g\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb"+
		"\7g\2\2\u00fb\u00fc\7v\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7n\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7o\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7t\2\2\u0103\u0104\7w\2\2\u0104\u0105\7g\2\2\u0105<\3\2\2\2\u0106"+
		"\u0107\7e\2\2\u0107\u0108\7n\2\2\u0108\u0109\7c\2\2\u0109\u010a\7w\2\2"+
		"\u010a\u010b\7u\2\2\u010b\u010c\7g\2\2\u010c\u010d\7u\2\2\u010d>\3\2\2"+
		"\2\u010e\u010f\7r\2\2\u010f\u0110\7c\2\2\u0110\u0111\7t\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7o\2\2\u0113@\3\2\2\2\u0114\u0115\7r\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0117\7q\2\2\u0117\u0118\7d\2\2\u0118\u0119\7c\2\2\u0119"+
		"B\3\2\2\2\u011a\u011b\7f\2\2\u011b\u011c\7g\2\2\u011c\u011d\7h\2\2\u011d"+
		"D\3\2\2\2\u011e\u011f\7g\2\2\u011f\u0120\7z\2\2\u0120\u0121\7r\2\2\u0121"+
		"\u0122\7c\2\2\u0122\u0123\7p\2\2\u0123\u0124\7f\2\2\u0124F\3\2\2\2\u0125"+
		"\u0126\7r\2\2\u0126\u0127\7t\2\2\u0127\u0128\7q\2\2\u0128\u0129\7e\2\2"+
		"\u0129\u012a\7g\2\2\u012a\u012b\7u\2\2\u012b\u012c\7u\2\2\u012cH\3\2\2"+
		"\2\u012d\u012e\7g\2\2\u012e\u012f\7s\2\2\u012f\u0130\7w\2\2\u0130\u0131"+
		"\7k\2\2\u0131\u0132\7x\2\2\u0132\u0133\7c\2\2\u0133\u0134\7n\2\2\u0134"+
		"\u0135\7g\2\2\u0135\u0136\7p\2\2\u0136\u0137\7e\2\2\u0137\u0138\7g\2\2"+
		"\u0138J\3\2\2\2\u0139\u013a\7e\2\2\u013a\u013b\7j\2\2\u013b\u013c\7c\2"+
		"\2\u013c\u013d\7p\2\2\u013d\u013e\7p\2\2\u013e\u013f\7g\2\2\u013f\u0140"+
		"\7n\2\2\u0140L\3\2\2\2\u0141\u0142\7h\2\2\u0142\u0143\7t\2\2\u0143\u0144"+
		"\7g\2\2\u0144\u0145\7g\2\2\u0145N\3\2\2\2\u0146\u0147\7t\2\2\u0147\u0148"+
		"\7g\2\2\u0148\u0149\7f\2\2\u0149\u014a\7w\2\2\u014a\u014b\7e\2\2\u014b"+
		"P\3\2\2\2\u014c\u014d\7h\2\2\u014d\u014e\7w\2\2\u014e\u014f\7p\2\2\u014f"+
		"R\3\2\2\2\u0150\u0151\7e\2\2\u0151\u0152\7q\2\2\u0152\u0153\7p\2\2\u0153"+
		"\u0154\7u\2\2\u0154\u0155\7v\2\2\u0155T\3\2\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u0158\7s\2\2\u0158\u0159\7w\2\2\u0159\u015a\7c\2\2\u015a\u015b\7v\2\2"+
		"\u015b\u015c\7k\2\2\u015c\u015d\7q\2\2\u015d\u015e\7p\2\2\u015eV\3\2\2"+
		"\2\u015f\u0160\7v\2\2\u0160\u0161\7c\2\2\u0161\u0162\7d\2\2\u0162\u0163"+
		"\7n\2\2\u0163\u0164\7g\2\2\u0164X\3\2\2\2\u0165\u0166\7r\2\2\u0166\u0167"+
		"\7t\2\2\u0167\u0168\7g\2\2\u0168\u0169\7f\2\2\u0169Z\3\2\2\2\u016a\u016b"+
		"\7n\2\2\u016b\u016c\7g\2\2\u016c\u016d\7v\2\2\u016d\\\3\2\2\2\u016e\u016f"+
		"\7u\2\2\u016f\u0170\7g\2\2\u0170\u0171\7v\2\2\u0171^\3\2\2\2\u0172\u0173"+
		"\7g\2\2\u0173\u0174\7x\2\2\u0174\u0175\7g\2\2\u0175\u0176\7p\2\2\u0176"+
		"\u0177\7v\2\2\u0177`\3\2\2\2\u0178\u0179\7s\2\2\u0179\u017a\7w\2\2\u017a"+
		"\u017b\7g\2\2\u017b\u017c\7t\2\2\u017c\u017d\7{\2\2\u017db\3\2\2\2\u017e"+
		"\u017f\7p\2\2\u017f\u0180\7q\2\2\u0180\u0181\7v\2\2\u0181d\3\2\2\2\u0182"+
		"\u0183\7p\2\2\u0183\u0184\7q\2\2\u0184\u0185\7w\2\2\u0185\u0186\7p\2\2"+
		"\u0186\u0187\7k\2\2\u0187\u0188\7h\2\2\u0188f\3\2\2\2\u0189\u018a\7h\2"+
		"\2\u018a\u018b\7q\2\2\u018b\u018c\7t\2\2\u018c\u018d\7c\2\2\u018d\u018e"+
		"\7n\2\2\u018e\u018f\7n\2\2\u018fh\3\2\2\2\u0190\u0191\7q\2\2\u0191\u0192"+
		"\7v\2\2\u0192\u0193\7j\2\2\u0193\u0194\7g\2\2\u0194\u0195\7t\2\2\u0195"+
		"\u0196\7y\2\2\u0196\u0197\7k\2\2\u0197\u0198\7u\2\2\u0198\u0199\7g\2\2"+
		"\u0199j\3\2\2\2\u019a\u019b\7r\2\2\u019b\u019c\7w\2\2\u019c\u019d\7v\2"+
		"\2\u019d\u019e\7d\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7i\2\2\u01a0\u01a1"+
		"\7k\2\2\u01a1\u01a2\7p\2\2\u01a2l\3\2\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5"+
		"\7p\2\2\u01a5\u01a6\7l\2\2\u01a6\u01a7\7/\2\2\u01a7\u01a8\7g\2\2\u01a8"+
		"\u01a9\7x\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7v\2\2"+
		"\u01acn\3\2\2\2\u01ad\u01ae\7r\2\2\u01ae\u01af\7j\2\2\u01af\u01b0\7c\2"+
		"\2\u01b0\u01b1\7u\2\2\u01b1\u01b2\7g\2\2\u01b2p\3\2\2\2\u01b3\u01b4\7"+
		"p\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7y\2\2\u01b6r\3\2\2\2\u01b7\u01b8"+
		"\7{\2\2\u01b8\u01b9\7k\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7n\2\2\u01bb"+
		"\u01bc\7f\2\2\u01bct\3\2\2\2\u01bd\u01be\7f\2\2\u01be\u01bf\7q\2\2\u01bf"+
		"v\3\2\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2\7w\2\2\u01c2\u01c3\7v\2\2\u01c3"+
		"x\3\2\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7\7u\2\2\u01c7"+
		"\u01c8\7g\2\2\u01c8z\3\2\2\2\u01c9\u01ca\7u\2\2\u01ca\u01cb\7w\2\2\u01cb"+
		"\u01cc\7e\2\2\u01cc\u01cd\7j\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7j\2\2"+
		"\u01cf\u01d0\7c\2\2\u01d0\u01d1\7v\2\2\u01d1|\3\2\2\2\u01d2\u01d3\7k\2"+
		"\2\u01d3\u01d4\7p\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7"+
		"\7t\2\2\u01d7\u01d8\7v\2\2\u01d8~\3\2\2\2\u01d9\u01da\7k\2\2\u01da\u01db"+
		"\7h\2\2\u01db\u0080\3\2\2\2\u01dc\u01dd\7v\2\2\u01dd\u01de\7j\2\2\u01de"+
		"\u01df\7g\2\2\u01df\u01e0\7p\2\2\u01e0\u0082\3\2\2\2\u01e1\u01e2\7i\2"+
		"\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\7v\2\2\u01e4\u0084\3\2\2\2\u01e5\u01e6"+
		"\7h\2\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7n\2\2\u01e9"+
		"\u0086\3\2\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec\7t\2\2\u01ec\u0088\3\2\2"+
		"\2\u01ed\u01ee\7h\2\2\u01ee\u01ef\7q\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1"+
		"\7g\2\2\u01f1\u01f2\7c\2\2\u01f2\u01f3\7e\2\2\u01f3\u01f4\7j\2\2\u01f4"+
		"\u008a\3\2\2\2\u01f5\u01f6\7e\2\2\u01f6\u01f7\7j\2\2\u01f7\u01f8\7q\2"+
		"\2\u01f8\u01f9\7k\2\2\u01f9\u01fa\7e\2\2\u01fa\u01fb\7g\2\2\u01fb\u008c"+
		"\3\2\2\2\u01fc\u01fd\7v\2\2\u01fd\u01fe\7{\2\2\u01fe\u01ff\7r\2\2\u01ff"+
		"\u0200\7g\2\2\u0200\u008e\3\2\2\2\u0201\u0202\7n\2\2\u0202\u0203\7g\2"+
		"\2\u0203\u0204\7v\2\2\u0204\u0205\7h\2\2\u0205\u0206\7w\2\2\u0206\u0207"+
		"\7p\2\2\u0207\u0090\3\2\2\2\u0208\u0209\7p\2\2\u0209\u020a\7q\2\2\u020a"+
		"\u020b\7p\2\2\u020b\u020c\7k\2\2\u020c\u020d\7p\2\2\u020d\u020e\7v\2\2"+
		"\u020e\u020f\7g\2\2\u020f\u0210\7t\2\2\u0210\u0211\7h\2\2\u0211\u0092"+
		"\3\2\2\2\u0212\u0213\7c\2\2\u0213\u0214\7o\2\2\u0214\u0215\7q\2\2\u0215"+
		"\u0216\7p\2\2\u0216\u0217\7i\2\2\u0217\u0094\3\2\2\2\u0218\u0219\7f\2"+
		"\2\u0219\u021a\7c\2\2\u021a\u021b\7v\2\2\u021b\u021c\7c\2\2\u021c\u0096"+
		"\3\2\2\2\u021d\u021e\7r\2\2\u021e\u021f\7t\2\2\u021f\u0220\7k\2\2\u0220"+
		"\u0221\7x\2\2\u0221\u0222\7c\2\2\u0222\u0223\7v\2\2\u0223\u0224\7g\2\2"+
		"\u0224\u0098\3\2\2\2\u0225\u0226\7v\2\2\u0226\u0227\7{\2\2\u0227\u0228"+
		"\7r\2\2\u0228\u0229\7g\2\2\u0229\u022a\7E\2\2\u022a\u022b\7q\2\2\u022b"+
		"\u022c\7p\2\2\u022c\u022d\7x\2\2\u022d\u022e\7g\2\2\u022e\u022f\7t\2\2"+
		"\u022f\u0230\7v\2\2\u0230\u0231\7g\2\2\u0231\u0232\7t\2\2\u0232\u009a"+
		"\3\2\2\2\u0233\u0234\7o\2\2\u0234\u0235\7g\2\2\u0235\u0236\7o\2\2\u0236"+
		"\u0237\7d\2\2\u0237\u0238\7g\2\2\u0238\u0239\7t\2\2\u0239\u023a\7Q\2\2"+
		"\u023a\u023b\7r\2\2\u023b\u023c\7v\2\2\u023c\u023d\7k\2\2\u023d\u023e"+
		"\7o\2\2\u023e\u009c\3\2\2\2\u023f\u0240\7d\2\2\u0240\u0241\7n\2\2\u0241"+
		"\u0242\7q\2\2\u0242\u0243\7e\2\2\u0243\u0244\7m\2\2\u0244\u0245\7Q\2\2"+
		"\u0245\u0246\7r\2\2\u0246\u0247\7v\2\2\u0247\u0248\7k\2\2\u0248\u0249"+
		"\7q\2\2\u0249\u024a\7p\2\2\u024a\u009e\3\2\2\2\u024b\u024f\t\2\2\2\u024c"+
		"\u024e\t\3\2\2\u024d\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2"+
		"\2\2\u024f\u0250\3\2\2\2\u0250\u00a0\3\2\2\2\u0251\u024f\3\2\2\2\u0252"+
		"\u0254\4\62;\2\u0253\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0255\u0256\3\2\2\2\u0256\u00a2\3\2\2\2\u0257\u0259\4\62;\2\u0258"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\u025e\7\60\2\2\u025d\u025f\4\62;\2\u025e"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u026e\3\2\2\2\u0262\u0264\7\60\2\2\u0263\u0265\4\62;\2\u0264"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u026e\3\2\2\2\u0268\u026a\4\62;\2\u0269\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2"+
		"\2\2\u026d\u0258\3\2\2\2\u026d\u0262\3\2\2\2\u026d\u0269\3\2\2\2\u026e"+
		"\u00a4\3\2\2\2\u026f\u0270\7\61\2\2\u0270\u0271\7\61\2\2\u0271\u0275\3"+
		"\2\2\2\u0272\u0274\n\4\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0278\u0279\bS\2\2\u0279\u00a6\3\2\2\2\u027a\u027b\7*\2\2\u027b\u027c"+
		"\7,\2\2\u027c\u0280\3\2\2\2\u027d\u027f\13\2\2\2\u027e\u027d\3\2\2\2\u027f"+
		"\u0282\3\2\2\2\u0280\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0283\3\2"+
		"\2\2\u0282\u0280\3\2\2\2\u0283\u0284\7,\2\2\u0284\u0285\7+\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0287\bT\2\2\u0287\u00a8\3\2\2\2\u0288\u028a\t\5\2\2\u0289"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028d\u028e\bU\2\2\u028e\u00aa\3\2\2\2\r\2\u024f"+
		"\u0255\u025a\u0260\u0266\u026b\u026d\u0275\u0280\u028b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}