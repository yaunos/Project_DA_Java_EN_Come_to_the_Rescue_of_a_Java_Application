package com.hemebiotech.analytics;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;

public class FileReaderTreeMap {

	public static void main(String args[]) {
		try {
			//File file = new File("test.txt");
			File file = new File("Project02Eclipse/symptoms.txt");
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
					occurence.put(line, occurence.get(line) + 1); // It already happened -> we use it and increment
					//occurence.put(line, occurence.get(line) + 1); // It already happened -> we use it and increment
					
					
				}
				
				
				for (Map.Entry<String, Integer> entry : occurence.entrySet()) {
					// comment insérer dans un fichier depuis ** BufferedWriter writer = new BufferedWriter (fileWriter); ** 
					System.out.print(entry.getValue());
					System.out.println(" = " + entry.getKey().toString());
					}
				}
			else {

				System.out.print("fichier vide");
				

			
			}
		}
		catch(FileNotFoundException e) {
			System.out.print("fichier n'existe pas");
		}
		
			
		
	
		}
	/*	}catch(Exception e){ 						//Exception par défaut
			System.out.println(e.getStackTrace());
		}
		
		*/
			
	
	
	
		// Exceptions supplémentaires
	}