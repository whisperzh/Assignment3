package com.ood.Item;

import java.util.Map;

/**
 * item cannot be used out
 */
public abstract class UnwearableItem implements IItem{
    private float price;

    private int level;

    private String name;

    public UnwearableItem(String name, int price, int level ) {
        this.price = price;
        this.level = level;
        this.name = name;
    }

    public UnwearableItem(Map<String,String> attributes)
    {
        this.level=Integer.valueOf(attributes.get("required level"));
        this.price=Float.valueOf(attributes.get("cost"));
        this.name=attributes.get("Name");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public float getOriginalPrice() {
        return price;
    }

    @Override
    public void setOriginalPrice(int price) {
        this.price=price;
    }

    @Override
    public float getSellPrice() {
        return getOriginalPrice()/2;
    }
}
