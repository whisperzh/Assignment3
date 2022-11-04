package com.ood.Characters;

import com.ood.AttributesItems.Vector2;
import com.ood.Enums.MonsterEnum;

import java.util.Map;

/**
 * an abstract monster class
 */
public abstract class GeneralMonster implements ICharacter{
    private String name;
    private int level;
    private float HP;
    private float strength;   //damage value
    private float defense;
    private String icon;
    private MonsterEnum type;


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

    public float getDefense() {
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
    public float getDamageVal() {
        return strength;
    }

    @Override
    public float getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * monster cannot get HP back
     */
    @Override
    public void refillHP() {
        return;
    }

    public MonsterEnum getType() {
        return type;
    }

    public void setType(MonsterEnum type) {
        this.type = type;
    }

    @Override
    public void setDefense(float defense) {
        this.defense=defense;
    }

    @Override
    public void leave(Vector2 position) {
        //DO NOTHING
    }

    @Override
    public void leave(int x, int y) {
        //DO NOTHING
    }

    @Override
    public String getIcon() {
        return icon;
    }

    @Override
    public void setIcon(String icon) {
        this.icon=icon;
    }

    @Override
    public boolean isObstacle() {
        return false;
    }

    @Override
    public boolean isMarket() {
        return false;
    }

    /**
     * monster cannot move
     * @param col
     * @param row
     */
    @Override
    public void move(int col, int row) {
        return;
    }

    /**
     * monster don't need position!
     * @return
     */
    @Override
    public Vector2 getCurrentPosition() {
        return null;
    }

    @Override
    public Map<String, String> getAllAttribute() {
        return null;
    }
}
