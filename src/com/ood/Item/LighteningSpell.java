package com.ood.Item;

import com.ood.Buff.Debuff;
import com.ood.Enums.CharacterAttributeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LighteningSpell extends Spell{
    public LighteningSpell(Map<String, String> attributes) {
        super(attributes);
        List<CharacterAttributeEnum> attri=new ArrayList();
        attri.add(CharacterAttributeEnum.AGILITY);
        buff=new Debuff(attri);
    }
}
