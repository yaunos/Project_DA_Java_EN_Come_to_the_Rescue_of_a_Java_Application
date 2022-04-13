package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DataProcessorImpl implements IDataProcessor{
	
	
	@Override
	public Map<String, Integer> countAndSortData(List<String> symptoms) {  //
		
		Map<String, Integer> output = new TreeMap<>();
		for(int i =0; i < symptoms.size(); i++) {
			String symptom = symptoms.get(i);
			if (output.containsKey(symptom)) {
				int occurence = output.get(symptom)+1;
				output.put(symptom, occurence);
			} else {
				output.put(symptom, 1);
			}
				
		}
		
		return output;
		
		//Scanner scanner = new Scanner(filepath);
		
		//if (filepath.length() > 0) { // *** on teste si le fichier est vide ***
			// we choose here to use a Map to count every occurence of each symptom
			
			
			/*while (scanner.hasNextLine()) {
				//System.out.println(scanner.nextLine());
				//System.out.println("Hello");
				
				String line = scanner.nextLine();
				// occurence.put(line,  1); // First attempt of a new listing
				
				// we check if an occurence of the symptom already happened
				//Creation of a Counter class // va prendre en parametre la liste des mots
				
				occurence.putIfAbsent(line, 0); // Never happened, occured -> we write it
				occurence.put(line, occurence.get(line) + 1); // It already happened -> we use it and increment
			
			}
			return output //output occurence	
			
		}
			 */	
	}

	

}
