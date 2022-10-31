package com.ood.Game;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.Board.LMH_board;
import com.ood.Enums.GameEnum;
import com.ood.Factories.GameBoardFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Players.LMH_Player;
import com.ood.Team.Team;

/**
 * concrete class of LMH game
 */
public class LMH_Game extends BoardGame{

    private final GameEnum type=GameEnum.LMH;

    private int sizeOfATeam =3;
    //by default is 3


    public LMH_Game() {
        super();
        setView(ViewFactory.createGameView(type));
        setBoard(GameBoardFactory.createGameBoard(type));
        //get how many players
        sizeOfATeam=getView().collectPlayersCount(LMH_Constant.PLAYER_COUNT_LOWER_BOUND, LMH_Constant.PLAYER_COUNT_UPPER_BOUND);
        ((LMH_board)getBoard()).setMonsterCount(sizeOfATeam);
        getTeamCollection().addTeam(new Team<LMH_Player>("Player Team", sizeOfATeam));
        getTeamCollection().addTeam(new Team<LMH_Player>("Monster Team",sizeOfATeam));
        getBoard().show();

    }

    @Override
    public void initConfiguration() {

    }


    /**
     * do Nothing for LMH_Game
     */
    @Override
    public void initPlayers() {
        //no players Here
    }

    @Override
    public void start() {
        while (true)
        {

            break;
        }
        getView().displayPlayerScoreTable();
    }

    public GameEnum getType() {
        return type;
    }
}
