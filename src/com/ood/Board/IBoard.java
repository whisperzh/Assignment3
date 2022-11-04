package com.ood.Board;

import com.ood.AttributesItems.Vector2;
import com.ood.Characters.ICharacter;
import com.ood.Grid.GridSpace;
import com.ood.Views.BoardView;
import com.ood.Views.View;

/**
 * board interface
 */
public interface IBoard {
    GridSpace getGrid(int row,int col);
    GridSpace getGrid(Vector2 position);
    void movePiece(ICharacter character, int row, int col);
    int getRowNum();
    int getColNum();
    void show();
    void setRowNum(int rowNum);
    void setColNum(int colNum);
    BoardView getView();
}
