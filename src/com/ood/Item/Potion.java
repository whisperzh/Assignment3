package com.ood.Item;

import com.ood.Enums.CharacterAttributeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Potions
 */
public class Potion extends SingleUsedItem{
    private int attrIncreaseVal;
    private List<CharacterAttributeEnum> attrAffected;

    public Potion(String name, int price, int level, int timeOfUse, int attrIncreaseVal) {
        super(name, price, level, timeOfUse);
        this.attrIncreaseVal = attrIncreaseVal;
        attrAffected=new ArrayList<>();
    }

    public int getAttrIncreaseVal() {
        return attrIncreaseVal;
    }

    public void addAttrAffected(CharacterAttributeEnum a)
    {
        attrAffected.add(a);
    }

    public List<CharacterAttributeEnum> getAttrAffected(){
        return attrAffected;
    }

    public void setAttrIncreaseVal(int attrIncreaseVal) {
        this.attrIncreaseVal = attrIncreaseVal;
    }

}
