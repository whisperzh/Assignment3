package com.ood.Grid;

import com.ood.AttributesItems.Vector2;
import com.ood.Game.IGame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class GridCollections <T extends GridSpace>  {

    protected List<List<T>> grids;

    private int row=8;

    private int col=8;

    public GridCollections() {
        grids=new ArrayList<>();
        for(int i=0;i<row;i++)
        {
            grids.add(new ArrayList<T>());
        }
    }

    public GridCollections(int size) {
        grids=new ArrayList<>();
        row=size;
        col=size;
        for(int i=0;i<row;i++)
        {
            grids.add(new ArrayList<T>());
        }
    }

    public GridCollections(int sizeX,int sizeY) {
        grids=new ArrayList<>();
        row=sizeY;
        col=sizeX;
        for(int i=0;i<row;i++)
        {
            grids.add(new ArrayList<T>());
        }
    }

    abstract public void setGridAt(T grid, int x,int y);

    public T getGrid(int x, int y) {
        return grids.get(x).get(y);
    }

    public T getGrid(Vector2 pos){return grids.get(pos.getX()).get(pos.getY());}

    public List<List<T>> getGrids() {
        return grids;
    }

    public void setGrids(List<List<T>> grids) {
        this.grids = grids;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public abstract void reset();


}
