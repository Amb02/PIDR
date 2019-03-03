import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;
import java.io.FileOutputStream;


public class Test {

  public static File logFile = new File("temp.log");
  public static FileOutputStream logFileWriter;

  public static boolean parseOnly = false;

  public static void parseFromDirectory (String directoryPath, int level) throws IOException {
    for (int i = 0; i < level; i ++) System.out.print("\t");
    System.out.println("Directory" + directoryPath);

    File directory = new File(directoryPath);
    File files[] = directory.listFiles();

    for (File file : files) {
      if (file.isDirectory()) {
        parseFromDirectory(file.getPath(), level + 1);
      } else if (file.getName().endsWith(".pv")) {
        for (int i = 0; i < level + 1; i ++) System.out.print("\t");
        System.out.print("[" + file.getName() + "] : ");
        parse(file.getPath());
      }
    }
  }

  public static void parse (String path) throws IOException {
    File file = new File(path);
    if (file.isDirectory()) {
      parseFromDirectory(path, 0);
    } else {
      parseFile(path);
    }
  }

  private static void parseFile (String path) throws IOException {
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
    parser.removeErrorListeners();
    parser.addErrorListener(listener);

    ProverifParser.ProgrammeContext programmeContext = parser.programme();

    if (listener.hasNoError()) {
      displayParsingSuccessfulMessage();
    } else {
      displayParsingErrorMessage();
    }

    if (!parseOnly) {
      // Listener approach
      /*
      ParseTreeWalker walker = new ParseTreeWalker();
      ProverifListenerImpl parseListener = new ProverifListenerImpl(tokens);
      walker.walk(parseListener, programmeContext);
      */

      // Visitor approach
      copyFile(programmeContext, tokens, path);
    }
  }

  public static void copyFile(ProverifParser.ProgrammeContext programmeContext, BufferedTokenStream tokens, String path) {
    ProverifVisitorImpl visitor = new ProverifVisitorImpl(tokens);
    visitor.visit(programmeContext);
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

  public static void log (String message) {
    try {
      logFileWriter.write(message.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main (String [] args) {
    try {
      logFileWriter = new FileOutputStream(logFile);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      String path = null;
      if (args.length != 0) {
        path = args[0];
      }

      parse(path);
    } catch (IOException e) {
      System.err.println("The file : " + args[0] + " does not exist");
    }

    try {
      logFileWriter.flush();
      logFileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
