// Generated from proverif.g by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link proverifParser}.
 */
public interface proverifListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link proverifParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(proverifParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(proverifParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(proverifParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(proverifParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#reduc}.
	 * @param ctx the parse tree
	 */
	void enterReduc(proverifParser.ReducContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#reduc}.
	 * @param ctx the parse tree
	 */
	void exitReduc(proverifParser.ReducContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#reducprime}.
	 * @param ctx the parse tree
	 */
	void enterReducprime(proverifParser.ReducprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#reducprime}.
	 * @param ctx the parse tree
	 */
	void exitReducprime(proverifParser.ReducprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#eqlist}.
	 * @param ctx the parse tree
	 */
	void enterEqlist(proverifParser.EqlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#eqlist}.
	 * @param ctx the parse tree
	 */
	void exitEqlist(proverifParser.EqlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(proverifParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(proverifParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(proverifParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(proverifParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(proverifParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(proverifParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#gterm}.
	 * @param ctx the parse tree
	 */
	void enterGterm(proverifParser.GtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#gterm}.
	 * @param ctx the parse tree
	 */
	void exitGterm(proverifParser.GtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#gbinding}.
	 * @param ctx the parse tree
	 */
	void enterGbinding(proverifParser.GbindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#gbinding}.
	 * @param ctx the parse tree
	 */
	void exitGbinding(proverifParser.GbindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#nounifdecl}.
	 * @param ctx the parse tree
	 */
	void enterNounifdecl(proverifParser.NounifdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#nounifdecl}.
	 * @param ctx the parse tree
	 */
	void exitNounifdecl(proverifParser.NounifdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#gformat}.
	 * @param ctx the parse tree
	 */
	void enterGformat(proverifParser.GformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#gformat}.
	 * @param ctx the parse tree
	 */
	void exitGformat(proverifParser.GformatContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#fbinding}.
	 * @param ctx the parse tree
	 */
	void enterFbinding(proverifParser.FbindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#fbinding}.
	 * @param ctx the parse tree
	 */
	void exitFbinding(proverifParser.FbindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#clauses}.
	 * @param ctx the parse tree
	 */
	void enterClauses(proverifParser.ClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#clauses}.
	 * @param ctx the parse tree
	 */
	void exitClauses(proverifParser.ClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(proverifParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(proverifParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(proverifParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(proverifParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#pterm}.
	 * @param ctx the parse tree
	 */
	void enterPterm(proverifParser.PtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#pterm}.
	 * @param ctx the parse tree
	 */
	void exitPterm(proverifParser.PtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(proverifParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(proverifParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(proverifParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(proverifParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#mayfailterm}.
	 * @param ctx the parse tree
	 */
	void enterMayfailterm(proverifParser.MayfailtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#mayfailterm}.
	 * @param ctx the parse tree
	 */
	void exitMayfailterm(proverifParser.MayfailtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#typedecl}.
	 * @param ctx the parse tree
	 */
	void enterTypedecl(proverifParser.TypedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#typedecl}.
	 * @param ctx the parse tree
	 */
	void exitTypedecl(proverifParser.TypedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#failtypedecl}.
	 * @param ctx the parse tree
	 */
	void enterFailtypedecl(proverifParser.FailtypedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#failtypedecl}.
	 * @param ctx the parse tree
	 */
	void exitFailtypedecl(proverifParser.FailtypedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#proverifOptions}.
	 * @param ctx the parse tree
	 */
	void enterProverifOptions(proverifParser.ProverifOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#proverifOptions}.
	 * @param ctx the parse tree
	 */
	void exitProverifOptions(proverifParser.ProverifOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#optionChoice}.
	 * @param ctx the parse tree
	 */
	void enterOptionChoice(proverifParser.OptionChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#optionChoice}.
	 * @param ctx the parse tree
	 */
	void exitOptionChoice(proverifParser.OptionChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(proverifParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(proverifParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(proverifParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(proverifParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(proverifParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(proverifParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link proverifParser#typeid}.
	 * @param ctx the parse tree
	 */
	void enterTypeid(proverifParser.TypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link proverifParser#typeid}.
	 * @param ctx the parse tree
	 */
	void exitTypeid(proverifParser.TypeidContext ctx);
}