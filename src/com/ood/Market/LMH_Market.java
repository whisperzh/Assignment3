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

    }

    @Override
    public void setInventory() {

    }

    @Override
    public IInventory getInventory() {
        return null;
    }

    @Override
    public void trade(IItem item) {

    }

}
