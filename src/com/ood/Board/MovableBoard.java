package com.ood.Board;

import com.ood.Grid.GridCollections;
import com.ood.Grid.GridSpace;
import com.ood.Grid.LMH_Grid;
import com.ood.Grid.LMH_GridCollections;

/**
 * a board which enables pieces to move
 */
public abstract class MovableBoard implements IBoard{
    private GridCollections<LMH_Grid> gridCollections;

    public MovableBoard() {
        gridCollections = new LMH_GridCollections();
    }

    public GridCollections<LMH_Grid> getGridCollections() {
        return gridCollections;
    }

    public void setGridCollections(GridCollections<LMH_Grid> gridCollections) {
        this.gridCollections = gridCollections;
    }

    @Override
    public GridSpace getGrid(int x, int y) {
        return gridCollections.getGrid(x,y);
    }
}
