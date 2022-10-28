package com.ood.Grid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GridCollections <T> implements Iterator {

    private List<List<T>> grids;

    public GridCollections() {
        grids=new ArrayList<>();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public T getGrid(int x, int y) {
        return grids.get(x).get(y);
    }
}
