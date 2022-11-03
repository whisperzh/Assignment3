package com.ood.Game;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.Board.LMH_board;
import com.ood.Enums.GameEnum;
import com.ood.Factories.GameBoardFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Judge.IGameJudge;
import com.ood.Judge.LMH_Judge;
import com.ood.Team.LMH_Team;
import com.ood.Util.ParseCollection;

import java.util.Arrays;

/**
 * concrete class of LMH game
 */
public class LMH_Game extends BoardGame{

    private final GameEnum type=GameEnum.LMH;

    private int sizeOfATeam =3;
    //by default is 3
    private ParseCollection parseCollection;

    private static IGameJudge  judge;

    public LMH_Game() {
        super();
        setView(ViewFactory.createGameView(type));
        setBoard(GameBoardFactory.createGameBoard(type));
        //get how many players
        sizeOfATeam=getView().collectPlayersCount(LMH_Constant.PLAYER_COUNT_LOWER_BOUND, LMH_Constant.PLAYER_COUNT_UPPER_BOUND);
        ((LMH_board)getBoard()).setMonsterCount(sizeOfATeam);

        initConfiguration();

        getView().displayParserInfo(parseCollection,true);

        getTeamCollection().addTeam(new LMH_Team("PLAYER_TEAM", sizeOfATeam,false));
        getTeamCollection().addTeam(new LMH_Team("MONSTER_TEAM",sizeOfATeam,true));//Computer Player

        getBoard().show();

    }

    public static IGameJudge getJudgeInstance() {
        if(judge==null)
            judge=new LMH_Judge();
        return judge;
    }

    @Override
    public void initConfiguration() {
        parseCollection=new ParseCollection();
        String[] parsePaths=new String[]{LMH_Constant.PALADINS_Path,LMH_Constant.SORCERERS_Path,LMH_Constant.WARRIORS_Path};
        parseCollection.AddParsers(Arrays.asList(parsePaths));
//        iConfigParsers.add(new AttributeParser(LMH_Constant.WARRIORS_Path));
//        iConfigParsers.add(new AttributeParser(LMH_Constant.PALADINS_Path));
//        iConfigParsers.add(new AttributeParser(LMH_Constant.SORCERERS_Path));
//        int startIndex=0;
//        for(var par: iConfigParsers)
//        {
//            startIndex=par.setIndexForData(startIndex);
//        }
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
