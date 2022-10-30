package com.ood.Market;

import com.ood.Item.IItem;

public interface IMarket<T> {
    void removeItem(T item);

    void trade(T item);
}
