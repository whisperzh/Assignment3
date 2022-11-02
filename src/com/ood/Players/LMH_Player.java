package com.ood.Players;

import com.ood.AttributesItems.Dice;
import com.ood.Characters.ICharacter;
import com.ood.Enums.GameEnum;
import com.ood.Enums.HeroEnum;
import com.ood.Enums.MonsterEnum;
import com.ood.Factories.CharacterFactory;
import com.ood.Factories.ViewFactory;

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
        int monNum=view.displayPlayerChooseCharacter();
        MonsterEnum m=null;
        try {
            myHero = CharacterFactory.createMonster(m);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void reset() {

    }

    private void chooseHero(){
        int heroNum=view.displayPlayerChooseCharacter();
        HeroEnum h=null;
        try {
            myHero = CharacterFactory.createHero(h);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private void chooseActionAndDo(){
        char action=getView().collectPlayersAction();
    }

}
