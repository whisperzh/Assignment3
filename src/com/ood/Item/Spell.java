package com.ood.Item;

import com.ood.Buff.IBuff;
import com.ood.Characters.ICharacter;

import java.util.Map;

/**
 * spell concrete class
 */
public class Spell extends ConsumableItem {

    private float damage;

    private float manaCost;

    protected IBuff<ICharacter> buff;

    public Spell(Map<String, String> attributes) {
        super(attributes);
        damage= Float.parseFloat(attributes.get("damage"));
        manaCost= Float.parseFloat(attributes.get("mana cost"));
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getManaCost() {
        return manaCost;
    }

    public void setManaCost(float manaCost) {
        this.manaCost = manaCost;
    }

    public void doEffect(ICharacter character){
        setTimeOfUse(getTimeOfUse()-1);
        buff.doEffect(character);
    }

}
