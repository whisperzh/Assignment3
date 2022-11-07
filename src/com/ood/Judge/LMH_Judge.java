package com.ood.Judge;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.AttributesItems.Vector2;
import com.ood.Board.IBoard;
import com.ood.Characters.GeneralHero;
import com.ood.Characters.GeneralMonster;
import com.ood.Enums.LMHGridEnum;
import com.ood.Game.IGame;
import com.ood.Item.IItem;
import com.ood.Team.TeamCollection;

import java.util.List;

/**
 * do the judgment in LMH game
 */
public class LMH_Judge extends BoardGameJudge{

    private static boolean isGameOver=false;

    public LMH_Judge() {
    }

    public LMH_Judge(IGame game) {
        super(game);
    }

    @Override
    public boolean judgeGameOver() {
        return isGameOver;
    }

    @Override
    public boolean canEnterMarket(Vector2 currentPosition) {
        return game.getBoard().getGrid(currentPosition).getType().equals(LMHGridEnum.MARKET);
    }

    @Override
    public boolean isEncounterMonster(List<Integer> rollDice) {
        int sum=0;
        for(int i=0;i< rollDice.size();i++)
            sum+=rollDice.get(i);
        if(sum> LMH_Constant.BATTLE_CONSTRAINT)
            return false;
        else
            return true;
    }

    @Override
    public boolean transancationValid(GeneralHero customer, IItem item) {
        if(customer.getMyWallet().getAmount()>=item.getOriginalPrice())
            return true;
        return false;
    }

    public boolean battleOver(List<GeneralHero> heroes,List<GeneralMonster> monsters)
    {
        int herosAlive=0;
        for(int i=0;i<heroes.size();i++)
        {
            if(heroes.get(i).isAlive())
                herosAlive++;
        }
        if(herosAlive==0) {
            isGameOver=true;
            return true;
        }

        int monsterAlive=0;
        for(int i=0;i<monsters.size();i++)
        {
            if(monsters.get(i).isAlive())
                monsterAlive++;
        }
        if(monsterAlive==0)
            return true;
        return false;


    }

    public boolean allTeamAlive(TeamCollection teamCollection) {
        for(int i=0;i<teamCollection.size();i++)
        {
            if(!teamCollection.getTeamAt(i).getIsActive())
                return false;
        }

        return true;
    }
}
