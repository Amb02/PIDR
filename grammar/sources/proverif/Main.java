package proverif;

import java.io.IOException;

import proverif.parser.*;
import proverif.file.*;

public class Main {
    public static void main (String [] args) {
	FileGenerator.cleanDirectory(FileGenerator.LOG_DIRECTORY_PATH);
	
	String path = "default";
	try {
	    if (args.length != 0) {
		path = args[0];
	    }

	    FileParser parser = new FileParser(path);
	    parser.parse();
	    
	    System.out.println("\nTuples found :"+ProverifVisitorImpl.tuples);
	    
	} catch (IOException e) {
	    System.err.println("The file : " + path + " does not exist");
	}
    }
}
