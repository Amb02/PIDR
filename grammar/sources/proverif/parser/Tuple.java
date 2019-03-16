package proverif.parser;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.*;

public class Tuple extends ArrayList<ParseTree>{

	Tuples tuples;

//	public Tuple(Tuples tuples, ParseTree ... children){
	public Tuple(Tuples tuples, ArrayList<ParseTree> list){
		this.tuples = tuples;
		for (ParseTree child : list){
			this.add(child);
		}
		tuples.add(this);

	}

	@Override
	public String toString(){
		int i=0;
		String str = "< ";
		for (ParseTree leaf : this){
			str=str+leaf.getText();
			if (i!=size()-1){str=str+" , ";}
			i++;
		}
		return str+" >";
	}
	
}