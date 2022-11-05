package com.ood.Item;

import java.util.Map;

/**
 * spell concrete class
 */
public class Spell extends ConsumableItem {

    private float damage;

    private float manaCost;

    public Spell(Map<String, String> attributes) {
        super(attributes);
        damage= Float.parseFloat(attributes.get("damage"));
        manaCost= Float.parseFloat(attributes.get("mana cost"));
    }


}
