package com.ood.Game;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.AttributesItems.LMH_DataCenter;
import com.ood.Enums.GameEnum;
import com.ood.Enums.HeroEnum;
import com.ood.Enums.MonsterEnum;
import com.ood.Factories.GameBoardFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Judge.LMH_Judge;
import com.ood.Players.LMH_Player;
import com.ood.Team.LMH_Team;
import com.ood.Util.ParseCollection;

import java.util.Arrays;

/**
 * concrete class of LMH game
 */
public class LMH_Game extends BoardGame<LMH_Player>{

    private final GameEnum type=GameEnum.LMH;

    private int sizeOfATeam =3;
    //by default is 3
    private ParseCollection heroParseCollection;

    private ParseCollection monsterParseCollection;

    public LMH_Game() {
        super();
        judge=new LMH_Judge(this);
        setView(ViewFactory.createGameView(type));
        setBoard(GameBoardFactory.createGameBoard(type));
        //get how many players
        sizeOfATeam=getView().collectPlayersCount(LMH_Constant.PLAYER_COUNT_LOWER_BOUND, LMH_Constant.PLAYER_COUNT_UPPER_BOUND);
        team=new LMH_Team("PLAYER_TEAM", sizeOfATeam,false,this);
        initConfiguration();
        getView().displayParserInfo(heroParseCollection,true);
        int characterPerPlayer=getView().collectCharactersCount();
        team.getPlayerCollection().setCharacterPerPlayer(characterPerPlayer);
        team.getPlayerCollection().playerChooseHero();
        getBoard().show();

    }

    @Override
    public void initConfiguration() {
        heroParseCollection =new ParseCollection(true);
        String[] hparsePaths=new String[]{LMH_Constant.PALADINS_Path,LMH_Constant.SORCERERS_Path,LMH_Constant.WARRIORS_Path};
        HeroEnum[] heroEnums=new HeroEnum[]{HeroEnum.PALADIN,HeroEnum.SORCERER,HeroEnum.WARRIOR};
        heroParseCollection.AddParsers(Arrays.asList(hparsePaths),Arrays.asList(heroEnums));

        monsterParseCollection=new ParseCollection(false);
        String[] mparsePaths=new String[]{LMH_Constant.SPIRITS_Path,LMH_Constant.EXOSKELETONS_Path,LMH_Constant.DRAGONS_Path};
        MonsterEnum[] monsterEnums=new MonsterEnum[]{MonsterEnum.SPIRIT,MonsterEnum.EXOSKELETON,MonsterEnum.DRAGON};

        monsterParseCollection.AddParsers(Arrays.asList(mparsePaths),Arrays.asList(monsterEnums));
    }

    @Override
    public void start() {
        while (!judge.judgeGameOver())
        {
            team.move();
            if(judge.judgeGameOver())
                break;

        }
        getView().displayGameOver();
        getJudge().reset();
        LMH_DataCenter.reset();
        getView().displayPlayerScoreTable();
    }


    public GameEnum getType() {
        return type;
    }
}
