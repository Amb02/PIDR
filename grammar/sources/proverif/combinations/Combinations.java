package proverif.combinations;

import java.util.ArrayList;
import java.util.HashMap;

public final class Combinations{

	private final Tuples tuples;

	private ArrayList<Integer> sizes = new ArrayList();
	private int numberOfFiles = -1;
	public 	HashMap<Integer,Integer>	numberOfCombinations	= new HashMap();


	public Combinations(Tuples tuples){
		this.tuples = tuples;
		generateAllCombinations();
		checkFiles();
	}

	public void generateAllCombinations () {
		for (Tuple t : tuples) {
			t.generateCombinations();
		}
	}

	/**
	* The aim of this function is
	* - to avoid mutiple creations (and parsing) of the array "sizes"
	*	- to avoid mutiple caclulating of numberOfFiles (replace the old numberOfFiles-function)
	*	- to full the sizes-attribute of the class with the array "sizes"
	*/
	public void checkFiles(){
		int numberOfFiles			= 1;
		for (Tuple tuple : tuples){
			int currentSize = tuple.size();
			if (!sizes.contains(currentSize)){
				sizes.add(currentSize);
				this.numberOfCombinations.put(currentSize,tuple.getCombinations().size());
				numberOfFiles = numberOfFiles * tuple.getCombinations().size(); //nombre de combinaisons possibles
			}
		}

		this.numberOfFiles	= numberOfFiles;
	}

	public int getnumberOfFiles() { return this.numberOfFiles;}
	public ArrayList<Integer>	getSizes() { return this.sizes;		}
	public Tuples getTuples()			{ return this.tuples;		}

}
