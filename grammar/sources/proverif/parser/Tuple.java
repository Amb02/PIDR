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

	//should not be called exect by right_parenthesis
	private String right_parenthesis(ArrayList<String> list, int i){
		if (i==list.size()-1){
			return list.get(i);
		}
	    else{
    	    return '('+list.get(i)+','+right_parenthesis(list,i+1)+')';
    	}
	}

	private String right_parenthesis(ArrayList<String> list){return right_parenthesis(list,0);}


	//should not be called exect by left_parenthesis
	private String left_parenthesis(ArrayList<String> list, int i){
		if (i==0){
			return list.get(i);
		}
	    else{
    	    return '('+left_parenthesis(list,i-1)+','+list.get(i)+')';
    	}
	}

	private String left_parenthesis(ArrayList<String> list){return left_parenthesis(list,list.size()-1);}


	public ArrayList<String> getPermutations(){
		ArrayList<String> elements = new ArrayList();
		for (ParseTree leaf : this){
			elements.add(leaf.getText());
		}
		
		ArrayList<String> permutations = new ArrayList();
		permutations.add(left_parenthesis(elements));
		permutations.add(right_parenthesis(elements));

		return permutations;
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