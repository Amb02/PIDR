package proverif.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.io.OutputStream;

import proverif.parser.Tuples;
import proverif.parser.Tuple;

import java.util.ArrayList;

import proverif.file.*;

public class ProverifVisitorImpl extends ProverifBaseVisitor {
  private BufferedTokenStream tokens;

  private static final int MAX_RULE_SIZE = 7;
  public static Tuples tuples;

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

  private ArrayList<ParseTree> createTupleList(ParserRuleContext ctx){
    String state = "begin";
    ArrayList<ParseTree> list = new ArrayList();

    for (int i = 0 ; i < ctx.getChildCount() ; i++){

      String txt = ctx.getChild(i).getText();

      if ( (txt.equals("(")) && (state.equals("begin")) ){
        state="ident";
      } else if ( (!txt.equals(",")) && (state.equals("ident")) ){
        list.add(ctx.getChild(i));
        state=",";
      } else if ( (txt.equals(",")) && (state.equals(",")) ){
        state="ident";
      } else if ( (txt.equals(")")) && (state.equals(",")) ){
        state="end";
      } else {
        System.err.println("Error creating object tuple "+state+" , "+txt);
      }
    }
    return list;
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
    ArrayList<ParseTree> list = createTupleList(ctx);
    Tuple tuple  = new Tuple(tuples, list);
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

  @Override
  public String visitPatternSequence (ProverifParser.PatternSequenceContext ctx) {
    displayRuleFound("Pattern", ctx);
    tupleCreation(ctx);

    return null;
  }

  @Override
  public String visitGtermSequence (ProverifParser.GtermSequenceContext ctx) {
    displayRuleFound("Gterm", ctx);
    tupleCreation(ctx);

    return null;
  }

  @Override
  public String visitPtermSequence (ProverifParser.PtermSequenceContext ctx) {
    displayRuleFound("Pterm", ctx);
    tupleCreation(ctx);

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
