package com.ood.Item;

import com.ood.Buff.Debuff;
import com.ood.Enums.CharacterAttributeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IceSpell extends Spell{
    public IceSpell(Map<String, String> attributes) {
        super(attributes);
        List<CharacterAttributeEnum> attri=new ArrayList();
        attri.add(CharacterAttributeEnum.DAMAGE);
        buff=new Debuff(attri);
    }
}
