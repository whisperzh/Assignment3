package com.ood.Market;

import com.ood.Inventory.IInventory;
import com.ood.Item.IItem;

public interface IMarket<T> {
    void removeItem(T item);
    void setInventory();
    IInventory getInventory();
    void trade(T item);

}
