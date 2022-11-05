package com.ood.Characters;

import com.ood.AttributesItems.LMH_HeroSkill;
import com.ood.Enums.CharacterAttributeEnum;

import java.util.List;

import static com.ood.AttributesItems.LMH_Constant.HERO_FAVORED_SKILL_ORIGINAL_VAL;

/**
 * hero Paladins
 */
public class Paladins extends GeneralHero{
    public Paladins(List<String> attributes) {
        super(attributes);
        skills=new LMH_HeroSkill();
        skills.put(CharacterAttributeEnum.STRENGTH,HERO_FAVORED_SKILL_ORIGINAL_VAL);
        skills.put(CharacterAttributeEnum.DEXTERITY,HERO_FAVORED_SKILL_ORIGINAL_VAL);

    }

    @Override
    void attack() {

    }

    @Override
    void faint() {

    }
}
