package proverif;

import java.io.IOException;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;

import proverif.combinations.*;
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

			Tuples tuples 										= ProverifVisitorImpl.tuples;
			HashMap<Integer, ArrayList<Tuple> > referenceLines 	= ProverifVisitorImpl.referenceLines;
			//references lines contient < les lignes qui doivent subir une modif (ie : contiennent un tuple) , ce tuple >
			Combinations combinations = new Combinations(tuples);
			System.out.println("\nTuples found :" + tuples);

			System.out.println(""+combinations.getnumberOfFiles()+" files should be created");

			CombinationsHandler combinationsHandler = new CombinationsHandler(combinations,referenceLines);


		} catch (IOException e) {
			System.err.println("The file : " + path + " does not exist");
		}
	}



	

}
