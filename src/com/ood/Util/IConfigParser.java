package com.ood.Util;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IConfigParser {
    void readFile() throws IOException;
    String getFileName();
    String getFilePath();
    public Map<String, List<String>> getAttributeDataBase();
    List<String> getOrderedSchema();
    void reset();
}
