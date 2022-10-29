package com.ood.Item;

/**
 * General Weapons
 */
public class Weapon extends UnwearableItem {

    private int damageVal;

    public Weapon(String name, int price, int level, int damageVal) {
        super(name, price, level);
        this.damageVal = damageVal;
    }

    public int getDamageVal() {
        return damageVal;
    }

    public void setDamageVal(int damageVal) {
        this.damageVal = damageVal;
    }

}
