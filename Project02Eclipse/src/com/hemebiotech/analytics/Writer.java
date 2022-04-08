package com.hemebiotech.analytics;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

			public static void main(String[] args) throws IOException {
				// Creation of a filewriter to write in a file
				FileWriter fileWriter = new FileWriter("ResultOut.txt", true); // False to replace the content of a file, True to add the content to a file
						
				// Creation of a BufferedWriter which is using the fileWriter
				BufferedWriter writer = new BufferedWriter (fileWriter);
				
				
					try {
						
						// add some text in our output file
						writer.write("some more text");
						
						// line break
						writer.newLine();
						writer.write("some other text");
						writer.newLine();
						}
					
					
					
						catch (IOException e) {
						
							e.printStackTrace();
						
						}
				writer.close();	
			

		}
	}
			