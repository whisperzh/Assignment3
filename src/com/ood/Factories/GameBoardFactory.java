package com.ood.Factories;

import com.ood.Board.IBoard;
import com.ood.Board.LMH_board;
import com.ood.Board.MovableBoard;
import com.ood.Enums.GameEnum;
import com.ood.Game.IGame;
import com.ood.Game.LMH_Game;
import com.ood.Views.LMH_GameView;

public class GameBoardFactory {
    public static MovableBoard createGameBoard(GameEnum gameEnum) {
        MovableBoard board=null;
        switch (gameEnum)
        {
            case LMH:
                board=new LMH_board();
            default:
                break;
        }
        return board;
    }

}
