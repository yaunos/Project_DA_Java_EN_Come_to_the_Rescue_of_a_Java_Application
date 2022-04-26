package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This one checks the occurences of a symptom : it increments the value if already known, otherwise initiates the occurence to 1
 *
 */

public class DataProcessorImpl implements IDataProcessor{
	
	
	@Override
	public Map<String, Integer> countAndSortData(List<String> symptoms) {  //
		
		Map<String, Integer> output = new TreeMap<>();
		for(String symptom: symptoms) {
			if (output.containsKey(symptom)) {
				int occurence = output.get(symptom)+1;
				output.put(symptom, occurence);
			} else {
				output.put(symptom, 1);
			}
				
		}
		
		return output;
		
	}
	
}
