package proverif;

import java.io.IOException;

import java.util.Collections;
import java.util.Comparator;

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

			Tuples tuples = ProverifVisitorImpl.tuples;
			Combinations combinations = new Combinations(tuples);
			System.out.println("\nTuples found :" + tuples);

			/**	WARNING (Deprecated (?) since 03/21 23:05 with creation of CombinationsHandler, but the useless of the sorting should be checked again)
			* This step is (for the moment) essential because of the link between indexOfCombinations-array and sizes-array.
			* Indeed, to search the numberOfCombinations for a given-size tuple, indexOfCombinations search this information with the index is the array "sizes".
			*/
			Collections.sort(tuples, new Comparator<Tuple>() {
				@Override //utile ou déjà appel à compareTo dans Tuple.java ?
				public int compare(Tuple tuple1, Tuple tuple2){
					return	tuple1.compareTo(tuple2);
				}
			});

			System.out.println("\nSame tuples list sorted :" + tuples.toShortString());
			System.out.println(""+combinations.getnumberOfFiles()+" files should be created");

			CombinationsHandler combinationsHandler = new CombinationsHandler(combinations);

		} catch (IOException e) {
			System.err.println("The file : " + path + " does not exist");
		}
	}



	

}
