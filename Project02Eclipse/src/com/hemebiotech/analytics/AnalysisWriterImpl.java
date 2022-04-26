package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This one creates an output file then writes line by line the different keys and values of a Map
 *
 */

public class AnalysisWriterImpl implements IAnalysisWriter{
	
	private String outputfile;
	
	public AnalysisWriterImpl(String outputfile) {
		this.outputfile = outputfile;
	}

	 @Override
	 //public void save(Map<String, Integer> sortedData)
	 public void writeAnalysis(Map<String, Integer> countedAndSortedData) throws IOException {
	        //the method which is writing the desired data in a file --->

	        FileWriter fileWriter = new FileWriter(outputfile, false); // False to replace the content of a file, True to add the content to a file

	        // Creation of a BufferedWriter which is using the fileWriter
	        BufferedWriter writer = new BufferedWriter (fileWriter);


	        try {

					for (Map.Entry<String, Integer> entry : countedAndSortedData.entrySet()) {
									// insert data in a BufferedWriter writer = new BufferedWriter (fileWriter); ** 
						writer.write(entry.getKey());
						writer.write(" : " + entry.getValue().toString());
						writer.newLine();
						}
					}							
						
			catch (IOException e) {
							
					e.printStackTrace();
							
				}
					writer.close();	
				

			}
}


