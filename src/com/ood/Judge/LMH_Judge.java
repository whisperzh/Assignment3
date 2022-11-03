package com.ood.Judge;

import com.ood.AttributesItems.Vector2;

/**
 * do the judgment in LMH game
 */
public class LMH_Judge extends BoardGameJudge{
    @Override
    public boolean judge() {
        return false;
    }

    @Override
    public boolean canEnterMarket(Vector2 currentPosition) {
        return false;
    }


}
