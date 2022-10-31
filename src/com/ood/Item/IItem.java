package com.ood.Item;

/**
 * interface of Item
 */
public interface IItem {
    float getOriginalPrice();
    int getLevel();
    String getName();
    void setName(String name);
    void setOriginalPrice(int price);
    void setLevel(int level);
    float getSellPrice();
}
