package com.ood.Util;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IConfigParser {
    void readFile() throws IOException;
    String getFileName();
    String getFilePath();
    public Map<Integer, List<String>> getAttributeDataBase();
    List<String> getOrderedSchema();
    void reset();
//    int setIndexForData(int startIndex);
    int getLineOfData();
    String getPattern();
}
