package com.ood.Market;

public interface IMarket<T> {
    void removeItem(T item);
    void trade();
}
