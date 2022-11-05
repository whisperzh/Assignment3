package com.ood.Item;

import java.util.Map;

/**
 * General Weapons
 */
public class Weapon extends UnwearableItem {

    private float damageVal;

    private int requiredHands;

    public Weapon(Map<String, String> attributes) {
        super();
        this.level=Integer.valueOf(attributes.get("level"));
        this.price=Float.valueOf(attributes.get("cost"));
        this.name=attributes.get("Name");
        this.damageVal=Float.valueOf(attributes.get("damage"));
        this.requiredHands=Integer.valueOf(attributes.get("required hands"));
    }

    public float getDamageVal() {
        return damageVal;
    }

    public void setDamageVal(int damageVal) {
        this.damageVal = damageVal;
    }

}
