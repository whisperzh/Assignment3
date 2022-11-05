package com.ood.Judge;

import com.ood.AttributesItems.Vector2;
import com.ood.Board.IBoard;
import com.ood.Characters.GeneralHero;
import com.ood.Item.IItem;

import java.util.List;

/**
 * Game judge interface
 */
public interface IGameJudge {
    boolean judgeGameOver();
    boolean canEnterMarket(Vector2 currentPosition);
    boolean boardCanPassAt(IBoard board, int row, int col);
    boolean isEncounterMonster(List<Integer> rollDice);
    boolean transancationValid(GeneralHero customer, IItem item);
}
