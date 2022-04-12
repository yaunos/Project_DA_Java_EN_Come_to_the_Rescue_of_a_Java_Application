package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	// private static int headacheCount = 0;	// initialize to 0
	// private static int rashCount = 0;		// initialize to 0
	// private static int pupilCount = 0;		// initialize to 0
	
	public static void main(String args[]) throws Exception {
		
        IReadWriteFiles readwritefiles = new ReadWriteData();

        //IDataProcess dataprocess = new CountSortData();
        IDataProcess dataprocess = new AnalyzeData();

        // Lire dans un fichier
        List<String> data = readwritefiles.ReadData("Project02Eclipse/symptoms.txt");

        // Compter le nombre d'occurence des éléments (engendrait des erreurs alors je l'ai commenté)
        //Map<String, Integer> countedData = dataprocess.Count(data);

        // Trier (engendrait des erreurs alors je l'ai commenté)
        //Map<String, Integer> sortedData =dataprocess.Sort(countedData);
        
        // Compter+trier en une fois (remplacé par le suivant)
        //Map<String, Integer> sortedData =dataprocess.CountSort(countedData);
        
        //Si on parvient à faire les 2 traitements à la fois ce qui est le cas dans FileReaderTreeMap.java
        Map<String, Integer> analyzedData = dataprocess.AnalyzeData(data);

        // Charger dans un autre fichier
        //readwritefiles.Save(sortedData);
        readwritefiles.Save(analyzedData);
		
		
		
		
		/* Following code to be deleted or reused in the depending classes through Interfaces
		 * Anthony
		
		
		
		
		
		// first get input
		
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();
		//FileWriter writer = new FileWriter ("Project02Eclipse/result.txt");

		// int headCount = 0;	// counts headaches
		while (line != null) {
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headacheCount++;
				System.out.println("number of headaches: " + headacheCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
				System.out.println("number of rashes: " + rashCount);
			}
			else if (line.contains("pupils")) {
				pupilCount++;
				System.out.println("number of dialated pupils: " + pupilCount);
			}

			line = reader.readLine();	// get another symptom
			
		}	
		
		
		
	
		// next generate output -> this code doesn't work
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
		
		 */
		}
	}

	

