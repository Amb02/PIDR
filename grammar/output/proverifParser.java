// $ANTLR null C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g 2019-02-26 23:23:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class proverifParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'!'", "'&&'", "'('", "')'", "','", "'->'", "'/'", 
		"'0'", "':'", "';'", "'<-'", "'<->'", "'<-R'", "'<='", "'<=>'", "'<>'", 
		"'='", "'==>'", "'['", "']'", "'channel'", "'choice'", "'const'", "'do'", 
		"'else'", "'equation'", "'event'", "'fail'", "'forall'", "'foreach'", 
		"'free'", "'fun'", "'get'", "'if'", "'in'", "'inj-event'", "'insert'", 
		"'let'", "'new'", "'not'", "'nounif'", "'or'", "'otherwise'", "'out'", 
		"'phase'", "'pred'", "'process'", "'putbegin'", "'query'", "'reduc'", 
		"'set'", "'suchthat'", "'table'", "'then'", "'type'", "'yield'", "'|'", 
		"'||'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred158_proverif", "synpred81_proverif", "synpred42_proverif", 
		"synpred157_proverif", "synpred167_proverif", "synpred163_proverif", "synpred145_proverif", 
		"synpred15_proverif", "synpred7_proverif", "synpred33_proverif", "synpred209_proverif", 
		"synpred88_proverif", "synpred196_proverif", "synpred10_proverif", "synpred69_proverif", 
		"synpred58_proverif", "synpred83_proverif", "synpred28_proverif", "synpred44_proverif", 
		"synpred146_proverif", "synpred184_proverif", "synpred111_proverif", "synpred138_proverif", 
		"synpred161_proverif", "synpred155_proverif", "synpred65_proverif", "synpred103_proverif", 
		"synpred77_proverif", "synpred182_proverif", "synpred139_proverif", "synpred154_proverif", 
		"id", "synpred55_proverif", "synpred185_proverif", "synpred5_proverif", 
		"synpred72_proverif", "synpred99_proverif", "synpred143_proverif", "synpred197_proverif", 
		"synpred74_proverif", "clause", "synpred125_proverif", "synpred113_proverif", 
		"synpred43_proverif", "synpred47_proverif", "synpred61_proverif", "synpred66_proverif", 
		"synpred85_proverif", "synpred76_proverif", "synpred22_proverif", "synpred36_proverif", 
		"synpred179_proverif", "synpred204_proverif", "name", "ident", "synpred142_proverif", 
		"synpred210_proverif", "gbinding", "synpred34_proverif", "synpred183_proverif", 
		"synpred94_proverif", "synpred48_proverif", "synpred159_proverif", "synpred181_proverif", 
		"synpred135_proverif", "programme", "synpred93_proverif", "value", "synpred91_proverif", 
		"synpred35_proverif", "synpred67_proverif", "synpred79_proverif", "synpred71_proverif", 
		"synpred63_proverif", "synpred130_proverif", "synpred140_proverif", "synpred166_proverif", 
		"synpred102_proverif", "synpred203_proverif", "synpred123_proverif", "clauses", 
		"synpred40_proverif", "synpred150_proverif", "synpred168_proverif", "synpred11_proverif", 
		"synpred46_proverif", "synpred114_proverif", "synpred116_proverif", "synpred87_proverif", 
		"synpred169_proverif", "synpred124_proverif", "synpred189_proverif", "synpred117_proverif", 
		"synpred199_proverif", "synpred49_proverif", "synpred29_proverif", "synpred90_proverif", 
		"synpred97_proverif", "synpred104_proverif", "synpred149_proverif", "synpred194_proverif", 
		"synpred64_proverif", "synpred57_proverif", "mayfailterm", "synpred127_proverif", 
		"synpred78_proverif", "synpred80_proverif", "synpred178_proverif", "synpred108_proverif", 
		"gterm", "synpred174_proverif", "synpred193_proverif", "reduc", "synpred122_proverif", 
		"synpred192_proverif", "synpred195_proverif", "synpred27_proverif", "synpred120_proverif", 
		"synpred177_proverif", "synpred156_proverif", "term", "synpred45_proverif", 
		"synpred201_proverif", "synpred119_proverif", "synpred131_proverif", "synpred109_proverif", 
		"synpred207_proverif", "synpred56_proverif", "synpred171_proverif", "synpred172_proverif", 
		"synpred1_proverif", "synpred129_proverif", "synpred62_proverif", "synpred75_proverif", 
		"synpred9_proverif", "synpred70_proverif", "synpred19_proverif", "synpred2_proverif", 
		"synpred89_proverif", "synpred148_proverif", "synpred206_proverif", "synpred38_proverif", 
		"synpred106_proverif", "synpred84_proverif", "synpred3_proverif", "synpred176_proverif", 
		"integer", "synpred73_proverif", "failtypedecl", "synpred53_proverif", 
		"synpred17_proverif", "synpred26_proverif", "synpred132_proverif", "synpred54_proverif", 
		"synpred151_proverif", "synpred21_proverif", "synpred105_proverif", "synpred37_proverif", 
		"synpred153_proverif", "synpred211_proverif", "synpred118_proverif", "typedecl", 
		"synpred115_proverif", "reducprime", "gformat", "synpred144_proverif", 
		"synpred175_proverif", "typeid", "synpred18_proverif", "synpred4_proverif", 
		"nounifdecl", "synpred170_proverif", "synpred41_proverif", "synpred100_proverif", 
		"synpred165_proverif", "synpred208_proverif", "synpred187_proverif", "synpred96_proverif", 
		"synpred162_proverif", "synpred16_proverif", "synpred50_proverif", "pattern", 
		"synpred6_proverif", "synpred101_proverif", "synpred180_proverif", "synpred59_proverif", 
		"synpred110_proverif", "synpred164_proverif", "process", "synpred137_proverif", 
		"synpred112_proverif", "synpred186_proverif", "synpred86_proverif", "synpred134_proverif", 
		"synpred128_proverif", "synpred121_proverif", "synpred24_proverif", "fbinding", 
		"synpred68_proverif", "pterm", "query", "synpred190_proverif", "synpred147_proverif", 
		"synpred188_proverif", "synpred31_proverif", "synpred13_proverif", "synpred82_proverif", 
		"synpred173_proverif", "synpred126_proverif", "synpred8_proverif", "synpred14_proverif", 
		"synpred98_proverif", "synpred92_proverif", "synpred12_proverif", "synpred198_proverif", 
		"synpred136_proverif", "synpred95_proverif", "synpred133_proverif", "eqlist", 
		"synpred25_proverif", "synpred152_proverif", "synpred23_proverif", "declaration", 
		"synpred51_proverif", "synpred141_proverif", "synpred20_proverif", "synpred32_proverif", 
		"synpred160_proverif", "synpred202_proverif", "synpred39_proverif", "synpred52_proverif", 
		"proverifOptions", "synpred191_proverif", "synpred60_proverif", "synpred107_proverif", 
		"synpred30_proverif", "synpred200_proverif", "synpred205_proverif"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, true, false, false, false, true, false, false, false, false, 
		    false, false, false, false, false, true, false, false, true, true, 
		    true, true, true, true, false, false, true, true, false, false, false, 
		    true, false, false, false, false, false, true, false, true, false, 
		    true, true, false, false, true, false, false, false, false, false, 
		    true, true, false, false, false, false, false, false, false, true, 
		    false, false, true, false, false, false, true, false, true, false, 
		    false, true, false, false, true, false, true, false, false, false, 
		    false, false, true, true, false, true, false, false, false, false, 
		    true, false, true, true, false, true, false, false, true, true, false, 
		    false, true, true, true, false, true, false, false, true, true, false, 
		    true, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, true, false, false, true, false, false, true, 
		    false, false, true, false, false, false, false, false, false, false, 
		    false, false, false, false, true, false, false, false, false, true, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public proverifParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public proverifParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public proverifParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return proverifParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g"; }



	// $ANTLR start "programme"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:8:1: programme : ( declaration )* 'process' process ;
	public final void programme() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "programme");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:9:2: ( ( declaration )* 'process' process )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:9:4: ( declaration )* 'process' process
			{
			dbg.location(9,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:9:4: ( declaration )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==36||LA1_0==38||(LA1_0 >= 41 && LA1_0 <= 42)||(LA1_0 >= 46 && LA1_0 <= 47)||LA1_0==53||(LA1_0 >= 55 && LA1_0 <= 56)||LA1_0==61||(LA1_0 >= 64 && LA1_0 <= 66)||LA1_0==68||LA1_0==70) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:9:4: declaration
					{
					dbg.location(9,4);
					pushFollow(FOLLOW_declaration_in_programme30);
					declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(9,17);
			match(input,62,FOLLOW_62_in_programme33); if (state.failed) return;dbg.location(9,27);
			pushFollow(FOLLOW_process_in_programme35);
			process();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(10, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "programme");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "programme"



	// $ANTLR start "declaration"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:12:1: declaration : ( 'type' ident proverifOptions | 'channel' ( ident ',' )* ident | 'free' ( ident ',' )* ident ':' typeid proverifOptions | 'const' ( ident ',' )* ident ':' typeid proverifOptions | 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions | 'reduc' reduc proverifOptions | 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions | 'equation' eqlist proverifOptions | 'pred' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? proverifOptions | 'table' ident '(' ( ( typeid ',' )* typeid )? ')' | 'let' ident ( '(' ( typedecl )? ')' )? '=' process | 'set' name '=' value | 'event' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? | 'query' ( typedecl ';' )? query | 'not' ( typedecl ';' )? gterm | 'nounif' ( typedecl ';' )? nounifdecl );
	public final void declaration() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:13:2: ( 'type' ident proverifOptions | 'channel' ( ident ',' )* ident | 'free' ( ident ',' )* ident ':' typeid proverifOptions | 'const' ( ident ',' )* ident ':' typeid proverifOptions | 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions | 'reduc' reduc proverifOptions | 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions | 'equation' eqlist proverifOptions | 'pred' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? proverifOptions | 'table' ident '(' ( ( typeid ',' )* typeid )? ')' | 'let' ident ( '(' ( typedecl )? ')' )? '=' process | 'set' name '=' value | 'event' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? | 'query' ( typedecl ';' )? query | 'not' ( typedecl ';' )? gterm | 'nounif' ( typedecl ';' )? nounifdecl )
			int alt22=16;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			switch ( input.LA(1) ) {
			case 70:
				{
				alt22=1;
				}
				break;
			case 36:
				{
				alt22=2;
				}
				break;
			case 46:
				{
				alt22=3;
				}
				break;
			case 38:
				{
				alt22=4;
				}
				break;
			case 47:
				{
				int LA22_5 = input.LA(2);
				if ( (synpred11_proverif()) ) {
					alt22=5;
				}
				else if ( (synpred15_proverif()) ) {
					alt22=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 5, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 65:
				{
				alt22=6;
				}
				break;
			case 41:
				{
				alt22=8;
				}
				break;
			case 61:
				{
				alt22=9;
				}
				break;
			case 68:
				{
				alt22=10;
				}
				break;
			case 53:
				{
				alt22=11;
				}
				break;
			case 66:
				{
				alt22=12;
				}
				break;
			case 42:
				{
				alt22=13;
				}
				break;
			case 64:
				{
				alt22=14;
				}
				break;
			case 55:
				{
				alt22=15;
				}
				break;
			case 56:
				{
				alt22=16;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:13:4: 'type' ident proverifOptions
					{
					dbg.location(13,4);
					match(input,70,FOLLOW_70_in_declaration46); if (state.failed) return;dbg.location(13,11);
					pushFollow(FOLLOW_ident_in_declaration48);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(13,17);
					pushFollow(FOLLOW_proverifOptions_in_declaration50);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:14:4: 'channel' ( ident ',' )* ident
					{
					dbg.location(14,4);
					match(input,36,FOLLOW_36_in_declaration55); if (state.failed) return;dbg.location(14,15);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:14:15: ( ident ',' )*
					try { dbg.enterSubRule(2);

					loop2:
					while (true) {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==ID) ) {
							int LA2_1 = input.LA(2);
							if ( (LA2_1==20) ) {
								alt2=1;
							}

						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:14:16: ident ','
							{
							dbg.location(14,16);
							pushFollow(FOLLOW_ident_in_declaration59);
							ident();
							state._fsp--;
							if (state.failed) return;dbg.location(14,22);
							match(input,20,FOLLOW_20_in_declaration61); if (state.failed) return;
							}
							break;

						default :
							break loop2;
						}
					}
					} finally {dbg.exitSubRule(2);}
					dbg.location(14,28);
					pushFollow(FOLLOW_ident_in_declaration65);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:15:4: 'free' ( ident ',' )* ident ':' typeid proverifOptions
					{
					dbg.location(15,4);
					match(input,46,FOLLOW_46_in_declaration70); if (state.failed) return;dbg.location(15,11);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:15:11: ( ident ',' )*
					try { dbg.enterSubRule(3);

					loop3:
					while (true) {
						int alt3=2;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( (LA3_0==ID) ) {
							int LA3_1 = input.LA(2);
							if ( (LA3_1==20) ) {
								alt3=1;
							}

						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:15:12: ident ','
							{
							dbg.location(15,12);
							pushFollow(FOLLOW_ident_in_declaration73);
							ident();
							state._fsp--;
							if (state.failed) return;dbg.location(15,18);
							match(input,20,FOLLOW_20_in_declaration75); if (state.failed) return;
							}
							break;

						default :
							break loop3;
						}
					}
					} finally {dbg.exitSubRule(3);}
					dbg.location(15,24);
					pushFollow(FOLLOW_ident_in_declaration79);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(15,30);
					match(input,24,FOLLOW_24_in_declaration81); if (state.failed) return;dbg.location(15,34);
					pushFollow(FOLLOW_typeid_in_declaration83);
					typeid();
					state._fsp--;
					if (state.failed) return;dbg.location(15,41);
					pushFollow(FOLLOW_proverifOptions_in_declaration85);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:16:4: 'const' ( ident ',' )* ident ':' typeid proverifOptions
					{
					dbg.location(16,4);
					match(input,38,FOLLOW_38_in_declaration90); if (state.failed) return;dbg.location(16,12);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:16:12: ( ident ',' )*
					try { dbg.enterSubRule(4);

					loop4:
					while (true) {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID) ) {
							int LA4_1 = input.LA(2);
							if ( (LA4_1==20) ) {
								alt4=1;
							}

						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:16:13: ident ','
							{
							dbg.location(16,13);
							pushFollow(FOLLOW_ident_in_declaration93);
							ident();
							state._fsp--;
							if (state.failed) return;dbg.location(16,19);
							match(input,20,FOLLOW_20_in_declaration95); if (state.failed) return;
							}
							break;

						default :
							break loop4;
						}
					}
					} finally {dbg.exitSubRule(4);}
					dbg.location(16,25);
					pushFollow(FOLLOW_ident_in_declaration99);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(16,31);
					match(input,24,FOLLOW_24_in_declaration101); if (state.failed) return;dbg.location(16,35);
					pushFollow(FOLLOW_typeid_in_declaration103);
					typeid();
					state._fsp--;
					if (state.failed) return;dbg.location(16,42);
					pushFollow(FOLLOW_proverifOptions_in_declaration105);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:4: 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions
					{
					dbg.location(17,4);
					match(input,47,FOLLOW_47_in_declaration110); if (state.failed) return;dbg.location(17,10);
					pushFollow(FOLLOW_ident_in_declaration112);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(17,16);
					match(input,18,FOLLOW_18_in_declaration114); if (state.failed) return;dbg.location(17,20);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:20: ( ( typeid ',' )* typeid )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==ID) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:21: ( typeid ',' )* typeid
							{
							dbg.location(17,21);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:21: ( typeid ',' )*
							try { dbg.enterSubRule(5);

							loop5:
							while (true) {
								int alt5=2;
								try { dbg.enterDecision(5, decisionCanBacktrack[5]);

								int LA5_0 = input.LA(1);
								if ( (LA5_0==ID) ) {
									int LA5_1 = input.LA(2);
									if ( (LA5_1==20) ) {
										alt5=1;
									}

								}

								} finally {dbg.exitDecision(5);}

								switch (alt5) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:22: typeid ','
									{
									dbg.location(17,22);
									pushFollow(FOLLOW_typeid_in_declaration118);
									typeid();
									state._fsp--;
									if (state.failed) return;dbg.location(17,29);
									match(input,20,FOLLOW_20_in_declaration120); if (state.failed) return;
									}
									break;

								default :
									break loop5;
								}
							}
							} finally {dbg.exitSubRule(5);}
							dbg.location(17,35);
							pushFollow(FOLLOW_typeid_in_declaration124);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(17,44);
					match(input,19,FOLLOW_19_in_declaration128); if (state.failed) return;dbg.location(17,48);
					match(input,24,FOLLOW_24_in_declaration130); if (state.failed) return;dbg.location(17,52);
					pushFollow(FOLLOW_typeid_in_declaration132);
					typeid();
					state._fsp--;
					if (state.failed) return;dbg.location(17,59);
					pushFollow(FOLLOW_proverifOptions_in_declaration134);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:18:4: 'reduc' reduc proverifOptions
					{
					dbg.location(18,4);
					match(input,65,FOLLOW_65_in_declaration139); if (state.failed) return;dbg.location(18,12);
					pushFollow(FOLLOW_reduc_in_declaration141);
					reduc();
					state._fsp--;
					if (state.failed) return;dbg.location(18,18);
					pushFollow(FOLLOW_proverifOptions_in_declaration143);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:4: 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions
					{
					dbg.location(19,4);
					match(input,47,FOLLOW_47_in_declaration148); if (state.failed) return;dbg.location(19,10);
					pushFollow(FOLLOW_ident_in_declaration150);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(19,16);
					match(input,18,FOLLOW_18_in_declaration152); if (state.failed) return;dbg.location(19,20);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:20: ( ( typeid ',' )* typeid )?
					int alt8=2;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					int LA8_0 = input.LA(1);
					if ( (LA8_0==ID) ) {
						alt8=1;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:21: ( typeid ',' )* typeid
							{
							dbg.location(19,21);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:21: ( typeid ',' )*
							try { dbg.enterSubRule(7);

							loop7:
							while (true) {
								int alt7=2;
								try { dbg.enterDecision(7, decisionCanBacktrack[7]);

								int LA7_0 = input.LA(1);
								if ( (LA7_0==ID) ) {
									int LA7_1 = input.LA(2);
									if ( (LA7_1==20) ) {
										alt7=1;
									}

								}

								} finally {dbg.exitDecision(7);}

								switch (alt7) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:22: typeid ','
									{
									dbg.location(19,22);
									pushFollow(FOLLOW_typeid_in_declaration156);
									typeid();
									state._fsp--;
									if (state.failed) return;dbg.location(19,29);
									match(input,20,FOLLOW_20_in_declaration158); if (state.failed) return;
									}
									break;

								default :
									break loop7;
								}
							}
							} finally {dbg.exitSubRule(7);}
							dbg.location(19,35);
							pushFollow(FOLLOW_typeid_in_declaration162);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(8);}
					dbg.location(19,44);
					match(input,19,FOLLOW_19_in_declaration166); if (state.failed) return;dbg.location(19,48);
					match(input,24,FOLLOW_24_in_declaration168); if (state.failed) return;dbg.location(19,52);
					pushFollow(FOLLOW_typeid_in_declaration170);
					typeid();
					state._fsp--;
					if (state.failed) return;dbg.location(19,59);
					match(input,65,FOLLOW_65_in_declaration172); if (state.failed) return;dbg.location(19,67);
					pushFollow(FOLLOW_reducprime_in_declaration174);
					reducprime();
					state._fsp--;
					if (state.failed) return;dbg.location(19,78);
					pushFollow(FOLLOW_proverifOptions_in_declaration176);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:20:4: 'equation' eqlist proverifOptions
					{
					dbg.location(20,4);
					match(input,41,FOLLOW_41_in_declaration181); if (state.failed) return;dbg.location(20,15);
					pushFollow(FOLLOW_eqlist_in_declaration183);
					eqlist();
					state._fsp--;
					if (state.failed) return;dbg.location(20,22);
					pushFollow(FOLLOW_proverifOptions_in_declaration185);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:21:4: 'pred' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? proverifOptions
					{
					dbg.location(21,4);
					match(input,61,FOLLOW_61_in_declaration190); if (state.failed) return;dbg.location(21,11);
					pushFollow(FOLLOW_ident_in_declaration192);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(21,17);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:21:17: ( '(' ( ( typeid ',' )* typeid )? ')' )?
					int alt11=2;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					int LA11_0 = input.LA(1);
					if ( (LA11_0==18) ) {
						alt11=1;
					}
					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:21:19: '(' ( ( typeid ',' )* typeid )? ')'
							{
							dbg.location(21,19);
							match(input,18,FOLLOW_18_in_declaration196); if (state.failed) return;dbg.location(21,23);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:21:23: ( ( typeid ',' )* typeid )?
							int alt10=2;
							try { dbg.enterSubRule(10);
							try { dbg.enterDecision(10, decisionCanBacktrack[10]);

							int LA10_0 = input.LA(1);
							if ( (LA10_0==ID) ) {
								alt10=1;
							}
							} finally {dbg.exitDecision(10);}

							switch (alt10) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:21:24: ( typeid ',' )* typeid
									{
									dbg.location(21,24);
									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:21:24: ( typeid ',' )*
									try { dbg.enterSubRule(9);

									loop9:
									while (true) {
										int alt9=2;
										try { dbg.enterDecision(9, decisionCanBacktrack[9]);

										int LA9_0 = input.LA(1);
										if ( (LA9_0==ID) ) {
											int LA9_1 = input.LA(2);
											if ( (LA9_1==20) ) {
												alt9=1;
											}

										}

										} finally {dbg.exitDecision(9);}

										switch (alt9) {
										case 1 :
											dbg.enterAlt(1);

											// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:21:25: typeid ','
											{
											dbg.location(21,25);
											pushFollow(FOLLOW_typeid_in_declaration200);
											typeid();
											state._fsp--;
											if (state.failed) return;dbg.location(21,32);
											match(input,20,FOLLOW_20_in_declaration202); if (state.failed) return;
											}
											break;

										default :
											break loop9;
										}
									}
									} finally {dbg.exitSubRule(9);}
									dbg.location(21,38);
									pushFollow(FOLLOW_typeid_in_declaration206);
									typeid();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(10);}
							dbg.location(21,47);
							match(input,19,FOLLOW_19_in_declaration210); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(21,54);
					pushFollow(FOLLOW_proverifOptions_in_declaration215);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:22:4: 'table' ident '(' ( ( typeid ',' )* typeid )? ')'
					{
					dbg.location(22,4);
					match(input,68,FOLLOW_68_in_declaration220); if (state.failed) return;dbg.location(22,12);
					pushFollow(FOLLOW_ident_in_declaration222);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(22,18);
					match(input,18,FOLLOW_18_in_declaration224); if (state.failed) return;dbg.location(22,22);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:22:22: ( ( typeid ',' )* typeid )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==ID) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:22:23: ( typeid ',' )* typeid
							{
							dbg.location(22,23);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:22:23: ( typeid ',' )*
							try { dbg.enterSubRule(12);

							loop12:
							while (true) {
								int alt12=2;
								try { dbg.enterDecision(12, decisionCanBacktrack[12]);

								int LA12_0 = input.LA(1);
								if ( (LA12_0==ID) ) {
									int LA12_1 = input.LA(2);
									if ( (LA12_1==20) ) {
										alt12=1;
									}

								}

								} finally {dbg.exitDecision(12);}

								switch (alt12) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:22:24: typeid ','
									{
									dbg.location(22,24);
									pushFollow(FOLLOW_typeid_in_declaration228);
									typeid();
									state._fsp--;
									if (state.failed) return;dbg.location(22,31);
									match(input,20,FOLLOW_20_in_declaration230); if (state.failed) return;
									}
									break;

								default :
									break loop12;
								}
							}
							} finally {dbg.exitSubRule(12);}
							dbg.location(22,37);
							pushFollow(FOLLOW_typeid_in_declaration234);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(22,46);
					match(input,19,FOLLOW_19_in_declaration238); if (state.failed) return;
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:23:4: 'let' ident ( '(' ( typedecl )? ')' )? '=' process
					{
					dbg.location(23,4);
					match(input,53,FOLLOW_53_in_declaration243); if (state.failed) return;dbg.location(23,10);
					pushFollow(FOLLOW_ident_in_declaration245);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(23,16);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:23:16: ( '(' ( typedecl )? ')' )?
					int alt15=2;
					try { dbg.enterSubRule(15);
					try { dbg.enterDecision(15, decisionCanBacktrack[15]);

					int LA15_0 = input.LA(1);
					if ( (LA15_0==18) ) {
						alt15=1;
					}
					} finally {dbg.exitDecision(15);}

					switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:23:18: '(' ( typedecl )? ')'
							{
							dbg.location(23,18);
							match(input,18,FOLLOW_18_in_declaration249); if (state.failed) return;dbg.location(23,22);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:23:22: ( typedecl )?
							int alt14=2;
							try { dbg.enterSubRule(14);
							try { dbg.enterDecision(14, decisionCanBacktrack[14]);

							int LA14_0 = input.LA(1);
							if ( (LA14_0==ID) ) {
								alt14=1;
							}
							} finally {dbg.exitDecision(14);}

							switch (alt14) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:23:23: typedecl
									{
									dbg.location(23,23);
									pushFollow(FOLLOW_typedecl_in_declaration252);
									typedecl();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(14);}
							dbg.location(23,34);
							match(input,19,FOLLOW_19_in_declaration256); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(15);}
					dbg.location(23,40);
					match(input,32,FOLLOW_32_in_declaration260); if (state.failed) return;dbg.location(23,44);
					pushFollow(FOLLOW_process_in_declaration262);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:24:4: 'set' name '=' value
					{
					dbg.location(24,4);
					match(input,66,FOLLOW_66_in_declaration267); if (state.failed) return;dbg.location(24,10);
					pushFollow(FOLLOW_name_in_declaration269);
					name();
					state._fsp--;
					if (state.failed) return;dbg.location(24,15);
					match(input,32,FOLLOW_32_in_declaration271); if (state.failed) return;dbg.location(24,19);
					pushFollow(FOLLOW_value_in_declaration273);
					value();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:25:4: 'event' ident ( '(' ( ( typeid ',' )* typeid )? ')' )?
					{
					dbg.location(25,4);
					match(input,42,FOLLOW_42_in_declaration278); if (state.failed) return;dbg.location(25,12);
					pushFollow(FOLLOW_ident_in_declaration280);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(25,18);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:25:18: ( '(' ( ( typeid ',' )* typeid )? ')' )?
					int alt18=2;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					int LA18_0 = input.LA(1);
					if ( (LA18_0==18) ) {
						alt18=1;
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:25:20: '(' ( ( typeid ',' )* typeid )? ')'
							{
							dbg.location(25,20);
							match(input,18,FOLLOW_18_in_declaration284); if (state.failed) return;dbg.location(25,24);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:25:24: ( ( typeid ',' )* typeid )?
							int alt17=2;
							try { dbg.enterSubRule(17);
							try { dbg.enterDecision(17, decisionCanBacktrack[17]);

							int LA17_0 = input.LA(1);
							if ( (LA17_0==ID) ) {
								alt17=1;
							}
							} finally {dbg.exitDecision(17);}

							switch (alt17) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:25:25: ( typeid ',' )* typeid
									{
									dbg.location(25,25);
									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:25:25: ( typeid ',' )*
									try { dbg.enterSubRule(16);

									loop16:
									while (true) {
										int alt16=2;
										try { dbg.enterDecision(16, decisionCanBacktrack[16]);

										int LA16_0 = input.LA(1);
										if ( (LA16_0==ID) ) {
											int LA16_1 = input.LA(2);
											if ( (LA16_1==20) ) {
												alt16=1;
											}

										}

										} finally {dbg.exitDecision(16);}

										switch (alt16) {
										case 1 :
											dbg.enterAlt(1);

											// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:25:26: typeid ','
											{
											dbg.location(25,26);
											pushFollow(FOLLOW_typeid_in_declaration288);
											typeid();
											state._fsp--;
											if (state.failed) return;dbg.location(25,33);
											match(input,20,FOLLOW_20_in_declaration290); if (state.failed) return;
											}
											break;

										default :
											break loop16;
										}
									}
									} finally {dbg.exitSubRule(16);}
									dbg.location(25,39);
									pushFollow(FOLLOW_typeid_in_declaration294);
									typeid();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(17);}
							dbg.location(25,48);
							match(input,19,FOLLOW_19_in_declaration298); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(18);}

					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:26:4: 'query' ( typedecl ';' )? query
					{
					dbg.location(26,4);
					match(input,64,FOLLOW_64_in_declaration306); if (state.failed) return;dbg.location(26,12);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:26:12: ( typedecl ';' )?
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==ID) ) {
						int LA19_1 = input.LA(2);
						if ( (LA19_1==24) ) {
							alt19=1;
						}
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:26:13: typedecl ';'
							{
							dbg.location(26,13);
							pushFollow(FOLLOW_typedecl_in_declaration309);
							typedecl();
							state._fsp--;
							if (state.failed) return;dbg.location(26,22);
							match(input,25,FOLLOW_25_in_declaration311); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(19);}
					dbg.location(26,28);
					pushFollow(FOLLOW_query_in_declaration315);
					query();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					dbg.enterAlt(15);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:27:4: 'not' ( typedecl ';' )? gterm
					{
					dbg.location(27,4);
					match(input,55,FOLLOW_55_in_declaration320); if (state.failed) return;dbg.location(27,10);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:27:10: ( typedecl ';' )?
					int alt20=2;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					int LA20_0 = input.LA(1);
					if ( (LA20_0==ID) ) {
						int LA20_1 = input.LA(2);
						if ( (LA20_1==24) ) {
							alt20=1;
						}
					}
					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:27:11: typedecl ';'
							{
							dbg.location(27,11);
							pushFollow(FOLLOW_typedecl_in_declaration323);
							typedecl();
							state._fsp--;
							if (state.failed) return;dbg.location(27,20);
							match(input,25,FOLLOW_25_in_declaration325); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(27,26);
					pushFollow(FOLLOW_gterm_in_declaration329);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 16 :
					dbg.enterAlt(16);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:28:4: 'nounif' ( typedecl ';' )? nounifdecl
					{
					dbg.location(28,4);
					match(input,56,FOLLOW_56_in_declaration334); if (state.failed) return;dbg.location(28,13);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:28:13: ( typedecl ';' )?
					int alt21=2;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					int LA21_0 = input.LA(1);
					if ( (LA21_0==ID) ) {
						int LA21_1 = input.LA(2);
						if ( (LA21_1==24) ) {
							alt21=1;
						}
					}
					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:28:14: typedecl ';'
							{
							dbg.location(28,14);
							pushFollow(FOLLOW_typedecl_in_declaration337);
							typedecl();
							state._fsp--;
							if (state.failed) return;dbg.location(28,23);
							match(input,25,FOLLOW_25_in_declaration339); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(28,29);
					pushFollow(FOLLOW_nounifdecl_in_declaration343);
					nounifdecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declaration"



	// $ANTLR start "reduc"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:31:1: reduc : ( 'forall' typedecl ';' )? term '=' term ( ';' reduc )? ;
	public final void reduc() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "reduc");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:32:2: ( ( 'forall' typedecl ';' )? term '=' term ( ';' reduc )? )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:32:4: ( 'forall' typedecl ';' )? term '=' term ( ';' reduc )?
			{
			dbg.location(32,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:32:4: ( 'forall' typedecl ';' )?
			int alt23=2;
			try { dbg.enterSubRule(23);
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			int LA23_0 = input.LA(1);
			if ( (LA23_0==44) ) {
				alt23=1;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:32:5: 'forall' typedecl ';'
					{
					dbg.location(32,5);
					match(input,44,FOLLOW_44_in_reduc355); if (state.failed) return;dbg.location(32,14);
					pushFollow(FOLLOW_typedecl_in_reduc357);
					typedecl();
					state._fsp--;
					if (state.failed) return;dbg.location(32,23);
					match(input,25,FOLLOW_25_in_reduc359); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(32,29);
			pushFollow(FOLLOW_term_in_reduc363);
			term();
			state._fsp--;
			if (state.failed) return;dbg.location(32,34);
			match(input,32,FOLLOW_32_in_reduc365); if (state.failed) return;dbg.location(32,38);
			pushFollow(FOLLOW_term_in_reduc367);
			term();
			state._fsp--;
			if (state.failed) return;dbg.location(32,43);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:32:43: ( ';' reduc )?
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==25) ) {
				alt24=1;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:32:44: ';' reduc
					{
					dbg.location(32,44);
					match(input,25,FOLLOW_25_in_reduc370); if (state.failed) return;dbg.location(32,48);
					pushFollow(FOLLOW_reduc_in_reduc372);
					reduc();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(24);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(33, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "reduc");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "reduc"



	// $ANTLR start "reducprime"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:35:1: reducprime : ( 'forall' failtypedecl ';' )? ident '(' ( ( mayfailterm ',' )* mayfailterm )? ')' ( 'otherwise' reducprime )? ;
	public final void reducprime() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "reducprime");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:2: ( ( 'forall' failtypedecl ';' )? ident '(' ( ( mayfailterm ',' )* mayfailterm )? ')' ( 'otherwise' reducprime )? )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:4: ( 'forall' failtypedecl ';' )? ident '(' ( ( mayfailterm ',' )* mayfailterm )? ')' ( 'otherwise' reducprime )?
			{
			dbg.location(36,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:4: ( 'forall' failtypedecl ';' )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==44) ) {
				alt25=1;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:5: 'forall' failtypedecl ';'
					{
					dbg.location(36,5);
					match(input,44,FOLLOW_44_in_reducprime387); if (state.failed) return;dbg.location(36,14);
					pushFollow(FOLLOW_failtypedecl_in_reducprime389);
					failtypedecl();
					state._fsp--;
					if (state.failed) return;dbg.location(36,27);
					match(input,25,FOLLOW_25_in_reducprime391); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(36,33);
			pushFollow(FOLLOW_ident_in_reducprime395);
			ident();
			state._fsp--;
			if (state.failed) return;dbg.location(36,39);
			match(input,18,FOLLOW_18_in_reducprime397); if (state.failed) return;dbg.location(36,43);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:43: ( ( mayfailterm ',' )* mayfailterm )?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==ID||LA27_0==18||LA27_0==43||LA27_0==55) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:44: ( mayfailterm ',' )* mayfailterm
					{
					dbg.location(36,44);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:44: ( mayfailterm ',' )*
					try { dbg.enterSubRule(26);

					loop26:
					while (true) {
						int alt26=2;
						try { dbg.enterDecision(26, decisionCanBacktrack[26]);

						switch ( input.LA(1) ) {
						case 18:
							{
							int LA26_1 = input.LA(2);
							if ( (synpred40_proverif()) ) {
								alt26=1;
							}

							}
							break;
						case ID:
							{
							int LA26_2 = input.LA(2);
							if ( (synpred40_proverif()) ) {
								alt26=1;
							}

							}
							break;
						case 55:
							{
							int LA26_3 = input.LA(2);
							if ( (synpred40_proverif()) ) {
								alt26=1;
							}

							}
							break;
						case 43:
							{
							int LA26_4 = input.LA(2);
							if ( (synpred40_proverif()) ) {
								alt26=1;
							}

							}
							break;
						}
						} finally {dbg.exitDecision(26);}

						switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:45: mayfailterm ','
							{
							dbg.location(36,45);
							pushFollow(FOLLOW_mayfailterm_in_reducprime401);
							mayfailterm();
							state._fsp--;
							if (state.failed) return;dbg.location(36,57);
							match(input,20,FOLLOW_20_in_reducprime403); if (state.failed) return;
							}
							break;

						default :
							break loop26;
						}
					}
					} finally {dbg.exitSubRule(26);}
					dbg.location(36,63);
					pushFollow(FOLLOW_mayfailterm_in_reducprime407);
					mayfailterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(36,77);
			match(input,19,FOLLOW_19_in_reducprime411); if (state.failed) return;dbg.location(36,81);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:81: ( 'otherwise' reducprime )?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==58) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:82: 'otherwise' reducprime
					{
					dbg.location(36,82);
					match(input,58,FOLLOW_58_in_reducprime414); if (state.failed) return;dbg.location(36,94);
					pushFollow(FOLLOW_reducprime_in_reducprime416);
					reducprime();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(28);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "reducprime");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "reducprime"



	// $ANTLR start "eqlist"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:39:1: eqlist : ( 'forall' typedecl ';' ) term '=' term ( ';' eqlist )? ;
	public final void eqlist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "eqlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:40:2: ( ( 'forall' typedecl ';' ) term '=' term ( ';' eqlist )? )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:40:4: ( 'forall' typedecl ';' ) term '=' term ( ';' eqlist )?
			{
			dbg.location(40,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:40:4: ( 'forall' typedecl ';' )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:40:5: 'forall' typedecl ';'
			{
			dbg.location(40,5);
			match(input,44,FOLLOW_44_in_eqlist430); if (state.failed) return;dbg.location(40,14);
			pushFollow(FOLLOW_typedecl_in_eqlist432);
			typedecl();
			state._fsp--;
			if (state.failed) return;dbg.location(40,23);
			match(input,25,FOLLOW_25_in_eqlist434); if (state.failed) return;
			}
			dbg.location(40,28);
			pushFollow(FOLLOW_term_in_eqlist437);
			term();
			state._fsp--;
			if (state.failed) return;dbg.location(40,33);
			match(input,32,FOLLOW_32_in_eqlist439); if (state.failed) return;dbg.location(40,37);
			pushFollow(FOLLOW_term_in_eqlist441);
			term();
			state._fsp--;
			if (state.failed) return;dbg.location(40,42);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:40:42: ( ';' eqlist )?
			int alt29=2;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==25) ) {
				alt29=1;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:40:43: ';' eqlist
					{
					dbg.location(40,43);
					match(input,25,FOLLOW_25_in_eqlist444); if (state.failed) return;dbg.location(40,47);
					pushFollow(FOLLOW_eqlist_in_eqlist446);
					eqlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(29);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eqlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "eqlist"



	// $ANTLR start "name"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:43:1: name : ID ;
	public final void name() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:44:2: ( ID )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:44:4: ID
			{
			dbg.location(44,4);
			match(input,ID,FOLLOW_ID_in_name459); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(45, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "name"



	// $ANTLR start "value"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:47:1: value : ID ;
	public final void value() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "value");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:48:2: ( ID )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:48:4: ID
			{
			dbg.location(48,4);
			match(input,ID,FOLLOW_ID_in_value470); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "value");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "value"



	// $ANTLR start "query"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:51:1: query : ( gterm ( ';' query )? | 'putbegin' 'event' ':' ( ident ',' )* ident ( ';' query )? | 'putbegin' 'inj-event' ':' ( ident ',' )* ident ( ';' query )? );
	public final void query() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "query");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:52:2: ( gterm ( ';' query )? | 'putbegin' 'event' ':' ( ident ',' )* ident ( ';' query )? | 'putbegin' 'inj-event' ':' ( ident ',' )* ident ( ';' query )? )
			int alt35=3;
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==ID||LA35_0==18||LA35_0==42||LA35_0==51||(LA35_0 >= 53 && LA35_0 <= 54)) ) {
				alt35=1;
			}
			else if ( (LA35_0==63) ) {
				int LA35_2 = input.LA(2);
				if ( (LA35_2==42) ) {
					alt35=2;
				}
				else if ( (LA35_2==51) ) {
					alt35=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:52:4: gterm ( ';' query )?
					{
					dbg.location(52,4);
					pushFollow(FOLLOW_gterm_in_query482);
					gterm();
					state._fsp--;
					if (state.failed) return;dbg.location(52,10);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:52:10: ( ';' query )?
					int alt30=2;
					try { dbg.enterSubRule(30);
					try { dbg.enterDecision(30, decisionCanBacktrack[30]);

					int LA30_0 = input.LA(1);
					if ( (LA30_0==25) ) {
						alt30=1;
					}
					} finally {dbg.exitDecision(30);}

					switch (alt30) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:52:11: ';' query
							{
							dbg.location(52,11);
							match(input,25,FOLLOW_25_in_query485); if (state.failed) return;dbg.location(52,15);
							pushFollow(FOLLOW_query_in_query487);
							query();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(30);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:53:4: 'putbegin' 'event' ':' ( ident ',' )* ident ( ';' query )?
					{
					dbg.location(53,4);
					match(input,63,FOLLOW_63_in_query494); if (state.failed) return;dbg.location(53,15);
					match(input,42,FOLLOW_42_in_query496); if (state.failed) return;dbg.location(53,23);
					match(input,24,FOLLOW_24_in_query498); if (state.failed) return;dbg.location(53,27);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:53:27: ( ident ',' )*
					try { dbg.enterSubRule(31);

					loop31:
					while (true) {
						int alt31=2;
						try { dbg.enterDecision(31, decisionCanBacktrack[31]);

						int LA31_0 = input.LA(1);
						if ( (LA31_0==ID) ) {
							int LA31_1 = input.LA(2);
							if ( (LA31_1==20) ) {
								alt31=1;
							}

						}

						} finally {dbg.exitDecision(31);}

						switch (alt31) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:53:28: ident ','
							{
							dbg.location(53,28);
							pushFollow(FOLLOW_ident_in_query501);
							ident();
							state._fsp--;
							if (state.failed) return;dbg.location(53,34);
							match(input,20,FOLLOW_20_in_query503); if (state.failed) return;
							}
							break;

						default :
							break loop31;
						}
					}
					} finally {dbg.exitSubRule(31);}
					dbg.location(53,40);
					pushFollow(FOLLOW_ident_in_query507);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(53,46);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:53:46: ( ';' query )?
					int alt32=2;
					try { dbg.enterSubRule(32);
					try { dbg.enterDecision(32, decisionCanBacktrack[32]);

					int LA32_0 = input.LA(1);
					if ( (LA32_0==25) ) {
						alt32=1;
					}
					} finally {dbg.exitDecision(32);}

					switch (alt32) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:53:47: ';' query
							{
							dbg.location(53,47);
							match(input,25,FOLLOW_25_in_query510); if (state.failed) return;dbg.location(53,51);
							pushFollow(FOLLOW_query_in_query512);
							query();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(32);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:54:4: 'putbegin' 'inj-event' ':' ( ident ',' )* ident ( ';' query )?
					{
					dbg.location(54,4);
					match(input,63,FOLLOW_63_in_query519); if (state.failed) return;dbg.location(54,15);
					match(input,51,FOLLOW_51_in_query521); if (state.failed) return;dbg.location(54,27);
					match(input,24,FOLLOW_24_in_query523); if (state.failed) return;dbg.location(54,31);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:54:31: ( ident ',' )*
					try { dbg.enterSubRule(33);

					loop33:
					while (true) {
						int alt33=2;
						try { dbg.enterDecision(33, decisionCanBacktrack[33]);

						int LA33_0 = input.LA(1);
						if ( (LA33_0==ID) ) {
							int LA33_1 = input.LA(2);
							if ( (LA33_1==20) ) {
								alt33=1;
							}

						}

						} finally {dbg.exitDecision(33);}

						switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:54:32: ident ','
							{
							dbg.location(54,32);
							pushFollow(FOLLOW_ident_in_query526);
							ident();
							state._fsp--;
							if (state.failed) return;dbg.location(54,38);
							match(input,20,FOLLOW_20_in_query528); if (state.failed) return;
							}
							break;

						default :
							break loop33;
						}
					}
					} finally {dbg.exitSubRule(33);}
					dbg.location(54,44);
					pushFollow(FOLLOW_ident_in_query532);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(54,50);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:54:50: ( ';' query )?
					int alt34=2;
					try { dbg.enterSubRule(34);
					try { dbg.enterDecision(34, decisionCanBacktrack[34]);

					int LA34_0 = input.LA(1);
					if ( (LA34_0==25) ) {
						alt34=1;
					}
					} finally {dbg.exitDecision(34);}

					switch (alt34) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:54:51: ';' query
							{
							dbg.location(54,51);
							match(input,25,FOLLOW_25_in_query535); if (state.failed) return;dbg.location(54,55);
							pushFollow(FOLLOW_query_in_query537);
							query();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(34);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(55, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "query");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "query"



	// $ANTLR start "gterm"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:57:1: gterm : ( ident | ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' integer )? | 'event' '(' ( ( gterm ',' )* gterm )? gterm ')' | 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')' | '(' ( ( gterm ',' )* gterm )? gterm ')' | 'new' ident ( '[' ( gbinding )? ']' )? | 'let' ident '=' gterm 'in' gterm ) ( '=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm )* ;
	public final void gterm() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "gterm");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:2: ( ( ident | ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' integer )? | 'event' '(' ( ( gterm ',' )* gterm )? gterm ')' | 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')' | '(' ( ( gterm ',' )* gterm )? gterm ')' | 'new' ident ( '[' ( gbinding )? ']' )? | 'let' ident '=' gterm 'in' gterm ) ( '=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm )* )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:4: ( ident | ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' integer )? | 'event' '(' ( ( gterm ',' )* gterm )? gterm ')' | 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')' | '(' ( ( gterm ',' )* gterm )? gterm ')' | 'new' ident ( '[' ( gbinding )? ']' )? | 'let' ident '=' gterm 'in' gterm ) ( '=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm )*
			{
			dbg.location(58,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:4: ( ident | ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' integer )? | 'event' '(' ( ( gterm ',' )* gterm )? gterm ')' | 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')' | '(' ( ( gterm ',' )* gterm )? gterm ')' | 'new' ident ( '[' ( gbinding )? ']' )? | 'let' ident '=' gterm 'in' gterm )
			int alt47=7;
			try { dbg.enterSubRule(47);
			try { dbg.enterDecision(47, decisionCanBacktrack[47]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA47_1 = input.LA(2);
				if ( (synpred51_proverif()) ) {
					alt47=1;
				}
				else if ( (synpred55_proverif()) ) {
					alt47=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 42:
				{
				alt47=3;
				}
				break;
			case 51:
				{
				alt47=4;
				}
				break;
			case 18:
				{
				alt47=5;
				}
				break;
			case 54:
				{
				alt47=6;
				}
				break;
			case 53:
				{
				alt47=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(47);}

			switch (alt47) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:5: ident
					{
					dbg.location(58,5);
					pushFollow(FOLLOW_ident_in_gterm552);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:13: ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' integer )?
					{
					dbg.location(58,13);
					pushFollow(FOLLOW_ident_in_gterm556);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(58,19);
					match(input,18,FOLLOW_18_in_gterm558); if (state.failed) return;dbg.location(58,23);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:23: ( ( gterm ',' )* gterm )?
					int alt37=2;
					try { dbg.enterSubRule(37);
					try { dbg.enterDecision(37, decisionCanBacktrack[37]);

					int LA37_0 = input.LA(1);
					if ( (LA37_0==ID||LA37_0==18||LA37_0==42||LA37_0==51||(LA37_0 >= 53 && LA37_0 <= 54)) ) {
						alt37=1;
					}
					} finally {dbg.exitDecision(37);}

					switch (alt37) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:24: ( gterm ',' )* gterm
							{
							dbg.location(58,24);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:24: ( gterm ',' )*
							try { dbg.enterSubRule(36);

							loop36:
							while (true) {
								int alt36=2;
								try { dbg.enterDecision(36, decisionCanBacktrack[36]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA36_1 = input.LA(2);
									if ( (synpred52_proverif()) ) {
										alt36=1;
									}

									}
									break;
								case 42:
									{
									int LA36_2 = input.LA(2);
									if ( (synpred52_proverif()) ) {
										alt36=1;
									}

									}
									break;
								case 51:
									{
									int LA36_3 = input.LA(2);
									if ( (synpred52_proverif()) ) {
										alt36=1;
									}

									}
									break;
								case 18:
									{
									int LA36_4 = input.LA(2);
									if ( (synpred52_proverif()) ) {
										alt36=1;
									}

									}
									break;
								case 54:
									{
									int LA36_5 = input.LA(2);
									if ( (synpred52_proverif()) ) {
										alt36=1;
									}

									}
									break;
								case 53:
									{
									int LA36_6 = input.LA(2);
									if ( (synpred52_proverif()) ) {
										alt36=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(36);}

								switch (alt36) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:25: gterm ','
									{
									dbg.location(58,25);
									pushFollow(FOLLOW_gterm_in_gterm562);
									gterm();
									state._fsp--;
									if (state.failed) return;dbg.location(58,31);
									match(input,20,FOLLOW_20_in_gterm564); if (state.failed) return;
									}
									break;

								default :
									break loop36;
								}
							}
							} finally {dbg.exitSubRule(36);}
							dbg.location(58,37);
							pushFollow(FOLLOW_gterm_in_gterm568);
							gterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(37);}
					dbg.location(58,45);
					match(input,19,FOLLOW_19_in_gterm572); if (state.failed) return;dbg.location(58,49);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:49: ( 'phase' integer )?
					int alt38=2;
					try { dbg.enterSubRule(38);
					try { dbg.enterDecision(38, decisionCanBacktrack[38]);

					int LA38_0 = input.LA(1);
					if ( (LA38_0==60) ) {
						alt38=1;
					}
					} finally {dbg.exitDecision(38);}

					switch (alt38) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:50: 'phase' integer
							{
							dbg.location(58,50);
							match(input,60,FOLLOW_60_in_gterm575); if (state.failed) return;dbg.location(58,58);
							pushFollow(FOLLOW_integer_in_gterm577);
							integer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(38);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:70: 'event' '(' ( ( gterm ',' )* gterm )? gterm ')'
					{
					dbg.location(58,70);
					match(input,42,FOLLOW_42_in_gterm583); if (state.failed) return;dbg.location(58,78);
					match(input,18,FOLLOW_18_in_gterm585); if (state.failed) return;dbg.location(58,82);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:82: ( ( gterm ',' )* gterm )?
					int alt40=2;
					try { dbg.enterSubRule(40);
					try { dbg.enterDecision(40, decisionCanBacktrack[40]);

					switch ( input.LA(1) ) {
						case ID:
							{
							int LA40_1 = input.LA(2);
							if ( (synpred57_proverif()) ) {
								alt40=1;
							}
							}
							break;
						case 42:
							{
							int LA40_2 = input.LA(2);
							if ( (synpred57_proverif()) ) {
								alt40=1;
							}
							}
							break;
						case 51:
							{
							int LA40_3 = input.LA(2);
							if ( (synpred57_proverif()) ) {
								alt40=1;
							}
							}
							break;
						case 18:
							{
							int LA40_4 = input.LA(2);
							if ( (synpred57_proverif()) ) {
								alt40=1;
							}
							}
							break;
						case 54:
							{
							int LA40_5 = input.LA(2);
							if ( (synpred57_proverif()) ) {
								alt40=1;
							}
							}
							break;
						case 53:
							{
							int LA40_6 = input.LA(2);
							if ( (synpred57_proverif()) ) {
								alt40=1;
							}
							}
							break;
					}
					} finally {dbg.exitDecision(40);}

					switch (alt40) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:83: ( gterm ',' )* gterm
							{
							dbg.location(58,83);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:83: ( gterm ',' )*
							try { dbg.enterSubRule(39);

							loop39:
							while (true) {
								int alt39=2;
								try { dbg.enterDecision(39, decisionCanBacktrack[39]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA39_1 = input.LA(2);
									if ( (synpred56_proverif()) ) {
										alt39=1;
									}

									}
									break;
								case 42:
									{
									int LA39_2 = input.LA(2);
									if ( (synpred56_proverif()) ) {
										alt39=1;
									}

									}
									break;
								case 51:
									{
									int LA39_3 = input.LA(2);
									if ( (synpred56_proverif()) ) {
										alt39=1;
									}

									}
									break;
								case 18:
									{
									int LA39_4 = input.LA(2);
									if ( (synpred56_proverif()) ) {
										alt39=1;
									}

									}
									break;
								case 54:
									{
									int LA39_5 = input.LA(2);
									if ( (synpred56_proverif()) ) {
										alt39=1;
									}

									}
									break;
								case 53:
									{
									int LA39_6 = input.LA(2);
									if ( (synpred56_proverif()) ) {
										alt39=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(39);}

								switch (alt39) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:84: gterm ','
									{
									dbg.location(58,84);
									pushFollow(FOLLOW_gterm_in_gterm589);
									gterm();
									state._fsp--;
									if (state.failed) return;dbg.location(58,90);
									match(input,20,FOLLOW_20_in_gterm591); if (state.failed) return;
									}
									break;

								default :
									break loop39;
								}
							}
							} finally {dbg.exitSubRule(39);}
							dbg.location(58,96);
							pushFollow(FOLLOW_gterm_in_gterm595);
							gterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(40);}
					dbg.location(58,104);
					pushFollow(FOLLOW_gterm_in_gterm599);
					gterm();
					state._fsp--;
					if (state.failed) return;dbg.location(58,110);
					match(input,19,FOLLOW_19_in_gterm601); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:116: 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')'
					{
					dbg.location(58,116);
					match(input,51,FOLLOW_51_in_gterm605); if (state.failed) return;dbg.location(58,128);
					match(input,18,FOLLOW_18_in_gterm607); if (state.failed) return;dbg.location(58,132);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:132: ( ( gterm ',' )* gterm )?
					int alt42=2;
					try { dbg.enterSubRule(42);
					try { dbg.enterDecision(42, decisionCanBacktrack[42]);

					switch ( input.LA(1) ) {
						case ID:
							{
							int LA42_1 = input.LA(2);
							if ( (synpred60_proverif()) ) {
								alt42=1;
							}
							}
							break;
						case 42:
							{
							int LA42_2 = input.LA(2);
							if ( (synpred60_proverif()) ) {
								alt42=1;
							}
							}
							break;
						case 51:
							{
							int LA42_3 = input.LA(2);
							if ( (synpred60_proverif()) ) {
								alt42=1;
							}
							}
							break;
						case 18:
							{
							int LA42_4 = input.LA(2);
							if ( (synpred60_proverif()) ) {
								alt42=1;
							}
							}
							break;
						case 54:
							{
							int LA42_5 = input.LA(2);
							if ( (synpred60_proverif()) ) {
								alt42=1;
							}
							}
							break;
						case 53:
							{
							int LA42_6 = input.LA(2);
							if ( (synpred60_proverif()) ) {
								alt42=1;
							}
							}
							break;
					}
					} finally {dbg.exitDecision(42);}

					switch (alt42) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:133: ( gterm ',' )* gterm
							{
							dbg.location(58,133);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:133: ( gterm ',' )*
							try { dbg.enterSubRule(41);

							loop41:
							while (true) {
								int alt41=2;
								try { dbg.enterDecision(41, decisionCanBacktrack[41]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA41_1 = input.LA(2);
									if ( (synpred59_proverif()) ) {
										alt41=1;
									}

									}
									break;
								case 42:
									{
									int LA41_2 = input.LA(2);
									if ( (synpred59_proverif()) ) {
										alt41=1;
									}

									}
									break;
								case 51:
									{
									int LA41_3 = input.LA(2);
									if ( (synpred59_proverif()) ) {
										alt41=1;
									}

									}
									break;
								case 18:
									{
									int LA41_4 = input.LA(2);
									if ( (synpred59_proverif()) ) {
										alt41=1;
									}

									}
									break;
								case 54:
									{
									int LA41_5 = input.LA(2);
									if ( (synpred59_proverif()) ) {
										alt41=1;
									}

									}
									break;
								case 53:
									{
									int LA41_6 = input.LA(2);
									if ( (synpred59_proverif()) ) {
										alt41=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(41);}

								switch (alt41) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:134: gterm ','
									{
									dbg.location(58,134);
									pushFollow(FOLLOW_gterm_in_gterm611);
									gterm();
									state._fsp--;
									if (state.failed) return;dbg.location(58,140);
									match(input,20,FOLLOW_20_in_gterm613); if (state.failed) return;
									}
									break;

								default :
									break loop41;
								}
							}
							} finally {dbg.exitSubRule(41);}
							dbg.location(58,146);
							pushFollow(FOLLOW_gterm_in_gterm617);
							gterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(42);}
					dbg.location(58,154);
					pushFollow(FOLLOW_gterm_in_gterm621);
					gterm();
					state._fsp--;
					if (state.failed) return;dbg.location(58,160);
					match(input,19,FOLLOW_19_in_gterm623); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:166: '(' ( ( gterm ',' )* gterm )? gterm ')'
					{
					dbg.location(58,166);
					match(input,18,FOLLOW_18_in_gterm627); if (state.failed) return;dbg.location(58,170);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:170: ( ( gterm ',' )* gterm )?
					int alt44=2;
					try { dbg.enterSubRule(44);
					try { dbg.enterDecision(44, decisionCanBacktrack[44]);

					switch ( input.LA(1) ) {
						case ID:
							{
							int LA44_1 = input.LA(2);
							if ( (synpred63_proverif()) ) {
								alt44=1;
							}
							}
							break;
						case 42:
							{
							int LA44_2 = input.LA(2);
							if ( (synpred63_proverif()) ) {
								alt44=1;
							}
							}
							break;
						case 51:
							{
							int LA44_3 = input.LA(2);
							if ( (synpred63_proverif()) ) {
								alt44=1;
							}
							}
							break;
						case 18:
							{
							int LA44_4 = input.LA(2);
							if ( (synpred63_proverif()) ) {
								alt44=1;
							}
							}
							break;
						case 54:
							{
							int LA44_5 = input.LA(2);
							if ( (synpred63_proverif()) ) {
								alt44=1;
							}
							}
							break;
						case 53:
							{
							int LA44_6 = input.LA(2);
							if ( (synpred63_proverif()) ) {
								alt44=1;
							}
							}
							break;
					}
					} finally {dbg.exitDecision(44);}

					switch (alt44) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:171: ( gterm ',' )* gterm
							{
							dbg.location(58,171);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:171: ( gterm ',' )*
							try { dbg.enterSubRule(43);

							loop43:
							while (true) {
								int alt43=2;
								try { dbg.enterDecision(43, decisionCanBacktrack[43]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA43_1 = input.LA(2);
									if ( (synpred62_proverif()) ) {
										alt43=1;
									}

									}
									break;
								case 42:
									{
									int LA43_2 = input.LA(2);
									if ( (synpred62_proverif()) ) {
										alt43=1;
									}

									}
									break;
								case 51:
									{
									int LA43_3 = input.LA(2);
									if ( (synpred62_proverif()) ) {
										alt43=1;
									}

									}
									break;
								case 18:
									{
									int LA43_4 = input.LA(2);
									if ( (synpred62_proverif()) ) {
										alt43=1;
									}

									}
									break;
								case 54:
									{
									int LA43_5 = input.LA(2);
									if ( (synpred62_proverif()) ) {
										alt43=1;
									}

									}
									break;
								case 53:
									{
									int LA43_6 = input.LA(2);
									if ( (synpred62_proverif()) ) {
										alt43=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(43);}

								switch (alt43) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:172: gterm ','
									{
									dbg.location(58,172);
									pushFollow(FOLLOW_gterm_in_gterm631);
									gterm();
									state._fsp--;
									if (state.failed) return;dbg.location(58,178);
									match(input,20,FOLLOW_20_in_gterm633); if (state.failed) return;
									}
									break;

								default :
									break loop43;
								}
							}
							} finally {dbg.exitSubRule(43);}
							dbg.location(58,184);
							pushFollow(FOLLOW_gterm_in_gterm637);
							gterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(44);}
					dbg.location(58,192);
					pushFollow(FOLLOW_gterm_in_gterm641);
					gterm();
					state._fsp--;
					if (state.failed) return;dbg.location(58,198);
					match(input,19,FOLLOW_19_in_gterm643); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:204: 'new' ident ( '[' ( gbinding )? ']' )?
					{
					dbg.location(58,204);
					match(input,54,FOLLOW_54_in_gterm647); if (state.failed) return;dbg.location(58,210);
					pushFollow(FOLLOW_ident_in_gterm649);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(58,216);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:216: ( '[' ( gbinding )? ']' )?
					int alt46=2;
					try { dbg.enterSubRule(46);
					try { dbg.enterDecision(46, decisionCanBacktrack[46]);

					int LA46_0 = input.LA(1);
					if ( (LA46_0==34) ) {
						alt46=1;
					}
					} finally {dbg.exitDecision(46);}

					switch (alt46) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:217: '[' ( gbinding )? ']'
							{
							dbg.location(58,217);
							match(input,34,FOLLOW_34_in_gterm652); if (state.failed) return;dbg.location(58,221);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:221: ( gbinding )?
							int alt45=2;
							try { dbg.enterSubRule(45);
							try { dbg.enterDecision(45, decisionCanBacktrack[45]);

							int LA45_0 = input.LA(1);
							if ( (LA45_0==ID||LA45_0==16) ) {
								alt45=1;
							}
							} finally {dbg.exitDecision(45);}

							switch (alt45) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:222: gbinding
									{
									dbg.location(58,222);
									pushFollow(FOLLOW_gbinding_in_gterm655);
									gbinding();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(45);}
							dbg.location(58,233);
							match(input,35,FOLLOW_35_in_gterm659); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(46);}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:242: 'let' ident '=' gterm 'in' gterm
					{
					dbg.location(58,242);
					match(input,53,FOLLOW_53_in_gterm666); if (state.failed) return;dbg.location(58,248);
					pushFollow(FOLLOW_ident_in_gterm668);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(58,254);
					match(input,32,FOLLOW_32_in_gterm670); if (state.failed) return;dbg.location(58,258);
					pushFollow(FOLLOW_gterm_in_gterm672);
					gterm();
					state._fsp--;
					if (state.failed) return;dbg.location(58,264);
					match(input,50,FOLLOW_50_in_gterm674); if (state.failed) return;dbg.location(58,269);
					pushFollow(FOLLOW_gterm_in_gterm676);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(47);}
			dbg.location(58,276);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:276: ( '=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm )*
			try { dbg.enterSubRule(48);

			loop48:
			while (true) {
				int alt48=6;
				try { dbg.enterDecision(48, decisionCanBacktrack[48]);

				switch ( input.LA(1) ) {
				case 32:
					{
					int LA48_2 = input.LA(2);
					if ( (synpred68_proverif()) ) {
						alt48=1;
					}

					}
					break;
				case 31:
					{
					int LA48_3 = input.LA(2);
					if ( (synpred69_proverif()) ) {
						alt48=2;
					}

					}
					break;
				case 73:
					{
					int LA48_4 = input.LA(2);
					if ( (synpred70_proverif()) ) {
						alt48=3;
					}

					}
					break;
				case 17:
					{
					int LA48_5 = input.LA(2);
					if ( (synpred71_proverif()) ) {
						alt48=4;
					}

					}
					break;
				case 33:
					{
					int LA48_6 = input.LA(2);
					if ( (synpred72_proverif()) ) {
						alt48=5;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(48);}

				switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:277: '=' gterm
					{
					dbg.location(58,277);
					match(input,32,FOLLOW_32_in_gterm680); if (state.failed) return;dbg.location(58,281);
					pushFollow(FOLLOW_gterm_in_gterm682);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:289: '<>' gterm
					{
					dbg.location(58,289);
					match(input,31,FOLLOW_31_in_gterm686); if (state.failed) return;dbg.location(58,294);
					pushFollow(FOLLOW_gterm_in_gterm688);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:302: '||' gterm
					{
					dbg.location(58,302);
					match(input,73,FOLLOW_73_in_gterm692); if (state.failed) return;dbg.location(58,307);
					pushFollow(FOLLOW_gterm_in_gterm694);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:315: '&&' gterm
					{
					dbg.location(58,315);
					match(input,17,FOLLOW_17_in_gterm698); if (state.failed) return;dbg.location(58,320);
					pushFollow(FOLLOW_gterm_in_gterm700);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:328: '==>' gterm
					{
					dbg.location(58,328);
					match(input,33,FOLLOW_33_in_gterm704); if (state.failed) return;dbg.location(58,334);
					pushFollow(FOLLOW_gterm_in_gterm706);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop48;
				}
			}
			} finally {dbg.exitSubRule(48);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "gterm");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "gterm"



	// $ANTLR start "gbinding"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:61:1: gbinding : ( '!' integer '=' gterm ( ';' gbinding )? | ident '=' gterm ( ';' gbinding )? );
	public final void gbinding() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "gbinding");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:62:3: ( '!' integer '=' gterm ( ';' gbinding )? | ident '=' gterm ( ';' gbinding )? )
			int alt51=2;
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

			int LA51_0 = input.LA(1);
			if ( (LA51_0==16) ) {
				alt51=1;
			}
			else if ( (LA51_0==ID) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(51);}

			switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:62:5: '!' integer '=' gterm ( ';' gbinding )?
					{
					dbg.location(62,5);
					match(input,16,FOLLOW_16_in_gbinding720); if (state.failed) return;dbg.location(62,9);
					pushFollow(FOLLOW_integer_in_gbinding722);
					integer();
					state._fsp--;
					if (state.failed) return;dbg.location(62,17);
					match(input,32,FOLLOW_32_in_gbinding724); if (state.failed) return;dbg.location(62,21);
					pushFollow(FOLLOW_gterm_in_gbinding726);
					gterm();
					state._fsp--;
					if (state.failed) return;dbg.location(62,27);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:62:27: ( ';' gbinding )?
					int alt49=2;
					try { dbg.enterSubRule(49);
					try { dbg.enterDecision(49, decisionCanBacktrack[49]);

					int LA49_0 = input.LA(1);
					if ( (LA49_0==25) ) {
						alt49=1;
					}
					} finally {dbg.exitDecision(49);}

					switch (alt49) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:62:28: ';' gbinding
							{
							dbg.location(62,28);
							match(input,25,FOLLOW_25_in_gbinding729); if (state.failed) return;dbg.location(62,32);
							pushFollow(FOLLOW_gbinding_in_gbinding731);
							gbinding();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(49);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:63:5: ident '=' gterm ( ';' gbinding )?
					{
					dbg.location(63,5);
					pushFollow(FOLLOW_ident_in_gbinding739);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(63,11);
					match(input,32,FOLLOW_32_in_gbinding741); if (state.failed) return;dbg.location(63,15);
					pushFollow(FOLLOW_gterm_in_gbinding743);
					gterm();
					state._fsp--;
					if (state.failed) return;dbg.location(63,21);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:63:21: ( ';' gbinding )?
					int alt50=2;
					try { dbg.enterSubRule(50);
					try { dbg.enterDecision(50, decisionCanBacktrack[50]);

					int LA50_0 = input.LA(1);
					if ( (LA50_0==25) ) {
						alt50=1;
					}
					} finally {dbg.exitDecision(50);}

					switch (alt50) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:63:22: ';' gbinding
							{
							dbg.location(63,22);
							match(input,25,FOLLOW_25_in_gbinding746); if (state.failed) return;dbg.location(63,26);
							pushFollow(FOLLOW_gbinding_in_gbinding748);
							gbinding();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(50);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(64, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "gbinding");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "gbinding"



	// $ANTLR start "nounifdecl"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:66:1: nounifdecl : ( 'let' ident '=' gformat 'in' nounifdecl | ident ( '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' integer )? )? ( '/' integer )? );
	public final void nounifdecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "nounifdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:67:2: ( 'let' ident '=' gformat 'in' nounifdecl | ident ( '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' integer )? )? ( '/' integer )? )
			int alt57=2;
			try { dbg.enterDecision(57, decisionCanBacktrack[57]);

			int LA57_0 = input.LA(1);
			if ( (LA57_0==53) ) {
				alt57=1;
			}
			else if ( (LA57_0==ID) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(57);}

			switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:67:4: 'let' ident '=' gformat 'in' nounifdecl
					{
					dbg.location(67,4);
					match(input,53,FOLLOW_53_in_nounifdecl763); if (state.failed) return;dbg.location(67,10);
					pushFollow(FOLLOW_ident_in_nounifdecl765);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(67,16);
					match(input,32,FOLLOW_32_in_nounifdecl767); if (state.failed) return;dbg.location(67,20);
					pushFollow(FOLLOW_gformat_in_nounifdecl769);
					gformat();
					state._fsp--;
					if (state.failed) return;dbg.location(67,28);
					match(input,50,FOLLOW_50_in_nounifdecl771); if (state.failed) return;dbg.location(67,33);
					pushFollow(FOLLOW_nounifdecl_in_nounifdecl773);
					nounifdecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:4: ident ( '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' integer )? )? ( '/' integer )?
					{
					dbg.location(68,4);
					pushFollow(FOLLOW_ident_in_nounifdecl778);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(68,10);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:10: ( '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' integer )? )?
					int alt55=2;
					try { dbg.enterSubRule(55);
					try { dbg.enterDecision(55, decisionCanBacktrack[55]);

					int LA55_0 = input.LA(1);
					if ( (LA55_0==18) ) {
						alt55=1;
					}
					} finally {dbg.exitDecision(55);}

					switch (alt55) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:11: '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' integer )?
							{
							dbg.location(68,11);
							match(input,18,FOLLOW_18_in_nounifdecl781); if (state.failed) return;dbg.location(68,15);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:15: ( ( gformat ',' )* gformat )?
							int alt53=2;
							try { dbg.enterSubRule(53);
							try { dbg.enterDecision(53, decisionCanBacktrack[53]);

							int LA53_0 = input.LA(1);
							if ( (LA53_0==ID||LA53_0==18||(LA53_0 >= 53 && LA53_0 <= 55)) ) {
								alt53=1;
							}
							} finally {dbg.exitDecision(53);}

							switch (alt53) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:16: ( gformat ',' )* gformat
									{
									dbg.location(68,16);
									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:16: ( gformat ',' )*
									try { dbg.enterSubRule(52);

									loop52:
									while (true) {
										int alt52=2;
										try { dbg.enterDecision(52, decisionCanBacktrack[52]);

										switch ( input.LA(1) ) {
										case ID:
											{
											int LA52_1 = input.LA(2);
											if ( (synpred77_proverif()) ) {
												alt52=1;
											}

											}
											break;
										case 55:
											{
											int LA52_2 = input.LA(2);
											if ( (synpred77_proverif()) ) {
												alt52=1;
											}

											}
											break;
										case 18:
											{
											int LA52_3 = input.LA(2);
											if ( (synpred77_proverif()) ) {
												alt52=1;
											}

											}
											break;
										case 54:
											{
											int LA52_4 = input.LA(2);
											if ( (synpred77_proverif()) ) {
												alt52=1;
											}

											}
											break;
										case 53:
											{
											int LA52_5 = input.LA(2);
											if ( (synpred77_proverif()) ) {
												alt52=1;
											}

											}
											break;
										}
										} finally {dbg.exitDecision(52);}

										switch (alt52) {
										case 1 :
											dbg.enterAlt(1);

											// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:17: gformat ','
											{
											dbg.location(68,17);
											pushFollow(FOLLOW_gformat_in_nounifdecl785);
											gformat();
											state._fsp--;
											if (state.failed) return;dbg.location(68,25);
											match(input,20,FOLLOW_20_in_nounifdecl787); if (state.failed) return;
											}
											break;

										default :
											break loop52;
										}
									}
									} finally {dbg.exitSubRule(52);}
									dbg.location(68,31);
									pushFollow(FOLLOW_gformat_in_nounifdecl791);
									gformat();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(53);}
							dbg.location(68,41);
							match(input,19,FOLLOW_19_in_nounifdecl795); if (state.failed) return;dbg.location(68,45);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:45: ( 'phase' integer )?
							int alt54=2;
							try { dbg.enterSubRule(54);
							try { dbg.enterDecision(54, decisionCanBacktrack[54]);

							int LA54_0 = input.LA(1);
							if ( (LA54_0==60) ) {
								alt54=1;
							}
							} finally {dbg.exitDecision(54);}

							switch (alt54) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:46: 'phase' integer
									{
									dbg.location(68,46);
									match(input,60,FOLLOW_60_in_nounifdecl798); if (state.failed) return;dbg.location(68,54);
									pushFollow(FOLLOW_integer_in_nounifdecl800);
									integer();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(54);}

							}
							break;

					}
					} finally {dbg.exitSubRule(55);}
					dbg.location(68,67);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:67: ( '/' integer )?
					int alt56=2;
					try { dbg.enterSubRule(56);
					try { dbg.enterDecision(56, decisionCanBacktrack[56]);

					int LA56_0 = input.LA(1);
					if ( (LA56_0==22) ) {
						alt56=1;
					}
					} finally {dbg.exitDecision(56);}

					switch (alt56) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:68: '/' integer
							{
							dbg.location(68,68);
							match(input,22,FOLLOW_22_in_nounifdecl808); if (state.failed) return;dbg.location(68,71);
							pushFollow(FOLLOW_integer_in_nounifdecl809);
							integer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(56);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "nounifdecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "nounifdecl"



	// $ANTLR start "gformat"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:71:1: gformat : ( ident | ident '(' ( ( gformat ',' )* gformat )? ')' | 'not' '(' ( ( gformat ',' )* gformat )? ')' | '(' ( ( gformat ',' )* gformat )? gformat ')' | 'new' ident ( '[' ( fbinding )? ']' )? | 'let' ident '=' gformat 'in' gformat );
	public final void gformat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "gformat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:72:2: ( ident | ident '(' ( ( gformat ',' )* gformat )? ')' | 'not' '(' ( ( gformat ',' )* gformat )? ')' | '(' ( ( gformat ',' )* gformat )? gformat ')' | 'new' ident ( '[' ( fbinding )? ']' )? | 'let' ident '=' gformat 'in' gformat )
			int alt66=6;
			try { dbg.enterDecision(66, decisionCanBacktrack[66]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA66_1 = input.LA(2);
				if ( (synpred82_proverif()) ) {
					alt66=1;
				}
				else if ( (synpred85_proverif()) ) {
					alt66=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 55:
				{
				alt66=3;
				}
				break;
			case 18:
				{
				alt66=4;
				}
				break;
			case 54:
				{
				alt66=5;
				}
				break;
			case 53:
				{
				alt66=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(66);}

			switch (alt66) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:72:4: ident
					{
					dbg.location(72,4);
					pushFollow(FOLLOW_ident_in_gformat822);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:4: ident '(' ( ( gformat ',' )* gformat )? ')'
					{
					dbg.location(73,4);
					pushFollow(FOLLOW_ident_in_gformat827);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(73,10);
					match(input,18,FOLLOW_18_in_gformat829); if (state.failed) return;dbg.location(73,14);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:14: ( ( gformat ',' )* gformat )?
					int alt59=2;
					try { dbg.enterSubRule(59);
					try { dbg.enterDecision(59, decisionCanBacktrack[59]);

					int LA59_0 = input.LA(1);
					if ( (LA59_0==ID||LA59_0==18||(LA59_0 >= 53 && LA59_0 <= 55)) ) {
						alt59=1;
					}
					} finally {dbg.exitDecision(59);}

					switch (alt59) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:15: ( gformat ',' )* gformat
							{
							dbg.location(73,15);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:15: ( gformat ',' )*
							try { dbg.enterSubRule(58);

							loop58:
							while (true) {
								int alt58=2;
								try { dbg.enterDecision(58, decisionCanBacktrack[58]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA58_1 = input.LA(2);
									if ( (synpred83_proverif()) ) {
										alt58=1;
									}

									}
									break;
								case 55:
									{
									int LA58_2 = input.LA(2);
									if ( (synpred83_proverif()) ) {
										alt58=1;
									}

									}
									break;
								case 18:
									{
									int LA58_3 = input.LA(2);
									if ( (synpred83_proverif()) ) {
										alt58=1;
									}

									}
									break;
								case 54:
									{
									int LA58_4 = input.LA(2);
									if ( (synpred83_proverif()) ) {
										alt58=1;
									}

									}
									break;
								case 53:
									{
									int LA58_5 = input.LA(2);
									if ( (synpred83_proverif()) ) {
										alt58=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(58);}

								switch (alt58) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:16: gformat ','
									{
									dbg.location(73,16);
									pushFollow(FOLLOW_gformat_in_gformat833);
									gformat();
									state._fsp--;
									if (state.failed) return;dbg.location(73,24);
									match(input,20,FOLLOW_20_in_gformat835); if (state.failed) return;
									}
									break;

								default :
									break loop58;
								}
							}
							} finally {dbg.exitSubRule(58);}
							dbg.location(73,30);
							pushFollow(FOLLOW_gformat_in_gformat839);
							gformat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(59);}
					dbg.location(73,40);
					match(input,19,FOLLOW_19_in_gformat843); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:74:4: 'not' '(' ( ( gformat ',' )* gformat )? ')'
					{
					dbg.location(74,4);
					match(input,55,FOLLOW_55_in_gformat848); if (state.failed) return;dbg.location(74,10);
					match(input,18,FOLLOW_18_in_gformat850); if (state.failed) return;dbg.location(74,14);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:74:14: ( ( gformat ',' )* gformat )?
					int alt61=2;
					try { dbg.enterSubRule(61);
					try { dbg.enterDecision(61, decisionCanBacktrack[61]);

					int LA61_0 = input.LA(1);
					if ( (LA61_0==ID||LA61_0==18||(LA61_0 >= 53 && LA61_0 <= 55)) ) {
						alt61=1;
					}
					} finally {dbg.exitDecision(61);}

					switch (alt61) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:74:15: ( gformat ',' )* gformat
							{
							dbg.location(74,15);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:74:15: ( gformat ',' )*
							try { dbg.enterSubRule(60);

							loop60:
							while (true) {
								int alt60=2;
								try { dbg.enterDecision(60, decisionCanBacktrack[60]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA60_1 = input.LA(2);
									if ( (synpred86_proverif()) ) {
										alt60=1;
									}

									}
									break;
								case 55:
									{
									int LA60_2 = input.LA(2);
									if ( (synpred86_proverif()) ) {
										alt60=1;
									}

									}
									break;
								case 18:
									{
									int LA60_3 = input.LA(2);
									if ( (synpred86_proverif()) ) {
										alt60=1;
									}

									}
									break;
								case 54:
									{
									int LA60_4 = input.LA(2);
									if ( (synpred86_proverif()) ) {
										alt60=1;
									}

									}
									break;
								case 53:
									{
									int LA60_5 = input.LA(2);
									if ( (synpred86_proverif()) ) {
										alt60=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(60);}

								switch (alt60) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:74:16: gformat ','
									{
									dbg.location(74,16);
									pushFollow(FOLLOW_gformat_in_gformat854);
									gformat();
									state._fsp--;
									if (state.failed) return;dbg.location(74,24);
									match(input,20,FOLLOW_20_in_gformat856); if (state.failed) return;
									}
									break;

								default :
									break loop60;
								}
							}
							} finally {dbg.exitSubRule(60);}
							dbg.location(74,30);
							pushFollow(FOLLOW_gformat_in_gformat860);
							gformat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(61);}
					dbg.location(74,40);
					match(input,19,FOLLOW_19_in_gformat864); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:4: '(' ( ( gformat ',' )* gformat )? gformat ')'
					{
					dbg.location(75,4);
					match(input,18,FOLLOW_18_in_gformat869); if (state.failed) return;dbg.location(75,8);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:8: ( ( gformat ',' )* gformat )?
					int alt63=2;
					try { dbg.enterSubRule(63);
					try { dbg.enterDecision(63, decisionCanBacktrack[63]);

					switch ( input.LA(1) ) {
						case ID:
							{
							int LA63_1 = input.LA(2);
							if ( (synpred90_proverif()) ) {
								alt63=1;
							}
							}
							break;
						case 55:
							{
							int LA63_2 = input.LA(2);
							if ( (synpred90_proverif()) ) {
								alt63=1;
							}
							}
							break;
						case 18:
							{
							int LA63_3 = input.LA(2);
							if ( (synpred90_proverif()) ) {
								alt63=1;
							}
							}
							break;
						case 54:
							{
							int LA63_4 = input.LA(2);
							if ( (synpred90_proverif()) ) {
								alt63=1;
							}
							}
							break;
						case 53:
							{
							int LA63_5 = input.LA(2);
							if ( (synpred90_proverif()) ) {
								alt63=1;
							}
							}
							break;
					}
					} finally {dbg.exitDecision(63);}

					switch (alt63) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:9: ( gformat ',' )* gformat
							{
							dbg.location(75,9);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:9: ( gformat ',' )*
							try { dbg.enterSubRule(62);

							loop62:
							while (true) {
								int alt62=2;
								try { dbg.enterDecision(62, decisionCanBacktrack[62]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA62_1 = input.LA(2);
									if ( (synpred89_proverif()) ) {
										alt62=1;
									}

									}
									break;
								case 55:
									{
									int LA62_2 = input.LA(2);
									if ( (synpred89_proverif()) ) {
										alt62=1;
									}

									}
									break;
								case 18:
									{
									int LA62_3 = input.LA(2);
									if ( (synpred89_proverif()) ) {
										alt62=1;
									}

									}
									break;
								case 54:
									{
									int LA62_4 = input.LA(2);
									if ( (synpred89_proverif()) ) {
										alt62=1;
									}

									}
									break;
								case 53:
									{
									int LA62_5 = input.LA(2);
									if ( (synpred89_proverif()) ) {
										alt62=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(62);}

								switch (alt62) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:10: gformat ','
									{
									dbg.location(75,10);
									pushFollow(FOLLOW_gformat_in_gformat873);
									gformat();
									state._fsp--;
									if (state.failed) return;dbg.location(75,18);
									match(input,20,FOLLOW_20_in_gformat875); if (state.failed) return;
									}
									break;

								default :
									break loop62;
								}
							}
							} finally {dbg.exitSubRule(62);}
							dbg.location(75,24);
							pushFollow(FOLLOW_gformat_in_gformat879);
							gformat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(63);}
					dbg.location(75,34);
					pushFollow(FOLLOW_gformat_in_gformat883);
					gformat();
					state._fsp--;
					if (state.failed) return;dbg.location(75,42);
					match(input,19,FOLLOW_19_in_gformat885); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:76:4: 'new' ident ( '[' ( fbinding )? ']' )?
					{
					dbg.location(76,4);
					match(input,54,FOLLOW_54_in_gformat890); if (state.failed) return;dbg.location(76,10);
					pushFollow(FOLLOW_ident_in_gformat892);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(76,16);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:76:16: ( '[' ( fbinding )? ']' )?
					int alt65=2;
					try { dbg.enterSubRule(65);
					try { dbg.enterDecision(65, decisionCanBacktrack[65]);

					int LA65_0 = input.LA(1);
					if ( (LA65_0==34) ) {
						alt65=1;
					}
					} finally {dbg.exitDecision(65);}

					switch (alt65) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:76:18: '[' ( fbinding )? ']'
							{
							dbg.location(76,18);
							match(input,34,FOLLOW_34_in_gformat896); if (state.failed) return;dbg.location(76,22);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:76:22: ( fbinding )?
							int alt64=2;
							try { dbg.enterSubRule(64);
							try { dbg.enterDecision(64, decisionCanBacktrack[64]);

							int LA64_0 = input.LA(1);
							if ( (LA64_0==ID||LA64_0==16) ) {
								alt64=1;
							}
							} finally {dbg.exitDecision(64);}

							switch (alt64) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:76:24: fbinding
									{
									dbg.location(76,24);
									pushFollow(FOLLOW_fbinding_in_gformat900);
									fbinding();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(64);}
							dbg.location(76,36);
							match(input,35,FOLLOW_35_in_gformat905); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(65);}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:77:4: 'let' ident '=' gformat 'in' gformat
					{
					dbg.location(77,4);
					match(input,53,FOLLOW_53_in_gformat913); if (state.failed) return;dbg.location(77,10);
					pushFollow(FOLLOW_ident_in_gformat915);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(77,16);
					match(input,32,FOLLOW_32_in_gformat917); if (state.failed) return;dbg.location(77,20);
					pushFollow(FOLLOW_gformat_in_gformat919);
					gformat();
					state._fsp--;
					if (state.failed) return;dbg.location(77,28);
					match(input,50,FOLLOW_50_in_gformat921); if (state.failed) return;dbg.location(77,33);
					pushFollow(FOLLOW_gformat_in_gformat923);
					gformat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "gformat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "gformat"



	// $ANTLR start "fbinding"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:81:1: fbinding : ( '!' integer '=' gformat ( ';' fbinding )? | ident '=' gformat ( ';' fbinding )? );
	public final void fbinding() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fbinding");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:82:2: ( '!' integer '=' gformat ( ';' fbinding )? | ident '=' gformat ( ';' fbinding )? )
			int alt69=2;
			try { dbg.enterDecision(69, decisionCanBacktrack[69]);

			int LA69_0 = input.LA(1);
			if ( (LA69_0==16) ) {
				alt69=1;
			}
			else if ( (LA69_0==ID) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(69);}

			switch (alt69) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:82:4: '!' integer '=' gformat ( ';' fbinding )?
					{
					dbg.location(82,4);
					match(input,16,FOLLOW_16_in_fbinding937); if (state.failed) return;dbg.location(82,8);
					pushFollow(FOLLOW_integer_in_fbinding939);
					integer();
					state._fsp--;
					if (state.failed) return;dbg.location(82,16);
					match(input,32,FOLLOW_32_in_fbinding941); if (state.failed) return;dbg.location(82,20);
					pushFollow(FOLLOW_gformat_in_fbinding943);
					gformat();
					state._fsp--;
					if (state.failed) return;dbg.location(82,28);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:82:28: ( ';' fbinding )?
					int alt67=2;
					try { dbg.enterSubRule(67);
					try { dbg.enterDecision(67, decisionCanBacktrack[67]);

					int LA67_0 = input.LA(1);
					if ( (LA67_0==25) ) {
						alt67=1;
					}
					} finally {dbg.exitDecision(67);}

					switch (alt67) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:82:29: ';' fbinding
							{
							dbg.location(82,29);
							match(input,25,FOLLOW_25_in_fbinding946); if (state.failed) return;dbg.location(82,33);
							pushFollow(FOLLOW_fbinding_in_fbinding948);
							fbinding();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(67);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:83:5: ident '=' gformat ( ';' fbinding )?
					{
					dbg.location(83,5);
					pushFollow(FOLLOW_ident_in_fbinding956);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(83,11);
					match(input,32,FOLLOW_32_in_fbinding958); if (state.failed) return;dbg.location(83,15);
					pushFollow(FOLLOW_gformat_in_fbinding960);
					gformat();
					state._fsp--;
					if (state.failed) return;dbg.location(83,23);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:83:23: ( ';' fbinding )?
					int alt68=2;
					try { dbg.enterSubRule(68);
					try { dbg.enterDecision(68, decisionCanBacktrack[68]);

					int LA68_0 = input.LA(1);
					if ( (LA68_0==25) ) {
						alt68=1;
					}
					} finally {dbg.exitDecision(68);}

					switch (alt68) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:83:24: ';' fbinding
							{
							dbg.location(83,24);
							match(input,25,FOLLOW_25_in_fbinding963); if (state.failed) return;dbg.location(83,28);
							pushFollow(FOLLOW_fbinding_in_fbinding965);
							fbinding();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(68);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fbinding");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fbinding"



	// $ANTLR start "clauses"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:87:1: clauses : ( 'forall' failtypedecl ';' )? clause ( ';' clauses )? ;
	public final void clauses() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "clauses");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:88:2: ( ( 'forall' failtypedecl ';' )? clause ( ';' clauses )? )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:88:4: ( 'forall' failtypedecl ';' )? clause ( ';' clauses )?
			{
			dbg.location(88,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:88:4: ( 'forall' failtypedecl ';' )?
			int alt70=2;
			try { dbg.enterSubRule(70);
			try { dbg.enterDecision(70, decisionCanBacktrack[70]);

			int LA70_0 = input.LA(1);
			if ( (LA70_0==44) ) {
				alt70=1;
			}
			} finally {dbg.exitDecision(70);}

			switch (alt70) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:88:5: 'forall' failtypedecl ';'
					{
					dbg.location(88,5);
					match(input,44,FOLLOW_44_in_clauses981); if (state.failed) return;dbg.location(88,14);
					pushFollow(FOLLOW_failtypedecl_in_clauses983);
					failtypedecl();
					state._fsp--;
					if (state.failed) return;dbg.location(88,27);
					match(input,25,FOLLOW_25_in_clauses985); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(70);}
			dbg.location(88,33);
			pushFollow(FOLLOW_clause_in_clauses989);
			clause();
			state._fsp--;
			if (state.failed) return;dbg.location(88,40);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:88:40: ( ';' clauses )?
			int alt71=2;
			try { dbg.enterSubRule(71);
			try { dbg.enterDecision(71, decisionCanBacktrack[71]);

			int LA71_0 = input.LA(1);
			if ( (LA71_0==25) ) {
				alt71=1;
			}
			} finally {dbg.exitDecision(71);}

			switch (alt71) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:88:41: ';' clauses
					{
					dbg.location(88,41);
					match(input,25,FOLLOW_25_in_clauses992); if (state.failed) return;dbg.location(88,45);
					pushFollow(FOLLOW_clauses_in_clauses994);
					clauses();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(71);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(89, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "clauses");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "clauses"



	// $ANTLR start "clause"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:91:1: clause : ( term | term '->' term | term '<->' term | term '<=>' term );
	public final void clause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "clause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:92:2: ( term | term '->' term | term '<->' term | term '<=>' term )
			int alt72=4;
			try { dbg.enterDecision(72, decisionCanBacktrack[72]);

			switch ( input.LA(1) ) {
			case 18:
				{
				int LA72_1 = input.LA(2);
				if ( (synpred100_proverif()) ) {
					alt72=1;
				}
				else if ( (synpred101_proverif()) ) {
					alt72=2;
				}
				else if ( (synpred102_proverif()) ) {
					alt72=3;
				}
				else if ( (true) ) {
					alt72=4;
				}

				}
				break;
			case ID:
				{
				int LA72_2 = input.LA(2);
				if ( (synpred100_proverif()) ) {
					alt72=1;
				}
				else if ( (synpred101_proverif()) ) {
					alt72=2;
				}
				else if ( (synpred102_proverif()) ) {
					alt72=3;
				}
				else if ( (true) ) {
					alt72=4;
				}

				}
				break;
			case 55:
				{
				int LA72_3 = input.LA(2);
				if ( (synpred100_proverif()) ) {
					alt72=1;
				}
				else if ( (synpred101_proverif()) ) {
					alt72=2;
				}
				else if ( (synpred102_proverif()) ) {
					alt72=3;
				}
				else if ( (true) ) {
					alt72=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(72);}

			switch (alt72) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:92:4: term
					{
					dbg.location(92,4);
					pushFollow(FOLLOW_term_in_clause1009);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:93:4: term '->' term
					{
					dbg.location(93,4);
					pushFollow(FOLLOW_term_in_clause1014);
					term();
					state._fsp--;
					if (state.failed) return;dbg.location(93,9);
					match(input,21,FOLLOW_21_in_clause1016); if (state.failed) return;dbg.location(93,14);
					pushFollow(FOLLOW_term_in_clause1018);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:94:4: term '<->' term
					{
					dbg.location(94,4);
					pushFollow(FOLLOW_term_in_clause1023);
					term();
					state._fsp--;
					if (state.failed) return;dbg.location(94,9);
					match(input,27,FOLLOW_27_in_clause1025); if (state.failed) return;dbg.location(94,15);
					pushFollow(FOLLOW_term_in_clause1027);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:95:4: term '<=>' term
					{
					dbg.location(95,4);
					pushFollow(FOLLOW_term_in_clause1032);
					term();
					state._fsp--;
					if (state.failed) return;dbg.location(95,9);
					match(input,30,FOLLOW_30_in_clause1034); if (state.failed) return;dbg.location(95,15);
					pushFollow(FOLLOW_term_in_clause1036);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(96, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "clause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "clause"



	// $ANTLR start "process"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:98:1: process : ( '0' | 'yield' | ident ( '(' ( ( pterm ',' )* pterm )? ')' )? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )? | ident '<-R' typeid ( ';' process )? | 'if' pterm 'then' process ( 'else' process )? | 'in' '(' pterm ',' pattern ')' ( ';' process )? | 'out' '(' pterm ',' pterm ')' ( ';' process )? | 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )? | ident ( ':' typeid )? '<-' pterm ( ';' process )? | 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )? | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )? | 'phase' integer ( ';' process )? ) ( '|' process )* ;
	public final void process() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "process");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:2: ( ( '0' | 'yield' | ident ( '(' ( ( pterm ',' )* pterm )? ')' )? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )? | ident '<-R' typeid ( ';' process )? | 'if' pterm 'then' process ( 'else' process )? | 'in' '(' pterm ',' pattern ')' ( ';' process )? | 'out' '(' pterm ',' pterm ')' ( ';' process )? | 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )? | ident ( ':' typeid )? '<-' pterm ( ';' process )? | 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )? | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )? | 'phase' integer ( ';' process )? ) ( '|' process )* )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:4: ( '0' | 'yield' | ident ( '(' ( ( pterm ',' )* pterm )? ')' )? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )? | ident '<-R' typeid ( ';' process )? | 'if' pterm 'then' process ( 'else' process )? | 'in' '(' pterm ',' pattern ')' ( ';' process )? | 'out' '(' pterm ',' pterm ')' ( ';' process )? | 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )? | ident ( ':' typeid )? '<-' pterm ( ';' process )? | 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )? | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )? | 'phase' integer ( ';' process )? ) ( '|' process )*
			{
			dbg.location(99,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:4: ( '0' | 'yield' | ident ( '(' ( ( pterm ',' )* pterm )? ')' )? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )? | ident '<-R' typeid ( ';' process )? | 'if' pterm 'then' process ( 'else' process )? | 'in' '(' pterm ',' pattern ')' ( ';' process )? | 'out' '(' pterm ',' pterm ')' ( ';' process )? | 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )? | ident ( ':' typeid )? '<-' pterm ( ';' process )? | 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )? | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )? | 'phase' integer ( ';' process )? )
			int alt103=19;
			try { dbg.enterSubRule(103);
			try { dbg.enterDecision(103, decisionCanBacktrack[103]);

			switch ( input.LA(1) ) {
			case 23:
				{
				alt103=1;
				}
				break;
			case 71:
				{
				alt103=2;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case 18:
				case 19:
				case 36:
				case 38:
				case 40:
				case 41:
				case 42:
				case 46:
				case 47:
				case 53:
				case 55:
				case 56:
				case 61:
				case 62:
				case 64:
				case 65:
				case 66:
				case 68:
				case 70:
				case 72:
					{
					alt103=3;
					}
					break;
				case 28:
					{
					alt103=9;
					}
					break;
				case 24:
				case 26:
					{
					alt103=14;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 18:
				{
				alt103=4;
				}
				break;
			case 16:
				{
				int LA103_5 = input.LA(2);
				if ( (LA103_5==16||LA103_5==18||LA103_5==23||LA103_5==42||LA103_5==45||(LA103_5 >= 48 && LA103_5 <= 50)||(LA103_5 >= 52 && LA103_5 <= 54)||(LA103_5 >= 59 && LA103_5 <= 60)||LA103_5==71) ) {
					alt103=5;
				}
				else if ( (LA103_5==ID) ) {
					int LA103_20 = input.LA(3);
					if ( (LA103_20==EOF||(LA103_20 >= 18 && LA103_20 <= 19)||LA103_20==24||LA103_20==26||LA103_20==28||LA103_20==36||LA103_20==38||(LA103_20 >= 40 && LA103_20 <= 42)||(LA103_20 >= 46 && LA103_20 <= 47)||LA103_20==53||(LA103_20 >= 55 && LA103_20 <= 56)||(LA103_20 >= 61 && LA103_20 <= 62)||(LA103_20 >= 64 && LA103_20 <= 66)||LA103_20==68||LA103_20==70||LA103_20==72) ) {
						alt103=5;
					}
					else if ( (LA103_20==29) ) {
						alt103=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 103, 20, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 5, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 45:
				{
				alt103=7;
				}
				break;
			case 54:
				{
				alt103=8;
				}
				break;
			case 49:
				{
				alt103=10;
				}
				break;
			case 50:
				{
				alt103=11;
				}
				break;
			case 59:
				{
				alt103=12;
				}
				break;
			case 53:
				{
				int LA103_11 = input.LA(2);
				if ( (LA103_11==ID) ) {
					int LA103_21 = input.LA(3);
					if ( (LA103_21==18||LA103_21==32) ) {
						alt103=13;
					}
					else if ( (LA103_21==24) ) {
						int LA103_24 = input.LA(4);
						if ( (LA103_24==ID) ) {
							int LA103_25 = input.LA(5);
							if ( (LA103_25==32) ) {
								alt103=13;
							}
							else if ( (LA103_25==20||LA103_25==67) ) {
								alt103=15;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 103, 25, input);
									dbg.recognitionException(nvae);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 103, 24, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 103, 21, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA103_11==18||LA103_11==32) ) {
					alt103=13;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 11, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 52:
				{
				alt103=16;
				}
				break;
			case 48:
				{
				alt103=17;
				}
				break;
			case 42:
				{
				alt103=18;
				}
				break;
			case 60:
				{
				alt103=19;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(103);}

			switch (alt103) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:5: '0'
					{
					dbg.location(99,5);
					match(input,23,FOLLOW_23_in_process1048); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:11: 'yield'
					{
					dbg.location(99,11);
					match(input,71,FOLLOW_71_in_process1052); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:21: ident ( '(' ( ( pterm ',' )* pterm )? ')' )?
					{
					dbg.location(99,21);
					pushFollow(FOLLOW_ident_in_process1056);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,27);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:27: ( '(' ( ( pterm ',' )* pterm )? ')' )?
					int alt75=2;
					try { dbg.enterSubRule(75);
					try { dbg.enterDecision(75, decisionCanBacktrack[75]);

					int LA75_0 = input.LA(1);
					if ( (LA75_0==18) ) {
						alt75=1;
					}
					} finally {dbg.exitDecision(75);}

					switch (alt75) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:29: '(' ( ( pterm ',' )* pterm )? ')'
							{
							dbg.location(99,29);
							match(input,18,FOLLOW_18_in_process1060); if (state.failed) return;dbg.location(99,33);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:33: ( ( pterm ',' )* pterm )?
							int alt74=2;
							try { dbg.enterSubRule(74);
							try { dbg.enterDecision(74, decisionCanBacktrack[74]);

							int LA74_0 = input.LA(1);
							if ( (LA74_0==ID||LA74_0==18||LA74_0==37||LA74_0==42||(LA74_0 >= 48 && LA74_0 <= 49)||(LA74_0 >= 52 && LA74_0 <= 55)) ) {
								alt74=1;
							}
							} finally {dbg.exitDecision(74);}

							switch (alt74) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:34: ( pterm ',' )* pterm
									{
									dbg.location(99,34);
									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:34: ( pterm ',' )*
									try { dbg.enterSubRule(73);

									loop73:
									while (true) {
										int alt73=2;
										try { dbg.enterDecision(73, decisionCanBacktrack[73]);

										switch ( input.LA(1) ) {
										case ID:
											{
											int LA73_1 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 18:
											{
											int LA73_2 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 37:
											{
											int LA73_3 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 55:
											{
											int LA73_4 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 54:
											{
											int LA73_5 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 49:
											{
											int LA73_6 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 53:
											{
											int LA73_7 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 52:
											{
											int LA73_8 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 48:
											{
											int LA73_9 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										case 42:
											{
											int LA73_10 = input.LA(2);
											if ( (synpred105_proverif()) ) {
												alt73=1;
											}

											}
											break;
										}
										} finally {dbg.exitDecision(73);}

										switch (alt73) {
										case 1 :
											dbg.enterAlt(1);

											// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:35: pterm ','
											{
											dbg.location(99,35);
											pushFollow(FOLLOW_pterm_in_process1064);
											pterm();
											state._fsp--;
											if (state.failed) return;dbg.location(99,41);
											match(input,20,FOLLOW_20_in_process1066); if (state.failed) return;
											}
											break;

										default :
											break loop73;
										}
									}
									} finally {dbg.exitSubRule(73);}
									dbg.location(99,47);
									pushFollow(FOLLOW_pterm_in_process1070);
									pterm();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(74);}
							dbg.location(99,55);
							match(input,19,FOLLOW_19_in_process1074); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(75);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:63: '(' process ')'
					{
					dbg.location(99,63);
					match(input,18,FOLLOW_18_in_process1080); if (state.failed) return;dbg.location(99,67);
					pushFollow(FOLLOW_process_in_process1082);
					process();
					state._fsp--;
					if (state.failed) return;dbg.location(99,75);
					match(input,19,FOLLOW_19_in_process1084); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:81: '!' process
					{
					dbg.location(99,81);
					match(input,16,FOLLOW_16_in_process1088); if (state.failed) return;dbg.location(99,85);
					pushFollow(FOLLOW_process_in_process1090);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:95: '!' ident '<=' ident process
					{
					dbg.location(99,95);
					match(input,16,FOLLOW_16_in_process1094); if (state.failed) return;dbg.location(99,99);
					pushFollow(FOLLOW_ident_in_process1096);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,105);
					match(input,29,FOLLOW_29_in_process1098); if (state.failed) return;dbg.location(99,110);
					pushFollow(FOLLOW_ident_in_process1100);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,116);
					pushFollow(FOLLOW_process_in_process1102);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:126: 'foreach' ident '<=' ident 'do' process
					{
					dbg.location(99,126);
					match(input,45,FOLLOW_45_in_process1106); if (state.failed) return;dbg.location(99,136);
					pushFollow(FOLLOW_ident_in_process1108);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,142);
					match(input,29,FOLLOW_29_in_process1110); if (state.failed) return;dbg.location(99,147);
					pushFollow(FOLLOW_ident_in_process1112);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,153);
					match(input,39,FOLLOW_39_in_process1114); if (state.failed) return;dbg.location(99,158);
					pushFollow(FOLLOW_process_in_process1116);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:168: 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )?
					{
					dbg.location(99,168);
					match(input,54,FOLLOW_54_in_process1120); if (state.failed) return;dbg.location(99,174);
					pushFollow(FOLLOW_ident_in_process1122);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,180);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:180: ( '[' ( ( ident ',' )* ident )? ']' )?
					int alt78=2;
					try { dbg.enterSubRule(78);
					try { dbg.enterDecision(78, decisionCanBacktrack[78]);

					int LA78_0 = input.LA(1);
					if ( (LA78_0==34) ) {
						alt78=1;
					}
					} finally {dbg.exitDecision(78);}

					switch (alt78) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:182: '[' ( ( ident ',' )* ident )? ']'
							{
							dbg.location(99,182);
							match(input,34,FOLLOW_34_in_process1126); if (state.failed) return;dbg.location(99,186);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:186: ( ( ident ',' )* ident )?
							int alt77=2;
							try { dbg.enterSubRule(77);
							try { dbg.enterDecision(77, decisionCanBacktrack[77]);

							int LA77_0 = input.LA(1);
							if ( (LA77_0==ID) ) {
								alt77=1;
							}
							} finally {dbg.exitDecision(77);}

							switch (alt77) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:187: ( ident ',' )* ident
									{
									dbg.location(99,187);
									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:187: ( ident ',' )*
									try { dbg.enterSubRule(76);

									loop76:
									while (true) {
										int alt76=2;
										try { dbg.enterDecision(76, decisionCanBacktrack[76]);

										int LA76_0 = input.LA(1);
										if ( (LA76_0==ID) ) {
											int LA76_1 = input.LA(2);
											if ( (LA76_1==20) ) {
												alt76=1;
											}

										}

										} finally {dbg.exitDecision(76);}

										switch (alt76) {
										case 1 :
											dbg.enterAlt(1);

											// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:188: ident ','
											{
											dbg.location(99,188);
											pushFollow(FOLLOW_ident_in_process1130);
											ident();
											state._fsp--;
											if (state.failed) return;dbg.location(99,194);
											match(input,20,FOLLOW_20_in_process1132); if (state.failed) return;
											}
											break;

										default :
											break loop76;
										}
									}
									} finally {dbg.exitSubRule(76);}
									dbg.location(99,200);
									pushFollow(FOLLOW_ident_in_process1136);
									ident();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(77);}
							dbg.location(99,208);
							match(input,35,FOLLOW_35_in_process1140); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(78);}
					dbg.location(99,215);
					match(input,24,FOLLOW_24_in_process1145); if (state.failed) return;dbg.location(99,219);
					pushFollow(FOLLOW_typeid_in_process1147);
					typeid();
					state._fsp--;
					if (state.failed) return;dbg.location(99,226);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:226: ( ';' process )?
					int alt79=2;
					try { dbg.enterSubRule(79);
					try { dbg.enterDecision(79, decisionCanBacktrack[79]);

					int LA79_0 = input.LA(1);
					if ( (LA79_0==25) ) {
						alt79=1;
					}
					} finally {dbg.exitDecision(79);}

					switch (alt79) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:227: ';' process
							{
							dbg.location(99,227);
							match(input,25,FOLLOW_25_in_process1150); if (state.failed) return;dbg.location(99,231);
							pushFollow(FOLLOW_process_in_process1152);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(79);}

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:244: ident '<-R' typeid ( ';' process )?
					{
					dbg.location(99,244);
					pushFollow(FOLLOW_ident_in_process1159);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,250);
					match(input,28,FOLLOW_28_in_process1161); if (state.failed) return;dbg.location(99,256);
					pushFollow(FOLLOW_typeid_in_process1163);
					typeid();
					state._fsp--;
					if (state.failed) return;dbg.location(99,263);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:263: ( ';' process )?
					int alt80=2;
					try { dbg.enterSubRule(80);
					try { dbg.enterDecision(80, decisionCanBacktrack[80]);

					int LA80_0 = input.LA(1);
					if ( (LA80_0==25) ) {
						alt80=1;
					}
					} finally {dbg.exitDecision(80);}

					switch (alt80) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:264: ';' process
							{
							dbg.location(99,264);
							match(input,25,FOLLOW_25_in_process1166); if (state.failed) return;dbg.location(99,268);
							pushFollow(FOLLOW_process_in_process1168);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(80);}

					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:281: 'if' pterm 'then' process ( 'else' process )?
					{
					dbg.location(99,281);
					match(input,49,FOLLOW_49_in_process1175); if (state.failed) return;dbg.location(99,286);
					pushFollow(FOLLOW_pterm_in_process1177);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(99,292);
					match(input,69,FOLLOW_69_in_process1179); if (state.failed) return;dbg.location(99,299);
					pushFollow(FOLLOW_process_in_process1181);
					process();
					state._fsp--;
					if (state.failed) return;dbg.location(99,307);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:307: ( 'else' process )?
					int alt81=2;
					try { dbg.enterSubRule(81);
					try { dbg.enterDecision(81, decisionCanBacktrack[81]);

					int LA81_0 = input.LA(1);
					if ( (LA81_0==40) ) {
						int LA81_1 = input.LA(2);
						if ( (synpred120_proverif()) ) {
							alt81=1;
						}
					}
					} finally {dbg.exitDecision(81);}

					switch (alt81) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:308: 'else' process
							{
							dbg.location(99,308);
							match(input,40,FOLLOW_40_in_process1184); if (state.failed) return;dbg.location(99,315);
							pushFollow(FOLLOW_process_in_process1186);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(81);}

					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:328: 'in' '(' pterm ',' pattern ')' ( ';' process )?
					{
					dbg.location(99,328);
					match(input,50,FOLLOW_50_in_process1193); if (state.failed) return;dbg.location(99,333);
					match(input,18,FOLLOW_18_in_process1195); if (state.failed) return;dbg.location(99,336);
					pushFollow(FOLLOW_pterm_in_process1196);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(99,342);
					match(input,20,FOLLOW_20_in_process1198); if (state.failed) return;dbg.location(99,346);
					pushFollow(FOLLOW_pattern_in_process1200);
					pattern();
					state._fsp--;
					if (state.failed) return;dbg.location(99,354);
					match(input,19,FOLLOW_19_in_process1202); if (state.failed) return;dbg.location(99,358);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:358: ( ';' process )?
					int alt82=2;
					try { dbg.enterSubRule(82);
					try { dbg.enterDecision(82, decisionCanBacktrack[82]);

					int LA82_0 = input.LA(1);
					if ( (LA82_0==25) ) {
						alt82=1;
					}
					} finally {dbg.exitDecision(82);}

					switch (alt82) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:359: ';' process
							{
							dbg.location(99,359);
							match(input,25,FOLLOW_25_in_process1205); if (state.failed) return;dbg.location(99,363);
							pushFollow(FOLLOW_process_in_process1207);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(82);}

					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:375: 'out' '(' pterm ',' pterm ')' ( ';' process )?
					{
					dbg.location(99,375);
					match(input,59,FOLLOW_59_in_process1213); if (state.failed) return;dbg.location(99,381);
					match(input,18,FOLLOW_18_in_process1215); if (state.failed) return;dbg.location(99,384);
					pushFollow(FOLLOW_pterm_in_process1216);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(99,390);
					match(input,20,FOLLOW_20_in_process1218); if (state.failed) return;dbg.location(99,394);
					pushFollow(FOLLOW_pterm_in_process1220);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(99,399);
					match(input,19,FOLLOW_19_in_process1221); if (state.failed) return;dbg.location(99,403);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:403: ( ';' process )?
					int alt83=2;
					try { dbg.enterSubRule(83);
					try { dbg.enterDecision(83, decisionCanBacktrack[83]);

					int LA83_0 = input.LA(1);
					if ( (LA83_0==25) ) {
						alt83=1;
					}
					} finally {dbg.exitDecision(83);}

					switch (alt83) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:404: ';' process
							{
							dbg.location(99,404);
							match(input,25,FOLLOW_25_in_process1224); if (state.failed) return;dbg.location(99,407);
							pushFollow(FOLLOW_process_in_process1225);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(83);}

					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:419: 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )?
					{
					dbg.location(99,419);
					match(input,53,FOLLOW_53_in_process1231); if (state.failed) return;dbg.location(99,425);
					pushFollow(FOLLOW_pattern_in_process1233);
					pattern();
					state._fsp--;
					if (state.failed) return;dbg.location(99,433);
					match(input,32,FOLLOW_32_in_process1235); if (state.failed) return;dbg.location(99,437);
					pushFollow(FOLLOW_pterm_in_process1237);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(99,443);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:443: ( 'in' process ( 'else' process )? )?
					int alt85=2;
					try { dbg.enterSubRule(85);
					try { dbg.enterDecision(85, decisionCanBacktrack[85]);

					int LA85_0 = input.LA(1);
					if ( (LA85_0==50) ) {
						alt85=1;
					}
					} finally {dbg.exitDecision(85);}

					switch (alt85) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:444: 'in' process ( 'else' process )?
							{
							dbg.location(99,444);
							match(input,50,FOLLOW_50_in_process1240); if (state.failed) return;dbg.location(99,449);
							pushFollow(FOLLOW_process_in_process1242);
							process();
							state._fsp--;
							if (state.failed) return;dbg.location(99,457);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:457: ( 'else' process )?
							int alt84=2;
							try { dbg.enterSubRule(84);
							try { dbg.enterDecision(84, decisionCanBacktrack[84]);

							int LA84_0 = input.LA(1);
							if ( (LA84_0==40) ) {
								int LA84_1 = input.LA(2);
								if ( (synpred126_proverif()) ) {
									alt84=1;
								}
							}
							} finally {dbg.exitDecision(84);}

							switch (alt84) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:458: 'else' process
									{
									dbg.location(99,458);
									match(input,40,FOLLOW_40_in_process1245); if (state.failed) return;dbg.location(99,465);
									pushFollow(FOLLOW_process_in_process1247);
									process();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(84);}

							}
							break;

					}
					} finally {dbg.exitSubRule(85);}

					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:480: ident ( ':' typeid )? '<-' pterm ( ';' process )?
					{
					dbg.location(99,480);
					pushFollow(FOLLOW_ident_in_process1256);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,486);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:486: ( ':' typeid )?
					int alt86=2;
					try { dbg.enterSubRule(86);
					try { dbg.enterDecision(86, decisionCanBacktrack[86]);

					int LA86_0 = input.LA(1);
					if ( (LA86_0==24) ) {
						alt86=1;
					}
					} finally {dbg.exitDecision(86);}

					switch (alt86) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:487: ':' typeid
							{
							dbg.location(99,487);
							match(input,24,FOLLOW_24_in_process1259); if (state.failed) return;dbg.location(99,491);
							pushFollow(FOLLOW_typeid_in_process1261);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(86);}
					dbg.location(99,501);
					match(input,26,FOLLOW_26_in_process1266); if (state.failed) return;dbg.location(99,506);
					pushFollow(FOLLOW_pterm_in_process1268);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(99,512);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:512: ( ';' process )?
					int alt87=2;
					try { dbg.enterSubRule(87);
					try { dbg.enterDecision(87, decisionCanBacktrack[87]);

					int LA87_0 = input.LA(1);
					if ( (LA87_0==25) ) {
						alt87=1;
					}
					} finally {dbg.exitDecision(87);}

					switch (alt87) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:513: ';' process
							{
							dbg.location(99,513);
							match(input,25,FOLLOW_25_in_process1271); if (state.failed) return;dbg.location(99,517);
							pushFollow(FOLLOW_process_in_process1273);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(87);}

					}
					break;
				case 15 :
					dbg.enterAlt(15);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:529: 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )?
					{
					dbg.location(99,529);
					match(input,53,FOLLOW_53_in_process1279); if (state.failed) return;dbg.location(99,535);
					pushFollow(FOLLOW_typedecl_in_process1281);
					typedecl();
					state._fsp--;
					if (state.failed) return;dbg.location(99,544);
					match(input,67,FOLLOW_67_in_process1283); if (state.failed) return;dbg.location(99,555);
					pushFollow(FOLLOW_pterm_in_process1285);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(99,561);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:561: ( 'in' process ( 'else' process )? )?
					int alt89=2;
					try { dbg.enterSubRule(89);
					try { dbg.enterDecision(89, decisionCanBacktrack[89]);

					int LA89_0 = input.LA(1);
					if ( (LA89_0==50) ) {
						alt89=1;
					}
					} finally {dbg.exitDecision(89);}

					switch (alt89) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:562: 'in' process ( 'else' process )?
							{
							dbg.location(99,562);
							match(input,50,FOLLOW_50_in_process1288); if (state.failed) return;dbg.location(99,567);
							pushFollow(FOLLOW_process_in_process1290);
							process();
							state._fsp--;
							if (state.failed) return;dbg.location(99,575);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:575: ( 'else' process )?
							int alt88=2;
							try { dbg.enterSubRule(88);
							try { dbg.enterDecision(88, decisionCanBacktrack[88]);

							int LA88_0 = input.LA(1);
							if ( (LA88_0==40) ) {
								int LA88_1 = input.LA(2);
								if ( (synpred132_proverif()) ) {
									alt88=1;
								}
							}
							} finally {dbg.exitDecision(88);}

							switch (alt88) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:576: 'else' process
									{
									dbg.location(99,576);
									match(input,40,FOLLOW_40_in_process1293); if (state.failed) return;dbg.location(99,583);
									pushFollow(FOLLOW_process_in_process1295);
									process();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(88);}

							}
							break;

					}
					} finally {dbg.exitSubRule(89);}

					}
					break;
				case 16 :
					dbg.enterAlt(16);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:598: 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )?
					{
					dbg.location(99,598);
					match(input,52,FOLLOW_52_in_process1304); if (state.failed) return;dbg.location(99,607);
					pushFollow(FOLLOW_ident_in_process1306);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,613);
					match(input,18,FOLLOW_18_in_process1308); if (state.failed) return;dbg.location(99,617);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:617: ( ( pterm ',' )* pterm )?
					int alt91=2;
					try { dbg.enterSubRule(91);
					try { dbg.enterDecision(91, decisionCanBacktrack[91]);

					int LA91_0 = input.LA(1);
					if ( (LA91_0==ID||LA91_0==18||LA91_0==37||LA91_0==42||(LA91_0 >= 48 && LA91_0 <= 49)||(LA91_0 >= 52 && LA91_0 <= 55)) ) {
						alt91=1;
					}
					} finally {dbg.exitDecision(91);}

					switch (alt91) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:618: ( pterm ',' )* pterm
							{
							dbg.location(99,618);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:618: ( pterm ',' )*
							try { dbg.enterSubRule(90);

							loop90:
							while (true) {
								int alt90=2;
								try { dbg.enterDecision(90, decisionCanBacktrack[90]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA90_1 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 18:
									{
									int LA90_2 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 37:
									{
									int LA90_3 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 55:
									{
									int LA90_4 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 54:
									{
									int LA90_5 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 49:
									{
									int LA90_6 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 53:
									{
									int LA90_7 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 52:
									{
									int LA90_8 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 48:
									{
									int LA90_9 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								case 42:
									{
									int LA90_10 = input.LA(2);
									if ( (synpred135_proverif()) ) {
										alt90=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(90);}

								switch (alt90) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:619: pterm ','
									{
									dbg.location(99,619);
									pushFollow(FOLLOW_pterm_in_process1312);
									pterm();
									state._fsp--;
									if (state.failed) return;dbg.location(99,625);
									match(input,20,FOLLOW_20_in_process1314); if (state.failed) return;
									}
									break;

								default :
									break loop90;
								}
							}
							} finally {dbg.exitSubRule(90);}
							dbg.location(99,631);
							pushFollow(FOLLOW_pterm_in_process1318);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(91);}
					dbg.location(99,639);
					match(input,19,FOLLOW_19_in_process1322); if (state.failed) return;dbg.location(99,643);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:643: ( ';' process )?
					int alt92=2;
					try { dbg.enterSubRule(92);
					try { dbg.enterDecision(92, decisionCanBacktrack[92]);

					int LA92_0 = input.LA(1);
					if ( (LA92_0==25) ) {
						alt92=1;
					}
					} finally {dbg.exitDecision(92);}

					switch (alt92) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:644: ';' process
							{
							dbg.location(99,644);
							match(input,25,FOLLOW_25_in_process1325); if (state.failed) return;dbg.location(99,648);
							pushFollow(FOLLOW_process_in_process1327);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(92);}

					}
					break;
				case 17 :
					dbg.enterAlt(17);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:660: 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )?
					{
					dbg.location(99,660);
					match(input,48,FOLLOW_48_in_process1333); if (state.failed) return;dbg.location(99,666);
					pushFollow(FOLLOW_ident_in_process1335);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,672);
					match(input,18,FOLLOW_18_in_process1337); if (state.failed) return;dbg.location(99,676);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:676: ( ( pattern ',' )* pattern )?
					int alt94=2;
					try { dbg.enterSubRule(94);
					try { dbg.enterDecision(94, decisionCanBacktrack[94]);

					int LA94_0 = input.LA(1);
					if ( (LA94_0==ID||LA94_0==18||LA94_0==32) ) {
						alt94=1;
					}
					} finally {dbg.exitDecision(94);}

					switch (alt94) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:677: ( pattern ',' )* pattern
							{
							dbg.location(99,677);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:677: ( pattern ',' )*
							try { dbg.enterSubRule(93);

							loop93:
							while (true) {
								int alt93=2;
								try { dbg.enterDecision(93, decisionCanBacktrack[93]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA93_1 = input.LA(2);
									if ( (synpred139_proverif()) ) {
										alt93=1;
									}

									}
									break;
								case 18:
									{
									int LA93_2 = input.LA(2);
									if ( (synpred139_proverif()) ) {
										alt93=1;
									}

									}
									break;
								case 32:
									{
									int LA93_3 = input.LA(2);
									if ( (synpred139_proverif()) ) {
										alt93=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(93);}

								switch (alt93) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:678: pattern ','
									{
									dbg.location(99,678);
									pushFollow(FOLLOW_pattern_in_process1341);
									pattern();
									state._fsp--;
									if (state.failed) return;dbg.location(99,686);
									match(input,20,FOLLOW_20_in_process1343); if (state.failed) return;
									}
									break;

								default :
									break loop93;
								}
							}
							} finally {dbg.exitSubRule(93);}
							dbg.location(99,692);
							pushFollow(FOLLOW_pattern_in_process1347);
							pattern();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(94);}
					dbg.location(99,702);
					match(input,19,FOLLOW_19_in_process1351); if (state.failed) return;dbg.location(99,706);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:706: ( 'suchthat' pterm )?
					int alt95=2;
					try { dbg.enterSubRule(95);
					try { dbg.enterDecision(95, decisionCanBacktrack[95]);

					int LA95_0 = input.LA(1);
					if ( (LA95_0==67) ) {
						alt95=1;
					}
					} finally {dbg.exitDecision(95);}

					switch (alt95) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:707: 'suchthat' pterm
							{
							dbg.location(99,707);
							match(input,67,FOLLOW_67_in_process1354); if (state.failed) return;dbg.location(99,718);
							pushFollow(FOLLOW_pterm_in_process1356);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(95);}
					dbg.location(99,726);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:726: ( 'in' process ( 'else' process )? )?
					int alt97=2;
					try { dbg.enterSubRule(97);
					try { dbg.enterDecision(97, decisionCanBacktrack[97]);

					int LA97_0 = input.LA(1);
					if ( (LA97_0==50) ) {
						alt97=1;
					}
					} finally {dbg.exitDecision(97);}

					switch (alt97) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:727: 'in' process ( 'else' process )?
							{
							dbg.location(99,727);
							match(input,50,FOLLOW_50_in_process1361); if (state.failed) return;dbg.location(99,732);
							pushFollow(FOLLOW_process_in_process1363);
							process();
							state._fsp--;
							if (state.failed) return;dbg.location(99,740);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:740: ( 'else' process )?
							int alt96=2;
							try { dbg.enterSubRule(96);
							try { dbg.enterDecision(96, decisionCanBacktrack[96]);

							int LA96_0 = input.LA(1);
							if ( (LA96_0==40) ) {
								int LA96_1 = input.LA(2);
								if ( (synpred142_proverif()) ) {
									alt96=1;
								}
							}
							} finally {dbg.exitDecision(96);}

							switch (alt96) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:741: 'else' process
									{
									dbg.location(99,741);
									match(input,40,FOLLOW_40_in_process1366); if (state.failed) return;dbg.location(99,748);
									pushFollow(FOLLOW_process_in_process1368);
									process();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(96);}

							}
							break;

					}
					} finally {dbg.exitSubRule(97);}

					}
					break;
				case 18 :
					dbg.enterAlt(18);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:763: 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )?
					{
					dbg.location(99,763);
					match(input,42,FOLLOW_42_in_process1377); if (state.failed) return;dbg.location(99,771);
					pushFollow(FOLLOW_ident_in_process1379);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(99,777);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:777: ( '(' ( ( pterm ',' )* pterm )? ')' )?
					int alt100=2;
					try { dbg.enterSubRule(100);
					try { dbg.enterDecision(100, decisionCanBacktrack[100]);

					int LA100_0 = input.LA(1);
					if ( (LA100_0==18) ) {
						alt100=1;
					}
					} finally {dbg.exitDecision(100);}

					switch (alt100) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:779: '(' ( ( pterm ',' )* pterm )? ')'
							{
							dbg.location(99,779);
							match(input,18,FOLLOW_18_in_process1383); if (state.failed) return;dbg.location(99,782);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:782: ( ( pterm ',' )* pterm )?
							int alt99=2;
							try { dbg.enterSubRule(99);
							try { dbg.enterDecision(99, decisionCanBacktrack[99]);

							int LA99_0 = input.LA(1);
							if ( (LA99_0==ID||LA99_0==18||LA99_0==37||LA99_0==42||(LA99_0 >= 48 && LA99_0 <= 49)||(LA99_0 >= 52 && LA99_0 <= 55)) ) {
								alt99=1;
							}
							} finally {dbg.exitDecision(99);}

							switch (alt99) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:783: ( pterm ',' )* pterm
									{
									dbg.location(99,783);
									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:783: ( pterm ',' )*
									try { dbg.enterSubRule(98);

									loop98:
									while (true) {
										int alt98=2;
										try { dbg.enterDecision(98, decisionCanBacktrack[98]);

										switch ( input.LA(1) ) {
										case ID:
											{
											int LA98_1 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 18:
											{
											int LA98_2 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 37:
											{
											int LA98_3 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 55:
											{
											int LA98_4 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 54:
											{
											int LA98_5 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 49:
											{
											int LA98_6 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 53:
											{
											int LA98_7 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 52:
											{
											int LA98_8 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 48:
											{
											int LA98_9 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										case 42:
											{
											int LA98_10 = input.LA(2);
											if ( (synpred145_proverif()) ) {
												alt98=1;
											}

											}
											break;
										}
										} finally {dbg.exitDecision(98);}

										switch (alt98) {
										case 1 :
											dbg.enterAlt(1);

											// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:784: pterm ','
											{
											dbg.location(99,784);
											pushFollow(FOLLOW_pterm_in_process1386);
											pterm();
											state._fsp--;
											if (state.failed) return;dbg.location(99,790);
											match(input,20,FOLLOW_20_in_process1388); if (state.failed) return;
											}
											break;

										default :
											break loop98;
										}
									}
									} finally {dbg.exitSubRule(98);}
									dbg.location(99,796);
									pushFollow(FOLLOW_pterm_in_process1392);
									pterm();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(99);}
							dbg.location(99,804);
							match(input,19,FOLLOW_19_in_process1396); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(100);}
					dbg.location(99,811);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:811: ( ';' process )?
					int alt101=2;
					try { dbg.enterSubRule(101);
					try { dbg.enterDecision(101, decisionCanBacktrack[101]);

					int LA101_0 = input.LA(1);
					if ( (LA101_0==25) ) {
						alt101=1;
					}
					} finally {dbg.exitDecision(101);}

					switch (alt101) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:812: ';' process
							{
							dbg.location(99,812);
							match(input,25,FOLLOW_25_in_process1402); if (state.failed) return;dbg.location(99,816);
							pushFollow(FOLLOW_process_in_process1404);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(101);}

					}
					break;
				case 19 :
					dbg.enterAlt(19);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:828: 'phase' integer ( ';' process )?
					{
					dbg.location(99,828);
					match(input,60,FOLLOW_60_in_process1410); if (state.failed) return;dbg.location(99,836);
					pushFollow(FOLLOW_integer_in_process1412);
					integer();
					state._fsp--;
					if (state.failed) return;dbg.location(99,844);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:844: ( ';' process )?
					int alt102=2;
					try { dbg.enterSubRule(102);
					try { dbg.enterDecision(102, decisionCanBacktrack[102]);

					int LA102_0 = input.LA(1);
					if ( (LA102_0==25) ) {
						alt102=1;
					}
					} finally {dbg.exitDecision(102);}

					switch (alt102) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:845: ';' process
							{
							dbg.location(99,845);
							match(input,25,FOLLOW_25_in_process1415); if (state.failed) return;dbg.location(99,849);
							pushFollow(FOLLOW_process_in_process1417);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(102);}

					}
					break;

			}
			} finally {dbg.exitSubRule(103);}
			dbg.location(99,860);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:860: ( '|' process )*
			try { dbg.enterSubRule(104);

			loop104:
			while (true) {
				int alt104=2;
				try { dbg.enterDecision(104, decisionCanBacktrack[104]);

				int LA104_0 = input.LA(1);
				if ( (LA104_0==72) ) {
					int LA104_2 = input.LA(2);
					if ( (synpred151_proverif()) ) {
						alt104=1;
					}

				}

				} finally {dbg.exitDecision(104);}

				switch (alt104) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:861: '|' process
					{
					dbg.location(99,861);
					match(input,72,FOLLOW_72_in_process1423); if (state.failed) return;dbg.location(99,865);
					pushFollow(FOLLOW_process_in_process1425);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop104;
				}
			}
			} finally {dbg.exitSubRule(104);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(100, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "process");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "process"



	// $ANTLR start "pterm"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:103:1: pterm : ( ident | '(' ( ( pterm ',' )* pterm )? ')' | ident '(' ( ( pterm ',' )* pterm )? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ( 'else' pterm )? | 'let' pattern | ident ( ':' typeid )? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm ) ( '=' pterm | '<>' pterm | '&&' pterm | '||' pterm )* ;
	public final void pterm() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "pterm");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:2: ( ( ident | '(' ( ( pterm ',' )* pterm )? ')' | ident '(' ( ( pterm ',' )* pterm )? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ( 'else' pterm )? | 'let' pattern | ident ( ':' typeid )? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm ) ( '=' pterm | '<>' pterm | '&&' pterm | '||' pterm )* )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:4: ( ident | '(' ( ( pterm ',' )* pterm )? ')' | ident '(' ( ( pterm ',' )* pterm )? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ( 'else' pterm )? | 'let' pattern | ident ( ':' typeid )? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm ) ( '=' pterm | '<>' pterm | '&&' pterm | '||' pterm )*
			{
			dbg.location(104,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:4: ( ident | '(' ( ( pterm ',' )* pterm )? ')' | ident '(' ( ( pterm ',' )* pterm )? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ( 'else' pterm )? | 'let' pattern | ident ( ':' typeid )? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm )
			int alt124=14;
			try { dbg.enterSubRule(124);
			try { dbg.enterDecision(124, decisionCanBacktrack[124]);

			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case 17:
				case 19:
				case 20:
				case 25:
				case 31:
				case 32:
				case 35:
				case 36:
				case 38:
				case 40:
				case 41:
				case 42:
				case 46:
				case 47:
				case 50:
				case 53:
				case 55:
				case 56:
				case 61:
				case 62:
				case 64:
				case 65:
				case 66:
				case 68:
				case 69:
				case 70:
				case 72:
				case 73:
					{
					alt124=1;
					}
					break;
				case 18:
					{
					alt124=3;
					}
					break;
				case 28:
					{
					alt124=7;
					}
					break;
				case 24:
				case 26:
					{
					alt124=10;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 18:
				{
				alt124=2;
				}
				break;
			case 37:
				{
				alt124=4;
				}
				break;
			case 55:
				{
				alt124=5;
				}
				break;
			case 54:
				{
				alt124=6;
				}
				break;
			case 49:
				{
				alt124=8;
				}
				break;
			case 53:
				{
				int LA124_7 = input.LA(2);
				if ( (LA124_7==ID) ) {
					int LA124_15 = input.LA(3);
					if ( (LA124_15==EOF||(LA124_15 >= 17 && LA124_15 <= 20)||LA124_15==25||(LA124_15 >= 31 && LA124_15 <= 32)||(LA124_15 >= 35 && LA124_15 <= 36)||LA124_15==38||(LA124_15 >= 40 && LA124_15 <= 42)||(LA124_15 >= 46 && LA124_15 <= 47)||LA124_15==50||LA124_15==53||(LA124_15 >= 55 && LA124_15 <= 56)||(LA124_15 >= 61 && LA124_15 <= 62)||(LA124_15 >= 64 && LA124_15 <= 66)||(LA124_15 >= 68 && LA124_15 <= 70)||(LA124_15 >= 72 && LA124_15 <= 73)) ) {
						alt124=9;
					}
					else if ( (LA124_15==24) ) {
						int LA124_17 = input.LA(4);
						if ( (LA124_17==ID) ) {
							switch ( input.LA(5) ) {
							case EOF:
							case 17:
							case 19:
							case 25:
							case 31:
							case 32:
							case 35:
							case 36:
							case 38:
							case 40:
							case 41:
							case 42:
							case 46:
							case 47:
							case 50:
							case 53:
							case 55:
							case 56:
							case 61:
							case 62:
							case 64:
							case 65:
							case 66:
							case 68:
							case 69:
							case 70:
							case 72:
							case 73:
								{
								alt124=9;
								}
								break;
							case 20:
								{
								int LA124_19 = input.LA(6);
								if ( (LA124_19==ID) ) {
									int LA124_21 = input.LA(7);
									if ( (LA124_21==EOF||(LA124_21 >= 17 && LA124_21 <= 20)||LA124_21==26||LA124_21==28||(LA124_21 >= 31 && LA124_21 <= 32)||LA124_21==35||LA124_21==73) ) {
										alt124=9;
									}
									else if ( (LA124_21==24) ) {
										int LA124_22 = input.LA(8);
										if ( (LA124_22==ID) ) {
											switch ( input.LA(9) ) {
											case EOF:
											case 19:
											case 26:
												{
												alt124=9;
												}
												break;
											case 20:
												{
												int LA124_24 = input.LA(10);
												if ( (LA124_24==ID) ) {
													int LA124_25 = input.LA(11);
													if ( (LA124_25==EOF||(LA124_25 >= 18 && LA124_25 <= 20)) ) {
														alt124=9;
													}
													else if ( (LA124_25==24) ) {
														int LA124_26 = input.LA(12);
														if ( (LA124_26==ID) ) {
															switch ( input.LA(13) ) {
															case EOF:
															case 19:
																{
																alt124=9;
																}
																break;
															case 20:
																{
																int LA124_28 = input.LA(14);
																if ( (LA124_28==ID) ) {
																	int LA124_29 = input.LA(15);
																	if ( (LA124_29==EOF||(LA124_29 >= 18 && LA124_29 <= 20)) ) {
																		alt124=9;
																	}
																	else if ( (LA124_29==24) ) {
																		int LA124_30 = input.LA(16);
																		if ( (LA124_30==ID) ) {
																			switch ( input.LA(17) ) {
																			case EOF:
																			case 19:
																				{
																				alt124=9;
																				}
																				break;
																			case 20:
																				{
																				int LA124_32 = input.LA(18);
																				if ( (LA124_32==ID) ) {
																					int LA124_33 = input.LA(19);
																					if ( (LA124_33==EOF||(LA124_33 >= 18 && LA124_33 <= 20)) ) {
																						alt124=9;
																					}
																					else if ( (LA124_33==24) ) {
																						int LA124_34 = input.LA(20);
																						if ( (LA124_34==ID) ) {
																							switch ( input.LA(21) ) {
																							case EOF:
																							case 19:
																								{
																								alt124=9;
																								}
																								break;
																							case 20:
																								{
																								int LA124_36 = input.LA(22);
																								if ( (synpred168_proverif()) ) {
																									alt124=9;
																								}
																								else if ( (synpred172_proverif()) ) {
																									alt124=11;
																								}

																								else {
																									if (state.backtracking>0) {state.failed=true; return;}
																									int nvaeMark = input.mark();
																									try {
																										for (int nvaeConsume = 0; nvaeConsume < 22 - 1; nvaeConsume++) {
																											input.consume();
																										}
																										NoViableAltException nvae =
																											new NoViableAltException("", 124, 36, input);
																										dbg.recognitionException(nvae);
																										throw nvae;
																									} finally {
																										input.rewind(nvaeMark);
																									}
																								}

																								}
																								break;
																							case 67:
																								{
																								alt124=11;
																								}
																								break;
																							default:
																								if (state.backtracking>0) {state.failed=true; return;}
																								int nvaeMark = input.mark();
																								try {
																									for (int nvaeConsume = 0; nvaeConsume < 21 - 1; nvaeConsume++) {
																										input.consume();
																									}
																									NoViableAltException nvae =
																										new NoViableAltException("", 124, 35, input);
																									dbg.recognitionException(nvae);
																									throw nvae;
																								} finally {
																									input.rewind(nvaeMark);
																								}
																							}
																						}

																						else {
																							if (state.backtracking>0) {state.failed=true; return;}
																							int nvaeMark = input.mark();
																							try {
																								for (int nvaeConsume = 0; nvaeConsume < 20 - 1; nvaeConsume++) {
																									input.consume();
																								}
																								NoViableAltException nvae =
																									new NoViableAltException("", 124, 34, input);
																								dbg.recognitionException(nvae);
																								throw nvae;
																							} finally {
																								input.rewind(nvaeMark);
																							}
																						}

																					}

																					else {
																						if (state.backtracking>0) {state.failed=true; return;}
																						int nvaeMark = input.mark();
																						try {
																							for (int nvaeConsume = 0; nvaeConsume < 19 - 1; nvaeConsume++) {
																								input.consume();
																							}
																							NoViableAltException nvae =
																								new NoViableAltException("", 124, 33, input);
																							dbg.recognitionException(nvae);
																							throw nvae;
																						} finally {
																							input.rewind(nvaeMark);
																						}
																					}

																				}
																				else if ( (LA124_32==18||LA124_32==32) ) {
																					alt124=9;
																				}

																				else {
																					if (state.backtracking>0) {state.failed=true; return;}
																					int nvaeMark = input.mark();
																					try {
																						for (int nvaeConsume = 0; nvaeConsume < 18 - 1; nvaeConsume++) {
																							input.consume();
																						}
																						NoViableAltException nvae =
																							new NoViableAltException("", 124, 32, input);
																						dbg.recognitionException(nvae);
																						throw nvae;
																					} finally {
																						input.rewind(nvaeMark);
																					}
																				}

																				}
																				break;
																			case 67:
																				{
																				alt124=11;
																				}
																				break;
																			default:
																				if (state.backtracking>0) {state.failed=true; return;}
																				int nvaeMark = input.mark();
																				try {
																					for (int nvaeConsume = 0; nvaeConsume < 17 - 1; nvaeConsume++) {
																						input.consume();
																					}
																					NoViableAltException nvae =
																						new NoViableAltException("", 124, 31, input);
																					dbg.recognitionException(nvae);
																					throw nvae;
																				} finally {
																					input.rewind(nvaeMark);
																				}
																			}
																		}

																		else {
																			if (state.backtracking>0) {state.failed=true; return;}
																			int nvaeMark = input.mark();
																			try {
																				for (int nvaeConsume = 0; nvaeConsume < 16 - 1; nvaeConsume++) {
																					input.consume();
																				}
																				NoViableAltException nvae =
																					new NoViableAltException("", 124, 30, input);
																				dbg.recognitionException(nvae);
																				throw nvae;
																			} finally {
																				input.rewind(nvaeMark);
																			}
																		}

																	}

																	else {
																		if (state.backtracking>0) {state.failed=true; return;}
																		int nvaeMark = input.mark();
																		try {
																			for (int nvaeConsume = 0; nvaeConsume < 15 - 1; nvaeConsume++) {
																				input.consume();
																			}
																			NoViableAltException nvae =
																				new NoViableAltException("", 124, 29, input);
																			dbg.recognitionException(nvae);
																			throw nvae;
																		} finally {
																			input.rewind(nvaeMark);
																		}
																	}

																}
																else if ( (LA124_28==18||LA124_28==32) ) {
																	alt124=9;
																}

																else {
																	if (state.backtracking>0) {state.failed=true; return;}
																	int nvaeMark = input.mark();
																	try {
																		for (int nvaeConsume = 0; nvaeConsume < 14 - 1; nvaeConsume++) {
																			input.consume();
																		}
																		NoViableAltException nvae =
																			new NoViableAltException("", 124, 28, input);
																		dbg.recognitionException(nvae);
																		throw nvae;
																	} finally {
																		input.rewind(nvaeMark);
																	}
																}

																}
																break;
															case 67:
																{
																alt124=11;
																}
																break;
															default:
																if (state.backtracking>0) {state.failed=true; return;}
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++) {
																		input.consume();
																	}
																	NoViableAltException nvae =
																		new NoViableAltException("", 124, 27, input);
																	dbg.recognitionException(nvae);
																	throw nvae;
																} finally {
																	input.rewind(nvaeMark);
																}
															}
														}

														else {
															if (state.backtracking>0) {state.failed=true; return;}
															int nvaeMark = input.mark();
															try {
																for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++) {
																	input.consume();
																}
																NoViableAltException nvae =
																	new NoViableAltException("", 124, 26, input);
																dbg.recognitionException(nvae);
																throw nvae;
															} finally {
																input.rewind(nvaeMark);
															}
														}

													}

													else {
														if (state.backtracking>0) {state.failed=true; return;}
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 124, 25, input);
															dbg.recognitionException(nvae);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}

												}
												else if ( (LA124_24==18||LA124_24==32) ) {
													alt124=9;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 124, 24, input);
														dbg.recognitionException(nvae);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

												}
												break;
											case 67:
												{
												alt124=11;
												}
												break;
											default:
												if (state.backtracking>0) {state.failed=true; return;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 124, 23, input);
													dbg.recognitionException(nvae);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}

										else {
											if (state.backtracking>0) {state.failed=true; return;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 124, 22, input);
												dbg.recognitionException(nvae);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 124, 21, input);
											dbg.recognitionException(nvae);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA124_19==EOF||LA124_19==18||LA124_19==32||LA124_19==37||LA124_19==42||(LA124_19 >= 48 && LA124_19 <= 49)||(LA124_19 >= 52 && LA124_19 <= 55)) ) {
									alt124=9;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 124, 19, input);
										dbg.recognitionException(nvae);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 67:
								{
								alt124=11;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 124, 18, input);
									dbg.recognitionException(nvae);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 124, 17, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 15, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA124_7==18||LA124_7==32) ) {
					alt124=9;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 7, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 52:
				{
				alt124=12;
				}
				break;
			case 48:
				{
				alt124=13;
				}
				break;
			case 42:
				{
				alt124=14;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(124);}

			switch (alt124) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:5: ident
					{
					dbg.location(104,5);
					pushFollow(FOLLOW_ident_in_pterm1441);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:13: '(' ( ( pterm ',' )* pterm )? ')'
					{
					dbg.location(104,13);
					match(input,18,FOLLOW_18_in_pterm1445); if (state.failed) return;dbg.location(104,17);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:17: ( ( pterm ',' )* pterm )?
					int alt106=2;
					try { dbg.enterSubRule(106);
					try { dbg.enterDecision(106, decisionCanBacktrack[106]);

					int LA106_0 = input.LA(1);
					if ( (LA106_0==ID||LA106_0==18||LA106_0==37||LA106_0==42||(LA106_0 >= 48 && LA106_0 <= 49)||(LA106_0 >= 52 && LA106_0 <= 55)) ) {
						alt106=1;
					}
					} finally {dbg.exitDecision(106);}

					switch (alt106) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:18: ( pterm ',' )* pterm
							{
							dbg.location(104,18);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:18: ( pterm ',' )*
							try { dbg.enterSubRule(105);

							loop105:
							while (true) {
								int alt105=2;
								try { dbg.enterDecision(105, decisionCanBacktrack[105]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA105_1 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 18:
									{
									int LA105_2 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 37:
									{
									int LA105_3 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 55:
									{
									int LA105_4 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 54:
									{
									int LA105_5 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 49:
									{
									int LA105_6 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 53:
									{
									int LA105_7 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 52:
									{
									int LA105_8 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 48:
									{
									int LA105_9 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								case 42:
									{
									int LA105_10 = input.LA(2);
									if ( (synpred153_proverif()) ) {
										alt105=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(105);}

								switch (alt105) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:19: pterm ','
									{
									dbg.location(104,19);
									pushFollow(FOLLOW_pterm_in_pterm1449);
									pterm();
									state._fsp--;
									if (state.failed) return;dbg.location(104,25);
									match(input,20,FOLLOW_20_in_pterm1451); if (state.failed) return;
									}
									break;

								default :
									break loop105;
								}
							}
							} finally {dbg.exitSubRule(105);}
							dbg.location(104,31);
							pushFollow(FOLLOW_pterm_in_pterm1455);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(106);}
					dbg.location(104,39);
					match(input,19,FOLLOW_19_in_pterm1459); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:45: ident '(' ( ( pterm ',' )* pterm )? ')'
					{
					dbg.location(104,45);
					pushFollow(FOLLOW_ident_in_pterm1463);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(104,51);
					match(input,18,FOLLOW_18_in_pterm1465); if (state.failed) return;dbg.location(104,55);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:55: ( ( pterm ',' )* pterm )?
					int alt108=2;
					try { dbg.enterSubRule(108);
					try { dbg.enterDecision(108, decisionCanBacktrack[108]);

					int LA108_0 = input.LA(1);
					if ( (LA108_0==ID||LA108_0==18||LA108_0==37||LA108_0==42||(LA108_0 >= 48 && LA108_0 <= 49)||(LA108_0 >= 52 && LA108_0 <= 55)) ) {
						alt108=1;
					}
					} finally {dbg.exitDecision(108);}

					switch (alt108) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:56: ( pterm ',' )* pterm
							{
							dbg.location(104,56);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:56: ( pterm ',' )*
							try { dbg.enterSubRule(107);

							loop107:
							while (true) {
								int alt107=2;
								try { dbg.enterDecision(107, decisionCanBacktrack[107]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA107_1 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 18:
									{
									int LA107_2 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 37:
									{
									int LA107_3 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 55:
									{
									int LA107_4 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 54:
									{
									int LA107_5 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 49:
									{
									int LA107_6 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 53:
									{
									int LA107_7 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 52:
									{
									int LA107_8 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 48:
									{
									int LA107_9 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								case 42:
									{
									int LA107_10 = input.LA(2);
									if ( (synpred156_proverif()) ) {
										alt107=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(107);}

								switch (alt107) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:57: pterm ','
									{
									dbg.location(104,57);
									pushFollow(FOLLOW_pterm_in_pterm1469);
									pterm();
									state._fsp--;
									if (state.failed) return;dbg.location(104,63);
									match(input,20,FOLLOW_20_in_pterm1471); if (state.failed) return;
									}
									break;

								default :
									break loop107;
								}
							}
							} finally {dbg.exitSubRule(107);}
							dbg.location(104,69);
							pushFollow(FOLLOW_pterm_in_pterm1475);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(108);}
					dbg.location(104,77);
					match(input,19,FOLLOW_19_in_pterm1479); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:83: 'choice' '[' pterm ',' pterm ']'
					{
					dbg.location(104,83);
					match(input,37,FOLLOW_37_in_pterm1483); if (state.failed) return;dbg.location(104,92);
					match(input,34,FOLLOW_34_in_pterm1485); if (state.failed) return;dbg.location(104,96);
					pushFollow(FOLLOW_pterm_in_pterm1487);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,102);
					match(input,20,FOLLOW_20_in_pterm1489); if (state.failed) return;dbg.location(104,106);
					pushFollow(FOLLOW_pterm_in_pterm1491);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,112);
					match(input,35,FOLLOW_35_in_pterm1493); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:118: 'not' '(' pterm ')'
					{
					dbg.location(104,118);
					match(input,55,FOLLOW_55_in_pterm1497); if (state.failed) return;dbg.location(104,124);
					match(input,18,FOLLOW_18_in_pterm1499); if (state.failed) return;dbg.location(104,128);
					pushFollow(FOLLOW_pterm_in_pterm1501);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,134);
					match(input,19,FOLLOW_19_in_pterm1503); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:140: 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm
					{
					dbg.location(104,140);
					match(input,54,FOLLOW_54_in_pterm1507); if (state.failed) return;dbg.location(104,146);
					pushFollow(FOLLOW_ident_in_pterm1509);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(104,152);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:152: ( '[' ( ( ident ',' )* ident )? ']' )?
					int alt111=2;
					try { dbg.enterSubRule(111);
					try { dbg.enterDecision(111, decisionCanBacktrack[111]);

					int LA111_0 = input.LA(1);
					if ( (LA111_0==34) ) {
						alt111=1;
					}
					} finally {dbg.exitDecision(111);}

					switch (alt111) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:153: '[' ( ( ident ',' )* ident )? ']'
							{
							dbg.location(104,153);
							match(input,34,FOLLOW_34_in_pterm1512); if (state.failed) return;dbg.location(104,157);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:157: ( ( ident ',' )* ident )?
							int alt110=2;
							try { dbg.enterSubRule(110);
							try { dbg.enterDecision(110, decisionCanBacktrack[110]);

							int LA110_0 = input.LA(1);
							if ( (LA110_0==ID) ) {
								alt110=1;
							}
							} finally {dbg.exitDecision(110);}

							switch (alt110) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:158: ( ident ',' )* ident
									{
									dbg.location(104,158);
									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:158: ( ident ',' )*
									try { dbg.enterSubRule(109);

									loop109:
									while (true) {
										int alt109=2;
										try { dbg.enterDecision(109, decisionCanBacktrack[109]);

										int LA109_0 = input.LA(1);
										if ( (LA109_0==ID) ) {
											int LA109_1 = input.LA(2);
											if ( (LA109_1==20) ) {
												alt109=1;
											}

										}

										} finally {dbg.exitDecision(109);}

										switch (alt109) {
										case 1 :
											dbg.enterAlt(1);

											// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:159: ident ','
											{
											dbg.location(104,159);
											pushFollow(FOLLOW_ident_in_pterm1516);
											ident();
											state._fsp--;
											if (state.failed) return;dbg.location(104,165);
											match(input,20,FOLLOW_20_in_pterm1518); if (state.failed) return;
											}
											break;

										default :
											break loop109;
										}
									}
									} finally {dbg.exitSubRule(109);}
									dbg.location(104,171);
									pushFollow(FOLLOW_ident_in_pterm1522);
									ident();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(110);}
							dbg.location(104,179);
							match(input,35,FOLLOW_35_in_pterm1526); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(111);}
					dbg.location(104,185);
					match(input,24,FOLLOW_24_in_pterm1530); if (state.failed) return;dbg.location(104,189);
					pushFollow(FOLLOW_typeid_in_pterm1532);
					typeid();
					state._fsp--;
					if (state.failed) return;dbg.location(104,196);
					match(input,25,FOLLOW_25_in_pterm1534); if (state.failed) return;dbg.location(104,200);
					pushFollow(FOLLOW_pterm_in_pterm1536);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:208: ident '<-R' typeid ';' pterm
					{
					dbg.location(104,208);
					pushFollow(FOLLOW_ident_in_pterm1540);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(104,214);
					match(input,28,FOLLOW_28_in_pterm1542); if (state.failed) return;dbg.location(104,220);
					pushFollow(FOLLOW_typeid_in_pterm1544);
					typeid();
					state._fsp--;
					if (state.failed) return;dbg.location(104,227);
					match(input,25,FOLLOW_25_in_pterm1546); if (state.failed) return;dbg.location(104,231);
					pushFollow(FOLLOW_pterm_in_pterm1548);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:239: 'if' pterm 'then' pterm ( 'else' pterm )?
					{
					dbg.location(104,239);
					match(input,49,FOLLOW_49_in_pterm1552); if (state.failed) return;dbg.location(104,244);
					pushFollow(FOLLOW_pterm_in_pterm1554);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,250);
					match(input,69,FOLLOW_69_in_pterm1556); if (state.failed) return;dbg.location(104,257);
					pushFollow(FOLLOW_pterm_in_pterm1558);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,263);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:263: ( 'else' pterm )?
					int alt112=2;
					try { dbg.enterSubRule(112);
					try { dbg.enterDecision(112, decisionCanBacktrack[112]);

					int LA112_0 = input.LA(1);
					if ( (LA112_0==40) ) {
						int LA112_1 = input.LA(2);
						if ( (synpred166_proverif()) ) {
							alt112=1;
						}
					}
					} finally {dbg.exitDecision(112);}

					switch (alt112) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:264: 'else' pterm
							{
							dbg.location(104,264);
							match(input,40,FOLLOW_40_in_pterm1561); if (state.failed) return;dbg.location(104,271);
							pushFollow(FOLLOW_pterm_in_pterm1563);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(112);}

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:281: 'let' pattern
					{
					dbg.location(104,281);
					match(input,53,FOLLOW_53_in_pterm1569); if (state.failed) return;dbg.location(104,287);
					pushFollow(FOLLOW_pattern_in_pterm1571);
					pattern();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:297: ident ( ':' typeid )? '<-' pterm ';' pterm
					{
					dbg.location(104,297);
					pushFollow(FOLLOW_ident_in_pterm1575);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(104,303);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:303: ( ':' typeid )?
					int alt113=2;
					try { dbg.enterSubRule(113);
					try { dbg.enterDecision(113, decisionCanBacktrack[113]);

					int LA113_0 = input.LA(1);
					if ( (LA113_0==24) ) {
						alt113=1;
					}
					} finally {dbg.exitDecision(113);}

					switch (alt113) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:304: ':' typeid
							{
							dbg.location(104,304);
							match(input,24,FOLLOW_24_in_pterm1578); if (state.failed) return;dbg.location(104,308);
							pushFollow(FOLLOW_typeid_in_pterm1580);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(113);}
					dbg.location(104,317);
					match(input,26,FOLLOW_26_in_pterm1584); if (state.failed) return;dbg.location(104,322);
					pushFollow(FOLLOW_pterm_in_pterm1586);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,328);
					match(input,25,FOLLOW_25_in_pterm1588); if (state.failed) return;dbg.location(104,332);
					pushFollow(FOLLOW_pterm_in_pterm1590);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:340: 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )?
					{
					dbg.location(104,340);
					match(input,53,FOLLOW_53_in_pterm1594); if (state.failed) return;dbg.location(104,346);
					pushFollow(FOLLOW_typedecl_in_pterm1596);
					typedecl();
					state._fsp--;
					if (state.failed) return;dbg.location(104,355);
					match(input,67,FOLLOW_67_in_pterm1598); if (state.failed) return;dbg.location(104,366);
					pushFollow(FOLLOW_pterm_in_pterm1600);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,372);
					match(input,50,FOLLOW_50_in_pterm1602); if (state.failed) return;dbg.location(104,377);
					pushFollow(FOLLOW_pterm_in_pterm1604);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,383);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:383: ( 'else' pterm )?
					int alt114=2;
					try { dbg.enterSubRule(114);
					try { dbg.enterDecision(114, decisionCanBacktrack[114]);

					int LA114_0 = input.LA(1);
					if ( (LA114_0==40) ) {
						int LA114_1 = input.LA(2);
						if ( (synpred171_proverif()) ) {
							alt114=1;
						}
					}
					} finally {dbg.exitDecision(114);}

					switch (alt114) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:384: 'else' pterm
							{
							dbg.location(104,384);
							match(input,40,FOLLOW_40_in_pterm1607); if (state.failed) return;dbg.location(104,391);
							pushFollow(FOLLOW_pterm_in_pterm1609);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(114);}

					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:401: 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm
					{
					dbg.location(104,401);
					match(input,52,FOLLOW_52_in_pterm1615); if (state.failed) return;dbg.location(104,410);
					pushFollow(FOLLOW_ident_in_pterm1617);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(104,416);
					match(input,18,FOLLOW_18_in_pterm1619); if (state.failed) return;dbg.location(104,420);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:420: ( ( pterm ',' )* pterm )?
					int alt116=2;
					try { dbg.enterSubRule(116);
					try { dbg.enterDecision(116, decisionCanBacktrack[116]);

					int LA116_0 = input.LA(1);
					if ( (LA116_0==ID||LA116_0==18||LA116_0==37||LA116_0==42||(LA116_0 >= 48 && LA116_0 <= 49)||(LA116_0 >= 52 && LA116_0 <= 55)) ) {
						alt116=1;
					}
					} finally {dbg.exitDecision(116);}

					switch (alt116) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:421: ( pterm ',' )* pterm
							{
							dbg.location(104,421);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:421: ( pterm ',' )*
							try { dbg.enterSubRule(115);

							loop115:
							while (true) {
								int alt115=2;
								try { dbg.enterDecision(115, decisionCanBacktrack[115]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA115_1 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 18:
									{
									int LA115_2 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 37:
									{
									int LA115_3 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 55:
									{
									int LA115_4 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 54:
									{
									int LA115_5 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 49:
									{
									int LA115_6 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 53:
									{
									int LA115_7 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 52:
									{
									int LA115_8 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 48:
									{
									int LA115_9 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								case 42:
									{
									int LA115_10 = input.LA(2);
									if ( (synpred173_proverif()) ) {
										alt115=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(115);}

								switch (alt115) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:422: pterm ','
									{
									dbg.location(104,422);
									pushFollow(FOLLOW_pterm_in_pterm1623);
									pterm();
									state._fsp--;
									if (state.failed) return;dbg.location(104,428);
									match(input,20,FOLLOW_20_in_pterm1625); if (state.failed) return;
									}
									break;

								default :
									break loop115;
								}
							}
							} finally {dbg.exitSubRule(115);}
							dbg.location(104,434);
							pushFollow(FOLLOW_pterm_in_pterm1629);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(116);}
					dbg.location(104,442);
					match(input,19,FOLLOW_19_in_pterm1633); if (state.failed) return;dbg.location(104,446);
					match(input,25,FOLLOW_25_in_pterm1635); if (state.failed) return;dbg.location(104,450);
					pushFollow(FOLLOW_pterm_in_pterm1637);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:458: 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )?
					{
					dbg.location(104,458);
					match(input,48,FOLLOW_48_in_pterm1641); if (state.failed) return;dbg.location(104,464);
					pushFollow(FOLLOW_ident_in_pterm1643);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(104,470);
					match(input,18,FOLLOW_18_in_pterm1645); if (state.failed) return;dbg.location(104,474);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:474: ( ( pattern ',' )* pattern )?
					int alt118=2;
					try { dbg.enterSubRule(118);
					try { dbg.enterDecision(118, decisionCanBacktrack[118]);

					int LA118_0 = input.LA(1);
					if ( (LA118_0==ID||LA118_0==18||LA118_0==32) ) {
						alt118=1;
					}
					} finally {dbg.exitDecision(118);}

					switch (alt118) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:475: ( pattern ',' )* pattern
							{
							dbg.location(104,475);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:475: ( pattern ',' )*
							try { dbg.enterSubRule(117);

							loop117:
							while (true) {
								int alt117=2;
								try { dbg.enterDecision(117, decisionCanBacktrack[117]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA117_1 = input.LA(2);
									if ( (synpred176_proverif()) ) {
										alt117=1;
									}

									}
									break;
								case 18:
									{
									int LA117_2 = input.LA(2);
									if ( (synpred176_proverif()) ) {
										alt117=1;
									}

									}
									break;
								case 32:
									{
									int LA117_3 = input.LA(2);
									if ( (synpred176_proverif()) ) {
										alt117=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(117);}

								switch (alt117) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:476: pattern ','
									{
									dbg.location(104,476);
									pushFollow(FOLLOW_pattern_in_pterm1649);
									pattern();
									state._fsp--;
									if (state.failed) return;dbg.location(104,484);
									match(input,20,FOLLOW_20_in_pterm1651); if (state.failed) return;
									}
									break;

								default :
									break loop117;
								}
							}
							} finally {dbg.exitSubRule(117);}
							dbg.location(104,490);
							pushFollow(FOLLOW_pattern_in_pterm1655);
							pattern();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(118);}
					dbg.location(104,500);
					match(input,19,FOLLOW_19_in_pterm1659); if (state.failed) return;dbg.location(104,504);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:504: ( 'suchthat' pterm )?
					int alt119=2;
					try { dbg.enterSubRule(119);
					try { dbg.enterDecision(119, decisionCanBacktrack[119]);

					int LA119_0 = input.LA(1);
					if ( (LA119_0==67) ) {
						alt119=1;
					}
					} finally {dbg.exitDecision(119);}

					switch (alt119) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:505: 'suchthat' pterm
							{
							dbg.location(104,505);
							match(input,67,FOLLOW_67_in_pterm1662); if (state.failed) return;dbg.location(104,516);
							pushFollow(FOLLOW_pterm_in_pterm1664);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(119);}
					dbg.location(104,524);
					match(input,50,FOLLOW_50_in_pterm1668); if (state.failed) return;dbg.location(104,529);
					pushFollow(FOLLOW_pterm_in_pterm1670);
					pterm();
					state._fsp--;
					if (state.failed) return;dbg.location(104,535);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:535: ( 'else' pterm )?
					int alt120=2;
					try { dbg.enterSubRule(120);
					try { dbg.enterDecision(120, decisionCanBacktrack[120]);

					int LA120_0 = input.LA(1);
					if ( (LA120_0==40) ) {
						int LA120_1 = input.LA(2);
						if ( (synpred179_proverif()) ) {
							alt120=1;
						}
					}
					} finally {dbg.exitDecision(120);}

					switch (alt120) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:536: 'else' pterm
							{
							dbg.location(104,536);
							match(input,40,FOLLOW_40_in_pterm1673); if (state.failed) return;dbg.location(104,543);
							pushFollow(FOLLOW_pterm_in_pterm1675);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(120);}

					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:553: 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm
					{
					dbg.location(104,553);
					match(input,42,FOLLOW_42_in_pterm1681); if (state.failed) return;dbg.location(104,561);
					pushFollow(FOLLOW_ident_in_pterm1683);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(104,567);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:567: ( '(' ( ( pterm ',' )* pterm )? ')' )?
					int alt123=2;
					try { dbg.enterSubRule(123);
					try { dbg.enterDecision(123, decisionCanBacktrack[123]);

					int LA123_0 = input.LA(1);
					if ( (LA123_0==18) ) {
						alt123=1;
					}
					} finally {dbg.exitDecision(123);}

					switch (alt123) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:568: '(' ( ( pterm ',' )* pterm )? ')'
							{
							dbg.location(104,568);
							match(input,18,FOLLOW_18_in_pterm1686); if (state.failed) return;dbg.location(104,572);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:572: ( ( pterm ',' )* pterm )?
							int alt122=2;
							try { dbg.enterSubRule(122);
							try { dbg.enterDecision(122, decisionCanBacktrack[122]);

							int LA122_0 = input.LA(1);
							if ( (LA122_0==ID||LA122_0==18||LA122_0==37||LA122_0==42||(LA122_0 >= 48 && LA122_0 <= 49)||(LA122_0 >= 52 && LA122_0 <= 55)) ) {
								alt122=1;
							}
							} finally {dbg.exitDecision(122);}

							switch (alt122) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:573: ( pterm ',' )* pterm
									{
									dbg.location(104,573);
									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:573: ( pterm ',' )*
									try { dbg.enterSubRule(121);

									loop121:
									while (true) {
										int alt121=2;
										try { dbg.enterDecision(121, decisionCanBacktrack[121]);

										switch ( input.LA(1) ) {
										case ID:
											{
											int LA121_1 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 18:
											{
											int LA121_2 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 37:
											{
											int LA121_3 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 55:
											{
											int LA121_4 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 54:
											{
											int LA121_5 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 49:
											{
											int LA121_6 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 53:
											{
											int LA121_7 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 52:
											{
											int LA121_8 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 48:
											{
											int LA121_9 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										case 42:
											{
											int LA121_10 = input.LA(2);
											if ( (synpred181_proverif()) ) {
												alt121=1;
											}

											}
											break;
										}
										} finally {dbg.exitDecision(121);}

										switch (alt121) {
										case 1 :
											dbg.enterAlt(1);

											// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:574: pterm ','
											{
											dbg.location(104,574);
											pushFollow(FOLLOW_pterm_in_pterm1690);
											pterm();
											state._fsp--;
											if (state.failed) return;dbg.location(104,580);
											match(input,20,FOLLOW_20_in_pterm1692); if (state.failed) return;
											}
											break;

										default :
											break loop121;
										}
									}
									} finally {dbg.exitSubRule(121);}
									dbg.location(104,586);
									pushFollow(FOLLOW_pterm_in_pterm1696);
									pterm();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(122);}
							dbg.location(104,594);
							match(input,19,FOLLOW_19_in_pterm1700); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(123);}
					dbg.location(104,600);
					match(input,25,FOLLOW_25_in_pterm1704); if (state.failed) return;dbg.location(104,604);
					pushFollow(FOLLOW_pterm_in_pterm1706);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(124);}
			dbg.location(104,611);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:611: ( '=' pterm | '<>' pterm | '&&' pterm | '||' pterm )*
			try { dbg.enterSubRule(125);

			loop125:
			while (true) {
				int alt125=5;
				try { dbg.enterDecision(125, decisionCanBacktrack[125]);

				switch ( input.LA(1) ) {
				case 32:
					{
					int LA125_2 = input.LA(2);
					if ( (synpred184_proverif()) ) {
						alt125=1;
					}

					}
					break;
				case 31:
					{
					int LA125_3 = input.LA(2);
					if ( (synpred185_proverif()) ) {
						alt125=2;
					}

					}
					break;
				case 17:
					{
					int LA125_4 = input.LA(2);
					if ( (synpred186_proverif()) ) {
						alt125=3;
					}

					}
					break;
				case 73:
					{
					int LA125_5 = input.LA(2);
					if ( (synpred187_proverif()) ) {
						alt125=4;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(125);}

				switch (alt125) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:612: '=' pterm
					{
					dbg.location(104,612);
					match(input,32,FOLLOW_32_in_pterm1710); if (state.failed) return;dbg.location(104,616);
					pushFollow(FOLLOW_pterm_in_pterm1712);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:624: '<>' pterm
					{
					dbg.location(104,624);
					match(input,31,FOLLOW_31_in_pterm1716); if (state.failed) return;dbg.location(104,629);
					pushFollow(FOLLOW_pterm_in_pterm1718);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:637: '&&' pterm
					{
					dbg.location(104,637);
					match(input,17,FOLLOW_17_in_pterm1722); if (state.failed) return;dbg.location(104,642);
					pushFollow(FOLLOW_pterm_in_pterm1724);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:650: '||' pterm
					{
					dbg.location(104,650);
					match(input,73,FOLLOW_73_in_pterm1728); if (state.failed) return;dbg.location(104,655);
					pushFollow(FOLLOW_pterm_in_pterm1730);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop125;
				}
			}
			} finally {dbg.exitSubRule(125);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(105, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "pterm");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "pterm"



	// $ANTLR start "term"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:108:1: term : ( '(' ( ( term ',' )* term )? ')' | ident '(' ( ( term ',' )* term )? ')' | 'not' '(' term ')' ) ( '=' term | '<>' term | '&&' term | '||' term )* ;
	public final void term() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:2: ( ( '(' ( ( term ',' )* term )? ')' | ident '(' ( ( term ',' )* term )? ')' | 'not' '(' term ')' ) ( '=' term | '<>' term | '&&' term | '||' term )* )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:4: ( '(' ( ( term ',' )* term )? ')' | ident '(' ( ( term ',' )* term )? ')' | 'not' '(' term ')' ) ( '=' term | '<>' term | '&&' term | '||' term )*
			{
			dbg.location(109,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:4: ( '(' ( ( term ',' )* term )? ')' | ident '(' ( ( term ',' )* term )? ')' | 'not' '(' term ')' )
			int alt130=3;
			try { dbg.enterSubRule(130);
			try { dbg.enterDecision(130, decisionCanBacktrack[130]);

			switch ( input.LA(1) ) {
			case 18:
				{
				alt130=1;
				}
				break;
			case ID:
				{
				alt130=2;
				}
				break;
			case 55:
				{
				alt130=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(130);}

			switch (alt130) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:5: '(' ( ( term ',' )* term )? ')'
					{
					dbg.location(109,5);
					match(input,18,FOLLOW_18_in_term1746); if (state.failed) return;dbg.location(109,9);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:9: ( ( term ',' )* term )?
					int alt127=2;
					try { dbg.enterSubRule(127);
					try { dbg.enterDecision(127, decisionCanBacktrack[127]);

					int LA127_0 = input.LA(1);
					if ( (LA127_0==ID||LA127_0==18||LA127_0==55) ) {
						alt127=1;
					}
					} finally {dbg.exitDecision(127);}

					switch (alt127) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:10: ( term ',' )* term
							{
							dbg.location(109,10);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:10: ( term ',' )*
							try { dbg.enterSubRule(126);

							loop126:
							while (true) {
								int alt126=2;
								try { dbg.enterDecision(126, decisionCanBacktrack[126]);

								switch ( input.LA(1) ) {
								case 18:
									{
									int LA126_1 = input.LA(2);
									if ( (synpred188_proverif()) ) {
										alt126=1;
									}

									}
									break;
								case ID:
									{
									int LA126_2 = input.LA(2);
									if ( (synpred188_proverif()) ) {
										alt126=1;
									}

									}
									break;
								case 55:
									{
									int LA126_3 = input.LA(2);
									if ( (synpred188_proverif()) ) {
										alt126=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(126);}

								switch (alt126) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:11: term ','
									{
									dbg.location(109,11);
									pushFollow(FOLLOW_term_in_term1750);
									term();
									state._fsp--;
									if (state.failed) return;dbg.location(109,16);
									match(input,20,FOLLOW_20_in_term1752); if (state.failed) return;
									}
									break;

								default :
									break loop126;
								}
							}
							} finally {dbg.exitSubRule(126);}
							dbg.location(109,22);
							pushFollow(FOLLOW_term_in_term1756);
							term();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(127);}
					dbg.location(109,29);
					match(input,19,FOLLOW_19_in_term1760); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:35: ident '(' ( ( term ',' )* term )? ')'
					{
					dbg.location(109,35);
					pushFollow(FOLLOW_ident_in_term1764);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(109,41);
					match(input,18,FOLLOW_18_in_term1766); if (state.failed) return;dbg.location(109,45);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:45: ( ( term ',' )* term )?
					int alt129=2;
					try { dbg.enterSubRule(129);
					try { dbg.enterDecision(129, decisionCanBacktrack[129]);

					int LA129_0 = input.LA(1);
					if ( (LA129_0==ID||LA129_0==18||LA129_0==55) ) {
						alt129=1;
					}
					} finally {dbg.exitDecision(129);}

					switch (alt129) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:46: ( term ',' )* term
							{
							dbg.location(109,46);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:46: ( term ',' )*
							try { dbg.enterSubRule(128);

							loop128:
							while (true) {
								int alt128=2;
								try { dbg.enterDecision(128, decisionCanBacktrack[128]);

								switch ( input.LA(1) ) {
								case 18:
									{
									int LA128_1 = input.LA(2);
									if ( (synpred191_proverif()) ) {
										alt128=1;
									}

									}
									break;
								case ID:
									{
									int LA128_2 = input.LA(2);
									if ( (synpred191_proverif()) ) {
										alt128=1;
									}

									}
									break;
								case 55:
									{
									int LA128_3 = input.LA(2);
									if ( (synpred191_proverif()) ) {
										alt128=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(128);}

								switch (alt128) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:47: term ','
									{
									dbg.location(109,47);
									pushFollow(FOLLOW_term_in_term1770);
									term();
									state._fsp--;
									if (state.failed) return;dbg.location(109,52);
									match(input,20,FOLLOW_20_in_term1772); if (state.failed) return;
									}
									break;

								default :
									break loop128;
								}
							}
							} finally {dbg.exitSubRule(128);}
							dbg.location(109,58);
							pushFollow(FOLLOW_term_in_term1776);
							term();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(129);}
					dbg.location(109,65);
					match(input,19,FOLLOW_19_in_term1780); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:71: 'not' '(' term ')'
					{
					dbg.location(109,71);
					match(input,55,FOLLOW_55_in_term1784); if (state.failed) return;dbg.location(109,77);
					match(input,18,FOLLOW_18_in_term1786); if (state.failed) return;dbg.location(109,81);
					pushFollow(FOLLOW_term_in_term1788);
					term();
					state._fsp--;
					if (state.failed) return;dbg.location(109,86);
					match(input,19,FOLLOW_19_in_term1790); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(130);}
			dbg.location(109,91);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:91: ( '=' term | '<>' term | '&&' term | '||' term )*
			try { dbg.enterSubRule(131);

			loop131:
			while (true) {
				int alt131=5;
				try { dbg.enterDecision(131, decisionCanBacktrack[131]);

				switch ( input.LA(1) ) {
				case 32:
					{
					int LA131_1 = input.LA(2);
					if ( (synpred194_proverif()) ) {
						alt131=1;
					}

					}
					break;
				case 31:
					{
					int LA131_3 = input.LA(2);
					if ( (synpred195_proverif()) ) {
						alt131=2;
					}

					}
					break;
				case 17:
					{
					int LA131_4 = input.LA(2);
					if ( (synpred196_proverif()) ) {
						alt131=3;
					}

					}
					break;
				case 73:
					{
					int LA131_5 = input.LA(2);
					if ( (synpred197_proverif()) ) {
						alt131=4;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(131);}

				switch (alt131) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:92: '=' term
					{
					dbg.location(109,92);
					match(input,32,FOLLOW_32_in_term1794); if (state.failed) return;dbg.location(109,96);
					pushFollow(FOLLOW_term_in_term1796);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:103: '<>' term
					{
					dbg.location(109,103);
					match(input,31,FOLLOW_31_in_term1800); if (state.failed) return;dbg.location(109,108);
					pushFollow(FOLLOW_term_in_term1802);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:115: '&&' term
					{
					dbg.location(109,115);
					match(input,17,FOLLOW_17_in_term1806); if (state.failed) return;dbg.location(109,120);
					pushFollow(FOLLOW_term_in_term1808);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:127: '||' term
					{
					dbg.location(109,127);
					match(input,73,FOLLOW_73_in_term1812); if (state.failed) return;dbg.location(109,132);
					pushFollow(FOLLOW_term_in_term1814);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop131;
				}
			}
			} finally {dbg.exitSubRule(131);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(110, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"



	// $ANTLR start "pattern"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:130:1: pattern : ( ident | ident ':' typeid | '(' ( ( pattern ',' )* pattern )? ')' | ident '(' ( ( pattern ',' )* pattern )? ')' | '=' pterm );
	public final void pattern() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "pattern");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:131:3: ( ident | ident ':' typeid | '(' ( ( pattern ',' )* pattern )? ')' | ident '(' ( ( pattern ',' )* pattern )? ')' | '=' pterm )
			int alt136=5;
			try { dbg.enterDecision(136, decisionCanBacktrack[136]);

			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case 17:
				case 19:
				case 20:
				case 25:
				case 31:
				case 32:
				case 35:
				case 36:
				case 38:
				case 40:
				case 41:
				case 42:
				case 46:
				case 47:
				case 50:
				case 53:
				case 55:
				case 56:
				case 61:
				case 62:
				case 64:
				case 65:
				case 66:
				case 68:
				case 69:
				case 70:
				case 72:
				case 73:
					{
					alt136=1;
					}
					break;
				case 24:
					{
					alt136=2;
					}
					break;
				case 18:
					{
					alt136=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 136, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 18:
				{
				alt136=3;
				}
				break;
			case 32:
				{
				alt136=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 136, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(136);}

			switch (alt136) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:131:5: ident
					{
					dbg.location(131,5);
					pushFollow(FOLLOW_ident_in_pattern1834);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:132:4: ident ':' typeid
					{
					dbg.location(132,4);
					pushFollow(FOLLOW_ident_in_pattern1839);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(132,10);
					match(input,24,FOLLOW_24_in_pattern1841); if (state.failed) return;dbg.location(132,14);
					pushFollow(FOLLOW_typeid_in_pattern1843);
					typeid();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:133:4: '(' ( ( pattern ',' )* pattern )? ')'
					{
					dbg.location(133,4);
					match(input,18,FOLLOW_18_in_pattern1848); if (state.failed) return;dbg.location(133,8);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:133:8: ( ( pattern ',' )* pattern )?
					int alt133=2;
					try { dbg.enterSubRule(133);
					try { dbg.enterDecision(133, decisionCanBacktrack[133]);

					int LA133_0 = input.LA(1);
					if ( (LA133_0==ID||LA133_0==18||LA133_0==32) ) {
						alt133=1;
					}
					} finally {dbg.exitDecision(133);}

					switch (alt133) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:133:9: ( pattern ',' )* pattern
							{
							dbg.location(133,9);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:133:9: ( pattern ',' )*
							try { dbg.enterSubRule(132);

							loop132:
							while (true) {
								int alt132=2;
								try { dbg.enterDecision(132, decisionCanBacktrack[132]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA132_1 = input.LA(2);
									if ( (synpred200_proverif()) ) {
										alt132=1;
									}

									}
									break;
								case 18:
									{
									int LA132_2 = input.LA(2);
									if ( (synpred200_proverif()) ) {
										alt132=1;
									}

									}
									break;
								case 32:
									{
									int LA132_3 = input.LA(2);
									if ( (synpred200_proverif()) ) {
										alt132=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(132);}

								switch (alt132) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:133:10: pattern ','
									{
									dbg.location(133,10);
									pushFollow(FOLLOW_pattern_in_pattern1852);
									pattern();
									state._fsp--;
									if (state.failed) return;dbg.location(133,18);
									match(input,20,FOLLOW_20_in_pattern1854); if (state.failed) return;
									}
									break;

								default :
									break loop132;
								}
							}
							} finally {dbg.exitSubRule(132);}
							dbg.location(133,24);
							pushFollow(FOLLOW_pattern_in_pattern1858);
							pattern();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(133);}
					dbg.location(133,34);
					match(input,19,FOLLOW_19_in_pattern1862); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:134:4: ident '(' ( ( pattern ',' )* pattern )? ')'
					{
					dbg.location(134,4);
					pushFollow(FOLLOW_ident_in_pattern1867);
					ident();
					state._fsp--;
					if (state.failed) return;dbg.location(134,10);
					match(input,18,FOLLOW_18_in_pattern1869); if (state.failed) return;dbg.location(134,14);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:134:14: ( ( pattern ',' )* pattern )?
					int alt135=2;
					try { dbg.enterSubRule(135);
					try { dbg.enterDecision(135, decisionCanBacktrack[135]);

					int LA135_0 = input.LA(1);
					if ( (LA135_0==ID||LA135_0==18||LA135_0==32) ) {
						alt135=1;
					}
					} finally {dbg.exitDecision(135);}

					switch (alt135) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:134:15: ( pattern ',' )* pattern
							{
							dbg.location(134,15);
							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:134:15: ( pattern ',' )*
							try { dbg.enterSubRule(134);

							loop134:
							while (true) {
								int alt134=2;
								try { dbg.enterDecision(134, decisionCanBacktrack[134]);

								switch ( input.LA(1) ) {
								case ID:
									{
									int LA134_1 = input.LA(2);
									if ( (synpred203_proverif()) ) {
										alt134=1;
									}

									}
									break;
								case 18:
									{
									int LA134_2 = input.LA(2);
									if ( (synpred203_proverif()) ) {
										alt134=1;
									}

									}
									break;
								case 32:
									{
									int LA134_3 = input.LA(2);
									if ( (synpred203_proverif()) ) {
										alt134=1;
									}

									}
									break;
								}
								} finally {dbg.exitDecision(134);}

								switch (alt134) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:134:16: pattern ','
									{
									dbg.location(134,16);
									pushFollow(FOLLOW_pattern_in_pattern1873);
									pattern();
									state._fsp--;
									if (state.failed) return;dbg.location(134,24);
									match(input,20,FOLLOW_20_in_pattern1875); if (state.failed) return;
									}
									break;

								default :
									break loop134;
								}
							}
							} finally {dbg.exitSubRule(134);}
							dbg.location(134,30);
							pushFollow(FOLLOW_pattern_in_pattern1879);
							pattern();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(135);}
					dbg.location(134,40);
					match(input,19,FOLLOW_19_in_pattern1883); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:135:4: '=' pterm
					{
					dbg.location(135,4);
					match(input,32,FOLLOW_32_in_pattern1888); if (state.failed) return;dbg.location(135,8);
					pushFollow(FOLLOW_pterm_in_pattern1890);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(136, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "pattern");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "pattern"



	// $ANTLR start "mayfailterm"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:138:1: mayfailterm : ( term | 'fail' );
	public final void mayfailterm() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mayfailterm");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:139:2: ( term | 'fail' )
			int alt137=2;
			try { dbg.enterDecision(137, decisionCanBacktrack[137]);

			int LA137_0 = input.LA(1);
			if ( (LA137_0==ID||LA137_0==18||LA137_0==55) ) {
				alt137=1;
			}
			else if ( (LA137_0==43) ) {
				alt137=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 137, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(137);}

			switch (alt137) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:139:4: term
					{
					dbg.location(139,4);
					pushFollow(FOLLOW_term_in_mayfailterm1901);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:140:4: 'fail'
					{
					dbg.location(140,4);
					match(input,43,FOLLOW_43_in_mayfailterm1906); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(141, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mayfailterm");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mayfailterm"



	// $ANTLR start "typedecl"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:143:1: typedecl : ident ':' typeid ( ',' typedecl )? ;
	public final void typedecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "typedecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(143, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:144:2: ( ident ':' typeid ( ',' typedecl )? )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:144:4: ident ':' typeid ( ',' typedecl )?
			{
			dbg.location(144,4);
			pushFollow(FOLLOW_ident_in_typedecl1917);
			ident();
			state._fsp--;
			if (state.failed) return;dbg.location(144,10);
			match(input,24,FOLLOW_24_in_typedecl1919); if (state.failed) return;dbg.location(144,14);
			pushFollow(FOLLOW_typeid_in_typedecl1921);
			typeid();
			state._fsp--;
			if (state.failed) return;dbg.location(144,21);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:144:21: ( ',' typedecl )?
			int alt138=2;
			try { dbg.enterSubRule(138);
			try { dbg.enterDecision(138, decisionCanBacktrack[138]);

			int LA138_0 = input.LA(1);
			if ( (LA138_0==20) ) {
				alt138=1;
			}
			} finally {dbg.exitDecision(138);}

			switch (alt138) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:144:22: ',' typedecl
					{
					dbg.location(144,22);
					match(input,20,FOLLOW_20_in_typedecl1924); if (state.failed) return;dbg.location(144,26);
					pushFollow(FOLLOW_typedecl_in_typedecl1926);
					typedecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(138);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(145, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typedecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "typedecl"



	// $ANTLR start "failtypedecl"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:147:1: failtypedecl : ident ':' typeid ( 'or' 'fail' )? ( ',' typedecl )? ;
	public final void failtypedecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "failtypedecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(147, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:148:2: ( ident ':' typeid ( 'or' 'fail' )? ( ',' typedecl )? )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:148:4: ident ':' typeid ( 'or' 'fail' )? ( ',' typedecl )?
			{
			dbg.location(148,4);
			pushFollow(FOLLOW_ident_in_failtypedecl1939);
			ident();
			state._fsp--;
			if (state.failed) return;dbg.location(148,10);
			match(input,24,FOLLOW_24_in_failtypedecl1941); if (state.failed) return;dbg.location(148,14);
			pushFollow(FOLLOW_typeid_in_failtypedecl1943);
			typeid();
			state._fsp--;
			if (state.failed) return;dbg.location(148,21);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:148:21: ( 'or' 'fail' )?
			int alt139=2;
			try { dbg.enterSubRule(139);
			try { dbg.enterDecision(139, decisionCanBacktrack[139]);

			int LA139_0 = input.LA(1);
			if ( (LA139_0==57) ) {
				alt139=1;
			}
			} finally {dbg.exitDecision(139);}

			switch (alt139) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:148:22: 'or' 'fail'
					{
					dbg.location(148,22);
					match(input,57,FOLLOW_57_in_failtypedecl1946); if (state.failed) return;dbg.location(148,27);
					match(input,43,FOLLOW_43_in_failtypedecl1948); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(139);}
			dbg.location(148,36);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:148:36: ( ',' typedecl )?
			int alt140=2;
			try { dbg.enterSubRule(140);
			try { dbg.enterDecision(140, decisionCanBacktrack[140]);

			int LA140_0 = input.LA(1);
			if ( (LA140_0==20) ) {
				alt140=1;
			}
			} finally {dbg.exitDecision(140);}

			switch (alt140) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:148:37: ',' typedecl
					{
					dbg.location(148,37);
					match(input,20,FOLLOW_20_in_failtypedecl1953); if (state.failed) return;dbg.location(148,41);
					pushFollow(FOLLOW_typedecl_in_failtypedecl1955);
					typedecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(140);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(149, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "failtypedecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "failtypedecl"



	// $ANTLR start "proverifOptions"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:151:1: proverifOptions : ( ( ident ',' )* ident )? ;
	public final void proverifOptions() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "proverifOptions");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(151, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:152:2: ( ( ( ident ',' )* ident )? )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:152:4: ( ( ident ',' )* ident )?
			{
			dbg.location(152,4);
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:152:4: ( ( ident ',' )* ident )?
			int alt142=2;
			try { dbg.enterSubRule(142);
			try { dbg.enterDecision(142, decisionCanBacktrack[142]);

			int LA142_0 = input.LA(1);
			if ( (LA142_0==ID) ) {
				alt142=1;
			}
			} finally {dbg.exitDecision(142);}

			switch (alt142) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:152:5: ( ident ',' )* ident
					{
					dbg.location(152,5);
					// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:152:5: ( ident ',' )*
					try { dbg.enterSubRule(141);

					loop141:
					while (true) {
						int alt141=2;
						try { dbg.enterDecision(141, decisionCanBacktrack[141]);

						int LA141_0 = input.LA(1);
						if ( (LA141_0==ID) ) {
							int LA141_1 = input.LA(2);
							if ( (LA141_1==20) ) {
								alt141=1;
							}

						}

						} finally {dbg.exitDecision(141);}

						switch (alt141) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:152:6: ident ','
							{
							dbg.location(152,6);
							pushFollow(FOLLOW_ident_in_proverifOptions1970);
							ident();
							state._fsp--;
							if (state.failed) return;dbg.location(152,12);
							match(input,20,FOLLOW_20_in_proverifOptions1972); if (state.failed) return;
							}
							break;

						default :
							break loop141;
						}
					}
					} finally {dbg.exitSubRule(141);}
					dbg.location(152,18);
					pushFollow(FOLLOW_ident_in_proverifOptions1976);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(142);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(153, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "proverifOptions");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "proverifOptions"



	// $ANTLR start "ident"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:155:1: ident : ID ;
	public final void ident() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ident");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:156:2: ( ID )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:156:4: ID
			{
			dbg.location(156,4);
			match(input,ID,FOLLOW_ID_in_ident1990); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(157, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ident");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ident"



	// $ANTLR start "id"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:159:1: id : ID ;
	public final void id() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(159, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:160:2: ( ID )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:160:4: ID
			{
			dbg.location(160,4);
			match(input,ID,FOLLOW_ID_in_id2001); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(161, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "id"



	// $ANTLR start "integer"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:163:1: integer : INT ;
	public final void integer() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "integer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(163, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:164:2: ( INT )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:164:4: INT
			{
			dbg.location(164,4);
			match(input,INT,FOLLOW_INT_in_integer2012); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(165, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "integer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "integer"



	// $ANTLR start "typeid"
	// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:167:1: typeid : ID ;
	public final void typeid() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "typeid");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(167, 0);

		try {
			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:168:2: ( ID )
			dbg.enterAlt(1);

			// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:168:4: ID
			{
			dbg.location(168,4);
			match(input,ID,FOLLOW_ID_in_typeid2023); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(169, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typeid");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "typeid"

	// $ANTLR start synpred11_proverif
	public final void synpred11_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:4: ( 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:4: 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions
		{
		dbg.location(17,4);
		match(input,47,FOLLOW_47_in_synpred11_proverif110); if (state.failed) return;dbg.location(17,10);
		pushFollow(FOLLOW_ident_in_synpred11_proverif112);
		ident();
		state._fsp--;
		if (state.failed) return;dbg.location(17,16);
		match(input,18,FOLLOW_18_in_synpred11_proverif114); if (state.failed) return;dbg.location(17,20);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:20: ( ( typeid ',' )* typeid )?
		int alt148=2;
		try { dbg.enterSubRule(148);
		try { dbg.enterDecision(148, decisionCanBacktrack[148]);

		int LA148_0 = input.LA(1);
		if ( (LA148_0==ID) ) {
			alt148=1;
		}
		} finally {dbg.exitDecision(148);}

		switch (alt148) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:21: ( typeid ',' )* typeid
				{
				dbg.location(17,21);
				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:21: ( typeid ',' )*
				try { dbg.enterSubRule(147);

				loop147:
				while (true) {
					int alt147=2;
					try { dbg.enterDecision(147, decisionCanBacktrack[147]);

					int LA147_0 = input.LA(1);
					if ( (LA147_0==ID) ) {
						int LA147_1 = input.LA(2);
						if ( (LA147_1==20) ) {
							alt147=1;
						}

					}

					} finally {dbg.exitDecision(147);}

					switch (alt147) {
					case 1 :
						dbg.enterAlt(1);

						// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:17:22: typeid ','
						{
						dbg.location(17,22);
						pushFollow(FOLLOW_typeid_in_synpred11_proverif118);
						typeid();
						state._fsp--;
						if (state.failed) return;dbg.location(17,29);
						match(input,20,FOLLOW_20_in_synpred11_proverif120); if (state.failed) return;
						}
						break;

					default :
						break loop147;
					}
				}
				} finally {dbg.exitSubRule(147);}
				dbg.location(17,35);
				pushFollow(FOLLOW_typeid_in_synpred11_proverif124);
				typeid();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(148);}
		dbg.location(17,44);
		match(input,19,FOLLOW_19_in_synpred11_proverif128); if (state.failed) return;dbg.location(17,48);
		match(input,24,FOLLOW_24_in_synpred11_proverif130); if (state.failed) return;dbg.location(17,52);
		pushFollow(FOLLOW_typeid_in_synpred11_proverif132);
		typeid();
		state._fsp--;
		if (state.failed) return;dbg.location(17,59);
		pushFollow(FOLLOW_proverifOptions_in_synpred11_proverif134);
		proverifOptions();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_proverif

	// $ANTLR start synpred15_proverif
	public final void synpred15_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:4: ( 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:4: 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions
		{
		dbg.location(19,4);
		match(input,47,FOLLOW_47_in_synpred15_proverif148); if (state.failed) return;dbg.location(19,10);
		pushFollow(FOLLOW_ident_in_synpred15_proverif150);
		ident();
		state._fsp--;
		if (state.failed) return;dbg.location(19,16);
		match(input,18,FOLLOW_18_in_synpred15_proverif152); if (state.failed) return;dbg.location(19,20);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:20: ( ( typeid ',' )* typeid )?
		int alt151=2;
		try { dbg.enterSubRule(151);
		try { dbg.enterDecision(151, decisionCanBacktrack[151]);

		int LA151_0 = input.LA(1);
		if ( (LA151_0==ID) ) {
			alt151=1;
		}
		} finally {dbg.exitDecision(151);}

		switch (alt151) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:21: ( typeid ',' )* typeid
				{
				dbg.location(19,21);
				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:21: ( typeid ',' )*
				try { dbg.enterSubRule(150);

				loop150:
				while (true) {
					int alt150=2;
					try { dbg.enterDecision(150, decisionCanBacktrack[150]);

					int LA150_0 = input.LA(1);
					if ( (LA150_0==ID) ) {
						int LA150_1 = input.LA(2);
						if ( (LA150_1==20) ) {
							alt150=1;
						}

					}

					} finally {dbg.exitDecision(150);}

					switch (alt150) {
					case 1 :
						dbg.enterAlt(1);

						// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:19:22: typeid ','
						{
						dbg.location(19,22);
						pushFollow(FOLLOW_typeid_in_synpred15_proverif156);
						typeid();
						state._fsp--;
						if (state.failed) return;dbg.location(19,29);
						match(input,20,FOLLOW_20_in_synpred15_proverif158); if (state.failed) return;
						}
						break;

					default :
						break loop150;
					}
				}
				} finally {dbg.exitSubRule(150);}
				dbg.location(19,35);
				pushFollow(FOLLOW_typeid_in_synpred15_proverif162);
				typeid();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(151);}
		dbg.location(19,44);
		match(input,19,FOLLOW_19_in_synpred15_proverif166); if (state.failed) return;dbg.location(19,48);
		match(input,24,FOLLOW_24_in_synpred15_proverif168); if (state.failed) return;dbg.location(19,52);
		pushFollow(FOLLOW_typeid_in_synpred15_proverif170);
		typeid();
		state._fsp--;
		if (state.failed) return;dbg.location(19,59);
		match(input,65,FOLLOW_65_in_synpred15_proverif172); if (state.failed) return;dbg.location(19,67);
		pushFollow(FOLLOW_reducprime_in_synpred15_proverif174);
		reducprime();
		state._fsp--;
		if (state.failed) return;dbg.location(19,78);
		pushFollow(FOLLOW_proverifOptions_in_synpred15_proverif176);
		proverifOptions();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_proverif

	// $ANTLR start synpred40_proverif
	public final void synpred40_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:45: ( mayfailterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:36:45: mayfailterm ','
		{
		dbg.location(36,45);
		pushFollow(FOLLOW_mayfailterm_in_synpred40_proverif401);
		mayfailterm();
		state._fsp--;
		if (state.failed) return;dbg.location(36,57);
		match(input,20,FOLLOW_20_in_synpred40_proverif403); if (state.failed) return;
		}

	}
	// $ANTLR end synpred40_proverif

	// $ANTLR start synpred51_proverif
	public final void synpred51_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:5: ( ident )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:5: ident
		{
		dbg.location(58,5);
		pushFollow(FOLLOW_ident_in_synpred51_proverif552);
		ident();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred51_proverif

	// $ANTLR start synpred52_proverif
	public final void synpred52_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:25: ( gterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:25: gterm ','
		{
		dbg.location(58,25);
		pushFollow(FOLLOW_gterm_in_synpred52_proverif562);
		gterm();
		state._fsp--;
		if (state.failed) return;dbg.location(58,31);
		match(input,20,FOLLOW_20_in_synpred52_proverif564); if (state.failed) return;
		}

	}
	// $ANTLR end synpred52_proverif

	// $ANTLR start synpred55_proverif
	public final void synpred55_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:13: ( ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' integer )? )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:13: ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' integer )?
		{
		dbg.location(58,13);
		pushFollow(FOLLOW_ident_in_synpred55_proverif556);
		ident();
		state._fsp--;
		if (state.failed) return;dbg.location(58,19);
		match(input,18,FOLLOW_18_in_synpred55_proverif558); if (state.failed) return;dbg.location(58,23);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:23: ( ( gterm ',' )* gterm )?
		int alt178=2;
		try { dbg.enterSubRule(178);
		try { dbg.enterDecision(178, decisionCanBacktrack[178]);

		int LA178_0 = input.LA(1);
		if ( (LA178_0==ID||LA178_0==18||LA178_0==42||LA178_0==51||(LA178_0 >= 53 && LA178_0 <= 54)) ) {
			alt178=1;
		}
		} finally {dbg.exitDecision(178);}

		switch (alt178) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:24: ( gterm ',' )* gterm
				{
				dbg.location(58,24);
				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:24: ( gterm ',' )*
				try { dbg.enterSubRule(177);

				loop177:
				while (true) {
					int alt177=2;
					try { dbg.enterDecision(177, decisionCanBacktrack[177]);

					switch ( input.LA(1) ) {
					case ID:
						{
						int LA177_1 = input.LA(2);
						if ( (synpred52_proverif()) ) {
							alt177=1;
						}

						}
						break;
					case 42:
						{
						int LA177_2 = input.LA(2);
						if ( (synpred52_proverif()) ) {
							alt177=1;
						}

						}
						break;
					case 51:
						{
						int LA177_3 = input.LA(2);
						if ( (synpred52_proverif()) ) {
							alt177=1;
						}

						}
						break;
					case 18:
						{
						int LA177_4 = input.LA(2);
						if ( (synpred52_proverif()) ) {
							alt177=1;
						}

						}
						break;
					case 54:
						{
						int LA177_5 = input.LA(2);
						if ( (synpred52_proverif()) ) {
							alt177=1;
						}

						}
						break;
					case 53:
						{
						int LA177_6 = input.LA(2);
						if ( (synpred52_proverif()) ) {
							alt177=1;
						}

						}
						break;
					}
					} finally {dbg.exitDecision(177);}

					switch (alt177) {
					case 1 :
						dbg.enterAlt(1);

						// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:25: gterm ','
						{
						dbg.location(58,25);
						pushFollow(FOLLOW_gterm_in_synpred55_proverif562);
						gterm();
						state._fsp--;
						if (state.failed) return;dbg.location(58,31);
						match(input,20,FOLLOW_20_in_synpred55_proverif564); if (state.failed) return;
						}
						break;

					default :
						break loop177;
					}
				}
				} finally {dbg.exitSubRule(177);}
				dbg.location(58,37);
				pushFollow(FOLLOW_gterm_in_synpred55_proverif568);
				gterm();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(178);}
		dbg.location(58,45);
		match(input,19,FOLLOW_19_in_synpred55_proverif572); if (state.failed) return;dbg.location(58,49);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:49: ( 'phase' integer )?
		int alt179=2;
		try { dbg.enterSubRule(179);
		try { dbg.enterDecision(179, decisionCanBacktrack[179]);

		int LA179_0 = input.LA(1);
		if ( (LA179_0==60) ) {
			alt179=1;
		}
		} finally {dbg.exitDecision(179);}

		switch (alt179) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:50: 'phase' integer
				{
				dbg.location(58,50);
				match(input,60,FOLLOW_60_in_synpred55_proverif575); if (state.failed) return;dbg.location(58,58);
				pushFollow(FOLLOW_integer_in_synpred55_proverif577);
				integer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(179);}

		}

	}
	// $ANTLR end synpred55_proverif

	// $ANTLR start synpred56_proverif
	public final void synpred56_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:84: ( gterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:84: gterm ','
		{
		dbg.location(58,84);
		pushFollow(FOLLOW_gterm_in_synpred56_proverif589);
		gterm();
		state._fsp--;
		if (state.failed) return;dbg.location(58,90);
		match(input,20,FOLLOW_20_in_synpred56_proverif591); if (state.failed) return;
		}

	}
	// $ANTLR end synpred56_proverif

	// $ANTLR start synpred57_proverif
	public final void synpred57_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:83: ( ( gterm ',' )* gterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:83: ( gterm ',' )* gterm
		{
		dbg.location(58,83);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:83: ( gterm ',' )*
		try { dbg.enterSubRule(180);

		loop180:
		while (true) {
			int alt180=2;
			try { dbg.enterDecision(180, decisionCanBacktrack[180]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA180_1 = input.LA(2);
				if ( (synpred56_proverif()) ) {
					alt180=1;
				}

				}
				break;
			case 42:
				{
				int LA180_2 = input.LA(2);
				if ( (synpred56_proverif()) ) {
					alt180=1;
				}

				}
				break;
			case 51:
				{
				int LA180_3 = input.LA(2);
				if ( (synpred56_proverif()) ) {
					alt180=1;
				}

				}
				break;
			case 18:
				{
				int LA180_4 = input.LA(2);
				if ( (synpred56_proverif()) ) {
					alt180=1;
				}

				}
				break;
			case 54:
				{
				int LA180_5 = input.LA(2);
				if ( (synpred56_proverif()) ) {
					alt180=1;
				}

				}
				break;
			case 53:
				{
				int LA180_6 = input.LA(2);
				if ( (synpred56_proverif()) ) {
					alt180=1;
				}

				}
				break;
			}
			} finally {dbg.exitDecision(180);}

			switch (alt180) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:84: gterm ','
				{
				dbg.location(58,84);
				pushFollow(FOLLOW_gterm_in_synpred57_proverif589);
				gterm();
				state._fsp--;
				if (state.failed) return;dbg.location(58,90);
				match(input,20,FOLLOW_20_in_synpred57_proverif591); if (state.failed) return;
				}
				break;

			default :
				break loop180;
			}
		}
		} finally {dbg.exitSubRule(180);}
		dbg.location(58,96);
		pushFollow(FOLLOW_gterm_in_synpred57_proverif595);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred57_proverif

	// $ANTLR start synpred59_proverif
	public final void synpred59_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:134: ( gterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:134: gterm ','
		{
		dbg.location(58,134);
		pushFollow(FOLLOW_gterm_in_synpred59_proverif611);
		gterm();
		state._fsp--;
		if (state.failed) return;dbg.location(58,140);
		match(input,20,FOLLOW_20_in_synpred59_proverif613); if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_proverif

	// $ANTLR start synpred60_proverif
	public final void synpred60_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:133: ( ( gterm ',' )* gterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:133: ( gterm ',' )* gterm
		{
		dbg.location(58,133);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:133: ( gterm ',' )*
		try { dbg.enterSubRule(183);

		loop183:
		while (true) {
			int alt183=2;
			try { dbg.enterDecision(183, decisionCanBacktrack[183]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA183_1 = input.LA(2);
				if ( (synpred59_proverif()) ) {
					alt183=1;
				}

				}
				break;
			case 42:
				{
				int LA183_2 = input.LA(2);
				if ( (synpred59_proverif()) ) {
					alt183=1;
				}

				}
				break;
			case 51:
				{
				int LA183_3 = input.LA(2);
				if ( (synpred59_proverif()) ) {
					alt183=1;
				}

				}
				break;
			case 18:
				{
				int LA183_4 = input.LA(2);
				if ( (synpred59_proverif()) ) {
					alt183=1;
				}

				}
				break;
			case 54:
				{
				int LA183_5 = input.LA(2);
				if ( (synpred59_proverif()) ) {
					alt183=1;
				}

				}
				break;
			case 53:
				{
				int LA183_6 = input.LA(2);
				if ( (synpred59_proverif()) ) {
					alt183=1;
				}

				}
				break;
			}
			} finally {dbg.exitDecision(183);}

			switch (alt183) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:134: gterm ','
				{
				dbg.location(58,134);
				pushFollow(FOLLOW_gterm_in_synpred60_proverif611);
				gterm();
				state._fsp--;
				if (state.failed) return;dbg.location(58,140);
				match(input,20,FOLLOW_20_in_synpred60_proverif613); if (state.failed) return;
				}
				break;

			default :
				break loop183;
			}
		}
		} finally {dbg.exitSubRule(183);}
		dbg.location(58,146);
		pushFollow(FOLLOW_gterm_in_synpred60_proverif617);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred60_proverif

	// $ANTLR start synpred62_proverif
	public final void synpred62_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:172: ( gterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:172: gterm ','
		{
		dbg.location(58,172);
		pushFollow(FOLLOW_gterm_in_synpred62_proverif631);
		gterm();
		state._fsp--;
		if (state.failed) return;dbg.location(58,178);
		match(input,20,FOLLOW_20_in_synpred62_proverif633); if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_proverif

	// $ANTLR start synpred63_proverif
	public final void synpred63_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:171: ( ( gterm ',' )* gterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:171: ( gterm ',' )* gterm
		{
		dbg.location(58,171);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:171: ( gterm ',' )*
		try { dbg.enterSubRule(186);

		loop186:
		while (true) {
			int alt186=2;
			try { dbg.enterDecision(186, decisionCanBacktrack[186]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA186_1 = input.LA(2);
				if ( (synpred62_proverif()) ) {
					alt186=1;
				}

				}
				break;
			case 42:
				{
				int LA186_2 = input.LA(2);
				if ( (synpred62_proverif()) ) {
					alt186=1;
				}

				}
				break;
			case 51:
				{
				int LA186_3 = input.LA(2);
				if ( (synpred62_proverif()) ) {
					alt186=1;
				}

				}
				break;
			case 18:
				{
				int LA186_4 = input.LA(2);
				if ( (synpred62_proverif()) ) {
					alt186=1;
				}

				}
				break;
			case 54:
				{
				int LA186_5 = input.LA(2);
				if ( (synpred62_proverif()) ) {
					alt186=1;
				}

				}
				break;
			case 53:
				{
				int LA186_6 = input.LA(2);
				if ( (synpred62_proverif()) ) {
					alt186=1;
				}

				}
				break;
			}
			} finally {dbg.exitDecision(186);}

			switch (alt186) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:172: gterm ','
				{
				dbg.location(58,172);
				pushFollow(FOLLOW_gterm_in_synpred63_proverif631);
				gterm();
				state._fsp--;
				if (state.failed) return;dbg.location(58,178);
				match(input,20,FOLLOW_20_in_synpred63_proverif633); if (state.failed) return;
				}
				break;

			default :
				break loop186;
			}
		}
		} finally {dbg.exitSubRule(186);}
		dbg.location(58,184);
		pushFollow(FOLLOW_gterm_in_synpred63_proverif637);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred63_proverif

	// $ANTLR start synpred68_proverif
	public final void synpred68_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:277: ( '=' gterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:277: '=' gterm
		{
		dbg.location(58,277);
		match(input,32,FOLLOW_32_in_synpred68_proverif680); if (state.failed) return;dbg.location(58,281);
		pushFollow(FOLLOW_gterm_in_synpred68_proverif682);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred68_proverif

	// $ANTLR start synpred69_proverif
	public final void synpred69_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:289: ( '<>' gterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:289: '<>' gterm
		{
		dbg.location(58,289);
		match(input,31,FOLLOW_31_in_synpred69_proverif686); if (state.failed) return;dbg.location(58,294);
		pushFollow(FOLLOW_gterm_in_synpred69_proverif688);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred69_proverif

	// $ANTLR start synpred70_proverif
	public final void synpred70_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:302: ( '||' gterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:302: '||' gterm
		{
		dbg.location(58,302);
		match(input,73,FOLLOW_73_in_synpred70_proverif692); if (state.failed) return;dbg.location(58,307);
		pushFollow(FOLLOW_gterm_in_synpred70_proverif694);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_proverif

	// $ANTLR start synpred71_proverif
	public final void synpred71_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:315: ( '&&' gterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:315: '&&' gterm
		{
		dbg.location(58,315);
		match(input,17,FOLLOW_17_in_synpred71_proverif698); if (state.failed) return;dbg.location(58,320);
		pushFollow(FOLLOW_gterm_in_synpred71_proverif700);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_proverif

	// $ANTLR start synpred72_proverif
	public final void synpred72_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:328: ( '==>' gterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:58:328: '==>' gterm
		{
		dbg.location(58,328);
		match(input,33,FOLLOW_33_in_synpred72_proverif704); if (state.failed) return;dbg.location(58,334);
		pushFollow(FOLLOW_gterm_in_synpred72_proverif706);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred72_proverif

	// $ANTLR start synpred77_proverif
	public final void synpred77_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:17: ( gformat ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:68:17: gformat ','
		{
		dbg.location(68,17);
		pushFollow(FOLLOW_gformat_in_synpred77_proverif785);
		gformat();
		state._fsp--;
		if (state.failed) return;dbg.location(68,25);
		match(input,20,FOLLOW_20_in_synpred77_proverif787); if (state.failed) return;
		}

	}
	// $ANTLR end synpred77_proverif

	// $ANTLR start synpred82_proverif
	public final void synpred82_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:72:4: ( ident )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:72:4: ident
		{
		dbg.location(72,4);
		pushFollow(FOLLOW_ident_in_synpred82_proverif822);
		ident();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred82_proverif

	// $ANTLR start synpred83_proverif
	public final void synpred83_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:16: ( gformat ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:16: gformat ','
		{
		dbg.location(73,16);
		pushFollow(FOLLOW_gformat_in_synpred83_proverif833);
		gformat();
		state._fsp--;
		if (state.failed) return;dbg.location(73,24);
		match(input,20,FOLLOW_20_in_synpred83_proverif835); if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_proverif

	// $ANTLR start synpred85_proverif
	public final void synpred85_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:4: ( ident '(' ( ( gformat ',' )* gformat )? ')' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:4: ident '(' ( ( gformat ',' )* gformat )? ')'
		{
		dbg.location(73,4);
		pushFollow(FOLLOW_ident_in_synpred85_proverif827);
		ident();
		state._fsp--;
		if (state.failed) return;dbg.location(73,10);
		match(input,18,FOLLOW_18_in_synpred85_proverif829); if (state.failed) return;dbg.location(73,14);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:14: ( ( gformat ',' )* gformat )?
		int alt199=2;
		try { dbg.enterSubRule(199);
		try { dbg.enterDecision(199, decisionCanBacktrack[199]);

		int LA199_0 = input.LA(1);
		if ( (LA199_0==ID||LA199_0==18||(LA199_0 >= 53 && LA199_0 <= 55)) ) {
			alt199=1;
		}
		} finally {dbg.exitDecision(199);}

		switch (alt199) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:15: ( gformat ',' )* gformat
				{
				dbg.location(73,15);
				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:15: ( gformat ',' )*
				try { dbg.enterSubRule(198);

				loop198:
				while (true) {
					int alt198=2;
					try { dbg.enterDecision(198, decisionCanBacktrack[198]);

					switch ( input.LA(1) ) {
					case ID:
						{
						int LA198_1 = input.LA(2);
						if ( (synpred83_proverif()) ) {
							alt198=1;
						}

						}
						break;
					case 55:
						{
						int LA198_2 = input.LA(2);
						if ( (synpred83_proverif()) ) {
							alt198=1;
						}

						}
						break;
					case 18:
						{
						int LA198_3 = input.LA(2);
						if ( (synpred83_proverif()) ) {
							alt198=1;
						}

						}
						break;
					case 54:
						{
						int LA198_4 = input.LA(2);
						if ( (synpred83_proverif()) ) {
							alt198=1;
						}

						}
						break;
					case 53:
						{
						int LA198_5 = input.LA(2);
						if ( (synpred83_proverif()) ) {
							alt198=1;
						}

						}
						break;
					}
					} finally {dbg.exitDecision(198);}

					switch (alt198) {
					case 1 :
						dbg.enterAlt(1);

						// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:73:16: gformat ','
						{
						dbg.location(73,16);
						pushFollow(FOLLOW_gformat_in_synpred85_proverif833);
						gformat();
						state._fsp--;
						if (state.failed) return;dbg.location(73,24);
						match(input,20,FOLLOW_20_in_synpred85_proverif835); if (state.failed) return;
						}
						break;

					default :
						break loop198;
					}
				}
				} finally {dbg.exitSubRule(198);}
				dbg.location(73,30);
				pushFollow(FOLLOW_gformat_in_synpred85_proverif839);
				gformat();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(199);}
		dbg.location(73,40);
		match(input,19,FOLLOW_19_in_synpred85_proverif843); if (state.failed) return;
		}

	}
	// $ANTLR end synpred85_proverif

	// $ANTLR start synpred86_proverif
	public final void synpred86_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:74:16: ( gformat ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:74:16: gformat ','
		{
		dbg.location(74,16);
		pushFollow(FOLLOW_gformat_in_synpred86_proverif854);
		gformat();
		state._fsp--;
		if (state.failed) return;dbg.location(74,24);
		match(input,20,FOLLOW_20_in_synpred86_proverif856); if (state.failed) return;
		}

	}
	// $ANTLR end synpred86_proverif

	// $ANTLR start synpred89_proverif
	public final void synpred89_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:10: ( gformat ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:10: gformat ','
		{
		dbg.location(75,10);
		pushFollow(FOLLOW_gformat_in_synpred89_proverif873);
		gformat();
		state._fsp--;
		if (state.failed) return;dbg.location(75,18);
		match(input,20,FOLLOW_20_in_synpred89_proverif875); if (state.failed) return;
		}

	}
	// $ANTLR end synpred89_proverif

	// $ANTLR start synpred90_proverif
	public final void synpred90_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:9: ( ( gformat ',' )* gformat )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:9: ( gformat ',' )* gformat
		{
		dbg.location(75,9);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:9: ( gformat ',' )*
		try { dbg.enterSubRule(203);

		loop203:
		while (true) {
			int alt203=2;
			try { dbg.enterDecision(203, decisionCanBacktrack[203]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA203_1 = input.LA(2);
				if ( (synpred89_proverif()) ) {
					alt203=1;
				}

				}
				break;
			case 55:
				{
				int LA203_2 = input.LA(2);
				if ( (synpred89_proverif()) ) {
					alt203=1;
				}

				}
				break;
			case 18:
				{
				int LA203_3 = input.LA(2);
				if ( (synpred89_proverif()) ) {
					alt203=1;
				}

				}
				break;
			case 54:
				{
				int LA203_4 = input.LA(2);
				if ( (synpred89_proverif()) ) {
					alt203=1;
				}

				}
				break;
			case 53:
				{
				int LA203_5 = input.LA(2);
				if ( (synpred89_proverif()) ) {
					alt203=1;
				}

				}
				break;
			}
			} finally {dbg.exitDecision(203);}

			switch (alt203) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:75:10: gformat ','
				{
				dbg.location(75,10);
				pushFollow(FOLLOW_gformat_in_synpred90_proverif873);
				gformat();
				state._fsp--;
				if (state.failed) return;dbg.location(75,18);
				match(input,20,FOLLOW_20_in_synpred90_proverif875); if (state.failed) return;
				}
				break;

			default :
				break loop203;
			}
		}
		} finally {dbg.exitSubRule(203);}
		dbg.location(75,24);
		pushFollow(FOLLOW_gformat_in_synpred90_proverif879);
		gformat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred90_proverif

	// $ANTLR start synpred100_proverif
	public final void synpred100_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:92:4: ( term )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:92:4: term
		{
		dbg.location(92,4);
		pushFollow(FOLLOW_term_in_synpred100_proverif1009);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred100_proverif

	// $ANTLR start synpred101_proverif
	public final void synpred101_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:93:4: ( term '->' term )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:93:4: term '->' term
		{
		dbg.location(93,4);
		pushFollow(FOLLOW_term_in_synpred101_proverif1014);
		term();
		state._fsp--;
		if (state.failed) return;dbg.location(93,9);
		match(input,21,FOLLOW_21_in_synpred101_proverif1016); if (state.failed) return;dbg.location(93,14);
		pushFollow(FOLLOW_term_in_synpred101_proverif1018);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred101_proverif

	// $ANTLR start synpred102_proverif
	public final void synpred102_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:94:4: ( term '<->' term )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:94:4: term '<->' term
		{
		dbg.location(94,4);
		pushFollow(FOLLOW_term_in_synpred102_proverif1023);
		term();
		state._fsp--;
		if (state.failed) return;dbg.location(94,9);
		match(input,27,FOLLOW_27_in_synpred102_proverif1025); if (state.failed) return;dbg.location(94,15);
		pushFollow(FOLLOW_term_in_synpred102_proverif1027);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred102_proverif

	// $ANTLR start synpred105_proverif
	public final void synpred105_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:35: ( pterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:35: pterm ','
		{
		dbg.location(99,35);
		pushFollow(FOLLOW_pterm_in_synpred105_proverif1064);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(99,41);
		match(input,20,FOLLOW_20_in_synpred105_proverif1066); if (state.failed) return;
		}

	}
	// $ANTLR end synpred105_proverif

	// $ANTLR start synpred120_proverif
	public final void synpred120_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:308: ( 'else' process )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:308: 'else' process
		{
		dbg.location(99,308);
		match(input,40,FOLLOW_40_in_synpred120_proverif1184); if (state.failed) return;dbg.location(99,315);
		pushFollow(FOLLOW_process_in_synpred120_proverif1186);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred120_proverif

	// $ANTLR start synpred126_proverif
	public final void synpred126_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:458: ( 'else' process )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:458: 'else' process
		{
		dbg.location(99,458);
		match(input,40,FOLLOW_40_in_synpred126_proverif1245); if (state.failed) return;dbg.location(99,465);
		pushFollow(FOLLOW_process_in_synpred126_proverif1247);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred126_proverif

	// $ANTLR start synpred132_proverif
	public final void synpred132_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:576: ( 'else' process )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:576: 'else' process
		{
		dbg.location(99,576);
		match(input,40,FOLLOW_40_in_synpred132_proverif1293); if (state.failed) return;dbg.location(99,583);
		pushFollow(FOLLOW_process_in_synpred132_proverif1295);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred132_proverif

	// $ANTLR start synpred135_proverif
	public final void synpred135_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:619: ( pterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:619: pterm ','
		{
		dbg.location(99,619);
		pushFollow(FOLLOW_pterm_in_synpred135_proverif1312);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(99,625);
		match(input,20,FOLLOW_20_in_synpred135_proverif1314); if (state.failed) return;
		}

	}
	// $ANTLR end synpred135_proverif

	// $ANTLR start synpred139_proverif
	public final void synpred139_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:678: ( pattern ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:678: pattern ','
		{
		dbg.location(99,678);
		pushFollow(FOLLOW_pattern_in_synpred139_proverif1341);
		pattern();
		state._fsp--;
		if (state.failed) return;dbg.location(99,686);
		match(input,20,FOLLOW_20_in_synpred139_proverif1343); if (state.failed) return;
		}

	}
	// $ANTLR end synpred139_proverif

	// $ANTLR start synpred142_proverif
	public final void synpred142_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:741: ( 'else' process )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:741: 'else' process
		{
		dbg.location(99,741);
		match(input,40,FOLLOW_40_in_synpred142_proverif1366); if (state.failed) return;dbg.location(99,748);
		pushFollow(FOLLOW_process_in_synpred142_proverif1368);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred142_proverif

	// $ANTLR start synpred145_proverif
	public final void synpred145_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:784: ( pterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:784: pterm ','
		{
		dbg.location(99,784);
		pushFollow(FOLLOW_pterm_in_synpred145_proverif1386);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(99,790);
		match(input,20,FOLLOW_20_in_synpred145_proverif1388); if (state.failed) return;
		}

	}
	// $ANTLR end synpred145_proverif

	// $ANTLR start synpred151_proverif
	public final void synpred151_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:861: ( '|' process )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:99:861: '|' process
		{
		dbg.location(99,861);
		match(input,72,FOLLOW_72_in_synpred151_proverif1423); if (state.failed) return;dbg.location(99,865);
		pushFollow(FOLLOW_process_in_synpred151_proverif1425);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred151_proverif

	// $ANTLR start synpred153_proverif
	public final void synpred153_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:19: ( pterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:19: pterm ','
		{
		dbg.location(104,19);
		pushFollow(FOLLOW_pterm_in_synpred153_proverif1449);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(104,25);
		match(input,20,FOLLOW_20_in_synpred153_proverif1451); if (state.failed) return;
		}

	}
	// $ANTLR end synpred153_proverif

	// $ANTLR start synpred156_proverif
	public final void synpred156_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:57: ( pterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:57: pterm ','
		{
		dbg.location(104,57);
		pushFollow(FOLLOW_pterm_in_synpred156_proverif1469);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(104,63);
		match(input,20,FOLLOW_20_in_synpred156_proverif1471); if (state.failed) return;
		}

	}
	// $ANTLR end synpred156_proverif

	// $ANTLR start synpred166_proverif
	public final void synpred166_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:264: ( 'else' pterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:264: 'else' pterm
		{
		dbg.location(104,264);
		match(input,40,FOLLOW_40_in_synpred166_proverif1561); if (state.failed) return;dbg.location(104,271);
		pushFollow(FOLLOW_pterm_in_synpred166_proverif1563);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred166_proverif

	// $ANTLR start synpred168_proverif
	public final void synpred168_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:281: ( 'let' pattern )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:281: 'let' pattern
		{
		dbg.location(104,281);
		match(input,53,FOLLOW_53_in_synpred168_proverif1569); if (state.failed) return;dbg.location(104,287);
		pushFollow(FOLLOW_pattern_in_synpred168_proverif1571);
		pattern();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred168_proverif

	// $ANTLR start synpred171_proverif
	public final void synpred171_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:384: ( 'else' pterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:384: 'else' pterm
		{
		dbg.location(104,384);
		match(input,40,FOLLOW_40_in_synpred171_proverif1607); if (state.failed) return;dbg.location(104,391);
		pushFollow(FOLLOW_pterm_in_synpred171_proverif1609);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred171_proverif

	// $ANTLR start synpred172_proverif
	public final void synpred172_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:340: ( 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:340: 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )?
		{
		dbg.location(104,340);
		match(input,53,FOLLOW_53_in_synpred172_proverif1594); if (state.failed) return;dbg.location(104,346);
		pushFollow(FOLLOW_typedecl_in_synpred172_proverif1596);
		typedecl();
		state._fsp--;
		if (state.failed) return;dbg.location(104,355);
		match(input,67,FOLLOW_67_in_synpred172_proverif1598); if (state.failed) return;dbg.location(104,366);
		pushFollow(FOLLOW_pterm_in_synpred172_proverif1600);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(104,372);
		match(input,50,FOLLOW_50_in_synpred172_proverif1602); if (state.failed) return;dbg.location(104,377);
		pushFollow(FOLLOW_pterm_in_synpred172_proverif1604);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(104,383);
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:383: ( 'else' pterm )?
		int alt267=2;
		try { dbg.enterSubRule(267);
		try { dbg.enterDecision(267, decisionCanBacktrack[267]);

		int LA267_0 = input.LA(1);
		if ( (LA267_0==40) ) {
			alt267=1;
		}
		} finally {dbg.exitDecision(267);}

		switch (alt267) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:384: 'else' pterm
				{
				dbg.location(104,384);
				match(input,40,FOLLOW_40_in_synpred172_proverif1607); if (state.failed) return;dbg.location(104,391);
				pushFollow(FOLLOW_pterm_in_synpred172_proverif1609);
				pterm();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(267);}

		}

	}
	// $ANTLR end synpred172_proverif

	// $ANTLR start synpred173_proverif
	public final void synpred173_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:422: ( pterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:422: pterm ','
		{
		dbg.location(104,422);
		pushFollow(FOLLOW_pterm_in_synpred173_proverif1623);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(104,428);
		match(input,20,FOLLOW_20_in_synpred173_proverif1625); if (state.failed) return;
		}

	}
	// $ANTLR end synpred173_proverif

	// $ANTLR start synpred176_proverif
	public final void synpred176_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:476: ( pattern ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:476: pattern ','
		{
		dbg.location(104,476);
		pushFollow(FOLLOW_pattern_in_synpred176_proverif1649);
		pattern();
		state._fsp--;
		if (state.failed) return;dbg.location(104,484);
		match(input,20,FOLLOW_20_in_synpred176_proverif1651); if (state.failed) return;
		}

	}
	// $ANTLR end synpred176_proverif

	// $ANTLR start synpred179_proverif
	public final void synpred179_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:536: ( 'else' pterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:536: 'else' pterm
		{
		dbg.location(104,536);
		match(input,40,FOLLOW_40_in_synpred179_proverif1673); if (state.failed) return;dbg.location(104,543);
		pushFollow(FOLLOW_pterm_in_synpred179_proverif1675);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred179_proverif

	// $ANTLR start synpred181_proverif
	public final void synpred181_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:574: ( pterm ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:574: pterm ','
		{
		dbg.location(104,574);
		pushFollow(FOLLOW_pterm_in_synpred181_proverif1690);
		pterm();
		state._fsp--;
		if (state.failed) return;dbg.location(104,580);
		match(input,20,FOLLOW_20_in_synpred181_proverif1692); if (state.failed) return;
		}

	}
	// $ANTLR end synpred181_proverif

	// $ANTLR start synpred184_proverif
	public final void synpred184_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:612: ( '=' pterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:612: '=' pterm
		{
		dbg.location(104,612);
		match(input,32,FOLLOW_32_in_synpred184_proverif1710); if (state.failed) return;dbg.location(104,616);
		pushFollow(FOLLOW_pterm_in_synpred184_proverif1712);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred184_proverif

	// $ANTLR start synpred185_proverif
	public final void synpred185_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:624: ( '<>' pterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:624: '<>' pterm
		{
		dbg.location(104,624);
		match(input,31,FOLLOW_31_in_synpred185_proverif1716); if (state.failed) return;dbg.location(104,629);
		pushFollow(FOLLOW_pterm_in_synpred185_proverif1718);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred185_proverif

	// $ANTLR start synpred186_proverif
	public final void synpred186_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:637: ( '&&' pterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:637: '&&' pterm
		{
		dbg.location(104,637);
		match(input,17,FOLLOW_17_in_synpred186_proverif1722); if (state.failed) return;dbg.location(104,642);
		pushFollow(FOLLOW_pterm_in_synpred186_proverif1724);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred186_proverif

	// $ANTLR start synpred187_proverif
	public final void synpred187_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:650: ( '||' pterm )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:104:650: '||' pterm
		{
		dbg.location(104,650);
		match(input,73,FOLLOW_73_in_synpred187_proverif1728); if (state.failed) return;dbg.location(104,655);
		pushFollow(FOLLOW_pterm_in_synpred187_proverif1730);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred187_proverif

	// $ANTLR start synpred188_proverif
	public final void synpred188_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:11: ( term ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:11: term ','
		{
		dbg.location(109,11);
		pushFollow(FOLLOW_term_in_synpred188_proverif1750);
		term();
		state._fsp--;
		if (state.failed) return;dbg.location(109,16);
		match(input,20,FOLLOW_20_in_synpred188_proverif1752); if (state.failed) return;
		}

	}
	// $ANTLR end synpred188_proverif

	// $ANTLR start synpred191_proverif
	public final void synpred191_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:47: ( term ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:47: term ','
		{
		dbg.location(109,47);
		pushFollow(FOLLOW_term_in_synpred191_proverif1770);
		term();
		state._fsp--;
		if (state.failed) return;dbg.location(109,52);
		match(input,20,FOLLOW_20_in_synpred191_proverif1772); if (state.failed) return;
		}

	}
	// $ANTLR end synpred191_proverif

	// $ANTLR start synpred194_proverif
	public final void synpred194_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:92: ( '=' term )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:92: '=' term
		{
		dbg.location(109,92);
		match(input,32,FOLLOW_32_in_synpred194_proverif1794); if (state.failed) return;dbg.location(109,96);
		pushFollow(FOLLOW_term_in_synpred194_proverif1796);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred194_proverif

	// $ANTLR start synpred195_proverif
	public final void synpred195_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:103: ( '<>' term )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:103: '<>' term
		{
		dbg.location(109,103);
		match(input,31,FOLLOW_31_in_synpred195_proverif1800); if (state.failed) return;dbg.location(109,108);
		pushFollow(FOLLOW_term_in_synpred195_proverif1802);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred195_proverif

	// $ANTLR start synpred196_proverif
	public final void synpred196_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:115: ( '&&' term )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:115: '&&' term
		{
		dbg.location(109,115);
		match(input,17,FOLLOW_17_in_synpred196_proverif1806); if (state.failed) return;dbg.location(109,120);
		pushFollow(FOLLOW_term_in_synpred196_proverif1808);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred196_proverif

	// $ANTLR start synpred197_proverif
	public final void synpred197_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:127: ( '||' term )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:109:127: '||' term
		{
		dbg.location(109,127);
		match(input,73,FOLLOW_73_in_synpred197_proverif1812); if (state.failed) return;dbg.location(109,132);
		pushFollow(FOLLOW_term_in_synpred197_proverif1814);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred197_proverif

	// $ANTLR start synpred200_proverif
	public final void synpred200_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:133:10: ( pattern ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:133:10: pattern ','
		{
		dbg.location(133,10);
		pushFollow(FOLLOW_pattern_in_synpred200_proverif1852);
		pattern();
		state._fsp--;
		if (state.failed) return;dbg.location(133,18);
		match(input,20,FOLLOW_20_in_synpred200_proverif1854); if (state.failed) return;
		}

	}
	// $ANTLR end synpred200_proverif

	// $ANTLR start synpred203_proverif
	public final void synpred203_proverif_fragment() throws RecognitionException {
		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:134:16: ( pattern ',' )
		dbg.enterAlt(1);

		// C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\proverif.g:134:16: pattern ','
		{
		dbg.location(134,16);
		pushFollow(FOLLOW_pattern_in_synpred203_proverif1873);
		pattern();
		state._fsp--;
		if (state.failed) return;dbg.location(134,24);
		match(input,20,FOLLOW_20_in_synpred203_proverif1875); if (state.failed) return;
		}

	}
	// $ANTLR end synpred203_proverif

	// Delegated rules

	public final boolean synpred90_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred90_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred69_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred69_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred186_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred186_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred63_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred63_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred72_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred195_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred195_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred11_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred77_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred77_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred101_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred101_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred194_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred194_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred83_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred89_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred89_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred142_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred142_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred60_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred82_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred82_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred176_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred176_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred135_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred135_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred100_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred100_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred59_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred171_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred171_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred188_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred188_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred71_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred153_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred153_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred55_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred184_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred120_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred120_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred126_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred126_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred105_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred132_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred132_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred203_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred203_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred187_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred187_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred196_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred196_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred40_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred70_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred200_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred200_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred102_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred102_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred52_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred172_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred172_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred166_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred166_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred181_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred181_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred197_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred197_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred191_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred191_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred139_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred139_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred156_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred156_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred57_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred57_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred145_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred145_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred68_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred51_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred51_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred151_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred151_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred86_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred86_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred168_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred168_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred173_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred173_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred85_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred85_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred62_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred185_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred185_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred179_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred179_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred56_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_proverif() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred15_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_declaration_in_programme30 = new BitSet(new long[]{0x61A0C65000000000L,0x0000000000000057L});
	public static final BitSet FOLLOW_62_in_programme33 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_programme35 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_declaration46 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration48 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_declaration50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_declaration55 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration59 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declaration61 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_declaration70 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration73 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declaration75 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration79 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_declaration81 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration83 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_declaration85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_declaration90 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration93 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declaration95 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration99 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_declaration101 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration103 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_declaration105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_declaration110 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration112 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_declaration114 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_typeid_in_declaration118 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declaration120 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration124 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_declaration128 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_declaration130 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration132 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_declaration134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_declaration139 = new BitSet(new long[]{0x0080100000040400L});
	public static final BitSet FOLLOW_reduc_in_declaration141 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_declaration143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_declaration148 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration150 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_declaration152 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_typeid_in_declaration156 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declaration158 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration162 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_declaration166 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_declaration168 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_declaration172 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_reducprime_in_declaration174 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_declaration176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_declaration181 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_eqlist_in_declaration183 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_declaration185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_declaration190 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration192 = new BitSet(new long[]{0x0000000000040400L});
	public static final BitSet FOLLOW_18_in_declaration196 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_typeid_in_declaration200 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declaration202 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration206 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_declaration210 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_declaration215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_declaration220 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration222 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_declaration224 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_typeid_in_declaration228 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declaration230 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration234 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_declaration238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_declaration243 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration245 = new BitSet(new long[]{0x0000000100040000L});
	public static final BitSet FOLLOW_18_in_declaration249 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_typedecl_in_declaration252 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_declaration256 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_declaration260 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_declaration262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_declaration267 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_name_in_declaration269 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_declaration271 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_declaration273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_declaration278 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_declaration280 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_declaration284 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_typeid_in_declaration288 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declaration290 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_declaration294 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_declaration298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_declaration306 = new BitSet(new long[]{0x8068040000040400L});
	public static final BitSet FOLLOW_typedecl_in_declaration309 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declaration311 = new BitSet(new long[]{0x8068040000040400L});
	public static final BitSet FOLLOW_query_in_declaration315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_declaration320 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_typedecl_in_declaration323 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declaration325 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_declaration329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_declaration334 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_typedecl_in_declaration337 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declaration339 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_nounifdecl_in_declaration343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_reduc355 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typedecl_in_reduc357 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_reduc359 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_reduc363 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_reduc365 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_reduc367 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_reduc370 = new BitSet(new long[]{0x0080100000040400L});
	public static final BitSet FOLLOW_reduc_in_reduc372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_reducprime387 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_failtypedecl_in_reducprime389 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_reducprime391 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_reducprime395 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_reducprime397 = new BitSet(new long[]{0x00800800000C0400L});
	public static final BitSet FOLLOW_mayfailterm_in_reducprime401 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_reducprime403 = new BitSet(new long[]{0x0080080000040400L});
	public static final BitSet FOLLOW_mayfailterm_in_reducprime407 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_reducprime411 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_reducprime414 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_reducprime_in_reducprime416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_eqlist430 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typedecl_in_eqlist432 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_eqlist434 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_eqlist437 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_eqlist439 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_eqlist441 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_eqlist444 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_eqlist_in_eqlist446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_name459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gterm_in_query482 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_query485 = new BitSet(new long[]{0x8068040000040400L});
	public static final BitSet FOLLOW_query_in_query487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_query494 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_query496 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_query498 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_query501 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_query503 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_query507 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_query510 = new BitSet(new long[]{0x8068040000040400L});
	public static final BitSet FOLLOW_query_in_query512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_query519 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_query521 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_query523 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_query526 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_query528 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_query532 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_query535 = new BitSet(new long[]{0x8068040000040400L});
	public static final BitSet FOLLOW_query_in_query537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_gterm552 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_ident_in_gterm556 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_gterm558 = new BitSet(new long[]{0x00680400000C0400L});
	public static final BitSet FOLLOW_gterm_in_gterm562 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_gterm564 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm568 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_gterm572 = new BitSet(new long[]{0x1000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_60_in_gterm575 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integer_in_gterm577 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_42_in_gterm583 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_gterm585 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm589 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_gterm591 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm595 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm599 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_gterm601 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_51_in_gterm605 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_gterm607 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm611 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_gterm613 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm617 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm621 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_gterm623 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_18_in_gterm627 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm631 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_gterm633 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm637 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm641 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_gterm643 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_54_in_gterm647 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_gterm649 = new BitSet(new long[]{0x0000000780020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_34_in_gterm652 = new BitSet(new long[]{0x0000000800010400L});
	public static final BitSet FOLLOW_gbinding_in_gterm655 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_gterm659 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_53_in_gterm666 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_gterm668 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_gterm670 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm672 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_gterm674 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm676 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_32_in_gterm680 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm682 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_31_in_gterm686 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm688 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_gterm692 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm694 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_17_in_gterm698 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm700 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_33_in_gterm704 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gterm706 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_16_in_gbinding720 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integer_in_gbinding722 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_gbinding724 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gbinding726 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_gbinding729 = new BitSet(new long[]{0x0000000000010400L});
	public static final BitSet FOLLOW_gbinding_in_gbinding731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_gbinding739 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_gbinding741 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_gbinding743 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_gbinding746 = new BitSet(new long[]{0x0000000000010400L});
	public static final BitSet FOLLOW_gbinding_in_gbinding748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_nounifdecl763 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_nounifdecl765 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_nounifdecl767 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_nounifdecl769 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_nounifdecl771 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_nounifdecl_in_nounifdecl773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_nounifdecl778 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_18_in_nounifdecl781 = new BitSet(new long[]{0x00E00000000C0400L});
	public static final BitSet FOLLOW_gformat_in_nounifdecl785 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_nounifdecl787 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_nounifdecl791 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_nounifdecl795 = new BitSet(new long[]{0x1000000000400002L});
	public static final BitSet FOLLOW_60_in_nounifdecl798 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integer_in_nounifdecl800 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_nounifdecl808 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integer_in_nounifdecl809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_gformat822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_gformat827 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_gformat829 = new BitSet(new long[]{0x00E00000000C0400L});
	public static final BitSet FOLLOW_gformat_in_gformat833 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_gformat835 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_gformat839 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_gformat843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_gformat848 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_gformat850 = new BitSet(new long[]{0x00E00000000C0400L});
	public static final BitSet FOLLOW_gformat_in_gformat854 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_gformat856 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_gformat860 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_gformat864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_gformat869 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_gformat873 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_gformat875 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_gformat879 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_gformat883 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_gformat885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_gformat890 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_gformat892 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_gformat896 = new BitSet(new long[]{0x0000000800010400L});
	public static final BitSet FOLLOW_fbinding_in_gformat900 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_gformat905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_gformat913 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_gformat915 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_gformat917 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_gformat919 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_gformat921 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_gformat923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_fbinding937 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integer_in_fbinding939 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_fbinding941 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_fbinding943 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_fbinding946 = new BitSet(new long[]{0x0000000000010400L});
	public static final BitSet FOLLOW_fbinding_in_fbinding948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_fbinding956 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_fbinding958 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_fbinding960 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_fbinding963 = new BitSet(new long[]{0x0000000000010400L});
	public static final BitSet FOLLOW_fbinding_in_fbinding965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_clauses981 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_failtypedecl_in_clauses983 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_clauses985 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_clause_in_clauses989 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_clauses992 = new BitSet(new long[]{0x0080100000040400L});
	public static final BitSet FOLLOW_clauses_in_clauses994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_clause1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_clause1014 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_clause1016 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_clause1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_clause1023 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_clause1025 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_clause1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_clause1032 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_clause1034 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_clause1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_process1048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_71_in_process1052 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_ident_in_process1056 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000100L});
	public static final BitSet FOLLOW_18_in_process1060 = new BitSet(new long[]{0x00F30420000C0400L});
	public static final BitSet FOLLOW_pterm_in_process1064 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_process1066 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1070 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_process1074 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_18_in_process1080 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1082 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_process1084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_16_in_process1088 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_16_in_process1094 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1096 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_process1098 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1100 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_45_in_process1106 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1108 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_process1110 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1112 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_process1114 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_54_in_process1120 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1122 = new BitSet(new long[]{0x0000000401000000L});
	public static final BitSet FOLLOW_34_in_process1126 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_ident_in_process1130 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_process1132 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1136 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_process1140 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_process1145 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_process1147 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_25_in_process1150 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_ident_in_process1159 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_process1161 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_process1163 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_25_in_process1166 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_49_in_process1175 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_process1179 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1181 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_40_in_process1184 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1186 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_50_in_process1193 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_process1195 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1196 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_process1198 = new BitSet(new long[]{0x0000000100040400L});
	public static final BitSet FOLLOW_pattern_in_process1200 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_process1202 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_25_in_process1205 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1207 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_59_in_process1213 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_process1215 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1216 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_process1218 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1220 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_process1221 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_25_in_process1224 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_53_in_process1231 = new BitSet(new long[]{0x0000000100040400L});
	public static final BitSet FOLLOW_pattern_in_process1233 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_process1235 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1237 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_50_in_process1240 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1242 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_40_in_process1245 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_ident_in_process1256 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_24_in_process1259 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_process1261 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_process1266 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1268 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_25_in_process1271 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1273 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_53_in_process1279 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typedecl_in_process1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_process1283 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1285 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_50_in_process1288 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1290 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_40_in_process1293 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1295 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_52_in_process1304 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1306 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_process1308 = new BitSet(new long[]{0x00F30420000C0400L});
	public static final BitSet FOLLOW_pterm_in_process1312 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_process1314 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1318 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_process1322 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_25_in_process1325 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_48_in_process1333 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1335 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_process1337 = new BitSet(new long[]{0x00000001000C0400L});
	public static final BitSet FOLLOW_pattern_in_process1341 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_process1343 = new BitSet(new long[]{0x0000000100040400L});
	public static final BitSet FOLLOW_pattern_in_process1347 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_process1351 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000108L});
	public static final BitSet FOLLOW_67_in_process1354 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1356 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_50_in_process1361 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1363 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_40_in_process1366 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_42_in_process1377 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_process1379 = new BitSet(new long[]{0x0000000002040002L,0x0000000000000100L});
	public static final BitSet FOLLOW_18_in_process1383 = new BitSet(new long[]{0x00F30420000C0400L});
	public static final BitSet FOLLOW_pterm_in_process1386 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_process1388 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_process1392 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_process1396 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_25_in_process1402 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_60_in_process1410 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integer_in_process1412 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_25_in_process1415 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_process1423 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_process1425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_ident_in_pterm1441 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_18_in_pterm1445 = new BitSet(new long[]{0x00F30420000C0400L});
	public static final BitSet FOLLOW_pterm_in_pterm1449 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pterm1451 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1455 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_pterm1459 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_ident_in_pterm1463 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_pterm1465 = new BitSet(new long[]{0x00F30420000C0400L});
	public static final BitSet FOLLOW_pterm_in_pterm1469 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pterm1471 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1475 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_pterm1479 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_37_in_pterm1483 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_pterm1485 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1487 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pterm1489 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1491 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_pterm1493 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_55_in_pterm1497 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_pterm1499 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1501 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_pterm1503 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_54_in_pterm1507 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_pterm1509 = new BitSet(new long[]{0x0000000401000000L});
	public static final BitSet FOLLOW_34_in_pterm1512 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_ident_in_pterm1516 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pterm1518 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_pterm1522 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_pterm1526 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_pterm1530 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_pterm1532 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_pterm1534 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1536 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_ident_in_pterm1540 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_pterm1542 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_pterm1544 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_pterm1546 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1548 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_49_in_pterm1552 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_pterm1556 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1558 = new BitSet(new long[]{0x0000010180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_40_in_pterm1561 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1563 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_53_in_pterm1569 = new BitSet(new long[]{0x0000000100040400L});
	public static final BitSet FOLLOW_pattern_in_pterm1571 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_ident_in_pterm1575 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_24_in_pterm1578 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_pterm1580 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_pterm1584 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1586 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_pterm1588 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1590 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_53_in_pterm1594 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typedecl_in_pterm1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_pterm1598 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1600 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_pterm1602 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1604 = new BitSet(new long[]{0x0000010180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_40_in_pterm1607 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1609 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_52_in_pterm1615 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_pterm1617 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_pterm1619 = new BitSet(new long[]{0x00F30420000C0400L});
	public static final BitSet FOLLOW_pterm_in_pterm1623 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pterm1625 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1629 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_pterm1633 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_pterm1635 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1637 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_48_in_pterm1641 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_pterm1643 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_pterm1645 = new BitSet(new long[]{0x00000001000C0400L});
	public static final BitSet FOLLOW_pattern_in_pterm1649 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pterm1651 = new BitSet(new long[]{0x0000000100040400L});
	public static final BitSet FOLLOW_pattern_in_pterm1655 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_pterm1659 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_pterm1662 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1664 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_pterm1668 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1670 = new BitSet(new long[]{0x0000010180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_40_in_pterm1673 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1675 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_42_in_pterm1681 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_pterm1683 = new BitSet(new long[]{0x0000000002040000L});
	public static final BitSet FOLLOW_18_in_pterm1686 = new BitSet(new long[]{0x00F30420000C0400L});
	public static final BitSet FOLLOW_pterm_in_pterm1690 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pterm1692 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1696 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_pterm1700 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_pterm1704 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1706 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_32_in_pterm1710 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1712 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_31_in_pterm1716 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1718 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_17_in_pterm1722 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1724 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_pterm1728 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pterm1730 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_18_in_term1746 = new BitSet(new long[]{0x00800000000C0400L});
	public static final BitSet FOLLOW_term_in_term1750 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_term1752 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_term1756 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_term1760 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_ident_in_term1764 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_term1766 = new BitSet(new long[]{0x00800000000C0400L});
	public static final BitSet FOLLOW_term_in_term1770 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_term1772 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_term1776 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_term1780 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_55_in_term1784 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_term1786 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_term1788 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_term1790 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_32_in_term1794 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_term1796 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_31_in_term1800 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_term1802 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_17_in_term1806 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_term1808 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_term1812 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_term1814 = new BitSet(new long[]{0x0000000180020002L,0x0000000000000200L});
	public static final BitSet FOLLOW_ident_in_pattern1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_pattern1839 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_pattern1841 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_pattern1843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_pattern1848 = new BitSet(new long[]{0x00000001000C0400L});
	public static final BitSet FOLLOW_pattern_in_pattern1852 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pattern1854 = new BitSet(new long[]{0x0000000100040400L});
	public static final BitSet FOLLOW_pattern_in_pattern1858 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_pattern1862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_pattern1867 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_pattern1869 = new BitSet(new long[]{0x00000001000C0400L});
	public static final BitSet FOLLOW_pattern_in_pattern1873 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_pattern1875 = new BitSet(new long[]{0x0000000100040400L});
	public static final BitSet FOLLOW_pattern_in_pattern1879 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_pattern1883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_pattern1888 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_pattern1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_mayfailterm1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_mayfailterm1906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_typedecl1917 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_typedecl1919 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_typedecl1921 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_typedecl1924 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typedecl_in_typedecl1926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_failtypedecl1939 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_failtypedecl1941 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_failtypedecl1943 = new BitSet(new long[]{0x0200000000100002L});
	public static final BitSet FOLLOW_57_in_failtypedecl1946 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_failtypedecl1948 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_failtypedecl1953 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typedecl_in_failtypedecl1955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_proverifOptions1970 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_proverifOptions1972 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_proverifOptions1976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ident1990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id2001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_integer2012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeid2023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_synpred11_proverif110 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_synpred11_proverif112 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_synpred11_proverif114 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_typeid_in_synpred11_proverif118 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred11_proverif120 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_synpred11_proverif124 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_synpred11_proverif128 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_synpred11_proverif130 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_synpred11_proverif132 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_synpred11_proverif134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_synpred15_proverif148 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ident_in_synpred15_proverif150 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_synpred15_proverif152 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_typeid_in_synpred15_proverif156 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred15_proverif158 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_synpred15_proverif162 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_synpred15_proverif166 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_synpred15_proverif168 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typeid_in_synpred15_proverif170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_synpred15_proverif172 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_reducprime_in_synpred15_proverif174 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_proverifOptions_in_synpred15_proverif176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mayfailterm_in_synpred40_proverif401 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred40_proverif403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_synpred51_proverif552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gterm_in_synpred52_proverif562 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred52_proverif564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_synpred55_proverif556 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_synpred55_proverif558 = new BitSet(new long[]{0x00680400000C0400L});
	public static final BitSet FOLLOW_gterm_in_synpred55_proverif562 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred55_proverif564 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred55_proverif568 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_synpred55_proverif572 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_synpred55_proverif575 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integer_in_synpred55_proverif577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gterm_in_synpred56_proverif589 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred56_proverif591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gterm_in_synpred57_proverif589 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred57_proverif591 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred57_proverif595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gterm_in_synpred59_proverif611 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred59_proverif613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gterm_in_synpred60_proverif611 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred60_proverif613 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred60_proverif617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gterm_in_synpred62_proverif631 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred62_proverif633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gterm_in_synpred63_proverif631 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred63_proverif633 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred63_proverif637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_synpred68_proverif680 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred68_proverif682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_synpred69_proverif686 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred69_proverif688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_synpred70_proverif692 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred70_proverif694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_synpred71_proverif698 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred71_proverif700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_synpred72_proverif704 = new BitSet(new long[]{0x0068040000040400L});
	public static final BitSet FOLLOW_gterm_in_synpred72_proverif706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gformat_in_synpred77_proverif785 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred77_proverif787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_synpred82_proverif822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gformat_in_synpred83_proverif833 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred83_proverif835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_synpred85_proverif827 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_synpred85_proverif829 = new BitSet(new long[]{0x00E00000000C0400L});
	public static final BitSet FOLLOW_gformat_in_synpred85_proverif833 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred85_proverif835 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_synpred85_proverif839 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_synpred85_proverif843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gformat_in_synpred86_proverif854 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred86_proverif856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gformat_in_synpred89_proverif873 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred89_proverif875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gformat_in_synpred90_proverif873 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred90_proverif875 = new BitSet(new long[]{0x00E0000000040400L});
	public static final BitSet FOLLOW_gformat_in_synpred90_proverif879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_synpred100_proverif1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_synpred101_proverif1014 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_synpred101_proverif1016 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_synpred101_proverif1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_synpred102_proverif1023 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_synpred102_proverif1025 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_synpred102_proverif1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pterm_in_synpred105_proverif1064 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred105_proverif1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred120_proverif1184 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_synpred120_proverif1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred126_proverif1245 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_synpred126_proverif1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred132_proverif1293 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_synpred132_proverif1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pterm_in_synpred135_proverif1312 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred135_proverif1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pattern_in_synpred139_proverif1341 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred139_proverif1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred142_proverif1366 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_synpred142_proverif1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pterm_in_synpred145_proverif1386 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred145_proverif1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_synpred151_proverif1423 = new BitSet(new long[]{0x1877240000850400L,0x0000000000000080L});
	public static final BitSet FOLLOW_process_in_synpred151_proverif1425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pterm_in_synpred153_proverif1449 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred153_proverif1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pterm_in_synpred156_proverif1469 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred156_proverif1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred166_proverif1561 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred166_proverif1563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred168_proverif1569 = new BitSet(new long[]{0x0000000100040400L});
	public static final BitSet FOLLOW_pattern_in_synpred168_proverif1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred171_proverif1607 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred171_proverif1609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_synpred172_proverif1594 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_typedecl_in_synpred172_proverif1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_synpred172_proverif1598 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred172_proverif1600 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred172_proverif1602 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred172_proverif1604 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_synpred172_proverif1607 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred172_proverif1609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pterm_in_synpred173_proverif1623 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred173_proverif1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pattern_in_synpred176_proverif1649 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred176_proverif1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred179_proverif1673 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred179_proverif1675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pterm_in_synpred181_proverif1690 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred181_proverif1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_synpred184_proverif1710 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred184_proverif1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_synpred185_proverif1716 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred185_proverif1718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_synpred186_proverif1722 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred186_proverif1724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_synpred187_proverif1728 = new BitSet(new long[]{0x00F3042000040400L});
	public static final BitSet FOLLOW_pterm_in_synpred187_proverif1730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_synpred188_proverif1750 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred188_proverif1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_synpred191_proverif1770 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred191_proverif1772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_synpred194_proverif1794 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_synpred194_proverif1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_synpred195_proverif1800 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_synpred195_proverif1802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_synpred196_proverif1806 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_synpred196_proverif1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_synpred197_proverif1812 = new BitSet(new long[]{0x0080000000040400L});
	public static final BitSet FOLLOW_term_in_synpred197_proverif1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pattern_in_synpred200_proverif1852 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred200_proverif1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pattern_in_synpred203_proverif1873 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_synpred203_proverif1875 = new BitSet(new long[]{0x0000000000000002L});
}
