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

      ProverifVisitorImpl.tuples.generateAllCombinations();
      System.out.println("\nTuples found :" + ProverifVisitorImpl.tuples);

      Collections.sort(ProverifVisitorImpl.tuples, new Comparator<Tuple>() {
        @Override //utile ou déjà appel à compareTo dans Tuple.java ?
        public int compare(Tuple tuple1, Tuple tuple2){
          return  tuple1.compareTo(tuple2);
        }
      });

      System.out.println("\nSame tuples list sorted :" + ProverifVisitorImpl.tuples.toShortString());
      System.out.println(ProverifVisitorImpl.tuples.numberOfFiles()+" files should be created");


    } catch (IOException e) {
      System.err.println("The file : " + path + " does not exist");
    }
  }
}
