package com.ood.Util;

import java.io.IOException;
import java.util.List;

public interface IConfigParser {
    void readFile() throws IOException;
    String getFileName();
    String getFilePath();
    public List<List<String>> getAttributeDataBase();
    List<String> getOrderedSchema();
    void reset();
//    int setIndexForData(int startIndex);
    int getLineOfData();
    String getPattern();
    List<List<String>> getItemsWithTitle();
}
