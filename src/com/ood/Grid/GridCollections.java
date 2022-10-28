package com.ood.Grid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GridCollections <T>  {

    private List<List<T>> grids;

    private int hor_size=8;

    private int vert_size=8;

    public GridCollections() {
        grids=new ArrayList<>();
    }

    public void gridInit(int size)
    {
        hor_size=size;
        vert_size=size;
        for(int i=0;i<size;i++)
        {
            List<T> row=new ArrayList<>();
            for (int j=0;j<size;j++)
            {
                row.add((T) new LMH_Grid(i,j));
            }
            grids.add(row);
        }
    }

    public void gridInit(int xSize,int ySize)
    {
        hor_size=xSize;
        vert_size=ySize;
    }

    public T getGrid(int x, int y) {
        return grids.get(x).get(y);
    }
}
