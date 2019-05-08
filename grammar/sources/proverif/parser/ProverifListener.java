// Generated from proverif/parser/Proverif.g4 by ANTLR 4.7.1

	package proverif.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProverifParser}.
 */
public interface ProverifListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProverifParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(ProverifParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(ProverifParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ProverifParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ProverifParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#nidecl}.
	 * @param ctx the parse tree
	 */
	void enterNidecl(ProverifParser.NideclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#nidecl}.
	 * @param ctx the parse tree
	 */
	void exitNidecl(ProverifParser.NideclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#reduc}.
	 * @param ctx the parse tree
	 */
	void enterReduc(ProverifParser.ReducContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#reduc}.
	 * @param ctx the parse tree
	 */
	void exitReduc(ProverifParser.ReducContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#reducprime}.
	 * @param ctx the parse tree
	 */
	void enterReducprime(ProverifParser.ReducprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#reducprime}.
	 * @param ctx the parse tree
	 */
	void exitReducprime(ProverifParser.ReducprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#eqlist}.
	 * @param ctx the parse tree
	 */
	void enterEqlist(ProverifParser.EqlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#eqlist}.
	 * @param ctx the parse tree
	 */
	void exitEqlist(ProverifParser.EqlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ProverifParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ProverifParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ProverifParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ProverifParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ProverifParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ProverifParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#gterm}.
	 * @param ctx the parse tree
	 */
	void enterGterm(ProverifParser.GtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#gterm}.
	 * @param ctx the parse tree
	 */
	void exitGterm(ProverifParser.GtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#gtermSequence}.
	 * @param ctx the parse tree
	 */
	void enterGtermSequence(ProverifParser.GtermSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#gtermSequence}.
	 * @param ctx the parse tree
	 */
	void exitGtermSequence(ProverifParser.GtermSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#gbinding}.
	 * @param ctx the parse tree
	 */
	void enterGbinding(ProverifParser.GbindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#gbinding}.
	 * @param ctx the parse tree
	 */
	void exitGbinding(ProverifParser.GbindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#nounifdecl}.
	 * @param ctx the parse tree
	 */
	void enterNounifdecl(ProverifParser.NounifdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#nounifdecl}.
	 * @param ctx the parse tree
	 */
	void exitNounifdecl(ProverifParser.NounifdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#gformat}.
	 * @param ctx the parse tree
	 */
	void enterGformat(ProverifParser.GformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#gformat}.
	 * @param ctx the parse tree
	 */
	void exitGformat(ProverifParser.GformatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#fbinding}.
	 * @param ctx the parse tree
	 */
	void enterFbinding(ProverifParser.FbindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#fbinding}.
	 * @param ctx the parse tree
	 */
	void exitFbinding(ProverifParser.FbindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#clauses}.
	 * @param ctx the parse tree
	 */
	void enterClauses(ProverifParser.ClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#clauses}.
	 * @param ctx the parse tree
	 */
	void exitClauses(ProverifParser.ClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(ProverifParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(ProverifParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(ProverifParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(ProverifParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#pterm}.
	 * @param ctx the parse tree
	 */
	void enterPterm(ProverifParser.PtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#pterm}.
	 * @param ctx the parse tree
	 */
	void exitPterm(ProverifParser.PtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#ptermSequence}.
	 * @param ctx the parse tree
	 */
	void enterPtermSequence(ProverifParser.PtermSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#ptermSequence}.
	 * @param ctx the parse tree
	 */
	void exitPtermSequence(ProverifParser.PtermSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ProverifParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ProverifParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(ProverifParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(ProverifParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#patternSequence}.
	 * @param ctx the parse tree
	 */
	void enterPatternSequence(ProverifParser.PatternSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#patternSequence}.
	 * @param ctx the parse tree
	 */
	void exitPatternSequence(ProverifParser.PatternSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#mayfailterm}.
	 * @param ctx the parse tree
	 */
	void enterMayfailterm(ProverifParser.MayfailtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#mayfailterm}.
	 * @param ctx the parse tree
	 */
	void exitMayfailterm(ProverifParser.MayfailtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#typedecl}.
	 * @param ctx the parse tree
	 */
	void enterTypedecl(ProverifParser.TypedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#typedecl}.
	 * @param ctx the parse tree
	 */
	void exitTypedecl(ProverifParser.TypedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#failtypedecl}.
	 * @param ctx the parse tree
	 */
	void enterFailtypedecl(ProverifParser.FailtypedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#failtypedecl}.
	 * @param ctx the parse tree
	 */
	void exitFailtypedecl(ProverifParser.FailtypedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#proverifOptionsFree}.
	 * @param ctx the parse tree
	 */
	void enterProverifOptionsFree(ProverifParser.ProverifOptionsFreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#proverifOptionsFree}.
	 * @param ctx the parse tree
	 */
	void exitProverifOptionsFree(ProverifParser.ProverifOptionsFreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#proverifOptionsFun}.
	 * @param ctx the parse tree
	 */
	void enterProverifOptionsFun(ProverifParser.ProverifOptionsFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#proverifOptionsFun}.
	 * @param ctx the parse tree
	 */
	void exitProverifOptionsFun(ProverifParser.ProverifOptionsFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#proverifOptionsPred}.
	 * @param ctx the parse tree
	 */
	void enterProverifOptionsPred(ProverifParser.ProverifOptionsPredContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#proverifOptionsPred}.
	 * @param ctx the parse tree
	 */
	void exitProverifOptionsPred(ProverifParser.ProverifOptionsPredContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#proverifOptions}.
	 * @param ctx the parse tree
	 */
	void enterProverifOptions(ProverifParser.ProverifOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#proverifOptions}.
	 * @param ctx the parse tree
	 */
	void exitProverifOptions(ProverifParser.ProverifOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#optionfun}.
	 * @param ctx the parse tree
	 */
	void enterOptionfun(ProverifParser.OptionfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#optionfun}.
	 * @param ctx the parse tree
	 */
	void exitOptionfun(ProverifParser.OptionfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#optionpred}.
	 * @param ctx the parse tree
	 */
	void enterOptionpred(ProverifParser.OptionpredContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#optionpred}.
	 * @param ctx the parse tree
	 */
	void exitOptionpred(ProverifParser.OptionpredContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(ProverifParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(ProverifParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ProverifParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ProverifParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ProverifParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ProverifParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProverifParser#typeid}.
	 * @param ctx the parse tree
	 */
	void enterTypeid(ProverifParser.TypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProverifParser#typeid}.
	 * @param ctx the parse tree
	 */
	void exitTypeid(ProverifParser.TypeidContext ctx);
}