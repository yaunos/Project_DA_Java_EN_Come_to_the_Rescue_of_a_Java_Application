package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface IDataProcessor {
	
	//if we choose the "easy" one step treemap mode
	Map<String, Integer> countAndSortData(List<String> symptoms);
    
	//if we choose and create the quickSort mode
	//Map<String, Integer> Count(List<String> data);

    //Map<String, Integer> Sort(Map<String, Integer> data);

}
