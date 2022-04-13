package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AnalysisWriterImpl implements IAnalysisWriter{
	
	private String outputfile;
	
	public AnalysisWriterImpl(String outputFile) {
		this.outputfile = outputfile;
	}

	 @Override
	 //public void save(Map<String, Integer> sortedData)
	 public void writeAnalysis(Map<String, Integer> countedAndSortedData) throws IOException {
	        // Ecrire la methode qui va charger les données dans le fichier résultat voulu --->

	        FileWriter fileWriter = new FileWriter(outputfile, false); // False to replace the content of a file, True to add the content to a file

	        // Creation of a BufferedWriter which is using the fileWriter
	        BufferedWriter writer = new BufferedWriter (fileWriter);


	        try {

								for (Map.Entry<String, Integer> entry : countedAndSortedData.entrySet()) {
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


