package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ReadWriteData implements IReadWriteFiles{
	@Override
	
	public List<String> ReadData(String filepath) {  //
		Scanner scanner = new Scanner(filepath);
		
		if (filepath.length() > 0) { // *** on teste si le fichier est vide ***
			// we choose here to use a Map to count every occurence of each symptom
			Map<String, Integer> occurence = new TreeMap<>();
			
			while (scanner.hasNextLine()) {
				//System.out.println(scanner.nextLine());
				//System.out.println("Hello");
				
				String line = scanner.nextLine();
				// occurence.put(line,  1); // First attempt of a new listing
				
				// we check if an occurence of the symptom already happened
				//Creation of a Counter class // va prendre en parametre la liste des mots
				
				occurence.putIfAbsent(line, 0); // Never happened, occured -> we write it
				occurence.put(line, occurence.get(line) + 1); // It already happened -> we use it and increment
			}
				
	}
		return occurrence;
	}
	
	

	
	 @Override
	 //public void save(Map<String, Integer> sortedData)
	 public void Save(Map<String, Integer> analyzedData){
	        // Ecrire la methode qui va charger les données dans le fichier résultat voulu --->

	        FileWriter fileWriter = new FileWriter("ResultOut.txt", true); // False to replace the content of a file, True to add the content to a file

	        // Creation of a BufferedWriter which is using the fileWriter
	        BufferedWriter writer = new BufferedWriter (fileWriter);


	        try {

							for (Map.Entry<String, Integer> entry : occurence.entrySet()) {
								// comment insérer dans un fichier depuis ** BufferedWriter writer = new BufferedWriter (fileWriter); ** 
								writer.write(entry.getValue());
								writer.write(" = " + entry.getKey().toString());
								writer.newLine();
								}
							}
						
						
						
							catch (IOException e) {
							
								e.printStackTrace();
							
							}
					writer.close();	
				

			}
}


