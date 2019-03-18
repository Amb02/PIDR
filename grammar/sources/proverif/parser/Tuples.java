package proverif.parser;

import java.util.ArrayList;

public class Tuples extends ArrayList<Tuple>{

	@Override
	public String toString(){
		String str = "\n<<\n";
		int i=0;
		for (Tuple tuple : this){
			str=str+"\tTuple n° "+i+" : "+tuple+"\n";
			i++;
		}
		return str+">>";
	}
}
