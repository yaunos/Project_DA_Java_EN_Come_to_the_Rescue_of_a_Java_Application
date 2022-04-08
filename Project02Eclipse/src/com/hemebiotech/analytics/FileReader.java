package com.hemebiotech.analytics;

import java.io.File;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FileReader {
	public static void main(String args[]) {
		try {
			//File file = new File("test.txt");
			File file = new File("Project02Eclipse/symptoms.txt");
			Scanner scanner = new Scanner(file);
			
			// we choose here to use a Map to count every occurence of each symptom
			Map<String, Integer> occurence = new HashMap<>();
			
			while (scanner.hasNextLine()) {
				//System.out.println(scanner.nextLine());
				//System.out.println("Hello");
				
				String line = scanner.nextLine();
				// occurence.put(line,  1); // First attempt of a new listing
				
				// we check if an occurence of the symptom already happened
				
				occurence.putIfAbsent(line, 0); // Never happened, occured -> we write it
				occurence.put(line, occurence.get(line) + 1); // It already happened -> we use it and increment
				//occurence.put(line, occurence.get(line) + 1); // It already happened -> we use it and increment
				
				
			}
			for (Map.Entry<String, Integer> entry : occurence.entrySet()) {
				System.out.print(entry.getValue());
				System.out.println(" " + entry.getKey().toString());
			}
				
			
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
	}

}
