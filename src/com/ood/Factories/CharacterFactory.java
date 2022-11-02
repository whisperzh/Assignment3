package com.ood.Factories;

import com.ood.Characters.*;
import com.ood.Enums.HeroEnum;
import com.ood.Enums.MonsterEnum;

public class CharacterFactory {
    public static GeneralMonster createMonster(MonsterEnum monsteType){
        GeneralMonster monster=null;
        switch (monsteType)
        {
            case DRAGON:
                monster=new Dragon();
                break;
            case SPIRIT:
                monster=new Spirit();
                break;
            case EXOSKELETON:
                monster=new ExoSkeleton();
                break;
        }
        return monster;
    }

    public static GeneralHero createHero(HeroEnum heroType) throws Exception {
        GeneralHero hero=null;
        switch (heroType)
        {
            case WARRIOR:
                hero=new Warriors();
                break;
            case SORCERER:
                hero=new Sorcerers();
                break;
            case PALADIN:
                hero=new Paladins();
                break;
            default: throw new Exception();
        }
        return hero;
    }


}
