package com.ood.AttributesItems;

import java.security.PublicKey;
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
    public static final int DICE_COUNT=2;
    public static final int BATTLE_CONSTRAINT=6;

    //Icons
    public static final String DRAGON=" \uD83D\uDC09";
    public static final String SKELETON=" \uD83D\uDC80";
    public static final String SPIRIT=" \uD83D\uDC7B";
    public static final String OBSTACLE=" ⛰";
    public static final String MARKET=" \uD83D\uDED2";
    public static final String HERO_ICON=" \uD83E\uDDD4";

    //Paths
    public static final String ARMORY_Path= "Legends_Monsters_and_Heroes/Armory.txt";
    public static final String DRAGONS_Path= "Legends_Monsters_and_Heroes/Dragons.txt";
    public static final String EXOSKELETONS_Path= "Legends_Monsters_and_Heroes/Exoskeletons.txt";
    public static final String FIRESPELL_Path= "Legends_Monsters_and_Heroes/FireSpells.txt";
    public static final String ICESPELL_Path= "Legends_Monsters_and_Heroes/IceSpells.txt";
    public static final String LIGHTNINGSPELL_Path= "Legends_Monsters_and_Heroes/LightningSpells.txt";
    public static final String PALADINS_Path= "Legends_Monsters_and_Heroes/Paladins.txt";
    public static final String POTIONS_Path= "Legends_Monsters_and_Heroes/Potions.txt";
    public static final String SORCERERS_Path= "Legends_Monsters_and_Heroes/Sorcerers.txt";
    public static final String SPIRITS_Path= "Legends_Monsters_and_Heroes/Spirits.txt";
    public static final String WARRIORS_Path= "Legends_Monsters_and_Heroes/Warriors.txt";
    public static final String WEAPONRY_Path= "Legends_Monsters_and_Heroes/Weaponry.txt";
    public static final String LMH_PATTERN_Path= "Legends_Monsters_and_Heroes/dragonAscii.txt";
    public static final float SHOP_DEFAULT_GOLD = 10000;
    public static char[] VALID_ACTIONS_ONMAP =new char[]{'w','a','s','d','W','A','S','D','Q','q','I','i','m','M'};
    public static char[] VALID_ACTIONS_INMARKET =new char[]{'B','S','V','E','Q','b','s','v','q','e'};
    public static final String ACTION_HELP_ONMAP ="W/w: move up\n" +
            "A/a: move left\n" +
            "S/s: move down\n" +
            "D/d: move right\n" +
            "Q/q: quit game\n" +
            "I/i: show information\n" +
            "M/m: enter market";
    public static final String ACTION_HELP_INMARKET =
            "B/B: enter buy mode\n" +
            "S/s: enter sell mode\n" +
            "V/v: enter view items detail mode\n" +
            "Q/q: quit game\n" +
            "E/e: exit market";

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
