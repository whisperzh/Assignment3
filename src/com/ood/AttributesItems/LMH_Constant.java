package com.ood.AttributesItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LMH_Constant {
    public static final int MONSTER_COUNT_LOWER_BOUND=1;
    public static final int MONSTER_COUNT_UPPER_BOUND=3;
    public static final int PLAYER_COUNT_LOWER_BOUND=1;
    public static final int PLAYER_COUNT_UPPER_BOUND=3;
    public static final int BOARD_ROW=8;
    public static final int BOARD_COL=8;
    public static String DRAGON="\uD83D\uDC09";
    public static String SKELETON="\uD83D\uDC80";
    public static String SPIRIT="\uD83D\uDC7B";
    public static String OBSTACLE="⛰";
    public static String MARKET="\uD83D\uDED2";
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
