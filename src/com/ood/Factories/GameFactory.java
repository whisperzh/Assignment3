package com.ood.Factories;

import com.ood.Enums.GameEnum;
import com.ood.Game.IGame;
import com.ood.Game.LMH_Game;
import com.ood.Views.LMH_GameView;

/**
 * produce games
 */
public class GameFactory {
    public static IGame getGame(GameEnum game) {
        switch (game)
        {
            case LMH:
                return new LMH_Game();
            default:
                break;
        }
        return null;
    }
}
