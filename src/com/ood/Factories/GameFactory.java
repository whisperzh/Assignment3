package com.ood.Factories;

import com.ood.Board.LMH_board;
import com.ood.Enums.GameEnum;
import com.ood.Game.IGame;
import com.ood.Game.LMH_Game;
import com.ood.Views.LMH_GameView;

/**
 * Factory that produce Games
 */
public class GameFactory {
    public static IGame createGame(GameEnum gameEnum) {
        switch (gameEnum)
        {
            case LMH:
                return new LMH_Game();
            default:
                break;
        }
        return null;
    }
}
