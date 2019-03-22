package proverif.combinations;

//combinations imports


//java imports
import java.util.ArrayList;
import java.lang.*;


public class CombinationsHandler{

	Combinations combinations;
	Tuples tuples;

	public CombinationsHandler(Combinations combinations){
		this.combinations	= combinations;
		this.tuples			= combinations.getTuples();
		ParseCombinations();
		
	}

	private void ParseCombinations(){

		ArrayList<Integer> 			sizes					= combinations.getSizes();
		ArrayList<Integer>			indexOfCombinations		= new ArrayList(sizes.size());
		int 						numberOfFiles			= combinations.getnumberOfFiles();
		
		for (int i : sizes){indexOfCombinations.add(0);} //initialisation
		
		for (int fileIndex = 0 ; fileIndex < numberOfFiles ; fileIndex++){
			StringBuilder listOfNewTuples = new StringBuilder("\nFile n°"+fileIndex+" :\n< ");
			
			for (Tuple tuple : tuples){
				int indexOfSize = sizes.indexOf(tuple.size());
				listOfNewTuples.append("//"+tuple.getCombinations().get(indexOfCombinations.get(indexOfSize))+"\\\\ , ");}

			if(fileIndex != numberOfFiles-1) updateIndexOfCombinations(indexOfCombinations,sizes,numberOfFiles);

			listOfNewTuples.append(" >");
			System.out.println(listOfNewTuples);

		}

	}


	private void updateIndexOfCombinations(ArrayList<Integer> indexOfCombinations, ArrayList<Integer> sizes, int numberOfFiles){
		int index=-1;
		int i=0;
		
		while ( (index==-1) && (i<sizes.size())) {
			indexOfCombinations.set(i,indexOfCombinations.get(i)+1);
			if (indexOfCombinations.get(i)==combinations.numberOfCombinations.get(sizes.get(i))){ 
				indexOfCombinations.set(i,0);
				i++; //recommence à 0 et incrémente la valeur un rang au-dessus
			} else {
				index=i;//the value of infex is useless excepted for the break-condition of the while-loop (could be binary : -1 or other value)
			}
		}

		if (index==-1){
			System.err.println("Searching Index Of Combinations : OutOfBoundsException");
			System.exit(1);
		}
		
	}

}