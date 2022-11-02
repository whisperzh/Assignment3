package com.ood.Market;

import com.ood.Inventory.IInventory;
import com.ood.Inventory.MarketInventory;
import com.ood.Item.IItem;

public class LMH_Market implements IMarket<IItem> {

    private IInventory<IItem> marketInventory;

    public LMH_Market() {
        marketInventory=new MarketInventory();
    }

    @Override
    public void removeItem(IItem item) {
        marketInventory.remove(item);
    }

    @Override
    public void setInventory(IInventory<IItem> inventory) {
        this.marketInventory=inventory;
    }

    @Override
    public IInventory getInventory() {
        return marketInventory;
    }

    @Override
    public void trade(IItem item) {
    }

}
