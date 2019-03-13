// Generated from Proverif.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProverifParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProverifVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProverifParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(ProverifParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ProverifParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#reduc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReduc(ProverifParser.ReducContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#reducprime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReducprime(ProverifParser.ReducprimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#eqlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqlist(ProverifParser.EqlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ProverifParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ProverifParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ProverifParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#gterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGterm(ProverifParser.GtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#gtermSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtermSequence(ProverifParser.GtermSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#gbinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGbinding(ProverifParser.GbindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#nounifdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounifdecl(ProverifParser.NounifdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#gformat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGformat(ProverifParser.GformatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#fbinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbinding(ProverifParser.FbindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauses(ProverifParser.ClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(ProverifParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(ProverifParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#pterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPterm(ProverifParser.PtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#ptermSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtermSequence(ProverifParser.PtermSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ProverifParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(ProverifParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#patternSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternSequence(ProverifParser.PatternSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#mayfailterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayfailterm(ProverifParser.MayfailtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#typedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedecl(ProverifParser.TypedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#failtypedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailtypedecl(ProverifParser.FailtypedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#proverifOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProverifOptions(ProverifParser.ProverifOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(ProverifParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ProverifParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ProverifParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProverifParser#typeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeid(ProverifParser.TypeidContext ctx);
}