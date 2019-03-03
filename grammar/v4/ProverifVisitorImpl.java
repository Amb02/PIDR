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

  public void logAll (List<Token> tokens) {
    if (tokens != null) {
      for (Token t : tokens) {
        Test.log(t.getText());
      }
    }
  }

  @Override
  public String visitProgramme (ProverifParser.ProgrammeContext ctx) {
    Token start = ctx.getStart();
    Token end = ctx.getStop();
    int tokPos = start.getTokenIndex();
    int tokenPosEnd = end.getTokenIndex();

    List<Token> refDefaultChannel = tokens.getTokens(tokPos, tokenPosEnd);

    logAll(refDefaultChannel);

    return null;
  }
}
