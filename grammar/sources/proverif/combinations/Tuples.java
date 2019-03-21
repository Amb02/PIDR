package proverif.combinations;

import java.util.ArrayList;

public class Tuples extends ArrayList<Tuple>{

	@Override
	public String toString(){
		String str = "\n<<\n\n";
		int i=0;
		for (Tuple tuple : this){
			str=str+"\t. Tuple n° "+ i +" : " + "\n" + tuple + "\n";
			i++;
		}
		return str+"\n\n>>";
	}

	public void generateAllCombinations () {
		for (Tuple t : this) {
			t.generateCombinations();
		}
	}
}
