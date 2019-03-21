package proverif.combinations;

//combinations imports


//java imports
import java.util.ArrayList;
import java.lang.*;

import proverif.combinations.*;

public class CombinationsHandler{

	Combinations combinations;
	Tuples tuples;

	public CombinationsHandler(Combinations combinations){
		this.combinations	= combinations;
		this.tuples			= combinations.getTuples();
		//ParseCombinations();
		
	}

	private void ParseCombinations(){
		/**
		*	indexOfCombinations est une liste où chaque case correspond à une taille de tuple présent dans le fichier
		**	----Ex:	si fichier = "(a,b) (a,b) (a,b,c,d) (a,b), alors indexOfCombinations=[null,null],
		**			et indexOfCombinations[0] renseigne les tuples de taille 2 et indexOfCombinations[1] renseigne le tuple de taille 4
		***
		*	i=indexOfCombinations[k] est la i-ème combinaison possible pour un tuple dont la taille correspond au k-ième indice de indexOfCombinations
		**	----Ex:	si indexOfCombinations[1]=1, alors les tuples de taille 2 doivent être parenthésés ((a,b),(c,d))
		**			A noter que par exemple indexOfCombinations[0] ne peut valoir que 0 car un seul parenthésage possible pour (a,b)
		***
		*	parcours : '?'
		*/
		ArrayList<Integer> 	sizes				= combinations.getSizes();
		ArrayList<Integer> 	indexOfCombinations	= new ArrayList(sizes.size());
		int 				numberOfFiles		= combinations.getnumberOfFiles();
		for (int fileIndex = 0 ; fileIndex < numberOfFiles ; fileIndex++){
			updateIndexOfCombinations(indexOfCombinations,sizes,numberOfFiles);
			for (Tuple tuple : tuples){
				int indexOfSize = sizes.indexOf(tuple.size());
				/**
				* Le tuple 'tuple' doit être remplacé par liste_des_combinaisons.get(indexOfCombinations.get(indexOfSize))
				* liste_des_combinaisons = tuple.getcombinations()
				*/
				//replace(tuple,tuple.getcombinations().get(indexOfCombinations.get(indexOfSize)));
			}
		}
	}


	private void updateIndexOfCombinations(ArrayList<Integer> indexOfCombinations,ArrayList<Integer> sizes, int numberOfFiles){
		int index=-1;
		int i=0;

		while ( (index==-1) || (i<numberOfFiles)) {
			indexOfCombinations.set(i,indexOfCombinations.get(i)+1);
			if (indexOfCombinations.get(i)==sizes.get(i)){
				indexOfCombinations.set(i,0);
				i++; //recommence à 0 et incrémente la valeur un rang au-dessus
			} else {
				index=i;//the value of infex is useless excepted for the break-condition of the while-loop
			}
		}

		if (index==-1){
			System.err.println("Searching Index Of Combinations : OutOfBoundsException");
			System.exit(1);
		}
	}

}