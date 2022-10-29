package com.ood.Grid;

/**
 * concrete grid collections
 */
public class LMH_GridCollections extends GridCollections<LMH_Grid>{

    public LMH_GridCollections() {
        super();
        initGrids();
    }

    public LMH_GridCollections(int size) {
        super(size);
        initGrids();
    }

    public LMH_GridCollections(int sizeX, int sizeY) {
        super(sizeX, sizeY);
        initGrids();
    }

    @Override
    public void setGridAt(LMH_Grid grid,int x,int y) {
        getGrids().get(y).set(x,grid);
    }

    @Override
    public void reset() {

    }

    private void initGrids(){
        for(int i=0;i<getRow();i++)
        {
            for(int j=0;j<getCol();j++)
            {
                grids.get(i).add(new LMH_Grid(i,j));
            }
        }

    }
}
