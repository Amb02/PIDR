import org.antlr.runtime.*;
import java.io.File;
import java.io.IOException;

public class Test {
  public static void parse (String path) throws RecognitionException, IOException {
    proverifLexer lexer;

    if (path == null) {
      displayNoPathMessage();

      ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
      lexer = new proverifLexer(inputStream);
    } else  {
      ANTLRFileStream fileStream = new ANTLRFileStream(path);
      lexer = new proverifLexer(fileStream);
    }

    CommonTokenStream tokens = new CommonTokenStream(lexer);
    proverifParser parser = new proverifParser(tokens);

    gparser.programme();
  }

  public static void displayNoPathMessage () {
    System.out.println("\nIf you want to use a file you can execute the script with make run path=\"path\"");
    System.out.println("You can also enter a text here to test it");
    System.out.println("Enter some text : (CTLR-D to exit)");
  }

  public static void main (String [] args) {
    try {
      String path = null;
      if (args.length != 0) path = args[0];

      compile(path);

    } catch (IOException e) {
      System.err.println("The file : " + args[0] + " does not exist");
    } catch (RecognitionException e) {
      System.err.println(e.getMessage());
    }
  }
}
