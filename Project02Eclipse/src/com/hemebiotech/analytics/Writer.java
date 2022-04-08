package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) {
		// Creation of a filewriter to write in a file
		FileWriter fileWriter = new FileWriter("Project02Eclipse/ResultOut.txt", false);
				
		// Creation of a BufferedWriter which is using the fileWriter
		BufferedWriter writer = new BufferedWriter (fileWriter);
		
		
			try {
				
				// add some text in our output file
				writer.write("some text");
				
				// line break
				writer.newLine();
				
				writer.write("some other text");
			
				catch (IOException e) {
				
					e.printStackTrace();
				
				}
		writer.close();	
	
			}
		

	}

}
	
	
