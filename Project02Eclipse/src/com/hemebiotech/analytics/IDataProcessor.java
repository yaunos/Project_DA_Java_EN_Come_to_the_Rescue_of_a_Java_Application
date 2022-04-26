package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Counts and sort the data
 *
 */

public interface IDataProcessor {
	
	/**
	 * Takes the available data available
	 * 
	 * @return a sorted map listing where all Symptoms are counted obtained from a data source
	 */
	
	
	Map<String, Integer> countAndSortData(List<String> symptoms);
    

}
