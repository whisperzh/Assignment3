package com.ood.Item;

/**
 * General Weapons
 */
public class Weapon extends UnwearableItem {


    private int damageVal;

    public Weapon(int price, int level, String name) {
        super(price, level, name);
    }

    public int getDamageVal() {
        return damageVal;
    }

    public void setDamageVal(int damageVal) {
        this.damageVal = damageVal;
    }

}
