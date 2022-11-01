package com.ood.AttributesItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Constant variables for game LHM
 */
public class LMH_Constant {
    //Constraints
    public static final int MONSTER_COUNT_LOWER_BOUND=1;
    public static final int MONSTER_COUNT_UPPER_BOUND=3;
    public static final int PLAYER_COUNT_LOWER_BOUND=1;
    public static final int PLAYER_COUNT_UPPER_BOUND=3;
    public static final int GRID_WIDTH=4;
    public static final int BOARD_ROW=8;
    public static final int BOARD_COL=8;


    //Icons
    public static String DRAGON=" \uD83D\uDC09";
    public static String SKELETON=" \uD83D\uDC80";
    public static String SPIRIT=" \uD83D\uDC7B";
    public static String OBSTACLE=" ⛰";
    public static String MARKET=" \uD83D\uDED2";

    //Paths
    public static String ARMORY_Path= "Legends_Monsters_and_Heroes/Armory.txt";
    public static String DRAGONS_Path= "Legends_Monsters_and_Heroes/Dragons.txt";
    public static String EXOSKELETONS_Path= "Legends_Monsters_and_Heroes/Exoskeletons.txt";
    public static String FIRESPELL_Path= "Legends_Monsters_and_Heroes/FireSpells.txt";
    public static String ICESPELL_Path= "Legends_Monsters_and_Heroes/IceSpells.txt";
    public static String LIGHTNINGSPELL_Path= "Legends_Monsters_and_Heroes/LightningSpells.txt";
    public static String PALADINS_Path= "Legends_Monsters_and_Heroes/Paladins.txt";
    public static String POTIONS_Path= "Legends_Monsters_and_Heroes/Potions.txt";
    public static String SORCERERS_Path= "Legends_Monsters_and_Heroes/Sorcerers.txt";
    public static String SPIRITS_Path= "Legends_Monsters_and_Heroes/Spirits.txt";
    public static String WARRIORS_Path= "Legends_Monsters_and_Heroes/Warriors.txt";
    public static String WEAPONRY_Path= "Legends_Monsters_and_Heroes/Weaponry.txt";

    //Maps
    public static final List<Vector2> OBSTACLE_LIST=new ArrayList<>(Arrays.asList(
            new Vector2(0,1),new Vector2(0,2),new Vector2(1,6),new Vector2(2,5),new Vector2(5,4),
            new Vector2(0,2),new Vector2(1,2),new Vector2(2,6),new Vector2(4,5),new Vector2(5,5),
            new Vector2(5,1),new Vector2(5,2),new Vector2(4,4))
    );
    public static final List<Vector2> MARKET_LIST=new ArrayList<>(Arrays.asList(
            new Vector2(0,5),new Vector2(0,6),new Vector2(0,7),new Vector2(1,7),new Vector2(2,2),
            new Vector2(2,3),new Vector2(3,1),new Vector2(3,6),new Vector2(4,1),new Vector2(4,6),
            new Vector2(4,7),new Vector2(5,2),new Vector2(5,3),new Vector2(6,0),new Vector2(6,6),
            new Vector2(7,5),new Vector2(7,6))
    );
}
