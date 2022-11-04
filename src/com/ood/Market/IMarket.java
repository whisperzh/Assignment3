package com.ood.Market;

import com.ood.FunctionInterfaces.IGridContent;
import com.ood.Inventory.IInventory;
import com.ood.Item.IItem;

public interface IMarket<T> extends IGridContent {
    void removeItem(T item);
    void setInventory(IInventory<IItem> inventory);
    IInventory<IItem> getInventory();
    void trade(T item);

    @Override
    default boolean isObstacle() {
        return false;
    }

    @Override
    default boolean isMarket() {
        return true;
    }
}
