package com.ood.Board;

import com.ood.Grid.GridSpace;
import com.ood.Views.BoardView;
import com.ood.Views.View;

/**
 * board interface
 */
public interface IBoard {
    GridSpace getGrid(int x,int y);
    int getRowNum();
    int getColNum();
    void show();
    void setRowNum(int rowNum);
    void setColNum(int colNum);
    BoardView getView();
}
