package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * This analyses alls symptoms found in a file and creates a resulting file of the analyse 
 *
 */

public class AnalyticsCounter {
		
        private ISymptomReader symptomReader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

        private IDataProcessor dataProcessor = new DataProcessorImpl();
        
        private IAnalysisWriter analysisWriter = new AnalysisWriterImpl("result.out");
        		
        public static void main(String[] args) throws IOException { 
        	AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        	analyticsCounter.process();
	
		}
        
        public void process() throws IOException {
            List<String> symptoms = symptomReader.getSymptoms();

            Map<String, Integer> countedAndSortedData = dataProcessor.countAndSortData(symptoms);

            analysisWriter.writeAnalysis(countedAndSortedData);
        }
	
}

	

