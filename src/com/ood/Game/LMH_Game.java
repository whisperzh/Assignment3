package com.ood.Game;

import com.ood.Board.LMH_board;
import com.ood.Enums.GameEnum;
import com.ood.Factories.GameBoardFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Players.LMH_Player;
import com.ood.Views.AbsGameView;

/**
 * concrete class of LMH game
 */
public class LMH_Game extends BoardGame<LMH_Player>{

    private AbsGameView view;

    private final GameEnum type=GameEnum.LMH;

    public LMH_Game() {
        super();
        setView(ViewFactory.createGameView(type));
        setBoard(GameBoardFactory.createGameBoard(type));
    }

    @Override
    public void initConfiguration() {

    }

    @Override
    public void initPlayers() {
        //no players Here
    }

    @Override
    public void setView(AbsGameView view) {
        this.view=view;
    }


    @Override
    public AbsGameView getView() {
        return view;
    }


    @Override
    public void start() {

    }

    public GameEnum getType() {
        return type;
    }
}
