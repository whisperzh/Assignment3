package com.ood.Board;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.Grid.GridCollections;
import com.ood.Grid.GridSpace;
import com.ood.Grid.LMH_Grid;
import com.ood.Grid.LMH_GridCollections;
import com.ood.Views.BoardView;

/**
 * a board which enables pieces to move
 */
public abstract class MovableBoard implements IBoard{
    private GridCollections<LMH_Grid> gridCollections;

    private BoardView view;

    private int rowNum= LMH_Constant.BOARD_ROW;

    private int colNum=LMH_Constant.BOARD_COL;

    public MovableBoard() {
        gridCollections = new LMH_GridCollections(rowNum,colNum);
    }

    public GridCollections<LMH_Grid> getGridCollections() {
        return gridCollections;
    }

    public void setGridCollections(GridCollections<LMH_Grid> gridCollections) {
        this.gridCollections = gridCollections;
    }

    public BoardView getView(){
        return view;
    }

    @Override
    public GridSpace getGrid(int x, int y) {
        return gridCollections.getGrid(x,y);
    }

    public void setView(BoardView view) {
        this.view = view;
    }
}
