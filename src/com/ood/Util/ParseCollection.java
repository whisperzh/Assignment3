package com.ood.Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * collection for all same type parse(ENCAPSULATION)
 */
public class ParseCollection {
    private List<IConfigParser> parsers;

    private int totalDataCount=0;

    private boolean isHeroParser;

    public ParseCollection(boolean isHeroParser) {
        parsers=new ArrayList<>();
        this.isHeroParser=isHeroParser;
    }
    public void AddParser(String parserPath, Enum anEnum){
        IConfigParser p=new AttributeParser(parserPath,totalDataCount,isHeroParser,anEnum);
        parsers=new ArrayList<>();
        parsers.add(p);
        totalDataCount+=p.getLineOfData();
    }

    public void AddParsers(List<String> parserPaths,List<Enum> characterEnum)
    {

        for (int i=0;i<parserPaths.size();i++)
        {
            AddParser(parserPaths.get(i),characterEnum.get(i));
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
