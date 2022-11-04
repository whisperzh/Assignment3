package com.ood.Enums;

public enum ItemEnum {
    ARMORY,
    WEAPONRY,
    POTIONS;
    public static ItemEnum stringToEnum(String str){
        if(str.contains("ARMORY"))
            return ARMORY;
        else if (str.contains("WEAPONRY"))
            return WEAPONRY;
        else if(str.contains("POTIONS"))
            return POTIONS;
        else
            return null;
    }
}
