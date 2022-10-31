package com.ood.Board;

import com.ood.Views.LMH_BoardView;
import com.ood.Views.View;

/**
 * concrete board for Legends: Monsters and Heroes game
 */
public class LMH_board extends MovableBoard{

    private LMH_BoardView view;

    private int marketSize;


    public LMH_board() {
        view=new LMH_BoardView();
        generateObstacles();
        generateMarkets();
    }

    public LMH_BoardView getView() {
        return view;
    }

    public int getMarketSize() {
        return marketSize;
    }

    public void setMarketSize(int marketSize) {
        this.marketSize = marketSize;
    }

    public void setView(LMH_BoardView view) {
        this.view = view;
    }

    public void generateObstacles(){

    }

    public void generateMarkets(){
        int m = getGridCollections().getRow();
        int n = getGridCollections().getCol();
        int remainingMarkets=getMarketSize();


    }


}
