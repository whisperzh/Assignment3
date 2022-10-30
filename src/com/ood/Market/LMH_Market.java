package com.ood.Market;

import com.ood.Inventory.IInventory;
import com.ood.Item.IItem;

public class LMH_Market implements IMarket<IItem> {

    private IInventory<IItem> marketInventory;

    public LMH_Market(IInventory<IItem> marketInventory) {
        this.marketInventory = marketInventory;
    }

    @Override
    public void removeItem(IItem item) {

    }

    @Override
    public void trade(IItem item) {

    }
}
