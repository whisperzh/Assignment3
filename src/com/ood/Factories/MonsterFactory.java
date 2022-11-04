package com.ood.Factories;


import com.ood.Characters.Dragon;
import com.ood.Characters.ExoSkeleton;
import com.ood.Characters.GeneralMonster;
import com.ood.Characters.Spirit;
import com.ood.Enums.MonsterEnum;

import java.util.Random;

/**
 * Factory which produce monsters
 */
public class MonsterFactory {
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

}
