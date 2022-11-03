package com.ood.Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParseCollection {
    private List<IConfigParser> parsers;

    private int totalDataCount=0;

    public ParseCollection() {
        parsers=new ArrayList<>();
    }
    public void AddParser(String parserPath){
        IConfigParser p=new AttributeParser(parserPath,totalDataCount);
        parsers.add(p);
        totalDataCount+=p.getLineOfData();
    }

    public void AddParsers(List<String> parserPaths)
    {
        Iterator<String> iterator =parserPaths.iterator();
        for ( ; iterator.hasNext();)
        {
            AddParser(iterator.next());
        }
    }

    public List<IConfigParser> getParsers() {
        return parsers;
    }

    public void setParsers(List<IConfigParser> parsers) {
        this.parsers = parsers;
    }

    public int getTotalDataCount() {
        return totalDataCount;
    }

    public IConfigParser getParserAt(int index){
        return parsers.get(index);
    }

    public int getParserSize(){
        return parsers.size();
    }

    public void setTotalDataCount(int totalDataCount) {
        this.totalDataCount = totalDataCount;
    }
}
