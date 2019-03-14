package proverif.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.IOException;

import proverif.file.*;

public class FileParser {
    public static boolean parseOnly = false;
    
    private String path;
    private File currentFile;

    private ProverifErrorListener listener;
    private ProverifParser parser;
    private ProverifLexer lexer;
    private ANTLRInputStream inputStream;
    private BufferedTokenStream tokens;

    public FileParser (String path) {
	this.path = path;
    }

    private void parseFromDirectory (int level) throws IOException {
	for (int i = 0; i < level; i ++) System.out.print("\t");
	System.out.println("Directory : " + currentFile.getName());

	File files[] = currentFile.listFiles();

	for (File file : files) {
	    if (file.isDirectory()) {
		currentFile = file;
		parseFromDirectory(level + 1);
	    } else if (file.getName().endsWith(".pv")) {
		for (int i = 0; i < level + 1; i ++) System.out.print("\t");
		System.out.print("[" + file.getName() + "] : ");
		parse(file.getPath());
	    }
	}
    }

    public void parse () throws IOException {
	currentFile = new File(path);
	if (currentFile.isDirectory()) {
	    parseFromDirectory(0);
	} else {
	    parseFile();
	}
    }

    public void parse (String path) throws IOException {
	this.path = path;
	parse();
    }

    private void parseFile () throws IOException {
	preParsingOperations();
	
	ProverifParser.ProgrammeContext programmeContext = parser.programme();

	postParsingOperations(programmeContext);
    }

    private void preParsingOperations () throws IOException {
	FileGenerator.newLogFile(currentFile.getName());
	
	setInputStream();
	lexer = new ProverifLexer(inputStream);

	tokens = new CommonTokenStream(lexer);
	parser = new ProverifParser(tokens);
	
	parser.removeErrorListeners();
	listener = new ProverifErrorListener();
	parser.addErrorListener(listener);
    }
    
    private void setInputStream () throws IOException {	
	if (currentFile.getName().equals("default")) {
	    displayNoPathMessage();

	    inputStream = new ANTLRInputStream(System.in);
	} else  {
	    inputStream = new ANTLRFileStream(currentFile.getPath());
	}
    }

    private void postParsingOperations (ProverifParser.ProgrammeContext context) {
	if (listener.hasNoError()) {
	    displayParsingSuccessfulMessage();
	} else {
	    displayParsingErrorMessage();
	}

	if (!parseOnly) {
	    visit(context, tokens);
   	}	
    }
   
    private void visit(ProverifParser.ProgrammeContext programmeContext, BufferedTokenStream tokens) {
	ProverifVisitorImpl visitor = new ProverifVisitorImpl(tokens);
	visitor.visit(programmeContext);

	FileGenerator.flush();
    }

    private void displayParsingSuccessfulMessage() {
	System.out.println("\u001B[42m  \u001B[0m");
    }

    private void displayParsingErrorMessage () {
	System.out.println("\u001B[41m  \u001B[0m");
    }

    private void displayNoPathMessage () {
	System.out.println("\nIf you want to use a file you can execute the script with make run path=\"path\"");
	System.out.println("You can also enter a text here to test it");
	System.out.println("Enter some text : (CTLR-D to exit)");
    }
}
