import org.antlr.runtime.*;
import java.io.File;
import java.io.IOException;

public class Test {
  public static void main (String [] args) throws IOException, RecognitionException {
    proverifLexer lexer;
    
    if (args.length == 0) {
      System.out.println("Entrer un texte : (CTLR-D to exit)");

      ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
      lexer = new proverifLexer(inputStream);
    } else  {
      ANTLRFileStream fileStream = new ANTLRFileStream(args[0]);
      lexer = new proverifLexer(fileStream);
    }

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    proverifParser parser = new proverifParser(tokens);

    parser.programme();
  }
}
