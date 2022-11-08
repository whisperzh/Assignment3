package com.ood.Item;

import com.ood.Buff.Debuff;
import com.ood.Enums.CharacterAttributeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FireSpell extends Spell{
    public FireSpell(Map<String, String> attributes) {
        super(attributes);
        List<CharacterAttributeEnum> attributeEnums=new ArrayList();
        attributeEnums.add(CharacterAttributeEnum.DEFENSE);
        buff=new Debuff(attributeEnums);
    }
}
