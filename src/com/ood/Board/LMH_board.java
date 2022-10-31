package com.ood.Board;

import com.ood.AttributesItems.Vector2;
import com.ood.Grid.GridSpace;
import com.ood.Views.LMH_BoardView;
import com.ood.Views.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * concrete board for Legends: Monsters and Heroes game
 */
public class LMH_board extends MovableBoard{

    private LMH_BoardView view;

    private List<Vector2> obstacleList=new ArrayList<>(Arrays.asList(
            new Vector2(0,1),new Vector2(0,2),new Vector2(1,6),new Vector2(2,5),new Vector2(5,4),
            new Vector2(0,2),new Vector2(1,2),new Vector2(2,6),new Vector2(4,5),new Vector2(5,5),
            new Vector2(5,1),new Vector2(5,2),new Vector2(4,4))
    );
    private List<Vector2> marketList=new ArrayList<>(Arrays.asList(
            new Vector2(0,5),new Vector2(0,6),new Vector2(0,7),new Vector2(1,7),new Vector2(2,2),
            new Vector2(2,3),new Vector2(3,1),new Vector2(3,6),new Vector2(4,1),new Vector2(4,6),
            new Vector2(4,7),new Vector2(5,2),new Vector2(5,3),new Vector2(6,0),new Vector2(6,6),
            new Vector2(7,5),new Vector2(7,6))
    );

    public LMH_board() {
        view=new LMH_BoardView();
        generateObstacles();
        generateMarkets();
    }

    public LMH_BoardView getView() {
        return view;
    }

    public int getMarketSize() {
        return marketList.size();
    }

    public int getObstacleSize(){
        return obstacleList.size();
    }

    public void setView(LMH_BoardView view) {
        this.view = view;
    }

    public void generateObstacles(){
        for(int i=0;i<obstacleList.size();i++)
        {
            GridSpace gridSpace = getGridCollections().getGrid(obstacleList.get(i));
            gridSpace.setObstacle();
        }

    }

    public void generateMarkets(){
        for(int i=0;i<marketList.size();i++)
        {
            GridSpace gridSpace = getGridCollections().getGrid(marketList.get(i));
            gridSpace.setMarket();
        }
    }


}
