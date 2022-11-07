package com.ood.AttributesItems;

import com.ood.Enums.HeroEnum;
import com.ood.Enums.MonsterEnum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Data center, player can get data easily from here
 */
public class LMH_DataCenter {
    private static List<List<String>> heroData;
    private static List<List<String>> monsterData;

    public static List<List<String>> getHeroData() {
        return heroData;
    }

    public static void setHeroData(List<List<String>> heroData) {
        LMH_DataCenter.heroData = heroData;
    }

    public static void addHero(List<String> hero){
        heroData.add(hero);
    }

    public static void addAllHero(Collection<List<String>> heros)
    {
        if(heroData==null)
            heroData=new ArrayList<>();
        heroData.addAll(heros);
    }

    public static List<List<String>> getMonsterData() {
        return monsterData;
    }

    public static void setMonsterData(List<List<String>> monsterData) {
        LMH_DataCenter.monsterData = monsterData;
    }

    public static void addMonster(List<String> monster){
        heroData.add(monster);
    }

    public static void addAllMonster(Collection<List<String>> monster)
    {
        if(monsterData==null)
            monsterData=new ArrayList<>();
        monsterData.addAll(monster);
    }

    public static HeroEnum getHeroType(int heroNum) {
        var line=heroData.get(heroNum);
        return HeroEnum.stringToEnum(line.get(line.size()-1));
    }

    public static MonsterEnum getMonsterType(int monsterNum) {
        var line=monsterData.get(monsterNum);
        return MonsterEnum.stringToEnum(line.get(line.size()-1));
    }
}
