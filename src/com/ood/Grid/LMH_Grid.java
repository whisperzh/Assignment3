package com.ood.Grid;

import com.ood.AttributesItems.Vector2;
import com.ood.Enums.LMHGridEnum;

public class LMH_Grid implements GridSpace<LMHGridEnum>{
    private Vector2 position;

    private LMHGridEnum type;

    public LMH_Grid(int x, int y) {
        position=new Vector2();
        position.setX(x);
        position.setY(y);
    }

    public LMHGridEnum getType() {
        return type;
    }

    public void setType(LMHGridEnum type) {
        this.type = type;
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
