package com.ood.Factories;

import com.ood.Enums.ItemEnum;
import com.ood.Item.Armor;
import com.ood.Item.IItem;
import com.ood.Item.Potion;
import com.ood.Item.Weapon;

import java.util.Map;

/**
 * Factory that produce items
 */
public class ItemFactory {
    public static IItem createItem(ItemEnum type, Map<String,String> itemAttributes){
        IItem item=null;
        switch (type)
        {
            case ARMORY:
                item=new Armor(itemAttributes);
                break;
//            case POTIONS:
//                item=new Potion();
//                break;
//            case WEAPONRY:
//                item=new Weapon();
//                break;

        }
        return item;
    }
}
