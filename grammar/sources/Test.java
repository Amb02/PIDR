import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;
import java.io.FileOutputStream;

public class Test {
  public static File logFile;
  public static FileOutputStream logFileWriter;
  public static StringBuilder fileContent;

  public static boolean parseOnly = false;

  public static void parseFromDirectory (File directoryPath, int level) throws IOException {
    for (int i = 0; i < level; i ++) System.out.print("\t");
    System.out.println("Directory : " + directoryPath.getName());

    File files[] = directoryPath.listFiles();

    for (File file : files) {
      if (file.isDirectory()) {
        parseFromDirectory(file, level + 1);
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
      parseFromDirectory(file, 0);
    } else {
      parseFile(file);
    }
  }

  private static void parseFile (File path) throws IOException {
    logFile = new File("logs/" + path.getName() + ".log");
    try {
      logFileWriter = new FileOutputStream(logFile);
      fileContent = new StringBuilder();
    } catch (Exception e) {
      System.err.println("There was an issue when creating the FileWriter object to log the file");
    }

    ProverifErrorListener listener = new ProverifErrorListener();

    ProverifLexer lexer;
    if (path.getName().equals("default")) {
      displayNoPathMessage();

      ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
      lexer = new ProverifLexer(inputStream);
    } else  {
      ANTLRFileStream fileStream = new ANTLRFileStream(path.getPath());
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
      //listenerApproach(programmeContext, tokens);

      // Visitor approach
      visit(programmeContext, tokens, parser);

      try {
        logFileWriter.write(fileContent.toString().getBytes());
        logFileWriter.flush();
        logFileWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static void listenerApproch(ProverifParser.ProgrammeContext programmeContext, BufferedTokenStream tokens) {
    // need to implement the ProverifListenerImpl
    /*
    ParseTreeWalker walker = new ParseTreeWalker();
    ProverifListenerImpl parseListener = new ProverifListenerImpl(tokens);
    walker.walk(parseListener, programmeContext);
    */
  }

  public static void visit(ProverifParser.ProgrammeContext programmeContext, BufferedTokenStream tokens, ProverifParser parser) {
    ProverifVisitorImpl visitor = new ProverifVisitorImpl(tokens, parser);
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
    fileContent.append(message);
  }

  public static void cleanDirectory (String path) {
    File directory = new File(path);

    for (File file : directory.listFiles()) {
      if (!file.isDirectory()) {
        file.delete();
      }
    }
  }

  public static void main (String [] args) {
    cleanDirectory("logs");
    String path = "default";
    try {
      if (args.length != 0) {
        path = args[0];
      }

      parse(path);
    } catch (IOException e) {
      System.err.println("The file : " + path + " does not exist");
    }
  }
}
