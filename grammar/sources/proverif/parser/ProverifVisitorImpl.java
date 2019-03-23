package proverif.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.io.OutputStream;

import proverif.combinations.Tuples;
import proverif.combinations.Tuple;

import java.util.ArrayList;
import java.util.HashMap;

import proverif.file.*;

public class ProverifVisitorImpl extends ProverifBaseVisitor {
  private BufferedTokenStream tokens;

  private static final int MAX_RULE_SIZE = 7;
  public static Tuples tuples;
  public static HashMap<Integer,Tuple> referenceLines = new HashMap(); //sould be replace by a 2D-List<int line, List<Tuples>>

  public ProverifVisitorImpl (BufferedTokenStream tokens) {
    this.tokens = tokens;
    this.tuples = new Tuples();
  }

  private int getRealChildCount (int count) {
    return ((count-2) / 2) + 1;
  }

  public void logAll (List<Token> tokens) {
    if (tokens != null) {
      for (Token t : tokens) {
        FileGenerator.log(t.getText());
      }
    }
  }

  private void displayRuleFound (String ruleName, ParserRuleContext ctx) {
    int line = ctx.getStart().getLine();
    String spacing = getSpacing(ruleName);
    int childCount = getRealChildCount(ctx.getChildCount());

    System.out.println(lineDisplayString(line) + " "
    + ruleName + spacing + " Sequence" + " : " + ctx.getText()
    + " " + childrenCountDisplayString(childCount)
    );
  }

  private void tupleCreation (ParserRuleContext ctx) {
    Tuple tuple  = new Tuple(ctx);
    tuples.add(tuple);
    referenceLines.put(ctx.getStart().getLine(),tuple);
  }

  private String getSpacing (String ruleName) {
    int ruleNameSize = ruleName.length();
    int differenceWithMax = MAX_RULE_SIZE - ruleNameSize;
    StringBuilder spacing = new StringBuilder();

    for (int i = 0; i < differenceWithMax; i ++) {
      spacing.append(" ");
    }

    return spacing.toString();
  }

  private String childrenCountDisplayString (int count) {
    return "(size : " + count + ")";
  }

  private String lineDisplayString (int line) {
    return "[LINE : " + line + "]";
  }

  private void operationOnSequence (String sequenceName, ParserRuleContext ctx) {
    //displayRuleFound(sequenceName, ctx);
    tupleCreation(ctx);

    visitChildren(ctx);
  }

  @Override
  public String visitPatternSequence (ProverifParser.PatternSequenceContext ctx) {
    operationOnSequence("Pattern", ctx);
    return null;
  }

  @Override
  public String visitGtermSequence (ProverifParser.GtermSequenceContext ctx) {
    operationOnSequence("Gterm", ctx);

    return null;
  }

  @Override
  public String visitPtermSequence (ProverifParser.PtermSequenceContext ctx) {
    operationOnSequence("Pterm", ctx);


    return null;
  }

  @Override
  public String visitProgramme (ProverifParser.ProgrammeContext ctx) {
    visitChildren(ctx);

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
