package com.ood.Item;

public class UnwearableItem implements IItem{
    private int price;
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price=price;
    }
}
