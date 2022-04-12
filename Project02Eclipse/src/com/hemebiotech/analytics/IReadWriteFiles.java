package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface IReadWriteFiles {
	
    List<String> ReadData(String filepath);

    public void Save(Map<String, Integer> data); //what needs to be done for 


}
