package com.ood.Players;

import com.ood.AttributesItems.Dice;
import com.ood.AttributesItems.LMH_Constant;
import com.ood.AttributesItems.LMH_DataCenter;
import com.ood.AttributesItems.Vector2;
import com.ood.Battle.IBattle;
import com.ood.Battle.LMH_Battle;
import com.ood.Board.MovableBoard;
import com.ood.Characters.GeneralHero;
import com.ood.Characters.ICharacter;
import com.ood.Enums.GameEnum;
import com.ood.Enums.HeroEnum;
import com.ood.Factories.HeroFactory;
import com.ood.Factories.MonsterFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Game.IGame;
import com.ood.Market.IMarket;

/**
 * Concrete class of Board Game PLayer
 */
public class LMH_Player extends BoardGamePlayer{

    private ICharacter myCharacter;


    public LMH_Player() {
        super();
        dice=new Dice(2);//initialize Dice
        gameType= GameEnum.LMH;
        view= ViewFactory.createGameView(gameType);
        chooseYourHero();
        placeHero();
    }

    public LMH_Player(boolean isPCPlayer, IGame game) {
        super(isPCPlayer,game);
        dice=new Dice(2);//initialize Dice
        gameType= GameEnum.LMH;
        view= ViewFactory.createGameView(gameType);
        if(isPCPlayer)
            chooseMonster();
        else {
            chooseYourHero();
            placeHero();
        }
    }

    private void chooseMonster() {
            myCharacter = MonsterFactory.createMonster();
    }


    private void placeHero() {
        MovableBoard board=(MovableBoard) getGame().getBoard();
        for(int i=0;i<board.getRowNum();i++)
        {
            for(int j=0;j< board.getColNum();j++)
            {
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(),i,j ))
                {
                    board.getGrid(i,j).setCharacter(myCharacter);
                    myCharacter.move(i, j);
                    return;
                }
            }
        }
    }

    private void chooseYourHero(){
        int heroNum=view.displayPlayerChooseCharacter(LMH_DataCenter.getHeroData().size()-1);
        HeroEnum h = LMH_DataCenter.getHeroType(heroNum);
        try {
            myCharacter = HeroFactory.createHero(h,LMH_DataCenter.getHeroData().get(heroNum));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void chooseActionAndMove(){
        getView().displayYourLocation(myCharacter.getCurrentPosition());
        getView().displayPlayersTurn(getName());
        char action=getView().collectPlayersAction(LMH_Constant.VALID_ACTIONS_ONMAP,LMH_Constant.ACTION_HELP_ONMAP);
        Vector2 p=myCharacter.getCurrentPosition();
        switch (action)
        {
            case 'a'|'A':
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(),p.getRow(),p.getCol()-1)){
                    getGame().getBoard().movePiece(myCharacter,p.getRow(),p.getCol()-1);
                    getGame().getBoard().show();
                    if(getGame().getJudge().isEncounterMonster(rollDice()))
                    {
                        IBattle b=new LMH_Battle(getGame().getTeamCollection());
                        b.fight();
                    }
                }else
                {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
                break;
            case 'w'|'W':
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(), p.getRow()-1,p.getCol())) {
                    getGame().getBoard().movePiece(myCharacter,p.getRow()-1,p.getCol());
                    getGame().getBoard().show();
                    if(getGame().getJudge().isEncounterMonster(rollDice()))
                    {
                        IBattle b=new LMH_Battle(getGame().getTeamCollection());
                        b.fight();
                    }
                }else
                {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
                break;
            case 's'|'S':
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(),p.getRow()+1,p.getCol())) {
                    getGame().getBoard().movePiece(myCharacter,p.getRow()+1,p.getCol());
                    getGame().getBoard().show();
                    if(getGame().getJudge().isEncounterMonster(rollDice()))
                    {
                        IBattle b=new LMH_Battle(getGame().getTeamCollection());
                        b.fight();
                    }
                }else
                {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
                break;
            case 'd'|'D':
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(),p.getRow(),p.getCol()+1)){
                    getGame().getBoard().movePiece(myCharacter,p.getRow(),p.getCol()+1);
                    getGame().getBoard().show();
                    if(getGame().getJudge().isEncounterMonster(rollDice()))
                    {
                        IBattle b=new LMH_Battle(getGame().getTeamCollection());
                        b.fight();
                    }
                }else
                {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
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
                if(getGame().getJudge().canEnterMarket(p))
                {
                    IMarket m=getGame().getBoard().getGrid(p).getMarket();
                    m.enterMarket((GeneralHero) myCharacter);
                }
                else {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
                break;
            default:
                return;
        }
    }

    public void getInfo(){
        getView().displayCharacterInfo(myCharacter);
    }


    @Override
    public void reset() {

    }

}
