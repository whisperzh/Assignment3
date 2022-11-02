package com.ood.Characters;

import com.ood.AttributesItems.IGridContent;
import com.ood.AttributesItems.Vector2;

public interface ICharacter extends IGridContent {
    String getName();
    void setName(String name);
    int getLevel();
    void setLevel(int level);
    void levelUp();
    float getHP();
    void setHP(float HP);
    float getDamageVal();
    void refillHP();
    float getDefense();
    void setDefense(float defense);
    float getStrength();
    void setStrength(int strength);
    void leave(Vector2 position);
    void leave(int x,int y);
    String getIcon();
    void setIcon(String icon);

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
