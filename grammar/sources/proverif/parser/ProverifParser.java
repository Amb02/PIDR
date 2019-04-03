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
		RULE_gtermSequence = 9, RULE_gbinding = 10, RULE_nounifdecl = 11, RULE_gformat = 12, 
		RULE_fbinding = 13, RULE_clauses = 14, RULE_clause = 15, RULE_process = 16, 
		RULE_pterm = 17, RULE_ptermSequence = 18, RULE_term = 19, RULE_pattern = 20, 
		RULE_patternSequence = 21, RULE_mayfailterm = 22, RULE_typedecl = 23, 
		RULE_failtypedecl = 24, RULE_proverifOptions = 25, RULE_ident = 26, RULE_id = 27, 
		RULE_integer = 28, RULE_typeid = 29;
	public static final String[] ruleNames = {
		"programme", "declaration", "reduc", "reducprime", "eqlist", "name", "value", 
		"query", "gterm", "gtermSequence", "gbinding", "nounifdecl", "gformat", 
		"fbinding", "clauses", "clause", "process", "pterm", "ptermSequence", 
		"term", "pattern", "patternSequence", "mayfailterm", "typedecl", "failtypedecl", 
		"proverifOptions", "ident", "id", "integer", "typeid"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANNEL) | (1L << FREE) | (1L << REDUC) | (1L << FUN) | (1L << CONST) | (1L << EQUATION) | (1L << TABLE) | (1L << PRED) | (1L << LET) | (1L << SET) | (1L << EVENT) | (1L << QUERY) | (1L << NOT) | (1L << NOUNIF) | (1L << TYPE) | (1L << LETFUN))) != 0)) {
				{
				{
				setState(60);
				declaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(PROCESS);
			setState(67);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(TYPE);
				setState(70);
				ident();
				setState(71);
				proverifOptions();
				setState(72);
				match(POINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(CHANNEL);
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(75);
						ident();
						setState(76);
						match(COMMA);
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(83);
				ident();
				setState(84);
				match(POINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(FREE);
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(87);
						ident();
						setState(88);
						match(COMMA);
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(95);
				ident();
				setState(96);
				match(COLON);
				setState(97);
				typeid();
				setState(98);
				proverifOptions();
				setState(99);
				match(POINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(CONST);
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102);
						ident();
						setState(103);
						match(COMMA);
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(110);
				ident();
				setState(111);
				match(COLON);
				setState(112);
				typeid();
				setState(113);
				proverifOptions();
				setState(114);
				match(POINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(FUN);
				setState(117);
				ident();
				setState(118);
				match(LEFTPARENTHESIS);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(119);
							typeid();
							setState(120);
							match(COMMA);
							}
							} 
						}
						setState(126);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					setState(127);
					typeid();
					}
				}

				setState(130);
				match(RIGHTPARENTHESIS);
				setState(131);
				match(COLON);
				setState(132);
				typeid();
				setState(133);
				proverifOptions();
				setState(134);
				match(POINT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(LETFUN);
				setState(137);
				ident();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(138);
					match(LEFTPARENTHESIS);
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(139);
						typedecl();
						}
					}

					setState(142);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(145);
				match(EQUAL);
				setState(146);
				pterm();
				setState(147);
				match(POINT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				match(REDUC);
				setState(150);
				reduc();
				setState(151);
				proverifOptions();
				setState(152);
				match(POINT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				match(FUN);
				setState(155);
				ident();
				setState(156);
				match(LEFTPARENTHESIS);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(157);
							typeid();
							setState(158);
							match(COMMA);
							}
							} 
						}
						setState(164);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					setState(165);
					typeid();
					}
				}

				setState(168);
				match(RIGHTPARENTHESIS);
				setState(169);
				match(COLON);
				setState(170);
				typeid();
				setState(171);
				match(REDUC);
				setState(172);
				reducprime();
				setState(173);
				proverifOptions();
				setState(174);
				match(POINT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				match(EQUATION);
				setState(177);
				eqlist();
				setState(178);
				proverifOptions();
				setState(179);
				match(POINT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(181);
				match(PRED);
				setState(182);
				ident();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(183);
					match(LEFTPARENTHESIS);
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CHANNEL || _la==ID) {
						{
						setState(189);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(184);
								typeid();
								setState(185);
								match(COMMA);
								}
								} 
							}
							setState(191);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						setState(192);
						typeid();
						}
					}

					setState(195);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(198);
				proverifOptions();
				setState(199);
				match(POINT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(201);
				match(TABLE);
				setState(202);
				ident();
				setState(203);
				match(LEFTPARENTHESIS);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHANNEL || _la==ID) {
					{
					setState(209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(204);
							typeid();
							setState(205);
							match(COMMA);
							}
							} 
						}
						setState(211);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					setState(212);
					typeid();
					}
				}

				setState(215);
				match(RIGHTPARENTHESIS);
				setState(216);
				match(POINT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(218);
				match(LET);
				setState(219);
				ident();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(220);
					match(LEFTPARENTHESIS);
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(221);
						typedecl();
						}
					}

					setState(224);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(227);
				match(EQUAL);
				setState(228);
				process();
				setState(229);
				match(POINT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(231);
				match(SET);
				setState(232);
				name();
				setState(233);
				match(EQUAL);
				setState(234);
				value();
				setState(235);
				match(POINT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(237);
				match(EVENT);
				setState(238);
				ident();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(239);
					match(LEFTPARENTHESIS);
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CHANNEL || _la==ID) {
						{
						setState(245);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(240);
								typeid();
								setState(241);
								match(COMMA);
								}
								} 
							}
							setState(247);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						}
						setState(248);
						typeid();
						}
					}

					setState(251);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(254);
				match(POINT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(256);
				match(QUERY);
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(257);
					typedecl();
					setState(258);
					match(SEMICOLON);
					}
					break;
				}
				setState(262);
				query();
				setState(263);
				match(POINT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(265);
				match(NOT);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(266);
					typedecl();
					setState(267);
					match(SEMICOLON);
					}
					break;
				}
				setState(271);
				gterm();
				setState(272);
				match(POINT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(274);
				match(NOUNIF);
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(275);
					typedecl();
					setState(276);
					match(SEMICOLON);
					}
					break;
				}
				setState(280);
				nounifdecl();
				setState(281);
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
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(285);
				match(FORALL);
				setState(286);
				typedecl();
				setState(287);
				match(SEMICOLON);
				}
			}

			setState(291);
			term();
			setState(292);
			match(EQUAL);
			setState(293);
			term();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(294);
				match(SEMICOLON);
				setState(295);
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
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(298);
				match(FORALL);
				setState(299);
				failtypedecl();
				setState(300);
				match(SEMICOLON);
				}
			}

			setState(304);
			ident();
			setState(305);
			match(LEFTPARENTHESIS);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << NOT) | (1L << FAIL) | (1L << ID))) != 0)) {
				{
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						mayfailterm();
						setState(307);
						match(COMMA);
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(314);
				mayfailterm();
				}
			}

			setState(317);
			match(RIGHTPARENTHESIS);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(318);
				match(OTHERWISE);
				setState(319);
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
			setState(322);
			match(FORALL);
			setState(323);
			typedecl();
			setState(324);
			match(SEMICOLON);
			}
			setState(326);
			term();
			setState(327);
			match(EQUAL);
			setState(328);
			term();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(329);
				match(SEMICOLON);
				setState(330);
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
			setState(335);
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
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				gterm();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(338);
					match(SEMICOLON);
					setState(339);
					query();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(PUTBEGIN);
				setState(343);
				match(EVENT);
				setState(344);
				match(COLON);
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						ident();
						setState(346);
						match(COMMA);
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(353);
				ident();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(354);
					match(SEMICOLON);
					setState(355);
					query();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(PUTBEGIN);
				setState(359);
				match(INJEVENT);
				setState(360);
				match(COLON);
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						ident();
						setState(362);
						match(COMMA);
						}
						} 
					}
					setState(368);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(369);
				ident();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(370);
					match(SEMICOLON);
					setState(371);
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
		enterRule(_localctx, 16, RULE_gterm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(376);
				ident();
				}
				break;
			case 2:
				{
				setState(377);
				ident();
				setState(378);
				match(LEFTPARENTHESIS);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(379);
							gterm();
							setState(380);
							match(COMMA);
							}
							} 
						}
						setState(386);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					}
					setState(387);
					gterm();
					}
				}

				setState(390);
				match(RIGHTPARENTHESIS);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PHASE) {
					{
					setState(391);
					match(PHASE);
					setState(392);
					integer();
					}
				}

				}
				break;
			case 3:
				{
				setState(395);
				match(EVENT);
				setState(396);
				match(LEFTPARENTHESIS);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(402);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(397);
							gterm();
							setState(398);
							match(COMMA);
							}
							} 
						}
						setState(404);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					}
					setState(405);
					gterm();
					}
				}

				setState(408);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				{
				setState(409);
				match(INJEVENT);
				setState(410);
				match(LEFTPARENTHESIS);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(416);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(411);
							gterm();
							setState(412);
							match(COMMA);
							}
							} 
						}
						setState(418);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					}
					setState(419);
					gterm();
					}
				}

				setState(422);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				{
				setState(423);
				gtermSequence();
				}
				break;
			case 6:
				{
				setState(424);
				match(NEW);
				setState(425);
				ident();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(426);
					match(LEFTBRACKET);
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXCLAMATION || _la==ID) {
						{
						setState(427);
						gbinding();
						}
					}

					setState(430);
					match(RIGHTBRACKET);
					}
				}

				}
				break;
			case 7:
				{
				setState(433);
				match(LET);
				setState(434);
				ident();
				setState(435);
				match(EQUAL);
				setState(436);
				gterm();
				setState(437);
				match(IN);
				setState(438);
				gterm();
				}
				break;
			}
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(452);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(442);
						match(EQUAL);
						setState(443);
						gterm();
						}
						break;
					case DIFF:
						{
						setState(444);
						match(DIFF);
						setState(445);
						gterm();
						}
						break;
					case OR:
						{
						setState(446);
						match(OR);
						setState(447);
						gterm();
						}
						break;
					case AND:
						{
						setState(448);
						match(AND);
						setState(449);
						gterm();
						}
						break;
					case IMPLICATES:
						{
						setState(450);
						match(IMPLICATES);
						setState(451);
						gterm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 18, RULE_gtermSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(LEFTPARENTHESIS);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
				{
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(458);
						gterm();
						setState(459);
						match(COMMA);
						}
						} 
					}
					setState(465);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(466);
				gterm();
				}
			}

			setState(469);
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
		enterRule(_localctx, 20, RULE_gbinding);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(EXCLAMATION);
				setState(472);
				integer();
				setState(473);
				match(EQUAL);
				setState(474);
				gterm();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(475);
					match(SEMICOLON);
					setState(476);
					gbinding();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				ident();
				setState(480);
				match(EQUAL);
				setState(481);
				gterm();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(482);
					match(SEMICOLON);
					setState(483);
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
		enterRule(_localctx, 22, RULE_nounifdecl);
		int _la;
		try {
			int _alt;
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(LET);
				setState(489);
				ident();
				setState(490);
				match(EQUAL);
				setState(491);
				gformat();
				setState(492);
				match(IN);
				setState(493);
				nounifdecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				ident();
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(496);
					match(LEFTPARENTHESIS);
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW) | (1L << ID))) != 0)) {
						{
						setState(502);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(497);
								gformat();
								setState(498);
								match(COMMA);
								}
								} 
							}
							setState(504);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						}
						setState(505);
						gformat();
						}
					}

					setState(508);
					match(RIGHTPARENTHESIS);
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PHASE) {
						{
						setState(509);
						match(PHASE);
						setState(510);
						integer();
						}
					}

					}
				}

				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(515);
					match(SLASH);
					setState(516);
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
		enterRule(_localctx, 24, RULE_gformat);
		int _la;
		try {
			int _alt;
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				ident();
				setState(523);
				match(LEFTPARENTHESIS);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(524);
							gformat();
							setState(525);
							match(COMMA);
							}
							} 
						}
						setState(531);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					}
					setState(532);
					gformat();
					}
				}

				setState(535);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				match(NOT);
				setState(538);
				match(LEFTPARENTHESIS);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << NOT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(544);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(539);
							gformat();
							setState(540);
							match(COMMA);
							}
							} 
						}
						setState(546);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
					}
					setState(547);
					gformat();
					}
				}

				setState(550);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				match(LEFTPARENTHESIS);
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(557);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(552);
							gformat();
							setState(553);
							match(COMMA);
							}
							} 
						}
						setState(559);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					setState(560);
					gformat();
					}
					break;
				}
				setState(563);
				gformat();
				setState(564);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(566);
				match(NEW);
				setState(567);
				ident();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(568);
					match(LEFTBRACKET);
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXCLAMATION || _la==ID) {
						{
						setState(569);
						fbinding();
						}
					}

					setState(572);
					match(RIGHTBRACKET);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				match(LET);
				setState(576);
				ident();
				setState(577);
				match(EQUAL);
				setState(578);
				gformat();
				setState(579);
				match(IN);
				setState(580);
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
		enterRule(_localctx, 26, RULE_fbinding);
		int _la;
		try {
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(EXCLAMATION);
				setState(585);
				integer();
				setState(586);
				match(EQUAL);
				setState(587);
				gformat();
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(588);
					match(SEMICOLON);
					setState(589);
					fbinding();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				ident();
				setState(593);
				match(EQUAL);
				setState(594);
				gformat();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(595);
					match(SEMICOLON);
					setState(596);
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
		enterRule(_localctx, 28, RULE_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(601);
				match(FORALL);
				setState(602);
				failtypedecl();
				setState(603);
				match(SEMICOLON);
				}
			}

			setState(607);
			clause();
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(608);
				match(SEMICOLON);
				setState(609);
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
		enterRule(_localctx, 30, RULE_clause);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				term();
				setState(614);
				match(ARROW);
				setState(615);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				term();
				setState(618);
				match(DOUBLEARROW);
				setState(619);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(621);
				term();
				setState(622);
				match(EQUIVALENT);
				setState(623);
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
		enterRule(_localctx, 32, RULE_process);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(627);
				match(ZERO);
				}
				break;
			case 2:
				{
				setState(628);
				match(YIELD);
				}
				break;
			case 3:
				{
				setState(629);
				ident();
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(630);
					match(LEFTPARENTHESIS);
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
						{
						setState(636);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(631);
								pterm();
								setState(632);
								match(COMMA);
								}
								} 
							}
							setState(638);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
						}
						setState(639);
						pterm();
						}
					}

					setState(642);
					match(RIGHTPARENTHESIS);
					}
				}

				}
				break;
			case 4:
				{
				setState(645);
				match(LEFTPARENTHESIS);
				setState(646);
				process();
				setState(647);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				{
				setState(649);
				match(EXCLAMATION);
				setState(650);
				process();
				}
				break;
			case 6:
				{
				setState(651);
				match(EXCLAMATION);
				setState(652);
				ident();
				setState(653);
				match(REVERSEIMPLICATES);
				setState(654);
				ident();
				setState(655);
				process();
				}
				break;
			case 7:
				{
				setState(657);
				match(FOREACH);
				setState(658);
				ident();
				setState(659);
				match(REVERSEIMPLICATES);
				setState(660);
				ident();
				setState(661);
				match(DO);
				setState(662);
				process();
				}
				break;
			case 8:
				{
				setState(664);
				match(NEW);
				setState(665);
				ident();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(666);
					match(LEFTBRACKET);
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(672);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(667);
								ident();
								setState(668);
								match(COMMA);
								}
								} 
							}
							setState(674);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
						}
						setState(675);
						ident();
						}
					}

					setState(678);
					match(RIGHTBRACKET);
					}
				}

				setState(681);
				match(COLON);
				setState(682);
				typeid();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(683);
					match(SEMICOLON);
					setState(684);
					process();
					}
				}

				}
				break;
			case 9:
				{
				setState(687);
				ident();
				setState(688);
				match(REVERSEARROWR);
				setState(689);
				typeid();
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(690);
					match(SEMICOLON);
					setState(691);
					process();
					}
				}

				}
				break;
			case 10:
				{
				setState(694);
				match(IF);
				setState(695);
				pterm();
				setState(696);
				match(THEN);
				setState(697);
				process();
				setState(700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(698);
					match(ELSE);
					setState(699);
					process();
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(702);
				match(IN);
				setState(703);
				match(LEFTPARENTHESIS);
				setState(704);
				pterm();
				setState(705);
				match(COMMA);
				setState(706);
				pattern();
				setState(707);
				match(RIGHTPARENTHESIS);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(708);
					match(SEMICOLON);
					setState(709);
					process();
					}
				}

				}
				break;
			case 12:
				{
				setState(712);
				match(OUT);
				setState(713);
				match(LEFTPARENTHESIS);
				setState(714);
				pterm();
				setState(715);
				match(COMMA);
				setState(716);
				pterm();
				setState(717);
				match(RIGHTPARENTHESIS);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(718);
					match(SEMICOLON);
					setState(719);
					process();
					}
				}

				}
				break;
			case 13:
				{
				setState(722);
				match(LET);
				setState(723);
				pattern();
				setState(724);
				match(EQUAL);
				setState(725);
				pterm();
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(726);
					match(IN);
					setState(727);
					process();
					setState(730);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(728);
						match(ELSE);
						setState(729);
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
				setState(734);
				ident();
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(735);
					match(COLON);
					setState(736);
					typeid();
					}
				}

				setState(739);
				match(REVERSEARROW);
				setState(740);
				pterm();
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(741);
					match(SEMICOLON);
					setState(742);
					process();
					}
				}

				}
				break;
			case 15:
				{
				setState(745);
				match(LET);
				setState(746);
				typedecl();
				setState(747);
				match(SUCHTHAT);
				setState(748);
				pterm();
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(749);
					match(IN);
					setState(750);
					process();
					setState(753);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(751);
						match(ELSE);
						setState(752);
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
				setState(757);
				match(INSERT);
				setState(758);
				ident();
				setState(759);
				match(LEFTPARENTHESIS);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
					{
					setState(765);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(760);
							pterm();
							setState(761);
							match(COMMA);
							}
							} 
						}
						setState(767);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
					}
					setState(768);
					pterm();
					}
				}

				setState(771);
				match(RIGHTPARENTHESIS);
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(772);
					match(SEMICOLON);
					setState(773);
					process();
					}
				}

				}
				break;
			case 17:
				{
				setState(776);
				match(GET);
				setState(777);
				ident();
				setState(778);
				match(LEFTPARENTHESIS);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << EQUAL) | (1L << ID))) != 0)) {
					{
					setState(784);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(779);
							pattern();
							setState(780);
							match(COMMA);
							}
							} 
						}
						setState(786);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					}
					setState(787);
					pattern();
					}
				}

				setState(790);
				match(RIGHTPARENTHESIS);
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUCHTHAT) {
					{
					setState(791);
					match(SUCHTHAT);
					setState(792);
					pterm();
					}
				}

				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(795);
					match(IN);
					setState(796);
					process();
					setState(799);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(797);
						match(ELSE);
						setState(798);
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
				setState(803);
				match(EVENT);
				setState(804);
				ident();
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(805);
					match(LEFTPARENTHESIS);
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
						{
						setState(811);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(806);
								pterm();
								setState(807);
								match(COMMA);
								}
								} 
							}
							setState(813);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
						}
						setState(814);
						pterm();
						}
					}

					setState(817);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(820);
					match(SEMICOLON);
					setState(821);
					process();
					}
				}

				}
				break;
			case 19:
				{
				setState(824);
				match(PHASE);
				setState(825);
				integer();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(826);
					match(SEMICOLON);
					setState(827);
					process();
					}
				}

				}
				break;
			}
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(832);
					match(PIPE);
					setState(833);
					process();
					}
					} 
				}
				setState(838);
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
		enterRule(_localctx, 34, RULE_pterm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(839);
				ident();
				}
				break;
			case 2:
				{
				setState(840);
				ptermSequence();
				}
				break;
			case 3:
				{
				setState(841);
				ident();
				setState(842);
				match(LEFTPARENTHESIS);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << INJEVENT) | (1L << NEW) | (1L << ID))) != 0)) {
					{
					setState(848);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(843);
							gterm();
							setState(844);
							match(COMMA);
							}
							} 
						}
						setState(850);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
					}
					setState(851);
					gterm();
					}
				}

				setState(854);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				{
				setState(856);
				match(CHOICE);
				setState(857);
				match(LEFTBRACKET);
				setState(858);
				pterm();
				setState(859);
				match(COMMA);
				setState(860);
				pterm();
				setState(861);
				match(RIGHTBRACKET);
				}
				break;
			case 5:
				{
				setState(863);
				match(NOT);
				setState(864);
				match(LEFTPARENTHESIS);
				setState(865);
				pterm();
				setState(866);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 6:
				{
				setState(868);
				match(NEW);
				setState(869);
				ident();
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(870);
					match(LEFTBRACKET);
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(876);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(871);
								ident();
								setState(872);
								match(COMMA);
								}
								} 
							}
							setState(878);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
						}
						setState(879);
						ident();
						}
					}

					setState(882);
					match(RIGHTBRACKET);
					}
				}

				setState(885);
				match(COLON);
				setState(886);
				typeid();
				setState(887);
				match(SEMICOLON);
				setState(888);
				pterm();
				}
				break;
			case 7:
				{
				setState(890);
				ident();
				setState(891);
				match(REVERSEARROWR);
				setState(892);
				typeid();
				setState(893);
				match(SEMICOLON);
				setState(894);
				pterm();
				}
				break;
			case 8:
				{
				setState(896);
				match(IF);
				setState(897);
				pterm();
				setState(898);
				match(THEN);
				setState(899);
				pterm();
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(900);
					match(ELSE);
					setState(901);
					pterm();
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(904);
				match(LET);
				setState(905);
				pattern();
				}
				break;
			case 10:
				{
				setState(906);
				ident();
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(907);
					match(COLON);
					setState(908);
					typeid();
					}
				}

				setState(911);
				match(REVERSEARROW);
				setState(912);
				pterm();
				setState(913);
				match(SEMICOLON);
				setState(914);
				pterm();
				}
				break;
			case 11:
				{
				setState(916);
				match(LET);
				setState(917);
				typedecl();
				setState(918);
				match(SUCHTHAT);
				setState(919);
				pterm();
				setState(920);
				match(IN);
				setState(921);
				pterm();
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(922);
					match(ELSE);
					setState(923);
					pterm();
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(926);
				match(INSERT);
				setState(927);
				ident();
				setState(928);
				match(LEFTPARENTHESIS);
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
					{
					setState(934);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(929);
							pterm();
							setState(930);
							match(COMMA);
							}
							} 
						}
						setState(936);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
					}
					setState(937);
					pterm();
					}
				}

				setState(940);
				match(RIGHTPARENTHESIS);
				setState(941);
				match(SEMICOLON);
				setState(942);
				pterm();
				}
				break;
			case 13:
				{
				setState(944);
				match(GET);
				setState(945);
				ident();
				setState(946);
				match(LEFTPARENTHESIS);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << EQUAL) | (1L << ID))) != 0)) {
					{
					setState(952);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(947);
							pattern();
							setState(948);
							match(COMMA);
							}
							} 
						}
						setState(954);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
					}
					setState(955);
					pattern();
					}
				}

				setState(958);
				match(RIGHTPARENTHESIS);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUCHTHAT) {
					{
					setState(959);
					match(SUCHTHAT);
					setState(960);
					pterm();
					}
				}

				setState(963);
				match(IN);
				setState(964);
				pterm();
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(965);
					match(ELSE);
					setState(966);
					pterm();
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(969);
				match(EVENT);
				setState(970);
				ident();
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPARENTHESIS) {
					{
					setState(971);
					match(LEFTPARENTHESIS);
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
						{
						setState(977);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(972);
								pterm();
								setState(973);
								match(COMMA);
								}
								} 
							}
							setState(979);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
						}
						setState(980);
						pterm();
						}
					}

					setState(983);
					match(RIGHTPARENTHESIS);
					}
				}

				setState(986);
				match(SEMICOLON);
				setState(987);
				pterm();
				}
				break;
			}
			setState(1001);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(999);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(991);
						match(EQUAL);
						setState(992);
						pterm();
						}
						break;
					case DIFF:
						{
						setState(993);
						match(DIFF);
						setState(994);
						pterm();
						}
						break;
					case AND:
						{
						setState(995);
						match(AND);
						setState(996);
						pterm();
						}
						break;
					case OR:
						{
						setState(997);
						match(OR);
						setState(998);
						pterm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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
		enterRule(_localctx, 36, RULE_ptermSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(LEFTPARENTHESIS);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << LET) | (1L << EVENT) | (1L << NOT) | (1L << NEW) | (1L << INSERT) | (1L << IF) | (1L << GET) | (1L << CHOICE) | (1L << ID))) != 0)) {
				{
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1005);
						pterm();
						setState(1006);
						match(COMMA);
						}
						} 
					}
					setState(1012);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				setState(1013);
				pterm();
				}
			}

			setState(1016);
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
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1018);
				ident();
				}
				break;
			case 2:
				{
				setState(1019);
				match(LEFTPARENTHESIS);
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << NOT) | (1L << ID))) != 0)) {
					{
					setState(1025);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1020);
							term();
							setState(1021);
							match(COMMA);
							}
							} 
						}
						setState(1027);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(1028);
					term();
					}
				}

				setState(1031);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 3:
				{
				setState(1032);
				ident();
				setState(1033);
				match(LEFTPARENTHESIS);
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << NOT) | (1L << ID))) != 0)) {
					{
					setState(1039);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1034);
							term();
							setState(1035);
							match(COMMA);
							}
							} 
						}
						setState(1041);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
					}
					setState(1042);
					term();
					}
				}

				setState(1045);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				{
				setState(1047);
				match(NOT);
				setState(1048);
				match(LEFTPARENTHESIS);
				setState(1049);
				term();
				setState(1050);
				match(RIGHTPARENTHESIS);
				}
				break;
			}
			setState(1064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1062);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUAL:
						{
						setState(1054);
						match(EQUAL);
						setState(1055);
						term();
						}
						break;
					case DIFF:
						{
						setState(1056);
						match(DIFF);
						setState(1057);
						term();
						}
						break;
					case AND:
						{
						setState(1058);
						match(AND);
						setState(1059);
						term();
						}
						break;
					case OR:
						{
						setState(1060);
						match(OR);
						setState(1061);
						term();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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
		enterRule(_localctx, 40, RULE_pattern);
		int _la;
		try {
			int _alt;
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				ident();
				setState(1069);
				match(COLON);
				setState(1070);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1072);
				patternSequence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1073);
				ident();
				setState(1074);
				match(LEFTPARENTHESIS);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << EQUAL) | (1L << ID))) != 0)) {
					{
					setState(1080);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1075);
							pattern();
							setState(1076);
							match(COMMA);
							}
							} 
						}
						setState(1082);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					}
					setState(1083);
					pattern();
					}
				}

				setState(1086);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1088);
				match(EQUAL);
				setState(1089);
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
		enterRule(_localctx, 42, RULE_patternSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(LEFTPARENTHESIS);
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << EQUAL) | (1L << ID))) != 0)) {
				{
				setState(1099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1093);
						pattern();

						setState(1095);
						match(COMMA);
						}
						} 
					}
					setState(1101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				setState(1102);
				pattern();
				}
			}

			setState(1105);
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
		enterRule(_localctx, 44, RULE_mayfailterm);
		try {
			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESIS:
			case NOT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				term();
				}
				break;
			case FAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1108);
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
		enterRule(_localctx, 46, RULE_typedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			ident();
			setState(1112);
			match(COLON);
			setState(1113);
			typeid();
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1114);
				match(COMMA);
				setState(1115);
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
		enterRule(_localctx, 48, RULE_failtypedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			ident();
			setState(1119);
			match(COLON);
			setState(1120);
			typeid();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORWORD) {
				{
				setState(1121);
				match(ORWORD);
				setState(1122);
				match(FAIL);
				}
			}

			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1125);
				match(COMMA);
				setState(1126);
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
		enterRule(_localctx, 50, RULE_proverifOptions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(1129);
				match(LEFTBRACKET);
				setState(1134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1130);
						match(OPTIONCHOICE);
						setState(1131);
						match(COMMA);
						}
						} 
					}
					setState(1136);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1137);
				match(OPTIONCHOICE);
				setState(1138);
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
		enterRule(_localctx, 52, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
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
		enterRule(_localctx, 54, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
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
		enterRule(_localctx, 56, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
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
		enterRule(_localctx, 58, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0480\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3Q\n\3\f\3\16\3T\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080"+
		"\13\3\3\3\5\3\u0083\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u008f"+
		"\n\3\3\3\5\3\u0092\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3\u00a3\n\3\f\3\16\3\u00a6\13\3\3\3\5\3\u00a9\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3\u00be\n\3\f\3\16\3\u00c1\13\3\3\3\5\3\u00c4\n\3\3\3\5\3\u00c7\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00d2\n\3\f\3\16\3\u00d5\13\3"+
		"\3\3\5\3\u00d8\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00e1\n\3\3\3\5\3\u00e4"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\u00f6\n\3\f\3\16\3\u00f9\13\3\3\3\5\3\u00fc\n\3\3\3\5\3\u00ff\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u0107\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0110"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0119\n\3\3\3\3\3\3\3\5\3\u011e\n"+
		"\3\3\4\3\4\3\4\3\4\5\4\u0124\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u012b\n\4\3\5"+
		"\3\5\3\5\3\5\5\5\u0131\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0138\n\5\f\5\16\5"+
		"\u013b\13\5\3\5\5\5\u013e\n\5\3\5\3\5\3\5\5\5\u0143\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u014e\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u0157"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u015f\n\t\f\t\16\t\u0162\13\t\3\t\3\t"+
		"\3\t\5\t\u0167\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u016f\n\t\f\t\16\t\u0172"+
		"\13\t\3\t\3\t\3\t\5\t\u0177\n\t\5\t\u0179\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0181\n\n\f\n\16\n\u0184\13\n\3\n\5\n\u0187\n\n\3\n\3\n\3\n\5\n\u018c"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u0193\n\n\f\n\16\n\u0196\13\n\3\n\5\n\u0199"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01a1\n\n\f\n\16\n\u01a4\13\n\3\n\5\n"+
		"\u01a7\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01af\n\n\3\n\5\n\u01b2\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01bb\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u01c7\n\n\f\n\16\n\u01ca\13\n\3\13\3\13\3\13\3\13\7\13\u01d0"+
		"\n\13\f\13\16\13\u01d3\13\13\3\13\5\13\u01d6\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u01e0\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u01e7\n\f\5\f\u01e9"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01f7\n\r\f\r"+
		"\16\r\u01fa\13\r\3\r\5\r\u01fd\n\r\3\r\3\r\3\r\5\r\u0202\n\r\5\r\u0204"+
		"\n\r\3\r\3\r\5\r\u0208\n\r\5\r\u020a\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0212\n\16\f\16\16\16\u0215\13\16\3\16\5\16\u0218\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0221\n\16\f\16\16\16\u0224\13\16\3\16"+
		"\5\16\u0227\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u022e\n\16\f\16\16\16\u0231"+
		"\13\16\3\16\5\16\u0234\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u023d"+
		"\n\16\3\16\5\16\u0240\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0249"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0251\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0258\n\17\5\17\u025a\n\17\3\20\3\20\3\20\3\20\5\20\u0260\n"+
		"\20\3\20\3\20\3\20\5\20\u0265\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0274\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u027d\n\22\f\22\16\22\u0280\13\22\3\22\5\22\u0283\n\22"+
		"\3\22\5\22\u0286\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u02a1\n\22\f\22\16\22\u02a4\13\22\3\22\5\22\u02a7\n\22\3\22"+
		"\5\22\u02aa\n\22\3\22\3\22\3\22\3\22\5\22\u02b0\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u02b7\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02bf\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02c9\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u02d3\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u02dd\n\22\5\22\u02df\n\22\3\22\3\22\3\22\5\22\u02e4\n"+
		"\22\3\22\3\22\3\22\3\22\5\22\u02ea\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u02f4\n\22\5\22\u02f6\n\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u02fe\n\22\f\22\16\22\u0301\13\22\3\22\5\22\u0304\n\22\3\22\3"+
		"\22\3\22\5\22\u0309\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0311\n\22"+
		"\f\22\16\22\u0314\13\22\3\22\5\22\u0317\n\22\3\22\3\22\3\22\5\22\u031c"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0322\n\22\5\22\u0324\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u032c\n\22\f\22\16\22\u032f\13\22\3\22\5\22\u0332"+
		"\n\22\3\22\5\22\u0335\n\22\3\22\3\22\5\22\u0339\n\22\3\22\3\22\3\22\3"+
		"\22\5\22\u033f\n\22\5\22\u0341\n\22\3\22\3\22\7\22\u0345\n\22\f\22\16"+
		"\22\u0348\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0351\n\23\f\23"+
		"\16\23\u0354\13\23\3\23\5\23\u0357\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u036d\n\23\f\23\16\23\u0370\13\23\3\23\5\23\u0373\n\23\3\23\5\23"+
		"\u0376\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0389\n\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0390\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u039f\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u03a7\n\23\f"+
		"\23\16\23\u03aa\13\23\3\23\5\23\u03ad\n\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u03b9\n\23\f\23\16\23\u03bc\13\23\3\23\5"+
		"\23\u03bf\n\23\3\23\3\23\3\23\5\23\u03c4\n\23\3\23\3\23\3\23\3\23\5\23"+
		"\u03ca\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u03d2\n\23\f\23\16\23\u03d5"+
		"\13\23\3\23\5\23\u03d8\n\23\3\23\5\23\u03db\n\23\3\23\3\23\3\23\5\23\u03e0"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u03ea\n\23\f\23\16"+
		"\23\u03ed\13\23\3\24\3\24\3\24\3\24\7\24\u03f3\n\24\f\24\16\24\u03f6\13"+
		"\24\3\24\5\24\u03f9\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0402"+
		"\n\25\f\25\16\25\u0405\13\25\3\25\5\25\u0408\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0410\n\25\f\25\16\25\u0413\13\25\3\25\5\25\u0416\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u041f\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u0429\n\25\f\25\16\25\u042c\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0439\n\26\f\26\16"+
		"\26\u043c\13\26\3\26\5\26\u043f\n\26\3\26\3\26\3\26\3\26\5\26\u0445\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\7\27\u044c\n\27\f\27\16\27\u044f\13\27\3"+
		"\27\5\27\u0452\n\27\3\27\3\27\3\30\3\30\5\30\u0458\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u045f\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0466\n\32\3"+
		"\32\3\32\5\32\u046a\n\32\3\33\3\33\3\33\7\33\u046f\n\33\f\33\16\33\u0472"+
		"\13\33\3\33\3\33\5\33\u0476\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<\2\3\4\2\35\35AA\2\u0538\2A\3\2\2\2\4\u011d\3\2\2\2\6\u0123\3\2"+
		"\2\2\b\u0130\3\2\2\2\n\u0144\3\2\2\2\f\u014f\3\2\2\2\16\u0151\3\2\2\2"+
		"\20\u0178\3\2\2\2\22\u01ba\3\2\2\2\24\u01cb\3\2\2\2\26\u01e8\3\2\2\2\30"+
		"\u0209\3\2\2\2\32\u0248\3\2\2\2\34\u0259\3\2\2\2\36\u025f\3\2\2\2 \u0273"+
		"\3\2\2\2\"\u0340\3\2\2\2$\u03df\3\2\2\2&\u03ee\3\2\2\2(\u041e\3\2\2\2"+
		"*\u0444\3\2\2\2,\u0446\3\2\2\2.\u0457\3\2\2\2\60\u0459\3\2\2\2\62\u0460"+
		"\3\2\2\2\64\u0475\3\2\2\2\66\u0477\3\2\2\28\u0479\3\2\2\2:\u047b\3\2\2"+
		"\2<\u047d\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD"+
		"\3\2\2\2CA\3\2\2\2DE\7\34\2\2EF\5\"\22\2F\3\3\2\2\2GH\7>\2\2HI\5\66\34"+
		"\2IJ\5\64\33\2JK\7\4\2\2K\u011e\3\2\2\2LR\7\35\2\2MN\5\66\34\2NO\7\5\2"+
		"\2OQ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2"+
		"\2UV\5\66\34\2VW\7\4\2\2W\u011e\3\2\2\2X^\7\36\2\2YZ\5\66\34\2Z[\7\5\2"+
		"\2[]\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2"+
		"\2\2ab\5\66\34\2bc\7\t\2\2cd\5<\37\2de\5\64\33\2ef\7\4\2\2f\u011e\3\2"+
		"\2\2gm\7!\2\2hi\5\66\34\2ij\7\5\2\2jl\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\5\66\34\2qr\7\t\2\2rs\5<\37\2s"+
		"t\5\64\33\2tu\7\4\2\2u\u011e\3\2\2\2vw\7 \2\2wx\5\66\34\2x\u0082\7\b\2"+
		"\2yz\5<\37\2z{\7\5\2\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\5<\37\2\u0082~\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\7\2\2\u0085"+
		"\u0086\7\t\2\2\u0086\u0087\5<\37\2\u0087\u0088\5\64\33\2\u0088\u0089\7"+
		"\4\2\2\u0089\u011e\3\2\2\2\u008a\u008b\7?\2\2\u008b\u0091\5\66\34\2\u008c"+
		"\u008e\7\b\2\2\u008d\u008f\5\60\31\2\u008e\u008d\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\7\2\2\u0091\u008c\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\n\2\2\u0094\u0095\5$"+
		"\23\2\u0095\u0096\7\4\2\2\u0096\u011e\3\2\2\2\u0097\u0098\7\37\2\2\u0098"+
		"\u0099\5\6\4\2\u0099\u009a\5\64\33\2\u009a\u009b\7\4\2\2\u009b\u011e\3"+
		"\2\2\2\u009c\u009d\7 \2\2\u009d\u009e\5\66\34\2\u009e\u00a8\7\b\2\2\u009f"+
		"\u00a0\5<\37\2\u00a0\u00a1\7\5\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\5<\37\2\u00a8\u00a4\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab"+
		"\u00ac\7\t\2\2\u00ac\u00ad\5<\37\2\u00ad\u00ae\7\37\2\2\u00ae\u00af\5"+
		"\b\5\2\u00af\u00b0\5\64\33\2\u00b0\u00b1\7\4\2\2\u00b1\u011e\3\2\2\2\u00b2"+
		"\u00b3\7\"\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\5\64\33\2\u00b5\u00b6\7"+
		"\4\2\2\u00b6\u011e\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\u00c6\5\66\34\2\u00b9"+
		"\u00c3\7\b\2\2\u00ba\u00bb\5<\37\2\u00bb\u00bc\7\5\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5<"+
		"\37\2\u00c3\u00bf\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\7\7\2\2\u00c6\u00b9\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\5\64\33\2\u00c9\u00ca\7\4\2\2\u00ca\u011e\3\2\2\2\u00cb"+
		"\u00cc\7#\2\2\u00cc\u00cd\5\66\34\2\u00cd\u00d7\7\b\2\2\u00ce\u00cf\5"+
		"<\37\2\u00cf\u00d0\7\5\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5<\37\2\u00d7\u00d3\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\7\2\2\u00da\u00db\7\4"+
		"\2\2\u00db\u011e\3\2\2\2\u00dc\u00dd\7%\2\2\u00dd\u00e3\5\66\34\2\u00de"+
		"\u00e0\7\b\2\2\u00df\u00e1\5\60\31\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7\7\2\2\u00e3\u00de\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\n\2\2\u00e6\u00e7\5\""+
		"\22\2\u00e7\u00e8\7\4\2\2\u00e8\u011e\3\2\2\2\u00e9\u00ea\7&\2\2\u00ea"+
		"\u00eb\5\f\7\2\u00eb\u00ec\7\n\2\2\u00ec\u00ed\5\16\b\2\u00ed\u00ee\7"+
		"\4\2\2\u00ee\u011e\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00fe\5\66\34\2\u00f1"+
		"\u00fb\7\b\2\2\u00f2\u00f3\5<\37\2\u00f3\u00f4\7\5\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5<"+
		"\37\2\u00fb\u00f7\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\7\7\2\2\u00fe\u00f1\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\7\4\2\2\u0101\u011e\3\2\2\2\u0102\u0106\7(\2\2\u0103"+
		"\u0104\5\60\31\2\u0104\u0105\7\6\2\2\u0105\u0107\3\2\2\2\u0106\u0103\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\5\20\t\2\u0109"+
		"\u010a\7\4\2\2\u010a\u011e\3\2\2\2\u010b\u010f\7)\2\2\u010c\u010d\5\60"+
		"\31\2\u010d\u010e\7\6\2\2\u010e\u0110\3\2\2\2\u010f\u010c\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\5\22\n\2\u0112\u0113\7"+
		"\4\2\2\u0113\u011e\3\2\2\2\u0114\u0118\7*\2\2\u0115\u0116\5\60\31\2\u0116"+
		"\u0117\7\6\2\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5\30\r\2\u011b\u011c\7\4\2\2\u011c"+
		"\u011e\3\2\2\2\u011dG\3\2\2\2\u011dL\3\2\2\2\u011dX\3\2\2\2\u011dg\3\2"+
		"\2\2\u011dv\3\2\2\2\u011d\u008a\3\2\2\2\u011d\u0097\3\2\2\2\u011d\u009c"+
		"\3\2\2\2\u011d\u00b2\3\2\2\2\u011d\u00b7\3\2\2\2\u011d\u00cb\3\2\2\2\u011d"+
		"\u00dc\3\2\2\2\u011d\u00e9\3\2\2\2\u011d\u00ef\3\2\2\2\u011d\u0102\3\2"+
		"\2\2\u011d\u010b\3\2\2\2\u011d\u0114\3\2\2\2\u011e\5\3\2\2\2\u011f\u0120"+
		"\7+\2\2\u0120\u0121\5\60\31\2\u0121\u0122\7\6\2\2\u0122\u0124\3\2\2\2"+
		"\u0123\u011f\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\5(\25\2\u0126\u0127\7\n\2\2\u0127\u012a\5(\25\2\u0128\u0129\7\6\2\2\u0129"+
		"\u012b\5\6\4\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\7\3\2\2\2"+
		"\u012c\u012d\7+\2\2\u012d\u012e\5\62\32\2\u012e\u012f\7\6\2\2\u012f\u0131"+
		"\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\5\66\34\2\u0133\u013d\7\b\2\2\u0134\u0135\5.\30\2\u0135\u0136\7"+
		"\5\2\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u013e\5.\30\2\u013d\u0139\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0142\7\7\2\2\u0140\u0141\7,\2\2\u0141\u0143\5\b"+
		"\5\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\t\3\2\2\2\u0144\u0145"+
		"\7+\2\2\u0145\u0146\5\60\31\2\u0146\u0147\7\6\2\2\u0147\u0148\3\2\2\2"+
		"\u0148\u0149\5(\25\2\u0149\u014a\7\n\2\2\u014a\u014d\5(\25\2\u014b\u014c"+
		"\7\6\2\2\u014c\u014e\5\n\6\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\13\3\2\2\2\u014f\u0150\58\35\2\u0150\r\3\2\2\2\u0151\u0152\58\35\2\u0152"+
		"\17\3\2\2\2\u0153\u0156\5\22\n\2\u0154\u0155\7\6\2\2\u0155\u0157\5\20"+
		"\t\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0179\3\2\2\2\u0158"+
		"\u0159\7-\2\2\u0159\u015a\7\'\2\2\u015a\u0160\7\t\2\2\u015b\u015c\5\66"+
		"\34\2\u015c\u015d\7\5\2\2\u015d\u015f\3\2\2\2\u015e\u015b\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u0166\5\66\34\2\u0164\u0165\7\6\2\2\u0165"+
		"\u0167\5\20\t\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0179\3"+
		"\2\2\2\u0168\u0169\7-\2\2\u0169\u016a\7.\2\2\u016a\u0170\7\t\2\2\u016b"+
		"\u016c\5\66\34\2\u016c\u016d\7\5\2\2\u016d\u016f\3\2\2\2\u016e\u016b\3"+
		"\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0176\5\66\34\2\u0174\u0175\7"+
		"\6\2\2\u0175\u0177\5\20\t\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0153\3\2\2\2\u0178\u0158\3\2\2\2\u0178\u0168\3\2"+
		"\2\2\u0179\21\3\2\2\2\u017a\u01bb\5\66\34\2\u017b\u017c\5\66\34\2\u017c"+
		"\u0186\7\b\2\2\u017d\u017e\5\22\n\2\u017e\u017f\7\5\2\2\u017f\u0181\3"+
		"\2\2\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\5\22"+
		"\n\2\u0186\u0182\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018b\7\7\2\2\u0189\u018a\7/\2\2\u018a\u018c\5:\36\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u01bb\3\2\2\2\u018d\u018e\7\'\2\2\u018e"+
		"\u0198\7\b\2\2\u018f\u0190\5\22\n\2\u0190\u0191\7\5\2\2\u0191\u0193\3"+
		"\2\2\2\u0192\u018f\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\5\22"+
		"\n\2\u0198\u0194\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u01bb\7\7\2\2\u019b\u019c\7.\2\2\u019c\u01a6\7\b\2\2\u019d\u019e\5\22"+
		"\n\2\u019e\u019f\7\5\2\2\u019f\u01a1\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\5\22\n\2\u01a6\u01a2\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01bb\7\7\2\2\u01a9\u01bb\5\24"+
		"\13\2\u01aa\u01ab\7\60\2\2\u01ab\u01b1\5\66\34\2\u01ac\u01ae\7\13\2\2"+
		"\u01ad\u01af\5\26\f\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b2\7\f\2\2\u01b1\u01ac\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01bb\3\2\2\2\u01b3\u01b4\7%\2\2\u01b4\u01b5\5\66\34\2\u01b5\u01b6\7"+
		"\n\2\2\u01b6\u01b7\5\22\n\2\u01b7\u01b8\7\r\2\2\u01b8\u01b9\5\22\n\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u017a\3\2\2\2\u01ba\u017b\3\2\2\2\u01ba\u018d\3\2"+
		"\2\2\u01ba\u019b\3\2\2\2\u01ba\u01a9\3\2\2\2\u01ba\u01aa\3\2\2\2\u01ba"+
		"\u01b3\3\2\2\2\u01bb\u01c8\3\2\2\2\u01bc\u01bd\7\n\2\2\u01bd\u01c7\5\22"+
		"\n\2\u01be\u01bf\7\16\2\2\u01bf\u01c7\5\22\n\2\u01c0\u01c1\7\17\2\2\u01c1"+
		"\u01c7\5\22\n\2\u01c2\u01c3\7\20\2\2\u01c3\u01c7\5\22\n\2\u01c4\u01c5"+
		"\7\21\2\2\u01c5\u01c7\5\22\n\2\u01c6\u01bc\3\2\2\2\u01c6\u01be\3\2\2\2"+
		"\u01c6\u01c0\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\23\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01cb\u01d5\7\b\2\2\u01cc\u01cd\5\22\n\2\u01cd\u01ce\7"+
		"\5\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cc\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d4\u01d6\5\22\n\2\u01d5\u01d1\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\7\7\2\2\u01d8\25\3\2\2\2\u01d9\u01da\7\23\2"+
		"\2\u01da\u01db\5:\36\2\u01db\u01dc\7\n\2\2\u01dc\u01df\5\22\n\2\u01dd"+
		"\u01de\7\6\2\2\u01de\u01e0\5\26\f\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3"+
		"\2\2\2\u01e0\u01e9\3\2\2\2\u01e1\u01e2\5\66\34\2\u01e2\u01e3\7\n\2\2\u01e3"+
		"\u01e6\5\22\n\2\u01e4\u01e5\7\6\2\2\u01e5\u01e7\5\26\f\2\u01e6\u01e4\3"+
		"\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01d9\3\2\2\2\u01e8"+
		"\u01e1\3\2\2\2\u01e9\27\3\2\2\2\u01ea\u01eb\7%\2\2\u01eb\u01ec\5\66\34"+
		"\2\u01ec\u01ed\7\n\2\2\u01ed\u01ee\5\32\16\2\u01ee\u01ef\7\r\2\2\u01ef"+
		"\u01f0\5\30\r\2\u01f0\u020a\3\2\2\2\u01f1\u0203\5\66\34\2\u01f2\u01fc"+
		"\7\b\2\2\u01f3\u01f4\5\32\16\2\u01f4\u01f5\7\5\2\2\u01f5\u01f7\3\2\2\2"+
		"\u01f6\u01f3\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fd\5\32\16\2"+
		"\u01fc\u01f8\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0201"+
		"\7\7\2\2\u01ff\u0200\7/\2\2\u0200\u0202\5:\36\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01f2\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0207\3\2\2\2\u0205\u0206\7\22\2\2\u0206\u0208\5:\36\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u01ea\3\2"+
		"\2\2\u0209\u01f1\3\2\2\2\u020a\31\3\2\2\2\u020b\u0249\5\66\34\2\u020c"+
		"\u020d\5\66\34\2\u020d\u0217\7\b\2\2\u020e\u020f\5\32\16\2\u020f\u0210"+
		"\7\5\2\2\u0210\u0212\3\2\2\2\u0211\u020e\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0216\u0218\5\32\16\2\u0217\u0213\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021a\7\7\2\2\u021a\u0249\3\2\2\2\u021b\u021c\7)"+
		"\2\2\u021c\u0226\7\b\2\2\u021d\u021e\5\32\16\2\u021e\u021f\7\5\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u021d\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0227\5\32\16\2\u0226\u0222\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3"+
		"\2\2\2\u0228\u0249\7\7\2\2\u0229\u0233\7\b\2\2\u022a\u022b\5\32\16\2\u022b"+
		"\u022c\7\5\2\2\u022c\u022e\3\2\2\2\u022d\u022a\3\2\2\2\u022e\u0231\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0234\5\32\16\2\u0233\u022f\3\2\2\2\u0233\u0234\3"+
		"\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5\32\16\2\u0236\u0237\7\7\2\2\u0237"+
		"\u0249\3\2\2\2\u0238\u0239\7\60\2\2\u0239\u023f\5\66\34\2\u023a\u023c"+
		"\7\13\2\2\u023b\u023d\5\34\17\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2"+
		"\2\u023d\u023e\3\2\2\2\u023e\u0240\7\f\2\2\u023f\u023a\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\u0249\3\2\2\2\u0241\u0242\7%\2\2\u0242\u0243\5\66\34\2"+
		"\u0243\u0244\7\n\2\2\u0244\u0245\5\32\16\2\u0245\u0246\7\r\2\2\u0246\u0247"+
		"\5\32\16\2\u0247\u0249\3\2\2\2\u0248\u020b\3\2\2\2\u0248\u020c\3\2\2\2"+
		"\u0248\u021b\3\2\2\2\u0248\u0229\3\2\2\2\u0248\u0238\3\2\2\2\u0248\u0241"+
		"\3\2\2\2\u0249\33\3\2\2\2\u024a\u024b\7\23\2\2\u024b\u024c\5:\36\2\u024c"+
		"\u024d\7\n\2\2\u024d\u0250\5\32\16\2\u024e\u024f\7\6\2\2\u024f\u0251\5"+
		"\34\17\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u025a\3\2\2\2\u0252"+
		"\u0253\5\66\34\2\u0253\u0254\7\n\2\2\u0254\u0257\5\32\16\2\u0255\u0256"+
		"\7\6\2\2\u0256\u0258\5\34\17\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2"+
		"\u0258\u025a\3\2\2\2\u0259\u024a\3\2\2\2\u0259\u0252\3\2\2\2\u025a\35"+
		"\3\2\2\2\u025b\u025c\7+\2\2\u025c\u025d\5\62\32\2\u025d\u025e\7\6\2\2"+
		"\u025e\u0260\3\2\2\2\u025f\u025b\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0264\5 \21\2\u0262\u0263\7\6\2\2\u0263\u0265\5\36\20\2"+
		"\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\37\3\2\2\2\u0266\u0274"+
		"\5(\25\2\u0267\u0268\5(\25\2\u0268\u0269\7\24\2\2\u0269\u026a\5(\25\2"+
		"\u026a\u0274\3\2\2\2\u026b\u026c\5(\25\2\u026c\u026d\7\30\2\2\u026d\u026e"+
		"\5(\25\2\u026e\u0274\3\2\2\2\u026f\u0270\5(\25\2\u0270\u0271\7\31\2\2"+
		"\u0271\u0272\5(\25\2\u0272\u0274\3\2\2\2\u0273\u0266\3\2\2\2\u0273\u0267"+
		"\3\2\2\2\u0273\u026b\3\2\2\2\u0273\u026f\3\2\2\2\u0274!\3\2\2\2\u0275"+
		"\u0341\7\3\2\2\u0276\u0341\7\61\2\2\u0277\u0285\5\66\34\2\u0278\u0282"+
		"\7\b\2\2\u0279\u027a\5$\23\2\u027a\u027b\7\5\2\2\u027b\u027d\3\2\2\2\u027c"+
		"\u0279\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0283\5$\23\2\u0282"+
		"\u027e\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\7\7"+
		"\2\2\u0285\u0278\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0341\3\2\2\2\u0287"+
		"\u0288\7\b\2\2\u0288\u0289\5\"\22\2\u0289\u028a\7\7\2\2\u028a\u0341\3"+
		"\2\2\2\u028b\u028c\7\23\2\2\u028c\u0341\5\"\22\2\u028d\u028e\7\23\2\2"+
		"\u028e\u028f\5\66\34\2\u028f\u0290\7\32\2\2\u0290\u0291\5\66\34\2\u0291"+
		"\u0292\5\"\22\2\u0292\u0341\3\2\2\2\u0293\u0294\7<\2\2\u0294\u0295\5\66"+
		"\34\2\u0295\u0296\7\32\2\2\u0296\u0297\5\66\34\2\u0297\u0298\7\62\2\2"+
		"\u0298\u0299\5\"\22\2\u0299\u0341\3\2\2\2\u029a\u029b\7\60\2\2\u029b\u02a9"+
		"\5\66\34\2\u029c\u02a6\7\13\2\2\u029d\u029e\5\66\34\2\u029e\u029f\7\5"+
		"\2\2\u029f\u02a1\3\2\2\2\u02a0\u029d\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a2\3\2"+
		"\2\2\u02a5\u02a7\5\66\34\2\u02a6\u02a2\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02aa\7\f\2\2\u02a9\u029c\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\7\t\2\2\u02ac\u02af\5<\37\2\u02ad"+
		"\u02ae\7\6\2\2\u02ae\u02b0\5\"\22\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3"+
		"\2\2\2\u02b0\u0341\3\2\2\2\u02b1\u02b2\5\66\34\2\u02b2\u02b3\7\26\2\2"+
		"\u02b3\u02b6\5<\37\2\u02b4\u02b5\7\6\2\2\u02b5\u02b7\5\"\22\2\u02b6\u02b4"+
		"\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u0341\3\2\2\2\u02b8\u02b9\7\67\2\2"+
		"\u02b9\u02ba\5$\23\2\u02ba\u02bb\78\2\2\u02bb\u02be\5\"\22\2\u02bc\u02bd"+
		"\7\64\2\2\u02bd\u02bf\5\"\22\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2"+
		"\u02bf\u0341\3\2\2\2\u02c0\u02c1\7\r\2\2\u02c1\u02c2\7\b\2\2\u02c2\u02c3"+
		"\5$\23\2\u02c3\u02c4\7\5\2\2\u02c4\u02c5\5*\26\2\u02c5\u02c8\7\7\2\2\u02c6"+
		"\u02c7\7\6\2\2\u02c7\u02c9\5\"\22\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3"+
		"\2\2\2\u02c9\u0341\3\2\2\2\u02ca\u02cb\7\63\2\2\u02cb\u02cc\7\b\2\2\u02cc"+
		"\u02cd\5$\23\2\u02cd\u02ce\7\5\2\2\u02ce\u02cf\5$\23\2\u02cf\u02d2\7\7"+
		"\2\2\u02d0\u02d1\7\6\2\2\u02d1\u02d3\5\"\22\2\u02d2\u02d0\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u0341\3\2\2\2\u02d4\u02d5\7%\2\2\u02d5\u02d6\5*\26"+
		"\2\u02d6\u02d7\7\n\2\2\u02d7\u02de\5$\23\2\u02d8\u02d9\7\r\2\2\u02d9\u02dc"+
		"\5\"\22\2\u02da\u02db\7\64\2\2\u02db\u02dd\5\"\22\2\u02dc\u02da\3\2\2"+
		"\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02d8\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u0341\3\2\2\2\u02e0\u02e3\5\66\34\2\u02e1\u02e2\7\t\2\2"+
		"\u02e2\u02e4\5<\37\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5"+
		"\3\2\2\2\u02e5\u02e6\7\25\2\2\u02e6\u02e9\5$\23\2\u02e7\u02e8\7\6\2\2"+
		"\u02e8\u02ea\5\"\22\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u0341"+
		"\3\2\2\2\u02eb\u02ec\7%\2\2\u02ec\u02ed\5\60\31\2\u02ed\u02ee\7\65\2\2"+
		"\u02ee\u02f5\5$\23\2\u02ef\u02f0\7\r\2\2\u02f0\u02f3\5\"\22\2\u02f1\u02f2"+
		"\7\64\2\2\u02f2\u02f4\5\"\22\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2"+
		"\u02f4\u02f6\3\2\2\2\u02f5\u02ef\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u0341"+
		"\3\2\2\2\u02f7\u02f8\7\66\2\2\u02f8\u02f9\5\66\34\2\u02f9\u0303\7\b\2"+
		"\2\u02fa\u02fb\5$\23\2\u02fb\u02fc\7\5\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02fa"+
		"\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0302\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0304\5$\23\2\u0303\u02ff\3\2"+
		"\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0308\7\7\2\2\u0306"+
		"\u0307\7\6\2\2\u0307\u0309\5\"\22\2\u0308\u0306\3\2\2\2\u0308\u0309\3"+
		"\2\2\2\u0309\u0341\3\2\2\2\u030a\u030b\79\2\2\u030b\u030c\5\66\34\2\u030c"+
		"\u0316\7\b\2\2\u030d\u030e\5*\26\2\u030e\u030f\7\5\2\2\u030f\u0311\3\2"+
		"\2\2\u0310\u030d\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0317\5*"+
		"\26\2\u0316\u0312\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u031b\7\7\2\2\u0319\u031a\7\65\2\2\u031a\u031c\5$\23\2\u031b\u0319\3"+
		"\2\2\2\u031b\u031c\3\2\2\2\u031c\u0323\3\2\2\2\u031d\u031e\7\r\2\2\u031e"+
		"\u0321\5\"\22\2\u031f\u0320\7\64\2\2\u0320\u0322\5\"\22\2\u0321\u031f"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u031d\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0341\3\2\2\2\u0325\u0326\7\'\2\2\u0326\u0334\5\66"+
		"\34\2\u0327\u0331\7\b\2\2\u0328\u0329\5$\23\2\u0329\u032a\7\5\2\2\u032a"+
		"\u032c\3\2\2\2\u032b\u0328\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2"+
		"\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u032d\3\2\2\2\u0330"+
		"\u0332\5$\23\2\u0331\u032d\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0335\7\7\2\2\u0334\u0327\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"\u0338\3\2\2\2\u0336\u0337\7\6\2\2\u0337\u0339\5\"\22\2\u0338\u0336\3"+
		"\2\2\2\u0338\u0339\3\2\2\2\u0339\u0341\3\2\2\2\u033a\u033b\7/\2\2\u033b"+
		"\u033e\5:\36\2\u033c\u033d\7\6\2\2\u033d\u033f\5\"\22\2\u033e\u033c\3"+
		"\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u0275\3\2\2\2\u0340"+
		"\u0276\3\2\2\2\u0340\u0277\3\2\2\2\u0340\u0287\3\2\2\2\u0340\u028b\3\2"+
		"\2\2\u0340\u028d\3\2\2\2\u0340\u0293\3\2\2\2\u0340\u029a\3\2\2\2\u0340"+
		"\u02b1\3\2\2\2\u0340\u02b8\3\2\2\2\u0340\u02c0\3\2\2\2\u0340\u02ca\3\2"+
		"\2\2\u0340\u02d4\3\2\2\2\u0340\u02e0\3\2\2\2\u0340\u02eb\3\2\2\2\u0340"+
		"\u02f7\3\2\2\2\u0340\u030a\3\2\2\2\u0340\u0325\3\2\2\2\u0340\u033a\3\2"+
		"\2\2\u0341\u0346\3\2\2\2\u0342\u0343\7\33\2\2\u0343\u0345\5\"\22\2\u0344"+
		"\u0342\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2"+
		"\2\2\u0347#\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u03e0\5\66\34\2\u034a\u03e0"+
		"\5&\24\2\u034b\u034c\5\66\34\2\u034c\u0356\7\b\2\2\u034d\u034e\5\22\n"+
		"\2\u034e\u034f\7\5\2\2\u034f\u0351\3\2\2\2\u0350\u034d\3\2\2\2\u0351\u0354"+
		"\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354"+
		"\u0352\3\2\2\2\u0355\u0357\5\22\n\2\u0356\u0352\3\2\2\2\u0356\u0357\3"+
		"\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\7\7\2\2\u0359\u03e0\3\2\2\2\u035a"+
		"\u035b\7=\2\2\u035b\u035c\7\13\2\2\u035c\u035d\5$\23\2\u035d\u035e\7\5"+
		"\2\2\u035e\u035f\5$\23\2\u035f\u0360\7\f\2\2\u0360\u03e0\3\2\2\2\u0361"+
		"\u0362\7)\2\2\u0362\u0363\7\b\2\2\u0363\u0364\5$\23\2\u0364\u0365\7\7"+
		"\2\2\u0365\u03e0\3\2\2\2\u0366\u0367\7\60\2\2\u0367\u0375\5\66\34\2\u0368"+
		"\u0372\7\13\2\2\u0369\u036a\5\66\34\2\u036a\u036b\7\5\2\2\u036b\u036d"+
		"\3\2\2\2\u036c\u0369\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u0373\5\66"+
		"\34\2\u0372\u036e\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0376\7\f\2\2\u0375\u0368\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u0378\7\t\2\2\u0378\u0379\5<\37\2\u0379\u037a\7\6\2\2\u037a"+
		"\u037b\5$\23\2\u037b\u03e0\3\2\2\2\u037c\u037d\5\66\34\2\u037d\u037e\7"+
		"\26\2\2\u037e\u037f\5<\37\2\u037f\u0380\7\6\2\2\u0380\u0381\5$\23\2\u0381"+
		"\u03e0\3\2\2\2\u0382\u0383\7\67\2\2\u0383\u0384\5$\23\2\u0384\u0385\7"+
		"8\2\2\u0385\u0388\5$\23\2\u0386\u0387\7\64\2\2\u0387\u0389\5$\23\2\u0388"+
		"\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u03e0\3\2\2\2\u038a\u038b\7%"+
		"\2\2\u038b\u03e0\5*\26\2\u038c\u038f\5\66\34\2\u038d\u038e\7\t\2\2\u038e"+
		"\u0390\5<\37\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2"+
		"\2\2\u0391\u0392\7\25\2\2\u0392\u0393\5$\23\2\u0393\u0394\7\6\2\2\u0394"+
		"\u0395\5$\23\2\u0395\u03e0\3\2\2\2\u0396\u0397\7%\2\2\u0397\u0398\5\60"+
		"\31\2\u0398\u0399\7\65\2\2\u0399\u039a\5$\23\2\u039a\u039b\7\r\2\2\u039b"+
		"\u039e\5$\23\2\u039c\u039d\7\64\2\2\u039d\u039f\5$\23\2\u039e\u039c\3"+
		"\2\2\2\u039e\u039f\3\2\2\2\u039f\u03e0\3\2\2\2\u03a0\u03a1\7\66\2\2\u03a1"+
		"\u03a2\5\66\34\2\u03a2\u03ac\7\b\2\2\u03a3\u03a4\5$\23\2\u03a4\u03a5\7"+
		"\5\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a3\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8"+
		"\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a8\3\2"+
		"\2\2\u03ab\u03ad\5$\23\2\u03ac\u03a8\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03af\7\7\2\2\u03af\u03b0\7\6\2\2\u03b0\u03b1\5$"+
		"\23\2\u03b1\u03e0\3\2\2\2\u03b2\u03b3\79\2\2\u03b3\u03b4\5\66\34\2\u03b4"+
		"\u03be\7\b\2\2\u03b5\u03b6\5*\26\2\u03b6\u03b7\7\5\2\2\u03b7\u03b9\3\2"+
		"\2\2\u03b8\u03b5\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03bf\5*"+
		"\26\2\u03be\u03ba\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0"+
		"\u03c3\7\7\2\2\u03c1\u03c2\7\65\2\2\u03c2\u03c4\5$\23\2\u03c3\u03c1\3"+
		"\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\7\r\2\2\u03c6"+
		"\u03c9\5$\23\2\u03c7\u03c8\7\64\2\2\u03c8\u03ca\5$\23\2\u03c9\u03c7\3"+
		"\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03e0\3\2\2\2\u03cb\u03cc\7\'\2\2\u03cc"+
		"\u03da\5\66\34\2\u03cd\u03d7\7\b\2\2\u03ce\u03cf\5$\23\2\u03cf\u03d0\7"+
		"\5\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03ce\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3"+
		"\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d3\3\2"+
		"\2\2\u03d6\u03d8\5$\23\2\u03d7\u03d3\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03db\7\7\2\2\u03da\u03cd\3\2\2\2\u03da\u03db\3\2"+
		"\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\7\6\2\2\u03dd\u03de\5$\23\2\u03de"+
		"\u03e0\3\2\2\2\u03df\u0349\3\2\2\2\u03df\u034a\3\2\2\2\u03df\u034b\3\2"+
		"\2\2\u03df\u035a\3\2\2\2\u03df\u0361\3\2\2\2\u03df\u0366\3\2\2\2\u03df"+
		"\u037c\3\2\2\2\u03df\u0382\3\2\2\2\u03df\u038a\3\2\2\2\u03df\u038c\3\2"+
		"\2\2\u03df\u0396\3\2\2\2\u03df\u03a0\3\2\2\2\u03df\u03b2\3\2\2\2\u03df"+
		"\u03cb\3\2\2\2\u03e0\u03eb\3\2\2\2\u03e1\u03e2\7\n\2\2\u03e2\u03ea\5$"+
		"\23\2\u03e3\u03e4\7\16\2\2\u03e4\u03ea\5$\23\2\u03e5\u03e6\7\20\2\2\u03e6"+
		"\u03ea\5$\23\2\u03e7\u03e8\7\17\2\2\u03e8\u03ea\5$\23\2\u03e9\u03e1\3"+
		"\2\2\2\u03e9\u03e3\3\2\2\2\u03e9\u03e5\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea"+
		"\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec%\3\2\2\2"+
		"\u03ed\u03eb\3\2\2\2\u03ee\u03f8\7\b\2\2\u03ef\u03f0\5$\23\2\u03f0\u03f1"+
		"\7\5\2\2\u03f1\u03f3\3\2\2\2\u03f2\u03ef\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2"+
		"\2\2\u03f7\u03f9\5$\23\2\u03f8\u03f4\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03fa\3\2\2\2\u03fa\u03fb\7\7\2\2\u03fb\'\3\2\2\2\u03fc\u041f\5\66\34"+
		"\2\u03fd\u0407\7\b\2\2\u03fe\u03ff\5(\25\2\u03ff\u0400\7\5\2\2\u0400\u0402"+
		"\3\2\2\2\u0401\u03fe\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u0408\5("+
		"\25\2\u0407\u0403\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u041f\7\7\2\2\u040a\u040b\5\66\34\2\u040b\u0415\7\b\2\2\u040c\u040d\5"+
		"(\25\2\u040d\u040e\7\5\2\2\u040e\u0410\3\2\2\2\u040f\u040c\3\2\2\2\u0410"+
		"\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\3\2"+
		"\2\2\u0413\u0411\3\2\2\2\u0414\u0416\5(\25\2\u0415\u0411\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0418\7\7\2\2\u0418\u041f\3\2"+
		"\2\2\u0419\u041a\7)\2\2\u041a\u041b\7\b\2\2\u041b\u041c\5(\25\2\u041c"+
		"\u041d\7\7\2\2\u041d\u041f\3\2\2\2\u041e\u03fc\3\2\2\2\u041e\u03fd\3\2"+
		"\2\2\u041e\u040a\3\2\2\2\u041e\u0419\3\2\2\2\u041f\u042a\3\2\2\2\u0420"+
		"\u0421\7\n\2\2\u0421\u0429\5(\25\2\u0422\u0423\7\16\2\2\u0423\u0429\5"+
		"(\25\2\u0424\u0425\7\20\2\2\u0425\u0429\5(\25\2\u0426\u0427\7\17\2\2\u0427"+
		"\u0429\5(\25\2\u0428\u0420\3\2\2\2\u0428\u0422\3\2\2\2\u0428\u0424\3\2"+
		"\2\2\u0428\u0426\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b)\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u0445\5\66\34"+
		"\2\u042e\u042f\5\66\34\2\u042f\u0430\7\t\2\2\u0430\u0431\5<\37\2\u0431"+
		"\u0445\3\2\2\2\u0432\u0445\5,\27\2\u0433\u0434\5\66\34\2\u0434\u043e\7"+
		"\b\2\2\u0435\u0436\5*\26\2\u0436\u0437\7\5\2\2\u0437\u0439\3\2\2\2\u0438"+
		"\u0435\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2"+
		"\2\2\u043b\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043f\5*\26\2\u043e"+
		"\u043a\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\7\7"+
		"\2\2\u0441\u0445\3\2\2\2\u0442\u0443\7\n\2\2\u0443\u0445\5$\23\2\u0444"+
		"\u042d\3\2\2\2\u0444\u042e\3\2\2\2\u0444\u0432\3\2\2\2\u0444\u0433\3\2"+
		"\2\2\u0444\u0442\3\2\2\2\u0445+\3\2\2\2\u0446\u0451\7\b\2\2\u0447\u0448"+
		"\5*\26\2\u0448\u0449\b\27\1\2\u0449\u044a\7\5\2\2\u044a\u044c\3\2\2\2"+
		"\u044b\u0447\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e"+
		"\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0452\5*\26\2\u0451"+
		"\u044d\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\7\7"+
		"\2\2\u0454-\3\2\2\2\u0455\u0458\5(\25\2\u0456\u0458\7:\2\2\u0457\u0455"+
		"\3\2\2\2\u0457\u0456\3\2\2\2\u0458/\3\2\2\2\u0459\u045a\5\66\34\2\u045a"+
		"\u045b\7\t\2\2\u045b\u045e\5<\37\2\u045c\u045d\7\5\2\2\u045d\u045f\5\60"+
		"\31\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\61\3\2\2\2\u0460\u0461"+
		"\5\66\34\2\u0461\u0462\7\t\2\2\u0462\u0465\5<\37\2\u0463\u0464\7;\2\2"+
		"\u0464\u0466\7:\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0469"+
		"\3\2\2\2\u0467\u0468\7\5\2\2\u0468\u046a\5\60\31\2\u0469\u0467\3\2\2\2"+
		"\u0469\u046a\3\2\2\2\u046a\63\3\2\2\2\u046b\u0470\7\13\2\2\u046c\u046d"+
		"\7@\2\2\u046d\u046f\7\5\2\2\u046e\u046c\3\2\2\2\u046f\u0472\3\2\2\2\u0470"+
		"\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0470\3\2"+
		"\2\2\u0473\u0474\7@\2\2\u0474\u0476\7\f\2\2\u0475\u046b\3\2\2\2\u0475"+
		"\u0476\3\2\2\2\u0476\65\3\2\2\2\u0477\u0478\58\35\2\u0478\67\3\2\2\2\u0479"+
		"\u047a\7A\2\2\u047a9\3\2\2\2\u047b\u047c\7B\2\2\u047c;\3\2\2\2\u047d\u047e"+
		"\t\2\2\2\u047e=\3\2\2\2\u0095AR^m~\u0082\u008e\u0091\u00a4\u00a8\u00bf"+
		"\u00c3\u00c6\u00d3\u00d7\u00e0\u00e3\u00f7\u00fb\u00fe\u0106\u010f\u0118"+
		"\u011d\u0123\u012a\u0130\u0139\u013d\u0142\u014d\u0156\u0160\u0166\u0170"+
		"\u0176\u0178\u0182\u0186\u018b\u0194\u0198\u01a2\u01a6\u01ae\u01b1\u01ba"+
		"\u01c6\u01c8\u01d1\u01d5\u01df\u01e6\u01e8\u01f8\u01fc\u0201\u0203\u0207"+
		"\u0209\u0213\u0217\u0222\u0226\u022f\u0233\u023c\u023f\u0248\u0250\u0257"+
		"\u0259\u025f\u0264\u0273\u027e\u0282\u0285\u02a2\u02a6\u02a9\u02af\u02b6"+
		"\u02be\u02c8\u02d2\u02dc\u02de\u02e3\u02e9\u02f3\u02f5\u02ff\u0303\u0308"+
		"\u0312\u0316\u031b\u0321\u0323\u032d\u0331\u0334\u0338\u033e\u0340\u0346"+
		"\u0352\u0356\u036e\u0372\u0375\u0388\u038f\u039e\u03a8\u03ac\u03ba\u03be"+
		"\u03c3\u03c9\u03d3\u03d7\u03da\u03df\u03e9\u03eb\u03f4\u03f8\u0403\u0407"+
		"\u0411\u0415\u041e\u0428\u042a\u043a\u043e\u0444\u044d\u0451\u0457\u045e"+
		"\u0465\u0469\u0470\u0475";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}