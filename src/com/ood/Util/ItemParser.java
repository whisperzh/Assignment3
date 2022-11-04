package com.ood.Util;

import com.ood.AttributesItems.LMH_DataCenter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ItemParser implements IConfigParser{
    private String filePath;

    private List<List<String >> items;

    private List<String> orderedSchema;

    private Enum itemEnum=null;

    public ItemParser(String filePath,Enum itemEnum) {
        this.items=new ArrayList<>();
        this.itemEnum=itemEnum;
        this.filePath = filePath;
        try {
            readFile();
        } catch (IOException e) {
            return;
        }
    }

    @Override
    public void readFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String curLine;
        int line=0;
        while ((curLine = bufferedReader.readLine()) != null){
             if(line==0)
             {
                 createSchema(curLine);
                 line++;
                 continue;
             }
             createActualData(curLine);
             line++;
        }
        bufferedReader.close();

    }

    public void createActualData(String s){
        String[] titles=s.split("\\s+");
        List<String > l=new ArrayList<>();
        for(var st: titles)
            l.add(st);
        l.add(itemEnum.toString());
        items.add(l);
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
        return null;
    }

    @Override
    public List<String> getOrderedSchema(){
        return orderedSchema;
    }

    @Override
    public void reset() {

    }

    @Override
    public int getLineOfData() {
        return items.size();
    }

    public List<List<String>> getItems(){
        return items;
    }

    @Override
    public String getPattern() {
        return null;
    }

    public void createSchema(String s){
        String[] titles=s.split("/");
        orderedSchema=new ArrayList<>();
        orderedSchema.addAll((List<String>) Arrays.asList(titles));
        orderedSchema.add("Item type");
    }
}
