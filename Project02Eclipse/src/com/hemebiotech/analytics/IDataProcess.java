package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface IDataProcess {
	
	//if we choose the "easy" one step treemap mode
	Map<String, Integer> AnalyzeData(List<String> data);
    
	//if we choose and create the quickSort mode
	//Map<String, Integer> Count(List<String> data);

    //Map<String, Integer> Sort(Map<String, Integer> data);

}
