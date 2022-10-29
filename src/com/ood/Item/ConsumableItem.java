package com.ood.Item;

/**
 * Consumable Items
 */
public abstract class ConsumableItem implements IItem{
    private int price;

    private int timeOfUse;

    private int level;

    private String name;

    public ConsumableItem( String name,int price, int level, int timeOfUse) {
        this.price = price;
        this.timeOfUse = timeOfUse;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTimeOfUse() {
        return timeOfUse;
    }

    public void setTimeOfUse(int timeOfUse) {
        this.timeOfUse = timeOfUse;
    }

}
