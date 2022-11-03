package com.ood.Judge;

import com.ood.AttributesItems.Vector2;

/**
 * abstract class of game Judgement
 */
public abstract class BoardGameJudge implements IGameJudge{
    @Override
    public boolean boardMoveJudge(Vector2 currentPosition, Vector2 targetPostion) {
        return false;
    }
}
