package com.ood.Characters;

/**
 * an abstract monster class
 */
public abstract class GeneralMonster implements ICharacter{
    private String name;
    private int level;
    private float HP;
    private int strength;   //damage value
    private int defense;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public float getHP() {
        return HP;
    }

    @Override
    public void setHP(float HP) {
        this.HP = HP;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    private int agility;   //Dodge ability

    /**
     * xxxxxxxxxxxxxxxxxxxxxxxxxxxxx
     * cannot levelUp
     */
    @Override
    public void levelUp() {
        return;
    }

    @Override
    public int getDamageVal() {
        return strength;
    }

    @Override
    public void setDamageVal(int damageVal) {
        strength=damageVal;
    }

    /**
     * monster cannot get HP back
     */
    @Override
    public void refillHP() {
        return;
    }
}
