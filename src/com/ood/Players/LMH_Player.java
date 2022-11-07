package com.ood.Players;

import com.ood.AttributesItems.Dice;
import com.ood.AttributesItems.LMH_Constant;
import com.ood.AttributesItems.LMH_DataCenter;
import com.ood.AttributesItems.Vector2;
import com.ood.Battle.IBattle;
import com.ood.Battle.LMH_Battle;
import com.ood.Board.MovableBoard;
import com.ood.Characters.CharacterCollection;
import com.ood.Characters.GeneralHero;
import com.ood.Characters.ICharacter;
import com.ood.Enums.GameEnum;
import com.ood.Enums.HeroEnum;
import com.ood.Enums.MonsterEnum;
import com.ood.Factories.HeroFactory;
import com.ood.Factories.MonsterFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Game.IGame;
import com.ood.Market.IMarket;
import com.ood.Team.LMH_CharacterCollection;
import com.ood.Team.SimpleCollection;

import java.util.List;
import java.util.Random;

/**
 * Concrete class of Board Game PLayer
 */
public class LMH_Player extends BoardGamePlayer{

    private SimpleCollection<ICharacter> characterCollection;

    private int characterCount;

    private Vector2 position;

    private String icon=LMH_Constant.HERO_ICON;

    public LMH_Player(boolean isPCPlayer,String name, IGame game) {
        super(isPCPlayer,name,game);
        dice=new Dice(2);//initialize Dice
        gameType= GameEnum.LMH;
        view= ViewFactory.createGameView(gameType);
        placeMyselfOnBoard();
        characterCollection=new LMH_CharacterCollection();
    }

    private void chooseRandomMonster() {
        Random random=new Random();
        for(int i=0;i<characterCount;i++)
        {
            int range=LMH_DataCenter.getMonsterData().size();
            int monsterNum=random.nextInt(range);
            MonsterEnum m = LMH_DataCenter.getMonsterType(monsterNum);
            characterCollection.addItem(MonsterFactory.createMonster(m,LMH_DataCenter.getMonsterData().get(monsterNum)));
        }

    }

    public int getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(int characterCount) {
        this.characterCount = characterCount;
    }

    public void chooseYourHero(){
        if(getIsPCPlayer()) {
            chooseRandomMonster();
            return;
        }
        int heroSize= characterCount;
        while (heroSize!=0)
        {
            heroSize--;
            int heroNum=view.displayPlayerChooseCharacter(LMH_DataCenter.getHeroData().size()-1, getName());
            HeroEnum h = LMH_DataCenter.getHeroType(heroNum);
            try {
                characterCollection.addItem(HeroFactory.createHero(h,LMH_DataCenter.getHeroData().get(heroNum)));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public ICharacter getMyCharacterAt(int index) {
        return characterCollection.getItemAt(index);
    }

    public void chooseActionAndMove(){
        getView().displayYourLocation(position);
        getView().displayPlayersTurn(getName());
        char action=getView().collectPlayersAction(LMH_Constant.VALID_ACTIONS_ONMAP,LMH_Constant.ACTION_HELP_ONMAP);
        switch (action)
        {
            case 'a'|'A':
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(),position.getRow(),position.getCol()-1)){
                    getGame().getBoard().movePiece(this,position.getRow(),position.getCol()-1);
                    getGame().getBoard().show();
                    if(getGame().getJudge().isEncounterMonster(rollDice()))
                    {
                        IBattle b=new LMH_Battle(getGame().getTeam());
                        b.fight();
                    }
                }else
                {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
                break;
            case 'w'|'W':
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(), position.getRow()-1,position.getCol())) {
                    getGame().getBoard().movePiece(this,position.getRow()-1,position.getCol());
                    getGame().getBoard().show();
                    if(getGame().getJudge().isEncounterMonster(rollDice()))
                    {
                        IBattle b=new LMH_Battle(getGame().getTeam());
                        b.fight();
                    }
                }else
                {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
                break;
            case 's'|'S':
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(),position.getRow()+1,position.getCol())) {
                    getGame().getBoard().movePiece(this,position.getRow()+1,position.getCol());
                    getGame().getBoard().show();
                    if(getGame().getJudge().isEncounterMonster(rollDice()))
                    {
                        IBattle b=new LMH_Battle(getGame().getTeam());
                        b.fight();
                    }
                }else
                {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
                break;
            case 'd'|'D':
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(),position.getRow(),position.getCol()+1)){
                    getGame().getBoard().movePiece(this,position.getRow(),position.getCol()+1);
                    getGame().getBoard().show();
                    if(getGame().getJudge().isEncounterMonster(rollDice()))
                    {
                        IBattle b=new LMH_Battle(getGame().getTeam());
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
                if(getGame().getJudge().canEnterMarket(position))
                {
                    IMarket m=getGame().getBoard().getGrid(position).getMarket();
                    for(int i=0;i<characterCollection.size();i++){
                        m.enterMarket((GeneralHero) characterCollection.getItemAt(i));
                    }
                }
                else {
                    getView().displayInvalidInputMessage();
                    chooseActionAndMove();
                }
                break;
            default:
                return;
        }
        if(getGame().getJudge().judgeGameOver())
            return;
    }

    public void getInfo(){
        getView().displayCharactersInfo(characterCollection);
    }

    @Override
    public boolean isActive() {
        for(int i=0;i<characterCollection.size();i++)
            if(characterCollection.getItemAt(i).isAlive())
                return true;
        return false;
    }

    @Override
    public void reset() {

    }

    private void placeMyselfOnBoard(){
        MovableBoard board=(MovableBoard) getGame().getBoard();
        for(int i=0;i<board.getRowNum();i++)
        {
            for(int j=0;j< board.getColNum();j++)
            {
                if(getGame().getJudge().boardCanPassAt(getGame().getBoard(),i,j ))
                {
                    board.getGrid(i,j).setPlayer(this);
                    position=new Vector2(i,j);
                    return;
                }
            }
        }
    }

    public List<ICharacter> getAllCharacters(){
        return characterCollection.getItemList();
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(int row,int col) {
        this.position = new Vector2(row,col);
    }
}
