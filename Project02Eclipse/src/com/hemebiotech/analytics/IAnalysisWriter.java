package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Writes the analysis of some data from a map
 *
 */

public interface IAnalysisWriter {

    public void writeAnalysis(Map<String, Integer> data) throws IOException;


}
