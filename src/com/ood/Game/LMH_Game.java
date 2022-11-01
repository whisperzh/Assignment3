package com.ood.Game;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.Board.LMH_board;
import com.ood.Enums.GameEnum;
import com.ood.Factories.GameBoardFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Team.LMH_Team;
import com.ood.Util.AttributeParser;
import com.ood.Util.IConfigParser;

import java.util.ArrayList;
import java.util.List;

/**
 * concrete class of LMH game
 */
public class LMH_Game extends BoardGame{

    private final GameEnum type=GameEnum.LMH;

    private int sizeOfATeam =3;
    //by default is 3
    private List<IConfigParser> iConfigParsers;

    public LMH_Game() {
        super();
        setView(ViewFactory.createGameView(type));
        setBoard(GameBoardFactory.createGameBoard(type));
        //get how many players
        sizeOfATeam=getView().collectPlayersCount(LMH_Constant.PLAYER_COUNT_LOWER_BOUND, LMH_Constant.PLAYER_COUNT_UPPER_BOUND);
        ((LMH_board)getBoard()).setMonsterCount(sizeOfATeam);

        initConfiguration();

        getView().displayParserInfo(iConfigParsers);

        getTeamCollection().addTeam(new LMH_Team("PLAYER_TEAM", sizeOfATeam,false));
        getTeamCollection().addTeam(new LMH_Team("MONSTER_TEAM",sizeOfATeam,true));//Computer Player

        getBoard().show();

    }

    @Override
    public void initConfiguration() {
        iConfigParsers =new ArrayList<>();
        iConfigParsers.add(new AttributeParser(LMH_Constant.WARRIORS_Path));
        iConfigParsers.add(new AttributeParser(LMH_Constant.PALADINS_Path));
        iConfigParsers.add(new AttributeParser(LMH_Constant.SORCERERS_Path));

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
            getTeamCollection().getTeamAt(0).move();
            getTeamCollection().getTeamAt(1).move();

            break;
        }
        getView().displayPlayerScoreTable();
    }


    public GameEnum getType() {
        return type;
    }
}
