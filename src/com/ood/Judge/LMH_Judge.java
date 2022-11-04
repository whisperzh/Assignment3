package com.ood.Judge;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.AttributesItems.Vector2;
import com.ood.Board.IBoard;
import com.ood.Enums.LMHGridEnum;
import com.ood.Game.IGame;

import java.util.List;

/**
 * do the judgment in LMH game
 */
public class LMH_Judge extends BoardGameJudge{
    public LMH_Judge(IGame game) {
        super(game);
    }

    @Override
    public boolean judgeGameOver() {
        return false;
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
            return false;
    }



}
