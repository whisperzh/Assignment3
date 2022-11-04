package com.ood.Item;

import com.ood.Players.IPlayer;

import java.util.Map;

/**
 * Armors
 */
public class Armor extends UnwearableItem{

    private float damageReductionVal;

    public Armor(String name, int price, int level, int damageReductionVal) {
        super(name, price, level);
        this.damageReductionVal = damageReductionVal;
    }

    public Armor(Map<String,String> attributes)
    {
        super(attributes);
        this.damageReductionVal=Float.valueOf(attributes.get("damage reduction"));
    }

    public float getDamageReductionVal() {
        return damageReductionVal;
    }

    public void setDamageReductionVal(int damageReductionVal) {
        this.damageReductionVal = damageReductionVal;
    }

}
