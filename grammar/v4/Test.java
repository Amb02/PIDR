import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;


public class Test {

  public static void compileFromDirectory (String directoryPath, int level) throws IOException {
    for (int i = 0; i < level; i ++) System.out.print("\t");
    System.out.println("Directory" + directoryPath);

    File directory = new File(directoryPath);
    File files[] = directory.listFiles();

    for (File file : files) {
      if (file.isDirectory()) {
        compileFromDirectory(file.getPath(), level + 1);
      } else if (file.getName().endsWith(".pv")) {
        for (int i = 0; i < level + 1; i ++) System.out.print("\t");
        System.out.print("[" + file.getName() + "] : ");
        compile(file.getPath());
      }
    }
  }

  public static void compile (String path) throws IOException {
    File file = new File(path);
    if (file.isDirectory()) {
      compileFromDirectory(path, 0);
    } else {
      compileFile(path);
    }
  }

  private static void compileFile (String path) throws IOException {
    ProverifErrorListener listener = new ProverifErrorListener();

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

    //lexer.removeErrorListeners();
    //lexer.addErrorListener(listener);
    parser.removeErrorListeners();
    parser.addErrorListener(listener);

    ProverifParser.ProgrammeContext programmeContext = parser.programme();

    if (listener.hasNoError()) {
      displayParsingSuccessfulMessage();
    } else {
      displayParsingErrorMessage();
    }
  }

  public static void displayNoPathMessage () {
    System.out.println("\nIf you want to use a file you can execute the script with make run path=\"path\"");
    System.out.println("You can also enter a text here to test it");
    System.out.println("Enter some text : (CTLR-D to exit)");
  }

  public static void displayParsingSuccessfulMessage() {
    System.out.println("\u001B[42m  \u001B[0m");
  }

  public static void displayParsingErrorMessage () {
    System.out.println("\u001B[41m  \u001B[0m");
  }

  public static void main (String [] args) {
    try {
      String path = null;
      if (args.length != 0) {
        path = args[0];
      }

      compile(path);
    } catch (IOException e) {
      System.err.println("The file : " + args[0] + " does not exist");
    }
  }
}
