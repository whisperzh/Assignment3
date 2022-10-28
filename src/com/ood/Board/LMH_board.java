package com.ood.Board;

import com.ood.Grid.GridCollections;
import com.ood.Grid.GridSpace;
import com.ood.Grid.LMH_Grid;

/**
 * concrete board for Legends: Monsters and Heroes game
 */
public class LMH_board extends MovableBoard{
    private GridCollections<LMH_Grid> gridCollections;

    @Override
    public GridSpace getGrid(int x, int y) {
        return gridCollections.getGrid(x,y);
    }
}
