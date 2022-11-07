package com.ood.Characters;

import com.ood.AttributesItems.Vector2;
import com.ood.Enums.MonsterEnum;

import java.util.HashMap;
import java.util.List;
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
    private float agility;   //Dodge ability


    public GeneralMonster(List<String> attributes) {
        HP=100;
        //Name/level/damage/defense/dodge chance
        name=attributes.get(0);
        level= Integer.parseInt(attributes.get(1));
        strength= Float.parseFloat(attributes.get(2));
        defense= Float.parseFloat(attributes.get(3));
        agility=Float.valueOf(attributes.get(4));

    }

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

    public float getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

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
    public boolean isObstacle() {
        return false;
    }

    @Override
    public boolean isMarket() {
        return false;
    }



    @Override
    public Map<String, String> getAllAttribute() {
        Map<String,String > map=new HashMap<>();
        map.put("level",Integer.toString(level));
        map.put("hp",String.format("%.2f",getHP()));
        map.put("damage",String.format("%.2f",strength));
        map.put("defense",String.format("%.2f",strength));
        map.put("dodge",String.format("%.2f",strength));
        return map;
        //their level, their hp, their damage, their defense, and their dodge chance
    }

    @Override
    public boolean isAlive() {
        return HP>0;
    }

    @Override
    public float takeDamage(float damage) {
        float realDamage=Math.max(0,damage-defense);
        float originalHp=HP;
        HP=Math.max(0,HP-realDamage);
        if(HP==0)
            return originalHp;
        return realDamage;
    }

    @Override
    public float physicalAttack(ICharacter character) {
        float damval=getDamageVal();
        return character.takeDamage(damval);
    }

    /**
     * monster do nothing
     * @param input
     */
    @Override
    public void use(int input) {
        return;
    }
////////////////////////

    @Override
    public void addExperience(float exp){
        return;
    }

    @Override
    public void recover() {
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

    /**
     * monster cannot move
     * @param row
     * @param col
     */
    @Override
    public void move(int row, int col) {
        return;
    }

    /**
     * monster cannot get HP back
     */
    @Override
    public void refillHP() {
        return;
    }


    @Override
    public String getIcon() {
        return icon;
    }

    @Override
    public void setIcon(String icon) {
        this.icon=icon;
    }
    ///////////////////////


}
