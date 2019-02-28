// Generated from proverif.g by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class proverifParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, ID=65, INT=66, FLOAT=67, 
		COMMENT=68, WS=69, STRING=70, CHAR=71;
	public static final int
		RULE_programme = 0, RULE_declaration = 1, RULE_reduc = 2, RULE_reducprime = 3, 
		RULE_eqlist = 4, RULE_name = 5, RULE_value = 6, RULE_query = 7, RULE_gterm = 8, 
		RULE_gbinding = 9, RULE_nounifdecl = 10, RULE_gformat = 11, RULE_fbinding = 12, 
		RULE_clauses = 13, RULE_clause = 14, RULE_process = 15, RULE_pterm = 16, 
		RULE_term = 17, RULE_pattern = 18, RULE_mayfailterm = 19, RULE_typedecl = 20, 
		RULE_failtypedecl = 21, RULE_proverifOptions = 22, RULE_optionChoice = 23, 
		RULE_ident = 24, RULE_id = 25, RULE_integer = 26, RULE_typeid = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "declaration", "reduc", "reducprime", "eqlist", "name", 
			"value", "query", "gterm", "gbinding", "nounifdecl", "gformat", "fbinding", 
			"clauses", "clause", "process", "pterm", "term", "pattern", "mayfailterm", 
			"typedecl", "failtypedecl", "proverifOptions", "optionChoice", "ident", 
			"id", "integer", "typeid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'process'", "'type'", "'.'", "'channel'", "','", "'free'", "':'", 
			"'const'", "'fun'", "'('", "')'", "'reduc'", "'equation'", "'pred'", 
			"'table'", "'let'", "'='", "'set'", "'event'", "'query'", "';'", "'not'", 
			"'nounif'", "'forall'", "'otherwise'", "'putbegin'", "'inj-event'", "'phase'", 
			"'new'", "'['", "']'", "'in'", "'<>'", "'||'", "'&&'", "'==>'", "'!'", 
			"'/'", "'->'", "'<->'", "'<=>'", "'0'", "'yield'", "'<='", "'foreach'", 
			"'do'", "'<-R'", "'if'", "'then'", "'else'", "'out'", "'<-'", "'suchthat'", 
			"'insert'", "'get'", "'|'", "'choice'", "'fail'", "'or'", "'data'", "'private'", 
			"'typeConverter'", "'memberOptim'", "'block'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "INT", "FLOAT", "COMMENT", "WS", 
			"STRING", "CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "proverif.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public proverifParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammeContext extends ParserRuleContext {
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitProgramme(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				{
				setState(56);
				declaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__0);
			setState(63);
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
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ProverifOptionsContext proverifOptions() {
			return getRuleContext(ProverifOptionsContext.class,0);
		}
		public List<TypeidContext> typeid() {
			return getRuleContexts(TypeidContext.class);
		}
		public TypeidContext typeid(int i) {
			return getRuleContext(TypeidContext.class,i);
		}
		public ReducContext reduc() {
			return getRuleContext(ReducContext.class,0);
		}
		public ReducprimeContext reducprime() {
			return getRuleContext(ReducprimeContext.class,0);
		}
		public EqlistContext eqlist() {
			return getRuleContext(EqlistContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public GtermContext gterm() {
			return getRuleContext(GtermContext.class,0);
		}
		public NounifdeclContext nounifdecl() {
			return getRuleContext(NounifdeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			int _alt;
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__1);
				setState(66);
				ident();
				setState(67);
				proverifOptions();
				setState(68);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__3);
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						ident();
						setState(72);
						match(T__4);
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(79);
				ident();
				setState(80);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(T__5);
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						ident();
						setState(84);
						match(T__4);
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(91);
				ident();
				setState(92);
				match(T__6);
				setState(93);
				typeid();
				setState(94);
				proverifOptions();
				setState(95);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(T__7);
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
						match(T__4);
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
				match(T__6);
				setState(108);
				typeid();
				setState(109);
				proverifOptions();
				setState(110);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(T__8);
				setState(113);
				ident();
				setState(114);
				match(T__9);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==ID) {
					{
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(115);
							typeid();
							setState(116);
							match(T__4);
							}
							} 
						}
						setState(122);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					setState(123);
					typeid();
					}
				}

				setState(126);
				match(T__10);
				setState(127);
				match(T__6);
				setState(128);
				typeid();
				setState(129);
				proverifOptions();
				setState(130);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(T__11);
				setState(133);
				reduc();
				setState(134);
				proverifOptions();
				setState(135);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				match(T__8);
				setState(138);
				ident();
				setState(139);
				match(T__9);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==ID) {
					{
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(140);
							typeid();
							setState(141);
							match(T__4);
							}
							} 
						}
						setState(147);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					}
					setState(148);
					typeid();
					}
				}

				setState(151);
				match(T__10);
				setState(152);
				match(T__6);
				setState(153);
				typeid();
				setState(154);
				match(T__11);
				setState(155);
				reducprime();
				setState(156);
				proverifOptions();
				setState(157);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				match(T__12);
				setState(160);
				eqlist();
				setState(161);
				proverifOptions();
				setState(162);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				match(T__13);
				setState(165);
				ident();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(166);
					match(T__9);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3 || _la==ID) {
						{
						setState(172);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(167);
								typeid();
								setState(168);
								match(T__4);
								}
								} 
							}
							setState(174);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						}
						setState(175);
						typeid();
						}
					}

					setState(178);
					match(T__10);
					}
				}

				setState(181);
				proverifOptions();
				setState(182);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(184);
				match(T__14);
				setState(185);
				ident();
				setState(186);
				match(T__9);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==ID) {
					{
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(187);
							typeid();
							setState(188);
							match(T__4);
							}
							} 
						}
						setState(194);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					setState(195);
					typeid();
					}
				}

				setState(198);
				match(T__10);
				setState(199);
				match(T__2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(201);
				match(T__15);
				setState(202);
				ident();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(203);
					match(T__9);
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(204);
						typedecl();
						}
					}

					setState(207);
					match(T__10);
					}
				}

				setState(210);
				match(T__16);
				setState(211);
				process();
				setState(212);
				match(T__2);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(214);
				match(T__17);
				setState(215);
				name();
				setState(216);
				match(T__16);
				setState(217);
				value();
				setState(218);
				match(T__2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(220);
				match(T__18);
				setState(221);
				ident();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(222);
					match(T__9);
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3 || _la==ID) {
						{
						setState(228);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(223);
								typeid();
								setState(224);
								match(T__4);
								}
								} 
							}
							setState(230);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						}
						setState(231);
						typeid();
						}
					}

					setState(234);
					match(T__10);
					}
				}

				setState(237);
				match(T__2);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(239);
				match(T__19);
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(240);
					typedecl();
					setState(241);
					match(T__20);
					}
					break;
				}
				setState(245);
				query();
				setState(246);
				match(T__2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(248);
				match(T__21);
				setState(252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(249);
					typedecl();
					setState(250);
					match(T__20);
					}
					break;
				}
				setState(254);
				gterm();
				setState(255);
				match(T__2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(257);
				match(T__22);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(258);
					typedecl();
					setState(259);
					match(T__20);
					}
					break;
				}
				setState(263);
				nounifdecl();
				setState(264);
				match(T__2);
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
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterReduc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitReduc(this);
		}
	}

	public final ReducContext reduc() throws RecognitionException {
		ReducContext _localctx = new ReducContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_reduc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(268);
				match(T__23);
				setState(269);
				typedecl();
				setState(270);
				match(T__20);
				}
			}

			setState(274);
			term();
			setState(275);
			match(T__16);
			setState(276);
			term();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(277);
				match(T__20);
				setState(278);
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
		public FailtypedeclContext failtypedecl() {
			return getRuleContext(FailtypedeclContext.class,0);
		}
		public List<MayfailtermContext> mayfailterm() {
			return getRuleContexts(MayfailtermContext.class);
		}
		public MayfailtermContext mayfailterm(int i) {
			return getRuleContext(MayfailtermContext.class,i);
		}
		public ReducprimeContext reducprime() {
			return getRuleContext(ReducprimeContext.class,0);
		}
		public ReducprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reducprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterReducprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitReducprime(this);
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
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(281);
				match(T__23);
				setState(282);
				failtypedecl();
				setState(283);
				match(T__20);
				}
			}

			setState(287);
			ident();
			setState(288);
			match(T__9);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__21 - 10)) | (1L << (T__57 - 10)) | (1L << (ID - 10)))) != 0)) {
				{
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						mayfailterm();
						setState(290);
						match(T__4);
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(297);
				mayfailterm();
				}
			}

			setState(300);
			match(T__10);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(301);
				match(T__24);
				setState(302);
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
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterEqlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitEqlist(this);
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
			setState(305);
			match(T__23);
			setState(306);
			typedecl();
			setState(307);
			match(T__20);
			}
			setState(309);
			term();
			setState(310);
			match(T__16);
			setState(311);
			term();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(312);
				match(T__20);
				setState(313);
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_query);
		int _la;
		try {
			int _alt;
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				gterm();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(321);
					match(T__20);
					setState(322);
					query();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(T__25);
				setState(326);
				match(T__18);
				setState(327);
				match(T__6);
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(328);
						ident();
						setState(329);
						match(T__4);
						}
						} 
					}
					setState(335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(336);
				ident();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(337);
					match(T__20);
					setState(338);
					query();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(T__25);
				setState(342);
				match(T__26);
				setState(343);
				match(T__6);
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(344);
						ident();
						setState(345);
						match(T__4);
						}
						} 
					}
					setState(351);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(352);
				ident();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(353);
					match(T__20);
					setState(354);
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
		public List<GtermContext> gterm() {
			return getRuleContexts(GtermContext.class);
		}
		public GtermContext gterm(int i) {
			return getRuleContext(GtermContext.class,i);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterGterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitGterm(this);
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
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(359);
				ident();
				}
				break;
			case 2:
				{
				setState(360);
				ident();
				setState(361);
				match(T__9);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__18 - 10)) | (1L << (T__26 - 10)) | (1L << (T__28 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(362);
							gterm();
							setState(363);
							match(T__4);
							}
							} 
						}
						setState(369);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					}
					setState(370);
					gterm();
					}
				}

				setState(373);
				match(T__10);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(374);
					match(T__27);
					setState(375);
					integer();
					}
				}

				}
				break;
			case 3:
				{
				setState(378);
				match(T__18);
				setState(379);
				match(T__9);
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(380);
							gterm();
							setState(381);
							match(T__4);
							}
							} 
						}
						setState(387);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
					}
					setState(388);
					gterm();
					}
					break;
				}
				setState(391);
				gterm();
				setState(392);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(394);
				match(T__26);
				setState(395);
				match(T__9);
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(401);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(396);
							gterm();
							setState(397);
							match(T__4);
							}
							} 
						}
						setState(403);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					}
					setState(404);
					gterm();
					}
					break;
				}
				setState(407);
				gterm();
				setState(408);
				match(T__10);
				}
				break;
			case 5:
				{
				setState(410);
				match(T__9);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
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
							match(T__4);
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
					break;
				}
				setState(422);
				gterm();
				setState(423);
				match(T__10);
				}
				break;
			case 6:
				{
				setState(425);
				match(T__28);
				setState(426);
				ident();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(427);
					match(T__29);
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__36 || _la==ID) {
						{
						setState(428);
						gbinding();
						}
					}

					setState(431);
					match(T__30);
					}
				}

				}
				break;
			case 7:
				{
				setState(434);
				match(T__15);
				setState(435);
				ident();
				setState(436);
				match(T__16);
				setState(437);
				gterm();
				setState(438);
				match(T__31);
				setState(439);
				gterm();
				}
				break;
			}
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(453);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
						{
						setState(443);
						match(T__16);
						setState(444);
						gterm();
						}
						break;
					case T__32:
						{
						setState(445);
						match(T__32);
						setState(446);
						gterm();
						}
						break;
					case T__33:
						{
						setState(447);
						match(T__33);
						setState(448);
						gterm();
						}
						break;
					case T__34:
						{
						setState(449);
						match(T__34);
						setState(450);
						gterm();
						}
						break;
					case T__35:
						{
						setState(451);
						match(T__35);
						setState(452);
						gterm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(457);
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

	public static class GbindingContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public GtermContext gterm() {
			return getRuleContext(GtermContext.class,0);
		}
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterGbinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitGbinding(this);
		}
	}

	public final GbindingContext gbinding() throws RecognitionException {
		GbindingContext _localctx = new GbindingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_gbinding);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(T__36);
				setState(459);
				integer();
				setState(460);
				match(T__16);
				setState(461);
				gterm();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(462);
					match(T__20);
					setState(463);
					gbinding();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				ident();
				setState(467);
				match(T__16);
				setState(468);
				gterm();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(469);
					match(T__20);
					setState(470);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<GformatContext> gformat() {
			return getRuleContexts(GformatContext.class);
		}
		public GformatContext gformat(int i) {
			return getRuleContext(GformatContext.class,i);
		}
		public NounifdeclContext nounifdecl() {
			return getRuleContext(NounifdeclContext.class,0);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public NounifdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounifdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterNounifdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitNounifdecl(this);
		}
	}

	public final NounifdeclContext nounifdecl() throws RecognitionException {
		NounifdeclContext _localctx = new NounifdeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nounifdecl);
		int _la;
		try {
			int _alt;
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(T__15);
				setState(476);
				ident();
				setState(477);
				match(T__16);
				setState(478);
				gformat();
				setState(479);
				match(T__31);
				setState(480);
				nounifdecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				ident();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(483);
					match(T__9);
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (ID - 10)))) != 0)) {
						{
						setState(489);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(484);
								gformat();
								setState(485);
								match(T__4);
								}
								} 
							}
							setState(491);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
						}
						setState(492);
						gformat();
						}
					}

					setState(495);
					match(T__10);
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__27) {
						{
						setState(496);
						match(T__27);
						setState(497);
						integer();
						}
					}

					}
				}

				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(502);
					match(T__37);
					setState(503);
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
		public List<GformatContext> gformat() {
			return getRuleContexts(GformatContext.class);
		}
		public GformatContext gformat(int i) {
			return getRuleContext(GformatContext.class,i);
		}
		public FbindingContext fbinding() {
			return getRuleContext(FbindingContext.class,0);
		}
		public GformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gformat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterGformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitGformat(this);
		}
	}

	public final GformatContext gformat() throws RecognitionException {
		GformatContext _localctx = new GformatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_gformat);
		int _la;
		try {
			int _alt;
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				ident();
				setState(510);
				match(T__9);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(516);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(511);
							gformat();
							setState(512);
							match(T__4);
							}
							} 
						}
						setState(518);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					}
					setState(519);
					gformat();
					}
				}

				setState(522);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(T__21);
				setState(525);
				match(T__9);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(526);
							gformat();
							setState(527);
							match(T__4);
							}
							} 
						}
						setState(533);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					}
					setState(534);
					gformat();
					}
				}

				setState(537);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				match(T__9);
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
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
							match(T__4);
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
					break;
				}
				setState(550);
				gformat();
				setState(551);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				match(T__28);
				setState(554);
				ident();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(555);
					match(T__29);
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__36 || _la==ID) {
						{
						setState(556);
						fbinding();
						}
					}

					setState(559);
					match(T__30);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				match(T__15);
				setState(563);
				ident();
				setState(564);
				match(T__16);
				setState(565);
				gformat();
				setState(566);
				match(T__31);
				setState(567);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public GformatContext gformat() {
			return getRuleContext(GformatContext.class,0);
		}
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterFbinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitFbinding(this);
		}
	}

	public final FbindingContext fbinding() throws RecognitionException {
		FbindingContext _localctx = new FbindingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fbinding);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(T__36);
				setState(572);
				integer();
				setState(573);
				match(T__16);
				setState(574);
				gformat();
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(575);
					match(T__20);
					setState(576);
					fbinding();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				ident();
				setState(580);
				match(T__16);
				setState(581);
				gformat();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(582);
					match(T__20);
					setState(583);
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
		public FailtypedeclContext failtypedecl() {
			return getRuleContext(FailtypedeclContext.class,0);
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitClauses(this);
		}
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(588);
				match(T__23);
				setState(589);
				failtypedecl();
				setState(590);
				match(T__20);
				}
			}

			setState(594);
			clause();
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(595);
				match(T__20);
				setState(596);
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
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_clause);
		try {
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				term();
				setState(601);
				match(T__38);
				setState(602);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				term();
				setState(605);
				match(T__39);
				setState(606);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				term();
				setState(609);
				match(T__40);
				setState(610);
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
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public List<PtermContext> pterm() {
			return getRuleContexts(PtermContext.class);
		}
		public PtermContext pterm(int i) {
			return getRuleContext(PtermContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitProcess(this);
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
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(614);
				match(T__41);
				}
				break;
			case 2:
				{
				setState(615);
				match(T__42);
				}
				break;
			case 3:
				{
				setState(616);
				ident();
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(617);
					match(T__9);
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__18 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (T__47 - 10)) | (1L << (T__53 - 10)) | (1L << (T__54 - 10)) | (1L << (T__56 - 10)) | (1L << (ID - 10)))) != 0)) {
						{
						setState(623);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(618);
								pterm();
								setState(619);
								match(T__4);
								}
								} 
							}
							setState(625);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
						}
						setState(626);
						pterm();
						}
					}

					setState(629);
					match(T__10);
					}
				}

				}
				break;
			case 4:
				{
				setState(632);
				match(T__9);
				setState(633);
				process();
				setState(634);
				match(T__10);
				}
				break;
			case 5:
				{
				setState(636);
				match(T__36);
				setState(637);
				process();
				}
				break;
			case 6:
				{
				setState(638);
				match(T__36);
				setState(639);
				ident();
				setState(640);
				match(T__43);
				setState(641);
				ident();
				setState(642);
				process();
				}
				break;
			case 7:
				{
				setState(644);
				match(T__44);
				setState(645);
				ident();
				setState(646);
				match(T__43);
				setState(647);
				ident();
				setState(648);
				match(T__45);
				setState(649);
				process();
				}
				break;
			case 8:
				{
				setState(651);
				match(T__28);
				setState(652);
				ident();
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(653);
					match(T__29);
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(659);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(654);
								ident();
								setState(655);
								match(T__4);
								}
								} 
							}
							setState(661);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
						}
						setState(662);
						ident();
						}
					}

					setState(665);
					match(T__30);
					}
				}

				setState(668);
				match(T__6);
				setState(669);
				typeid();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(670);
					match(T__20);
					setState(671);
					process();
					}
				}

				}
				break;
			case 9:
				{
				setState(674);
				ident();
				setState(675);
				match(T__46);
				setState(676);
				typeid();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(677);
					match(T__20);
					setState(678);
					process();
					}
				}

				}
				break;
			case 10:
				{
				setState(681);
				match(T__47);
				setState(682);
				pterm();
				setState(683);
				match(T__48);
				setState(684);
				process();
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(685);
					match(T__49);
					setState(686);
					process();
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(689);
				match(T__31);
				setState(690);
				match(T__9);
				setState(691);
				pterm();
				setState(692);
				match(T__4);
				setState(693);
				pattern();
				setState(694);
				match(T__10);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(695);
					match(T__20);
					setState(696);
					process();
					}
				}

				}
				break;
			case 12:
				{
				setState(699);
				match(T__50);
				setState(700);
				match(T__9);
				setState(701);
				pterm();
				setState(702);
				match(T__4);
				setState(703);
				pterm();
				setState(704);
				match(T__10);
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(705);
					match(T__20);
					setState(706);
					process();
					}
				}

				}
				break;
			case 13:
				{
				setState(709);
				match(T__15);
				setState(710);
				pattern();
				setState(711);
				match(T__16);
				setState(712);
				pterm();
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(713);
					match(T__31);
					setState(714);
					process();
					setState(717);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(715);
						match(T__49);
						setState(716);
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
				setState(721);
				ident();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(722);
					match(T__6);
					setState(723);
					typeid();
					}
				}

				setState(726);
				match(T__51);
				setState(727);
				pterm();
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(728);
					match(T__20);
					setState(729);
					process();
					}
				}

				}
				break;
			case 15:
				{
				setState(732);
				match(T__15);
				setState(733);
				typedecl();
				setState(734);
				match(T__52);
				setState(735);
				pterm();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(736);
					match(T__31);
					setState(737);
					process();
					setState(740);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(738);
						match(T__49);
						setState(739);
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
				setState(744);
				match(T__53);
				setState(745);
				ident();
				setState(746);
				match(T__9);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__18 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (T__47 - 10)) | (1L << (T__53 - 10)) | (1L << (T__54 - 10)) | (1L << (T__56 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(752);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(747);
							pterm();
							setState(748);
							match(T__4);
							}
							} 
						}
						setState(754);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					setState(755);
					pterm();
					}
				}

				setState(758);
				match(T__10);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(759);
					match(T__20);
					setState(760);
					process();
					}
				}

				}
				break;
			case 17:
				{
				setState(763);
				match(T__54);
				setState(764);
				ident();
				setState(765);
				match(T__9);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__16 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(771);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(766);
							pattern();
							setState(767);
							match(T__4);
							}
							} 
						}
						setState(773);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
					}
					setState(774);
					pattern();
					}
				}

				setState(777);
				match(T__10);
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(778);
					match(T__52);
					setState(779);
					pterm();
					}
				}

				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(782);
					match(T__31);
					setState(783);
					process();
					setState(786);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						setState(784);
						match(T__49);
						setState(785);
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
				setState(790);
				match(T__18);
				setState(791);
				ident();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(792);
					match(T__9);
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__18 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (T__47 - 10)) | (1L << (T__53 - 10)) | (1L << (T__54 - 10)) | (1L << (T__56 - 10)) | (1L << (ID - 10)))) != 0)) {
						{
						setState(798);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(793);
								pterm();
								setState(794);
								match(T__4);
								}
								} 
							}
							setState(800);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
						}
						setState(801);
						pterm();
						}
					}

					setState(804);
					match(T__10);
					}
				}

				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(807);
					match(T__20);
					setState(808);
					process();
					}
				}

				}
				break;
			case 19:
				{
				setState(811);
				match(T__27);
				setState(812);
				integer();
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(813);
					match(T__20);
					setState(814);
					process();
					}
				}

				}
				break;
			}
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(819);
					match(T__55);
					setState(820);
					process();
					}
					} 
				}
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		public List<PtermContext> pterm() {
			return getRuleContexts(PtermContext.class);
		}
		public PtermContext pterm(int i) {
			return getRuleContext(PtermContext.class,i);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public PtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterPterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitPterm(this);
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
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(826);
				ident();
				}
				break;
			case 2:
				{
				setState(827);
				match(T__9);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__18 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (T__47 - 10)) | (1L << (T__53 - 10)) | (1L << (T__54 - 10)) | (1L << (T__56 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(833);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(828);
							pterm();
							setState(829);
							match(T__4);
							}
							} 
						}
						setState(835);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					}
					setState(836);
					pterm();
					}
				}

				setState(839);
				match(T__10);
				}
				break;
			case 3:
				{
				setState(840);
				ident();
				setState(841);
				match(T__9);
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__18 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (T__47 - 10)) | (1L << (T__53 - 10)) | (1L << (T__54 - 10)) | (1L << (T__56 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(847);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(842);
							pterm();
							setState(843);
							match(T__4);
							}
							} 
						}
						setState(849);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
					}
					setState(850);
					pterm();
					}
				}

				setState(853);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(855);
				match(T__56);
				setState(856);
				match(T__29);
				setState(857);
				pterm();
				setState(858);
				match(T__4);
				setState(859);
				pterm();
				setState(860);
				match(T__30);
				}
				break;
			case 5:
				{
				setState(862);
				match(T__21);
				setState(863);
				match(T__9);
				setState(864);
				pterm();
				setState(865);
				match(T__10);
				}
				break;
			case 6:
				{
				setState(867);
				match(T__28);
				setState(868);
				ident();
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(869);
					match(T__29);
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(875);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(870);
								ident();
								setState(871);
								match(T__4);
								}
								} 
							}
							setState(877);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
						}
						setState(878);
						ident();
						}
					}

					setState(881);
					match(T__30);
					}
				}

				setState(884);
				match(T__6);
				setState(885);
				typeid();
				setState(886);
				match(T__20);
				setState(887);
				pterm();
				}
				break;
			case 7:
				{
				setState(889);
				ident();
				setState(890);
				match(T__46);
				setState(891);
				typeid();
				setState(892);
				match(T__20);
				setState(893);
				pterm();
				}
				break;
			case 8:
				{
				setState(895);
				match(T__47);
				setState(896);
				pterm();
				setState(897);
				match(T__48);
				setState(898);
				pterm();
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(899);
					match(T__49);
					setState(900);
					pterm();
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(903);
				match(T__15);
				setState(904);
				pattern();
				}
				break;
			case 10:
				{
				setState(905);
				ident();
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(906);
					match(T__6);
					setState(907);
					typeid();
					}
				}

				setState(910);
				match(T__51);
				setState(911);
				pterm();
				setState(912);
				match(T__20);
				setState(913);
				pterm();
				}
				break;
			case 11:
				{
				setState(915);
				match(T__15);
				setState(916);
				typedecl();
				setState(917);
				match(T__52);
				setState(918);
				pterm();
				setState(919);
				match(T__31);
				setState(920);
				pterm();
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(921);
					match(T__49);
					setState(922);
					pterm();
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(925);
				match(T__53);
				setState(926);
				ident();
				setState(927);
				match(T__9);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__18 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (T__47 - 10)) | (1L << (T__53 - 10)) | (1L << (T__54 - 10)) | (1L << (T__56 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(933);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(928);
							pterm();
							setState(929);
							match(T__4);
							}
							} 
						}
						setState(935);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
					}
					setState(936);
					pterm();
					}
				}

				setState(939);
				match(T__10);
				setState(940);
				match(T__20);
				setState(941);
				pterm();
				}
				break;
			case 13:
				{
				setState(943);
				match(T__54);
				setState(944);
				ident();
				setState(945);
				match(T__9);
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__16 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(951);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(946);
							pattern();
							setState(947);
							match(T__4);
							}
							} 
						}
						setState(953);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
					}
					setState(954);
					pattern();
					}
				}

				setState(957);
				match(T__10);
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(958);
					match(T__52);
					setState(959);
					pterm();
					}
				}

				setState(962);
				match(T__31);
				setState(963);
				pterm();
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(964);
					match(T__49);
					setState(965);
					pterm();
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(968);
				match(T__18);
				setState(969);
				ident();
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(970);
					match(T__9);
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__15 - 10)) | (1L << (T__18 - 10)) | (1L << (T__21 - 10)) | (1L << (T__28 - 10)) | (1L << (T__47 - 10)) | (1L << (T__53 - 10)) | (1L << (T__54 - 10)) | (1L << (T__56 - 10)) | (1L << (ID - 10)))) != 0)) {
						{
						setState(976);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(971);
								pterm();
								setState(972);
								match(T__4);
								}
								} 
							}
							setState(978);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
						}
						setState(979);
						pterm();
						}
					}

					setState(982);
					match(T__10);
					}
				}

				setState(985);
				match(T__20);
				setState(986);
				pterm();
				}
				break;
			}
			setState(1000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(998);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
						{
						setState(990);
						match(T__16);
						setState(991);
						pterm();
						}
						break;
					case T__32:
						{
						setState(992);
						match(T__32);
						setState(993);
						pterm();
						}
						break;
					case T__34:
						{
						setState(994);
						match(T__34);
						setState(995);
						pterm();
						}
						break;
					case T__33:
						{
						setState(996);
						match(T__33);
						setState(997);
						pterm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1002);
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

	public static class TermContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1003);
				ident();
				}
				break;
			case 2:
				{
				setState(1004);
				match(T__9);
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__21 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(1010);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1005);
							term();
							setState(1006);
							match(T__4);
							}
							} 
						}
						setState(1012);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
					}
					setState(1013);
					term();
					}
				}

				setState(1016);
				match(T__10);
				}
				break;
			case 3:
				{
				setState(1017);
				ident();
				setState(1018);
				match(T__9);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__21 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(1024);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1019);
							term();
							setState(1020);
							match(T__4);
							}
							} 
						}
						setState(1026);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(1027);
					term();
					}
				}

				setState(1030);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(1032);
				match(T__21);
				setState(1033);
				match(T__9);
				setState(1034);
				term();
				setState(1035);
				match(T__10);
				}
				break;
			}
			setState(1049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1047);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
						{
						setState(1039);
						match(T__16);
						setState(1040);
						term();
						}
						break;
					case T__32:
						{
						setState(1041);
						match(T__32);
						setState(1042);
						term();
						}
						break;
					case T__34:
						{
						setState(1043);
						match(T__34);
						setState(1044);
						term();
						}
						break;
					case T__33:
						{
						setState(1045);
						match(T__33);
						setState(1046);
						term();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1051);
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
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public PtermContext pterm() {
			return getRuleContext(PtermContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pattern);
		int _la;
		try {
			int _alt;
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				ident();
				setState(1054);
				match(T__6);
				setState(1055);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1057);
				match(T__9);
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__16 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(1063);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1058);
							pattern();
							setState(1059);
							match(T__4);
							}
							} 
						}
						setState(1065);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
					}
					setState(1066);
					pattern();
					}
				}

				setState(1069);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1070);
				ident();
				setState(1071);
				match(T__9);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__16 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(1077);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1072);
							pattern();
							setState(1073);
							match(T__4);
							}
							} 
						}
						setState(1079);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					}
					setState(1080);
					pattern();
					}
				}

				setState(1083);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1085);
				match(T__16);
				setState(1086);
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

	public static class MayfailtermContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MayfailtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayfailterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterMayfailterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitMayfailterm(this);
		}
	}

	public final MayfailtermContext mayfailterm() throws RecognitionException {
		MayfailtermContext _localctx = new MayfailtermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mayfailterm);
		try {
			setState(1091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__21:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				term();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				match(T__57);
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
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public TypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterTypedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitTypedecl(this);
		}
	}

	public final TypedeclContext typedecl() throws RecognitionException {
		TypedeclContext _localctx = new TypedeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			ident();
			setState(1094);
			match(T__6);
			setState(1095);
			typeid();
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(1096);
				match(T__4);
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

	public static class FailtypedeclContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public FailtypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failtypedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterFailtypedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitFailtypedecl(this);
		}
	}

	public final FailtypedeclContext failtypedecl() throws RecognitionException {
		FailtypedeclContext _localctx = new FailtypedeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_failtypedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			ident();
			setState(1101);
			match(T__6);
			setState(1102);
			typeid();
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__58) {
				{
				setState(1103);
				match(T__58);
				setState(1104);
				match(T__57);
				}
			}

			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(1107);
				match(T__4);
				setState(1108);
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
		public List<OptionChoiceContext> optionChoice() {
			return getRuleContexts(OptionChoiceContext.class);
		}
		public OptionChoiceContext optionChoice(int i) {
			return getRuleContext(OptionChoiceContext.class,i);
		}
		public ProverifOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proverifOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterProverifOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitProverifOptions(this);
		}
	}

	public final ProverifOptionsContext proverifOptions() throws RecognitionException {
		ProverifOptionsContext _localctx = new ProverifOptionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_proverifOptions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(1111);
				match(T__29);
				setState(1117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1112);
						optionChoice();
						setState(1113);
						match(T__4);
						}
						} 
					}
					setState(1119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				setState(1120);
				optionChoice();
				setState(1121);
				match(T__30);
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

	public static class OptionChoiceContext extends ParserRuleContext {
		public OptionChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterOptionChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitOptionChoice(this);
		}
	}

	public final OptionChoiceContext optionChoice() throws RecognitionException {
		OptionChoiceContext _localctx = new OptionChoiceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_optionChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__60 - 60)) | (1L << (T__61 - 60)) | (1L << (T__62 - 60)) | (1L << (T__63 - 60)))) != 0)) ) {
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
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
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
		public TerminalNode ID() { return getToken(proverifParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
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
		public TerminalNode INT() { return getToken(proverifParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
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
		public TerminalNode ID() { return getToken(proverifParser.ID, 0); }
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proverifListener ) ((proverifListener)listener).exitTypeid(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==ID) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0472\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3y\n\3\f\3\16\3|\13\3\3\3\5\3\177\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0092"+
		"\n\3\f\3\16\3\u0095\13\3\3\3\5\3\u0098\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ad\n\3\f\3\16"+
		"\3\u00b0\13\3\3\3\5\3\u00b3\n\3\3\3\5\3\u00b6\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\u00c1\n\3\f\3\16\3\u00c4\13\3\3\3\5\3\u00c7\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00d0\n\3\3\3\5\3\u00d3\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00e5\n\3\f\3"+
		"\16\3\u00e8\13\3\3\3\5\3\u00eb\n\3\3\3\5\3\u00ee\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00f6\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ff\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u0108\n\3\3\3\3\3\3\3\5\3\u010d\n\3\3\4\3\4\3"+
		"\4\3\4\5\4\u0113\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u011a\n\4\3\5\3\5\3\5\3\5"+
		"\5\5\u0120\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0127\n\5\f\5\16\5\u012a\13\5\3"+
		"\5\5\5\u012d\n\5\3\5\3\5\3\5\5\5\u0132\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u013d\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u0146\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u014e\n\t\f\t\16\t\u0151\13\t\3\t\3\t\3\t\5\t\u0156"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u015e\n\t\f\t\16\t\u0161\13\t\3\t\3\t"+
		"\3\t\5\t\u0166\n\t\5\t\u0168\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0170\n\n"+
		"\f\n\16\n\u0173\13\n\3\n\5\n\u0176\n\n\3\n\3\n\3\n\5\n\u017b\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0182\n\n\f\n\16\n\u0185\13\n\3\n\5\n\u0188\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0192\n\n\f\n\16\n\u0195\13\n\3\n\5\n"+
		"\u0198\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01a1\n\n\f\n\16\n\u01a4\13"+
		"\n\3\n\5\n\u01a7\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01b0\n\n\3\n\5\n"+
		"\u01b3\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01bc\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u01c8\n\n\f\n\16\n\u01cb\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u01d3\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u01da\n"+
		"\13\5\13\u01dc\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u01ea\n\f\f\f\16\f\u01ed\13\f\3\f\5\f\u01f0\n\f\3\f\3\f\3\f\5\f\u01f5"+
		"\n\f\5\f\u01f7\n\f\3\f\3\f\5\f\u01fb\n\f\5\f\u01fd\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0205\n\r\f\r\16\r\u0208\13\r\3\r\5\r\u020b\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u0214\n\r\f\r\16\r\u0217\13\r\3\r\5\r\u021a\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u0221\n\r\f\r\16\r\u0224\13\r\3\r\5\r\u0227\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0230\n\r\3\r\5\r\u0233\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u023c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0244\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u024b\n\16\5\16\u024d\n\16\3"+
		"\17\3\17\3\17\3\17\5\17\u0253\n\17\3\17\3\17\3\17\5\17\u0258\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0267"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0270\n\21\f\21\16\21\u0273"+
		"\13\21\3\21\5\21\u0276\n\21\3\21\5\21\u0279\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0294\n\21\f\21\16\21\u0297\13"+
		"\21\3\21\5\21\u029a\n\21\3\21\5\21\u029d\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u02a3\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u02aa\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u02b2\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u02bc\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02c6\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02d0\n\21\5\21\u02d2"+
		"\n\21\3\21\3\21\3\21\5\21\u02d7\n\21\3\21\3\21\3\21\3\21\5\21\u02dd\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02e7\n\21\5\21\u02e9"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u02f1\n\21\f\21\16\21\u02f4\13"+
		"\21\3\21\5\21\u02f7\n\21\3\21\3\21\3\21\5\21\u02fc\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0304\n\21\f\21\16\21\u0307\13\21\3\21\5\21\u030a"+
		"\n\21\3\21\3\21\3\21\5\21\u030f\n\21\3\21\3\21\3\21\3\21\5\21\u0315\n"+
		"\21\5\21\u0317\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u031f\n\21\f\21"+
		"\16\21\u0322\13\21\3\21\5\21\u0325\n\21\3\21\5\21\u0328\n\21\3\21\3\21"+
		"\5\21\u032c\n\21\3\21\3\21\3\21\3\21\5\21\u0332\n\21\5\21\u0334\n\21\3"+
		"\21\3\21\7\21\u0338\n\21\f\21\16\21\u033b\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u0342\n\22\f\22\16\22\u0345\13\22\3\22\5\22\u0348\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u0350\n\22\f\22\16\22\u0353\13\22\3\22\5"+
		"\22\u0356\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u036c\n\22\f\22\16"+
		"\22\u036f\13\22\3\22\5\22\u0372\n\22\3\22\5\22\u0375\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u0388\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u038f\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u039e\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u03a6\n\22\f\22\16\22\u03a9\13\22"+
		"\3\22\5\22\u03ac\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u03b8\n\22\f\22\16\22\u03bb\13\22\3\22\5\22\u03be\n\22\3\22\3\22"+
		"\3\22\5\22\u03c3\n\22\3\22\3\22\3\22\3\22\5\22\u03c9\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u03d1\n\22\f\22\16\22\u03d4\13\22\3\22\5\22\u03d7"+
		"\n\22\3\22\5\22\u03da\n\22\3\22\3\22\3\22\5\22\u03df\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u03e9\n\22\f\22\16\22\u03ec\13\22\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u03f3\n\23\f\23\16\23\u03f6\13\23\3\23\5"+
		"\23\u03f9\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0401\n\23\f\23\16\23"+
		"\u0404\13\23\3\23\5\23\u0407\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0410\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u041a\n\23"+
		"\f\23\16\23\u041d\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0428\n\24\f\24\16\24\u042b\13\24\3\24\5\24\u042e\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u0436\n\24\f\24\16\24\u0439\13\24\3\24\5\24\u043c"+
		"\n\24\3\24\3\24\3\24\3\24\5\24\u0442\n\24\3\25\3\25\5\25\u0446\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u044d\n\26\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0454\n\27\3\27\3\27\5\27\u0458\n\27\3\30\3\30\3\30\3\30\7\30\u045e\n"+
		"\30\f\30\16\30\u0461\13\30\3\30\3\30\3\30\5\30\u0466\n\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\3\2>B\4\2\6\6CC\2\u0529\2"+
		"=\3\2\2\2\4\u010c\3\2\2\2\6\u0112\3\2\2\2\b\u011f\3\2\2\2\n\u0133\3\2"+
		"\2\2\f\u013e\3\2\2\2\16\u0140\3\2\2\2\20\u0167\3\2\2\2\22\u01bb\3\2\2"+
		"\2\24\u01db\3\2\2\2\26\u01fc\3\2\2\2\30\u023b\3\2\2\2\32\u024c\3\2\2\2"+
		"\34\u0252\3\2\2\2\36\u0266\3\2\2\2 \u0333\3\2\2\2\"\u03de\3\2\2\2$\u040f"+
		"\3\2\2\2&\u0441\3\2\2\2(\u0445\3\2\2\2*\u0447\3\2\2\2,\u044e\3\2\2\2."+
		"\u0465\3\2\2\2\60\u0467\3\2\2\2\62\u0469\3\2\2\2\64\u046b\3\2\2\2\66\u046d"+
		"\3\2\2\28\u046f\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>@\3\2\2\2?=\3\2\2\2@A\7\3\2\2AB\5 \21\2B\3\3\2\2\2CD\7\4\2\2DE\5"+
		"\62\32\2EF\5.\30\2FG\7\5\2\2G\u010d\3\2\2\2HN\7\6\2\2IJ\5\62\32\2JK\7"+
		"\7\2\2KM\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3"+
		"\2\2\2QR\5\62\32\2RS\7\5\2\2S\u010d\3\2\2\2TZ\7\b\2\2UV\5\62\32\2VW\7"+
		"\7\2\2WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\"+
		"Z\3\2\2\2]^\5\62\32\2^_\7\t\2\2_`\58\35\2`a\5.\30\2ab\7\5\2\2b\u010d\3"+
		"\2\2\2ci\7\n\2\2de\5\62\32\2ef\7\7\2\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2i"+
		"g\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5\62\32\2mn\7\t\2\2no\58\35"+
		"\2op\5.\30\2pq\7\5\2\2q\u010d\3\2\2\2rs\7\13\2\2st\5\62\32\2t~\7\f\2\2"+
		"uv\58\35\2vw\7\7\2\2wy\3\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2"+
		"{}\3\2\2\2|z\3\2\2\2}\177\58\35\2~z\3\2\2\2~\177\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0081\7\r\2\2\u0081\u0082\7\t\2\2\u0082\u0083\58\35\2\u0083"+
		"\u0084\5.\30\2\u0084\u0085\7\5\2\2\u0085\u010d\3\2\2\2\u0086\u0087\7\16"+
		"\2\2\u0087\u0088\5\6\4\2\u0088\u0089\5.\30\2\u0089\u008a\7\5\2\2\u008a"+
		"\u010d\3\2\2\2\u008b\u008c\7\13\2\2\u008c\u008d\5\62\32\2\u008d\u0097"+
		"\7\f\2\2\u008e\u008f\58\35\2\u008f\u0090\7\7\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\58\35\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\r"+
		"\2\2\u009a\u009b\7\t\2\2\u009b\u009c\58\35\2\u009c\u009d\7\16\2\2\u009d"+
		"\u009e\5\b\5\2\u009e\u009f\5.\30\2\u009f\u00a0\7\5\2\2\u00a0\u010d\3\2"+
		"\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\5\n\6\2\u00a3\u00a4\5.\30\2\u00a4"+
		"\u00a5\7\5\2\2\u00a5\u010d\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00b5\5"+
		"\62\32\2\u00a8\u00b2\7\f\2\2\u00a9\u00aa\58\35\2\u00aa\u00ab\7\7\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b3\58\35\2\u00b2\u00ae\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b6\7\r\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\7\5\2\2\u00b9\u010d\3\2"+
		"\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\5\62\32\2\u00bc\u00c6\7\f\2\2\u00bd"+
		"\u00be\58\35\2\u00be\u00bf\7\7\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bd\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\58\35\2\u00c6\u00c2\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9"+
		"\u00ca\7\5\2\2\u00ca\u010d\3\2\2\2\u00cb\u00cc\7\22\2\2\u00cc\u00d2\5"+
		"\62\32\2\u00cd\u00cf\7\f\2\2\u00ce\u00d0\5*\26\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7\r\2\2\u00d2\u00cd\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\23\2\2\u00d5"+
		"\u00d6\5 \21\2\u00d6\u00d7\7\5\2\2\u00d7\u010d\3\2\2\2\u00d8\u00d9\7\24"+
		"\2\2\u00d9\u00da\5\f\7\2\u00da\u00db\7\23\2\2\u00db\u00dc\5\16\b\2\u00dc"+
		"\u00dd\7\5\2\2\u00dd\u010d\3\2\2\2\u00de\u00df\7\25\2\2\u00df\u00ed\5"+
		"\62\32\2\u00e0\u00ea\7\f\2\2\u00e1\u00e2\58\35\2\u00e2\u00e3\7\7\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00eb\58\35\2\u00ea\u00e6\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ee\7\r\2\2\u00ed\u00e0\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\7\5\2\2\u00f0\u010d\3\2\2\2\u00f1\u00f5\7\26"+
		"\2\2\u00f2\u00f3\5*\26\2\u00f3\u00f4\7\27\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f2\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\5\20"+
		"\t\2\u00f8\u00f9\7\5\2\2\u00f9\u010d\3\2\2\2\u00fa\u00fe\7\30\2\2\u00fb"+
		"\u00fc\5*\26\2\u00fc\u00fd\7\27\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fb\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\5\22\n\2\u0101"+
		"\u0102\7\5\2\2\u0102\u010d\3\2\2\2\u0103\u0107\7\31\2\2\u0104\u0105\5"+
		"*\26\2\u0105\u0106\7\27\2\2\u0106\u0108\3\2\2\2\u0107\u0104\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\5\26\f\2\u010a\u010b\7"+
		"\5\2\2\u010b\u010d\3\2\2\2\u010cC\3\2\2\2\u010cH\3\2\2\2\u010cT\3\2\2"+
		"\2\u010cc\3\2\2\2\u010cr\3\2\2\2\u010c\u0086\3\2\2\2\u010c\u008b\3\2\2"+
		"\2\u010c\u00a1\3\2\2\2\u010c\u00a6\3\2\2\2\u010c\u00ba\3\2\2\2\u010c\u00cb"+
		"\3\2\2\2\u010c\u00d8\3\2\2\2\u010c\u00de\3\2\2\2\u010c\u00f1\3\2\2\2\u010c"+
		"\u00fa\3\2\2\2\u010c\u0103\3\2\2\2\u010d\5\3\2\2\2\u010e\u010f\7\32\2"+
		"\2\u010f\u0110\5*\26\2\u0110\u0111\7\27\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u010e\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\5$"+
		"\23\2\u0115\u0116\7\23\2\2\u0116\u0119\5$\23\2\u0117\u0118\7\27\2\2\u0118"+
		"\u011a\5\6\4\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\7\3\2\2\2"+
		"\u011b\u011c\7\32\2\2\u011c\u011d\5,\27\2\u011d\u011e\7\27\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u011b\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\5\62\32\2\u0122\u012c\7\f\2\2\u0123\u0124\5(\25\2\u0124\u0125\7"+
		"\7\2\2\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012d\5(\25\2\u012c\u0128\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0131\7\r\2\2\u012f\u0130\7\33\2\2\u0130\u0132\5"+
		"\b\5\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\t\3\2\2\2\u0133\u0134"+
		"\7\32\2\2\u0134\u0135\5*\26\2\u0135\u0136\7\27\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0138\5$\23\2\u0138\u0139\7\23\2\2\u0139\u013c\5$\23\2\u013a\u013b"+
		"\7\27\2\2\u013b\u013d\5\n\6\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2"+
		"\u013d\13\3\2\2\2\u013e\u013f\5\64\33\2\u013f\r\3\2\2\2\u0140\u0141\5"+
		"\64\33\2\u0141\17\3\2\2\2\u0142\u0145\5\22\n\2\u0143\u0144\7\27\2\2\u0144"+
		"\u0146\5\20\t\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0168\3"+
		"\2\2\2\u0147\u0148\7\34\2\2\u0148\u0149\7\25\2\2\u0149\u014f\7\t\2\2\u014a"+
		"\u014b\5\62\32\2\u014b\u014c\7\7\2\2\u014c\u014e\3\2\2\2\u014d\u014a\3"+
		"\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0155\5\62\32\2\u0153\u0154\7"+
		"\27\2\2\u0154\u0156\5\20\t\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0168\3\2\2\2\u0157\u0158\7\34\2\2\u0158\u0159\7\35\2\2\u0159\u015f\7"+
		"\t\2\2\u015a\u015b\5\62\32\2\u015b\u015c\7\7\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0165\5\62\32\2\u0163"+
		"\u0164\7\27\2\2\u0164\u0166\5\20\t\2\u0165\u0163\3\2\2\2\u0165\u0166\3"+
		"\2\2\2\u0166\u0168\3\2\2\2\u0167\u0142\3\2\2\2\u0167\u0147\3\2\2\2\u0167"+
		"\u0157\3\2\2\2\u0168\21\3\2\2\2\u0169\u01bc\5\62\32\2\u016a\u016b\5\62"+
		"\32\2\u016b\u0175\7\f\2\2\u016c\u016d\5\22\n\2\u016d\u016e\7\7\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0176\5\22\n\2\u0175\u0171\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\u017a\7\r\2\2\u0178\u0179\7\36\2\2\u0179\u017b\5\66\34\2"+
		"\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u01bc\3\2\2\2\u017c\u017d"+
		"\7\25\2\2\u017d\u0187\7\f\2\2\u017e\u017f\5\22\n\2\u017f\u0180\7\7\2\2"+
		"\u0180\u0182\3\2\2\2\u0181\u017e\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0188\5\22\n\2\u0187\u0183\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3"+
		"\2\2\2\u0189\u018a\5\22\n\2\u018a\u018b\7\r\2\2\u018b\u01bc\3\2\2\2\u018c"+
		"\u018d\7\35\2\2\u018d\u0197\7\f\2\2\u018e\u018f\5\22\n\2\u018f\u0190\7"+
		"\7\2\2\u0190\u0192\3\2\2\2\u0191\u018e\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0198\5\22\n\2\u0197\u0193\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\5\22\n\2\u019a\u019b\7\r\2\2\u019b\u01bc\3"+
		"\2\2\2\u019c\u01a6\7\f\2\2\u019d\u019e\5\22\n\2\u019e\u019f\7\7\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a7\5\22\n\2\u01a6\u01a2\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3"+
		"\2\2\2\u01a8\u01a9\5\22\n\2\u01a9\u01aa\7\r\2\2\u01aa\u01bc\3\2\2\2\u01ab"+
		"\u01ac\7\37\2\2\u01ac\u01b2\5\62\32\2\u01ad\u01af\7 \2\2\u01ae\u01b0\5"+
		"\24\13\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b3\7!\2\2\u01b2\u01ad\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01bc\3\2"+
		"\2\2\u01b4\u01b5\7\22\2\2\u01b5\u01b6\5\62\32\2\u01b6\u01b7\7\23\2\2\u01b7"+
		"\u01b8\5\22\n\2\u01b8\u01b9\7\"\2\2\u01b9\u01ba\5\22\n\2\u01ba\u01bc\3"+
		"\2\2\2\u01bb\u0169\3\2\2\2\u01bb\u016a\3\2\2\2\u01bb\u017c\3\2\2\2\u01bb"+
		"\u018c\3\2\2\2\u01bb\u019c\3\2\2\2\u01bb\u01ab\3\2\2\2\u01bb\u01b4\3\2"+
		"\2\2\u01bc\u01c9\3\2\2\2\u01bd\u01be\7\23\2\2\u01be\u01c8\5\22\n\2\u01bf"+
		"\u01c0\7#\2\2\u01c0\u01c8\5\22\n\2\u01c1\u01c2\7$\2\2\u01c2\u01c8\5\22"+
		"\n\2\u01c3\u01c4\7%\2\2\u01c4\u01c8\5\22\n\2\u01c5\u01c6\7&\2\2\u01c6"+
		"\u01c8\5\22\n\2\u01c7\u01bd\3\2\2\2\u01c7\u01bf\3\2\2\2\u01c7\u01c1\3"+
		"\2\2\2\u01c7\u01c3\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\23\3\2\2\2\u01cb\u01c9\3\2\2"+
		"\2\u01cc\u01cd\7\'\2\2\u01cd\u01ce\5\66\34\2\u01ce\u01cf\7\23\2\2\u01cf"+
		"\u01d2\5\22\n\2\u01d0\u01d1\7\27\2\2\u01d1\u01d3\5\24\13\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01dc\3\2\2\2\u01d4\u01d5\5\62\32\2"+
		"\u01d5\u01d6\7\23\2\2\u01d6\u01d9\5\22\n\2\u01d7\u01d8\7\27\2\2\u01d8"+
		"\u01da\5\24\13\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3"+
		"\2\2\2\u01db\u01cc\3\2\2\2\u01db\u01d4\3\2\2\2\u01dc\25\3\2\2\2\u01dd"+
		"\u01de\7\22\2\2\u01de\u01df\5\62\32\2\u01df\u01e0\7\23\2\2\u01e0\u01e1"+
		"\5\30\r\2\u01e1\u01e2\7\"\2\2\u01e2\u01e3\5\26\f\2\u01e3\u01fd\3\2\2\2"+
		"\u01e4\u01f6\5\62\32\2\u01e5\u01ef\7\f\2\2\u01e6\u01e7\5\30\r\2\u01e7"+
		"\u01e8\7\7\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e6\3\2\2\2\u01ea\u01ed\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f0\5\30\r\2\u01ef\u01eb\3\2\2\2\u01ef\u01f0\3"+
		"\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f4\7\r\2\2\u01f2\u01f3\7\36\2\2\u01f3"+
		"\u01f5\5\66\34\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3"+
		"\2\2\2\u01f6\u01e5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8"+
		"\u01f9\7(\2\2\u01f9\u01fb\5\66\34\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3"+
		"\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01dd\3\2\2\2\u01fc\u01e4\3\2\2\2\u01fd"+
		"\27\3\2\2\2\u01fe\u023c\5\62\32\2\u01ff\u0200\5\62\32\2\u0200\u020a\7"+
		"\f\2\2\u0201\u0202\5\30\r\2\u0202\u0203\7\7\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u0201\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\5\30\r\2\u020a"+
		"\u0206\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7\r"+
		"\2\2\u020d\u023c\3\2\2\2\u020e\u020f\7\30\2\2\u020f\u0219\7\f\2\2\u0210"+
		"\u0211\5\30\r\2\u0211\u0212\7\7\2\2\u0212\u0214\3\2\2\2\u0213\u0210\3"+
		"\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a\5\30\r\2\u0219\u0215\3"+
		"\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u023c\7\r\2\2\u021c"+
		"\u0226\7\f\2\2\u021d\u021e\5\30\r\2\u021e\u021f\7\7\2\2\u021f\u0221\3"+
		"\2\2\2\u0220\u021d\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\5\30"+
		"\r\2\u0226\u0222\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\5\30\r\2\u0229\u022a\7\r\2\2\u022a\u023c\3\2\2\2\u022b\u022c\7"+
		"\37\2\2\u022c\u0232\5\62\32\2\u022d\u022f\7 \2\2\u022e\u0230\5\32\16\2"+
		"\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233"+
		"\7!\2\2\u0232\u022d\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u023c\3\2\2\2\u0234"+
		"\u0235\7\22\2\2\u0235\u0236\5\62\32\2\u0236\u0237\7\23\2\2\u0237\u0238"+
		"\5\30\r\2\u0238\u0239\7\"\2\2\u0239\u023a\5\30\r\2\u023a\u023c\3\2\2\2"+
		"\u023b\u01fe\3\2\2\2\u023b\u01ff\3\2\2\2\u023b\u020e\3\2\2\2\u023b\u021c"+
		"\3\2\2\2\u023b\u022b\3\2\2\2\u023b\u0234\3\2\2\2\u023c\31\3\2\2\2\u023d"+
		"\u023e\7\'\2\2\u023e\u023f\5\66\34\2\u023f\u0240\7\23\2\2\u0240\u0243"+
		"\5\30\r\2\u0241\u0242\7\27\2\2\u0242\u0244\5\32\16\2\u0243\u0241\3\2\2"+
		"\2\u0243\u0244\3\2\2\2\u0244\u024d\3\2\2\2\u0245\u0246\5\62\32\2\u0246"+
		"\u0247\7\23\2\2\u0247\u024a\5\30\r\2\u0248\u0249\7\27\2\2\u0249\u024b"+
		"\5\32\16\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2"+
		"\u024c\u023d\3\2\2\2\u024c\u0245\3\2\2\2\u024d\33\3\2\2\2\u024e\u024f"+
		"\7\32\2\2\u024f\u0250\5,\27\2\u0250\u0251\7\27\2\2\u0251\u0253\3\2\2\2"+
		"\u0252\u024e\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257"+
		"\5\36\20\2\u0255\u0256\7\27\2\2\u0256\u0258\5\34\17\2\u0257\u0255\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\35\3\2\2\2\u0259\u0267\5$\23\2\u025a\u025b"+
		"\5$\23\2\u025b\u025c\7)\2\2\u025c\u025d\5$\23\2\u025d\u0267\3\2\2\2\u025e"+
		"\u025f\5$\23\2\u025f\u0260\7*\2\2\u0260\u0261\5$\23\2\u0261\u0267\3\2"+
		"\2\2\u0262\u0263\5$\23\2\u0263\u0264\7+\2\2\u0264\u0265\5$\23\2\u0265"+
		"\u0267\3\2\2\2\u0266\u0259\3\2\2\2\u0266\u025a\3\2\2\2\u0266\u025e\3\2"+
		"\2\2\u0266\u0262\3\2\2\2\u0267\37\3\2\2\2\u0268\u0334\7,\2\2\u0269\u0334"+
		"\7-\2\2\u026a\u0278\5\62\32\2\u026b\u0275\7\f\2\2\u026c\u026d\5\"\22\2"+
		"\u026d\u026e\7\7\2\2\u026e\u0270\3\2\2\2\u026f\u026c\3\2\2\2\u0270\u0273"+
		"\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0274\u0276\5\"\22\2\u0275\u0271\3\2\2\2\u0275\u0276\3"+
		"\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\7\r\2\2\u0278\u026b\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u0334\3\2\2\2\u027a\u027b\7\f\2\2\u027b\u027c\5 "+
		"\21\2\u027c\u027d\7\r\2\2\u027d\u0334\3\2\2\2\u027e\u027f\7\'\2\2\u027f"+
		"\u0334\5 \21\2\u0280\u0281\7\'\2\2\u0281\u0282\5\62\32\2\u0282\u0283\7"+
		".\2\2\u0283\u0284\5\62\32\2\u0284\u0285\5 \21\2\u0285\u0334\3\2\2\2\u0286"+
		"\u0287\7/\2\2\u0287\u0288\5\62\32\2\u0288\u0289\7.\2\2\u0289\u028a\5\62"+
		"\32\2\u028a\u028b\7\60\2\2\u028b\u028c\5 \21\2\u028c\u0334\3\2\2\2\u028d"+
		"\u028e\7\37\2\2\u028e\u029c\5\62\32\2\u028f\u0299\7 \2\2\u0290\u0291\5"+
		"\62\32\2\u0291\u0292\7\7\2\2\u0292\u0294\3\2\2\2\u0293\u0290\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0298\u029a\5\62\32\2\u0299\u0295\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\7!\2\2\u029c\u028f\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7\t\2\2\u029f"+
		"\u02a2\58\35\2\u02a0\u02a1\7\27\2\2\u02a1\u02a3\5 \21\2\u02a2\u02a0\3"+
		"\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u0334\3\2\2\2\u02a4\u02a5\5\62\32\2\u02a5"+
		"\u02a6\7\61\2\2\u02a6\u02a9\58\35\2\u02a7\u02a8\7\27\2\2\u02a8\u02aa\5"+
		" \21\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u0334\3\2\2\2\u02ab"+
		"\u02ac\7\62\2\2\u02ac\u02ad\5\"\22\2\u02ad\u02ae\7\63\2\2\u02ae\u02b1"+
		"\5 \21\2\u02af\u02b0\7\64\2\2\u02b0\u02b2\5 \21\2\u02b1\u02af\3\2\2\2"+
		"\u02b1\u02b2\3\2\2\2\u02b2\u0334\3\2\2\2\u02b3\u02b4\7\"\2\2\u02b4\u02b5"+
		"\7\f\2\2\u02b5\u02b6\5\"\22\2\u02b6\u02b7\7\7\2\2\u02b7\u02b8\5&\24\2"+
		"\u02b8\u02bb\7\r\2\2\u02b9\u02ba\7\27\2\2\u02ba\u02bc\5 \21\2\u02bb\u02b9"+
		"\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u0334\3\2\2\2\u02bd\u02be\7\65\2\2"+
		"\u02be\u02bf\7\f\2\2\u02bf\u02c0\5\"\22\2\u02c0\u02c1\7\7\2\2\u02c1\u02c2"+
		"\5\"\22\2\u02c2\u02c5\7\r\2\2\u02c3\u02c4\7\27\2\2\u02c4\u02c6\5 \21\2"+
		"\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u0334\3\2\2\2\u02c7\u02c8"+
		"\7\22\2\2\u02c8\u02c9\5&\24\2\u02c9\u02ca\7\23\2\2\u02ca\u02d1\5\"\22"+
		"\2\u02cb\u02cc\7\"\2\2\u02cc\u02cf\5 \21\2\u02cd\u02ce\7\64\2\2\u02ce"+
		"\u02d0\5 \21\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2"+
		"\2\2\u02d1\u02cb\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u0334\3\2\2\2\u02d3"+
		"\u02d6\5\62\32\2\u02d4\u02d5\7\t\2\2\u02d5\u02d7\58\35\2\u02d6\u02d4\3"+
		"\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\7\66\2\2\u02d9"+
		"\u02dc\5\"\22\2\u02da\u02db\7\27\2\2\u02db\u02dd\5 \21\2\u02dc\u02da\3"+
		"\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u0334\3\2\2\2\u02de\u02df\7\22\2\2\u02df"+
		"\u02e0\5*\26\2\u02e0\u02e1\7\67\2\2\u02e1\u02e8\5\"\22\2\u02e2\u02e3\7"+
		"\"\2\2\u02e3\u02e6\5 \21\2\u02e4\u02e5\7\64\2\2\u02e5\u02e7\5 \21\2\u02e6"+
		"\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e2\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u0334\3\2\2\2\u02ea\u02eb\78\2\2\u02eb"+
		"\u02ec\5\62\32\2\u02ec\u02f6\7\f\2\2\u02ed\u02ee\5\"\22\2\u02ee\u02ef"+
		"\7\7\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f2\3\2"+
		"\2\2\u02f5\u02f7\5\"\22\2\u02f6\u02f2\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02fb\7\r\2\2\u02f9\u02fa\7\27\2\2\u02fa\u02fc\5"+
		" \21\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0334\3\2\2\2\u02fd"+
		"\u02fe\79\2\2\u02fe\u02ff\5\62\32\2\u02ff\u0309\7\f\2\2\u0300\u0301\5"+
		"&\24\2\u0301\u0302\7\7\2\2\u0302\u0304\3\2\2\2\u0303\u0300\3\2\2\2\u0304"+
		"\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2"+
		"\2\2\u0307\u0305\3\2\2\2\u0308\u030a\5&\24\2\u0309\u0305\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030e\7\r\2\2\u030c\u030d\7\67"+
		"\2\2\u030d\u030f\5\"\22\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0316\3\2\2\2\u0310\u0311\7\"\2\2\u0311\u0314\5 \21\2\u0312\u0313\7\64"+
		"\2\2\u0313\u0315\5 \21\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u0317\3\2\2\2\u0316\u0310\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0334\3\2"+
		"\2\2\u0318\u0319\7\25\2\2\u0319\u0327\5\62\32\2\u031a\u0324\7\f\2\2\u031b"+
		"\u031c\5\"\22\2\u031c\u031d\7\7\2\2\u031d\u031f\3\2\2\2\u031e\u031b\3"+
		"\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u0323\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0325\5\"\22\2\u0324\u0320\3"+
		"\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\7\r\2\2\u0327"+
		"\u031a\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u032a\7\27"+
		"\2\2\u032a\u032c\5 \21\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u0334\3\2\2\2\u032d\u032e\7\36\2\2\u032e\u0331\5\66\34\2\u032f\u0330"+
		"\7\27\2\2\u0330\u0332\5 \21\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2"+
		"\u0332\u0334\3\2\2\2\u0333\u0268\3\2\2\2\u0333\u0269\3\2\2\2\u0333\u026a"+
		"\3\2\2\2\u0333\u027a\3\2\2\2\u0333\u027e\3\2\2\2\u0333\u0280\3\2\2\2\u0333"+
		"\u0286\3\2\2\2\u0333\u028d\3\2\2\2\u0333\u02a4\3\2\2\2\u0333\u02ab\3\2"+
		"\2\2\u0333\u02b3\3\2\2\2\u0333\u02bd\3\2\2\2\u0333\u02c7\3\2\2\2\u0333"+
		"\u02d3\3\2\2\2\u0333\u02de\3\2\2\2\u0333\u02ea\3\2\2\2\u0333\u02fd\3\2"+
		"\2\2\u0333\u0318\3\2\2\2\u0333\u032d\3\2\2\2\u0334\u0339\3\2\2\2\u0335"+
		"\u0336\7:\2\2\u0336\u0338\5 \21\2\u0337\u0335\3\2\2\2\u0338\u033b\3\2"+
		"\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a!\3\2\2\2\u033b\u0339"+
		"\3\2\2\2\u033c\u03df\5\62\32\2\u033d\u0347\7\f\2\2\u033e\u033f\5\"\22"+
		"\2\u033f\u0340\7\7\2\2\u0340\u0342\3\2\2\2\u0341\u033e\3\2\2\2\u0342\u0345"+
		"\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0346\u0348\5\"\22\2\u0347\u0343\3\2\2\2\u0347\u0348\3"+
		"\2\2\2\u0348\u0349\3\2\2\2\u0349\u03df\7\r\2\2\u034a\u034b\5\62\32\2\u034b"+
		"\u0355\7\f\2\2\u034c\u034d\5\"\22\2\u034d\u034e\7\7\2\2\u034e\u0350\3"+
		"\2\2\2\u034f\u034c\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351"+
		"\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0356\5\""+
		"\22\2\u0355\u0351\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u0358\7\r\2\2\u0358\u03df\3\2\2\2\u0359\u035a\7;\2\2\u035a\u035b\7 \2"+
		"\2\u035b\u035c\5\"\22\2\u035c\u035d\7\7\2\2\u035d\u035e\5\"\22\2\u035e"+
		"\u035f\7!\2\2\u035f\u03df\3\2\2\2\u0360\u0361\7\30\2\2\u0361\u0362\7\f"+
		"\2\2\u0362\u0363\5\"\22\2\u0363\u0364\7\r\2\2\u0364\u03df\3\2\2\2\u0365"+
		"\u0366\7\37\2\2\u0366\u0374\5\62\32\2\u0367\u0371\7 \2\2\u0368\u0369\5"+
		"\62\32\2\u0369\u036a\7\7\2\2\u036a\u036c\3\2\2\2\u036b\u0368\3\2\2\2\u036c"+
		"\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\3\2"+
		"\2\2\u036f\u036d\3\2\2\2\u0370\u0372\5\62\32\2\u0371\u036d\3\2\2\2\u0371"+
		"\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\7!\2\2\u0374\u0367\3\2"+
		"\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\7\t\2\2\u0377"+
		"\u0378\58\35\2\u0378\u0379\7\27\2\2\u0379\u037a\5\"\22\2\u037a\u03df\3"+
		"\2\2\2\u037b\u037c\5\62\32\2\u037c\u037d\7\61\2\2\u037d\u037e\58\35\2"+
		"\u037e\u037f\7\27\2\2\u037f\u0380\5\"\22\2\u0380\u03df\3\2\2\2\u0381\u0382"+
		"\7\62\2\2\u0382\u0383\5\"\22\2\u0383\u0384\7\63\2\2\u0384\u0387\5\"\22"+
		"\2\u0385\u0386\7\64\2\2\u0386\u0388\5\"\22\2\u0387\u0385\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u03df\3\2\2\2\u0389\u038a\7\22\2\2\u038a\u03df\5"+
		"&\24\2\u038b\u038e\5\62\32\2\u038c\u038d\7\t\2\2\u038d\u038f\58\35\2\u038e"+
		"\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\7\66"+
		"\2\2\u0391\u0392\5\"\22\2\u0392\u0393\7\27\2\2\u0393\u0394\5\"\22\2\u0394"+
		"\u03df\3\2\2\2\u0395\u0396\7\22\2\2\u0396\u0397\5*\26\2\u0397\u0398\7"+
		"\67\2\2\u0398\u0399\5\"\22\2\u0399\u039a\7\"\2\2\u039a\u039d\5\"\22\2"+
		"\u039b\u039c\7\64\2\2\u039c\u039e\5\"\22\2\u039d\u039b\3\2\2\2\u039d\u039e"+
		"\3\2\2\2\u039e\u03df\3\2\2\2\u039f\u03a0\78\2\2\u03a0\u03a1\5\62\32\2"+
		"\u03a1\u03ab\7\f\2\2\u03a2\u03a3\5\"\22\2\u03a3\u03a4\7\7\2\2\u03a4\u03a6"+
		"\3\2\2\2\u03a5\u03a2\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ac\5\""+
		"\22\2\u03ab\u03a7\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"\u03ae\7\r\2\2\u03ae\u03af\7\27\2\2\u03af\u03b0\5\"\22\2\u03b0\u03df\3"+
		"\2\2\2\u03b1\u03b2\79\2\2\u03b2\u03b3\5\62\32\2\u03b3\u03bd\7\f\2\2\u03b4"+
		"\u03b5\5&\24\2\u03b5\u03b6\7\7\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b4\3\2"+
		"\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u03bc\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03be\5&\24\2\u03bd\u03b9\3\2"+
		"\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c2\7\r\2\2\u03c0"+
		"\u03c1\7\67\2\2\u03c1\u03c3\5\"\22\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3"+
		"\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\7\"\2\2\u03c5\u03c8\5\"\22\2\u03c6"+
		"\u03c7\7\64\2\2\u03c7\u03c9\5\"\22\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3"+
		"\2\2\2\u03c9\u03df\3\2\2\2\u03ca\u03cb\7\25\2\2\u03cb\u03d9\5\62\32\2"+
		"\u03cc\u03d6\7\f\2\2\u03cd\u03ce\5\"\22\2\u03ce\u03cf\7\7\2\2\u03cf\u03d1"+
		"\3\2\2\2\u03d0\u03cd\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2"+
		"\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d7\5\""+
		"\22\2\u03d6\u03d2\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03da\7\r\2\2\u03d9\u03cc\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\3\2"+
		"\2\2\u03db\u03dc\7\27\2\2\u03dc\u03dd\5\"\22\2\u03dd\u03df\3\2\2\2\u03de"+
		"\u033c\3\2\2\2\u03de\u033d\3\2\2\2\u03de\u034a\3\2\2\2\u03de\u0359\3\2"+
		"\2\2\u03de\u0360\3\2\2\2\u03de\u0365\3\2\2\2\u03de\u037b\3\2\2\2\u03de"+
		"\u0381\3\2\2\2\u03de\u0389\3\2\2\2\u03de\u038b\3\2\2\2\u03de\u0395\3\2"+
		"\2\2\u03de\u039f\3\2\2\2\u03de\u03b1\3\2\2\2\u03de\u03ca\3\2\2\2\u03df"+
		"\u03ea\3\2\2\2\u03e0\u03e1\7\23\2\2\u03e1\u03e9\5\"\22\2\u03e2\u03e3\7"+
		"#\2\2\u03e3\u03e9\5\"\22\2\u03e4\u03e5\7%\2\2\u03e5\u03e9\5\"\22\2\u03e6"+
		"\u03e7\7$\2\2\u03e7\u03e9\5\"\22\2\u03e8\u03e0\3\2\2\2\u03e8\u03e2\3\2"+
		"\2\2\u03e8\u03e4\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb#\3\2\2\2\u03ec\u03ea\3\2\2\2"+
		"\u03ed\u0410\5\62\32\2\u03ee\u03f8\7\f\2\2\u03ef\u03f0\5$\23\2\u03f0\u03f1"+
		"\7\7\2\2\u03f1\u03f3\3\2\2\2\u03f2\u03ef\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2"+
		"\2\2\u03f7\u03f9\5$\23\2\u03f8\u03f4\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03fa\3\2\2\2\u03fa\u0410\7\r\2\2\u03fb\u03fc\5\62\32\2\u03fc\u0406\7"+
		"\f\2\2\u03fd\u03fe\5$\23\2\u03fe\u03ff\7\7\2\2\u03ff\u0401\3\2\2\2\u0400"+
		"\u03fd\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2"+
		"\2\2\u0403\u0405\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0407\5$\23\2\u0406"+
		"\u0402\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\7\r"+
		"\2\2\u0409\u0410\3\2\2\2\u040a\u040b\7\30\2\2\u040b\u040c\7\f\2\2\u040c"+
		"\u040d\5$\23\2\u040d\u040e\7\r\2\2\u040e\u0410\3\2\2\2\u040f\u03ed\3\2"+
		"\2\2\u040f\u03ee\3\2\2\2\u040f\u03fb\3\2\2\2\u040f\u040a\3\2\2\2\u0410"+
		"\u041b\3\2\2\2\u0411\u0412\7\23\2\2\u0412\u041a\5$\23\2\u0413\u0414\7"+
		"#\2\2\u0414\u041a\5$\23\2\u0415\u0416\7%\2\2\u0416\u041a\5$\23\2\u0417"+
		"\u0418\7$\2\2\u0418\u041a\5$\23\2\u0419\u0411\3\2\2\2\u0419\u0413\3\2"+
		"\2\2\u0419\u0415\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041d\3\2\2\2\u041b"+
		"\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c%\3\2\2\2\u041d\u041b\3\2\2\2"+
		"\u041e\u0442\5\62\32\2\u041f\u0420\5\62\32\2\u0420\u0421\7\t\2\2\u0421"+
		"\u0422\58\35\2\u0422\u0442\3\2\2\2\u0423\u042d\7\f\2\2\u0424\u0425\5&"+
		"\24\2\u0425\u0426\7\7\2\2\u0426\u0428\3\2\2\2\u0427\u0424\3\2\2\2\u0428"+
		"\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c\3\2"+
		"\2\2\u042b\u0429\3\2\2\2\u042c\u042e\5&\24\2\u042d\u0429\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0442\7\r\2\2\u0430\u0431\5\62"+
		"\32\2\u0431\u043b\7\f\2\2\u0432\u0433\5&\24\2\u0433\u0434\7\7\2\2\u0434"+
		"\u0436\3\2\2\2\u0435\u0432\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2"+
		"\2\2\u0437\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439\u0437\3\2\2\2\u043a"+
		"\u043c\5&\24\2\u043b\u0437\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2"+
		"\2\2\u043d\u043e\7\r\2\2\u043e\u0442\3\2\2\2\u043f\u0440\7\23\2\2\u0440"+
		"\u0442\5\"\22\2\u0441\u041e\3\2\2\2\u0441\u041f\3\2\2\2\u0441\u0423\3"+
		"\2\2\2\u0441\u0430\3\2\2\2\u0441\u043f\3\2\2\2\u0442\'\3\2\2\2\u0443\u0446"+
		"\5$\23\2\u0444\u0446\7<\2\2\u0445\u0443\3\2\2\2\u0445\u0444\3\2\2\2\u0446"+
		")\3\2\2\2\u0447\u0448\5\62\32\2\u0448\u0449\7\t\2\2\u0449\u044c\58\35"+
		"\2\u044a\u044b\7\7\2\2\u044b\u044d\5*\26\2\u044c\u044a\3\2\2\2\u044c\u044d"+
		"\3\2\2\2\u044d+\3\2\2\2\u044e\u044f\5\62\32\2\u044f\u0450\7\t\2\2\u0450"+
		"\u0453\58\35\2\u0451\u0452\7=\2\2\u0452\u0454\7<\2\2\u0453\u0451\3\2\2"+
		"\2\u0453\u0454\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0456\7\7\2\2\u0456\u0458"+
		"\5*\26\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458-\3\2\2\2\u0459"+
		"\u045f\7 \2\2\u045a\u045b\5\60\31\2\u045b\u045c\7\7\2\2\u045c\u045e\3"+
		"\2\2\2\u045d\u045a\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0463\5\60"+
		"\31\2\u0463\u0464\7!\2\2\u0464\u0466\3\2\2\2\u0465\u0459\3\2\2\2\u0465"+
		"\u0466\3\2\2\2\u0466/\3\2\2\2\u0467\u0468\t\2\2\2\u0468\61\3\2\2\2\u0469"+
		"\u046a\5\64\33\2\u046a\63\3\2\2\2\u046b\u046c\7C\2\2\u046c\65\3\2\2\2"+
		"\u046d\u046e\7D\2\2\u046e\67\3\2\2\2\u046f\u0470\t\3\2\2\u04709\3\2\2"+
		"\2\u0093=NZiz~\u0093\u0097\u00ae\u00b2\u00b5\u00c2\u00c6\u00cf\u00d2\u00e6"+
		"\u00ea\u00ed\u00f5\u00fe\u0107\u010c\u0112\u0119\u011f\u0128\u012c\u0131"+
		"\u013c\u0145\u014f\u0155\u015f\u0165\u0167\u0171\u0175\u017a\u0183\u0187"+
		"\u0193\u0197\u01a2\u01a6\u01af\u01b2\u01bb\u01c7\u01c9\u01d2\u01d9\u01db"+
		"\u01eb\u01ef\u01f4\u01f6\u01fa\u01fc\u0206\u020a\u0215\u0219\u0222\u0226"+
		"\u022f\u0232\u023b\u0243\u024a\u024c\u0252\u0257\u0266\u0271\u0275\u0278"+
		"\u0295\u0299\u029c\u02a2\u02a9\u02b1\u02bb\u02c5\u02cf\u02d1\u02d6\u02dc"+
		"\u02e6\u02e8\u02f2\u02f6\u02fb\u0305\u0309\u030e\u0314\u0316\u0320\u0324"+
		"\u0327\u032b\u0331\u0333\u0339\u0343\u0347\u0351\u0355\u036d\u0371\u0374"+
		"\u0387\u038e\u039d\u03a7\u03ab\u03b9\u03bd\u03c2\u03c8\u03d2\u03d6\u03d9"+
		"\u03de\u03e8\u03ea\u03f4\u03f8\u0402\u0406\u040f\u0419\u041b\u0429\u042d"+
		"\u0437\u043b\u0441\u0445\u044c\u0453\u0457\u045f\u0465";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}