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
        IGame game=null;
        switch (gameEnum)
        {
            case LMH:
                IGame<LMH_board,LMH_GameView> g = new LMH_Game();
                return g;
            default:
                break;
        }
        return game;
    }
}
