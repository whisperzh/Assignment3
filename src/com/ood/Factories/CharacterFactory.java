package com.ood.Factories;

import com.ood.Characters.*;
import com.ood.Enums.HeroEnum;
import com.ood.Enums.MonsterEnum;

import java.util.List;
import java.util.Random;

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

    public static GeneralMonster createMonster()
    {
        Random r=new Random();
        int type=r.nextInt(3);

        GeneralMonster monster=null;
        switch (type)
        {
            case 0:
                monster=new Dragon();
                break;
            case 1:
                monster=new Spirit();
                break;
            case 2:
                monster=new ExoSkeleton();
                break;
        }
        return monster;
    }

    public static GeneralHero createHero(HeroEnum heroType, List<String> attributes) throws Exception {
        GeneralHero hero=null;
        switch (heroType)
        {
            case WARRIOR:
                hero=new Warriors(attributes);
                break;
            case SORCERER:
                hero=new Sorcerers(attributes);
                break;
            case PALADIN:
                hero=new Paladins(attributes);
                break;
            default: throw new Exception();
        }
        return hero;
    }


}
