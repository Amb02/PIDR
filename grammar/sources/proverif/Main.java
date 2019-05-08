package proverif;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

import java.util.Collections;
import java.util.Comparator;


import proverif.combinations.*;
import proverif.parser.*;
import proverif.file.*;


public class Main {

	public static void main (String [] args) {

		String path = "default";

		try {
			if (args.length != 0) {
				path = args[0];
			}

			FileWriter fw = new FileWriter(new File("file_not_parsing.txt"));
			FileParser parser = new FileParser(path, fw);

			parser.parse();

			fw.close();
		} catch (IOException e) {
			System.err.println("The file : " + path + " does not exist");
		}
	}





}
