package proverif.combinations;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

import java.util.Comparator;


public class Tuple extends ArrayList<ParseTree> implements Comparable<Tuple>{

    private boolean isElement (String text) {
	return !(text.equals("(") || text.equals(",") || text.equals(")"));
    }
    
    public Tuple (ParserRuleContext ctx) {
	String state = "begin";
	ArrayList<ParseTree> list = new ArrayList();

	for (int i = 0 ; i < ctx.getChildCount() ; i++){

	    ParseTree child = ctx.getChild(i);
	    String txt = child.getText();

	    if (isElement(txt)) {
		this.add(child);
	    }
	}
    }
    
    public Tuple(ArrayList<ParseTree> list){
	for (ParseTree child : list){
	    this.add(child);
	}
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


    @Override
    public int compareTo(Tuple tuple) {
//    	return (this.size().compareTo(tuple.size()));
//    	return ( this.size().compare(tuple.size()) );
    	return ( this.size()-tuple.size() );
    }
	
}
