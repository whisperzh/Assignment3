package com.ood.Enums;

import java.util.Random;

public enum MonsterEnum {
    DRAGON,
    EXOSKELETON,
    SPIRIT;
    public static MonsterEnum getRandomMonsterType(){
        Random r=new Random();
        int mon=r.nextInt(3);
        switch (mon){
            case 0:
                return DRAGON;
            case 1:
                return EXOSKELETON;
            case 2:
                return SPIRIT;
            default:
                return DRAGON;
        }
    }
}
