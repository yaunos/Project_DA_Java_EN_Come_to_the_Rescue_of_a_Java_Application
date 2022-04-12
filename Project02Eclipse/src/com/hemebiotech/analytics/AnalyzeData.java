//Was first called CountSortData.java
package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//public class CountSortData implements IDataProcess {
public class AnalyzeData implements IDataProcess {
	@override
	public Map<String, Integer> Count(List<String> data)
	
	Scanner scanner = new Scanner(file);
	
	if (file.length() > 0) { // *** on teste si le fichier est vide ***
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
			occurence.put(line, occurence.get(line) + 1);

		}
	}
}