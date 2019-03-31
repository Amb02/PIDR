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

import proverif.file.*;

public class CombinationsHandler{

	Combinations combinations;
	Tuples tuples;
	File originalFile;
	HashMap<Integer, ArrayList<Tuple> > referenceLines = new HashMap();

	public CombinationsHandler(Combinations combinations, HashMap<Integer, ArrayList<Tuple> > referenceLines){
		this.combinations	= combinations;
		this.tuples			= combinations.getTuples();
		this.referenceLines	= referenceLines;
		findOriginalFile();
		//System.out.println("Original File found : "+originalFile.getName());
		// Le fichier original est stocké dans /logs, avec une syntaxe particulière
		ParseCombinations();

	}

	private void ParseCombinations(){

		ArrayList<Integer> 			sizes					= combinations.getSizes();
		ArrayList<Integer>			indexOfCombinations		= new ArrayList(sizes.size());
		int 						numberOfFiles			= combinations.getnumberOfFiles();

		for (int i : sizes){indexOfCombinations.add(0);} //initialisation

		String originalFileName = FileGenerator.getOriginalName();
		String directoryName = "logs/" + originalFileName;
		System.out.println("Creation du dossier " + directoryName);
		FileGenerator.cleanDirectory(directoryName);
		new File(directoryName).mkdirs();

		if (numberOfFiles>1){

			for (int fileIndex = 0 ; fileIndex < numberOfFiles ; fileIndex++){
				File file = new File(directoryName + "/" + originalFileName + "_" +(fileIndex+1) + FileGenerator.EXTENSION);
				
				try {
					Files.deleteIfExists(file.toPath());
				} catch (IOException e) {
					e.printStackTrace();
				}

				// fichier vide qui sera le nouveau fichier n° fileIndex
				System.out.println(file.getName() + " created");
				HashMap<Tuple,String> correspondanceMap = new HashMap();

				StringBuilder listOfNewTuples = new StringBuilder("\nFile n°" + fileIndex + " :\n< ");

				for (Tuple tuple : tuples){
					int indexOfSize = sizes.indexOf(tuple.size());
					listOfNewTuples.append("//"+tuple.getCombinations().get(indexOfCombinations.get(indexOfSize))+"\\\\ , ");
					correspondanceMap.put(tuple,tuple.getCombinations().get(indexOfCombinations.get(indexOfSize)));
					//correspondance Map contient < le tuple , la combinaison par laquelle il doit être remplacé dans ce fichier >
				}

				if(fileIndex != numberOfFiles-1) updateIndexOfCombinations(indexOfCombinations,sizes,numberOfFiles);

				listOfNewTuples.append(" >");
				//System.out.println(listOfNewTuples);

				replaceTuple(file,correspondanceMap);
				//on remplace dans le fichier tous les tuples par leur combinaison respective

			}
		} else System.out.println("No change from the original file");

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
		int line = 1;
		try {
			BufferedReader readingBuffer = new BufferedReader(new FileReader(originalFile));
			String readLine = "";

			BufferedWriter writtingBuffer = new BufferedWriter(new FileWriter(file, true));


			//ouverture du fichier vide qui sera le fichier créé

			while ((readLine = readingBuffer.readLine()) != null) {
				String newLine = readLine;
				//parcours ligne par ligne
				//System.out.println("l."+line+" : >"+readLine);
				if (referenceLines.containsKey(line)){ //si la ligne contient un tuple
					//            		System.out.println("Line key : "+line+"\nThe line key is : --\""+readLine+"\"--");
					ArrayList<Tuple> listOfTupleInThisLine 	= referenceLines.get(line);
					newLine = readLine;
					for (Tuple tuple : listOfTupleInThisLine){
						String originalString = tuple.getOriginalForm();
						String newString = correspondanceMap.get(tuple);

						if (!originalString.replaceAll("\\s+", "").equals(newString.replaceAll("\\s+", ""))) {
							//System.out.println("complete string to replace from : " + newLine + " pattern to look for : " + originalString + " replaced with :" + newString);
							newLine = replaceLine(newLine, originalString, newString);  //on modifie la ligne (CTRL+F tuple original / combinaison)
							//System.out.println("giving :  " + newLine );
						}
					}
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
		CharSequence from 	= fromStr;
		CharSequence to 	= toStr;
		return txt.replace(from,to);
	}



	private void findOriginalFile(){
		originalFile = FileGenerator.getOriginalFile();
	}
}
