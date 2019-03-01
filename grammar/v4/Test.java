import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.IOException;


public class Test {
  public static void compile (String path) throws Exception {
    ProverifLexer lexer;

    if (path == null) {
      displayNoPathMessage();

      ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
      lexer = new ProverifLexer(inputStream);
    } else  {
      ANTLRFileStream fileStream = new ANTLRFileStream(path);
      lexer = new ProverifLexer(fileStream);
    }

    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ProverifParser parser = new ProverifParser(tokens);

    ProverifParser.ProgrammeContext programmeContext = parser.programme();

    /*ProverifVisitor visitor = new ProverifVisitor();

    visitor.visit(programmeContext);*/
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
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
