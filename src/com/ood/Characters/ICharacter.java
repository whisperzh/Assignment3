package com.ood.Characters;

public interface ICharacter {
    String getName();
    void setName(String name);
    int getLevel();
    void setLevel(int level);
    void levelUp();
    float getHP();
    void setHP(float HP);
    int getDamageVal();
    void setDamageVal(int damageVal);
    void refillHP();
//    • A name
//    • A level with an amount of experience points
//    • HP (hit points, the hero’s in battle)
//    • MP (mana or magic points, for casting spells)
//    • A strength value
//    • A dexterity value
//    • An agility value
//    • An amount of gold
//    • An inventory of items

//    • A name
//    • A level
//    • HP
//    • A base damage value
//    • A defense value
//    • A dodge ability
}
