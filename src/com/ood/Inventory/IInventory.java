package com.ood.Inventory;

import com.ood.Item.IItem;
import com.ood.Util.ParseCollection;

/**
 * inventory interface
 */
public interface IInventory<T extends IItem> {
    T consume();
    void remove(T t);
    void add(T t);
    void addParserCollection(ParseCollection pc);
    int getSize();
    T get(int index);
}
