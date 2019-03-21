package proverif.combinations;

import java.util.ArrayList;

public class Tuples extends ArrayList<Tuple>{

	@Override
	public String toString(){
		String str = "\n<<\n\n";
		int i=0;
		for (Tuple tuple : this){
			str=str+"#Tuple n° "+ i +" : " + "\n" + tuple + "\n";
			i++;
		}
		return str+"\n\n>>";
	}

	public String toShortString(){
		String str = "\n<<\n";
		int i=0;
		for (Tuple tuple : this){
			str=str+"\tTuple n° "+ i +" : " + "\n" + tuple.toShortString() + "\n";
			i++;
		}
		return str+"\n>>";
	}

	public void generateAllCombinations () {
		for (Tuple t : this) {
			t.generateCombinations();
		}
	}

	public	int numberOfFiles(){
		ArrayList<Integer> sizes = new ArrayList();
		int numberOfFiles = 1;
		for (Tuple tuple : this){
			int currentSize = tuple.size();
			if (!sizes.contains(currentSize)){
				sizes.add(currentSize);
				numberOfFiles = numberOfFiles * tuple.size();
			}
		}
		return numberOfFiles;
	}
}
