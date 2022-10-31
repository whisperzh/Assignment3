package com.ood.Game;

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

    private final int lowerBound=1;

    private final int upperBound=3;

    public LMH_Game() {
        super();
        setView(ViewFactory.createGameView(type));
        setBoard(GameBoardFactory.createGameBoard(type));
        //set team size of this specific game here
        sizeOfATeam=getView().collectPlayersCount(lowerBound,upperBound);
        getTeamCollection().addTeam(new Team<LMH_Player>("Player Team", sizeOfATeam));
        //getTeamCollection().addTeam(new Team<ComputerPLayer>("Monster Team"));

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
