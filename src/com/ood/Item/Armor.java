package com.ood.Item;

import com.ood.Players.IPlayer;

/**
 * Armors
 */
public class Armor extends UnwearableItem{

    private int damageReductionVal;

    public Armor(int price, int level, String name) {
        super(price, level, name);
    }

    public int getDamageReductionVal() {
        return damageReductionVal;
    }

    public void setDamageReductionVal(int damageReductionVal) {
        this.damageReductionVal = damageReductionVal;
    }
}
