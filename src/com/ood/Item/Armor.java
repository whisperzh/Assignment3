package com.ood.Item;

import com.ood.Players.IPlayer;

/**
 * Armors
 */
public class Armor extends UnwearableItem{

    private int damageReductionVal;

    public Armor(String name, int price, int level, int damageReductionVal) {
        super(name, price, level);
        this.damageReductionVal = damageReductionVal;
    }

    public int getDamageReductionVal() {
        return damageReductionVal;
    }

    public void setDamageReductionVal(int damageReductionVal) {
        this.damageReductionVal = damageReductionVal;
    }

}
