package com.ood.Item;

public abstract class SingleUsedItem extends ConsumableItem {

    public SingleUsedItem(int price, int timeOfUse, int level, String name) {
        super(price, timeOfUse, level, name);
    }
}
