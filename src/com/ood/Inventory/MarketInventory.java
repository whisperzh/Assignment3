package com.ood.Inventory;

import com.ood.Enums.ItemEnum;
import com.ood.Factories.ItemFactory;
import com.ood.Item.IItem;
import com.ood.Util.IConfigParser;
import com.ood.Util.ItemParser;
import com.ood.Util.ParseCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketInventory implements IInventory<IItem> {
    private List<IItem> items;


    public MarketInventory() {
        this.items=new ArrayList<>();
    }

    public MarketInventory(IConfigParser parser) {
        this.items=new ArrayList<>();
        decodeParser(parser);
    }

    @Override
    public IItem consume() {
        return null;
    }
    //market don't consume stuffs

    @Override
    public void remove(IItem item) {
        items.remove(item);
    }

    @Override
    public void add(IItem item) {

    }

    public void addParserCollection(ParseCollection pc){
        for(int i=0;i<pc.getParserSize();i++)
        {
            decodeParser(pc.getParserAt(i));
        }
    }

    public void decodeParser(IConfigParser parser){
        List<List<String>> info=((ItemParser)parser).getItems();
        List<String> keys=parser.getOrderedSchema();

        for(int i=0;i<info.size();i++)
        {
            Map<String ,String> attri=new HashMap<>();
            int j=0;
            for(;j<keys.size()-1;j++)
            {
                attri.put(keys.get(j),info.get(i).get(j));
            }
            ItemEnum type=ItemEnum.stringToEnum(info.get(i).get(j));
            items.add(ItemFactory.createItem(type,attri));
        }
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public IItem get(int index) {
        return items.get(index);
    }

}
