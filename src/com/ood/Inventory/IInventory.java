package com.ood.Inventory;

import com.ood.Item.ConsumableItem;
import com.ood.Item.IItem;

/**
 * inventory interface
 */
public interface IInventory<T extends IItem> {
    T consume();
    void remove(T t);
    void Add(T t);
}
