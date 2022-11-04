package com.ood.Characters;

import com.ood.FunctionInterfaces.IGridContent;
import com.ood.AttributesItems.Vector2;

import java.util.Map;

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
    String getIcon();
    void setIcon(String icon);
    void move(int row, int col);
    Vector2 getCurrentPosition();
    Map<String, String> getAllAttribute();

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
