package com.ood.Factories;


import com.ood.Characters.Dragon;
import com.ood.Characters.ExoSkeleton;
import com.ood.Characters.GeneralMonster;
import com.ood.Characters.Spirit;
import com.ood.Enums.MonsterEnum;

public class MonsterFactory {
    public static GeneralMonster spawnPlayer(MonsterEnum monsterType, String monsterName){
        GeneralMonster monster;
        switch (monsterType)
        {
            case DRAGON:
                monster=new Dragon();
                monster.setName(monsterName);
                break;
            case EXOSKELETON:
                monster=new ExoSkeleton();
                monster.setName(monsterName);
                break;
            case SPIRIT:
                monster=new Spirit();
                monster.setName(monsterName);
                break;
            default:
                monster=null;
        }
        return monster;
    }
}
