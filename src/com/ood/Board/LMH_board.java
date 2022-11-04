package com.ood.Board;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.Grid.GridSpace;
import com.ood.Views.LMH_BoardView;


/**
 * concrete board for Legends: Monsters and Heroes game
 */
public class LMH_board extends MovableBoard{

    private int monsterCount=1;

    public LMH_board() {
        super();
        generateObstacles();
        generateMarkets();
        setView(new LMH_BoardView());
        getView().initBoardView(getRowNum(),getColNum());
    }

    public LMH_board(int row, int col) {
        super(row, col);
        generateObstacles();
        generateMarkets();
        setView(new LMH_BoardView());
        getView().initBoardView(row,col);
    }

    public void generateObstacles(){
        for(int i = 0; i< LMH_Constant.OBSTACLE_LIST.size(); i++)
        {
            GridSpace gridSpace = getGridCollections().getGrid(LMH_Constant.OBSTACLE_LIST.get(i));
            gridSpace.setObstacle();
        }

    }

    public void generateMarkets(){
        for(int i = 0; i< LMH_Constant.MARKET_LIST.size(); i++)
        {
            GridSpace gridSpace = getGridCollections().getGrid(LMH_Constant.MARKET_LIST.get(i));
            gridSpace.setMarket();
        }
    }

    public int getMonsterCount() {
        return monsterCount;
    }

    public void setMonsterCount(int monsterCount) {
        this.monsterCount = monsterCount;
    }

    @Override
    public void show() {
        getView().updateGraphicalGrid(getGridCollections());
        getView().displayBoard();
    }

}
