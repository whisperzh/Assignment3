package com.ood.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.PublicKey;
import java.util.*;

public class AttributeParser implements IConfigParser{
    private String filePath;

    private Map<String, List<String>> attributeDataBase;

    private List<String> orderedSchema;

    public AttributeParser(String filePath) {
        this.filePath = filePath;
        attributeDataBase=new HashMap<>();
    }

    public void readFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String curLine;
        int line=0;
        while ((curLine = bufferedReader.readLine()) != null){
            if(line==0) {
                createSchema(curLine);
                line++;
                continue;
            }
            createActualData(curLine);
            line++;
        }
        bufferedReader.close();
    }

    @Override
    public void reset() {
        if(orderedSchema!=null)
        {
            orderedSchema.clear();
        }
        attributeDataBase.clear();
    }

    public void createSchema(String s){
        String[] titles=s.split("/");
        orderedSchema= (List<String>)Arrays.asList(titles);
    }

    public void createActualData(String s){
        String[] titles=s.split("\\s+");
        for(int i=0;i<titles.length;i++)
        {
            attributeDataBase.put(titles[0],Arrays.asList(titles));
        }

    }



}
