package com.ood.Judge;

import com.ood.AttributesItems.Vector2;

/**
 * Game judge interface
 */
public interface IGameJudge {
    boolean judge();
    boolean boardMoveJudge(Vector2 currentPosition,Vector2 targetPostion);
    boolean canEnterMarket(Vector2 currentPosition);
}
