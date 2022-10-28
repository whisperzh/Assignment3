package com.ood.Item;

public abstract class SingleUsedItem extends ConsumableItem {
    public SingleUsedItem(){
        super();
        setTimeOfUse(1);
    }
}
