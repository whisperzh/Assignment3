package com.ood.Item;

import java.util.Map;

/**
 * Item that can only use once
 */
public abstract class SingleUsedItem extends ConsumableItem {

    public SingleUsedItem(Map<String, String> attributes) {
        super(attributes);
        setTimeOfUse(1);
    }
}
