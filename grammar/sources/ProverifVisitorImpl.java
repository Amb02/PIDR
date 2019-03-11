import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

import java.io.OutputStream;

public class ProverifVisitorImpl extends ProverifBaseVisitor {
  private BufferedTokenStream tokens;

  public ProverifVisitorImpl (BufferedTokenStream tokens) {
    super();
    this.tokens = tokens;
  }

  private int getRealChildCounts (int count) {
    return ((count - 2) / 2) + 1;
  }

  public void logAll (List<Token> tokens) {
    if (tokens != null) {
      for (Token t : tokens) {
        Test.log(t.getText());
      }
    }
  }

  @Override
  public String visitPatternSequence (ProverifParser.PatternSequenceContext ctx) {
    System.out.println("Sequence Pattern : " + ctx.getText() + " taille : " + getRealChildCounts(ctx.getChildCount()));

    return null;
  }

  @Override
  public String visitPtermSequence (ProverifParser.PtermSequenceContext ctx) {
    System.out.println("Sequence Pterm : " + ctx.getText() + " taille : " + getRealChildCounts(ctx.getChildCount()));

    return null;
  }

  @Override
  public String visitProgramme (ProverifParser.ProgrammeContext ctx) {
    for (int i = 0; i < ctx.getChildCount(); i ++) {
      this.visit(ctx.getChild(i));
    }

    Token start = ctx.getStart();
    Token end = ctx.getStop();
    int tokPos = start.getTokenIndex();
    int tokenPosEnd = end.getTokenIndex();

    List<Token> refDefaultChannel = tokens.getTokens(tokPos, tokenPosEnd);

    logAll(refDefaultChannel);

    return null;
  }

  @Override public String visitDeclaration(ProverifParser.DeclarationContext ctx) { visitChildren(ctx); return null; }
  @Override public String visitReduc(ProverifParser.ReducContext ctx) {  visitChildren(ctx); return null; }
  @Override public String visitReducprime(ProverifParser.ReducprimeContext ctx) {  visitChildren(ctx); return null; }
  @Override public String visitEqlist(ProverifParser.EqlistContext ctx) {  visitChildren(ctx); return null; }
  @Override public String visitName(ProverifParser.NameContext ctx) {  visitChildren(ctx); return null; }
  @Override public String visitValue(ProverifParser.ValueContext ctx) {visitChildren(ctx); return null; }
  @Override public String visitQuery(ProverifParser.QueryContext ctx) { visitChildren(ctx);  return null;}
  @Override public String visitGterm(ProverifParser.GtermContext ctx) {  visitChildren(ctx); return null;}
  @Override public String visitGbinding(ProverifParser.GbindingContext ctx) {visitChildren(ctx);  return null;}
  @Override public String visitNounifdecl(ProverifParser.NounifdeclContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitGformat(ProverifParser.GformatContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitFbinding(ProverifParser.FbindingContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitClauses(ProverifParser.ClausesContext ctx) {visitChildren(ctx); return null; }
  @Override public String visitClause(ProverifParser.ClauseContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitProcess(ProverifParser.ProcessContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitTerm(ProverifParser.TermContext ctx) {visitChildren(ctx);return null; }
  @Override public String visitPattern(ProverifParser.PatternContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitMayfailterm(ProverifParser.MayfailtermContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitTypedecl(ProverifParser.TypedeclContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitFailtypedecl(ProverifParser.FailtypedeclContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitProverifOptions(ProverifParser.ProverifOptionsContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitIdent(ProverifParser.IdentContext ctx) {visitChildren(ctx);return null; }
  @Override public String visitId(ProverifParser.IdContext ctx) {visitChildren(ctx);return null; }
  @Override public String visitInteger(ProverifParser.IntegerContext ctx) {visitChildren(ctx); return null;}
  @Override public String visitTypeid(ProverifParser.TypeidContext ctx) {visitChildren(ctx);return null; }
}
