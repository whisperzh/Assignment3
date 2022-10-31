package com.ood.Board;

import com.ood.Grid.GridSpace;
import com.ood.Views.View;

/**
 * board interface
 */
public interface IBoard {
    GridSpace getGrid(int x,int y);
    void show();
}
