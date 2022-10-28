package com.ood.Item;

/**
 * Consumable Items
 */
public abstract class ConsumableItem implements IItem{
    private int price;

    private int timeOfUse;

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
