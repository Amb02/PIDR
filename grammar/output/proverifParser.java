// $ANTLR 3.5.1 D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g 2019-02-26 21:36:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class proverifParser extends Parser {
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


	public proverifParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public proverifParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return proverifParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g"; }



	// $ANTLR start "programme"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:8:1: programme : ( declaration )* 'process' process ;
	public final void programme() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:9:2: ( ( declaration )* 'process' process )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:9:4: ( declaration )* 'process' process
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:9:4: ( declaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==36||LA1_0==38||(LA1_0 >= 41 && LA1_0 <= 42)||(LA1_0 >= 46 && LA1_0 <= 47)||LA1_0==53||(LA1_0 >= 55 && LA1_0 <= 56)||LA1_0==61||(LA1_0 >= 64 && LA1_0 <= 66)||LA1_0==68||LA1_0==70) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:9:4: declaration
					{
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

			match(input,62,FOLLOW_62_in_programme33); if (state.failed) return;
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
	}
	// $ANTLR end "programme"



	// $ANTLR start "declaration"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:12:1: declaration : ( 'type' ident proverifOptions | 'channel' ( ident ',' )* ident | 'free' ( ident ',' )* ident ':' typeid proverifOptions | 'const' ( ident ',' )* ident ':' typeid proverifOptions | 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions | 'reduc' reduc proverifOptions | 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions | 'equation' eqlist proverifOptions | 'pred' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? proverifOptions | 'table' ident '(' ( ( typeid ',' )* typeid )? ')' | 'let' ident ( '(' ( typedecl )? ')' )? '=' process | 'set' name '=' value | 'event' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? | 'query' ( typedecl ';' )? query | 'not' ( typedecl ';' )? gterm | 'nounif' ( typedecl ';' )? nounifdecl );
	public final void declaration() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:13:2: ( 'type' ident proverifOptions | 'channel' ( ident ',' )* ident | 'free' ( ident ',' )* ident ':' typeid proverifOptions | 'const' ( ident ',' )* ident ':' typeid proverifOptions | 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions | 'reduc' reduc proverifOptions | 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions | 'equation' eqlist proverifOptions | 'pred' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? proverifOptions | 'table' ident '(' ( ( typeid ',' )* typeid )? ')' | 'let' ident ( '(' ( typedecl )? ')' )? '=' process | 'set' name '=' value | 'event' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? | 'query' ( typedecl ';' )? query | 'not' ( typedecl ';' )? gterm | 'nounif' ( typedecl ';' )? nounifdecl )
			int alt22=16;
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
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:13:4: 'type' ident proverifOptions
					{
					match(input,70,FOLLOW_70_in_declaration46); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_declaration48);
					ident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_proverifOptions_in_declaration50);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:14:4: 'channel' ( ident ',' )* ident
					{
					match(input,36,FOLLOW_36_in_declaration55); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:14:15: ( ident ',' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==ID) ) {
							int LA2_1 = input.LA(2);
							if ( (LA2_1==20) ) {
								alt2=1;
							}

						}

						switch (alt2) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:14:16: ident ','
							{
							pushFollow(FOLLOW_ident_in_declaration59);
							ident();
							state._fsp--;
							if (state.failed) return;
							match(input,20,FOLLOW_20_in_declaration61); if (state.failed) return;
							}
							break;

						default :
							break loop2;
						}
					}

					pushFollow(FOLLOW_ident_in_declaration65);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:15:4: 'free' ( ident ',' )* ident ':' typeid proverifOptions
					{
					match(input,46,FOLLOW_46_in_declaration70); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:15:11: ( ident ',' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==ID) ) {
							int LA3_1 = input.LA(2);
							if ( (LA3_1==20) ) {
								alt3=1;
							}

						}

						switch (alt3) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:15:12: ident ','
							{
							pushFollow(FOLLOW_ident_in_declaration73);
							ident();
							state._fsp--;
							if (state.failed) return;
							match(input,20,FOLLOW_20_in_declaration75); if (state.failed) return;
							}
							break;

						default :
							break loop3;
						}
					}

					pushFollow(FOLLOW_ident_in_declaration79);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,24,FOLLOW_24_in_declaration81); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_declaration83);
					typeid();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_proverifOptions_in_declaration85);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:16:4: 'const' ( ident ',' )* ident ':' typeid proverifOptions
					{
					match(input,38,FOLLOW_38_in_declaration90); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:16:12: ( ident ',' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID) ) {
							int LA4_1 = input.LA(2);
							if ( (LA4_1==20) ) {
								alt4=1;
							}

						}

						switch (alt4) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:16:13: ident ','
							{
							pushFollow(FOLLOW_ident_in_declaration93);
							ident();
							state._fsp--;
							if (state.failed) return;
							match(input,20,FOLLOW_20_in_declaration95); if (state.failed) return;
							}
							break;

						default :
							break loop4;
						}
					}

					pushFollow(FOLLOW_ident_in_declaration99);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,24,FOLLOW_24_in_declaration101); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_declaration103);
					typeid();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_proverifOptions_in_declaration105);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:4: 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions
					{
					match(input,47,FOLLOW_47_in_declaration110); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_declaration112);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_declaration114); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:20: ( ( typeid ',' )* typeid )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ID) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:21: ( typeid ',' )* typeid
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:21: ( typeid ',' )*
							loop5:
							while (true) {
								int alt5=2;
								int LA5_0 = input.LA(1);
								if ( (LA5_0==ID) ) {
									int LA5_1 = input.LA(2);
									if ( (LA5_1==20) ) {
										alt5=1;
									}

								}

								switch (alt5) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:22: typeid ','
									{
									pushFollow(FOLLOW_typeid_in_declaration118);
									typeid();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_declaration120); if (state.failed) return;
									}
									break;

								default :
									break loop5;
								}
							}

							pushFollow(FOLLOW_typeid_in_declaration124);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_declaration128); if (state.failed) return;
					match(input,24,FOLLOW_24_in_declaration130); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_declaration132);
					typeid();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_proverifOptions_in_declaration134);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:18:4: 'reduc' reduc proverifOptions
					{
					match(input,65,FOLLOW_65_in_declaration139); if (state.failed) return;
					pushFollow(FOLLOW_reduc_in_declaration141);
					reduc();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_proverifOptions_in_declaration143);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:4: 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions
					{
					match(input,47,FOLLOW_47_in_declaration148); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_declaration150);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_declaration152); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:20: ( ( typeid ',' )* typeid )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==ID) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:21: ( typeid ',' )* typeid
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:21: ( typeid ',' )*
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( (LA7_0==ID) ) {
									int LA7_1 = input.LA(2);
									if ( (LA7_1==20) ) {
										alt7=1;
									}

								}

								switch (alt7) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:22: typeid ','
									{
									pushFollow(FOLLOW_typeid_in_declaration156);
									typeid();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_declaration158); if (state.failed) return;
									}
									break;

								default :
									break loop7;
								}
							}

							pushFollow(FOLLOW_typeid_in_declaration162);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_declaration166); if (state.failed) return;
					match(input,24,FOLLOW_24_in_declaration168); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_declaration170);
					typeid();
					state._fsp--;
					if (state.failed) return;
					match(input,65,FOLLOW_65_in_declaration172); if (state.failed) return;
					pushFollow(FOLLOW_reducprime_in_declaration174);
					reducprime();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_proverifOptions_in_declaration176);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:20:4: 'equation' eqlist proverifOptions
					{
					match(input,41,FOLLOW_41_in_declaration181); if (state.failed) return;
					pushFollow(FOLLOW_eqlist_in_declaration183);
					eqlist();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_proverifOptions_in_declaration185);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:4: 'pred' ident ( '(' ( ( typeid ',' )* typeid )? ')' )? proverifOptions
					{
					match(input,61,FOLLOW_61_in_declaration190); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_declaration192);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:17: ( '(' ( ( typeid ',' )* typeid )? ')' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==18) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:19: '(' ( ( typeid ',' )* typeid )? ')'
							{
							match(input,18,FOLLOW_18_in_declaration196); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:23: ( ( typeid ',' )* typeid )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==ID) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:24: ( typeid ',' )* typeid
									{
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:24: ( typeid ',' )*
									loop9:
									while (true) {
										int alt9=2;
										int LA9_0 = input.LA(1);
										if ( (LA9_0==ID) ) {
											int LA9_1 = input.LA(2);
											if ( (LA9_1==20) ) {
												alt9=1;
											}

										}

										switch (alt9) {
										case 1 :
											// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:21:25: typeid ','
											{
											pushFollow(FOLLOW_typeid_in_declaration200);
											typeid();
											state._fsp--;
											if (state.failed) return;
											match(input,20,FOLLOW_20_in_declaration202); if (state.failed) return;
											}
											break;

										default :
											break loop9;
										}
									}

									pushFollow(FOLLOW_typeid_in_declaration206);
									typeid();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,19,FOLLOW_19_in_declaration210); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_proverifOptions_in_declaration215);
					proverifOptions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:22:4: 'table' ident '(' ( ( typeid ',' )* typeid )? ')'
					{
					match(input,68,FOLLOW_68_in_declaration220); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_declaration222);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_declaration224); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:22:22: ( ( typeid ',' )* typeid )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ID) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:22:23: ( typeid ',' )* typeid
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:22:23: ( typeid ',' )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==ID) ) {
									int LA12_1 = input.LA(2);
									if ( (LA12_1==20) ) {
										alt12=1;
									}

								}

								switch (alt12) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:22:24: typeid ','
									{
									pushFollow(FOLLOW_typeid_in_declaration228);
									typeid();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_declaration230); if (state.failed) return;
									}
									break;

								default :
									break loop12;
								}
							}

							pushFollow(FOLLOW_typeid_in_declaration234);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_declaration238); if (state.failed) return;
					}
					break;
				case 11 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:23:4: 'let' ident ( '(' ( typedecl )? ')' )? '=' process
					{
					match(input,53,FOLLOW_53_in_declaration243); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_declaration245);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:23:16: ( '(' ( typedecl )? ')' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==18) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:23:18: '(' ( typedecl )? ')'
							{
							match(input,18,FOLLOW_18_in_declaration249); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:23:22: ( typedecl )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==ID) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:23:23: typedecl
									{
									pushFollow(FOLLOW_typedecl_in_declaration252);
									typedecl();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,19,FOLLOW_19_in_declaration256); if (state.failed) return;
							}
							break;

					}

					match(input,32,FOLLOW_32_in_declaration260); if (state.failed) return;
					pushFollow(FOLLOW_process_in_declaration262);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:24:4: 'set' name '=' value
					{
					match(input,66,FOLLOW_66_in_declaration267); if (state.failed) return;
					pushFollow(FOLLOW_name_in_declaration269);
					name();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_declaration271); if (state.failed) return;
					pushFollow(FOLLOW_value_in_declaration273);
					value();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:4: 'event' ident ( '(' ( ( typeid ',' )* typeid )? ')' )?
					{
					match(input,42,FOLLOW_42_in_declaration278); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_declaration280);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:18: ( '(' ( ( typeid ',' )* typeid )? ')' )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==18) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:20: '(' ( ( typeid ',' )* typeid )? ')'
							{
							match(input,18,FOLLOW_18_in_declaration284); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:24: ( ( typeid ',' )* typeid )?
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( (LA17_0==ID) ) {
								alt17=1;
							}
							switch (alt17) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:25: ( typeid ',' )* typeid
									{
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:25: ( typeid ',' )*
									loop16:
									while (true) {
										int alt16=2;
										int LA16_0 = input.LA(1);
										if ( (LA16_0==ID) ) {
											int LA16_1 = input.LA(2);
											if ( (LA16_1==20) ) {
												alt16=1;
											}

										}

										switch (alt16) {
										case 1 :
											// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:25:26: typeid ','
											{
											pushFollow(FOLLOW_typeid_in_declaration288);
											typeid();
											state._fsp--;
											if (state.failed) return;
											match(input,20,FOLLOW_20_in_declaration290); if (state.failed) return;
											}
											break;

										default :
											break loop16;
										}
									}

									pushFollow(FOLLOW_typeid_in_declaration294);
									typeid();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,19,FOLLOW_19_in_declaration298); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 14 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:26:4: 'query' ( typedecl ';' )? query
					{
					match(input,64,FOLLOW_64_in_declaration306); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:26:12: ( typedecl ';' )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ID) ) {
						int LA19_1 = input.LA(2);
						if ( (LA19_1==24) ) {
							alt19=1;
						}
					}
					switch (alt19) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:26:13: typedecl ';'
							{
							pushFollow(FOLLOW_typedecl_in_declaration309);
							typedecl();
							state._fsp--;
							if (state.failed) return;
							match(input,25,FOLLOW_25_in_declaration311); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_query_in_declaration315);
					query();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:27:4: 'not' ( typedecl ';' )? gterm
					{
					match(input,55,FOLLOW_55_in_declaration320); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:27:10: ( typedecl ';' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ID) ) {
						int LA20_1 = input.LA(2);
						if ( (LA20_1==24) ) {
							alt20=1;
						}
					}
					switch (alt20) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:27:11: typedecl ';'
							{
							pushFollow(FOLLOW_typedecl_in_declaration323);
							typedecl();
							state._fsp--;
							if (state.failed) return;
							match(input,25,FOLLOW_25_in_declaration325); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_gterm_in_declaration329);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 16 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:28:4: 'nounif' ( typedecl ';' )? nounifdecl
					{
					match(input,56,FOLLOW_56_in_declaration334); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:28:13: ( typedecl ';' )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ID) ) {
						int LA21_1 = input.LA(2);
						if ( (LA21_1==24) ) {
							alt21=1;
						}
					}
					switch (alt21) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:28:14: typedecl ';'
							{
							pushFollow(FOLLOW_typedecl_in_declaration337);
							typedecl();
							state._fsp--;
							if (state.failed) return;
							match(input,25,FOLLOW_25_in_declaration339); if (state.failed) return;
							}
							break;

					}

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
	}
	// $ANTLR end "declaration"



	// $ANTLR start "reduc"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:31:1: reduc : ( 'forall' typedecl ';' )? term '=' term ( ';' reduc )? ;
	public final void reduc() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:32:2: ( ( 'forall' typedecl ';' )? term '=' term ( ';' reduc )? )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:32:4: ( 'forall' typedecl ';' )? term '=' term ( ';' reduc )?
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:32:4: ( 'forall' typedecl ';' )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==44) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:32:5: 'forall' typedecl ';'
					{
					match(input,44,FOLLOW_44_in_reduc355); if (state.failed) return;
					pushFollow(FOLLOW_typedecl_in_reduc357);
					typedecl();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_reduc359); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_term_in_reduc363);
			term();
			state._fsp--;
			if (state.failed) return;
			match(input,32,FOLLOW_32_in_reduc365); if (state.failed) return;
			pushFollow(FOLLOW_term_in_reduc367);
			term();
			state._fsp--;
			if (state.failed) return;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:32:43: ( ';' reduc )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==25) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:32:44: ';' reduc
					{
					match(input,25,FOLLOW_25_in_reduc370); if (state.failed) return;
					pushFollow(FOLLOW_reduc_in_reduc372);
					reduc();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "reduc"



	// $ANTLR start "reducprime"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:35:1: reducprime : ( 'forall' failtypedecl ';' )? ident '(' ( ( mayfailterm ',' )* mayfailterm )? ')' ( 'otherwise' reducprime )? ;
	public final void reducprime() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:2: ( ( 'forall' failtypedecl ';' )? ident '(' ( ( mayfailterm ',' )* mayfailterm )? ')' ( 'otherwise' reducprime )? )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:4: ( 'forall' failtypedecl ';' )? ident '(' ( ( mayfailterm ',' )* mayfailterm )? ')' ( 'otherwise' reducprime )?
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:4: ( 'forall' failtypedecl ';' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==44) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:5: 'forall' failtypedecl ';'
					{
					match(input,44,FOLLOW_44_in_reducprime387); if (state.failed) return;
					pushFollow(FOLLOW_failtypedecl_in_reducprime389);
					failtypedecl();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_reducprime391); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_ident_in_reducprime395);
			ident();
			state._fsp--;
			if (state.failed) return;
			match(input,18,FOLLOW_18_in_reducprime397); if (state.failed) return;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:43: ( ( mayfailterm ',' )* mayfailterm )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ID||LA27_0==18||LA27_0==43||LA27_0==55) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:44: ( mayfailterm ',' )* mayfailterm
					{
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:44: ( mayfailterm ',' )*
					loop26:
					while (true) {
						int alt26=2;
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
						switch (alt26) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:45: mayfailterm ','
							{
							pushFollow(FOLLOW_mayfailterm_in_reducprime401);
							mayfailterm();
							state._fsp--;
							if (state.failed) return;
							match(input,20,FOLLOW_20_in_reducprime403); if (state.failed) return;
							}
							break;

						default :
							break loop26;
						}
					}

					pushFollow(FOLLOW_mayfailterm_in_reducprime407);
					mayfailterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,19,FOLLOW_19_in_reducprime411); if (state.failed) return;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:81: ( 'otherwise' reducprime )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==58) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:82: 'otherwise' reducprime
					{
					match(input,58,FOLLOW_58_in_reducprime414); if (state.failed) return;
					pushFollow(FOLLOW_reducprime_in_reducprime416);
					reducprime();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "reducprime"



	// $ANTLR start "eqlist"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:39:1: eqlist : ( 'forall' typedecl ';' ) term '=' term ( ';' eqlist )? ;
	public final void eqlist() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:40:2: ( ( 'forall' typedecl ';' ) term '=' term ( ';' eqlist )? )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:40:4: ( 'forall' typedecl ';' ) term '=' term ( ';' eqlist )?
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:40:4: ( 'forall' typedecl ';' )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:40:5: 'forall' typedecl ';'
			{
			match(input,44,FOLLOW_44_in_eqlist430); if (state.failed) return;
			pushFollow(FOLLOW_typedecl_in_eqlist432);
			typedecl();
			state._fsp--;
			if (state.failed) return;
			match(input,25,FOLLOW_25_in_eqlist434); if (state.failed) return;
			}

			pushFollow(FOLLOW_term_in_eqlist437);
			term();
			state._fsp--;
			if (state.failed) return;
			match(input,32,FOLLOW_32_in_eqlist439); if (state.failed) return;
			pushFollow(FOLLOW_term_in_eqlist441);
			term();
			state._fsp--;
			if (state.failed) return;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:40:42: ( ';' eqlist )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==25) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:40:43: ';' eqlist
					{
					match(input,25,FOLLOW_25_in_eqlist444); if (state.failed) return;
					pushFollow(FOLLOW_eqlist_in_eqlist446);
					eqlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "eqlist"



	// $ANTLR start "name"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:43:1: name : ID ;
	public final void name() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:44:2: ( ID )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:44:4: ID
			{
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
	}
	// $ANTLR end "name"



	// $ANTLR start "value"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:47:1: value : ID ;
	public final void value() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:48:2: ( ID )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:48:4: ID
			{
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
	}
	// $ANTLR end "value"



	// $ANTLR start "query"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:51:1: query : ( gterm ( ';' query )? | 'putbegin' 'event' ':' ( ident ',' )* ident ( ';' query )? | 'putbegin' 'inj-event' ':' ( ident ',' )* ident ( ';' query )? );
	public final void query() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:52:2: ( gterm ( ';' query )? | 'putbegin' 'event' ':' ( ident ',' )* ident ( ';' query )? | 'putbegin' 'inj-event' ':' ( ident ',' )* ident ( ';' query )? )
			int alt35=3;
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
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:52:4: gterm ( ';' query )?
					{
					pushFollow(FOLLOW_gterm_in_query482);
					gterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:52:10: ( ';' query )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==25) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:52:11: ';' query
							{
							match(input,25,FOLLOW_25_in_query485); if (state.failed) return;
							pushFollow(FOLLOW_query_in_query487);
							query();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:53:4: 'putbegin' 'event' ':' ( ident ',' )* ident ( ';' query )?
					{
					match(input,63,FOLLOW_63_in_query494); if (state.failed) return;
					match(input,42,FOLLOW_42_in_query496); if (state.failed) return;
					match(input,24,FOLLOW_24_in_query498); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:53:27: ( ident ',' )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==ID) ) {
							int LA31_1 = input.LA(2);
							if ( (LA31_1==20) ) {
								alt31=1;
							}

						}

						switch (alt31) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:53:28: ident ','
							{
							pushFollow(FOLLOW_ident_in_query501);
							ident();
							state._fsp--;
							if (state.failed) return;
							match(input,20,FOLLOW_20_in_query503); if (state.failed) return;
							}
							break;

						default :
							break loop31;
						}
					}

					pushFollow(FOLLOW_ident_in_query507);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:53:46: ( ';' query )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==25) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:53:47: ';' query
							{
							match(input,25,FOLLOW_25_in_query510); if (state.failed) return;
							pushFollow(FOLLOW_query_in_query512);
							query();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:54:4: 'putbegin' 'inj-event' ':' ( ident ',' )* ident ( ';' query )?
					{
					match(input,63,FOLLOW_63_in_query519); if (state.failed) return;
					match(input,51,FOLLOW_51_in_query521); if (state.failed) return;
					match(input,24,FOLLOW_24_in_query523); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:54:31: ( ident ',' )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==ID) ) {
							int LA33_1 = input.LA(2);
							if ( (LA33_1==20) ) {
								alt33=1;
							}

						}

						switch (alt33) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:54:32: ident ','
							{
							pushFollow(FOLLOW_ident_in_query526);
							ident();
							state._fsp--;
							if (state.failed) return;
							match(input,20,FOLLOW_20_in_query528); if (state.failed) return;
							}
							break;

						default :
							break loop33;
						}
					}

					pushFollow(FOLLOW_ident_in_query532);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:54:50: ( ';' query )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==25) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:54:51: ';' query
							{
							match(input,25,FOLLOW_25_in_query535); if (state.failed) return;
							pushFollow(FOLLOW_query_in_query537);
							query();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

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
	}
	// $ANTLR end "query"



	// $ANTLR start "gterm"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:57:1: gterm : ( ident | ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' int )? | 'event' '(' ( ( gterm ',' )* gterm )? gterm ')' | 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')' | '(' ( ( gterm ',' )* gterm )? gterm ')' | 'new' ident ( '[' ( gbinding )? ']' )? | 'let' ident '=' gterm 'in' gterm ) ( '=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm )* ;
	public final void gterm() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:2: ( ( ident | ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' int )? | 'event' '(' ( ( gterm ',' )* gterm )? gterm ')' | 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')' | '(' ( ( gterm ',' )* gterm )? gterm ')' | 'new' ident ( '[' ( gbinding )? ']' )? | 'let' ident '=' gterm 'in' gterm ) ( '=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm )* )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:4: ( ident | ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' int )? | 'event' '(' ( ( gterm ',' )* gterm )? gterm ')' | 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')' | '(' ( ( gterm ',' )* gterm )? gterm ')' | 'new' ident ( '[' ( gbinding )? ']' )? | 'let' ident '=' gterm 'in' gterm ) ( '=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm )*
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:4: ( ident | ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' int )? | 'event' '(' ( ( gterm ',' )* gterm )? gterm ')' | 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')' | '(' ( ( gterm ',' )* gterm )? gterm ')' | 'new' ident ( '[' ( gbinding )? ']' )? | 'let' ident '=' gterm 'in' gterm )
			int alt47=7;
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
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:5: ident
					{
					pushFollow(FOLLOW_ident_in_gterm552);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:13: ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' int )?
					{
					pushFollow(FOLLOW_ident_in_gterm556);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_gterm558); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:23: ( ( gterm ',' )* gterm )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==ID||LA37_0==18||LA37_0==42||LA37_0==51||(LA37_0 >= 53 && LA37_0 <= 54)) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:24: ( gterm ',' )* gterm
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:24: ( gterm ',' )*
							loop36:
							while (true) {
								int alt36=2;
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
								switch (alt36) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:25: gterm ','
									{
									pushFollow(FOLLOW_gterm_in_gterm562);
									gterm();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_gterm564); if (state.failed) return;
									}
									break;

								default :
									break loop36;
								}
							}

							pushFollow(FOLLOW_gterm_in_gterm568);
							gterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_gterm572); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:49: ( 'phase' int )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==60) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:50: 'phase' int
							{
							match(input,60,FOLLOW_60_in_gterm575); if (state.failed) return;
							pushFollow(FOLLOW_int_in_gterm577);
							int();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:66: 'event' '(' ( ( gterm ',' )* gterm )? gterm ')'
					{
					match(input,42,FOLLOW_42_in_gterm583); if (state.failed) return;
					match(input,18,FOLLOW_18_in_gterm585); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:78: ( ( gterm ',' )* gterm )?
					int alt40=2;
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
					switch (alt40) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:79: ( gterm ',' )* gterm
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:79: ( gterm ',' )*
							loop39:
							while (true) {
								int alt39=2;
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
								switch (alt39) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:80: gterm ','
									{
									pushFollow(FOLLOW_gterm_in_gterm589);
									gterm();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_gterm591); if (state.failed) return;
									}
									break;

								default :
									break loop39;
								}
							}

							pushFollow(FOLLOW_gterm_in_gterm595);
							gterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_gterm_in_gterm599);
					gterm();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_gterm601); if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:112: 'inj-event' '(' ( ( gterm ',' )* gterm )? gterm ')'
					{
					match(input,51,FOLLOW_51_in_gterm605); if (state.failed) return;
					match(input,18,FOLLOW_18_in_gterm607); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:128: ( ( gterm ',' )* gterm )?
					int alt42=2;
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
					switch (alt42) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:129: ( gterm ',' )* gterm
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:129: ( gterm ',' )*
							loop41:
							while (true) {
								int alt41=2;
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
								switch (alt41) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:130: gterm ','
									{
									pushFollow(FOLLOW_gterm_in_gterm611);
									gterm();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_gterm613); if (state.failed) return;
									}
									break;

								default :
									break loop41;
								}
							}

							pushFollow(FOLLOW_gterm_in_gterm617);
							gterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_gterm_in_gterm621);
					gterm();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_gterm623); if (state.failed) return;
					}
					break;
				case 5 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:162: '(' ( ( gterm ',' )* gterm )? gterm ')'
					{
					match(input,18,FOLLOW_18_in_gterm627); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:166: ( ( gterm ',' )* gterm )?
					int alt44=2;
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
					switch (alt44) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:167: ( gterm ',' )* gterm
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:167: ( gterm ',' )*
							loop43:
							while (true) {
								int alt43=2;
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
								switch (alt43) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:168: gterm ','
									{
									pushFollow(FOLLOW_gterm_in_gterm631);
									gterm();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_gterm633); if (state.failed) return;
									}
									break;

								default :
									break loop43;
								}
							}

							pushFollow(FOLLOW_gterm_in_gterm637);
							gterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_gterm_in_gterm641);
					gterm();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_gterm643); if (state.failed) return;
					}
					break;
				case 6 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:200: 'new' ident ( '[' ( gbinding )? ']' )?
					{
					match(input,54,FOLLOW_54_in_gterm647); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_gterm649);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:212: ( '[' ( gbinding )? ']' )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==34) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:213: '[' ( gbinding )? ']'
							{
							match(input,34,FOLLOW_34_in_gterm652); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:217: ( gbinding )?
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==ID||LA45_0==16) ) {
								alt45=1;
							}
							switch (alt45) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:218: gbinding
									{
									pushFollow(FOLLOW_gbinding_in_gterm655);
									gbinding();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,35,FOLLOW_35_in_gterm659); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 7 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:238: 'let' ident '=' gterm 'in' gterm
					{
					match(input,53,FOLLOW_53_in_gterm666); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_gterm668);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_gterm670); if (state.failed) return;
					pushFollow(FOLLOW_gterm_in_gterm672);
					gterm();
					state._fsp--;
					if (state.failed) return;
					match(input,50,FOLLOW_50_in_gterm674); if (state.failed) return;
					pushFollow(FOLLOW_gterm_in_gterm676);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:272: ( '=' gterm | '<>' gterm | '||' gterm | '&&' gterm | '==>' gterm )*
			loop48:
			while (true) {
				int alt48=6;
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
				switch (alt48) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:273: '=' gterm
					{
					match(input,32,FOLLOW_32_in_gterm680); if (state.failed) return;
					pushFollow(FOLLOW_gterm_in_gterm682);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:285: '<>' gterm
					{
					match(input,31,FOLLOW_31_in_gterm686); if (state.failed) return;
					pushFollow(FOLLOW_gterm_in_gterm688);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:298: '||' gterm
					{
					match(input,73,FOLLOW_73_in_gterm692); if (state.failed) return;
					pushFollow(FOLLOW_gterm_in_gterm694);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:311: '&&' gterm
					{
					match(input,17,FOLLOW_17_in_gterm698); if (state.failed) return;
					pushFollow(FOLLOW_gterm_in_gterm700);
					gterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:324: '==>' gterm
					{
					match(input,33,FOLLOW_33_in_gterm704); if (state.failed) return;
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

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gterm"



	// $ANTLR start "gbinding"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:61:1: gbinding : ( '!' int '=' gterm ( ';' gbinding )? | ident '=' gterm ( ';' gbinding )? );
	public final void gbinding() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:62:3: ( '!' int '=' gterm ( ';' gbinding )? | ident '=' gterm ( ';' gbinding )? )
			int alt51=2;
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
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:62:5: '!' int '=' gterm ( ';' gbinding )?
					{
					match(input,16,FOLLOW_16_in_gbinding720); if (state.failed) return;
					pushFollow(FOLLOW_int_in_gbinding722);
					int();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_gbinding724); if (state.failed) return;
					pushFollow(FOLLOW_gterm_in_gbinding726);
					gterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:62:23: ( ';' gbinding )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==25) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:62:24: ';' gbinding
							{
							match(input,25,FOLLOW_25_in_gbinding729); if (state.failed) return;
							pushFollow(FOLLOW_gbinding_in_gbinding731);
							gbinding();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:63:5: ident '=' gterm ( ';' gbinding )?
					{
					pushFollow(FOLLOW_ident_in_gbinding739);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_gbinding741); if (state.failed) return;
					pushFollow(FOLLOW_gterm_in_gbinding743);
					gterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:63:21: ( ';' gbinding )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==25) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:63:22: ';' gbinding
							{
							match(input,25,FOLLOW_25_in_gbinding746); if (state.failed) return;
							pushFollow(FOLLOW_gbinding_in_gbinding748);
							gbinding();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

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
	}
	// $ANTLR end "gbinding"



	// $ANTLR start "nounifdecl"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:66:1: nounifdecl : ( 'let' ident '=' gformat 'in' nounifdecl | ident ( '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' int )? )? ( '/' int )? );
	public final void nounifdecl() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:67:2: ( 'let' ident '=' gformat 'in' nounifdecl | ident ( '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' int )? )? ( '/' int )? )
			int alt57=2;
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
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:67:4: 'let' ident '=' gformat 'in' nounifdecl
					{
					match(input,53,FOLLOW_53_in_nounifdecl763); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_nounifdecl765);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_nounifdecl767); if (state.failed) return;
					pushFollow(FOLLOW_gformat_in_nounifdecl769);
					gformat();
					state._fsp--;
					if (state.failed) return;
					match(input,50,FOLLOW_50_in_nounifdecl771); if (state.failed) return;
					pushFollow(FOLLOW_nounifdecl_in_nounifdecl773);
					nounifdecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:4: ident ( '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' int )? )? ( '/' int )?
					{
					pushFollow(FOLLOW_ident_in_nounifdecl778);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:10: ( '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' int )? )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==18) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:11: '(' ( ( gformat ',' )* gformat )? ')' ( 'phase' int )?
							{
							match(input,18,FOLLOW_18_in_nounifdecl781); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:15: ( ( gformat ',' )* gformat )?
							int alt53=2;
							int LA53_0 = input.LA(1);
							if ( (LA53_0==ID||LA53_0==18||(LA53_0 >= 53 && LA53_0 <= 55)) ) {
								alt53=1;
							}
							switch (alt53) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:16: ( gformat ',' )* gformat
									{
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:16: ( gformat ',' )*
									loop52:
									while (true) {
										int alt52=2;
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
										switch (alt52) {
										case 1 :
											// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:17: gformat ','
											{
											pushFollow(FOLLOW_gformat_in_nounifdecl785);
											gformat();
											state._fsp--;
											if (state.failed) return;
											match(input,20,FOLLOW_20_in_nounifdecl787); if (state.failed) return;
											}
											break;

										default :
											break loop52;
										}
									}

									pushFollow(FOLLOW_gformat_in_nounifdecl791);
									gformat();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,19,FOLLOW_19_in_nounifdecl795); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:45: ( 'phase' int )?
							int alt54=2;
							int LA54_0 = input.LA(1);
							if ( (LA54_0==60) ) {
								alt54=1;
							}
							switch (alt54) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:46: 'phase' int
									{
									match(input,60,FOLLOW_60_in_nounifdecl798); if (state.failed) return;
									pushFollow(FOLLOW_int_in_nounifdecl800);
									int();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:63: ( '/' int )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==22) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:64: '/' int
							{
							match(input,22,FOLLOW_22_in_nounifdecl808); if (state.failed) return;
							pushFollow(FOLLOW_int_in_nounifdecl809);
							int();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

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
	}
	// $ANTLR end "nounifdecl"



	// $ANTLR start "gformat"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:71:1: gformat : ( ident | ident '(' ( ( gformat ',' )* gformat )? ')' | 'not' '(' ( ( gformat ',' )* gformat )? ')' | '(' ( ( gformat ',' )* gformat )? gformat ')' | 'new' ident ( '[' ( fbinding )? ']' )? | 'let' ident '=' gformat 'in' gformat );
	public final void gformat() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:72:2: ( ident | ident '(' ( ( gformat ',' )* gformat )? ')' | 'not' '(' ( ( gformat ',' )* gformat )? ')' | '(' ( ( gformat ',' )* gformat )? gformat ')' | 'new' ident ( '[' ( fbinding )? ']' )? | 'let' ident '=' gformat 'in' gformat )
			int alt66=6;
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
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:72:4: ident
					{
					pushFollow(FOLLOW_ident_in_gformat822);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:4: ident '(' ( ( gformat ',' )* gformat )? ')'
					{
					pushFollow(FOLLOW_ident_in_gformat827);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_gformat829); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:14: ( ( gformat ',' )* gformat )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==ID||LA59_0==18||(LA59_0 >= 53 && LA59_0 <= 55)) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:15: ( gformat ',' )* gformat
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:15: ( gformat ',' )*
							loop58:
							while (true) {
								int alt58=2;
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
								switch (alt58) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:16: gformat ','
									{
									pushFollow(FOLLOW_gformat_in_gformat833);
									gformat();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_gformat835); if (state.failed) return;
									}
									break;

								default :
									break loop58;
								}
							}

							pushFollow(FOLLOW_gformat_in_gformat839);
							gformat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_gformat843); if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:74:4: 'not' '(' ( ( gformat ',' )* gformat )? ')'
					{
					match(input,55,FOLLOW_55_in_gformat848); if (state.failed) return;
					match(input,18,FOLLOW_18_in_gformat850); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:74:14: ( ( gformat ',' )* gformat )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==ID||LA61_0==18||(LA61_0 >= 53 && LA61_0 <= 55)) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:74:15: ( gformat ',' )* gformat
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:74:15: ( gformat ',' )*
							loop60:
							while (true) {
								int alt60=2;
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
								switch (alt60) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:74:16: gformat ','
									{
									pushFollow(FOLLOW_gformat_in_gformat854);
									gformat();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_gformat856); if (state.failed) return;
									}
									break;

								default :
									break loop60;
								}
							}

							pushFollow(FOLLOW_gformat_in_gformat860);
							gformat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_gformat864); if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:4: '(' ( ( gformat ',' )* gformat )? gformat ')'
					{
					match(input,18,FOLLOW_18_in_gformat869); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:8: ( ( gformat ',' )* gformat )?
					int alt63=2;
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
					switch (alt63) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:9: ( gformat ',' )* gformat
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:9: ( gformat ',' )*
							loop62:
							while (true) {
								int alt62=2;
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
								switch (alt62) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:10: gformat ','
									{
									pushFollow(FOLLOW_gformat_in_gformat873);
									gformat();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_gformat875); if (state.failed) return;
									}
									break;

								default :
									break loop62;
								}
							}

							pushFollow(FOLLOW_gformat_in_gformat879);
							gformat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_gformat_in_gformat883);
					gformat();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_gformat885); if (state.failed) return;
					}
					break;
				case 5 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:76:4: 'new' ident ( '[' ( fbinding )? ']' )?
					{
					match(input,54,FOLLOW_54_in_gformat890); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_gformat892);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:76:16: ( '[' ( fbinding )? ']' )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==34) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:76:18: '[' ( fbinding )? ']'
							{
							match(input,34,FOLLOW_34_in_gformat896); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:76:22: ( fbinding )?
							int alt64=2;
							int LA64_0 = input.LA(1);
							if ( (LA64_0==ID||LA64_0==16) ) {
								alt64=1;
							}
							switch (alt64) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:76:24: fbinding
									{
									pushFollow(FOLLOW_fbinding_in_gformat900);
									fbinding();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,35,FOLLOW_35_in_gformat905); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 6 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:77:4: 'let' ident '=' gformat 'in' gformat
					{
					match(input,53,FOLLOW_53_in_gformat913); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_gformat915);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_gformat917); if (state.failed) return;
					pushFollow(FOLLOW_gformat_in_gformat919);
					gformat();
					state._fsp--;
					if (state.failed) return;
					match(input,50,FOLLOW_50_in_gformat921); if (state.failed) return;
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
	}
	// $ANTLR end "gformat"



	// $ANTLR start "fbinding"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:81:1: fbinding : ( '!' int '=' gformat ( ';' fbinding )? | ident '=' gformat ( ';' fbinding )? );
	public final void fbinding() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:82:2: ( '!' int '=' gformat ( ';' fbinding )? | ident '=' gformat ( ';' fbinding )? )
			int alt69=2;
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
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:82:4: '!' int '=' gformat ( ';' fbinding )?
					{
					match(input,16,FOLLOW_16_in_fbinding937); if (state.failed) return;
					pushFollow(FOLLOW_int_in_fbinding939);
					int();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_fbinding941); if (state.failed) return;
					pushFollow(FOLLOW_gformat_in_fbinding943);
					gformat();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:82:24: ( ';' fbinding )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==25) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:82:25: ';' fbinding
							{
							match(input,25,FOLLOW_25_in_fbinding946); if (state.failed) return;
							pushFollow(FOLLOW_fbinding_in_fbinding948);
							fbinding();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:83:5: ident '=' gformat ( ';' fbinding )?
					{
					pushFollow(FOLLOW_ident_in_fbinding956);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_fbinding958); if (state.failed) return;
					pushFollow(FOLLOW_gformat_in_fbinding960);
					gformat();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:83:23: ( ';' fbinding )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==25) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:83:24: ';' fbinding
							{
							match(input,25,FOLLOW_25_in_fbinding963); if (state.failed) return;
							pushFollow(FOLLOW_fbinding_in_fbinding965);
							fbinding();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

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
	}
	// $ANTLR end "fbinding"



	// $ANTLR start "clauses"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:87:1: clauses : ( 'forall' failtypedecl ';' )? clause ( ';' clauses )? ;
	public final void clauses() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:88:2: ( ( 'forall' failtypedecl ';' )? clause ( ';' clauses )? )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:88:4: ( 'forall' failtypedecl ';' )? clause ( ';' clauses )?
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:88:4: ( 'forall' failtypedecl ';' )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==44) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:88:5: 'forall' failtypedecl ';'
					{
					match(input,44,FOLLOW_44_in_clauses981); if (state.failed) return;
					pushFollow(FOLLOW_failtypedecl_in_clauses983);
					failtypedecl();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_clauses985); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_clause_in_clauses989);
			clause();
			state._fsp--;
			if (state.failed) return;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:88:40: ( ';' clauses )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==25) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:88:41: ';' clauses
					{
					match(input,25,FOLLOW_25_in_clauses992); if (state.failed) return;
					pushFollow(FOLLOW_clauses_in_clauses994);
					clauses();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "clauses"



	// $ANTLR start "clause"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:91:1: clause : ( term | term '->' term | term '<->' term | term '<=>' term );
	public final void clause() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:92:2: ( term | term '->' term | term '<->' term | term '<=>' term )
			int alt72=4;
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
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:92:4: term
					{
					pushFollow(FOLLOW_term_in_clause1009);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:93:4: term '->' term
					{
					pushFollow(FOLLOW_term_in_clause1014);
					term();
					state._fsp--;
					if (state.failed) return;
					match(input,21,FOLLOW_21_in_clause1016); if (state.failed) return;
					pushFollow(FOLLOW_term_in_clause1018);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:94:4: term '<->' term
					{
					pushFollow(FOLLOW_term_in_clause1023);
					term();
					state._fsp--;
					if (state.failed) return;
					match(input,27,FOLLOW_27_in_clause1025); if (state.failed) return;
					pushFollow(FOLLOW_term_in_clause1027);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:95:4: term '<=>' term
					{
					pushFollow(FOLLOW_term_in_clause1032);
					term();
					state._fsp--;
					if (state.failed) return;
					match(input,30,FOLLOW_30_in_clause1034); if (state.failed) return;
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
	}
	// $ANTLR end "clause"



	// $ANTLR start "process"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:98:1: process : ( '0' | 'yield' | ident ( '(' ( ( pterm ',' )* pterm )? ')' )? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )? | ident '<-R' typeid ( ';' process )? | 'if' pterm 'then' process ( 'else' process )? | 'in' '(' pterm ',' pattern ')' ( ';' process )? | 'out' '(' pterm ',' pterm ')' ( ';' process )? | 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )? | ident ( ':' typeid )? '<-' pterm ( ';' process )? | 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )? | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )? | 'phase' int ( ';' process )? ) ( '|' process )* ;
	public final void process() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:2: ( ( '0' | 'yield' | ident ( '(' ( ( pterm ',' )* pterm )? ')' )? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )? | ident '<-R' typeid ( ';' process )? | 'if' pterm 'then' process ( 'else' process )? | 'in' '(' pterm ',' pattern ')' ( ';' process )? | 'out' '(' pterm ',' pterm ')' ( ';' process )? | 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )? | ident ( ':' typeid )? '<-' pterm ( ';' process )? | 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )? | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )? | 'phase' int ( ';' process )? ) ( '|' process )* )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:4: ( '0' | 'yield' | ident ( '(' ( ( pterm ',' )* pterm )? ')' )? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )? | ident '<-R' typeid ( ';' process )? | 'if' pterm 'then' process ( 'else' process )? | 'in' '(' pterm ',' pattern ')' ( ';' process )? | 'out' '(' pterm ',' pterm ')' ( ';' process )? | 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )? | ident ( ':' typeid )? '<-' pterm ( ';' process )? | 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )? | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )? | 'phase' int ( ';' process )? ) ( '|' process )*
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:4: ( '0' | 'yield' | ident ( '(' ( ( pterm ',' )* pterm )? ')' )? | '(' process ')' | '!' process | '!' ident '<=' ident process | 'foreach' ident '<=' ident 'do' process | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )? | ident '<-R' typeid ( ';' process )? | 'if' pterm 'then' process ( 'else' process )? | 'in' '(' pterm ',' pattern ')' ( ';' process )? | 'out' '(' pterm ',' pterm ')' ( ';' process )? | 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )? | ident ( ':' typeid )? '<-' pterm ( ';' process )? | 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )? | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )? | 'phase' int ( ';' process )? )
			int alt103=19;
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
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:5: '0'
					{
					match(input,23,FOLLOW_23_in_process1048); if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:11: 'yield'
					{
					match(input,71,FOLLOW_71_in_process1052); if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:21: ident ( '(' ( ( pterm ',' )* pterm )? ')' )?
					{
					pushFollow(FOLLOW_ident_in_process1056);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:27: ( '(' ( ( pterm ',' )* pterm )? ')' )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==18) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:29: '(' ( ( pterm ',' )* pterm )? ')'
							{
							match(input,18,FOLLOW_18_in_process1060); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:33: ( ( pterm ',' )* pterm )?
							int alt74=2;
							int LA74_0 = input.LA(1);
							if ( (LA74_0==ID||LA74_0==18||LA74_0==37||LA74_0==42||(LA74_0 >= 48 && LA74_0 <= 49)||(LA74_0 >= 52 && LA74_0 <= 55)) ) {
								alt74=1;
							}
							switch (alt74) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:34: ( pterm ',' )* pterm
									{
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:34: ( pterm ',' )*
									loop73:
									while (true) {
										int alt73=2;
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
										switch (alt73) {
										case 1 :
											// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:35: pterm ','
											{
											pushFollow(FOLLOW_pterm_in_process1064);
											pterm();
											state._fsp--;
											if (state.failed) return;
											match(input,20,FOLLOW_20_in_process1066); if (state.failed) return;
											}
											break;

										default :
											break loop73;
										}
									}

									pushFollow(FOLLOW_pterm_in_process1070);
									pterm();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,19,FOLLOW_19_in_process1074); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:63: '(' process ')'
					{
					match(input,18,FOLLOW_18_in_process1080); if (state.failed) return;
					pushFollow(FOLLOW_process_in_process1082);
					process();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_process1084); if (state.failed) return;
					}
					break;
				case 5 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:81: '!' process
					{
					match(input,16,FOLLOW_16_in_process1088); if (state.failed) return;
					pushFollow(FOLLOW_process_in_process1090);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:95: '!' ident '<=' ident process
					{
					match(input,16,FOLLOW_16_in_process1094); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_process1096);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,29,FOLLOW_29_in_process1098); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_process1100);
					ident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_process_in_process1102);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:126: 'foreach' ident '<=' ident 'do' process
					{
					match(input,45,FOLLOW_45_in_process1106); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_process1108);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,29,FOLLOW_29_in_process1110); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_process1112);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,39,FOLLOW_39_in_process1114); if (state.failed) return;
					pushFollow(FOLLOW_process_in_process1116);
					process();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:168: 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ( ';' process )?
					{
					match(input,54,FOLLOW_54_in_process1120); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_process1122);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:180: ( '[' ( ( ident ',' )* ident )? ']' )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==34) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:182: '[' ( ( ident ',' )* ident )? ']'
							{
							match(input,34,FOLLOW_34_in_process1126); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:186: ( ( ident ',' )* ident )?
							int alt77=2;
							int LA77_0 = input.LA(1);
							if ( (LA77_0==ID) ) {
								alt77=1;
							}
							switch (alt77) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:187: ( ident ',' )* ident
									{
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:187: ( ident ',' )*
									loop76:
									while (true) {
										int alt76=2;
										int LA76_0 = input.LA(1);
										if ( (LA76_0==ID) ) {
											int LA76_1 = input.LA(2);
											if ( (LA76_1==20) ) {
												alt76=1;
											}

										}

										switch (alt76) {
										case 1 :
											// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:188: ident ','
											{
											pushFollow(FOLLOW_ident_in_process1130);
											ident();
											state._fsp--;
											if (state.failed) return;
											match(input,20,FOLLOW_20_in_process1132); if (state.failed) return;
											}
											break;

										default :
											break loop76;
										}
									}

									pushFollow(FOLLOW_ident_in_process1136);
									ident();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,35,FOLLOW_35_in_process1140); if (state.failed) return;
							}
							break;

					}

					match(input,24,FOLLOW_24_in_process1145); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_process1147);
					typeid();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:226: ( ';' process )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==25) ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:227: ';' process
							{
							match(input,25,FOLLOW_25_in_process1150); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1152);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 9 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:244: ident '<-R' typeid ( ';' process )?
					{
					pushFollow(FOLLOW_ident_in_process1159);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,28,FOLLOW_28_in_process1161); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_process1163);
					typeid();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:263: ( ';' process )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==25) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:264: ';' process
							{
							match(input,25,FOLLOW_25_in_process1166); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1168);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 10 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:281: 'if' pterm 'then' process ( 'else' process )?
					{
					match(input,49,FOLLOW_49_in_process1175); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_process1177);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,69,FOLLOW_69_in_process1179); if (state.failed) return;
					pushFollow(FOLLOW_process_in_process1181);
					process();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:307: ( 'else' process )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==40) ) {
						int LA81_1 = input.LA(2);
						if ( (synpred120_proverif()) ) {
							alt81=1;
						}
					}
					switch (alt81) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:308: 'else' process
							{
							match(input,40,FOLLOW_40_in_process1184); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1186);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 11 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:328: 'in' '(' pterm ',' pattern ')' ( ';' process )?
					{
					match(input,50,FOLLOW_50_in_process1193); if (state.failed) return;
					match(input,18,FOLLOW_18_in_process1195); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_process1196);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,20,FOLLOW_20_in_process1198); if (state.failed) return;
					pushFollow(FOLLOW_pattern_in_process1200);
					pattern();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_process1202); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:358: ( ';' process )?
					int alt82=2;
					int LA82_0 = input.LA(1);
					if ( (LA82_0==25) ) {
						alt82=1;
					}
					switch (alt82) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:359: ';' process
							{
							match(input,25,FOLLOW_25_in_process1205); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1207);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 12 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:375: 'out' '(' pterm ',' pterm ')' ( ';' process )?
					{
					match(input,59,FOLLOW_59_in_process1213); if (state.failed) return;
					match(input,18,FOLLOW_18_in_process1215); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_process1216);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,20,FOLLOW_20_in_process1218); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_process1220);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_process1221); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:403: ( ';' process )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==25) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:404: ';' process
							{
							match(input,25,FOLLOW_25_in_process1224); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1225);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 13 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:419: 'let' pattern '=' pterm ( 'in' process ( 'else' process )? )?
					{
					match(input,53,FOLLOW_53_in_process1231); if (state.failed) return;
					pushFollow(FOLLOW_pattern_in_process1233);
					pattern();
					state._fsp--;
					if (state.failed) return;
					match(input,32,FOLLOW_32_in_process1235); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_process1237);
					pterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:443: ( 'in' process ( 'else' process )? )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==50) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:444: 'in' process ( 'else' process )?
							{
							match(input,50,FOLLOW_50_in_process1240); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1242);
							process();
							state._fsp--;
							if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:457: ( 'else' process )?
							int alt84=2;
							int LA84_0 = input.LA(1);
							if ( (LA84_0==40) ) {
								int LA84_1 = input.LA(2);
								if ( (synpred126_proverif()) ) {
									alt84=1;
								}
							}
							switch (alt84) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:458: 'else' process
									{
									match(input,40,FOLLOW_40_in_process1245); if (state.failed) return;
									pushFollow(FOLLOW_process_in_process1247);
									process();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 14 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:480: ident ( ':' typeid )? '<-' pterm ( ';' process )?
					{
					pushFollow(FOLLOW_ident_in_process1256);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:486: ( ':' typeid )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==24) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:487: ':' typeid
							{
							match(input,24,FOLLOW_24_in_process1259); if (state.failed) return;
							pushFollow(FOLLOW_typeid_in_process1261);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,26,FOLLOW_26_in_process1266); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_process1268);
					pterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:512: ( ';' process )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==25) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:513: ';' process
							{
							match(input,25,FOLLOW_25_in_process1271); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1273);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 15 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:529: 'let' typedecl 'suchthat' pterm ( 'in' process ( 'else' process )? )?
					{
					match(input,53,FOLLOW_53_in_process1279); if (state.failed) return;
					pushFollow(FOLLOW_typedecl_in_process1281);
					typedecl();
					state._fsp--;
					if (state.failed) return;
					match(input,67,FOLLOW_67_in_process1283); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_process1285);
					pterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:561: ( 'in' process ( 'else' process )? )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==50) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:562: 'in' process ( 'else' process )?
							{
							match(input,50,FOLLOW_50_in_process1288); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1290);
							process();
							state._fsp--;
							if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:575: ( 'else' process )?
							int alt88=2;
							int LA88_0 = input.LA(1);
							if ( (LA88_0==40) ) {
								int LA88_1 = input.LA(2);
								if ( (synpred132_proverif()) ) {
									alt88=1;
								}
							}
							switch (alt88) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:576: 'else' process
									{
									match(input,40,FOLLOW_40_in_process1293); if (state.failed) return;
									pushFollow(FOLLOW_process_in_process1295);
									process();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 16 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:598: 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ( ';' process )?
					{
					match(input,52,FOLLOW_52_in_process1304); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_process1306);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_process1308); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:617: ( ( pterm ',' )* pterm )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==ID||LA91_0==18||LA91_0==37||LA91_0==42||(LA91_0 >= 48 && LA91_0 <= 49)||(LA91_0 >= 52 && LA91_0 <= 55)) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:618: ( pterm ',' )* pterm
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:618: ( pterm ',' )*
							loop90:
							while (true) {
								int alt90=2;
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
								switch (alt90) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:619: pterm ','
									{
									pushFollow(FOLLOW_pterm_in_process1312);
									pterm();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_process1314); if (state.failed) return;
									}
									break;

								default :
									break loop90;
								}
							}

							pushFollow(FOLLOW_pterm_in_process1318);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_process1322); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:643: ( ';' process )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==25) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:644: ';' process
							{
							match(input,25,FOLLOW_25_in_process1325); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1327);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 17 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:660: 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? ( 'in' process ( 'else' process )? )?
					{
					match(input,48,FOLLOW_48_in_process1333); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_process1335);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_process1337); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:676: ( ( pattern ',' )* pattern )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==ID||LA94_0==18||LA94_0==32) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:677: ( pattern ',' )* pattern
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:677: ( pattern ',' )*
							loop93:
							while (true) {
								int alt93=2;
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
								switch (alt93) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:678: pattern ','
									{
									pushFollow(FOLLOW_pattern_in_process1341);
									pattern();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_process1343); if (state.failed) return;
									}
									break;

								default :
									break loop93;
								}
							}

							pushFollow(FOLLOW_pattern_in_process1347);
							pattern();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_process1351); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:706: ( 'suchthat' pterm )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==67) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:707: 'suchthat' pterm
							{
							match(input,67,FOLLOW_67_in_process1354); if (state.failed) return;
							pushFollow(FOLLOW_pterm_in_process1356);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:726: ( 'in' process ( 'else' process )? )?
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==50) ) {
						alt97=1;
					}
					switch (alt97) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:727: 'in' process ( 'else' process )?
							{
							match(input,50,FOLLOW_50_in_process1361); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1363);
							process();
							state._fsp--;
							if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:740: ( 'else' process )?
							int alt96=2;
							int LA96_0 = input.LA(1);
							if ( (LA96_0==40) ) {
								int LA96_1 = input.LA(2);
								if ( (synpred142_proverif()) ) {
									alt96=1;
								}
							}
							switch (alt96) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:741: 'else' process
									{
									match(input,40,FOLLOW_40_in_process1366); if (state.failed) return;
									pushFollow(FOLLOW_process_in_process1368);
									process();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 18 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:763: 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ( ';' process )?
					{
					match(input,42,FOLLOW_42_in_process1377); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_process1379);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:777: ( '(' ( ( pterm ',' )* pterm )? ')' )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==18) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:779: '(' ( ( pterm ',' )* pterm )? ')'
							{
							match(input,18,FOLLOW_18_in_process1383); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:782: ( ( pterm ',' )* pterm )?
							int alt99=2;
							int LA99_0 = input.LA(1);
							if ( (LA99_0==ID||LA99_0==18||LA99_0==37||LA99_0==42||(LA99_0 >= 48 && LA99_0 <= 49)||(LA99_0 >= 52 && LA99_0 <= 55)) ) {
								alt99=1;
							}
							switch (alt99) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:783: ( pterm ',' )* pterm
									{
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:783: ( pterm ',' )*
									loop98:
									while (true) {
										int alt98=2;
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
										switch (alt98) {
										case 1 :
											// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:784: pterm ','
											{
											pushFollow(FOLLOW_pterm_in_process1386);
											pterm();
											state._fsp--;
											if (state.failed) return;
											match(input,20,FOLLOW_20_in_process1388); if (state.failed) return;
											}
											break;

										default :
											break loop98;
										}
									}

									pushFollow(FOLLOW_pterm_in_process1392);
									pterm();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,19,FOLLOW_19_in_process1396); if (state.failed) return;
							}
							break;

					}

					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:811: ( ';' process )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==25) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:812: ';' process
							{
							match(input,25,FOLLOW_25_in_process1402); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1404);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 19 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:828: 'phase' int ( ';' process )?
					{
					match(input,60,FOLLOW_60_in_process1410); if (state.failed) return;
					pushFollow(FOLLOW_int_in_process1412);
					int();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:840: ( ';' process )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==25) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:841: ';' process
							{
							match(input,25,FOLLOW_25_in_process1415); if (state.failed) return;
							pushFollow(FOLLOW_process_in_process1417);
							process();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:856: ( '|' process )*
			loop104:
			while (true) {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==72) ) {
					int LA104_2 = input.LA(2);
					if ( (synpred151_proverif()) ) {
						alt104=1;
					}

				}

				switch (alt104) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:857: '|' process
					{
					match(input,72,FOLLOW_72_in_process1423); if (state.failed) return;
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

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "process"



	// $ANTLR start "pterm"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:103:1: pterm : ( ident | '(' ( ( pterm ',' )* pterm )? ')' | ident '(' ( ( pterm ',' )* pterm )? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ( 'else' pterm )? | 'let' pattern | ident ( ':' typeid )? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm ) ( '=' pterm | '<>' pterm | '&&' pterm | '||' pterm )* ;
	public final void pterm() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:2: ( ( ident | '(' ( ( pterm ',' )* pterm )? ')' | ident '(' ( ( pterm ',' )* pterm )? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ( 'else' pterm )? | 'let' pattern | ident ( ':' typeid )? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm ) ( '=' pterm | '<>' pterm | '&&' pterm | '||' pterm )* )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:4: ( ident | '(' ( ( pterm ',' )* pterm )? ')' | ident '(' ( ( pterm ',' )* pterm )? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ( 'else' pterm )? | 'let' pattern | ident ( ':' typeid )? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm ) ( '=' pterm | '<>' pterm | '&&' pterm | '||' pterm )*
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:4: ( ident | '(' ( ( pterm ',' )* pterm )? ')' | ident '(' ( ( pterm ',' )* pterm )? ')' | 'choice' '[' pterm ',' pterm ']' | 'not' '(' pterm ')' | 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm | ident '<-R' typeid ';' pterm | 'if' pterm 'then' pterm ( 'else' pterm )? | 'let' pattern | ident ( ':' typeid )? '<-' pterm ';' pterm | 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? | 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm | 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )? | 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm )
			int alt124=14;
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
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:5: ident
					{
					pushFollow(FOLLOW_ident_in_pterm1441);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:13: '(' ( ( pterm ',' )* pterm )? ')'
					{
					match(input,18,FOLLOW_18_in_pterm1445); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:17: ( ( pterm ',' )* pterm )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==ID||LA106_0==18||LA106_0==37||LA106_0==42||(LA106_0 >= 48 && LA106_0 <= 49)||(LA106_0 >= 52 && LA106_0 <= 55)) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:18: ( pterm ',' )* pterm
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:18: ( pterm ',' )*
							loop105:
							while (true) {
								int alt105=2;
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
								switch (alt105) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:19: pterm ','
									{
									pushFollow(FOLLOW_pterm_in_pterm1449);
									pterm();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_pterm1451); if (state.failed) return;
									}
									break;

								default :
									break loop105;
								}
							}

							pushFollow(FOLLOW_pterm_in_pterm1455);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_pterm1459); if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:45: ident '(' ( ( pterm ',' )* pterm )? ')'
					{
					pushFollow(FOLLOW_ident_in_pterm1463);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_pterm1465); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:55: ( ( pterm ',' )* pterm )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==ID||LA108_0==18||LA108_0==37||LA108_0==42||(LA108_0 >= 48 && LA108_0 <= 49)||(LA108_0 >= 52 && LA108_0 <= 55)) ) {
						alt108=1;
					}
					switch (alt108) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:56: ( pterm ',' )* pterm
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:56: ( pterm ',' )*
							loop107:
							while (true) {
								int alt107=2;
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
								switch (alt107) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:57: pterm ','
									{
									pushFollow(FOLLOW_pterm_in_pterm1469);
									pterm();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_pterm1471); if (state.failed) return;
									}
									break;

								default :
									break loop107;
								}
							}

							pushFollow(FOLLOW_pterm_in_pterm1475);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_pterm1479); if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:83: 'choice' '[' pterm ',' pterm ']'
					{
					match(input,37,FOLLOW_37_in_pterm1483); if (state.failed) return;
					match(input,34,FOLLOW_34_in_pterm1485); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1487);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,20,FOLLOW_20_in_pterm1489); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1491);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,35,FOLLOW_35_in_pterm1493); if (state.failed) return;
					}
					break;
				case 5 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:118: 'not' '(' pterm ')'
					{
					match(input,55,FOLLOW_55_in_pterm1497); if (state.failed) return;
					match(input,18,FOLLOW_18_in_pterm1499); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1501);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_pterm1503); if (state.failed) return;
					}
					break;
				case 6 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:140: 'new' ident ( '[' ( ( ident ',' )* ident )? ']' )? ':' typeid ';' pterm
					{
					match(input,54,FOLLOW_54_in_pterm1507); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_pterm1509);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:152: ( '[' ( ( ident ',' )* ident )? ']' )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==34) ) {
						alt111=1;
					}
					switch (alt111) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:153: '[' ( ( ident ',' )* ident )? ']'
							{
							match(input,34,FOLLOW_34_in_pterm1512); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:157: ( ( ident ',' )* ident )?
							int alt110=2;
							int LA110_0 = input.LA(1);
							if ( (LA110_0==ID) ) {
								alt110=1;
							}
							switch (alt110) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:158: ( ident ',' )* ident
									{
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:158: ( ident ',' )*
									loop109:
									while (true) {
										int alt109=2;
										int LA109_0 = input.LA(1);
										if ( (LA109_0==ID) ) {
											int LA109_1 = input.LA(2);
											if ( (LA109_1==20) ) {
												alt109=1;
											}

										}

										switch (alt109) {
										case 1 :
											// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:159: ident ','
											{
											pushFollow(FOLLOW_ident_in_pterm1516);
											ident();
											state._fsp--;
											if (state.failed) return;
											match(input,20,FOLLOW_20_in_pterm1518); if (state.failed) return;
											}
											break;

										default :
											break loop109;
										}
									}

									pushFollow(FOLLOW_ident_in_pterm1522);
									ident();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,35,FOLLOW_35_in_pterm1526); if (state.failed) return;
							}
							break;

					}

					match(input,24,FOLLOW_24_in_pterm1530); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_pterm1532);
					typeid();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_pterm1534); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1536);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:208: ident '<-R' typeid ';' pterm
					{
					pushFollow(FOLLOW_ident_in_pterm1540);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,28,FOLLOW_28_in_pterm1542); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_pterm1544);
					typeid();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_pterm1546); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1548);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:239: 'if' pterm 'then' pterm ( 'else' pterm )?
					{
					match(input,49,FOLLOW_49_in_pterm1552); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1554);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,69,FOLLOW_69_in_pterm1556); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1558);
					pterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:263: ( 'else' pterm )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==40) ) {
						int LA112_1 = input.LA(2);
						if ( (synpred166_proverif()) ) {
							alt112=1;
						}
					}
					switch (alt112) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:264: 'else' pterm
							{
							match(input,40,FOLLOW_40_in_pterm1561); if (state.failed) return;
							pushFollow(FOLLOW_pterm_in_pterm1563);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 9 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:281: 'let' pattern
					{
					match(input,53,FOLLOW_53_in_pterm1569); if (state.failed) return;
					pushFollow(FOLLOW_pattern_in_pterm1571);
					pattern();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:297: ident ( ':' typeid )? '<-' pterm ';' pterm
					{
					pushFollow(FOLLOW_ident_in_pterm1575);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:303: ( ':' typeid )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==24) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:304: ':' typeid
							{
							match(input,24,FOLLOW_24_in_pterm1578); if (state.failed) return;
							pushFollow(FOLLOW_typeid_in_pterm1580);
							typeid();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,26,FOLLOW_26_in_pterm1584); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1586);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_pterm1588); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1590);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:340: 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )?
					{
					match(input,53,FOLLOW_53_in_pterm1594); if (state.failed) return;
					pushFollow(FOLLOW_typedecl_in_pterm1596);
					typedecl();
					state._fsp--;
					if (state.failed) return;
					match(input,67,FOLLOW_67_in_pterm1598); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1600);
					pterm();
					state._fsp--;
					if (state.failed) return;
					match(input,50,FOLLOW_50_in_pterm1602); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1604);
					pterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:383: ( 'else' pterm )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==40) ) {
						int LA114_1 = input.LA(2);
						if ( (synpred171_proverif()) ) {
							alt114=1;
						}
					}
					switch (alt114) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:384: 'else' pterm
							{
							match(input,40,FOLLOW_40_in_pterm1607); if (state.failed) return;
							pushFollow(FOLLOW_pterm_in_pterm1609);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 12 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:401: 'insert' ident '(' ( ( pterm ',' )* pterm )? ')' ';' pterm
					{
					match(input,52,FOLLOW_52_in_pterm1615); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_pterm1617);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_pterm1619); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:420: ( ( pterm ',' )* pterm )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( (LA116_0==ID||LA116_0==18||LA116_0==37||LA116_0==42||(LA116_0 >= 48 && LA116_0 <= 49)||(LA116_0 >= 52 && LA116_0 <= 55)) ) {
						alt116=1;
					}
					switch (alt116) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:421: ( pterm ',' )* pterm
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:421: ( pterm ',' )*
							loop115:
							while (true) {
								int alt115=2;
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
								switch (alt115) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:422: pterm ','
									{
									pushFollow(FOLLOW_pterm_in_pterm1623);
									pterm();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_pterm1625); if (state.failed) return;
									}
									break;

								default :
									break loop115;
								}
							}

							pushFollow(FOLLOW_pterm_in_pterm1629);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_pterm1633); if (state.failed) return;
					match(input,25,FOLLOW_25_in_pterm1635); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1637);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:458: 'get' ident '(' ( ( pattern ',' )* pattern )? ')' ( 'suchthat' pterm )? 'in' pterm ( 'else' pterm )?
					{
					match(input,48,FOLLOW_48_in_pterm1641); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_pterm1643);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_pterm1645); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:474: ( ( pattern ',' )* pattern )?
					int alt118=2;
					int LA118_0 = input.LA(1);
					if ( (LA118_0==ID||LA118_0==18||LA118_0==32) ) {
						alt118=1;
					}
					switch (alt118) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:475: ( pattern ',' )* pattern
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:475: ( pattern ',' )*
							loop117:
							while (true) {
								int alt117=2;
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
								switch (alt117) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:476: pattern ','
									{
									pushFollow(FOLLOW_pattern_in_pterm1649);
									pattern();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_pterm1651); if (state.failed) return;
									}
									break;

								default :
									break loop117;
								}
							}

							pushFollow(FOLLOW_pattern_in_pterm1655);
							pattern();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_pterm1659); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:504: ( 'suchthat' pterm )?
					int alt119=2;
					int LA119_0 = input.LA(1);
					if ( (LA119_0==67) ) {
						alt119=1;
					}
					switch (alt119) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:505: 'suchthat' pterm
							{
							match(input,67,FOLLOW_67_in_pterm1662); if (state.failed) return;
							pushFollow(FOLLOW_pterm_in_pterm1664);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,50,FOLLOW_50_in_pterm1668); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1670);
					pterm();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:535: ( 'else' pterm )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==40) ) {
						int LA120_1 = input.LA(2);
						if ( (synpred179_proverif()) ) {
							alt120=1;
						}
					}
					switch (alt120) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:536: 'else' pterm
							{
							match(input,40,FOLLOW_40_in_pterm1673); if (state.failed) return;
							pushFollow(FOLLOW_pterm_in_pterm1675);
							pterm();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 14 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:553: 'event' ident ( '(' ( ( pterm ',' )* pterm )? ')' )? ';' pterm
					{
					match(input,42,FOLLOW_42_in_pterm1681); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_pterm1683);
					ident();
					state._fsp--;
					if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:567: ( '(' ( ( pterm ',' )* pterm )? ')' )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==18) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:568: '(' ( ( pterm ',' )* pterm )? ')'
							{
							match(input,18,FOLLOW_18_in_pterm1686); if (state.failed) return;
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:572: ( ( pterm ',' )* pterm )?
							int alt122=2;
							int LA122_0 = input.LA(1);
							if ( (LA122_0==ID||LA122_0==18||LA122_0==37||LA122_0==42||(LA122_0 >= 48 && LA122_0 <= 49)||(LA122_0 >= 52 && LA122_0 <= 55)) ) {
								alt122=1;
							}
							switch (alt122) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:573: ( pterm ',' )* pterm
									{
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:573: ( pterm ',' )*
									loop121:
									while (true) {
										int alt121=2;
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
										switch (alt121) {
										case 1 :
											// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:574: pterm ','
											{
											pushFollow(FOLLOW_pterm_in_pterm1690);
											pterm();
											state._fsp--;
											if (state.failed) return;
											match(input,20,FOLLOW_20_in_pterm1692); if (state.failed) return;
											}
											break;

										default :
											break loop121;
										}
									}

									pushFollow(FOLLOW_pterm_in_pterm1696);
									pterm();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							match(input,19,FOLLOW_19_in_pterm1700); if (state.failed) return;
							}
							break;

					}

					match(input,25,FOLLOW_25_in_pterm1704); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1706);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:611: ( '=' pterm | '<>' pterm | '&&' pterm | '||' pterm )*
			loop125:
			while (true) {
				int alt125=5;
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
				switch (alt125) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:612: '=' pterm
					{
					match(input,32,FOLLOW_32_in_pterm1710); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1712);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:624: '<>' pterm
					{
					match(input,31,FOLLOW_31_in_pterm1716); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1718);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:637: '&&' pterm
					{
					match(input,17,FOLLOW_17_in_pterm1722); if (state.failed) return;
					pushFollow(FOLLOW_pterm_in_pterm1724);
					pterm();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:650: '||' pterm
					{
					match(input,73,FOLLOW_73_in_pterm1728); if (state.failed) return;
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

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pterm"



	// $ANTLR start "term"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:108:1: term : ( '(' ( ( term ',' )* term )? ')' | ident '(' ( ( term ',' )* term )? ')' | 'not' '(' term ')' ) ( '=' term | '<>' term | '&&' term | '||' term )* ;
	public final void term() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:2: ( ( '(' ( ( term ',' )* term )? ')' | ident '(' ( ( term ',' )* term )? ')' | 'not' '(' term ')' ) ( '=' term | '<>' term | '&&' term | '||' term )* )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:4: ( '(' ( ( term ',' )* term )? ')' | ident '(' ( ( term ',' )* term )? ')' | 'not' '(' term ')' ) ( '=' term | '<>' term | '&&' term | '||' term )*
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:4: ( '(' ( ( term ',' )* term )? ')' | ident '(' ( ( term ',' )* term )? ')' | 'not' '(' term ')' )
			int alt130=3;
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
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:5: '(' ( ( term ',' )* term )? ')'
					{
					match(input,18,FOLLOW_18_in_term1746); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:9: ( ( term ',' )* term )?
					int alt127=2;
					int LA127_0 = input.LA(1);
					if ( (LA127_0==ID||LA127_0==18||LA127_0==55) ) {
						alt127=1;
					}
					switch (alt127) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:10: ( term ',' )* term
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:10: ( term ',' )*
							loop126:
							while (true) {
								int alt126=2;
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
								switch (alt126) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:11: term ','
									{
									pushFollow(FOLLOW_term_in_term1750);
									term();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_term1752); if (state.failed) return;
									}
									break;

								default :
									break loop126;
								}
							}

							pushFollow(FOLLOW_term_in_term1756);
							term();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_term1760); if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:35: ident '(' ( ( term ',' )* term )? ')'
					{
					pushFollow(FOLLOW_ident_in_term1764);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_term1766); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:45: ( ( term ',' )* term )?
					int alt129=2;
					int LA129_0 = input.LA(1);
					if ( (LA129_0==ID||LA129_0==18||LA129_0==55) ) {
						alt129=1;
					}
					switch (alt129) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:46: ( term ',' )* term
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:46: ( term ',' )*
							loop128:
							while (true) {
								int alt128=2;
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
								switch (alt128) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:47: term ','
									{
									pushFollow(FOLLOW_term_in_term1770);
									term();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_term1772); if (state.failed) return;
									}
									break;

								default :
									break loop128;
								}
							}

							pushFollow(FOLLOW_term_in_term1776);
							term();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_term1780); if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:71: 'not' '(' term ')'
					{
					match(input,55,FOLLOW_55_in_term1784); if (state.failed) return;
					match(input,18,FOLLOW_18_in_term1786); if (state.failed) return;
					pushFollow(FOLLOW_term_in_term1788);
					term();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_term1790); if (state.failed) return;
					}
					break;

			}

			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:91: ( '=' term | '<>' term | '&&' term | '||' term )*
			loop131:
			while (true) {
				int alt131=5;
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
				switch (alt131) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:92: '=' term
					{
					match(input,32,FOLLOW_32_in_term1794); if (state.failed) return;
					pushFollow(FOLLOW_term_in_term1796);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:103: '<>' term
					{
					match(input,31,FOLLOW_31_in_term1800); if (state.failed) return;
					pushFollow(FOLLOW_term_in_term1802);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:115: '&&' term
					{
					match(input,17,FOLLOW_17_in_term1806); if (state.failed) return;
					pushFollow(FOLLOW_term_in_term1808);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:127: '||' term
					{
					match(input,73,FOLLOW_73_in_term1812); if (state.failed) return;
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

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"



	// $ANTLR start "pattern"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:130:1: pattern : ( ident | ident ':' typeid | '(' ( ( pattern ',' )* pattern )? ')' | ident '(' ( ( pattern ',' )* pattern )? ')' | '=' pterm );
	public final void pattern() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:131:3: ( ident | ident ':' typeid | '(' ( ( pattern ',' )* pattern )? ')' | ident '(' ( ( pattern ',' )* pattern )? ')' | '=' pterm )
			int alt136=5;
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
				throw nvae;
			}
			switch (alt136) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:131:5: ident
					{
					pushFollow(FOLLOW_ident_in_pattern1834);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:132:4: ident ':' typeid
					{
					pushFollow(FOLLOW_ident_in_pattern1839);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,24,FOLLOW_24_in_pattern1841); if (state.failed) return;
					pushFollow(FOLLOW_typeid_in_pattern1843);
					typeid();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:133:4: '(' ( ( pattern ',' )* pattern )? ')'
					{
					match(input,18,FOLLOW_18_in_pattern1848); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:133:8: ( ( pattern ',' )* pattern )?
					int alt133=2;
					int LA133_0 = input.LA(1);
					if ( (LA133_0==ID||LA133_0==18||LA133_0==32) ) {
						alt133=1;
					}
					switch (alt133) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:133:9: ( pattern ',' )* pattern
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:133:9: ( pattern ',' )*
							loop132:
							while (true) {
								int alt132=2;
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
								switch (alt132) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:133:10: pattern ','
									{
									pushFollow(FOLLOW_pattern_in_pattern1852);
									pattern();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_pattern1854); if (state.failed) return;
									}
									break;

								default :
									break loop132;
								}
							}

							pushFollow(FOLLOW_pattern_in_pattern1858);
							pattern();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_pattern1862); if (state.failed) return;
					}
					break;
				case 4 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:134:4: ident '(' ( ( pattern ',' )* pattern )? ')'
					{
					pushFollow(FOLLOW_ident_in_pattern1867);
					ident();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_pattern1869); if (state.failed) return;
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:134:14: ( ( pattern ',' )* pattern )?
					int alt135=2;
					int LA135_0 = input.LA(1);
					if ( (LA135_0==ID||LA135_0==18||LA135_0==32) ) {
						alt135=1;
					}
					switch (alt135) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:134:15: ( pattern ',' )* pattern
							{
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:134:15: ( pattern ',' )*
							loop134:
							while (true) {
								int alt134=2;
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
								switch (alt134) {
								case 1 :
									// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:134:16: pattern ','
									{
									pushFollow(FOLLOW_pattern_in_pattern1873);
									pattern();
									state._fsp--;
									if (state.failed) return;
									match(input,20,FOLLOW_20_in_pattern1875); if (state.failed) return;
									}
									break;

								default :
									break loop134;
								}
							}

							pushFollow(FOLLOW_pattern_in_pattern1879);
							pattern();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,19,FOLLOW_19_in_pattern1883); if (state.failed) return;
					}
					break;
				case 5 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:135:4: '=' pterm
					{
					match(input,32,FOLLOW_32_in_pattern1888); if (state.failed) return;
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
	}
	// $ANTLR end "pattern"



	// $ANTLR start "mayfailterm"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:138:1: mayfailterm : ( term | 'fail' );
	public final void mayfailterm() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:139:2: ( term | 'fail' )
			int alt137=2;
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
				throw nvae;
			}

			switch (alt137) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:139:4: term
					{
					pushFollow(FOLLOW_term_in_mayfailterm1901);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:140:4: 'fail'
					{
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
	}
	// $ANTLR end "mayfailterm"



	// $ANTLR start "typedecl"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:143:1: typedecl : ident ':' typeid ( ',' typedecl )? ;
	public final void typedecl() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:144:2: ( ident ':' typeid ( ',' typedecl )? )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:144:4: ident ':' typeid ( ',' typedecl )?
			{
			pushFollow(FOLLOW_ident_in_typedecl1917);
			ident();
			state._fsp--;
			if (state.failed) return;
			match(input,24,FOLLOW_24_in_typedecl1919); if (state.failed) return;
			pushFollow(FOLLOW_typeid_in_typedecl1921);
			typeid();
			state._fsp--;
			if (state.failed) return;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:144:21: ( ',' typedecl )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==20) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:144:22: ',' typedecl
					{
					match(input,20,FOLLOW_20_in_typedecl1924); if (state.failed) return;
					pushFollow(FOLLOW_typedecl_in_typedecl1926);
					typedecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typedecl"



	// $ANTLR start "failtypedecl"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:147:1: failtypedecl : ident ':' typeid ( 'or' 'fail' )? ( ',' typedecl )? ;
	public final void failtypedecl() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:148:2: ( ident ':' typeid ( 'or' 'fail' )? ( ',' typedecl )? )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:148:4: ident ':' typeid ( 'or' 'fail' )? ( ',' typedecl )?
			{
			pushFollow(FOLLOW_ident_in_failtypedecl1939);
			ident();
			state._fsp--;
			if (state.failed) return;
			match(input,24,FOLLOW_24_in_failtypedecl1941); if (state.failed) return;
			pushFollow(FOLLOW_typeid_in_failtypedecl1943);
			typeid();
			state._fsp--;
			if (state.failed) return;
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:148:21: ( 'or' 'fail' )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==57) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:148:22: 'or' 'fail'
					{
					match(input,57,FOLLOW_57_in_failtypedecl1946); if (state.failed) return;
					match(input,43,FOLLOW_43_in_failtypedecl1948); if (state.failed) return;
					}
					break;

			}

			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:148:36: ( ',' typedecl )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==20) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:148:37: ',' typedecl
					{
					match(input,20,FOLLOW_20_in_failtypedecl1953); if (state.failed) return;
					pushFollow(FOLLOW_typedecl_in_failtypedecl1955);
					typedecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "failtypedecl"



	// $ANTLR start "proverifOptions"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:151:1: proverifOptions : ( ( ident ',' )* ident )? ;
	public final void proverifOptions() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:152:2: ( ( ( ident ',' )* ident )? )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:152:4: ( ( ident ',' )* ident )?
			{
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:152:4: ( ( ident ',' )* ident )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==ID) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:152:5: ( ident ',' )* ident
					{
					// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:152:5: ( ident ',' )*
					loop141:
					while (true) {
						int alt141=2;
						int LA141_0 = input.LA(1);
						if ( (LA141_0==ID) ) {
							int LA141_1 = input.LA(2);
							if ( (LA141_1==20) ) {
								alt141=1;
							}

						}

						switch (alt141) {
						case 1 :
							// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:152:6: ident ','
							{
							pushFollow(FOLLOW_ident_in_proverifOptions1970);
							ident();
							state._fsp--;
							if (state.failed) return;
							match(input,20,FOLLOW_20_in_proverifOptions1972); if (state.failed) return;
							}
							break;

						default :
							break loop141;
						}
					}

					pushFollow(FOLLOW_ident_in_proverifOptions1976);
					ident();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "proverifOptions"



	// $ANTLR start "ident"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:155:1: ident : ID ;
	public final void ident() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:156:2: ( ID )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:156:4: ID
			{
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
	}
	// $ANTLR end "ident"



	// $ANTLR start "id"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:159:1: id : ID ;
	public final void id() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:160:2: ( ID )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:160:4: ID
			{
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
	}
	// $ANTLR end "id"



	// $ANTLR start "int"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:163:1: int : INT ;
	public final void int() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:164:2: ( INT )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:164:4: INT
			{
			match(input,INT,FOLLOW_INT_in_int2013); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "int"



	// $ANTLR start "typeid"
	// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:167:1: typeid : ID ;
	public final void typeid() throws RecognitionException {
		try {
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:168:2: ( ID )
			// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:168:4: ID
			{
			match(input,ID,FOLLOW_ID_in_typeid2024); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeid"

	// $ANTLR start synpred11_proverif
	public final void synpred11_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:4: ( 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:4: 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid proverifOptions
		{
		match(input,47,FOLLOW_47_in_synpred11_proverif110); if (state.failed) return;
		pushFollow(FOLLOW_ident_in_synpred11_proverif112);
		ident();
		state._fsp--;
		if (state.failed) return;
		match(input,18,FOLLOW_18_in_synpred11_proverif114); if (state.failed) return;
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:20: ( ( typeid ',' )* typeid )?
		int alt148=2;
		int LA148_0 = input.LA(1);
		if ( (LA148_0==ID) ) {
			alt148=1;
		}
		switch (alt148) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:21: ( typeid ',' )* typeid
				{
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:21: ( typeid ',' )*
				loop147:
				while (true) {
					int alt147=2;
					int LA147_0 = input.LA(1);
					if ( (LA147_0==ID) ) {
						int LA147_1 = input.LA(2);
						if ( (LA147_1==20) ) {
							alt147=1;
						}

					}

					switch (alt147) {
					case 1 :
						// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:17:22: typeid ','
						{
						pushFollow(FOLLOW_typeid_in_synpred11_proverif118);
						typeid();
						state._fsp--;
						if (state.failed) return;
						match(input,20,FOLLOW_20_in_synpred11_proverif120); if (state.failed) return;
						}
						break;

					default :
						break loop147;
					}
				}

				pushFollow(FOLLOW_typeid_in_synpred11_proverif124);
				typeid();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,19,FOLLOW_19_in_synpred11_proverif128); if (state.failed) return;
		match(input,24,FOLLOW_24_in_synpred11_proverif130); if (state.failed) return;
		pushFollow(FOLLOW_typeid_in_synpred11_proverif132);
		typeid();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_proverifOptions_in_synpred11_proverif134);
		proverifOptions();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_proverif

	// $ANTLR start synpred15_proverif
	public final void synpred15_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:4: ( 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:4: 'fun' ident '(' ( ( typeid ',' )* typeid )? ')' ':' typeid 'reduc' reducprime proverifOptions
		{
		match(input,47,FOLLOW_47_in_synpred15_proverif148); if (state.failed) return;
		pushFollow(FOLLOW_ident_in_synpred15_proverif150);
		ident();
		state._fsp--;
		if (state.failed) return;
		match(input,18,FOLLOW_18_in_synpred15_proverif152); if (state.failed) return;
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:20: ( ( typeid ',' )* typeid )?
		int alt151=2;
		int LA151_0 = input.LA(1);
		if ( (LA151_0==ID) ) {
			alt151=1;
		}
		switch (alt151) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:21: ( typeid ',' )* typeid
				{
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:21: ( typeid ',' )*
				loop150:
				while (true) {
					int alt150=2;
					int LA150_0 = input.LA(1);
					if ( (LA150_0==ID) ) {
						int LA150_1 = input.LA(2);
						if ( (LA150_1==20) ) {
							alt150=1;
						}

					}

					switch (alt150) {
					case 1 :
						// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:19:22: typeid ','
						{
						pushFollow(FOLLOW_typeid_in_synpred15_proverif156);
						typeid();
						state._fsp--;
						if (state.failed) return;
						match(input,20,FOLLOW_20_in_synpred15_proverif158); if (state.failed) return;
						}
						break;

					default :
						break loop150;
					}
				}

				pushFollow(FOLLOW_typeid_in_synpred15_proverif162);
				typeid();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,19,FOLLOW_19_in_synpred15_proverif166); if (state.failed) return;
		match(input,24,FOLLOW_24_in_synpred15_proverif168); if (state.failed) return;
		pushFollow(FOLLOW_typeid_in_synpred15_proverif170);
		typeid();
		state._fsp--;
		if (state.failed) return;
		match(input,65,FOLLOW_65_in_synpred15_proverif172); if (state.failed) return;
		pushFollow(FOLLOW_reducprime_in_synpred15_proverif174);
		reducprime();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_proverifOptions_in_synpred15_proverif176);
		proverifOptions();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_proverif

	// $ANTLR start synpred40_proverif
	public final void synpred40_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:45: ( mayfailterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:36:45: mayfailterm ','
		{
		pushFollow(FOLLOW_mayfailterm_in_synpred40_proverif401);
		mayfailterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred40_proverif403); if (state.failed) return;
		}

	}
	// $ANTLR end synpred40_proverif

	// $ANTLR start synpred51_proverif
	public final void synpred51_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:5: ( ident )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:5: ident
		{
		pushFollow(FOLLOW_ident_in_synpred51_proverif552);
		ident();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred51_proverif

	// $ANTLR start synpred52_proverif
	public final void synpred52_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:25: ( gterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:25: gterm ','
		{
		pushFollow(FOLLOW_gterm_in_synpred52_proverif562);
		gterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred52_proverif564); if (state.failed) return;
		}

	}
	// $ANTLR end synpred52_proverif

	// $ANTLR start synpred55_proverif
	public final void synpred55_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:13: ( ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' int )? )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:13: ident '(' ( ( gterm ',' )* gterm )? ')' ( 'phase' int )?
		{
		pushFollow(FOLLOW_ident_in_synpred55_proverif556);
		ident();
		state._fsp--;
		if (state.failed) return;
		match(input,18,FOLLOW_18_in_synpred55_proverif558); if (state.failed) return;
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:23: ( ( gterm ',' )* gterm )?
		int alt178=2;
		int LA178_0 = input.LA(1);
		if ( (LA178_0==ID||LA178_0==18||LA178_0==42||LA178_0==51||(LA178_0 >= 53 && LA178_0 <= 54)) ) {
			alt178=1;
		}
		switch (alt178) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:24: ( gterm ',' )* gterm
				{
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:24: ( gterm ',' )*
				loop177:
				while (true) {
					int alt177=2;
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
					switch (alt177) {
					case 1 :
						// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:25: gterm ','
						{
						pushFollow(FOLLOW_gterm_in_synpred55_proverif562);
						gterm();
						state._fsp--;
						if (state.failed) return;
						match(input,20,FOLLOW_20_in_synpred55_proverif564); if (state.failed) return;
						}
						break;

					default :
						break loop177;
					}
				}

				pushFollow(FOLLOW_gterm_in_synpred55_proverif568);
				gterm();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,19,FOLLOW_19_in_synpred55_proverif572); if (state.failed) return;
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:49: ( 'phase' int )?
		int alt179=2;
		int LA179_0 = input.LA(1);
		if ( (LA179_0==60) ) {
			alt179=1;
		}
		switch (alt179) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:50: 'phase' int
				{
				match(input,60,FOLLOW_60_in_synpred55_proverif575); if (state.failed) return;
				pushFollow(FOLLOW_int_in_synpred55_proverif577);
				int();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred55_proverif

	// $ANTLR start synpred56_proverif
	public final void synpred56_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:80: ( gterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:80: gterm ','
		{
		pushFollow(FOLLOW_gterm_in_synpred56_proverif589);
		gterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred56_proverif591); if (state.failed) return;
		}

	}
	// $ANTLR end synpred56_proverif

	// $ANTLR start synpred57_proverif
	public final void synpred57_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:79: ( ( gterm ',' )* gterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:79: ( gterm ',' )* gterm
		{
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:79: ( gterm ',' )*
		loop180:
		while (true) {
			int alt180=2;
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
			switch (alt180) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:80: gterm ','
				{
				pushFollow(FOLLOW_gterm_in_synpred57_proverif589);
				gterm();
				state._fsp--;
				if (state.failed) return;
				match(input,20,FOLLOW_20_in_synpred57_proverif591); if (state.failed) return;
				}
				break;

			default :
				break loop180;
			}
		}

		pushFollow(FOLLOW_gterm_in_synpred57_proverif595);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred57_proverif

	// $ANTLR start synpred59_proverif
	public final void synpred59_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:130: ( gterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:130: gterm ','
		{
		pushFollow(FOLLOW_gterm_in_synpred59_proverif611);
		gterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred59_proverif613); if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_proverif

	// $ANTLR start synpred60_proverif
	public final void synpred60_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:129: ( ( gterm ',' )* gterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:129: ( gterm ',' )* gterm
		{
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:129: ( gterm ',' )*
		loop183:
		while (true) {
			int alt183=2;
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
			switch (alt183) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:130: gterm ','
				{
				pushFollow(FOLLOW_gterm_in_synpred60_proverif611);
				gterm();
				state._fsp--;
				if (state.failed) return;
				match(input,20,FOLLOW_20_in_synpred60_proverif613); if (state.failed) return;
				}
				break;

			default :
				break loop183;
			}
		}

		pushFollow(FOLLOW_gterm_in_synpred60_proverif617);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred60_proverif

	// $ANTLR start synpred62_proverif
	public final void synpred62_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:168: ( gterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:168: gterm ','
		{
		pushFollow(FOLLOW_gterm_in_synpred62_proverif631);
		gterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred62_proverif633); if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_proverif

	// $ANTLR start synpred63_proverif
	public final void synpred63_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:167: ( ( gterm ',' )* gterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:167: ( gterm ',' )* gterm
		{
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:167: ( gterm ',' )*
		loop186:
		while (true) {
			int alt186=2;
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
			switch (alt186) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:168: gterm ','
				{
				pushFollow(FOLLOW_gterm_in_synpred63_proverif631);
				gterm();
				state._fsp--;
				if (state.failed) return;
				match(input,20,FOLLOW_20_in_synpred63_proverif633); if (state.failed) return;
				}
				break;

			default :
				break loop186;
			}
		}

		pushFollow(FOLLOW_gterm_in_synpred63_proverif637);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred63_proverif

	// $ANTLR start synpred68_proverif
	public final void synpred68_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:273: ( '=' gterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:273: '=' gterm
		{
		match(input,32,FOLLOW_32_in_synpred68_proverif680); if (state.failed) return;
		pushFollow(FOLLOW_gterm_in_synpred68_proverif682);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred68_proverif

	// $ANTLR start synpred69_proverif
	public final void synpred69_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:285: ( '<>' gterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:285: '<>' gterm
		{
		match(input,31,FOLLOW_31_in_synpred69_proverif686); if (state.failed) return;
		pushFollow(FOLLOW_gterm_in_synpred69_proverif688);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred69_proverif

	// $ANTLR start synpred70_proverif
	public final void synpred70_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:298: ( '||' gterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:298: '||' gterm
		{
		match(input,73,FOLLOW_73_in_synpred70_proverif692); if (state.failed) return;
		pushFollow(FOLLOW_gterm_in_synpred70_proverif694);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_proverif

	// $ANTLR start synpred71_proverif
	public final void synpred71_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:311: ( '&&' gterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:311: '&&' gterm
		{
		match(input,17,FOLLOW_17_in_synpred71_proverif698); if (state.failed) return;
		pushFollow(FOLLOW_gterm_in_synpred71_proverif700);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_proverif

	// $ANTLR start synpred72_proverif
	public final void synpred72_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:324: ( '==>' gterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:58:324: '==>' gterm
		{
		match(input,33,FOLLOW_33_in_synpred72_proverif704); if (state.failed) return;
		pushFollow(FOLLOW_gterm_in_synpred72_proverif706);
		gterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred72_proverif

	// $ANTLR start synpred77_proverif
	public final void synpred77_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:17: ( gformat ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:68:17: gformat ','
		{
		pushFollow(FOLLOW_gformat_in_synpred77_proverif785);
		gformat();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred77_proverif787); if (state.failed) return;
		}

	}
	// $ANTLR end synpred77_proverif

	// $ANTLR start synpred82_proverif
	public final void synpred82_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:72:4: ( ident )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:72:4: ident
		{
		pushFollow(FOLLOW_ident_in_synpred82_proverif822);
		ident();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred82_proverif

	// $ANTLR start synpred83_proverif
	public final void synpred83_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:16: ( gformat ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:16: gformat ','
		{
		pushFollow(FOLLOW_gformat_in_synpred83_proverif833);
		gformat();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred83_proverif835); if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_proverif

	// $ANTLR start synpred85_proverif
	public final void synpred85_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:4: ( ident '(' ( ( gformat ',' )* gformat )? ')' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:4: ident '(' ( ( gformat ',' )* gformat )? ')'
		{
		pushFollow(FOLLOW_ident_in_synpred85_proverif827);
		ident();
		state._fsp--;
		if (state.failed) return;
		match(input,18,FOLLOW_18_in_synpred85_proverif829); if (state.failed) return;
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:14: ( ( gformat ',' )* gformat )?
		int alt199=2;
		int LA199_0 = input.LA(1);
		if ( (LA199_0==ID||LA199_0==18||(LA199_0 >= 53 && LA199_0 <= 55)) ) {
			alt199=1;
		}
		switch (alt199) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:15: ( gformat ',' )* gformat
				{
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:15: ( gformat ',' )*
				loop198:
				while (true) {
					int alt198=2;
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
					switch (alt198) {
					case 1 :
						// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:73:16: gformat ','
						{
						pushFollow(FOLLOW_gformat_in_synpred85_proverif833);
						gformat();
						state._fsp--;
						if (state.failed) return;
						match(input,20,FOLLOW_20_in_synpred85_proverif835); if (state.failed) return;
						}
						break;

					default :
						break loop198;
					}
				}

				pushFollow(FOLLOW_gformat_in_synpred85_proverif839);
				gformat();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,19,FOLLOW_19_in_synpred85_proverif843); if (state.failed) return;
		}

	}
	// $ANTLR end synpred85_proverif

	// $ANTLR start synpred86_proverif
	public final void synpred86_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:74:16: ( gformat ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:74:16: gformat ','
		{
		pushFollow(FOLLOW_gformat_in_synpred86_proverif854);
		gformat();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred86_proverif856); if (state.failed) return;
		}

	}
	// $ANTLR end synpred86_proverif

	// $ANTLR start synpred89_proverif
	public final void synpred89_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:10: ( gformat ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:10: gformat ','
		{
		pushFollow(FOLLOW_gformat_in_synpred89_proverif873);
		gformat();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred89_proverif875); if (state.failed) return;
		}

	}
	// $ANTLR end synpred89_proverif

	// $ANTLR start synpred90_proverif
	public final void synpred90_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:9: ( ( gformat ',' )* gformat )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:9: ( gformat ',' )* gformat
		{
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:9: ( gformat ',' )*
		loop203:
		while (true) {
			int alt203=2;
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
			switch (alt203) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:75:10: gformat ','
				{
				pushFollow(FOLLOW_gformat_in_synpred90_proverif873);
				gformat();
				state._fsp--;
				if (state.failed) return;
				match(input,20,FOLLOW_20_in_synpred90_proverif875); if (state.failed) return;
				}
				break;

			default :
				break loop203;
			}
		}

		pushFollow(FOLLOW_gformat_in_synpred90_proverif879);
		gformat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred90_proverif

	// $ANTLR start synpred100_proverif
	public final void synpred100_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:92:4: ( term )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:92:4: term
		{
		pushFollow(FOLLOW_term_in_synpred100_proverif1009);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred100_proverif

	// $ANTLR start synpred101_proverif
	public final void synpred101_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:93:4: ( term '->' term )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:93:4: term '->' term
		{
		pushFollow(FOLLOW_term_in_synpred101_proverif1014);
		term();
		state._fsp--;
		if (state.failed) return;
		match(input,21,FOLLOW_21_in_synpred101_proverif1016); if (state.failed) return;
		pushFollow(FOLLOW_term_in_synpred101_proverif1018);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred101_proverif

	// $ANTLR start synpred102_proverif
	public final void synpred102_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:94:4: ( term '<->' term )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:94:4: term '<->' term
		{
		pushFollow(FOLLOW_term_in_synpred102_proverif1023);
		term();
		state._fsp--;
		if (state.failed) return;
		match(input,27,FOLLOW_27_in_synpred102_proverif1025); if (state.failed) return;
		pushFollow(FOLLOW_term_in_synpred102_proverif1027);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred102_proverif

	// $ANTLR start synpred105_proverif
	public final void synpred105_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:35: ( pterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:35: pterm ','
		{
		pushFollow(FOLLOW_pterm_in_synpred105_proverif1064);
		pterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred105_proverif1066); if (state.failed) return;
		}

	}
	// $ANTLR end synpred105_proverif

	// $ANTLR start synpred120_proverif
	public final void synpred120_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:308: ( 'else' process )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:308: 'else' process
		{
		match(input,40,FOLLOW_40_in_synpred120_proverif1184); if (state.failed) return;
		pushFollow(FOLLOW_process_in_synpred120_proverif1186);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred120_proverif

	// $ANTLR start synpred126_proverif
	public final void synpred126_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:458: ( 'else' process )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:458: 'else' process
		{
		match(input,40,FOLLOW_40_in_synpred126_proverif1245); if (state.failed) return;
		pushFollow(FOLLOW_process_in_synpred126_proverif1247);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred126_proverif

	// $ANTLR start synpred132_proverif
	public final void synpred132_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:576: ( 'else' process )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:576: 'else' process
		{
		match(input,40,FOLLOW_40_in_synpred132_proverif1293); if (state.failed) return;
		pushFollow(FOLLOW_process_in_synpred132_proverif1295);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred132_proverif

	// $ANTLR start synpred135_proverif
	public final void synpred135_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:619: ( pterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:619: pterm ','
		{
		pushFollow(FOLLOW_pterm_in_synpred135_proverif1312);
		pterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred135_proverif1314); if (state.failed) return;
		}

	}
	// $ANTLR end synpred135_proverif

	// $ANTLR start synpred139_proverif
	public final void synpred139_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:678: ( pattern ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:678: pattern ','
		{
		pushFollow(FOLLOW_pattern_in_synpred139_proverif1341);
		pattern();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred139_proverif1343); if (state.failed) return;
		}

	}
	// $ANTLR end synpred139_proverif

	// $ANTLR start synpred142_proverif
	public final void synpred142_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:741: ( 'else' process )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:741: 'else' process
		{
		match(input,40,FOLLOW_40_in_synpred142_proverif1366); if (state.failed) return;
		pushFollow(FOLLOW_process_in_synpred142_proverif1368);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred142_proverif

	// $ANTLR start synpred145_proverif
	public final void synpred145_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:784: ( pterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:784: pterm ','
		{
		pushFollow(FOLLOW_pterm_in_synpred145_proverif1386);
		pterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred145_proverif1388); if (state.failed) return;
		}

	}
	// $ANTLR end synpred145_proverif

	// $ANTLR start synpred151_proverif
	public final void synpred151_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:857: ( '|' process )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:99:857: '|' process
		{
		match(input,72,FOLLOW_72_in_synpred151_proverif1423); if (state.failed) return;
		pushFollow(FOLLOW_process_in_synpred151_proverif1425);
		process();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred151_proverif

	// $ANTLR start synpred153_proverif
	public final void synpred153_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:19: ( pterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:19: pterm ','
		{
		pushFollow(FOLLOW_pterm_in_synpred153_proverif1449);
		pterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred153_proverif1451); if (state.failed) return;
		}

	}
	// $ANTLR end synpred153_proverif

	// $ANTLR start synpred156_proverif
	public final void synpred156_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:57: ( pterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:57: pterm ','
		{
		pushFollow(FOLLOW_pterm_in_synpred156_proverif1469);
		pterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred156_proverif1471); if (state.failed) return;
		}

	}
	// $ANTLR end synpred156_proverif

	// $ANTLR start synpred166_proverif
	public final void synpred166_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:264: ( 'else' pterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:264: 'else' pterm
		{
		match(input,40,FOLLOW_40_in_synpred166_proverif1561); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred166_proverif1563);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred166_proverif

	// $ANTLR start synpred168_proverif
	public final void synpred168_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:281: ( 'let' pattern )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:281: 'let' pattern
		{
		match(input,53,FOLLOW_53_in_synpred168_proverif1569); if (state.failed) return;
		pushFollow(FOLLOW_pattern_in_synpred168_proverif1571);
		pattern();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred168_proverif

	// $ANTLR start synpred171_proverif
	public final void synpred171_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:384: ( 'else' pterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:384: 'else' pterm
		{
		match(input,40,FOLLOW_40_in_synpred171_proverif1607); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred171_proverif1609);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred171_proverif

	// $ANTLR start synpred172_proverif
	public final void synpred172_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:340: ( 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )? )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:340: 'let' typedecl 'suchthat' pterm 'in' pterm ( 'else' pterm )?
		{
		match(input,53,FOLLOW_53_in_synpred172_proverif1594); if (state.failed) return;
		pushFollow(FOLLOW_typedecl_in_synpred172_proverif1596);
		typedecl();
		state._fsp--;
		if (state.failed) return;
		match(input,67,FOLLOW_67_in_synpred172_proverif1598); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred172_proverif1600);
		pterm();
		state._fsp--;
		if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred172_proverif1602); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred172_proverif1604);
		pterm();
		state._fsp--;
		if (state.failed) return;
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:383: ( 'else' pterm )?
		int alt267=2;
		int LA267_0 = input.LA(1);
		if ( (LA267_0==40) ) {
			alt267=1;
		}
		switch (alt267) {
			case 1 :
				// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:384: 'else' pterm
				{
				match(input,40,FOLLOW_40_in_synpred172_proverif1607); if (state.failed) return;
				pushFollow(FOLLOW_pterm_in_synpred172_proverif1609);
				pterm();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred172_proverif

	// $ANTLR start synpred173_proverif
	public final void synpred173_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:422: ( pterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:422: pterm ','
		{
		pushFollow(FOLLOW_pterm_in_synpred173_proverif1623);
		pterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred173_proverif1625); if (state.failed) return;
		}

	}
	// $ANTLR end synpred173_proverif

	// $ANTLR start synpred176_proverif
	public final void synpred176_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:476: ( pattern ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:476: pattern ','
		{
		pushFollow(FOLLOW_pattern_in_synpred176_proverif1649);
		pattern();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred176_proverif1651); if (state.failed) return;
		}

	}
	// $ANTLR end synpred176_proverif

	// $ANTLR start synpred179_proverif
	public final void synpred179_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:536: ( 'else' pterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:536: 'else' pterm
		{
		match(input,40,FOLLOW_40_in_synpred179_proverif1673); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred179_proverif1675);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred179_proverif

	// $ANTLR start synpred181_proverif
	public final void synpred181_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:574: ( pterm ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:574: pterm ','
		{
		pushFollow(FOLLOW_pterm_in_synpred181_proverif1690);
		pterm();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred181_proverif1692); if (state.failed) return;
		}

	}
	// $ANTLR end synpred181_proverif

	// $ANTLR start synpred184_proverif
	public final void synpred184_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:612: ( '=' pterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:612: '=' pterm
		{
		match(input,32,FOLLOW_32_in_synpred184_proverif1710); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred184_proverif1712);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred184_proverif

	// $ANTLR start synpred185_proverif
	public final void synpred185_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:624: ( '<>' pterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:624: '<>' pterm
		{
		match(input,31,FOLLOW_31_in_synpred185_proverif1716); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred185_proverif1718);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred185_proverif

	// $ANTLR start synpred186_proverif
	public final void synpred186_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:637: ( '&&' pterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:637: '&&' pterm
		{
		match(input,17,FOLLOW_17_in_synpred186_proverif1722); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred186_proverif1724);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred186_proverif

	// $ANTLR start synpred187_proverif
	public final void synpred187_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:650: ( '||' pterm )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:104:650: '||' pterm
		{
		match(input,73,FOLLOW_73_in_synpred187_proverif1728); if (state.failed) return;
		pushFollow(FOLLOW_pterm_in_synpred187_proverif1730);
		pterm();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred187_proverif

	// $ANTLR start synpred188_proverif
	public final void synpred188_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:11: ( term ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:11: term ','
		{
		pushFollow(FOLLOW_term_in_synpred188_proverif1750);
		term();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred188_proverif1752); if (state.failed) return;
		}

	}
	// $ANTLR end synpred188_proverif

	// $ANTLR start synpred191_proverif
	public final void synpred191_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:47: ( term ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:47: term ','
		{
		pushFollow(FOLLOW_term_in_synpred191_proverif1770);
		term();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred191_proverif1772); if (state.failed) return;
		}

	}
	// $ANTLR end synpred191_proverif

	// $ANTLR start synpred194_proverif
	public final void synpred194_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:92: ( '=' term )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:92: '=' term
		{
		match(input,32,FOLLOW_32_in_synpred194_proverif1794); if (state.failed) return;
		pushFollow(FOLLOW_term_in_synpred194_proverif1796);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred194_proverif

	// $ANTLR start synpred195_proverif
	public final void synpred195_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:103: ( '<>' term )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:103: '<>' term
		{
		match(input,31,FOLLOW_31_in_synpred195_proverif1800); if (state.failed) return;
		pushFollow(FOLLOW_term_in_synpred195_proverif1802);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred195_proverif

	// $ANTLR start synpred196_proverif
	public final void synpred196_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:115: ( '&&' term )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:115: '&&' term
		{
		match(input,17,FOLLOW_17_in_synpred196_proverif1806); if (state.failed) return;
		pushFollow(FOLLOW_term_in_synpred196_proverif1808);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred196_proverif

	// $ANTLR start synpred197_proverif
	public final void synpred197_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:127: ( '||' term )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:109:127: '||' term
		{
		match(input,73,FOLLOW_73_in_synpred197_proverif1812); if (state.failed) return;
		pushFollow(FOLLOW_term_in_synpred197_proverif1814);
		term();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred197_proverif

	// $ANTLR start synpred200_proverif
	public final void synpred200_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:133:10: ( pattern ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:133:10: pattern ','
		{
		pushFollow(FOLLOW_pattern_in_synpred200_proverif1852);
		pattern();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred200_proverif1854); if (state.failed) return;
		}

	}
	// $ANTLR end synpred200_proverif

	// $ANTLR start synpred203_proverif
	public final void synpred203_proverif_fragment() throws RecognitionException {
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:134:16: ( pattern ',' )
		// D:\\TriSelectif\\Etudes\\2018-2019\\PIDR\\grammar\\proverif.g:134:16: pattern ','
		{
		pushFollow(FOLLOW_pattern_in_synpred203_proverif1873);
		pattern();
		state._fsp--;
		if (state.failed) return;
		match(input,20,FOLLOW_20_in_synpred203_proverif1875); if (state.failed) return;
		}

	}
	// $ANTLR end synpred203_proverif

	// Delegated rules

	public final boolean synpred90_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred90_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred69_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred186_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred186_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred63_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred63_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred72_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred195_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred195_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred77_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred77_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred101_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred101_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred194_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred194_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred89_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred89_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred142_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred142_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred82_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred82_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred176_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred176_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred135_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred135_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred100_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred100_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred171_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred171_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred188_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred188_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred153_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred153_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred184_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred120_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred120_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred126_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred126_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred132_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred132_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred203_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred203_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred187_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred187_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred196_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred196_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred70_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred200_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred200_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred102_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred102_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred52_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred172_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred172_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred166_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred166_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred181_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred181_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred197_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred197_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred191_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred191_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred139_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred139_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred156_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred156_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred57_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred57_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred145_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred145_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred51_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred51_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred151_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred151_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred86_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred86_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred168_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred168_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred173_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred173_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred85_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred85_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred185_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred185_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred179_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred179_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_proverif() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_proverif_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
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
	public static final BitSet FOLLOW_int_in_gterm577 = new BitSet(new long[]{0x0000000380020002L,0x0000000000000200L});
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
	public static final BitSet FOLLOW_int_in_gbinding722 = new BitSet(new long[]{0x0000000100000000L});
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
	public static final BitSet FOLLOW_int_in_nounifdecl800 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_nounifdecl808 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_int_in_nounifdecl809 = new BitSet(new long[]{0x0000000000000002L});
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
	public static final BitSet FOLLOW_int_in_fbinding939 = new BitSet(new long[]{0x0000000100000000L});
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
	public static final BitSet FOLLOW_int_in_process1412 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000100L});
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
	public static final BitSet FOLLOW_INT_in_int2013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeid2024 = new BitSet(new long[]{0x0000000000000002L});
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
	public static final BitSet FOLLOW_int_in_synpred55_proverif577 = new BitSet(new long[]{0x0000000000000002L});
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
