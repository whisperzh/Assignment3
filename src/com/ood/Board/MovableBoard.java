package com.ood.Board;

import com.ood.Grid.GridCollections;
import com.ood.Grid.GridSpace;
import com.ood.Grid.LMH_Grid;

/**
 * a board which enables pieces to move
 */
public abstract class MovableBoard implements IBoard{
    private GridCollections<LMH_Grid> gridCollections;

    @Override
    public GridSpace getGrid(int x, int y) {
        return gridCollections.getGrid(x,y);
    }
}
