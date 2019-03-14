// Generated from Proverif.g4 by ANTLR 4.7.1
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
		PIPE=25, PROCESS=26, CHANNEL=27, FREE=28, REDUC=29, FUN=30, CONST=31, 
		EQUATION=32, TABLE=33, PRED=34, LET=35, SET=36, EVENT=37, QUERY=38, NOT=39, 
		NOUNIF=40, FORALL=41, OTHERWISE=42, PUTBEGIN=43, INJEVENT=44, PHASE=45, 
		NEW=46, YIELD=47, DO=48, OUT=49, ELSE=50, SUCHTHAT=51, INSERT=52, IF=53, 
		THEN=54, GET=55, FAIL=56, ORWORD=57, FOREACH=58, CHOICE=59, TYPE=60, LETFUN=61, 
		OPTIONCHOICE=62, ID=63, INT=64, FLOAT=65, SINGLELINECOMMENT=66, MULTIPLELINESCOMMENT=67, 
		WS=68;
	public static final int
		RULE_programme = 0, RULE_declaration = 1, RULE_reduc = 2, RULE_reducprime = 3, 
		RULE_eqlist = 4, RULE_name = 5, RULE_value = 6, RULE_query = 7, RULE_gterm = 8, 
		RULE_gbinding = 9, RULE_nounifdecl = 10, RULE_gformat = 11, RULE_fbinding = 12, 
		RULE_clauses = 13, RULE_clause = 14, RULE_process = 15, RULE_pterm = 16, 
		RULE_ptermSequence = 17, RULE_term = 18, RULE_pattern = 19, RULE_patternSequence = 20, 
		RULE_mayfailterm = 21, RULE_typedecl = 22, RULE_failtypedecl = 23, RULE_proverifOptions = 24, 
		RULE_ident = 25, RULE_id = 26, RULE_integer = 27, RULE_typeid = 28;
	public static final String[] ruleNames = {
		"programme", "declaration", "reduc", "reducprime", "eqlist", "name", "value", 
		"query", "gterm", "gbinding", "nounifdecl", "gformat", "fbinding", "clauses", 
		"clause", "process", "pterm", "ptermSequence", "term", "pattern", "patternSequence", 
		"mayfailterm", "typedecl", "failtypedecl", "proverifOptions", "ident", 
		"id", "integer", "typeid"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", "'.'", "','", "';'", "')'", "'('", "':'", "'='", "'['", "']'", 
		"'in'", "'<>'", "'||'", "'&&'", "'==>'", "'/'", "'!'", "'->'", "'<-'", 
		"'<-R'", "'->R'", "'<->'", "'<=>'", "'<='", "'|'", "'process'", "'channel'", 
		"'free'", "'reduc'", "'fun'", "'const'", "'equation'", "'table'", "'pred'", 
		"'let'", "'set'", "'event'", "'query'", "'not'", "'nounif'", "'forall'", 
		"'otherwise'", "'putbegin'", "'inj-event'", "'phase'", "'new'", "'yield'", 
		"'do'", "'out'", "'else'", "'suchthat'", "'insert'", "'if'", "'then'", 
		"'get'", "'fail'", "'or'", "'foreach'", "'choice'", "'type'", "'letfun'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZERO", "POINT", "COMMA", "SEMICOLON", "RIGHTPARENTHESIS", "LEFTPARENTHESIS", 
		"COLON", "EQUAL", "LEFTBRACKET", "RIGHTBRACKET", "IN", "DIFF", "OR", "AND", 
		"IMPLICATES", "SLASH", "EXCLAMATION", "ARROW", "REVERSEARROW", "REVERSEARROWR", 
		"ARROWR", "DOUBLEARROW", "EQUIVALENT", "REVERSEIMPLICATES", "PIPE", "PROCESS", 
		"CHANNEL", "FREE", "REDUC", "FUN", "CONST", "EQUATION", "TABLE", "PRED", 
		"LET", "SET", "EVENT", "QUERY", "NOT", "NOUNIF", "FORALL", "OTHERWISE", 
		"PUTBEGIN", "INJEVENT", "PHASE", "NEW", "YIELD", "DO", "OUT", "ELSE", 
		"SUCHTHAT", "INSERT", "IF", "THEN", "GET", "FAIL", "ORWORD", "FOREACH", 
		"CHOICE", "TYPE", "LETFUN", "OPTIONCHOICE", "ID", "INT", "FLOAT", "SINGLELINECOMMENT", 
		"MULTIPLELINESCOMMENT", "WS"
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
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANNEL) | (1L << FREE) | (1L << REDUC) | (1L << FUN) | (1L << CONST) | (1L << EQUATION) | (1L << TABLE) | (1L << PRED) | (1L << LET) | (1L << SET) | (1L << EVENT) | (1L << QUERY) | (1L << NOT) | (1L << NOUNIF) | (1L << TYPE) | (1L << LETFUN))) != 0)) {
				{
				{
				setState(58);
				declaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(PROCESS);
			setState(65);
			process();
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
		public TerminalNode CONST() { return getToken(ProverifParser.CONST, 0); }
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
		public TerminalNode NOT() { return getToken(ProverifParser.NOT, 0); }
		public GtermContext gterm() {
			return getRuleContext(GtermContext.class,0);
		}
		public TerminalNode NOUNIF() { return getToken(ProverifParser.NOUNIF, 0); }
		public NounifdeclContext nounifdecl() {
			return getRuleContext(NounifdeclContext.class,0);
		}
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(TYPE);
				setState(68);
				ident();
				setState(69);
				proverifOptions();
				setState(70);
				match(POINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(CHANNEL);
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						ident();
						setState(74);
						match(COMMA);
						}
						} 
					}
					setState(80);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(81);
				ident();
				setState(82);
				match(POINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(FREE);
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(85);
						ident();
						setState(86);
						match(COMMA);
						}
						} 
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(93);
				ident();
				setState(94);
				match(COLON);
				setState(95);
				typeid();
				setState(96);
				proverifOptions();
				setState(97);
				match(POINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(CONST);
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(100);
						ident();
						setState(101);
						match(COMMA);
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(108);
				ident();
				setState(109);
				match(COLON);
				setState(110);
				typeid();
				setState(111);
				proverifOptions();
				setState(112);
				match(POINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(FUN);
				setState(115);
				ident();
				setState(116);
				match(LEFTPARENTHESIS);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(117);
							typeid();
							setState(118);
							match(COMMA);
							}
							} 
						}
						setState(124);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					setState(125);
					typeid();
					}
				}

				setState(128);
				match(RIGHTPARENTHESIS);
				setState(129);
				match(COLON);
				setState(130);
				typeid();
				setState(131);
				proverifOptions();
				setState(132);
				match(POINT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				match(LETFUN);
				setState(135);
				ident();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(136);
					match(LEFTPARENTHESIS);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(137);
						typedecl();
						}
					}

					setState(140);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(143);
				match(EQUAL);
				setState(144);
				pterm();
				setState(145);
				match(POINT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(REDUC);
				setState(148);
				reduc();
				setState(149);
				proverifOptions();
				setState(150);
				match(POINT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				match(FUN);
				setState(153);
				ident();
				setState(154);
				match(LEFTPARENTHESIS);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(155);
							typeid();
							setState(156);
							match(COMMA);
							}
							} 
						}
						setState(162);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					setState(163);
					typeid();
					}
				}

				setState(166);
				match(RIGHTPARENTHESIS);
				setState(167);
				match(COLON);
				setState(168);
				typeid();
				setState(169);
				match(REDUC);
				setState(170);
				reducprime();
				setState(171);
				proverifOptions();
				setState(172);
				match(POINT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				match(EQUATION);
				setState(175);
				eqlist();
				setState(176);
				proverifOptions();
				setState(177);
				match(POINT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				match(PRED);
				setState(180);
				ident();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(181);
					match(LEFTPARENTHESIS);
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CHANNEL || _la==ID) {
						{
						setState(187);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(182);
								typeid();
								setState(183);
								match(COMMA);
								}
								} 
							}
							setState(189);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						setState(190);
						typeid();
						}
					}

					setState(193);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(196);
				proverifOptions();
				setState(197);
				match(POINT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(199);
				match(TABLE);
				setState(200);
				ident();
				setState(201);
				match(LEFTPARENTHESIS);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(202);
							typeid();
							setState(203);
							match(COMMA);
							}
							} 
						}
						setState(209);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					setState(210);
					typeid();
					}
				}

				setState(213);
				match(RIGHTPARENTHESIS);
				setState(214);
				match(POINT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(216);
				match(LET);
				setState(217);
				ident();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(218);
					match(LEFTPARENTHESIS);
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(219);
						typedecl();
						}
					}

					setState(222);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(225);
				match(EQUAL);
				setState(226);
				process();
				setState(227);
				match(POINT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(229);
				match(SET);
				setState(230);
				name();
				setState(231);
				match(EQUAL);
				setState(232);
				value();
				setState(233);
				match(POINT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(235);
				match(EVENT);
				setState(236);
				ident();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(237);
					match(LEFTPARENTHESIS);
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CHANNEL || _la==ID) {
						{
						setState(243);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(238);
								typeid();
								setState(239);
								match(COMMA);
								}
								} 
							}
							setState(245);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						}
						setState(246);
						typeid();
						}
					}

					setState(249);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(252);
				match(POINT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(254);
				match(QUERY);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(255);
					typedecl();
					setState(256);
					match(SEMICOLON);
					}
					break;
				}
				setState(260);
				query();
				setState(261);
				match(POINT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(263);
				match(NOT);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(264);
					typedecl();
					setState(265);
					match(SEMICOLON);
					}
					break;
				}
				setState(269);
				gterm();
				setState(270);
				match(POINT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(272);
				match(NOUNIF);
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(273);
					typedecl();
					setState(274);
					match(SEMICOLON);
					}
					break;
				}
				setState(278);
				nounifdecl();
				setState(279);
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
		enterRule(_localctx, 4, RULE_reduc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(283);
				match(FORALL);
				setState(284);
				typedecl();
				setState(285);
				match(SEMICOLON);
				}
			}

			setState(289);
			term();
			setState(290);
			match(EQUAL);
			setState(291);
			term();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(292);
				match(SEMICOLON);
				setState(293);
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
		enterRule(_localctx, 6, RULE_reducprime);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(296);
				match(FORALL);
				setState(297);
				failtypedecl();
				setState(298);
				match(SEMICOLON);
				}
			}

			setState(302);
			ident();
			setState(303);
			match(LEFTPARENTHESIS);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << NOT) | (1L << FAIL) | (1L << ID))) != 0)) {
				{
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(304);
						mayfailterm();
						setState(305);
						match(COMMA);
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(312);
				mayfailterm();
				}
			}

			setState(315);
			match(RIGHTPARENTHESIS);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(316);
				match(OTHERWISE);
				setState(317);
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
		enterRule(_localctx, 8, RULE_eqlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(320);
			match(FORALL);
			setState(321);
			typedecl();
			setState(322);
			match(SEMICOLON);
			}
			setState(324);
			term();
			setState(325);
			match(EQUAL);
			setState(326);
			term();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(327);
				match(SEMICOLON);
				setState(328);
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
		enterRule(_localctx, 10, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
		enterRule(_localctx, 12, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 14, RULE_query);
		int _la;
		try {
			int _alt;
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				gterm();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(336);
					match(SEMICOLON);
					setState(337);
					query();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(PUTBEGIN);
				setState(341);
				match(EVENT);
				setState(342);
				match(COLON);
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(343);
						ident();
						setState(344);
						match(COMMA);
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(351);
				ident();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(352);
					match(SEMICOLON);
					setState(353);
					query();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(PUTBEGIN);
				setState(357);
				match(INJEVENT);
				setState(358);
				match(COLON);
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						ident();
						setState(360);
						match(COMMA);
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(367);
				ident();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(368);
					match(SEMICOLON);
					setState(369);
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
		enterRule(_localctx, 16, RULE_gterm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(374);
				ident();
				}
				break;
			case 2:
				{
				setState(375);
				ident();
				setState(376);
				match(LEFTPARENTHESIS);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(382);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(377);
							gterm();
							setState(378);
							match(COMMA);
							}
							} 
						}
						setState(384);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					}
					setState(385);
					gterm();
					}
				}

				setState(388);
				match(RIGHTPARENTHESIS);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PHASE) {
					{
					setState(389);
					match(PHASE);
					setState(390);
					integer();
					}
				}

				}
				break;
			case 3:
				{
				setState(393);
				match(EVENT);
				setState(394);
				match(LEFTPARENTHESIS);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(395);
							gterm();
							setState(396);
							match(COMMA);
							}
							} 
						}
						setState(402);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					}
					setState(403);
					gterm();
					}
				}

				setState(406);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				{
				setState(407);
				match(INJEVENT);
				setState(408);
				match(LEFTPARENTHESIS);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(409);
							gterm();
							setState(410);
							match(COMMA);
							}
							} 
						}
						setState(416);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					}
					setState(417);
					gterm();
					}
				}

				setState(420);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				{
				setState(421);
				match(LEFTPARENTHESIS);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(422);
							gterm();
							setState(423);
							match(COMMA);
							}
							} 
						}
						setState(429);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
					}
					setState(430);
					gterm();
					}
				}

				setState(433);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 6:
				{
				setState(434);
				match(NEW);
				setState(435);
				ident();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(436);
					match(LEFTBRACKET);
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXCLAMATION || _la==ID) {
						{
						setState(437);
						gbinding();
						}
					}

					setState(440);
					match(RIGHTBRACKET);
					}
				}

				}
				break;
			case 7:
				{
				setState(443);
				match(LET);
				setState(444);
				ident();
				setState(445);
				match(EQUAL);
				setState(446);
				gterm();
				setState(447);
				match(IN);
				setState(448);
				gterm();
				}
				break;
			}
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(462);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(452);
						match(EQUAL);
						setState(453);
						gterm();
						}
						break;
					case DIFF:
						{
						setState(454);
						match(DIFF);
						setState(455);
						gterm();
						}
						break;
					case OR:
						{
						setState(456);
						match(OR);
						setState(457);
						gterm();
						}
						break;
					case AND:
						{
						setState(458);
						match(AND);
						setState(459);
						gterm();
						}
						break;
					case IMPLICATES:
						{
						setState(460);
						match(IMPLICATES);
						setState(461);
						gterm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 18, RULE_gbinding);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(EXCLAMATION);
				setState(468);
				integer();
				setState(469);
				match(EQUAL);
				setState(470);
				gterm();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(471);
					match(SEMICOLON);
					setState(472);
					gbinding();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				ident();
				setState(476);
				match(EQUAL);
				setState(477);
				gterm();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(478);
					match(SEMICOLON);
					setState(479);
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
		enterRule(_localctx, 20, RULE_nounifdecl);
		int _la;
		try {
			int _alt;
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(LET);
				setState(485);
				ident();
				setState(486);
				match(EQUAL);
				setState(487);
				gformat();
				setState(488);
				match(IN);
				setState(489);
				nounifdecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				ident();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(492);
					match(LEFTPARENTHESIS);
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW) | (1L << ID))) != 0)) {
						{
						setState(498);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(493);
								gformat();
								setState(494);
								match(COMMA);
								}
								} 
							}
							setState(500);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						}
						setState(501);
						gformat();
						}
					}

					setState(504);
					match(RIGHTPARENTHESIS);
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PHASE) {
						{
						setState(505);
						match(PHASE);
						setState(506);
						integer();
						}
					}

					}
				}

				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(511);
					match(SLASH);
					setState(512);
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
		enterRule(_localctx, 22, RULE_gformat);
		int _la;
		try {
			int _alt;
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				ident();
				setState(519);
				match(LEFTPARENTHESIS);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(525);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(520);
							gformat();
							setState(521);
							match(COMMA);
							}
							} 
						}
						setState(527);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					}
					setState(528);
					gformat();
					}
				}

				setState(531);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(NOT);
				setState(534);
				match(LEFTPARENTHESIS);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(540);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(535);
							gformat();
							setState(536);
							match(COMMA);
							}
							} 
						}
						setState(542);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
					}
					setState(543);
					gformat();
					}
				}

				setState(546);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				match(LEFTPARENTHESIS);
				setState(557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(548);
							gformat();
							setState(549);
							match(COMMA);
							}
							} 
						}
						setState(555);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					setState(556);
					gformat();
					}
					break;
				}
				setState(559);
				gformat();
				setState(560);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(562);
				match(NEW);
				setState(563);
				ident();
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(564);
					match(LEFTBRACKET);
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXCLAMATION || _la==ID) {
						{
						setState(565);
						fbinding();
						}
					}

					setState(568);
					match(RIGHTBRACKET);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(571);
				match(LET);
				setState(572);
				ident();
				setState(573);
				match(EQUAL);
				setState(574);
				gformat();
				setState(575);
				match(IN);
				setState(576);
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
		enterRule(_localctx, 24, RULE_fbinding);
		int _la;
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(EXCLAMATION);
				setState(581);
				integer();
				setState(582);
				match(EQUAL);
				setState(583);
				gformat();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(584);
					match(SEMICOLON);
					setState(585);
					fbinding();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				ident();
				setState(589);
				match(EQUAL);
				setState(590);
				gformat();
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(591);
					match(SEMICOLON);
					setState(592);
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
		enterRule(_localctx, 26, RULE_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(597);
				match(FORALL);
				setState(598);
				failtypedecl();
				setState(599);
				match(SEMICOLON);
				}
			}

			setState(603);
			clause();
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(604);
				match(SEMICOLON);
				setState(605);
				clauses();
				}
				break;
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
		enterRule(_localctx, 28, RULE_clause);
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				term();
				setState(610);
				match(ARROW);
				setState(611);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				term();
				setState(614);
				match(DOUBLEARROW);
				setState(615);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
				term();
				setState(618);
				match(EQUIVALENT);
				setState(619);
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
		enterRule(_localctx, 30, RULE_process);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(623);
				match(ZERO);
				}
				break;
			case 2:
				{
				setState(624);
				match(YIELD);
				}
				break;
			case 3:
				{
				setState(625);
				ident();
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(626);
					match(LEFTPARENTHESIS);
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
						{
						setState(632);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(627);
								pterm();
								setState(628);
								match(COMMA);
								}
								} 
							}
							setState(634);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
						}
						setState(635);
						pterm();
						}
					}

					setState(638);
					match(RIGHTPARENTHESIS);
					}
				}

				}
				break;
			case 4:
				{
				setState(641);
				match(LEFTPARENTHESIS);
				setState(642);
				process();
				setState(643);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				{
				setState(645);
				match(EXCLAMATION);
				setState(646);
				process();
				}
				break;
			case 6:
				{
				setState(647);
				match(EXCLAMATION);
				setState(648);
				ident();
				setState(649);
				match(REVERSEIMPLICATES);
				setState(650);
				ident();
				setState(651);
				process();
				}
				break;
			case 7:
				{
				setState(653);
				match(FOREACH);
				setState(654);
				ident();
				setState(655);
				match(REVERSEIMPLICATES);
				setState(656);
				ident();
				setState(657);
				match(DO);
				setState(658);
				process();
				}
				break;
			case 8:
				{
				setState(660);
				match(NEW);
				setState(661);
				ident();
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(662);
					match(LEFTBRACKET);
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(668);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(663);
								ident();
								setState(664);
								match(COMMA);
								}
								} 
							}
							setState(670);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
						}
						setState(671);
						ident();
						}
					}

					setState(674);
					match(RIGHTBRACKET);
					}
				}

				setState(677);
				match(COLON);
				setState(678);
				typeid();
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(679);
					match(SEMICOLON);
					setState(680);
					process();
					}
				}

				}
				break;
			case 9:
				{
				setState(683);
				ident();
				setState(684);
				match(REVERSEARROWR);
				setState(685);
				typeid();
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(686);
					match(SEMICOLON);
					setState(687);
					process();
					}
				}

				}
				break;
			case 10:
				{
				setState(690);
				match(IF);
				setState(691);
				pterm();
				setState(692);
				match(THEN);
				setState(693);
				process();
				setState(696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(694);
					match(ELSE);
					setState(695);
					process();
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(698);
				match(IN);
				setState(699);
				match(LEFTPARENTHESIS);
				setState(700);
				pterm();
				setState(701);
				match(COMMA);
				setState(702);
				pattern();
				setState(703);
				match(RIGHTPARENTHESIS);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(704);
					match(SEMICOLON);
					setState(705);
					process();
					}
				}

				}
				break;
			case 12:
				{
				setState(708);
				match(OUT);
				setState(709);
				match(LEFTPARENTHESIS);
				setState(710);
				pterm();
				setState(711);
				match(COMMA);
				setState(712);
				pterm();
				setState(713);
				match(RIGHTPARENTHESIS);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(714);
					match(SEMICOLON);
					setState(715);
					process();
					}
				}

				}
				break;
			case 13:
				{
				setState(718);
				match(LET);
				setState(719);
				pattern();
				setState(720);
				match(EQUAL);
				setState(721);
				pterm();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(722);
					match(IN);
					setState(723);
					process();
					setState(726);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(724);
						match(ELSE);
						setState(725);
						process();
						}
						break;
					}
					}
				}

				}
				break;
			case 14:
				{
				setState(730);
				ident();
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(731);
					match(COLON);
					setState(732);
					typeid();
					}
				}

				setState(735);
				match(REVERSEARROW);
				setState(736);
				pterm();
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(737);
					match(SEMICOLON);
					setState(738);
					process();
					}
				}

				}
				break;
			case 15:
				{
				setState(741);
				match(LET);
				setState(742);
				typedecl();
				setState(743);
				match(SUCHTHAT);
				setState(744);
				pterm();
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(745);
					match(IN);
					setState(746);
					process();
					setState(749);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(747);
						match(ELSE);
						setState(748);
						process();
						}
						break;
					}
					}
				}

				}
				break;
			case 16:
				{
				setState(753);
				match(INSERT);
				setState(754);
				ident();
				setState(755);
				match(LEFTPARENTHESIS);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
					{
					setState(761);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(756);
							pterm();
							setState(757);
							match(COMMA);
							}
							} 
						}
						setState(763);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
					}
					setState(764);
					pterm();
					}
				}

				setState(767);
				match(RIGHTPARENTHESIS);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(768);
					match(SEMICOLON);
					setState(769);
					process();
					}
				}

				}
				break;
			case 17:
				{
				setState(772);
				match(GET);
				setState(773);
				ident();
				setState(774);
				match(LEFTPARENTHESIS);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << EQUAL) | (1L << ID))) != 0)) {
					{
					setState(780);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(775);
							pattern();
							setState(776);
							match(COMMA);
							}
							} 
						}
						setState(782);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					}
					setState(783);
					pattern();
					}
				}

				setState(786);
				match(RIGHTPARENTHESIS);
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUCHTHAT) {
					{
					setState(787);
					match(SUCHTHAT);
					setState(788);
					pterm();
					}
				}

				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(791);
					match(IN);
					setState(792);
					process();
					setState(795);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(793);
						match(ELSE);
						setState(794);
						process();
						}
						break;
					}
					}
				}

				}
				break;
			case 18:
				{
				setState(799);
				match(EVENT);
				setState(800);
				ident();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(801);
					match(LEFTPARENTHESIS);
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
						{
						setState(807);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(802);
								pterm();
								setState(803);
								match(COMMA);
								}
								} 
							}
							setState(809);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
						}
						setState(810);
						pterm();
						}
					}

					setState(813);
					match(RIGHTPARENTHESIS);
					}
				}

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
			case 19:
				{
				setState(820);
				match(PHASE);
				setState(821);
				integer();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(822);
					match(SEMICOLON);
					setState(823);
					process();
					}
				}

				}
				break;
			}
			setState(832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(828);
					match(PIPE);
					setState(829);
					process();
					}
					} 
				}
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
		public TerminalNode LEFTPARENTHESIS() { return getToken(ProverifParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(ProverifParser.RIGHTPARENTHESIS, 0); }
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
		enterRule(_localctx, 32, RULE_pterm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(835);
				ident();
				}
				break;
			case 2:
				{
				setState(836);
				ptermSequence();
				}
				break;
			case 3:
				{
				setState(837);
				ident();
				setState(838);
				ptermSequence();
				}
				break;
			case 4:
				{
				setState(840);
				match(CHOICE);
				setState(841);
				match(LEFTBRACKET);
				setState(842);
				pterm();
				setState(843);
				match(COMMA);
				setState(844);
				pterm();
				setState(845);
				match(RIGHTBRACKET);
				}
				break;
			case 5:
				{
				setState(847);
				match(NOT);
				setState(848);
				match(LEFTPARENTHESIS);
				setState(849);
				pterm();
				setState(850);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 6:
				{
				setState(852);
				match(NEW);
				setState(853);
				ident();
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(854);
					match(LEFTBRACKET);
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(860);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(855);
								ident();
								setState(856);
								match(COMMA);
								}
								} 
							}
							setState(862);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
						}
						setState(863);
						ident();
						}
					}

					setState(866);
					match(RIGHTBRACKET);
					}
				}

				setState(869);
				match(COLON);
				setState(870);
				typeid();
				setState(871);
				match(SEMICOLON);
				setState(872);
				pterm();
				}
				break;
			case 7:
				{
				setState(874);
				ident();
				setState(875);
				match(REVERSEARROWR);
				setState(876);
				typeid();
				setState(877);
				match(SEMICOLON);
				setState(878);
				pterm();
				}
				break;
			case 8:
				{
				setState(880);
				match(IF);
				setState(881);
				pterm();
				setState(882);
				match(THEN);
				setState(883);
				pterm();
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(884);
					match(ELSE);
					setState(885);
					pterm();
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(888);
				match(LET);
				setState(889);
				pattern();
				}
				break;
			case 10:
				{
				setState(890);
				ident();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(891);
					match(COLON);
					setState(892);
					typeid();
					}
				}

				setState(895);
				match(REVERSEARROW);
				setState(896);
				pterm();
				setState(897);
				match(SEMICOLON);
				setState(898);
				pterm();
				}
				break;
			case 11:
				{
				setState(900);
				match(LET);
				setState(901);
				typedecl();
				setState(902);
				match(SUCHTHAT);
				setState(903);
				pterm();
				setState(904);
				match(IN);
				setState(905);
				pterm();
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(906);
					match(ELSE);
					setState(907);
					pterm();
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(910);
				match(INSERT);
				setState(911);
				ident();
				setState(912);
				match(LEFTPARENTHESIS);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
					{
					setState(918);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(913);
							pterm();
							setState(914);
							match(COMMA);
							}
							} 
						}
						setState(920);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
					}
					setState(921);
					pterm();
					}
				}

				setState(924);
				match(RIGHTPARENTHESIS);
				setState(925);
				match(SEMICOLON);
				setState(926);
				pterm();
				}
				break;
			case 13:
				{
				setState(928);
				match(GET);
				setState(929);
				ident();
				setState(930);
				match(LEFTPARENTHESIS);
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << EQUAL) | (1L << ID))) != 0)) {
					{
					setState(936);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(931);
							pattern();
							setState(932);
							match(COMMA);
							}
							} 
						}
						setState(938);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
					}
					setState(939);
					pattern();
					}
				}

				setState(942);
				match(RIGHTPARENTHESIS);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUCHTHAT) {
					{
					setState(943);
					match(SUCHTHAT);
					setState(944);
					pterm();
					}
				}

				setState(947);
				match(IN);
				setState(948);
				pterm();
				setState(951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(949);
					match(ELSE);
					setState(950);
					pterm();
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(953);
				match(EVENT);
				setState(954);
				ident();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(955);
					match(LEFTPARENTHESIS);
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
						{
						setState(961);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(956);
								pterm();
								setState(957);
								match(COMMA);
								}
								} 
							}
							setState(963);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
						}
						setState(964);
						pterm();
						}
					}

					setState(967);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(970);
				match(SEMICOLON);
				setState(971);
				pterm();
				}
				break;
			}
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(983);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(975);
						match(EQUAL);
						setState(976);
						pterm();
						}
						break;
					case DIFF:
						{
						setState(977);
						match(DIFF);
						setState(978);
						pterm();
						}
						break;
					case AND:
						{
						setState(979);
						match(AND);
						setState(980);
						pterm();
						}
						break;
					case OR:
						{
						setState(981);
						match(OR);
						setState(982);
						pterm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
		enterRule(_localctx, 34, RULE_ptermSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(LEFTPARENTHESIS);
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
				{
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(989);
						gterm();
						setState(990);
						match(COMMA);
						}
						} 
					}
					setState(996);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(997);
				gterm();
				}
			}

			setState(1000);
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
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1002);
				ident();
				}
				break;
			case 2:
				{
				setState(1003);
				match(LEFTPARENTHESIS);
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << NOT) | (1L << ID))) != 0)) {
					{
					setState(1009);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1004);
							term();
							setState(1005);
							match(COMMA);
							}
							} 
						}
						setState(1011);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
					}
					setState(1012);
					term();
					}
				}

				setState(1015);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 3:
				{
				setState(1016);
				ident();
				setState(1017);
				match(LEFTPARENTHESIS);
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << NOT) | (1L << ID))) != 0)) {
					{
					setState(1023);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1018);
							term();
							setState(1019);
							match(COMMA);
							}
							} 
						}
						setState(1025);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(1026);
					term();
					}
				}

				setState(1029);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				{
				setState(1031);
				match(NOT);
				setState(1032);
				match(LEFTPARENTHESIS);
				setState(1033);
				term();
				setState(1034);
				match(RIGHTPARENTHESIS);
				}
				break;
			}
			setState(1048);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1046);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(1038);
						match(EQUAL);
						setState(1039);
						term();
						}
						break;
					case DIFF:
						{
						setState(1040);
						match(DIFF);
						setState(1041);
						term();
						}
						break;
					case AND:
						{
						setState(1042);
						match(AND);
						setState(1043);
						term();
						}
						break;
					case OR:
						{
						setState(1044);
						match(OR);
						setState(1045);
						term();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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
		enterRule(_localctx, 38, RULE_pattern);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				ident();
				setState(1053);
				match(COLON);
				setState(1054);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
				patternSequence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1057);
				ident();
				setState(1058);
				patternSequence();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1060);
				match(EQUAL);
				setState(1061);
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
		enterRule(_localctx, 40, RULE_patternSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(LEFTPARENTHESIS);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << EQUAL) | (1L << ID))) != 0)) {
				{
				setState(1070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1065);
						pattern();
						setState(1066);
						match(COMMA);
						}
						} 
					}
					setState(1072);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				setState(1073);
				pattern();
				}
			}

			setState(1076);
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
		enterRule(_localctx, 42, RULE_mayfailterm);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESIS:
			case NOT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				term();
				}
				break;
			case FAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
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
		enterRule(_localctx, 44, RULE_typedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			ident();
			setState(1083);
			match(COLON);
			setState(1084);
			typeid();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1085);
				match(COMMA);
				setState(1086);
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
		enterRule(_localctx, 46, RULE_failtypedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			ident();
			setState(1090);
			match(COLON);
			setState(1091);
			typeid();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORWORD) {
				{
				setState(1092);
				match(ORWORD);
				setState(1093);
				match(FAIL);
				}
			}

			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1096);
				match(COMMA);
				setState(1097);
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

	public static class ProverifOptionsContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(ProverifParser.LEFTBRACKET, 0); }
		public List<TerminalNode> OPTIONCHOICE() { return getTokens(ProverifParser.OPTIONCHOICE); }
		public TerminalNode OPTIONCHOICE(int i) {
			return getToken(ProverifParser.OPTIONCHOICE, i);
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
		enterRule(_localctx, 48, RULE_proverifOptions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(1100);
				match(LEFTBRACKET);
				setState(1105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1101);
						match(OPTIONCHOICE);
						setState(1102);
						match(COMMA);
						}
						} 
					}
					setState(1107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				setState(1108);
				match(OPTIONCHOICE);
				setState(1109);
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
		enterRule(_localctx, 50, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
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
		enterRule(_localctx, 52, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
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
		enterRule(_localctx, 54, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
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
		enterRule(_localctx, 56, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0463\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3O\n\3\f\3"+
		"\16\3R\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\5\3\u0081"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u008d\n\3\3\3\5\3\u0090"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00a1"+
		"\n\3\f\3\16\3\u00a4\13\3\3\3\5\3\u00a7\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00bc\n\3\f\3\16"+
		"\3\u00bf\13\3\3\3\5\3\u00c2\n\3\3\3\5\3\u00c5\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\u00d0\n\3\f\3\16\3\u00d3\13\3\3\3\5\3\u00d6\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00df\n\3\3\3\5\3\u00e2\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00f4\n\3\f\3"+
		"\16\3\u00f7\13\3\3\3\5\3\u00fa\n\3\3\3\5\3\u00fd\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u0105\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u010e\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u0117\n\3\3\3\3\3\3\3\5\3\u011c\n\3\3\4\3\4\3"+
		"\4\3\4\5\4\u0122\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u0129\n\4\3\5\3\5\3\5\3\5"+
		"\5\5\u012f\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0136\n\5\f\5\16\5\u0139\13\5\3"+
		"\5\5\5\u013c\n\5\3\5\3\5\3\5\5\5\u0141\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u014c\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u0155\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u015d\n\t\f\t\16\t\u0160\13\t\3\t\3\t\3\t\5\t\u0165"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u016d\n\t\f\t\16\t\u0170\13\t\3\t\3\t"+
		"\3\t\5\t\u0175\n\t\5\t\u0177\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u017f\n\n"+
		"\f\n\16\n\u0182\13\n\3\n\5\n\u0185\n\n\3\n\3\n\3\n\5\n\u018a\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0191\n\n\f\n\16\n\u0194\13\n\3\n\5\n\u0197\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u019f\n\n\f\n\16\n\u01a2\13\n\3\n\5\n\u01a5\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u01ac\n\n\f\n\16\n\u01af\13\n\3\n\5\n\u01b2"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u01b9\n\n\3\n\5\n\u01bc\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u01c5\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\n\u01d1\n\n\f\n\16\n\u01d4\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01dc"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u01e3\n\13\5\13\u01e5\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u01f3\n\f\f\f\16\f\u01f6"+
		"\13\f\3\f\5\f\u01f9\n\f\3\f\3\f\3\f\5\f\u01fe\n\f\5\f\u0200\n\f\3\f\3"+
		"\f\5\f\u0204\n\f\5\f\u0206\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u020e\n\r\f"+
		"\r\16\r\u0211\13\r\3\r\5\r\u0214\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u021d"+
		"\n\r\f\r\16\r\u0220\13\r\3\r\5\r\u0223\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u022a"+
		"\n\r\f\r\16\r\u022d\13\r\3\r\5\r\u0230\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0239\n\r\3\r\5\r\u023c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0245"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u024d\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0254\n\16\5\16\u0256\n\16\3\17\3\17\3\17\3\17\5\17\u025c\n"+
		"\17\3\17\3\17\3\17\5\17\u0261\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0270\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u0279\n\21\f\21\16\21\u027c\13\21\3\21\5\21\u027f\n\21"+
		"\3\21\5\21\u0282\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u029d\n\21\f\21\16\21\u02a0\13\21\3\21\5\21\u02a3\n\21\3\21"+
		"\5\21\u02a6\n\21\3\21\3\21\3\21\3\21\5\21\u02ac\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u02b3\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02bb\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02c5\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u02cf\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u02d9\n\21\5\21\u02db\n\21\3\21\3\21\3\21\5\21\u02e0\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u02e6\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u02f0\n\21\5\21\u02f2\n\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u02fa\n\21\f\21\16\21\u02fd\13\21\3\21\5\21\u0300\n\21\3\21\3"+
		"\21\3\21\5\21\u0305\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u030d\n\21"+
		"\f\21\16\21\u0310\13\21\3\21\5\21\u0313\n\21\3\21\3\21\3\21\5\21\u0318"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u031e\n\21\5\21\u0320\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u0328\n\21\f\21\16\21\u032b\13\21\3\21\5\21\u032e"+
		"\n\21\3\21\5\21\u0331\n\21\3\21\3\21\5\21\u0335\n\21\3\21\3\21\3\21\3"+
		"\21\5\21\u033b\n\21\5\21\u033d\n\21\3\21\3\21\7\21\u0341\n\21\f\21\16"+
		"\21\u0344\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u035d"+
		"\n\22\f\22\16\22\u0360\13\22\3\22\5\22\u0363\n\22\3\22\5\22\u0366\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0379\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0380\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u038f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0397\n\22\f\22\16\22"+
		"\u039a\13\22\3\22\5\22\u039d\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u03a9\n\22\f\22\16\22\u03ac\13\22\3\22\5\22\u03af\n"+
		"\22\3\22\3\22\3\22\5\22\u03b4\n\22\3\22\3\22\3\22\3\22\5\22\u03ba\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u03c2\n\22\f\22\16\22\u03c5\13\22"+
		"\3\22\5\22\u03c8\n\22\3\22\5\22\u03cb\n\22\3\22\3\22\3\22\5\22\u03d0\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u03da\n\22\f\22\16\22"+
		"\u03dd\13\22\3\23\3\23\3\23\3\23\7\23\u03e3\n\23\f\23\16\23\u03e6\13\23"+
		"\3\23\5\23\u03e9\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u03f2\n"+
		"\24\f\24\16\24\u03f5\13\24\3\24\5\24\u03f8\n\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u0400\n\24\f\24\16\24\u0403\13\24\3\24\5\24\u0406\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u040f\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0419\n\24\f\24\16\24\u041c\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0429\n\25\3\26\3\26"+
		"\3\26\3\26\7\26\u042f\n\26\f\26\16\26\u0432\13\26\3\26\5\26\u0435\n\26"+
		"\3\26\3\26\3\27\3\27\5\27\u043b\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0442"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0449\n\31\3\31\3\31\5\31\u044d\n"+
		"\31\3\32\3\32\3\32\7\32\u0452\n\32\f\32\16\32\u0455\13\32\3\32\3\32\5"+
		"\32\u0459\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\2\2\37\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\4\2\35"+
		"\35AA\2\u0518\2?\3\2\2\2\4\u011b\3\2\2\2\6\u0121\3\2\2\2\b\u012e\3\2\2"+
		"\2\n\u0142\3\2\2\2\f\u014d\3\2\2\2\16\u014f\3\2\2\2\20\u0176\3\2\2\2\22"+
		"\u01c4\3\2\2\2\24\u01e4\3\2\2\2\26\u0205\3\2\2\2\30\u0244\3\2\2\2\32\u0255"+
		"\3\2\2\2\34\u025b\3\2\2\2\36\u026f\3\2\2\2 \u033c\3\2\2\2\"\u03cf\3\2"+
		"\2\2$\u03de\3\2\2\2&\u040e\3\2\2\2(\u0428\3\2\2\2*\u042a\3\2\2\2,\u043a"+
		"\3\2\2\2.\u043c\3\2\2\2\60\u0443\3\2\2\2\62\u0458\3\2\2\2\64\u045a\3\2"+
		"\2\2\66\u045c\3\2\2\28\u045e\3\2\2\2:\u0460\3\2\2\2<>\5\4\3\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\34\2\2CD\5 \21"+
		"\2D\3\3\2\2\2EF\7>\2\2FG\5\64\33\2GH\5\62\32\2HI\7\4\2\2I\u011c\3\2\2"+
		"\2JP\7\35\2\2KL\5\64\33\2LM\7\5\2\2MO\3\2\2\2NK\3\2\2\2OR\3\2\2\2PN\3"+
		"\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\64\33\2TU\7\4\2\2U\u011c\3\2"+
		"\2\2V\\\7\36\2\2WX\5\64\33\2XY\7\5\2\2Y[\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\5\64\33\2`a\7\t\2\2ab\5:\36"+
		"\2bc\5\62\32\2cd\7\4\2\2d\u011c\3\2\2\2ek\7!\2\2fg\5\64\33\2gh\7\5\2\2"+
		"hj\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2"+
		"no\5\64\33\2op\7\t\2\2pq\5:\36\2qr\5\62\32\2rs\7\4\2\2s\u011c\3\2\2\2"+
		"tu\7 \2\2uv\5\64\33\2v\u0080\7\b\2\2wx\5:\36\2xy\7\5\2\2y{\3\2\2\2zw\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0081"+
		"\5:\36\2\u0080|\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\7\7\2\2\u0083\u0084\7\t\2\2\u0084\u0085\5:\36\2\u0085\u0086\5\62"+
		"\32\2\u0086\u0087\7\4\2\2\u0087\u011c\3\2\2\2\u0088\u0089\7?\2\2\u0089"+
		"\u008f\5\64\33\2\u008a\u008c\7\b\2\2\u008b\u008d\5.\30\2\u008c\u008b\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\7\7\2\2\u008f"+
		"\u008a\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\n"+
		"\2\2\u0092\u0093\5\"\22\2\u0093\u0094\7\4\2\2\u0094\u011c\3\2\2\2\u0095"+
		"\u0096\7\37\2\2\u0096\u0097\5\6\4\2\u0097\u0098\5\62\32\2\u0098\u0099"+
		"\7\4\2\2\u0099\u011c\3\2\2\2\u009a\u009b\7 \2\2\u009b\u009c\5\64\33\2"+
		"\u009c\u00a6\7\b\2\2\u009d\u009e\5:\36\2\u009e\u009f\7\5\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5:"+
		"\36\2\u00a6\u00a2\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\7\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\5:\36\2\u00ab\u00ac\7\37"+
		"\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\5\62\32\2\u00ae\u00af\7\4\2\2\u00af"+
		"\u011c\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\5\62"+
		"\32\2\u00b3\u00b4\7\4\2\2\u00b4\u011c\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6"+
		"\u00c4\5\64\33\2\u00b7\u00c1\7\b\2\2\u00b8\u00b9\5:\36\2\u00b9\u00ba\7"+
		"\5\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c2\5:\36\2\u00c1\u00bd\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\7\7\2\2\u00c4\u00b7\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\5\62\32\2\u00c7\u00c8\7\4\2\2\u00c8"+
		"\u011c\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb\5\64\33\2\u00cb\u00d5\7"+
		"\b\2\2\u00cc\u00cd\5:\36\2\u00cd\u00ce\7\5\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\5:\36\2\u00d5"+
		"\u00d1\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\7"+
		"\2\2\u00d8\u00d9\7\4\2\2\u00d9\u011c\3\2\2\2\u00da\u00db\7%\2\2\u00db"+
		"\u00e1\5\64\33\2\u00dc\u00de\7\b\2\2\u00dd\u00df\5.\30\2\u00de\u00dd\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\7\7\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\n"+
		"\2\2\u00e4\u00e5\5 \21\2\u00e5\u00e6\7\4\2\2\u00e6\u011c\3\2\2\2\u00e7"+
		"\u00e8\7&\2\2\u00e8\u00e9\5\f\7\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\5\16"+
		"\b\2\u00eb\u00ec\7\4\2\2\u00ec\u011c\3\2\2\2\u00ed\u00ee\7\'\2\2\u00ee"+
		"\u00fc\5\64\33\2\u00ef\u00f9\7\b\2\2\u00f0\u00f1\5:\36\2\u00f1\u00f2\7"+
		"\5\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fa\5:\36\2\u00f9\u00f5\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\7\7\2\2\u00fc\u00ef\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\4\2\2\u00ff\u011c\3\2\2\2\u0100"+
		"\u0104\7(\2\2\u0101\u0102\5.\30\2\u0102\u0103\7\6\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0101\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\5\20\t\2\u0107\u0108\7\4\2\2\u0108\u011c\3\2\2\2\u0109\u010d\7"+
		")\2\2\u010a\u010b\5.\30\2\u010b\u010c\7\6\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010a\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5\22"+
		"\n\2\u0110\u0111\7\4\2\2\u0111\u011c\3\2\2\2\u0112\u0116\7*\2\2\u0113"+
		"\u0114\5.\30\2\u0114\u0115\7\6\2\2\u0115\u0117\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5\26\f\2\u0119"+
		"\u011a\7\4\2\2\u011a\u011c\3\2\2\2\u011bE\3\2\2\2\u011bJ\3\2\2\2\u011b"+
		"V\3\2\2\2\u011be\3\2\2\2\u011bt\3\2\2\2\u011b\u0088\3\2\2\2\u011b\u0095"+
		"\3\2\2\2\u011b\u009a\3\2\2\2\u011b\u00b0\3\2\2\2\u011b\u00b5\3\2\2\2\u011b"+
		"\u00c9\3\2\2\2\u011b\u00da\3\2\2\2\u011b\u00e7\3\2\2\2\u011b\u00ed\3\2"+
		"\2\2\u011b\u0100\3\2\2\2\u011b\u0109\3\2\2\2\u011b\u0112\3\2\2\2\u011c"+
		"\5\3\2\2\2\u011d\u011e\7+\2\2\u011e\u011f\5.\30\2\u011f\u0120\7\6\2\2"+
		"\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0124\5&\24\2\u0124\u0125\7\n\2\2\u0125\u0128\5&\24\2\u0126"+
		"\u0127\7\6\2\2\u0127\u0129\5\6\4\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\7\3\2\2\2\u012a\u012b\7+\2\2\u012b\u012c\5\60\31\2\u012c\u012d"+
		"\7\6\2\2\u012d\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\5\64\33\2\u0131\u013b\7\b\2\2\u0132\u0133\5"+
		",\27\2\u0133\u0134\7\5\2\2\u0134\u0136\3\2\2\2\u0135\u0132\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u013c\5,\27\2\u013b\u0137\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\7\7\2\2\u013e\u013f\7,"+
		"\2\2\u013f\u0141\5\b\5\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\t\3\2\2\2\u0142\u0143\7+\2\2\u0143\u0144\5.\30\2\u0144\u0145\7\6\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0147\5&\24\2\u0147\u0148\7\n\2\2\u0148\u014b"+
		"\5&\24\2\u0149\u014a\7\6\2\2\u014a\u014c\5\n\6\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\13\3\2\2\2\u014d\u014e\5\66\34\2\u014e\r\3\2\2\2"+
		"\u014f\u0150\5\66\34\2\u0150\17\3\2\2\2\u0151\u0154\5\22\n\2\u0152\u0153"+
		"\7\6\2\2\u0153\u0155\5\20\t\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0177\3\2\2\2\u0156\u0157\7-\2\2\u0157\u0158\7\'\2\2\u0158\u015e"+
		"\7\t\2\2\u0159\u015a\5\64\33\2\u015a\u015b\7\5\2\2\u015b\u015d\3\2\2\2"+
		"\u015c\u0159\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0164\5\64\33\2"+
		"\u0162\u0163\7\6\2\2\u0163\u0165\5\20\t\2\u0164\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0177\3\2\2\2\u0166\u0167\7-\2\2\u0167\u0168\7.\2\2\u0168"+
		"\u016e\7\t\2\2\u0169\u016a\5\64\33\2\u016a\u016b\7\5\2\2\u016b\u016d\3"+
		"\2\2\2\u016c\u0169\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0174\5\64"+
		"\33\2\u0172\u0173\7\6\2\2\u0173\u0175\5\20\t\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0151\3\2\2\2\u0176\u0156\3\2"+
		"\2\2\u0176\u0166\3\2\2\2\u0177\21\3\2\2\2\u0178\u01c5\5\64\33\2\u0179"+
		"\u017a\5\64\33\2\u017a\u0184\7\b\2\2\u017b\u017c\5\22\n\2\u017c\u017d"+
		"\7\5\2\2\u017d\u017f\3\2\2\2\u017e\u017b\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0185\5\22\n\2\u0184\u0180\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0189\7\7\2\2\u0187\u0188\7/\2\2\u0188\u018a\58\35"+
		"\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u01c5\3\2\2\2\u018b\u018c"+
		"\7\'\2\2\u018c\u0196\7\b\2\2\u018d\u018e\5\22\n\2\u018e\u018f\7\5\2\2"+
		"\u018f\u0191\3\2\2\2\u0190\u018d\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0197\5\22\n\2\u0196\u0192\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3"+
		"\2\2\2\u0198\u01c5\7\7\2\2\u0199\u019a\7.\2\2\u019a\u01a4\7\b\2\2\u019b"+
		"\u019c\5\22\n\2\u019c\u019d\7\5\2\2\u019d\u019f\3\2\2\2\u019e\u019b\3"+
		"\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\5\22\n\2\u01a4\u01a0\3"+
		"\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01c5\7\7\2\2\u01a7"+
		"\u01b1\7\b\2\2\u01a8\u01a9\5\22\n\2\u01a9\u01aa\7\5\2\2\u01aa\u01ac\3"+
		"\2\2\2\u01ab\u01a8\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\5\22"+
		"\n\2\u01b1\u01ad\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01c5\7\7\2\2\u01b4\u01b5\7\60\2\2\u01b5\u01bb\5\64\33\2\u01b6\u01b8"+
		"\7\13\2\2\u01b7\u01b9\5\24\13\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2"+
		"\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\7\f\2\2\u01bb\u01b6\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01c5\3\2\2\2\u01bd\u01be\7%\2\2\u01be\u01bf\5\64\33\2"+
		"\u01bf\u01c0\7\n\2\2\u01c0\u01c1\5\22\n\2\u01c1\u01c2\7\r\2\2\u01c2\u01c3"+
		"\5\22\n\2\u01c3\u01c5\3\2\2\2\u01c4\u0178\3\2\2\2\u01c4\u0179\3\2\2\2"+
		"\u01c4\u018b\3\2\2\2\u01c4\u0199\3\2\2\2\u01c4\u01a7\3\2\2\2\u01c4\u01b4"+
		"\3\2\2\2\u01c4\u01bd\3\2\2\2\u01c5\u01d2\3\2\2\2\u01c6\u01c7\7\n\2\2\u01c7"+
		"\u01d1\5\22\n\2\u01c8\u01c9\7\16\2\2\u01c9\u01d1\5\22\n\2\u01ca\u01cb"+
		"\7\17\2\2\u01cb\u01d1\5\22\n\2\u01cc\u01cd\7\20\2\2\u01cd\u01d1\5\22\n"+
		"\2\u01ce\u01cf\7\21\2\2\u01cf\u01d1\5\22\n\2\u01d0\u01c6\3\2\2\2\u01d0"+
		"\u01c8\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\23\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7\23\2\2\u01d6\u01d7\58\35"+
		"\2\u01d7\u01d8\7\n\2\2\u01d8\u01db\5\22\n\2\u01d9\u01da\7\6\2\2\u01da"+
		"\u01dc\5\24\13\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e5\3"+
		"\2\2\2\u01dd\u01de\5\64\33\2\u01de\u01df\7\n\2\2\u01df\u01e2\5\22\n\2"+
		"\u01e0\u01e1\7\6\2\2\u01e1\u01e3\5\24\13\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01d5\3\2\2\2\u01e4\u01dd\3\2\2\2\u01e5"+
		"\25\3\2\2\2\u01e6\u01e7\7%\2\2\u01e7\u01e8\5\64\33\2\u01e8\u01e9\7\n\2"+
		"\2\u01e9\u01ea\5\30\r\2\u01ea\u01eb\7\r\2\2\u01eb\u01ec\5\26\f\2\u01ec"+
		"\u0206\3\2\2\2\u01ed\u01ff\5\64\33\2\u01ee\u01f8\7\b\2\2\u01ef\u01f0\5"+
		"\30\r\2\u01f0\u01f1\7\5\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2"+
		"\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\5\30\r\2\u01f8\u01f4\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fd\7\7\2\2\u01fb\u01fc\7/"+
		"\2\2\u01fc\u01fe\58\35\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01ee\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2"+
		"\2\2\u0201\u0202\7\22\2\2\u0202\u0204\58\35\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u01e6\3\2\2\2\u0205\u01ed\3\2"+
		"\2\2\u0206\27\3\2\2\2\u0207\u0245\5\64\33\2\u0208\u0209\5\64\33\2\u0209"+
		"\u0213\7\b\2\2\u020a\u020b\5\30\r\2\u020b\u020c\7\5\2\2\u020c\u020e\3"+
		"\2\2\2\u020d\u020a\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\5\30"+
		"\r\2\u0213\u020f\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\7\7\2\2\u0216\u0245\3\2\2\2\u0217\u0218\7)\2\2\u0218\u0222\7\b"+
		"\2\2\u0219\u021a\5\30\r\2\u021a\u021b\7\5\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u0219\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0223\5\30\r\2\u0222"+
		"\u021e\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0245\7\7"+
		"\2\2\u0225\u022f\7\b\2\2\u0226\u0227\5\30\r\2\u0227\u0228\7\5\2\2\u0228"+
		"\u022a\3\2\2\2\u0229\u0226\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e"+
		"\u0230\5\30\r\2\u022f\u022b\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3"+
		"\2\2\2\u0231\u0232\5\30\r\2\u0232\u0233\7\7\2\2\u0233\u0245\3\2\2\2\u0234"+
		"\u0235\7\60\2\2\u0235\u023b\5\64\33\2\u0236\u0238\7\13\2\2\u0237\u0239"+
		"\5\32\16\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2"+
		"\u023a\u023c\7\f\2\2\u023b\u0236\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0245"+
		"\3\2\2\2\u023d\u023e\7%\2\2\u023e\u023f\5\64\33\2\u023f\u0240\7\n\2\2"+
		"\u0240\u0241\5\30\r\2\u0241\u0242\7\r\2\2\u0242\u0243\5\30\r\2\u0243\u0245"+
		"\3\2\2\2\u0244\u0207\3\2\2\2\u0244\u0208\3\2\2\2\u0244\u0217\3\2\2\2\u0244"+
		"\u0225\3\2\2\2\u0244\u0234\3\2\2\2\u0244\u023d\3\2\2\2\u0245\31\3\2\2"+
		"\2\u0246\u0247\7\23\2\2\u0247\u0248\58\35\2\u0248\u0249\7\n\2\2\u0249"+
		"\u024c\5\30\r\2\u024a\u024b\7\6\2\2\u024b\u024d\5\32\16\2\u024c\u024a"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0256\3\2\2\2\u024e\u024f\5\64\33\2"+
		"\u024f\u0250\7\n\2\2\u0250\u0253\5\30\r\2\u0251\u0252\7\6\2\2\u0252\u0254"+
		"\5\32\16\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2"+
		"\u0255\u0246\3\2\2\2\u0255\u024e\3\2\2\2\u0256\33\3\2\2\2\u0257\u0258"+
		"\7+\2\2\u0258\u0259\5\60\31\2\u0259\u025a\7\6\2\2\u025a\u025c\3\2\2\2"+
		"\u025b\u0257\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0260"+
		"\5\36\20\2\u025e\u025f\7\6\2\2\u025f\u0261\5\34\17\2\u0260\u025e\3\2\2"+
		"\2\u0260\u0261\3\2\2\2\u0261\35\3\2\2\2\u0262\u0270\5&\24\2\u0263\u0264"+
		"\5&\24\2\u0264\u0265\7\24\2\2\u0265\u0266\5&\24\2\u0266\u0270\3\2\2\2"+
		"\u0267\u0268\5&\24\2\u0268\u0269\7\30\2\2\u0269\u026a\5&\24\2\u026a\u0270"+
		"\3\2\2\2\u026b\u026c\5&\24\2\u026c\u026d\7\31\2\2\u026d\u026e\5&\24\2"+
		"\u026e\u0270\3\2\2\2\u026f\u0262\3\2\2\2\u026f\u0263\3\2\2\2\u026f\u0267"+
		"\3\2\2\2\u026f\u026b\3\2\2\2\u0270\37\3\2\2\2\u0271\u033d\7\3\2\2\u0272"+
		"\u033d\7\61\2\2\u0273\u0281\5\64\33\2\u0274\u027e\7\b\2\2\u0275\u0276"+
		"\5\"\22\2\u0276\u0277\7\5\2\2\u0277\u0279\3\2\2\2\u0278\u0275\3\2\2\2"+
		"\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d"+
		"\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027f\5\"\22\2\u027e\u027a\3\2\2\2"+
		"\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\7\7\2\2\u0281\u0274"+
		"\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u033d\3\2\2\2\u0283\u0284\7\b\2\2\u0284"+
		"\u0285\5 \21\2\u0285\u0286\7\7\2\2\u0286\u033d\3\2\2\2\u0287\u0288\7\23"+
		"\2\2\u0288\u033d\5 \21\2\u0289\u028a\7\23\2\2\u028a\u028b\5\64\33\2\u028b"+
		"\u028c\7\32\2\2\u028c\u028d\5\64\33\2\u028d\u028e\5 \21\2\u028e\u033d"+
		"\3\2\2\2\u028f\u0290\7<\2\2\u0290\u0291\5\64\33\2\u0291\u0292\7\32\2\2"+
		"\u0292\u0293\5\64\33\2\u0293\u0294\7\62\2\2\u0294\u0295\5 \21\2\u0295"+
		"\u033d\3\2\2\2\u0296\u0297\7\60\2\2\u0297\u02a5\5\64\33\2\u0298\u02a2"+
		"\7\13\2\2\u0299\u029a\5\64\33\2\u029a\u029b\7\5\2\2\u029b\u029d\3\2\2"+
		"\2\u029c\u0299\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a3\5\64\33\2"+
		"\u02a2\u029e\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6"+
		"\7\f\2\2\u02a5\u0298\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a8\7\t\2\2\u02a8\u02ab\5:\36\2\u02a9\u02aa\7\6\2\2\u02aa\u02ac\5 "+
		"\21\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u033d\3\2\2\2\u02ad"+
		"\u02ae\5\64\33\2\u02ae\u02af\7\26\2\2\u02af\u02b2\5:\36\2\u02b0\u02b1"+
		"\7\6\2\2\u02b1\u02b3\5 \21\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u033d\3\2\2\2\u02b4\u02b5\7\67\2\2\u02b5\u02b6\5\"\22\2\u02b6\u02b7\7"+
		"8\2\2\u02b7\u02ba\5 \21\2\u02b8\u02b9\7\64\2\2\u02b9\u02bb\5 \21\2\u02ba"+
		"\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u033d\3\2\2\2\u02bc\u02bd\7\r"+
		"\2\2\u02bd\u02be\7\b\2\2\u02be\u02bf\5\"\22\2\u02bf\u02c0\7\5\2\2\u02c0"+
		"\u02c1\5(\25\2\u02c1\u02c4\7\7\2\2\u02c2\u02c3\7\6\2\2\u02c3\u02c5\5 "+
		"\21\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u033d\3\2\2\2\u02c6"+
		"\u02c7\7\63\2\2\u02c7\u02c8\7\b\2\2\u02c8\u02c9\5\"\22\2\u02c9\u02ca\7"+
		"\5\2\2\u02ca\u02cb\5\"\22\2\u02cb\u02ce\7\7\2\2\u02cc\u02cd\7\6\2\2\u02cd"+
		"\u02cf\5 \21\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u033d\3\2"+
		"\2\2\u02d0\u02d1\7%\2\2\u02d1\u02d2\5(\25\2\u02d2\u02d3\7\n\2\2\u02d3"+
		"\u02da\5\"\22\2\u02d4\u02d5\7\r\2\2\u02d5\u02d8\5 \21\2\u02d6\u02d7\7"+
		"\64\2\2\u02d7\u02d9\5 \21\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02db\3\2\2\2\u02da\u02d4\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u033d\3\2"+
		"\2\2\u02dc\u02df\5\64\33\2\u02dd\u02de\7\t\2\2\u02de\u02e0\5:\36\2\u02df"+
		"\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\25"+
		"\2\2\u02e2\u02e5\5\"\22\2\u02e3\u02e4\7\6\2\2\u02e4\u02e6\5 \21\2\u02e5"+
		"\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u033d\3\2\2\2\u02e7\u02e8\7%"+
		"\2\2\u02e8\u02e9\5.\30\2\u02e9\u02ea\7\65\2\2\u02ea\u02f1\5\"\22\2\u02eb"+
		"\u02ec\7\r\2\2\u02ec\u02ef\5 \21\2\u02ed\u02ee\7\64\2\2\u02ee\u02f0\5"+
		" \21\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1"+
		"\u02eb\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u033d\3\2\2\2\u02f3\u02f4\7\66"+
		"\2\2\u02f4\u02f5\5\64\33\2\u02f5\u02ff\7\b\2\2\u02f6\u02f7\5\"\22\2\u02f7"+
		"\u02f8\7\5\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f6\3\2\2\2\u02fa\u02fd\3\2"+
		"\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fe\u0300\5\"\22\2\u02ff\u02fb\3\2\2\2\u02ff\u0300\3"+
		"\2\2\2\u0300\u0301\3\2\2\2\u0301\u0304\7\7\2\2\u0302\u0303\7\6\2\2\u0303"+
		"\u0305\5 \21\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u033d\3\2"+
		"\2\2\u0306\u0307\79\2\2\u0307\u0308\5\64\33\2\u0308\u0312\7\b\2\2\u0309"+
		"\u030a\5(\25\2\u030a\u030b\7\5\2\2\u030b\u030d\3\2\2\2\u030c\u0309\3\2"+
		"\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0311\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0313\5(\25\2\u0312\u030e\3\2"+
		"\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0317\7\7\2\2\u0315"+
		"\u0316\7\65\2\2\u0316\u0318\5\"\22\2\u0317\u0315\3\2\2\2\u0317\u0318\3"+
		"\2\2\2\u0318\u031f\3\2\2\2\u0319\u031a\7\r\2\2\u031a\u031d\5 \21\2\u031b"+
		"\u031c\7\64\2\2\u031c\u031e\5 \21\2\u031d\u031b\3\2\2\2\u031d\u031e\3"+
		"\2\2\2\u031e\u0320\3\2\2\2\u031f\u0319\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u033d\3\2\2\2\u0321\u0322\7\'\2\2\u0322\u0330\5\64\33\2\u0323\u032d\7"+
		"\b\2\2\u0324\u0325\5\"\22\2\u0325\u0326\7\5\2\2\u0326\u0328\3\2\2\2\u0327"+
		"\u0324\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032e\5\"\22\2\u032d"+
		"\u0329\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\7\7"+
		"\2\2\u0330\u0323\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0334\3\2\2\2\u0332"+
		"\u0333\7\6\2\2\u0333\u0335\5 \21\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2"+
		"\2\2\u0335\u033d\3\2\2\2\u0336\u0337\7/\2\2\u0337\u033a\58\35\2\u0338"+
		"\u0339\7\6\2\2\u0339\u033b\5 \21\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u033d\3\2\2\2\u033c\u0271\3\2\2\2\u033c\u0272\3\2\2\2\u033c"+
		"\u0273\3\2\2\2\u033c\u0283\3\2\2\2\u033c\u0287\3\2\2\2\u033c\u0289\3\2"+
		"\2\2\u033c\u028f\3\2\2\2\u033c\u0296\3\2\2\2\u033c\u02ad\3\2\2\2\u033c"+
		"\u02b4\3\2\2\2\u033c\u02bc\3\2\2\2\u033c\u02c6\3\2\2\2\u033c\u02d0\3\2"+
		"\2\2\u033c\u02dc\3\2\2\2\u033c\u02e7\3\2\2\2\u033c\u02f3\3\2\2\2\u033c"+
		"\u0306\3\2\2\2\u033c\u0321\3\2\2\2\u033c\u0336\3\2\2\2\u033d\u0342\3\2"+
		"\2\2\u033e\u033f\7\33\2\2\u033f\u0341\5 \21\2\u0340\u033e\3\2\2\2\u0341"+
		"\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343!\3\2\2\2"+
		"\u0344\u0342\3\2\2\2\u0345\u03d0\5\64\33\2\u0346\u03d0\5$\23\2\u0347\u0348"+
		"\5\64\33\2\u0348\u0349\5$\23\2\u0349\u03d0\3\2\2\2\u034a\u034b\7=\2\2"+
		"\u034b\u034c\7\13\2\2\u034c\u034d\5\"\22\2\u034d\u034e\7\5\2\2\u034e\u034f"+
		"\5\"\22\2\u034f\u0350\7\f\2\2\u0350\u03d0\3\2\2\2\u0351\u0352\7)\2\2\u0352"+
		"\u0353\7\b\2\2\u0353\u0354\5\"\22\2\u0354\u0355\7\7\2\2\u0355\u03d0\3"+
		"\2\2\2\u0356\u0357\7\60\2\2\u0357\u0365\5\64\33\2\u0358\u0362\7\13\2\2"+
		"\u0359\u035a\5\64\33\2\u035a\u035b\7\5\2\2\u035b\u035d\3\2\2\2\u035c\u0359"+
		"\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0363\5\64\33\2\u0362\u035e\3"+
		"\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\7\f\2\2\u0365"+
		"\u0358\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\7\t"+
		"\2\2\u0368\u0369\5:\36\2\u0369\u036a\7\6\2\2\u036a\u036b\5\"\22\2\u036b"+
		"\u03d0\3\2\2\2\u036c\u036d\5\64\33\2\u036d\u036e\7\26\2\2\u036e\u036f"+
		"\5:\36\2\u036f\u0370\7\6\2\2\u0370\u0371\5\"\22\2\u0371\u03d0\3\2\2\2"+
		"\u0372\u0373\7\67\2\2\u0373\u0374\5\"\22\2\u0374\u0375\78\2\2\u0375\u0378"+
		"\5\"\22\2\u0376\u0377\7\64\2\2\u0377\u0379\5\"\22\2\u0378\u0376\3\2\2"+
		"\2\u0378\u0379\3\2\2\2\u0379\u03d0\3\2\2\2\u037a\u037b\7%\2\2\u037b\u03d0"+
		"\5(\25\2\u037c\u037f\5\64\33\2\u037d\u037e\7\t\2\2\u037e\u0380\5:\36\2"+
		"\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382"+
		"\7\25\2\2\u0382\u0383\5\"\22\2\u0383\u0384\7\6\2\2\u0384\u0385\5\"\22"+
		"\2\u0385\u03d0\3\2\2\2\u0386\u0387\7%\2\2\u0387\u0388\5.\30\2\u0388\u0389"+
		"\7\65\2\2\u0389\u038a\5\"\22\2\u038a\u038b\7\r\2\2\u038b\u038e\5\"\22"+
		"\2\u038c\u038d\7\64\2\2\u038d\u038f\5\"\22\2\u038e\u038c\3\2\2\2\u038e"+
		"\u038f\3\2\2\2\u038f\u03d0\3\2\2\2\u0390\u0391\7\66\2\2\u0391\u0392\5"+
		"\64\33\2\u0392\u039c\7\b\2\2\u0393\u0394\5\"\22\2\u0394\u0395\7\5\2\2"+
		"\u0395\u0397\3\2\2\2\u0396\u0393\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396"+
		"\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u0398\3\2\2\2\u039b"+
		"\u039d\5\"\22\2\u039c\u0398\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3"+
		"\2\2\2\u039e\u039f\7\7\2\2\u039f\u03a0\7\6\2\2\u03a0\u03a1\5\"\22\2\u03a1"+
		"\u03d0\3\2\2\2\u03a2\u03a3\79\2\2\u03a3\u03a4\5\64\33\2\u03a4\u03ae\7"+
		"\b\2\2\u03a5\u03a6\5(\25\2\u03a6\u03a7\7\5\2\2\u03a7\u03a9\3\2\2\2\u03a8"+
		"\u03a5\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03af\5(\25\2\u03ae"+
		"\u03aa\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b3\7\7"+
		"\2\2\u03b1\u03b2\7\65\2\2\u03b2\u03b4\5\"\22\2\u03b3\u03b1\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\7\r\2\2\u03b6\u03b9\5\""+
		"\22\2\u03b7\u03b8\7\64\2\2\u03b8\u03ba\5\"\22\2\u03b9\u03b7\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03d0\3\2\2\2\u03bb\u03bc\7\'\2\2\u03bc\u03ca\5\64"+
		"\33\2\u03bd\u03c7\7\b\2\2\u03be\u03bf\5\"\22\2\u03bf\u03c0\7\5\2\2\u03c0"+
		"\u03c2\3\2\2\2\u03c1\u03be\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6"+
		"\u03c8\5\"\22\2\u03c7\u03c3\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3"+
		"\2\2\2\u03c9\u03cb\7\7\2\2\u03ca\u03bd\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03cd\7\6\2\2\u03cd\u03ce\5\"\22\2\u03ce\u03d0\3"+
		"\2\2\2\u03cf\u0345\3\2\2\2\u03cf\u0346\3\2\2\2\u03cf\u0347\3\2\2\2\u03cf"+
		"\u034a\3\2\2\2\u03cf\u0351\3\2\2\2\u03cf\u0356\3\2\2\2\u03cf\u036c\3\2"+
		"\2\2\u03cf\u0372\3\2\2\2\u03cf\u037a\3\2\2\2\u03cf\u037c\3\2\2\2\u03cf"+
		"\u0386\3\2\2\2\u03cf\u0390\3\2\2\2\u03cf\u03a2\3\2\2\2\u03cf\u03bb\3\2"+
		"\2\2\u03d0\u03db\3\2\2\2\u03d1\u03d2\7\n\2\2\u03d2\u03da\5\"\22\2\u03d3"+
		"\u03d4\7\16\2\2\u03d4\u03da\5\"\22\2\u03d5\u03d6\7\20\2\2\u03d6\u03da"+
		"\5\"\22\2\u03d7\u03d8\7\17\2\2\u03d8\u03da\5\"\22\2\u03d9\u03d1\3\2\2"+
		"\2\u03d9\u03d3\3\2\2\2\u03d9\u03d5\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03dd"+
		"\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc#\3\2\2\2\u03dd"+
		"\u03db\3\2\2\2\u03de\u03e8\7\b\2\2\u03df\u03e0\5\22\n\2\u03e0\u03e1\7"+
		"\5\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03df\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4"+
		"\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03e4\3\2"+
		"\2\2\u03e7\u03e9\5\22\n\2\u03e8\u03e4\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03eb\7\7\2\2\u03eb%\3\2\2\2\u03ec\u040f\5\64\33"+
		"\2\u03ed\u03f7\7\b\2\2\u03ee\u03ef\5&\24\2\u03ef\u03f0\7\5\2\2\u03f0\u03f2"+
		"\3\2\2\2\u03f1\u03ee\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f8\5&"+
		"\24\2\u03f7\u03f3\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u040f\7\7\2\2\u03fa\u03fb\5\64\33\2\u03fb\u0405\7\b\2\2\u03fc\u03fd\5"+
		"&\24\2\u03fd\u03fe\7\5\2\2\u03fe\u0400\3\2\2\2\u03ff\u03fc\3\2\2\2\u0400"+
		"\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0404\3\2"+
		"\2\2\u0403\u0401\3\2\2\2\u0404\u0406\5&\24\2\u0405\u0401\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\7\7\2\2\u0408\u040f\3\2"+
		"\2\2\u0409\u040a\7)\2\2\u040a\u040b\7\b\2\2\u040b\u040c\5&\24\2\u040c"+
		"\u040d\7\7\2\2\u040d\u040f\3\2\2\2\u040e\u03ec\3\2\2\2\u040e\u03ed\3\2"+
		"\2\2\u040e\u03fa\3\2\2\2\u040e\u0409\3\2\2\2\u040f\u041a\3\2\2\2\u0410"+
		"\u0411\7\n\2\2\u0411\u0419\5&\24\2\u0412\u0413\7\16\2\2\u0413\u0419\5"+
		"&\24\2\u0414\u0415\7\20\2\2\u0415\u0419\5&\24\2\u0416\u0417\7\17\2\2\u0417"+
		"\u0419\5&\24\2\u0418\u0410\3\2\2\2\u0418\u0412\3\2\2\2\u0418\u0414\3\2"+
		"\2\2\u0418\u0416\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a"+
		"\u041b\3\2\2\2\u041b\'\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u0429\5\64\33"+
		"\2\u041e\u041f\5\64\33\2\u041f\u0420\7\t\2\2\u0420\u0421\5:\36\2\u0421"+
		"\u0429\3\2\2\2\u0422\u0429\5*\26\2\u0423\u0424\5\64\33\2\u0424\u0425\5"+
		"*\26\2\u0425\u0429\3\2\2\2\u0426\u0427\7\n\2\2\u0427\u0429\5\"\22\2\u0428"+
		"\u041d\3\2\2\2\u0428\u041e\3\2\2\2\u0428\u0422\3\2\2\2\u0428\u0423\3\2"+
		"\2\2\u0428\u0426\3\2\2\2\u0429)\3\2\2\2\u042a\u0434\7\b\2\2\u042b\u042c"+
		"\5(\25\2\u042c\u042d\7\5\2\2\u042d\u042f\3\2\2\2\u042e\u042b\3\2\2\2\u042f"+
		"\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433\3\2"+
		"\2\2\u0432\u0430\3\2\2\2\u0433\u0435\5(\25\2\u0434\u0430\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7\7\2\2\u0437+\3\2\2\2"+
		"\u0438\u043b\5&\24\2\u0439\u043b\7:\2\2\u043a\u0438\3\2\2\2\u043a\u0439"+
		"\3\2\2\2\u043b-\3\2\2\2\u043c\u043d\5\64\33\2\u043d\u043e\7\t\2\2\u043e"+
		"\u0441\5:\36\2\u043f\u0440\7\5\2\2\u0440\u0442\5.\30\2\u0441\u043f\3\2"+
		"\2\2\u0441\u0442\3\2\2\2\u0442/\3\2\2\2\u0443\u0444\5\64\33\2\u0444\u0445"+
		"\7\t\2\2\u0445\u0448\5:\36\2\u0446\u0447\7;\2\2\u0447\u0449\7:\2\2\u0448"+
		"\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u044b\7\5"+
		"\2\2\u044b\u044d\5.\30\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\61\3\2\2\2\u044e\u0453\7\13\2\2\u044f\u0450\7@\2\2\u0450\u0452\7\5\2"+
		"\2\u0451\u044f\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454"+
		"\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0457\7@\2\2\u0457"+
		"\u0459\7\f\2\2\u0458\u044e\3\2\2\2\u0458\u0459\3\2\2\2\u0459\63\3\2\2"+
		"\2\u045a\u045b\5\66\34\2\u045b\65\3\2\2\2\u045c\u045d\7A\2\2\u045d\67"+
		"\3\2\2\2\u045e\u045f\7B\2\2\u045f9\3\2\2\2\u0460\u0461\t\2\2\2\u0461;"+
		"\3\2\2\2\u0091?P\\k|\u0080\u008c\u008f\u00a2\u00a6\u00bd\u00c1\u00c4\u00d1"+
		"\u00d5\u00de\u00e1\u00f5\u00f9\u00fc\u0104\u010d\u0116\u011b\u0121\u0128"+
		"\u012e\u0137\u013b\u0140\u014b\u0154\u015e\u0164\u016e\u0174\u0176\u0180"+
		"\u0184\u0189\u0192\u0196\u01a0\u01a4\u01ad\u01b1\u01b8\u01bb\u01c4\u01d0"+
		"\u01d2\u01db\u01e2\u01e4\u01f4\u01f8\u01fd\u01ff\u0203\u0205\u020f\u0213"+
		"\u021e\u0222\u022b\u022f\u0238\u023b\u0244\u024c\u0253\u0255\u025b\u0260"+
		"\u026f\u027a\u027e\u0281\u029e\u02a2\u02a5\u02ab\u02b2\u02ba\u02c4\u02ce"+
		"\u02d8\u02da\u02df\u02e5\u02ef\u02f1\u02fb\u02ff\u0304\u030e\u0312\u0317"+
		"\u031d\u031f\u0329\u032d\u0330\u0334\u033a\u033c\u0342\u035e\u0362\u0365"+
		"\u0378\u037f\u038e\u0398\u039c\u03aa\u03ae\u03b3\u03b9\u03c3\u03c7\u03ca"+
		"\u03cf\u03d9\u03db\u03e4\u03e8\u03f3\u03f7\u0401\u0405\u040e\u0418\u041a"+
		"\u0428\u0430\u0434\u043a\u0441\u0448\u044c\u0453\u0458";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}