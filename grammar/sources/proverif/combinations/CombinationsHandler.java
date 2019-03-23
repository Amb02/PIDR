package proverif.combinations;

//combinations imports


//java imports
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.*;

import java.io.FilenameFilter;
import java.io.*;

import java.io.IOException;	
import static java.nio.file.StandardCopyOption.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CombinationsHandler{

	Combinations combinations;
	Tuples tuples;
	File originalFile;
	HashMap<Integer,Tuple> referenceLines = new HashMap();

	public CombinationsHandler(Combinations combinations, HashMap<Integer,Tuple> referenceLines){
		this.combinations	= combinations;
		this.tuples			= combinations.getTuples();
		this.referenceLines	= referenceLines;
		findOriginalFile();
		//System.out.println("Original File founed : "+originalFile.getName());
		// Le fichier original est stocké dans /logs, avec une syntaxe particulière
		ParseCombinations();
		
	}

	private void ParseCombinations(){

		ArrayList<Integer> 			sizes					= combinations.getSizes();
		ArrayList<Integer>			indexOfCombinations		= new ArrayList(sizes.size());
		int 						numberOfFiles			= combinations.getnumberOfFiles();
		
		for (int i : sizes){indexOfCombinations.add(0);} //initialisation
		
		for (int fileIndex = 0 ; fileIndex < numberOfFiles ; fileIndex++){

			//copyFile(originalFile.getName(), fileIndex);
			File file = new File("./logs"+(fileIndex+1)+".pv.log");
			// fichier vide qui sera le nouveau fichier n° fileIndex
			System.out.println(file.getName()+" created");
			HashMap<Tuple,String> correspondanceMap = new HashMap();

			StringBuilder listOfNewTuples = new StringBuilder("\nFile n°"+fileIndex+" :\n< ");
			
			for (Tuple tuple : tuples){
				int indexOfSize = sizes.indexOf(tuple.size());
				listOfNewTuples.append("//"+tuple.getCombinations().get(indexOfCombinations.get(indexOfSize))+"\\\\ , ");
				correspondanceMap.put(tuple,tuple.getCombinations().get(indexOfCombinations.get(indexOfSize)));
				//correspondance Map contient < le tuple , la combinaison par laquelle il doit être remplacé dans ce fichier >
			}

			if(fileIndex != numberOfFiles-1) updateIndexOfCombinations(indexOfCombinations,sizes,numberOfFiles);

			listOfNewTuples.append(" >");
			System.out.println(listOfNewTuples);

			replaceTuple(file,correspondanceMap);
			//on remplace dans le fichier tous les tuples par leur combinaison respective

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

	private void replaceTuple(File file, HashMap<Tuple,String> correspondanceMap){
		int line = 0;

        try {
            BufferedReader readingBuffer = new BufferedReader(new FileReader(originalFile));
            String readLine = "";

			BufferedWriter writtingBuffer = new BufferedWriter(new FileWriter(file, true));

			System.out.println("writing on "+file.getName());

			//ouverture du fichier vide qui sera le fichier créé

            while ((readLine = readingBuffer.readLine()) != null) {
            	String newLine = readLine;
            	//parcours ligne par ligne
            	if (referenceLines.containsKey(line)){ //si la ligne contient un tuple
            		System.out.println("Line key");
            		Tuple tuple 	= referenceLines.get(line);
            		newLine 		= replaceLine(readLine,tuple.getOriginalForm(),correspondanceMap.get(tuple)); //on modifie la ligne (CTRL+F tuple original / combinaison)
            		System.out.println("new line : "+newLine+"\n");
            	}
            	writtingBuffer.write(newLine);
				writtingBuffer.newLine();
                line++;
            }
            readingBuffer.close();
            writtingBuffer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	private String replaceLine(String txt, String fromStr, String toStr){

		System.out.println("replace "+fromStr+" by "+toStr);

		CharSequence from 	= fromStr;
		CharSequence to 	= toStr;

		return txt.replace(from,to);
	}



	private void findOriginalFile(){
		int result	= 0;
		File file	= null;

		FilenameFilter filter = new FilenameFilter(){
			public boolean accept( File dir, String name ) {return name.contains("0_(original_file)_") && name.endsWith(".pv.log");}
		};

		for( File f : new File("./logs").listFiles(filter)){
			result++;
			file = f;
		}
		if (result != 1){
			String error="";
			if (result==0){
				error = "Original File not";
			} else if (result > 1){
				error = "Several Original Files";
			}
			System.err.println(error+" founded");
			System.exit(1);
		}
		this.originalFile = file;
	}

	private void copyFile(String srcName, int number){
		Path from	= Paths.get("./logs/"+srcName);
	    Path to		=  Paths.get("./logs/"+(number+1)+".pv.log");
	    try{
	    	System.out.println("no error");
		    Files.copy(from, to, REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}