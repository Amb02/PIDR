package proverif.combinations;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

import java.util.Comparator;


public class Tuple extends ArrayList<String> implements Comparable<Tuple>{
	private String originalForm = null;
	private ArrayList<String> combinations;

	private boolean isElement (String text) {
		return !(text.equals("(") || text.equals(",") || text.equals(")"));
	}

	public Tuple () {
		super();
	}

	public Tuple (ParserRuleContext ctx) {

		this.combinations	= new ArrayList<>();
		originalForm = ctx.getText();
		ArrayList<ParseTree> list = new ArrayList();

		for (int i = 0 ; i < ctx.getChildCount() ; i++){
			ParseTree child = ctx.getChild(i);
			String txt = child.getText();

			if (isElement(txt)) {
				this.add(child.getText());
			}
		}
	}

	public Tuple(ArrayList<ParseTree> list){
		for (ParseTree child : list){
			this.add(child.getText());
		}
	}

	private ArrayList<String> multiElementTupleCombination (Tuple t) {
		ArrayList<String> possibilite = new ArrayList<>();

		for (int i = 1; i < t.size(); i ++) {
			ArrayList<String> gauche = generate(t.beforeIndex(i));
			ArrayList<String> droite = generate(t.afterIndex(i));

			String membreGauche = "";
			String membreDroite = "";

			for (String gaucheString : gauche) {
				for (String droiteString : droite) {
					membreGauche = gaucheString;

					if (gaucheString.contains(",")){
						membreGauche = "(" + membreGauche + ")";
					}

					membreDroite = droiteString;
					if (droiteString.contains(",")) {
						membreDroite = "(" + membreDroite + ")";
					}

					possibilite.add(membreGauche + ", " + membreDroite);
				}
			}
		}

		return possibilite;
	}

	private ArrayList<String> generate (Tuple t) {
		ArrayList<String> possibilite = new ArrayList<>();

		if (t.size() == 1) {
			possibilite.add(t.get(0));
		} else if (t.size() == 2) {
			possibilite.add(t.get(0) + ", " + t.get(1));
		} else if (t.size() != 0) {
			possibilite = this.multiElementTupleCombination(t);
		}

		return possibilite;
	}

	public void generateCombinations () {
		ArrayList<String> possibilities = this.generate(this);
		for (int i = 0; i < possibilities.size(); i ++) {
			String element = possibilities.get(i);
			possibilities.set(i, "(" + element + ")");
		}

		this.combinations = possibilities;
	}

	public String toShortString (){
		StringBuilder string = new StringBuilder("");
		if (originalForm != null) {
			string.append(originalForm);
		} else {
			string.append(stringList());
		}

		string.append("\n");

		return string.toString();
	}

	@Override
	public String toString (){
		StringBuilder string = new StringBuilder(". Tuple : \n");
		if (originalForm != null) {
			string.append(originalForm);
		} else {
			string.append(stringList());
		}

		if (combinations.size() != 0) {
			string.append("\nPossible combinations :\n");

			for (String s : combinations) {
				string.append(s + " | ");
			}

		} else {
			string.append("\nCombinations not yet computed.\n");
		}

		string.append("\n");

		return string.toString();
	}


	@Override
	public int compareTo(Tuple tuple) {
		//    	return (this.size().compareTo(tuple.size()));
		//    	return ( this.size().compare(tuple.size()) );
		return ( this.size()-tuple.size() );
	}

	public ArrayList<String> getCombinations () {
		return this.combinations;
	}

	public String getOriginalForm () {
		return this.originalForm;
	}

	public Tuple beforeIndex (int index) {
		Tuple t = new Tuple();

		if (index < this.size()) {
			for (int i = 0; i < index; i ++) {
				t.add(this.get(i));
			}
		}

		return t;
	}

	public Tuple afterIndex (int index) {
		Tuple t = new Tuple();

		if (index >= 0) {
			for (int i = index; i < this.size(); i ++) {
				t.add(this.get(i));
			}
		}

		return t;
	}

	public String stringList () {
		String string = new String("list : ");

		for (String object : this) {
			string += "" + object.toString() + " | ";
		}

		string += "\n";
		return string;
	}


}
