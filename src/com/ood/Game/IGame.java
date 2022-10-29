package com.ood.Game;

import com.ood.Board.IBoard;
import com.ood.Views.View;

/**
 * game interface
 */
public interface IGame <T1 extends IBoard,T2 extends View>{
    void initConfiguration();
    void initPlayer();
    void initTeam();
    void setView(T2 view);
    void setBoard(T1 board);
    T1 getBoard();
    T2 getView();
    void start();
}
