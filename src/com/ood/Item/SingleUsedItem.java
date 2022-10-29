package com.ood.Item;

/**
 * Item that can only use once
 */
public abstract class SingleUsedItem extends ConsumableItem {

    public SingleUsedItem(String name, int price, int level, int timeOfUse) {
        super(name, price, level, timeOfUse);
        setTimeOfUse(1);
    }
}
