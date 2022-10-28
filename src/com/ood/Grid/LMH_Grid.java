package com.ood.Grid;

import com.ood.AttributesItems.Vector2;

import javax.swing.text.Position;

public class LMH_Grid implements GridSpace{
    private Vector2 position;

    public LMH_Grid(int x, int y) {
        position.setX(x);
        position.setY(y);
    }

    @Override
    public Vector2 getPosition() {
        return null;
    }

    @Override
    public void setPosition(Vector2 pos) {
        position.setX(pos.getX());
        position.setY(pos.getY());
    }

}
