package com.ood.Item;

/**
 * item cannot be used out
 */
public abstract class UnwearableItem implements IItem{
    private int price;

    private int level;

    private String name;

    public UnwearableItem(int price, int level, String name) {
        this.price = price;
        this.level = level;
        this.name = name;
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
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price=price;
    }
}
