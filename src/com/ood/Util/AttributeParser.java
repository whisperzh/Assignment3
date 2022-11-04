package com.ood.Util;

import com.ood.AttributesItems.LMH_DataCenter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *  Character Attribute FileReader
 */
public class AttributeParser implements IConfigParser{
    private String filePath;

    private Map<Integer, List<String>> attributeDataBase;

    private List<String> orderedSchema;

    private int startIndex;

    private boolean heroData;

    private Enum characterEnum=null;

    public AttributeParser(String filePath, int startIndex, boolean heroData, Enum anEnum) {
        this.characterEnum=anEnum;
        this.heroData=heroData;
        this.filePath = filePath;
        this.startIndex = startIndex;
        attributeDataBase=new HashMap<>();
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        if(heroData)
        {
            LMH_DataCenter.addAllHero(attributeDataBase.values());
        }else {
            LMH_DataCenter.addAllMonster(attributeDataBase.values());
        }
    }

    @Override
    public String getFileName() {
        String[] names=filePath.split("/");
        return names[names.length-1];
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public Map<Integer, List<String>> getAttributeDataBase() {
        return attributeDataBase;
    }

    @Override
    public List<String> getOrderedSchema() {
        return orderedSchema;
    }


    @Override
    public void reset() {
        if(orderedSchema!=null)
        {
            orderedSchema.clear();
        }
        attributeDataBase.clear();
    }

//    @Override
//    public int setIndexForData(int startIndex) {
//        orderedSchema.add("index");
//        for (var l : attributeDataBase.keySet()) {
//            attributeDataBase.get(l).add(Integer.toString(startIndex));
//            startIndex++;
//        }
//        return startIndex;
//    }

    @Override
    public int getLineOfData() {
        return attributeDataBase.size();
    }

    public void createSchema(String s){
        String[] titles=s.split("/");
        orderedSchema=new ArrayList<>();
        orderedSchema.addAll((List<String>)Arrays.asList(titles));
        orderedSchema.add("Character type");
    }

    public void createActualData(String s){
        String[] titles=s.split("\\s+");
        List<String > l=new ArrayList<>();
        for(var st: titles)
            l.add(st);
        l.add(characterEnum.toString());
        attributeDataBase.put(startIndex++,l);
    }



}
