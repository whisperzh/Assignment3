package com.ood.Players;

import com.ood.AttributesItems.Dice;
import com.ood.AttributesItems.LMH_DataCenter;
import com.ood.AttributesItems.Vector2;
import com.ood.Characters.ICharacter;
import com.ood.Enums.GameEnum;
import com.ood.Enums.HeroEnum;
import com.ood.Enums.MonsterEnum;
import com.ood.Factories.CharacterFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Game.LMH_Game;
import com.ood.Judge.IGameJudge;
import com.ood.Judge.LMH_Judge;

/**
 * Concrete class of Board Game PLayer
 */
public class LMH_Player extends BoardGamePlayer{

    private ICharacter myHero;


    public LMH_Player() {
        super();
        dice=new Dice(2);//initialize Dice
        gameType= GameEnum.LMH;
        view= ViewFactory.createGameView(gameType);
        chooseHero();
    }

    public LMH_Player(boolean isPCPlayer) {
        super(isPCPlayer);
        dice=new Dice(2);//initialize Dice
        gameType= GameEnum.LMH;
        view= ViewFactory.createGameView(gameType);
        if(isPCPlayer)
            chooseMonster();
        else
            chooseHero();
    }

    private void chooseMonster() {
//        int monNum=view.displayPlayerChooseCharacter();
//        MonsterEnum m=null;
//        try {
            myHero = CharacterFactory.createMonster();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
    }

    @Override
    public void reset() {

    }

    private void chooseHero(){
        int heroNum=view.displayPlayerChooseCharacter(LMH_DataCenter.getHeroData().size()-1);
        HeroEnum h = LMH_DataCenter.getHeroType(heroNum);
        try {
            myHero = CharacterFactory.createHero(h,LMH_DataCenter.getHeroData().get(heroNum));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void chooseActionAndMove(){
        char action=getView().collectPlayersAction();
        switch (action)
        {

            case 'a'|'A':
                if(LMH_Game.getJudgeInstance().boardMoveJudge(myHero.getCurrentPosition(),new Vector2(-1,0)))
                    myHero.move(-1,0);
                break;
            case 'w'|'W':
                if(LMH_Game.getJudgeInstance().boardMoveJudge(myHero.getCurrentPosition(),new Vector2(0,-1)))
                    myHero.move(0,-1);
                break;
            case 's'|'S':
                if(LMH_Game.getJudgeInstance().boardMoveJudge(myHero.getCurrentPosition(),new Vector2(0,1)))
                    myHero.move(0,1);
                break;
            case 'd'|'D':
                if(LMH_Game.getJudgeInstance().boardMoveJudge(myHero.getCurrentPosition(),new Vector2(1,0)))
                    myHero.move(1,0);
                break;
            case 'q'|'Q':
                getView().displayGameOver();
                getView().displayGoodByeMessage();
                System.exit(0);
                break;
            case 'i'|'I':
                getInfo();
                chooseActionAndMove();
                break;
            case 'm'|'M':
                if(LMH_Game.getJudgeInstance().canEnterMarket(myHero.getCurrentPosition()))
                    getView().showMarketView();
                break;
            default:
                return;
        }
    }

    public void getInfo(){
        getView().displayCharacterInfo(myHero);
    }


}
