// Generated from proverif/parser/Proverif.g4 by ANTLR 4.7.1

	package proverif.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProverifParser extends Parser {
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
	public static final int
		RULE_programme = 0, RULE_declaration = 1, RULE_nidecl = 2, RULE_reduc = 3, 
		RULE_reducprime = 4, RULE_eqlist = 5, RULE_name = 6, RULE_value = 7, RULE_query = 8, 
		RULE_gterm = 9, RULE_gtermSequence = 10, RULE_gbinding = 11, RULE_nounifdecl = 12, 
		RULE_gformat = 13, RULE_fbinding = 14, RULE_clauses = 15, RULE_clause = 16, 
		RULE_process = 17, RULE_pterm = 18, RULE_ptermSequence = 19, RULE_term = 20, 
		RULE_pattern = 21, RULE_patternSequence = 22, RULE_mayfailterm = 23, RULE_typedecl = 24, 
		RULE_failtypedecl = 25, RULE_proverifOptionsFree = 26, RULE_proverifOptionsFun = 27, 
		RULE_proverifOptionsPred = 28, RULE_proverifOptions = 29, RULE_optionfun = 30, 
		RULE_optionpred = 31, RULE_ident = 32, RULE_id = 33, RULE_integer = 34, 
		RULE_typeid = 35;
	public static final String[] ruleNames = {
		"programme", "declaration", "nidecl", "reduc", "reducprime", "eqlist", 
		"name", "value", "query", "gterm", "gtermSequence", "gbinding", "nounifdecl", 
		"gformat", "fbinding", "clauses", "clause", "process", "pterm", "ptermSequence", 
		"term", "pattern", "patternSequence", "mayfailterm", "typedecl", "failtypedecl", 
		"proverifOptionsFree", "proverifOptionsFun", "proverifOptionsPred", "proverifOptions", 
		"optionfun", "optionpred", "ident", "id", "integer", "typeid"
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

	@Override
	public String getGrammarFileName() { return "Proverif.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProverifParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammeContext extends ParserRuleContext {
		public TerminalNode PROCESS() { return getToken(ProverifParser.PROCESS, 0); }
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode EQUIVALENCE() { return getToken(ProverifParser.EQUIVALENCE, 0); }
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (WEAKSECRET - 28)) | (1L << (ELIMTRUE - 28)) | (1L << (CLAUSES - 28)) | (1L << (PARAM - 28)) | (1L << (PROBA - 28)) | (1L << (DEF - 28)) | (1L << (EXPAND - 28)) | (1L << (CHANNEL - 28)) | (1L << (FREE - 28)) | (1L << (REDUC - 28)) | (1L << (FUN - 28)) | (1L << (CONST - 28)) | (1L << (EQUATION - 28)) | (1L << (TABLE - 28)) | (1L << (PRED - 28)) | (1L << (LET - 28)) | (1L << (SET - 28)) | (1L << (EVENT - 28)) | (1L << (QUERY - 28)) | (1L << (NOT - 28)) | (1L << (NOUNIF - 28)) | (1L << (TYPE - 28)) | (1L << (LETFUN - 28)) | (1L << (NONINTERF - 28)))) != 0)) {
					{
					{
					setState(72);
					declaration();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(PROCESS);
				setState(79);
				process();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (WEAKSECRET - 28)) | (1L << (ELIMTRUE - 28)) | (1L << (CLAUSES - 28)) | (1L << (PARAM - 28)) | (1L << (PROBA - 28)) | (1L << (DEF - 28)) | (1L << (EXPAND - 28)) | (1L << (CHANNEL - 28)) | (1L << (FREE - 28)) | (1L << (REDUC - 28)) | (1L << (FUN - 28)) | (1L << (CONST - 28)) | (1L << (EQUATION - 28)) | (1L << (TABLE - 28)) | (1L << (PRED - 28)) | (1L << (LET - 28)) | (1L << (SET - 28)) | (1L << (EVENT - 28)) | (1L << (QUERY - 28)) | (1L << (NOT - 28)) | (1L << (NOUNIF - 28)) | (1L << (TYPE - 28)) | (1L << (LETFUN - 28)) | (1L << (NONINTERF - 28)))) != 0)) {
					{
					{
					setState(80);
					declaration();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(EQUIVALENCE);
				setState(87);
				process();
				setState(88);
				process();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ProverifParser.TYPE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ProverifOptionsContext proverifOptions() {
			return getRuleContext(ProverifOptionsContext.class,0);
		}
		public TerminalNode POINT() { return getToken(ProverifParser.POINT, 0); }
		public TerminalNode CHANNEL() { return getToken(ProverifParser.CHANNEL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public TerminalNode FREE() { return getToken(ProverifParser.FREE, 0); }
		public TerminalNode COLON() { return getToken(ProverifParser.COLON, 0); }
		public List<TypeidContext> typeid() {
			return getRuleContexts(TypeidContext.class);
		}
		public TypeidContext typeid(int i) {
			return getRuleContext(TypeidContext.class,i);
		}
		public ProverifOptionsFreeContext proverifOptionsFree() {
			return getRuleContext(ProverifOptionsFreeContext.class,0);
		}
		public TerminalNode CONST() { return getToken(ProverifParser.CONST, 0); }
		public ProverifOptionsFunContext proverifOptionsFun() {
			return getRuleContext(ProverifOptionsFunContext.class,0);
		}
		public TerminalNode FUN() { return getToken(ProverifParser.FUN, 0); }
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode LETFUN() { return getToken(ProverifParser.LETFUN, 0); }
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public PtermContext pterm() {
			return getRuleContext(PtermContext.class,0);
		}
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public TerminalNode REDUC() { return getToken(ProverifParser.REDUC, 0); }
		public ReducContext reduc() {
			return getRuleContext(ReducContext.class,0);
		}
		public ReducprimeContext reducprime() {
			return getRuleContext(ReducprimeContext.class,0);
		}
		public TerminalNode EQUATION() { return getToken(ProverifParser.EQUATION, 0); }
		public EqlistContext eqlist() {
			return getRuleContext(EqlistContext.class,0);
		}
		public TerminalNode PRED() { return getToken(ProverifParser.PRED, 0); }
		public ProverifOptionsPredContext proverifOptionsPred() {
			return getRuleContext(ProverifOptionsPredContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ProverifParser.TABLE, 0); }
		public TerminalNode LET() { return getToken(ProverifParser.LET, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public TerminalNode SET() { return getToken(ProverifParser.SET, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EVENT() { return getToken(ProverifParser.EVENT, 0); }
		public TerminalNode QUERY() { return getToken(ProverifParser.QUERY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ProverifParser.SEMICOLON, 0); }
		public TerminalNode NONINTERF() { return getToken(ProverifParser.NONINTERF, 0); }
		public List<NideclContext> nidecl() {
			return getRuleContexts(NideclContext.class);
		}
		public NideclContext nidecl(int i) {
			return getRuleContext(NideclContext.class,i);
		}
		public TerminalNode WEAKSECRET() { return getToken(ProverifParser.WEAKSECRET, 0); }
		public TerminalNode NOT() { return getToken(ProverifParser.NOT, 0); }
		public GtermContext gterm() {
			return getRuleContext(GtermContext.class,0);
		}
		public TerminalNode NOUNIF() { return getToken(ProverifParser.NOUNIF, 0); }
		public NounifdeclContext nounifdecl() {
			return getRuleContext(NounifdeclContext.class,0);
		}
		public TerminalNode ELIMTRUE() { return getToken(ProverifParser.ELIMTRUE, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FailtypedeclContext failtypedecl() {
			return getRuleContext(FailtypedeclContext.class,0);
		}
		public TerminalNode CLAUSES() { return getToken(ProverifParser.CLAUSES, 0); }
		public ClausesContext clauses() {
			return getRuleContext(ClausesContext.class,0);
		}
		public TerminalNode PARAM() { return getToken(ProverifParser.PARAM, 0); }
		public TerminalNode PROBA() { return getToken(ProverifParser.PROBA, 0); }
		public TerminalNode DEF() { return getToken(ProverifParser.DEF, 0); }
		public TerminalNode CURLYBRACKETLEFT() { return getToken(ProverifParser.CURLYBRACKETLEFT, 0); }
		public TerminalNode CURLYBRACKETRIGHT() { return getToken(ProverifParser.CURLYBRACKETRIGHT, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode EXPAND() { return getToken(ProverifParser.EXPAND, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			int _alt;
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(TYPE);
				setState(93);
				ident();
				setState(94);
				proverifOptions();
				setState(95);
				match(POINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(CHANNEL);
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						ident();
						setState(99);
						match(COMMA);
						}
						} 
					}
					setState(105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(106);
				ident();
				setState(107);
				match(POINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(FREE);
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						ident();
						setState(111);
						match(COMMA);
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(118);
				ident();
				setState(119);
				match(COLON);
				setState(120);
				typeid();
				setState(121);
				proverifOptionsFree();
				setState(122);
				match(POINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(CONST);
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(125);
						ident();
						setState(126);
						match(COMMA);
						}
						} 
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(133);
				ident();
				setState(134);
				match(COLON);
				setState(135);
				typeid();
				setState(136);
				proverifOptionsFun();
				setState(137);
				match(POINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(FUN);
				setState(140);
				ident();
				setState(141);
				match(LEFTPARENTHESIS);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(142);
							typeid();
							setState(143);
							match(COMMA);
							}
							} 
						}
						setState(149);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					}
					setState(150);
					typeid();
					}
				}

				setState(153);
				match(RIGHTPARENTHESIS);
				setState(154);
				match(COLON);
				setState(155);
				typeid();
				setState(156);
				proverifOptionsFun();
				setState(157);
				match(POINT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(LETFUN);
				setState(160);
				ident();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(161);
					match(LEFTPARENTHESIS);
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(162);
						typedecl();
						}
					}

					setState(165);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(168);
				match(EQUAL);
				setState(169);
				pterm();
				setState(170);
				match(POINT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(REDUC);
				setState(173);
				reduc();
				setState(174);
				proverifOptionsFree();
				setState(175);
				match(POINT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(177);
				match(FUN);
				setState(178);
				ident();
				setState(179);
				match(LEFTPARENTHESIS);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(180);
							typeid();
							setState(181);
							match(COMMA);
							}
							} 
						}
						setState(187);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					setState(188);
					typeid();
					}
				}

				setState(191);
				match(RIGHTPARENTHESIS);
				setState(192);
				match(COLON);
				setState(193);
				typeid();
				setState(194);
				match(REDUC);
				setState(195);
				reducprime();
				setState(196);
				proverifOptionsFun();
				setState(197);
				match(POINT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				match(EQUATION);
				setState(200);
				eqlist();
				setState(201);
				proverifOptions();
				setState(202);
				match(POINT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(204);
				match(PRED);
				setState(205);
				ident();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(206);
					match(LEFTPARENTHESIS);
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CHANNEL || _la==ID) {
						{
						setState(212);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(207);
								typeid();
								setState(208);
								match(COMMA);
								}
								} 
							}
							setState(214);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						}
						setState(215);
						typeid();
						}
					}

					setState(218);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(221);
				proverifOptionsPred();
				setState(222);
				match(POINT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(224);
				match(TABLE);
				setState(225);
				ident();
				setState(226);
				match(LEFTPARENTHESIS);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(227);
							typeid();
							setState(228);
							match(COMMA);
							}
							} 
						}
						setState(234);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					setState(235);
					typeid();
					}
				}

				setState(238);
				match(RIGHTPARENTHESIS);
				setState(239);
				match(POINT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(241);
				match(LET);
				setState(242);
				ident();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(243);
					match(LEFTPARENTHESIS);
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(244);
						typedecl();
						}
					}

					setState(247);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(250);
				match(EQUAL);
				setState(251);
				process();
				setState(252);
				match(POINT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(254);
				match(SET);
				setState(255);
				name();
				setState(256);
				match(EQUAL);
				setState(257);
				value();
				setState(258);
				match(POINT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(260);
				match(EVENT);
				setState(261);
				ident();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(262);
					match(LEFTPARENTHESIS);
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CHANNEL || _la==ID) {
						{
						setState(268);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(263);
								typeid();
								setState(264);
								match(COMMA);
								}
								} 
							}
							setState(270);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						}
						setState(271);
						typeid();
						}
					}

					setState(274);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(277);
				match(POINT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(279);
				match(QUERY);
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(280);
					typedecl();
					setState(281);
					match(SEMICOLON);
					}
					break;
				}
				setState(285);
				query();
				setState(286);
				match(POINT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(288);
				match(NONINTERF);
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(289);
					typedecl();
					setState(290);
					match(SEMICOLON);
					}
					break;
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(294);
							nidecl();
							setState(295);
							match(COMMA);
							}
							} 
						}
						setState(301);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(302);
					nidecl();
					}
				}

				setState(305);
				match(POINT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(306);
				match(WEAKSECRET);
				setState(307);
				ident();
				setState(308);
				match(POINT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(310);
				match(NOT);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(311);
					typedecl();
					setState(312);
					match(SEMICOLON);
					}
					break;
				}
				setState(316);
				gterm();
				setState(317);
				match(POINT);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(319);
				match(NOUNIF);
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(320);
					typedecl();
					setState(321);
					match(SEMICOLON);
					}
					break;
				}
				setState(325);
				nounifdecl();
				setState(326);
				match(POINT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(328);
				match(ELIMTRUE);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(329);
					failtypedecl();
					setState(330);
					match(SEMICOLON);
					}
					break;
				}
				setState(334);
				term();
				setState(335);
				match(POINT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(337);
				match(CLAUSES);
				setState(338);
				clauses();
				setState(339);
				match(POINT);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(341);
				match(PARAM);
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(342);
						ident();
						setState(343);
						match(COMMA);
						}
						} 
					}
					setState(349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(350);
				ident();
				setState(351);
				proverifOptions();
				setState(352);
				match(POINT);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(354);
				match(PROBA);
				setState(355);
				ident();
				setState(356);
				match(POINT);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(358);
				match(DEF);
				setState(359);
				ident();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(365);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(360);
							typeid();
							setState(361);
							match(COMMA);
							}
							} 
						}
						setState(367);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					}
					setState(368);
					typeid();
					}
				}

				setState(371);
				match(CURLYBRACKETLEFT);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (WEAKSECRET - 28)) | (1L << (ELIMTRUE - 28)) | (1L << (CLAUSES - 28)) | (1L << (PARAM - 28)) | (1L << (PROBA - 28)) | (1L << (DEF - 28)) | (1L << (EXPAND - 28)) | (1L << (CHANNEL - 28)) | (1L << (FREE - 28)) | (1L << (REDUC - 28)) | (1L << (FUN - 28)) | (1L << (CONST - 28)) | (1L << (EQUATION - 28)) | (1L << (TABLE - 28)) | (1L << (PRED - 28)) | (1L << (LET - 28)) | (1L << (SET - 28)) | (1L << (EVENT - 28)) | (1L << (QUERY - 28)) | (1L << (NOT - 28)) | (1L << (NOUNIF - 28)) | (1L << (TYPE - 28)) | (1L << (LETFUN - 28)) | (1L << (NONINTERF - 28)))) != 0)) {
					{
					{
					setState(372);
					declaration();
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(CURLYBRACKETRIGHT);
				setState(379);
				match(POINT);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(381);
				match(EXPAND);
				setState(382);
				ident();
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(383);
							typeid();
							setState(384);
							match(COMMA);
							}
							} 
						}
						setState(390);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					}
					setState(391);
					typeid();
					}
				}

				setState(394);
				match(POINT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NideclContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode AMONG() { return getToken(ProverifParser.AMONG, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public NideclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nidecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterNidecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitNidecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitNidecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NideclContext nidecl() throws RecognitionException {
		NideclContext _localctx = new NideclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nidecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			ident();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AMONG) {
				{
				setState(399);
				match(AMONG);
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(400);
						term();
						setState(401);
						match(COMMA);
						}
						} 
					}
					setState(407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(408);
				term();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReducContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public TerminalNode FORALL() { return getToken(ProverifParser.FORALL, 0); }
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ProverifParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ProverifParser.SEMICOLON, i);
		}
		public ReducContext reduc() {
			return getRuleContext(ReducContext.class,0);
		}
		public ReducContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterReduc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitReduc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitReduc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducContext reduc() throws RecognitionException {
		ReducContext _localctx = new ReducContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reduc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(411);
				match(FORALL);
				setState(412);
				typedecl();
				setState(413);
				match(SEMICOLON);
				}
			}

			setState(417);
			term();
			setState(418);
			match(EQUAL);
			setState(419);
			term();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(420);
				match(SEMICOLON);
				setState(421);
				reduc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReducprimeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode FORALL() { return getToken(ProverifParser.FORALL, 0); }
		public FailtypedeclContext failtypedecl() {
			return getRuleContext(FailtypedeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ProverifParser.SEMICOLON, 0); }
		public List<MayfailtermContext> mayfailterm() {
			return getRuleContexts(MayfailtermContext.class);
		}
		public MayfailtermContext mayfailterm(int i) {
			return getRuleContext(MayfailtermContext.class,i);
		}
		public TerminalNode OTHERWISE() { return getToken(ProverifParser.OTHERWISE, 0); }
		public ReducprimeContext reducprime() {
			return getRuleContext(ReducprimeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public ReducprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reducprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterReducprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitReducprime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitReducprime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducprimeContext reducprime() throws RecognitionException {
		ReducprimeContext _localctx = new ReducprimeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reducprime);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(424);
				match(FORALL);
				setState(425);
				failtypedecl();
				setState(426);
				match(SEMICOLON);
				}
			}

			setState(430);
			ident();
			setState(431);
			match(LEFTPARENTHESIS);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPARENTHESIS || _la==NOT || _la==FAIL || _la==ID) {
				{
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(432);
						mayfailterm();
						setState(433);
						match(COMMA);
						}
						} 
					}
					setState(439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(440);
				mayfailterm();
				}
			}

			setState(443);
			match(RIGHTPARENTHESIS);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(444);
				match(OTHERWISE);
				setState(445);
				reducprime();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqlistContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public TerminalNode FORALL() { return getToken(ProverifParser.FORALL, 0); }
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ProverifParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ProverifParser.SEMICOLON, i);
		}
		public EqlistContext eqlist() {
			return getRuleContext(EqlistContext.class,0);
		}
		public EqlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterEqlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitEqlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitEqlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqlistContext eqlist() throws RecognitionException {
		EqlistContext _localctx = new EqlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eqlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(448);
			match(FORALL);
			setState(449);
			typedecl();
			setState(450);
			match(SEMICOLON);
			}
			setState(452);
			term();
			setState(453);
			match(EQUAL);
			setState(454);
			term();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(455);
				match(SEMICOLON);
				setState(456);
				eqlist();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public GtermContext gterm() {
			return getRuleContext(GtermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ProverifParser.SEMICOLON, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode PUTBEGIN() { return getToken(ProverifParser.PUTBEGIN, 0); }
		public TerminalNode EVENT() { return getToken(ProverifParser.EVENT, 0); }
		public TerminalNode COLON() { return getToken(ProverifParser.COLON, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public TerminalNode INJEVENT() { return getToken(ProverifParser.INJEVENT, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_query);
		int _la;
		try {
			int _alt;
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				gterm();
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(464);
					match(SEMICOLON);
					setState(465);
					query();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(PUTBEGIN);
				setState(469);
				match(EVENT);
				setState(470);
				match(COLON);
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471);
						ident();
						setState(472);
						match(COMMA);
						}
						} 
					}
					setState(478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(479);
				ident();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(480);
					match(SEMICOLON);
					setState(481);
					query();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(PUTBEGIN);
				setState(485);
				match(INJEVENT);
				setState(486);
				match(COLON);
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						ident();
						setState(488);
						match(COMMA);
						}
						} 
					}
					setState(494);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(495);
				ident();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(496);
					match(SEMICOLON);
					setState(497);
					query();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GtermContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode EVENT() { return getToken(ProverifParser.EVENT, 0); }
		public TerminalNode INJEVENT() { return getToken(ProverifParser.INJEVENT, 0); }
		public GtermSequenceContext gtermSequence() {
			return getRuleContext(GtermSequenceContext.class,0);
		}
		public TerminalNode NEW() { return getToken(ProverifParser.NEW, 0); }
		public TerminalNode LET() { return getToken(ProverifParser.LET, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(ProverifParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ProverifParser.EQUAL, i);
		}
		public List<GtermContext> gterm() {
			return getRuleContexts(GtermContext.class);
		}
		public GtermContext gterm(int i) {
			return getRuleContext(GtermContext.class,i);
		}
		public TerminalNode IN() { return getToken(ProverifParser.IN, 0); }
		public List<TerminalNode> DIFF() { return getTokens(ProverifParser.DIFF); }
		public TerminalNode DIFF(int i) {
			return getToken(ProverifParser.DIFF, i);
		}
		public List<TerminalNode> OR() { return getTokens(ProverifParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ProverifParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(ProverifParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ProverifParser.AND, i);
		}
		public List<TerminalNode> IMPLICATES() { return getTokens(ProverifParser.IMPLICATES); }
		public TerminalNode IMPLICATES(int i) {
			return getToken(ProverifParser.IMPLICATES, i);
		}
		public TerminalNode PHASE() { return getToken(ProverifParser.PHASE, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ProverifParser.RIGHTBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public GbindingContext gbinding() {
			return getRuleContext(GbindingContext.class,0);
		}
		public GtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterGterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitGterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitGterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtermContext gterm() throws RecognitionException {
		GtermContext _localctx = new GtermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_gterm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(502);
				ident();
				}
				break;
			case 2:
				{
				setState(503);
				ident();
				setState(504);
				match(LEFTPARENTHESIS);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW))) != 0) || _la==ID) {
					{
					setState(510);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(505);
							gterm();
							setState(506);
							match(COMMA);
							}
							} 
						}
						setState(512);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
					}
					setState(513);
					gterm();
					}
				}

				setState(516);
				match(RIGHTPARENTHESIS);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PHASE) {
					{
					setState(517);
					match(PHASE);
					setState(518);
					integer();
					}
				}

				}
				break;
			case 3:
				{
				setState(521);
				match(EVENT);
				setState(522);
				match(LEFTPARENTHESIS);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW))) != 0) || _la==ID) {
					{
					setState(528);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(523);
							gterm();
							setState(524);
							match(COMMA);
							}
							} 
						}
						setState(530);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					}
					setState(531);
					gterm();
					}
				}

				setState(534);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				{
				setState(535);
				match(INJEVENT);
				setState(536);
				match(LEFTPARENTHESIS);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW))) != 0) || _la==ID) {
					{
					setState(542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(537);
							gterm();
							setState(538);
							match(COMMA);
							}
							} 
						}
						setState(544);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					}
					setState(545);
					gterm();
					}
				}

				setState(548);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				{
				setState(549);
				gtermSequence();
				}
				break;
			case 6:
				{
				setState(550);
				match(NEW);
				setState(551);
				ident();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(552);
					match(LEFTBRACKET);
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXCLAMATION || _la==ID) {
						{
						setState(553);
						gbinding();
						}
					}

					setState(556);
					match(RIGHTBRACKET);
					}
				}

				}
				break;
			case 7:
				{
				setState(559);
				match(LET);
				setState(560);
				ident();
				setState(561);
				match(EQUAL);
				setState(562);
				gterm();
				setState(563);
				match(IN);
				setState(564);
				gterm();
				}
				break;
			}
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(578);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(568);
						match(EQUAL);
						setState(569);
						gterm();
						}
						break;
					case DIFF:
						{
						setState(570);
						match(DIFF);
						setState(571);
						gterm();
						}
						break;
					case OR:
						{
						setState(572);
						match(OR);
						setState(573);
						gterm();
						}
						break;
					case AND:
						{
						setState(574);
						match(AND);
						setState(575);
						gterm();
						}
						break;
					case IMPLICATES:
						{
						setState(576);
						match(IMPLICATES);
						setState(577);
						gterm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GtermSequenceContext extends ParserRuleContext {
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public List<GtermContext> gterm() {
			return getRuleContexts(GtermContext.class);
		}
		public GtermContext gterm(int i) {
			return getRuleContext(GtermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public GtermSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtermSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterGtermSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitGtermSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitGtermSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtermSequenceContext gtermSequence() throws RecognitionException {
		GtermSequenceContext _localctx = new GtermSequenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_gtermSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(LEFTPARENTHESIS);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW))) != 0) || _la==ID) {
				{
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(584);
						gterm();
						setState(585);
						match(COMMA);
						}
						} 
					}
					setState(591);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(592);
				gterm();
				}
			}

			setState(595);
			match(RIGHTPARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GbindingContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(ProverifParser.EXCLAMATION, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public GtermContext gterm() {
			return getRuleContext(GtermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ProverifParser.SEMICOLON, 0); }
		public GbindingContext gbinding() {
			return getRuleContext(GbindingContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public GbindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gbinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterGbinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitGbinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitGbinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GbindingContext gbinding() throws RecognitionException {
		GbindingContext _localctx = new GbindingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_gbinding);
		int _la;
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(EXCLAMATION);
				setState(598);
				integer();
				setState(599);
				match(EQUAL);
				setState(600);
				gterm();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(601);
					match(SEMICOLON);
					setState(602);
					gbinding();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				ident();
				setState(606);
				match(EQUAL);
				setState(607);
				gterm();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(608);
					match(SEMICOLON);
					setState(609);
					gbinding();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NounifdeclContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ProverifParser.LET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public List<GformatContext> gformat() {
			return getRuleContexts(GformatContext.class);
		}
		public GformatContext gformat(int i) {
			return getRuleContext(GformatContext.class,i);
		}
		public TerminalNode IN() { return getToken(ProverifParser.IN, 0); }
		public NounifdeclContext nounifdecl() {
			return getRuleContext(NounifdeclContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode SLASH() { return getToken(ProverifParser.SLASH, 0); }
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode PHASE() { return getToken(ProverifParser.PHASE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public NounifdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounifdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterNounifdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitNounifdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitNounifdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounifdeclContext nounifdecl() throws RecognitionException {
		NounifdeclContext _localctx = new NounifdeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nounifdecl);
		int _la;
		try {
			int _alt;
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(LET);
				setState(615);
				ident();
				setState(616);
				match(EQUAL);
				setState(617);
				gformat();
				setState(618);
				match(IN);
				setState(619);
				nounifdecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				ident();
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(622);
					match(LEFTPARENTHESIS);
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW))) != 0) || _la==ID) {
						{
						setState(628);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(623);
								gformat();
								setState(624);
								match(COMMA);
								}
								} 
							}
							setState(630);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						}
						setState(631);
						gformat();
						}
					}

					setState(634);
					match(RIGHTPARENTHESIS);
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PHASE) {
						{
						setState(635);
						match(PHASE);
						setState(636);
						integer();
						}
					}

					}
				}

				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(641);
					match(SLASH);
					setState(642);
					integer();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GformatContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public List<GformatContext> gformat() {
			return getRuleContexts(GformatContext.class);
		}
		public GformatContext gformat(int i) {
			return getRuleContext(GformatContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public TerminalNode NOT() { return getToken(ProverifParser.NOT, 0); }
		public TerminalNode NEW() { return getToken(ProverifParser.NEW, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ProverifParser.RIGHTBRACKET, 0); }
		public FbindingContext fbinding() {
			return getRuleContext(FbindingContext.class,0);
		}
		public TerminalNode LET() { return getToken(ProverifParser.LET, 0); }
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public TerminalNode IN() { return getToken(ProverifParser.IN, 0); }
		public GformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gformat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterGformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitGformat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitGformat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GformatContext gformat() throws RecognitionException {
		GformatContext _localctx = new GformatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_gformat);
		int _la;
		try {
			int _alt;
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				ident();
				setState(649);
				match(LEFTPARENTHESIS);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW))) != 0) || _la==ID) {
					{
					setState(655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(650);
							gformat();
							setState(651);
							match(COMMA);
							}
							} 
						}
						setState(657);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					}
					setState(658);
					gformat();
					}
				}

				setState(661);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				match(NOT);
				setState(664);
				match(LEFTPARENTHESIS);
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW))) != 0) || _la==ID) {
					{
					setState(670);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(665);
							gformat();
							setState(666);
							match(COMMA);
							}
							} 
						}
						setState(672);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					}
					setState(673);
					gformat();
					}
				}

				setState(676);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(677);
				match(LEFTPARENTHESIS);
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(678);
							gformat();
							setState(679);
							match(COMMA);
							}
							} 
						}
						setState(685);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
					}
					setState(686);
					gformat();
					}
					break;
				}
				setState(689);
				gformat();
				setState(690);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(692);
				match(NEW);
				setState(693);
				ident();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(694);
					match(LEFTBRACKET);
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXCLAMATION || _la==ID) {
						{
						setState(695);
						fbinding();
						}
					}

					setState(698);
					match(RIGHTBRACKET);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(701);
				match(LET);
				setState(702);
				ident();
				setState(703);
				match(EQUAL);
				setState(704);
				gformat();
				setState(705);
				match(IN);
				setState(706);
				gformat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FbindingContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(ProverifParser.EXCLAMATION, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public GformatContext gformat() {
			return getRuleContext(GformatContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ProverifParser.SEMICOLON, 0); }
		public FbindingContext fbinding() {
			return getRuleContext(FbindingContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FbindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fbinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterFbinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitFbinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitFbinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FbindingContext fbinding() throws RecognitionException {
		FbindingContext _localctx = new FbindingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fbinding);
		int _la;
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(EXCLAMATION);
				setState(711);
				integer();
				setState(712);
				match(EQUAL);
				setState(713);
				gformat();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(714);
					match(SEMICOLON);
					setState(715);
					fbinding();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				ident();
				setState(719);
				match(EQUAL);
				setState(720);
				gformat();
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(721);
					match(SEMICOLON);
					setState(722);
					fbinding();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClausesContext extends ParserRuleContext {
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public TerminalNode FORALL() { return getToken(ProverifParser.FORALL, 0); }
		public FailtypedeclContext failtypedecl() {
			return getRuleContext(FailtypedeclContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ProverifParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ProverifParser.SEMICOLON, i);
		}
		public ClausesContext clauses() {
			return getRuleContext(ClausesContext.class,0);
		}
		public ClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(727);
				match(FORALL);
				setState(728);
				failtypedecl();
				setState(729);
				match(SEMICOLON);
				}
			}

			setState(733);
			clause();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(734);
				match(SEMICOLON);
				setState(735);
				clauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(ProverifParser.ARROW, 0); }
		public TerminalNode DOUBLEARROW() { return getToken(ProverifParser.DOUBLEARROW, 0); }
		public TerminalNode EQUIVALENT() { return getToken(ProverifParser.EQUIVALENT, 0); }
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_clause);
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				term();
				setState(740);
				match(ARROW);
				setState(741);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				term();
				setState(744);
				match(DOUBLEARROW);
				setState(745);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				term();
				setState(748);
				match(EQUIVALENT);
				setState(749);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(ProverifParser.ZERO, 0); }
		public TerminalNode YIELD() { return getToken(ProverifParser.YIELD, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(ProverifParser.EXCLAMATION, 0); }
		public TerminalNode REVERSEIMPLICATES() { return getToken(ProverifParser.REVERSEIMPLICATES, 0); }
		public TerminalNode FOREACH() { return getToken(ProverifParser.FOREACH, 0); }
		public TerminalNode DO() { return getToken(ProverifParser.DO, 0); }
		public TerminalNode NEW() { return getToken(ProverifParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(ProverifParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode REVERSEARROWR() { return getToken(ProverifParser.REVERSEARROWR, 0); }
		public TerminalNode IF() { return getToken(ProverifParser.IF, 0); }
		public List<PtermContext> pterm() {
			return getRuleContexts(PtermContext.class);
		}
		public PtermContext pterm(int i) {
			return getRuleContext(PtermContext.class,i);
		}
		public TerminalNode THEN() { return getToken(ProverifParser.THEN, 0); }
		public TerminalNode IN() { return getToken(ProverifParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TerminalNode OUT() { return getToken(ProverifParser.OUT, 0); }
		public TerminalNode LET() { return getToken(ProverifParser.LET, 0); }
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public TerminalNode REVERSEARROW() { return getToken(ProverifParser.REVERSEARROW, 0); }
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ProverifParser.SUCHTHAT, 0); }
		public TerminalNode INSERT() { return getToken(ProverifParser.INSERT, 0); }
		public TerminalNode GET() { return getToken(ProverifParser.GET, 0); }
		public TerminalNode EVENT() { return getToken(ProverifParser.EVENT, 0); }
		public TerminalNode PHASE() { return getToken(ProverifParser.PHASE, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public List<TerminalNode> PIPE() { return getTokens(ProverifParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(ProverifParser.PIPE, i);
		}
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ProverifParser.RIGHTBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProverifParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(ProverifParser.ELSE, 0); }
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_process);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(753);
				match(ZERO);
				}
				break;
			case 2:
				{
				setState(754);
				match(YIELD);
				}
				break;
			case 3:
				{
				setState(755);
				ident();
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(756);
					match(LEFTPARENTHESIS);
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GET - 65)) | (1L << (CHOICE - 65)) | (1L << (ID - 65)))) != 0)) {
						{
						setState(762);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(757);
								pterm();
								setState(758);
								match(COMMA);
								}
								} 
							}
							setState(764);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						}
						setState(765);
						pterm();
						}
					}

					setState(768);
					match(RIGHTPARENTHESIS);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(771);
				match(LEFTPARENTHESIS);
				setState(772);
				process();
				setState(773);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				{
				setState(775);
				match(EXCLAMATION);
				setState(776);
				process();
				}
				break;
			case 6:
				{
				setState(777);
				match(EXCLAMATION);
				setState(778);
				ident();
				setState(779);
				match(REVERSEIMPLICATES);
				setState(780);
				ident();
				setState(781);
				process();
				}
				break;
			case 7:
				{
				setState(783);
				match(FOREACH);
				setState(784);
				ident();
				setState(785);
				match(REVERSEIMPLICATES);
				setState(786);
				ident();
				setState(787);
				match(DO);
				setState(788);
				process();
				}
				break;
			case 8:
				{
				setState(790);
				match(NEW);
				setState(791);
				ident();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(792);
					match(LEFTBRACKET);
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(798);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(793);
								ident();
								setState(794);
								match(COMMA);
								}
								} 
							}
							setState(800);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
						}
						setState(801);
						ident();
						}
					}

					setState(804);
					match(RIGHTBRACKET);
					}
				}

				setState(807);
				match(COLON);
				setState(808);
				typeid();
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(809);
					match(SEMICOLON);
					setState(810);
					process();
					}
				}

				}
				break;
			case 9:
				{
				setState(813);
				ident();
				setState(814);
				match(REVERSEARROWR);
				setState(815);
				typeid();
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(816);
					match(SEMICOLON);
					setState(817);
					process();
					}
				}

				}
				break;
			case 10:
				{
				setState(820);
				match(IF);
				setState(821);
				pterm();
				setState(822);
				match(THEN);
				setState(823);
				process();
				setState(826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(824);
					match(ELSE);
					setState(825);
					process();
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(828);
				match(IN);
				setState(829);
				match(LEFTPARENTHESIS);
				setState(830);
				pterm();
				setState(831);
				match(COMMA);
				setState(832);
				pattern();
				setState(833);
				match(RIGHTPARENTHESIS);
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(834);
					match(SEMICOLON);
					setState(835);
					process();
					}
				}

				}
				break;
			case 12:
				{
				setState(838);
				match(OUT);
				setState(839);
				match(LEFTPARENTHESIS);
				setState(840);
				pterm();
				setState(841);
				match(COMMA);
				setState(842);
				pterm();
				setState(843);
				match(RIGHTPARENTHESIS);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(844);
					match(SEMICOLON);
					setState(845);
					process();
					}
				}

				}
				break;
			case 13:
				{
				setState(848);
				match(LET);
				setState(849);
				pattern();
				setState(850);
				match(EQUAL);
				setState(851);
				pterm();
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(852);
					match(IN);
					setState(853);
					process();
					setState(856);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(854);
						match(ELSE);
						setState(855);
						process();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(860);
				ident();
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(861);
					match(COLON);
					setState(862);
					typeid();
					}
				}

				setState(865);
				match(REVERSEARROW);
				setState(866);
				pterm();
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(867);
					match(SEMICOLON);
					setState(868);
					process();
					}
				}

				}
				break;
			case 15:
				{
				setState(871);
				match(LET);
				setState(872);
				typedecl();
				setState(873);
				match(SUCHTHAT);
				setState(874);
				pterm();
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(875);
					match(IN);
					setState(876);
					process();
					setState(879);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						setState(877);
						match(ELSE);
						setState(878);
						process();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 16:
				{
				setState(883);
				match(INSERT);
				setState(884);
				ident();
				setState(885);
				match(LEFTPARENTHESIS);
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GET - 65)) | (1L << (CHOICE - 65)) | (1L << (ID - 65)))) != 0)) {
					{
					setState(891);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(886);
							pterm();
							setState(887);
							match(COMMA);
							}
							} 
						}
						setState(893);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					setState(894);
					pterm();
					}
				}

				setState(897);
				match(RIGHTPARENTHESIS);
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(898);
					match(SEMICOLON);
					setState(899);
					process();
					}
				}

				}
				break;
			case 17:
				{
				setState(902);
				match(GET);
				setState(903);
				ident();
				setState(904);
				match(LEFTPARENTHESIS);
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS || _la==EQUAL || _la==ID) {
					{
					setState(910);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(905);
							pattern();
							setState(906);
							match(COMMA);
							}
							} 
						}
						setState(912);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
					}
					setState(913);
					pattern();
					}
				}

				setState(916);
				match(RIGHTPARENTHESIS);
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUCHTHAT) {
					{
					setState(917);
					match(SUCHTHAT);
					setState(918);
					pterm();
					}
				}

				setState(927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(921);
					match(IN);
					setState(922);
					process();
					setState(925);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(923);
						match(ELSE);
						setState(924);
						process();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 18:
				{
				setState(929);
				match(EVENT);
				setState(930);
				ident();
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(931);
					match(LEFTPARENTHESIS);
					setState(941);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GET - 65)) | (1L << (CHOICE - 65)) | (1L << (ID - 65)))) != 0)) {
						{
						setState(937);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(932);
								pterm();
								setState(933);
								match(COMMA);
								}
								} 
							}
							setState(939);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
						}
						setState(940);
						pterm();
						}
					}

					setState(943);
					match(RIGHTPARENTHESIS);
					}
					break;
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(946);
					match(SEMICOLON);
					setState(947);
					process();
					}
				}

				}
				break;
			case 19:
				{
				setState(950);
				match(PHASE);
				setState(951);
				integer();
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(952);
					match(SEMICOLON);
					setState(953);
					process();
					}
				}

				}
				break;
			}
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(958);
					match(PIPE);
					setState(959);
					process();
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtermContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public PtermSequenceContext ptermSequence() {
			return getRuleContext(PtermSequenceContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode CHOICE() { return getToken(ProverifParser.CHOICE, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public List<PtermContext> pterm() {
			return getRuleContexts(PtermContext.class);
		}
		public PtermContext pterm(int i) {
			return getRuleContext(PtermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(ProverifParser.RIGHTBRACKET, 0); }
		public TerminalNode NOT() { return getToken(ProverifParser.NOT, 0); }
		public TerminalNode NEW() { return getToken(ProverifParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(ProverifParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ProverifParser.SEMICOLON, 0); }
		public TerminalNode REVERSEARROWR() { return getToken(ProverifParser.REVERSEARROWR, 0); }
		public TerminalNode IF() { return getToken(ProverifParser.IF, 0); }
		public TerminalNode THEN() { return getToken(ProverifParser.THEN, 0); }
		public TerminalNode LET() { return getToken(ProverifParser.LET, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TerminalNode REVERSEARROW() { return getToken(ProverifParser.REVERSEARROW, 0); }
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ProverifParser.SUCHTHAT, 0); }
		public TerminalNode IN() { return getToken(ProverifParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(ProverifParser.INSERT, 0); }
		public TerminalNode GET() { return getToken(ProverifParser.GET, 0); }
		public TerminalNode EVENT() { return getToken(ProverifParser.EVENT, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(ProverifParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ProverifParser.EQUAL, i);
		}
		public List<TerminalNode> DIFF() { return getTokens(ProverifParser.DIFF); }
		public TerminalNode DIFF(int i) {
			return getToken(ProverifParser.DIFF, i);
		}
		public List<TerminalNode> AND() { return getTokens(ProverifParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ProverifParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ProverifParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ProverifParser.OR, i);
		}
		public List<GtermContext> gterm() {
			return getRuleContexts(GtermContext.class);
		}
		public GtermContext gterm(int i) {
			return getRuleContext(GtermContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ProverifParser.ELSE, 0); }
		public PtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterPterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitPterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitPterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtermContext pterm() throws RecognitionException {
		PtermContext _localctx = new PtermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pterm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(965);
				ident();
				}
				break;
			case 2:
				{
				setState(966);
				ptermSequence();
				}
				break;
			case 3:
				{
				setState(967);
				ident();
				setState(968);
				match(LEFTPARENTHESIS);
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW))) != 0) || _la==ID) {
					{
					setState(974);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(969);
							gterm();
							setState(970);
							match(COMMA);
							}
							} 
						}
						setState(976);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
					}
					setState(977);
					gterm();
					}
				}

				setState(980);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				{
				setState(982);
				match(CHOICE);
				setState(983);
				match(LEFTBRACKET);
				setState(984);
				pterm();
				setState(985);
				match(COMMA);
				setState(986);
				pterm();
				setState(987);
				match(RIGHTBRACKET);
				}
				break;
			case 5:
				{
				setState(989);
				match(NOT);
				setState(990);
				match(LEFTPARENTHESIS);
				setState(991);
				pterm();
				setState(992);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 6:
				{
				setState(994);
				match(NEW);
				setState(995);
				ident();
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(996);
					match(LEFTBRACKET);
					setState(1006);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(1002);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(997);
								ident();
								setState(998);
								match(COMMA);
								}
								} 
							}
							setState(1004);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
						}
						setState(1005);
						ident();
						}
					}

					setState(1008);
					match(RIGHTBRACKET);
					}
				}

				setState(1011);
				match(COLON);
				setState(1012);
				typeid();
				setState(1013);
				match(SEMICOLON);
				setState(1014);
				pterm();
				}
				break;
			case 7:
				{
				setState(1016);
				ident();
				setState(1017);
				match(REVERSEARROWR);
				setState(1018);
				typeid();
				setState(1019);
				match(SEMICOLON);
				setState(1020);
				pterm();
				}
				break;
			case 8:
				{
				setState(1022);
				match(IF);
				setState(1023);
				pterm();
				setState(1024);
				match(THEN);
				setState(1025);
				pterm();
				setState(1028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1026);
					match(ELSE);
					setState(1027);
					pterm();
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(1030);
				match(LET);
				setState(1031);
				pattern();
				}
				break;
			case 10:
				{
				setState(1032);
				ident();
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1033);
					match(COLON);
					setState(1034);
					typeid();
					}
				}

				setState(1037);
				match(REVERSEARROW);
				setState(1038);
				pterm();
				setState(1039);
				match(SEMICOLON);
				setState(1040);
				pterm();
				}
				break;
			case 11:
				{
				setState(1042);
				match(LET);
				setState(1043);
				typedecl();
				setState(1044);
				match(SUCHTHAT);
				setState(1045);
				pterm();
				setState(1046);
				match(IN);
				setState(1047);
				pterm();
				setState(1050);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1048);
					match(ELSE);
					setState(1049);
					pterm();
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(1052);
				match(INSERT);
				setState(1053);
				ident();
				setState(1054);
				match(LEFTPARENTHESIS);
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GET - 65)) | (1L << (CHOICE - 65)) | (1L << (ID - 65)))) != 0)) {
					{
					setState(1060);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1055);
							pterm();
							setState(1056);
							match(COMMA);
							}
							} 
						}
						setState(1062);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(1063);
					pterm();
					}
				}

				setState(1066);
				match(RIGHTPARENTHESIS);
				setState(1067);
				match(SEMICOLON);
				setState(1068);
				pterm();
				}
				break;
			case 13:
				{
				setState(1070);
				match(GET);
				setState(1071);
				ident();
				setState(1072);
				match(LEFTPARENTHESIS);
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS || _la==EQUAL || _la==ID) {
					{
					setState(1078);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1073);
							pattern();
							setState(1074);
							match(COMMA);
							}
							} 
						}
						setState(1080);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
					}
					setState(1081);
					pattern();
					}
				}

				setState(1084);
				match(RIGHTPARENTHESIS);
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUCHTHAT) {
					{
					setState(1085);
					match(SUCHTHAT);
					setState(1086);
					pterm();
					}
				}

				setState(1089);
				match(IN);
				setState(1090);
				pterm();
				setState(1093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1091);
					match(ELSE);
					setState(1092);
					pterm();
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(1095);
				match(EVENT);
				setState(1096);
				ident();
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(1097);
					match(LEFTPARENTHESIS);
					setState(1107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GET - 65)) | (1L << (CHOICE - 65)) | (1L << (ID - 65)))) != 0)) {
						{
						setState(1103);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1098);
								pterm();
								setState(1099);
								match(COMMA);
								}
								} 
							}
							setState(1105);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
						}
						setState(1106);
						pterm();
						}
					}

					setState(1109);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(1112);
				match(SEMICOLON);
				setState(1113);
				pterm();
				}
				break;
			}
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1125);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(1117);
						match(EQUAL);
						setState(1118);
						pterm();
						}
						break;
					case DIFF:
						{
						setState(1119);
						match(DIFF);
						setState(1120);
						pterm();
						}
						break;
					case AND:
						{
						setState(1121);
						match(AND);
						setState(1122);
						pterm();
						}
						break;
					case OR:
						{
						setState(1123);
						match(OR);
						setState(1124);
						pterm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtermSequenceContext extends ParserRuleContext {
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public List<PtermContext> pterm() {
			return getRuleContexts(PtermContext.class);
		}
		public PtermContext pterm(int i) {
			return getRuleContext(PtermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public PtermSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptermSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterPtermSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitPtermSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitPtermSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtermSequenceContext ptermSequence() throws RecognitionException {
		PtermSequenceContext _localctx = new PtermSequenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ptermSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(LEFTPARENTHESIS);
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GET - 65)) | (1L << (CHOICE - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				setState(1136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1131);
						pterm();
						setState(1132);
						match(COMMA);
						}
						} 
					}
					setState(1138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				setState(1139);
				pterm();
				}
			}

			setState(1142);
			match(RIGHTPARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode NOT() { return getToken(ProverifParser.NOT, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ProverifParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ProverifParser.EQUAL, i);
		}
		public List<TerminalNode> DIFF() { return getTokens(ProverifParser.DIFF); }
		public TerminalNode DIFF(int i) {
			return getToken(ProverifParser.DIFF, i);
		}
		public List<TerminalNode> AND() { return getTokens(ProverifParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ProverifParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ProverifParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ProverifParser.OR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1144);
				ident();
				}
				break;
			case 2:
				{
				setState(1145);
				match(LEFTPARENTHESIS);
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS || _la==NOT || _la==ID) {
					{
					setState(1151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1146);
							term();
							setState(1147);
							match(COMMA);
							}
							} 
						}
						setState(1153);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
					}
					setState(1154);
					term();
					}
				}

				setState(1157);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 3:
				{
				setState(1158);
				ident();
				setState(1159);
				match(LEFTPARENTHESIS);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS || _la==NOT || _la==ID) {
					{
					setState(1165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1160);
							term();
							setState(1161);
							match(COMMA);
							}
							} 
						}
						setState(1167);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
					}
					setState(1168);
					term();
					}
				}

				setState(1171);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				{
				setState(1173);
				match(NOT);
				setState(1174);
				match(LEFTPARENTHESIS);
				setState(1175);
				term();
				setState(1176);
				match(RIGHTPARENTHESIS);
				}
				break;
			}
			setState(1190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1188);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(1180);
						match(EQUAL);
						setState(1181);
						term();
						}
						break;
					case DIFF:
						{
						setState(1182);
						match(DIFF);
						setState(1183);
						term();
						}
						break;
					case AND:
						{
						setState(1184);
						match(AND);
						setState(1185);
						term();
						}
						break;
					case OR:
						{
						setState(1186);
						match(OR);
						setState(1187);
						term();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ProverifParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public PatternSequenceContext patternSequence() {
			return getRuleContext(PatternSequenceContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public TerminalNode EQUAL() { return getToken(ProverifParser.EQUAL, 0); }
		public PtermContext pterm() {
			return getRuleContext(PtermContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pattern);
		int _la;
		try {
			int _alt;
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1194);
				ident();
				setState(1195);
				match(COLON);
				setState(1196);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1198);
				patternSequence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1199);
				ident();
				setState(1200);
				match(LEFTPARENTHESIS);
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS || _la==EQUAL || _la==ID) {
					{
					setState(1206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1201);
							pattern();
							setState(1202);
							match(COMMA);
							}
							} 
						}
						setState(1208);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
					}
					setState(1209);
					pattern();
					}
				}

				setState(1212);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1214);
				match(EQUAL);
				setState(1215);
				pterm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternSequenceContext extends ParserRuleContext {
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public PatternSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterPatternSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitPatternSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitPatternSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternSequenceContext patternSequence() throws RecognitionException {
		PatternSequenceContext _localctx = new PatternSequenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_patternSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(LEFTPARENTHESIS);
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPARENTHESIS || _la==EQUAL || _la==ID) {
				{
				setState(1225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1219);
						pattern();

						setState(1221);
						match(COMMA);
						}
						} 
					}
					setState(1227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1228);
				pattern();
				}
			}

			setState(1231);
			match(RIGHTPARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MayfailtermContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode FAIL() { return getToken(ProverifParser.FAIL, 0); }
		public MayfailtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayfailterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterMayfailterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitMayfailterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitMayfailterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayfailtermContext mayfailterm() throws RecognitionException {
		MayfailtermContext _localctx = new MayfailtermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mayfailterm);
		try {
			setState(1235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESIS:
			case NOT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				term();
				}
				break;
			case FAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				match(FAIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedeclContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ProverifParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ProverifParser.COMMA, 0); }
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public TypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterTypedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitTypedecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitTypedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedeclContext typedecl() throws RecognitionException {
		TypedeclContext _localctx = new TypedeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			ident();
			setState(1238);
			match(COLON);
			setState(1239);
			typeid();
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1240);
				match(COMMA);
				setState(1241);
				typedecl();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FailtypedeclContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ProverifParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode ORWORD() { return getToken(ProverifParser.ORWORD, 0); }
		public TerminalNode FAIL() { return getToken(ProverifParser.FAIL, 0); }
		public TerminalNode COMMA() { return getToken(ProverifParser.COMMA, 0); }
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public FailtypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failtypedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterFailtypedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitFailtypedecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitFailtypedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FailtypedeclContext failtypedecl() throws RecognitionException {
		FailtypedeclContext _localctx = new FailtypedeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_failtypedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			ident();
			setState(1245);
			match(COLON);
			setState(1246);
			typeid();
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORWORD) {
				{
				setState(1247);
				match(ORWORD);
				setState(1248);
				match(FAIL);
				}
			}

			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1251);
				match(COMMA);
				setState(1252);
				typedecl();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProverifOptionsFreeContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public TerminalNode PRIVATE() { return getToken(ProverifParser.PRIVATE, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ProverifParser.RIGHTBRACKET, 0); }
		public ProverifOptionsFreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proverifOptionsFree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterProverifOptionsFree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitProverifOptionsFree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitProverifOptionsFree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProverifOptionsFreeContext proverifOptionsFree() throws RecognitionException {
		ProverifOptionsFreeContext _localctx = new ProverifOptionsFreeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_proverifOptionsFree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(1255);
				match(LEFTBRACKET);
				setState(1256);
				match(PRIVATE);
				setState(1257);
				match(RIGHTBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProverifOptionsFunContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public List<OptionfunContext> optionfun() {
			return getRuleContexts(OptionfunContext.class);
		}
		public OptionfunContext optionfun(int i) {
			return getRuleContext(OptionfunContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(ProverifParser.RIGHTBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public ProverifOptionsFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proverifOptionsFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterProverifOptionsFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitProverifOptionsFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitProverifOptionsFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProverifOptionsFunContext proverifOptionsFun() throws RecognitionException {
		ProverifOptionsFunContext _localctx = new ProverifOptionsFunContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_proverifOptionsFun);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(1260);
				match(LEFTBRACKET);
				setState(1266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1261);
						optionfun();
						setState(1262);
						match(COMMA);
						}
						} 
					}
					setState(1268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1269);
				optionfun();
				setState(1270);
				match(RIGHTBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProverifOptionsPredContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public List<OptionpredContext> optionpred() {
			return getRuleContexts(OptionpredContext.class);
		}
		public OptionpredContext optionpred(int i) {
			return getRuleContext(OptionpredContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(ProverifParser.RIGHTBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public ProverifOptionsPredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proverifOptionsPred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterProverifOptionsPred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitProverifOptionsPred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitProverifOptionsPred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProverifOptionsPredContext proverifOptionsPred() throws RecognitionException {
		ProverifOptionsPredContext _localctx = new ProverifOptionsPredContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_proverifOptionsPred);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(1274);
				match(LEFTBRACKET);
				setState(1280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1275);
						optionpred();
						setState(1276);
						match(COMMA);
						}
						} 
					}
					setState(1282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1283);
				optionpred();
				setState(1284);
				match(RIGHTBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProverifOptionsContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(ProverifParser.RIGHTBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProverifParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProverifParser.COMMA, i);
		}
		public ProverifOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proverifOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterProverifOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitProverifOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitProverifOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProverifOptionsContext proverifOptions() throws RecognitionException {
		ProverifOptionsContext _localctx = new ProverifOptionsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_proverifOptions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(1288);
				match(LEFTBRACKET);
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1289);
						ident();
						setState(1290);
						match(COMMA);
						}
						} 
					}
					setState(1296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				setState(1297);
				ident();
				setState(1298);
				match(RIGHTBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionfunContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(ProverifParser.DATA, 0); }
		public TerminalNode PRIVATE() { return getToken(ProverifParser.PRIVATE, 0); }
		public TerminalNode TYPECONVERTER() { return getToken(ProverifParser.TYPECONVERTER, 0); }
		public OptionfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterOptionfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitOptionfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitOptionfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionfunContext optionfun() throws RecognitionException {
		OptionfunContext _localctx = new OptionfunContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_optionfun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (DATA - 74)) | (1L << (PRIVATE - 74)) | (1L << (TYPECONVERTER - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionpredContext extends ParserRuleContext {
		public TerminalNode MEMBEROPTIM() { return getToken(ProverifParser.MEMBEROPTIM, 0); }
		public TerminalNode BLOCKOPTION() { return getToken(ProverifParser.BLOCKOPTION, 0); }
		public OptionpredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionpred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterOptionpred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitOptionpred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitOptionpred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionpredContext optionpred() throws RecognitionException {
		OptionpredContext _localctx = new OptionpredContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_optionpred);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			_la = _input.LA(1);
			if ( !(_la==MEMBEROPTIM || _la==BLOCKOPTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProverifParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProverifParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(ProverifParser.CHANNEL, 0); }
		public TerminalNode ID() { return getToken(ProverifParser.ID, 0); }
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProverifListener ) ((ProverifListener)listener).exitTypeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProverifVisitor ) return ((ProverifVisitor<? extends T>)visitor).visitTypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_la = _input.LA(1);
			if ( !(_la==CHANNEL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u0525\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\2"+
		"\7\2T\n\2\f\2\16\2W\13\2\3\2\3\2\3\2\3\2\5\2]\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3t\n\3\f\3\16\3w\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0083"+
		"\n\3\f\3\16\3\u0086\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\u0094\n\3\f\3\16\3\u0097\13\3\3\3\5\3\u009a\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a6\n\3\3\3\5\3\u00a9\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ba\n\3\f\3\16\3"+
		"\u00bd\13\3\3\3\5\3\u00c0\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00d5\n\3\f\3\16\3\u00d8\13\3"+
		"\3\3\5\3\u00db\n\3\3\3\5\3\u00de\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\u00e9\n\3\f\3\16\3\u00ec\13\3\3\3\5\3\u00ef\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u00f8\n\3\3\3\5\3\u00fb\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u010d\n\3\f\3\16\3\u0110\13"+
		"\3\3\3\5\3\u0113\n\3\3\3\5\3\u0116\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u011e"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0127\n\3\3\3\3\3\3\3\7\3\u012c\n"+
		"\3\f\3\16\3\u012f\13\3\3\3\5\3\u0132\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u013d\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0146\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u014f\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3\u015c\n\3\f\3\16\3\u015f\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u016e\n\3\f\3\16\3\u0171\13\3\3\3\5\3\u0174"+
		"\n\3\3\3\3\3\7\3\u0178\n\3\f\3\16\3\u017b\13\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3\u0185\n\3\f\3\16\3\u0188\13\3\3\3\5\3\u018b\n\3\3\3\3\3\5"+
		"\3\u018f\n\3\3\4\3\4\3\4\3\4\3\4\7\4\u0196\n\4\f\4\16\4\u0199\13\4\3\4"+
		"\5\4\u019c\n\4\3\5\3\5\3\5\3\5\5\5\u01a2\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u01a9"+
		"\n\5\3\6\3\6\3\6\3\6\5\6\u01af\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u01b6\n\6\f"+
		"\6\16\6\u01b9\13\6\3\6\5\6\u01bc\n\6\3\6\3\6\3\6\5\6\u01c1\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01cc\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\5\n\u01d5\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01dd\n\n\f\n\16\n\u01e0\13"+
		"\n\3\n\3\n\3\n\5\n\u01e5\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01ed\n\n\f\n"+
		"\16\n\u01f0\13\n\3\n\3\n\3\n\5\n\u01f5\n\n\5\n\u01f7\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u01ff\n\13\f\13\16\13\u0202\13\13\3\13\5\13\u0205"+
		"\n\13\3\13\3\13\3\13\5\13\u020a\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u0211"+
		"\n\13\f\13\16\13\u0214\13\13\3\13\5\13\u0217\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u021f\n\13\f\13\16\13\u0222\13\13\3\13\5\13\u0225\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u022d\n\13\3\13\5\13\u0230\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0239\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0245\n\13\f\13\16\13\u0248\13\13"+
		"\3\f\3\f\3\f\3\f\7\f\u024e\n\f\f\f\16\f\u0251\13\f\3\f\5\f\u0254\n\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u025e\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0265"+
		"\n\r\5\r\u0267\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u0275\n\16\f\16\16\16\u0278\13\16\3\16\5\16\u027b\n\16\3"+
		"\16\3\16\3\16\5\16\u0280\n\16\5\16\u0282\n\16\3\16\3\16\5\16\u0286\n\16"+
		"\5\16\u0288\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0290\n\17\f\17\16"+
		"\17\u0293\13\17\3\17\5\17\u0296\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u029f\n\17\f\17\16\17\u02a2\13\17\3\17\5\17\u02a5\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u02ac\n\17\f\17\16\17\u02af\13\17\3\17\5\17\u02b2"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u02bb\n\17\3\17\5\17\u02be"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u02c7\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u02cf\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u02d6\n"+
		"\20\5\20\u02d8\n\20\3\21\3\21\3\21\3\21\5\21\u02de\n\21\3\21\3\21\3\21"+
		"\5\21\u02e3\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u02f2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u02fb"+
		"\n\23\f\23\16\23\u02fe\13\23\3\23\5\23\u0301\n\23\3\23\5\23\u0304\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u031f\n\23"+
		"\f\23\16\23\u0322\13\23\3\23\5\23\u0325\n\23\3\23\5\23\u0328\n\23\3\23"+
		"\3\23\3\23\3\23\5\23\u032e\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0335\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u033d\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0347\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0351\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u035b"+
		"\n\23\5\23\u035d\n\23\3\23\3\23\3\23\5\23\u0362\n\23\3\23\3\23\3\23\3"+
		"\23\5\23\u0368\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0372"+
		"\n\23\5\23\u0374\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u037c\n\23\f"+
		"\23\16\23\u037f\13\23\3\23\5\23\u0382\n\23\3\23\3\23\3\23\5\23\u0387\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u038f\n\23\f\23\16\23\u0392\13"+
		"\23\3\23\5\23\u0395\n\23\3\23\3\23\3\23\5\23\u039a\n\23\3\23\3\23\3\23"+
		"\3\23\5\23\u03a0\n\23\5\23\u03a2\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u03aa\n\23\f\23\16\23\u03ad\13\23\3\23\5\23\u03b0\n\23\3\23\5\23\u03b3"+
		"\n\23\3\23\3\23\5\23\u03b7\n\23\3\23\3\23\3\23\3\23\5\23\u03bd\n\23\5"+
		"\23\u03bf\n\23\3\23\3\23\7\23\u03c3\n\23\f\23\16\23\u03c6\13\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u03cf\n\24\f\24\16\24\u03d2\13\24\3"+
		"\24\5\24\u03d5\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u03eb\n\24\f\24"+
		"\16\24\u03ee\13\24\3\24\5\24\u03f1\n\24\3\24\5\24\u03f4\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0407\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u040e\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u041d"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0425\n\24\f\24\16\24\u0428\13"+
		"\24\3\24\5\24\u042b\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0437\n\24\f\24\16\24\u043a\13\24\3\24\5\24\u043d\n\24\3\24"+
		"\3\24\3\24\5\24\u0442\n\24\3\24\3\24\3\24\3\24\5\24\u0448\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u0450\n\24\f\24\16\24\u0453\13\24\3\24\5"+
		"\24\u0456\n\24\3\24\5\24\u0459\n\24\3\24\3\24\3\24\5\24\u045e\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0468\n\24\f\24\16\24\u046b\13"+
		"\24\3\25\3\25\3\25\3\25\7\25\u0471\n\25\f\25\16\25\u0474\13\25\3\25\5"+
		"\25\u0477\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u0480\n\26\f\26"+
		"\16\26\u0483\13\26\3\26\5\26\u0486\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u048e\n\26\f\26\16\26\u0491\13\26\3\26\5\26\u0494\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u049d\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u04a7\n\26\f\26\16\26\u04aa\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u04b7\n\27\f\27\16\27\u04ba\13"+
		"\27\3\27\5\27\u04bd\n\27\3\27\3\27\3\27\3\27\5\27\u04c3\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u04ca\n\30\f\30\16\30\u04cd\13\30\3\30\5\30\u04d0"+
		"\n\30\3\30\3\30\3\31\3\31\5\31\u04d6\n\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u04dd\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u04e4\n\33\3\33\3\33\5\33\u04e8"+
		"\n\33\3\34\3\34\3\34\5\34\u04ed\n\34\3\35\3\35\3\35\3\35\7\35\u04f3\n"+
		"\35\f\35\16\35\u04f6\13\35\3\35\3\35\3\35\5\35\u04fb\n\35\3\36\3\36\3"+
		"\36\3\36\7\36\u0501\n\36\f\36\16\36\u0504\13\36\3\36\3\36\3\36\5\36\u0509"+
		"\n\36\3\37\3\37\3\37\3\37\7\37\u050f\n\37\f\37\16\37\u0512\13\37\3\37"+
		"\3\37\3\37\5\37\u0517\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\2"+
		"\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFH\2\5\3\2LN\3\2OP\4\2\'\'QQ\2\u05f2\2\\\3\2\2\2\4\u018e\3\2\2\2\6\u0190"+
		"\3\2\2\2\b\u01a1\3\2\2\2\n\u01ae\3\2\2\2\f\u01c2\3\2\2\2\16\u01cd\3\2"+
		"\2\2\20\u01cf\3\2\2\2\22\u01f6\3\2\2\2\24\u0238\3\2\2\2\26\u0249\3\2\2"+
		"\2\30\u0266\3\2\2\2\32\u0287\3\2\2\2\34\u02c6\3\2\2\2\36\u02d7\3\2\2\2"+
		" \u02dd\3\2\2\2\"\u02f1\3\2\2\2$\u03be\3\2\2\2&\u045d\3\2\2\2(\u046c\3"+
		"\2\2\2*\u049c\3\2\2\2,\u04c2\3\2\2\2.\u04c4\3\2\2\2\60\u04d5\3\2\2\2\62"+
		"\u04d7\3\2\2\2\64\u04de\3\2\2\2\66\u04ec\3\2\2\28\u04fa\3\2\2\2:\u0508"+
		"\3\2\2\2<\u0516\3\2\2\2>\u0518\3\2\2\2@\u051a\3\2\2\2B\u051c\3\2\2\2D"+
		"\u051e\3\2\2\2F\u0520\3\2\2\2H\u0522\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7%\2\2Q]\5$\23\2RT\5\4"+
		"\3\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7&"+
		"\2\2YZ\5$\23\2Z[\5$\23\2[]\3\2\2\2\\M\3\2\2\2\\U\3\2\2\2]\3\3\2\2\2^_"+
		"\7H\2\2_`\5B\"\2`a\5<\37\2ab\7\4\2\2b\u018f\3\2\2\2ci\7\'\2\2de\5B\"\2"+
		"ef\7\5\2\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2"+
		"ki\3\2\2\2lm\5B\"\2mn\7\4\2\2n\u018f\3\2\2\2ou\7(\2\2pq\5B\"\2qr\7\5\2"+
		"\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2"+
		"\2xy\5B\"\2yz\7\t\2\2z{\5H%\2{|\5\66\34\2|}\7\4\2\2}\u018f\3\2\2\2~\u0084"+
		"\7+\2\2\177\u0080\5B\"\2\u0080\u0081\7\5\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5B\"\2\u0088\u0089"+
		"\7\t\2\2\u0089\u008a\5H%\2\u008a\u008b\58\35\2\u008b\u008c\7\4\2\2\u008c"+
		"\u018f\3\2\2\2\u008d\u008e\7*\2\2\u008e\u008f\5B\"\2\u008f\u0099\7\b\2"+
		"\2\u0090\u0091\5H%\2\u0091\u0092\7\5\2\2\u0092\u0094\3\2\2\2\u0093\u0090"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\5H%\2\u0099\u0095\3\2\2"+
		"\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\7\2\2\u009c\u009d"+
		"\7\t\2\2\u009d\u009e\5H%\2\u009e\u009f\58\35\2\u009f\u00a0\7\4\2\2\u00a0"+
		"\u018f\3\2\2\2\u00a1\u00a2\7I\2\2\u00a2\u00a8\5B\"\2\u00a3\u00a5\7\b\2"+
		"\2\u00a4\u00a6\5\62\32\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\7\7\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\n\2\2\u00ab\u00ac\5&\24\2\u00ac"+
		"\u00ad\7\4\2\2\u00ad\u018f\3\2\2\2\u00ae\u00af\7)\2\2\u00af\u00b0\5\b"+
		"\5\2\u00b0\u00b1\5\66\34\2\u00b1\u00b2\7\4\2\2\u00b2\u018f\3\2\2\2\u00b3"+
		"\u00b4\7*\2\2\u00b4\u00b5\5B\"\2\u00b5\u00bf\7\b\2\2\u00b6\u00b7\5H%\2"+
		"\u00b7\u00b8\7\5\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c0\5H%\2\u00bf\u00bb\3\2\2\2\u00bf\u00c0\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4"+
		"\5H%\2\u00c4\u00c5\7)\2\2\u00c5\u00c6\5\n\6\2\u00c6\u00c7\58\35\2\u00c7"+
		"\u00c8\7\4\2\2\u00c8\u018f\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\5\f"+
		"\7\2\u00cb\u00cc\5<\37\2\u00cc\u00cd\7\4\2\2\u00cd\u018f\3\2\2\2\u00ce"+
		"\u00cf\7.\2\2\u00cf\u00dd\5B\"\2\u00d0\u00da\7\b\2\2\u00d1\u00d2\5H%\2"+
		"\u00d2\u00d3\7\5\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00db\5H%\2\u00da\u00d6\3\2\2\2\u00da\u00db\3\2\2"+
		"\2\u00db\u00dc\3\2\2\2\u00dc\u00de\7\7\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\5:\36\2\u00e0\u00e1\7\4\2\2\u00e1"+
		"\u018f\3\2\2\2\u00e2\u00e3\7-\2\2\u00e3\u00e4\5B\"\2\u00e4\u00ee\7\b\2"+
		"\2\u00e5\u00e6\5H%\2\u00e6\u00e7\7\5\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\5H%\2\u00ee\u00ea\3\2\2"+
		"\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\7\2\2\u00f1\u00f2"+
		"\7\4\2\2\u00f2\u018f\3\2\2\2\u00f3\u00f4\7/\2\2\u00f4\u00fa\5B\"\2\u00f5"+
		"\u00f7\7\b\2\2\u00f6\u00f8\5\62\32\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\7\7\2\2\u00fa\u00f5\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\n\2\2\u00fd\u00fe\5$"+
		"\23\2\u00fe\u00ff\7\4\2\2\u00ff\u018f\3\2\2\2\u0100\u0101\7\60\2\2\u0101"+
		"\u0102\5\16\b\2\u0102\u0103\7\n\2\2\u0103\u0104\5\20\t\2\u0104\u0105\7"+
		"\4\2\2\u0105\u018f\3\2\2\2\u0106\u0107\7\61\2\2\u0107\u0115\5B\"\2\u0108"+
		"\u0112\7\b\2\2\u0109\u010a\5H%\2\u010a\u010b\7\5\2\2\u010b\u010d\3\2\2"+
		"\2\u010c\u0109\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\5H%\2\u0112"+
		"\u010e\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\7\7"+
		"\2\2\u0115\u0108\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\7\4\2\2\u0118\u018f\3\2\2\2\u0119\u011d\7\62\2\2\u011a\u011b\5"+
		"\62\32\2\u011b\u011c\7\6\2\2\u011c\u011e\3\2\2\2\u011d\u011a\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\22\n\2\u0120\u0121\7"+
		"\4\2\2\u0121\u018f\3\2\2\2\u0122\u0126\7J\2\2\u0123\u0124\5\62\32\2\u0124"+
		"\u0125\7\6\2\2\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0131\3\2\2\2\u0128\u0129\5\6\4\2\u0129\u012a\7\5\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0132\5\6\4\2\u0131\u012d\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u018f\7\4\2\2\u0134\u0135\7\36\2\2\u0135\u0136\5B\"\2\u0136"+
		"\u0137\7\4\2\2\u0137\u018f\3\2\2\2\u0138\u013c\7\63\2\2\u0139\u013a\5"+
		"\62\32\2\u013a\u013b\7\6\2\2\u013b\u013d\3\2\2\2\u013c\u0139\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\5\24\13\2\u013f\u0140\7"+
		"\4\2\2\u0140\u018f\3\2\2\2\u0141\u0145\7\64\2\2\u0142\u0143\5\62\32\2"+
		"\u0143\u0144\7\6\2\2\u0144\u0146\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\5\32\16\2\u0148\u0149\7\4\2\2"+
		"\u0149\u018f\3\2\2\2\u014a\u014e\7\37\2\2\u014b\u014c\5\64\33\2\u014c"+
		"\u014d\7\6\2\2\u014d\u014f\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0151\5*\26\2\u0151\u0152\7\4\2\2\u0152"+
		"\u018f\3\2\2\2\u0153\u0154\7 \2\2\u0154\u0155\5 \21\2\u0155\u0156\7\4"+
		"\2\2\u0156\u018f\3\2\2\2\u0157\u015d\7!\2\2\u0158\u0159\5B\"\2\u0159\u015a"+
		"\7\5\2\2\u015a\u015c\3\2\2\2\u015b\u0158\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0161\5B\"\2\u0161\u0162\5<\37\2\u0162\u0163\7\4\2\2\u0163"+
		"\u018f\3\2\2\2\u0164\u0165\7\"\2\2\u0165\u0166\5B\"\2\u0166\u0167\7\4"+
		"\2\2\u0167\u018f\3\2\2\2\u0168\u0169\7#\2\2\u0169\u0173\5B\"\2\u016a\u016b"+
		"\5H%\2\u016b\u016c\7\5\2\2\u016c\u016e\3\2\2\2\u016d\u016a\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0174\5H%\2\u0173\u016f\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0179\7\34\2\2\u0176\u0178\5\4\3\2"+
		"\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7\35\2\2"+
		"\u017d\u017e\7\4\2\2\u017e\u018f\3\2\2\2\u017f\u0180\7$\2\2\u0180\u018a"+
		"\5B\"\2\u0181\u0182\5H%\2\u0182\u0183\7\5\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0181\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\5H%\2\u018a\u0186"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7\4\2\2\u018d"+
		"\u018f\3\2\2\2\u018e^\3\2\2\2\u018ec\3\2\2\2\u018eo\3\2\2\2\u018e~\3\2"+
		"\2\2\u018e\u008d\3\2\2\2\u018e\u00a1\3\2\2\2\u018e\u00ae\3\2\2\2\u018e"+
		"\u00b3\3\2\2\2\u018e\u00c9\3\2\2\2\u018e\u00ce\3\2\2\2\u018e\u00e2\3\2"+
		"\2\2\u018e\u00f3\3\2\2\2\u018e\u0100\3\2\2\2\u018e\u0106\3\2\2\2\u018e"+
		"\u0119\3\2\2\2\u018e\u0122\3\2\2\2\u018e\u0134\3\2\2\2\u018e\u0138\3\2"+
		"\2\2\u018e\u0141\3\2\2\2\u018e\u014a\3\2\2\2\u018e\u0153\3\2\2\2\u018e"+
		"\u0157\3\2\2\2\u018e\u0164\3\2\2\2\u018e\u0168\3\2\2\2\u018e\u017f\3\2"+
		"\2\2\u018f\5\3\2\2\2\u0190\u019b\5B\"\2\u0191\u0197\7K\2\2\u0192\u0193"+
		"\5*\26\2\u0193\u0194\7\5\2\2\u0194\u0196\3\2\2\2\u0195\u0192\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019c\5*\26\2\u019b\u0191\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\7\3\2\2\2\u019d\u019e\7\65\2\2\u019e\u019f\5\62\32"+
		"\2\u019f\u01a0\7\6\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019d\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\5*\26\2\u01a4\u01a5\7\n\2\2\u01a5"+
		"\u01a8\5*\26\2\u01a6\u01a7\7\6\2\2\u01a7\u01a9\5\b\5\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\t\3\2\2\2\u01aa\u01ab\7\65\2\2\u01ab\u01ac"+
		"\5\64\33\2\u01ac\u01ad\7\6\2\2\u01ad\u01af\3\2\2\2\u01ae\u01aa\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5B\"\2\u01b1\u01bb"+
		"\7\b\2\2\u01b2\u01b3\5\60\31\2\u01b3\u01b4\7\5\2\2\u01b4\u01b6\3\2\2\2"+
		"\u01b5\u01b2\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\5\60\31\2"+
		"\u01bb\u01b7\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0"+
		"\7\7\2\2\u01be\u01bf\7\66\2\2\u01bf\u01c1\5\n\6\2\u01c0\u01be\3\2\2\2"+
		"\u01c0\u01c1\3\2\2\2\u01c1\13\3\2\2\2\u01c2\u01c3\7\65\2\2\u01c3\u01c4"+
		"\5\62\32\2\u01c4\u01c5\7\6\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5*\26\2"+
		"\u01c7\u01c8\7\n\2\2\u01c8\u01cb\5*\26\2\u01c9\u01ca\7\6\2\2\u01ca\u01cc"+
		"\5\f\7\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\r\3\2\2\2\u01cd"+
		"\u01ce\5D#\2\u01ce\17\3\2\2\2\u01cf\u01d0\5D#\2\u01d0\21\3\2\2\2\u01d1"+
		"\u01d4\5\24\13\2\u01d2\u01d3\7\6\2\2\u01d3\u01d5\5\22\n\2\u01d4\u01d2"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01f7\3\2\2\2\u01d6\u01d7\7\67\2\2"+
		"\u01d7\u01d8\7\61\2\2\u01d8\u01de\7\t\2\2\u01d9\u01da\5B\"\2\u01da\u01db"+
		"\7\5\2\2\u01db\u01dd\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e1\u01e4\5B\"\2\u01e2\u01e3\7\6\2\2\u01e3\u01e5\5\22\n\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01f7\3\2\2\2\u01e6\u01e7\7\67"+
		"\2\2\u01e7\u01e8\78\2\2\u01e8\u01ee\7\t\2\2\u01e9\u01ea\5B\"\2\u01ea\u01eb"+
		"\7\5\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f1\u01f4\5B\"\2\u01f2\u01f3\7\6\2\2\u01f3\u01f5\5\22\n\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01d1\3\2"+
		"\2\2\u01f6\u01d6\3\2\2\2\u01f6\u01e6\3\2\2\2\u01f7\23\3\2\2\2\u01f8\u0239"+
		"\5B\"\2\u01f9\u01fa\5B\"\2\u01fa\u0204\7\b\2\2\u01fb\u01fc\5\24\13\2\u01fc"+
		"\u01fd\7\5\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fb\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0205\5\24\13\2\u0204\u0200\3\2\2\2\u0204\u0205\3"+
		"\2\2\2\u0205\u0206\3\2\2\2\u0206\u0209\7\7\2\2\u0207\u0208\79\2\2\u0208"+
		"\u020a\5F$\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0239\3\2\2"+
		"\2\u020b\u020c\7\61\2\2\u020c\u0216\7\b\2\2\u020d\u020e\5\24\13\2\u020e"+
		"\u020f\7\5\2\2\u020f\u0211\3\2\2\2\u0210\u020d\3\2\2\2\u0211\u0214\3\2"+
		"\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0215\u0217\5\24\13\2\u0216\u0212\3\2\2\2\u0216\u0217\3"+
		"\2\2\2\u0217\u0218\3\2\2\2\u0218\u0239\7\7\2\2\u0219\u021a\78\2\2\u021a"+
		"\u0224\7\b\2\2\u021b\u021c\5\24\13\2\u021c\u021d\7\5\2\2\u021d\u021f\3"+
		"\2\2\2\u021e\u021b\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\5\24"+
		"\13\2\u0224\u0220\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0239\7\7\2\2\u0227\u0239\5\26\f\2\u0228\u0229\7:\2\2\u0229\u022f\5B"+
		"\"\2\u022a\u022c\7\13\2\2\u022b\u022d\5\30\r\2\u022c\u022b\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\7\f\2\2\u022f\u022a\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230\u0239\3\2\2\2\u0231\u0232\7/\2\2\u0232"+
		"\u0233\5B\"\2\u0233\u0234\7\n\2\2\u0234\u0235\5\24\13\2\u0235\u0236\7"+
		"\r\2\2\u0236\u0237\5\24\13\2\u0237\u0239\3\2\2\2\u0238\u01f8\3\2\2\2\u0238"+
		"\u01f9\3\2\2\2\u0238\u020b\3\2\2\2\u0238\u0219\3\2\2\2\u0238\u0227\3\2"+
		"\2\2\u0238\u0228\3\2\2\2\u0238\u0231\3\2\2\2\u0239\u0246\3\2\2\2\u023a"+
		"\u023b\7\n\2\2\u023b\u0245\5\24\13\2\u023c\u023d\7\16\2\2\u023d\u0245"+
		"\5\24\13\2\u023e\u023f\7\17\2\2\u023f\u0245\5\24\13\2\u0240\u0241\7\20"+
		"\2\2\u0241\u0245\5\24\13\2\u0242\u0243\7\21\2\2\u0243\u0245\5\24\13\2"+
		"\u0244\u023a\3\2\2\2\u0244\u023c\3\2\2\2\u0244\u023e\3\2\2\2\u0244\u0240"+
		"\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\25\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u0253\7\b\2"+
		"\2\u024a\u024b\5\24\13\2\u024b\u024c\7\5\2\2\u024c\u024e\3\2\2\2\u024d"+
		"\u024a\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0254\5\24\13\2\u0253"+
		"\u024f\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\7\7"+
		"\2\2\u0256\27\3\2\2\2\u0257\u0258\7\23\2\2\u0258\u0259\5F$\2\u0259\u025a"+
		"\7\n\2\2\u025a\u025d\5\24\13\2\u025b\u025c\7\6\2\2\u025c\u025e\5\30\r"+
		"\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0267\3\2\2\2\u025f\u0260"+
		"\5B\"\2\u0260\u0261\7\n\2\2\u0261\u0264\5\24\13\2\u0262\u0263\7\6\2\2"+
		"\u0263\u0265\5\30\r\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267"+
		"\3\2\2\2\u0266\u0257\3\2\2\2\u0266\u025f\3\2\2\2\u0267\31\3\2\2\2\u0268"+
		"\u0269\7/\2\2\u0269\u026a\5B\"\2\u026a\u026b\7\n\2\2\u026b\u026c\5\34"+
		"\17\2\u026c\u026d\7\r\2\2\u026d\u026e\5\32\16\2\u026e\u0288\3\2\2\2\u026f"+
		"\u0281\5B\"\2\u0270\u027a\7\b\2\2\u0271\u0272\5\34\17\2\u0272\u0273\7"+
		"\5\2\2\u0273\u0275\3\2\2\2\u0274\u0271\3\2\2\2\u0275\u0278\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0279\u027b\5\34\17\2\u027a\u0276\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027f\7\7\2\2\u027d\u027e\79\2\2\u027e\u0280\5F$"+
		"\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u0270"+
		"\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0284\7\22\2\2"+
		"\u0284\u0286\5F$\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288"+
		"\3\2\2\2\u0287\u0268\3\2\2\2\u0287\u026f\3\2\2\2\u0288\33\3\2\2\2\u0289"+
		"\u02c7\5B\"\2\u028a\u028b\5B\"\2\u028b\u0295\7\b\2\2\u028c\u028d\5\34"+
		"\17\2\u028d\u028e\7\5\2\2\u028e\u0290\3\2\2\2\u028f\u028c\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0294\u0296\5\34\17\2\u0295\u0291\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\7\7\2\2\u0298\u02c7\3\2"+
		"\2\2\u0299\u029a\7\63\2\2\u029a\u02a4\7\b\2\2\u029b\u029c\5\34\17\2\u029c"+
		"\u029d\7\5\2\2\u029d\u029f\3\2\2\2\u029e\u029b\3\2\2\2\u029f\u02a2\3\2"+
		"\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3\u02a5\5\34\17\2\u02a4\u02a0\3\2\2\2\u02a4\u02a5\3"+
		"\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02c7\7\7\2\2\u02a7\u02b1\7\b\2\2\u02a8"+
		"\u02a9\5\34\17\2\u02a9\u02aa\7\5\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a8\3"+
		"\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b2\5\34\17\2\u02b1\u02ad\3"+
		"\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\5\34\17\2\u02b4"+
		"\u02b5\7\7\2\2\u02b5\u02c7\3\2\2\2\u02b6\u02b7\7:\2\2\u02b7\u02bd\5B\""+
		"\2\u02b8\u02ba\7\13\2\2\u02b9\u02bb\5\36\20\2\u02ba\u02b9\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\7\f\2\2\u02bd\u02b8\3\2"+
		"\2\2\u02bd\u02be\3\2\2\2\u02be\u02c7\3\2\2\2\u02bf\u02c0\7/\2\2\u02c0"+
		"\u02c1\5B\"\2\u02c1\u02c2\7\n\2\2\u02c2\u02c3\5\34\17\2\u02c3\u02c4\7"+
		"\r\2\2\u02c4\u02c5\5\34\17\2\u02c5\u02c7\3\2\2\2\u02c6\u0289\3\2\2\2\u02c6"+
		"\u028a\3\2\2\2\u02c6\u0299\3\2\2\2\u02c6\u02a7\3\2\2\2\u02c6\u02b6\3\2"+
		"\2\2\u02c6\u02bf\3\2\2\2\u02c7\35\3\2\2\2\u02c8\u02c9\7\23\2\2\u02c9\u02ca"+
		"\5F$\2\u02ca\u02cb\7\n\2\2\u02cb\u02ce\5\34\17\2\u02cc\u02cd\7\6\2\2\u02cd"+
		"\u02cf\5\36\20\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d8\3"+
		"\2\2\2\u02d0\u02d1\5B\"\2\u02d1\u02d2\7\n\2\2\u02d2\u02d5\5\34\17\2\u02d3"+
		"\u02d4\7\6\2\2\u02d4\u02d6\5\36\20\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3"+
		"\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02c8\3\2\2\2\u02d7\u02d0\3\2\2\2\u02d8"+
		"\37\3\2\2\2\u02d9\u02da\7\65\2\2\u02da\u02db\5\64\33\2\u02db\u02dc\7\6"+
		"\2\2\u02dc\u02de\3\2\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e2\5\"\22\2\u02e0\u02e1\7\6\2\2\u02e1\u02e3\5"+
		" \21\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3!\3\2\2\2\u02e4\u02f2"+
		"\5*\26\2\u02e5\u02e6\5*\26\2\u02e6\u02e7\7\24\2\2\u02e7\u02e8\5*\26\2"+
		"\u02e8\u02f2\3\2\2\2\u02e9\u02ea\5*\26\2\u02ea\u02eb\7\30\2\2\u02eb\u02ec"+
		"\5*\26\2\u02ec\u02f2\3\2\2\2\u02ed\u02ee\5*\26\2\u02ee\u02ef\7\31\2\2"+
		"\u02ef\u02f0\5*\26\2\u02f0\u02f2\3\2\2\2\u02f1\u02e4\3\2\2\2\u02f1\u02e5"+
		"\3\2\2\2\u02f1\u02e9\3\2\2\2\u02f1\u02ed\3\2\2\2\u02f2#\3\2\2\2\u02f3"+
		"\u03bf\7\3\2\2\u02f4\u03bf\7;\2\2\u02f5\u0303\5B\"\2\u02f6\u0300\7\b\2"+
		"\2\u02f7\u02f8\5&\24\2\u02f8\u02f9\7\5\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f7"+
		"\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u02ff\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0301\5&\24\2\u0300\u02fc\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\7\7\2\2\u0303"+
		"\u02f6\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u03bf\3\2\2\2\u0305\u0306\7\b"+
		"\2\2\u0306\u0307\5$\23\2\u0307\u0308\7\7\2\2\u0308\u03bf\3\2\2\2\u0309"+
		"\u030a\7\23\2\2\u030a\u03bf\5$\23\2\u030b\u030c\7\23\2\2\u030c\u030d\5"+
		"B\"\2\u030d\u030e\7\32\2\2\u030e\u030f\5B\"\2\u030f\u0310\5$\23\2\u0310"+
		"\u03bf\3\2\2\2\u0311\u0312\7F\2\2\u0312\u0313\5B\"\2\u0313\u0314\7\32"+
		"\2\2\u0314\u0315\5B\"\2\u0315\u0316\7<\2\2\u0316\u0317\5$\23\2\u0317\u03bf"+
		"\3\2\2\2\u0318\u0319\7:\2\2\u0319\u0327\5B\"\2\u031a\u0324\7\13\2\2\u031b"+
		"\u031c\5B\"\2\u031c\u031d\7\5\2\2\u031d\u031f\3\2\2\2\u031e\u031b\3\2"+
		"\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u0323\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0325\5B\"\2\u0324\u0320\3\2"+
		"\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\7\f\2\2\u0327"+
		"\u031a\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\7\t"+
		"\2\2\u032a\u032d\5H%\2\u032b\u032c\7\6\2\2\u032c\u032e\5$\23\2\u032d\u032b"+
		"\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u03bf\3\2\2\2\u032f\u0330\5B\"\2\u0330"+
		"\u0331\7\26\2\2\u0331\u0334\5H%\2\u0332\u0333\7\6\2\2\u0333\u0335\5$\23"+
		"\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u03bf\3\2\2\2\u0336\u0337"+
		"\7A\2\2\u0337\u0338\5&\24\2\u0338\u0339\7B\2\2\u0339\u033c\5$\23\2\u033a"+
		"\u033b\7>\2\2\u033b\u033d\5$\23\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u03bf\3\2\2\2\u033e\u033f\7\r\2\2\u033f\u0340\7\b\2\2\u0340"+
		"\u0341\5&\24\2\u0341\u0342\7\5\2\2\u0342\u0343\5,\27\2\u0343\u0346\7\7"+
		"\2\2\u0344\u0345\7\6\2\2\u0345\u0347\5$\23\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u03bf\3\2\2\2\u0348\u0349\7=\2\2\u0349\u034a\7\b"+
		"\2\2\u034a\u034b\5&\24\2\u034b\u034c\7\5\2\2\u034c\u034d\5&\24\2\u034d"+
		"\u0350\7\7\2\2\u034e\u034f\7\6\2\2\u034f\u0351\5$\23\2\u0350\u034e\3\2"+
		"\2\2\u0350\u0351\3\2\2\2\u0351\u03bf\3\2\2\2\u0352\u0353\7/\2\2\u0353"+
		"\u0354\5,\27\2\u0354\u0355\7\n\2\2\u0355\u035c\5&\24\2\u0356\u0357\7\r"+
		"\2\2\u0357\u035a\5$\23\2\u0358\u0359\7>\2\2\u0359\u035b\5$\23\2\u035a"+
		"\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u0356\3\2"+
		"\2\2\u035c\u035d\3\2\2\2\u035d\u03bf\3\2\2\2\u035e\u0361\5B\"\2\u035f"+
		"\u0360\7\t\2\2\u0360\u0362\5H%\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2"+
		"\2\u0362\u0363\3\2\2\2\u0363\u0364\7\25\2\2\u0364\u0367\5&\24\2\u0365"+
		"\u0366\7\6\2\2\u0366\u0368\5$\23\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u03bf\3\2\2\2\u0369\u036a\7/\2\2\u036a\u036b\5\62\32\2\u036b"+
		"\u036c\7?\2\2\u036c\u0373\5&\24\2\u036d\u036e\7\r\2\2\u036e\u0371\5$\23"+
		"\2\u036f\u0370\7>\2\2\u0370\u0372\5$\23\2\u0371\u036f\3\2\2\2\u0371\u0372"+
		"\3\2\2\2\u0372\u0374\3\2\2\2\u0373\u036d\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u03bf\3\2\2\2\u0375\u0376\7@\2\2\u0376\u0377\5B\"\2\u0377\u0381\7\b\2"+
		"\2\u0378\u0379\5&\24\2\u0379\u037a\7\5\2\2\u037a\u037c\3\2\2\2\u037b\u0378"+
		"\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u0380\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0382\5&\24\2\u0381\u037d\3\2"+
		"\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0386\7\7\2\2\u0384"+
		"\u0385\7\6\2\2\u0385\u0387\5$\23\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2"+
		"\2\2\u0387\u03bf\3\2\2\2\u0388\u0389\7C\2\2\u0389\u038a\5B\"\2\u038a\u0394"+
		"\7\b\2\2\u038b\u038c\5,\27\2\u038c\u038d\7\5\2\2\u038d\u038f\3\2\2\2\u038e"+
		"\u038b\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2"+
		"\2\2\u0391\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0395\5,\27\2\u0394"+
		"\u0390\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0399\7\7"+
		"\2\2\u0397\u0398\7?\2\2\u0398\u039a\5&\24\2\u0399\u0397\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u03a1\3\2\2\2\u039b\u039c\7\r\2\2\u039c\u039f\5$"+
		"\23\2\u039d\u039e\7>\2\2\u039e\u03a0\5$\23\2\u039f\u039d\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039b\3\2\2\2\u03a1\u03a2\3\2"+
		"\2\2\u03a2\u03bf\3\2\2\2\u03a3\u03a4\7\61\2\2\u03a4\u03b2\5B\"\2\u03a5"+
		"\u03af\7\b\2\2\u03a6\u03a7\5&\24\2\u03a7\u03a8\7\5\2\2\u03a8\u03aa\3\2"+
		"\2\2\u03a9\u03a6\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03b0\5&"+
		"\24\2\u03af\u03ab\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u03b3\7\7\2\2\u03b2\u03a5\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b6\3\2"+
		"\2\2\u03b4\u03b5\7\6\2\2\u03b5\u03b7\5$\23\2\u03b6\u03b4\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03bf\3\2\2\2\u03b8\u03b9\79\2\2\u03b9\u03bc\5F$"+
		"\2\u03ba\u03bb\7\6\2\2\u03bb\u03bd\5$\23\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd"+
		"\3\2\2\2\u03bd\u03bf\3\2\2\2\u03be\u02f3\3\2\2\2\u03be\u02f4\3\2\2\2\u03be"+
		"\u02f5\3\2\2\2\u03be\u0305\3\2\2\2\u03be\u0309\3\2\2\2\u03be\u030b\3\2"+
		"\2\2\u03be\u0311\3\2\2\2\u03be\u0318\3\2\2\2\u03be\u032f\3\2\2\2\u03be"+
		"\u0336\3\2\2\2\u03be\u033e\3\2\2\2\u03be\u0348\3\2\2\2\u03be\u0352\3\2"+
		"\2\2\u03be\u035e\3\2\2\2\u03be\u0369\3\2\2\2\u03be\u0375\3\2\2\2\u03be"+
		"\u0388\3\2\2\2\u03be\u03a3\3\2\2\2\u03be\u03b8\3\2\2\2\u03bf\u03c4\3\2"+
		"\2\2\u03c0\u03c1\7\33\2\2\u03c1\u03c3\5$\23\2\u03c2\u03c0\3\2\2\2\u03c3"+
		"\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5%\3\2\2\2"+
		"\u03c6\u03c4\3\2\2\2\u03c7\u045e\5B\"\2\u03c8\u045e\5(\25\2\u03c9\u03ca"+
		"\5B\"\2\u03ca\u03d4\7\b\2\2\u03cb\u03cc\5\24\13\2\u03cc\u03cd\7\5\2\2"+
		"\u03cd\u03cf\3\2\2\2\u03ce\u03cb\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce"+
		"\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3"+
		"\u03d5\5\24\13\2\u03d4\u03d0\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3"+
		"\2\2\2\u03d6\u03d7\7\7\2\2\u03d7\u045e\3\2\2\2\u03d8\u03d9\7G\2\2\u03d9"+
		"\u03da\7\13\2\2\u03da\u03db\5&\24\2\u03db\u03dc\7\5\2\2\u03dc\u03dd\5"+
		"&\24\2\u03dd\u03de\7\f\2\2\u03de\u045e\3\2\2\2\u03df\u03e0\7\63\2\2\u03e0"+
		"\u03e1\7\b\2\2\u03e1\u03e2\5&\24\2\u03e2\u03e3\7\7\2\2\u03e3\u045e\3\2"+
		"\2\2\u03e4\u03e5\7:\2\2\u03e5\u03f3\5B\"\2\u03e6\u03f0\7\13\2\2\u03e7"+
		"\u03e8\5B\"\2\u03e8\u03e9\7\5\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e7\3\2"+
		"\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03ef\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f1\5B\"\2\u03f0\u03ec\3\2"+
		"\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\7\f\2\2\u03f3"+
		"\u03e6\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\7\t"+
		"\2\2\u03f6\u03f7\5H%\2\u03f7\u03f8\7\6\2\2\u03f8\u03f9\5&\24\2\u03f9\u045e"+
		"\3\2\2\2\u03fa\u03fb\5B\"\2\u03fb\u03fc\7\26\2\2\u03fc\u03fd\5H%\2\u03fd"+
		"\u03fe\7\6\2\2\u03fe\u03ff\5&\24\2\u03ff\u045e\3\2\2\2\u0400\u0401\7A"+
		"\2\2\u0401\u0402\5&\24\2\u0402\u0403\7B\2\2\u0403\u0406\5&\24\2\u0404"+
		"\u0405\7>\2\2\u0405\u0407\5&\24\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u045e\3\2\2\2\u0408\u0409\7/\2\2\u0409\u045e\5,\27\2\u040a"+
		"\u040d\5B\"\2\u040b\u040c\7\t\2\2\u040c\u040e\5H%\2\u040d\u040b\3\2\2"+
		"\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\7\25\2\2\u0410"+
		"\u0411\5&\24\2\u0411\u0412\7\6\2\2\u0412\u0413\5&\24\2\u0413\u045e\3\2"+
		"\2\2\u0414\u0415\7/\2\2\u0415\u0416\5\62\32\2\u0416\u0417\7?\2\2\u0417"+
		"\u0418\5&\24\2\u0418\u0419\7\r\2\2\u0419\u041c\5&\24\2\u041a\u041b\7>"+
		"\2\2\u041b\u041d\5&\24\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u045e\3\2\2\2\u041e\u041f\7@\2\2\u041f\u0420\5B\"\2\u0420\u042a\7\b\2"+
		"\2\u0421\u0422\5&\24\2\u0422\u0423\7\5\2\2\u0423\u0425\3\2\2\2\u0424\u0421"+
		"\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042b\5&\24\2\u042a\u0426\3\2"+
		"\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7\7\2\2\u042d"+
		"\u042e\7\6\2\2\u042e\u042f\5&\24\2\u042f\u045e\3\2\2\2\u0430\u0431\7C"+
		"\2\2\u0431\u0432\5B\"\2\u0432\u043c\7\b\2\2\u0433\u0434\5,\27\2\u0434"+
		"\u0435\7\5\2\2\u0435\u0437\3\2\2\2\u0436\u0433\3\2\2\2\u0437\u043a\3\2"+
		"\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043b\3\2\2\2\u043a"+
		"\u0438\3\2\2\2\u043b\u043d\5,\27\2\u043c\u0438\3\2\2\2\u043c\u043d\3\2"+
		"\2\2\u043d\u043e\3\2\2\2\u043e\u0441\7\7\2\2\u043f\u0440\7?\2\2\u0440"+
		"\u0442\5&\24\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2"+
		"\2\2\u0443\u0444\7\r\2\2\u0444\u0447\5&\24\2\u0445\u0446\7>\2\2\u0446"+
		"\u0448\5&\24\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u045e\3\2"+
		"\2\2\u0449\u044a\7\61\2\2\u044a\u0458\5B\"\2\u044b\u0455\7\b\2\2\u044c"+
		"\u044d\5&\24\2\u044d\u044e\7\5\2\2\u044e\u0450\3\2\2\2\u044f\u044c\3\2"+
		"\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452"+
		"\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0456\5&\24\2\u0455\u0451\3\2"+
		"\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0459\7\7\2\2\u0458"+
		"\u044b\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\7\6"+
		"\2\2\u045b\u045c\5&\24\2\u045c\u045e\3\2\2\2\u045d\u03c7\3\2\2\2\u045d"+
		"\u03c8\3\2\2\2\u045d\u03c9\3\2\2\2\u045d\u03d8\3\2\2\2\u045d\u03df\3\2"+
		"\2\2\u045d\u03e4\3\2\2\2\u045d\u03fa\3\2\2\2\u045d\u0400\3\2\2\2\u045d"+
		"\u0408\3\2\2\2\u045d\u040a\3\2\2\2\u045d\u0414\3\2\2\2\u045d\u041e\3\2"+
		"\2\2\u045d\u0430\3\2\2\2\u045d\u0449\3\2\2\2\u045e\u0469\3\2\2\2\u045f"+
		"\u0460\7\n\2\2\u0460\u0468\5&\24\2\u0461\u0462\7\16\2\2\u0462\u0468\5"+
		"&\24\2\u0463\u0464\7\20\2\2\u0464\u0468\5&\24\2\u0465\u0466\7\17\2\2\u0466"+
		"\u0468\5&\24\2\u0467\u045f\3\2\2\2\u0467\u0461\3\2\2\2\u0467\u0463\3\2"+
		"\2\2\u0467\u0465\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\'\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u0476\7\b\2\2"+
		"\u046d\u046e\5&\24\2\u046e\u046f\7\5\2\2\u046f\u0471\3\2\2\2\u0470\u046d"+
		"\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0475\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u0477\5&\24\2\u0476\u0472\3\2"+
		"\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\7\7\2\2\u0479"+
		")\3\2\2\2\u047a\u049d\5B\"\2\u047b\u0485\7\b\2\2\u047c\u047d\5*\26\2\u047d"+
		"\u047e\7\5\2\2\u047e\u0480\3\2\2\2\u047f\u047c\3\2\2\2\u0480\u0483\3\2"+
		"\2\2\u0481\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483"+
		"\u0481\3\2\2\2\u0484\u0486\5*\26\2\u0485\u0481\3\2\2\2\u0485\u0486\3\2"+
		"\2\2\u0486\u0487\3\2\2\2\u0487\u049d\7\7\2\2\u0488\u0489\5B\"\2\u0489"+
		"\u0493\7\b\2\2\u048a\u048b\5*\26\2\u048b\u048c\7\5\2\2\u048c\u048e\3\2"+
		"\2\2\u048d\u048a\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490\u0492\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0494\5*"+
		"\26\2\u0493\u048f\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u0496\7\7\2\2\u0496\u049d\3\2\2\2\u0497\u0498\7\63\2\2\u0498\u0499\7"+
		"\b\2\2\u0499\u049a\5*\26\2\u049a\u049b\7\7\2\2\u049b\u049d\3\2\2\2\u049c"+
		"\u047a\3\2\2\2\u049c\u047b\3\2\2\2\u049c\u0488\3\2\2\2\u049c\u0497\3\2"+
		"\2\2\u049d\u04a8\3\2\2\2\u049e\u049f\7\n\2\2\u049f\u04a7\5*\26\2\u04a0"+
		"\u04a1\7\16\2\2\u04a1\u04a7\5*\26\2\u04a2\u04a3\7\20\2\2\u04a3\u04a7\5"+
		"*\26\2\u04a4\u04a5\7\17\2\2\u04a5\u04a7\5*\26\2\u04a6\u049e\3\2\2\2\u04a6"+
		"\u04a0\3\2\2\2\u04a6\u04a2\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04aa\3\2"+
		"\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9+\3\2\2\2\u04aa\u04a8"+
		"\3\2\2\2\u04ab\u04c3\5B\"\2\u04ac\u04ad\5B\"\2\u04ad\u04ae\7\t\2\2\u04ae"+
		"\u04af\5H%\2\u04af\u04c3\3\2\2\2\u04b0\u04c3\5.\30\2\u04b1\u04b2\5B\""+
		"\2\u04b2\u04bc\7\b\2\2\u04b3\u04b4\5,\27\2\u04b4\u04b5\7\5\2\2\u04b5\u04b7"+
		"\3\2\2\2\u04b6\u04b3\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8"+
		"\u04b9\3\2\2\2\u04b9\u04bb\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u04bd\5,"+
		"\27\2\u04bc\u04b8\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04bf\7\7\2\2\u04bf\u04c3\3\2\2\2\u04c0\u04c1\7\n\2\2\u04c1\u04c3\5&"+
		"\24\2\u04c2\u04ab\3\2\2\2\u04c2\u04ac\3\2\2\2\u04c2\u04b0\3\2\2\2\u04c2"+
		"\u04b1\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3-\3\2\2\2\u04c4\u04cf\7\b\2\2"+
		"\u04c5\u04c6\5,\27\2\u04c6\u04c7\b\30\1\2\u04c7\u04c8\7\5\2\2\u04c8\u04ca"+
		"\3\2\2\2\u04c9\u04c5\3\2\2\2\u04ca\u04cd\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cb"+
		"\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04cb\3\2\2\2\u04ce\u04d0\5,"+
		"\27\2\u04cf\u04cb\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1"+
		"\u04d2\7\7\2\2\u04d2/\3\2\2\2\u04d3\u04d6\5*\26\2\u04d4\u04d6\7D\2\2\u04d5"+
		"\u04d3\3\2\2\2\u04d5\u04d4\3\2\2\2\u04d6\61\3\2\2\2\u04d7\u04d8\5B\"\2"+
		"\u04d8\u04d9\7\t\2\2\u04d9\u04dc\5H%\2\u04da\u04db\7\5\2\2\u04db\u04dd"+
		"\5\62\32\2\u04dc\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\63\3\2\2\2\u04de"+
		"\u04df\5B\"\2\u04df\u04e0\7\t\2\2\u04e0\u04e3\5H%\2\u04e1\u04e2\7E\2\2"+
		"\u04e2\u04e4\7D\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e7"+
		"\3\2\2\2\u04e5\u04e6\7\5\2\2\u04e6\u04e8\5\62\32\2\u04e7\u04e5\3\2\2\2"+
		"\u04e7\u04e8\3\2\2\2\u04e8\65\3\2\2\2\u04e9\u04ea\7\13\2\2\u04ea\u04eb"+
		"\7M\2\2\u04eb\u04ed\7\f\2\2\u04ec\u04e9\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\67\3\2\2\2\u04ee\u04f4\7\13\2\2\u04ef\u04f0\5> \2\u04f0\u04f1\7\5\2\2"+
		"\u04f1\u04f3\3\2\2\2\u04f2\u04ef\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2"+
		"\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7"+
		"\u04f8\5> \2\u04f8\u04f9\7\f\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04ee\3\2\2"+
		"\2\u04fa\u04fb\3\2\2\2\u04fb9\3\2\2\2\u04fc\u0502\7\13\2\2\u04fd\u04fe"+
		"\5@!\2\u04fe\u04ff\7\5\2\2\u04ff\u0501\3\2\2\2\u0500\u04fd\3\2\2\2\u0501"+
		"\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2"+
		"\2\2\u0504\u0502\3\2\2\2\u0505\u0506\5@!\2\u0506\u0507\7\f\2\2\u0507\u0509"+
		"\3\2\2\2\u0508\u04fc\3\2\2\2\u0508\u0509\3\2\2\2\u0509;\3\2\2\2\u050a"+
		"\u0510\7\13\2\2\u050b\u050c\5B\"\2\u050c\u050d\7\5\2\2\u050d\u050f\3\2"+
		"\2\2\u050e\u050b\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510"+
		"\u0511\3\2\2\2\u0511\u0513\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0514\5B"+
		"\"\2\u0514\u0515\7\f\2\2\u0515\u0517\3\2\2\2\u0516\u050a\3\2\2\2\u0516"+
		"\u0517\3\2\2\2\u0517=\3\2\2\2\u0518\u0519\t\2\2\2\u0519?\3\2\2\2\u051a"+
		"\u051b\t\3\2\2\u051bA\3\2\2\2\u051c\u051d\5D#\2\u051dC\3\2\2\2\u051e\u051f"+
		"\7Q\2\2\u051fE\3\2\2\2\u0520\u0521\7R\2\2\u0521G\3\2\2\2\u0522\u0523\t"+
		"\4\2\2\u0523I\3\2\2\2\u00a8MU\\iu\u0084\u0095\u0099\u00a5\u00a8\u00bb"+
		"\u00bf\u00d6\u00da\u00dd\u00ea\u00ee\u00f7\u00fa\u010e\u0112\u0115\u011d"+
		"\u0126\u012d\u0131\u013c\u0145\u014e\u015d\u016f\u0173\u0179\u0186\u018a"+
		"\u018e\u0197\u019b\u01a1\u01a8\u01ae\u01b7\u01bb\u01c0\u01cb\u01d4\u01de"+
		"\u01e4\u01ee\u01f4\u01f6\u0200\u0204\u0209\u0212\u0216\u0220\u0224\u022c"+
		"\u022f\u0238\u0244\u0246\u024f\u0253\u025d\u0264\u0266\u0276\u027a\u027f"+
		"\u0281\u0285\u0287\u0291\u0295\u02a0\u02a4\u02ad\u02b1\u02ba\u02bd\u02c6"+
		"\u02ce\u02d5\u02d7\u02dd\u02e2\u02f1\u02fc\u0300\u0303\u0320\u0324\u0327"+
		"\u032d\u0334\u033c\u0346\u0350\u035a\u035c\u0361\u0367\u0371\u0373\u037d"+
		"\u0381\u0386\u0390\u0394\u0399\u039f\u03a1\u03ab\u03af\u03b2\u03b6\u03bc"+
		"\u03be\u03c4\u03d0\u03d4\u03ec\u03f0\u03f3\u0406\u040d\u041c\u0426\u042a"+
		"\u0438\u043c\u0441\u0447\u0451\u0455\u0458\u045d\u0467\u0469\u0472\u0476"+
		"\u0481\u0485\u048f\u0493\u049c\u04a6\u04a8\u04b8\u04bc\u04c2\u04cb\u04cf"+
		"\u04d5\u04dc\u04e3\u04e7\u04ec\u04f4\u04fa\u0502\u0508\u0510\u0516";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}