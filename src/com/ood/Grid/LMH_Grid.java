package com.ood.Grid;

import com.ood.AttributesItems.Vector2;
import com.ood.Characters.ICharacter;
import com.ood.Enums.LMHGridEnum;
import com.ood.Item.IItem;
import com.ood.Market.IMarket;
import com.ood.Market.LMH_Market;

public class LMH_Grid implements GridSpace<LMHGridEnum>{
    private Vector2 position;

    private LMHGridEnum type;

    private boolean canPass;

    private IMarket<IItem> market=null;

    private ICharacter character=null;

    public LMH_Grid(int x, int y) {
        position=new Vector2();
        position.setX(x);
        position.setY(y);
        canPass=true;
        type=LMHGridEnum.VACANT;
    }

    public LMHGridEnum getType() {
        return type;
    }

    @Override
    public void setCharacter(ICharacter character) {
        this.character=character;
    }

    public ICharacter getCharacter(){
        return character;
    }

    @Override
    public void setMarket() {
        setType(LMHGridEnum.MARKET);
        market=new LMH_Market();
    }

    @Override
    public void setObstacle() {
        canPass=false;
        setType(LMHGridEnum.OBSTACLE);
    }

    public void setType(LMHGridEnum type) {
        this.type = type;
    }

    @Override
    public Vector2 getPosition() {
        return null;
    }

    public boolean isCanPass() {
        return canPass;
    }

    public void setCanPass(boolean canPass) {
        this.canPass = canPass;
    }

    public IMarket getMarket() {
        return market;
    }

    @Override
    public void setPosition(Vector2 pos) {
        position.setX(pos.getX());
        position.setY(pos.getY());
    }



}
