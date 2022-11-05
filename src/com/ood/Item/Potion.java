package com.ood.Item;

import com.ood.Enums.CharacterAttributeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Potions
 */
public class Potion extends SingleUsedItem{
    private float attrIncreaseVal;
    private List<CharacterAttributeEnum> attrAffected;

    public Potion(Map<String, String> attributes) {
        super(attributes);
        //attribute increase/attribute affected
        this.attrIncreaseVal = Float.parseFloat(attributes.get("attribute increase"));
        this.attrAffected = new ArrayList<>();

        for(var s: attributes.get("attribute affected").split("/"))
        {
            attrAffected.add(CharacterAttributeEnum.stringToEnum(s));
        }
    }

    public float getAttrIncreaseVal() {
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
