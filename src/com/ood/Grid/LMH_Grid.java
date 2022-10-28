package com.ood.Grid;

import com.ood.AttributesItems.Vector2;

import javax.swing.text.Position;

public class LMH_Grid implements GridSpace{
    private Vector2 position;

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
