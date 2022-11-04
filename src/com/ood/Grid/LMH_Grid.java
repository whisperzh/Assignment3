package com.ood.Grid;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.AttributesItems.Vector2;
import com.ood.Characters.ICharacter;
import com.ood.Enums.LMHGridEnum;
import com.ood.Item.IItem;
import com.ood.Market.IMarket;
import com.ood.Market.LMH_Market;

/**
 * concrete class of grid, used for LMH
 */
public class LMH_Grid implements GridSpace<LMHGridEnum>{
    private Vector2 position;

    private LMHGridEnum type;

    private boolean canPass;

    private int gridWidth =LMH_Constant.GRID_WIDTH;

    private IMarket<IItem> market=null;

    private String icon;

    private ICharacter character=null;

    public LMH_Grid(int x, int y) {
        position=new Vector2();
        position.setX(x);
        position.setY(y);
        canPass=true;
        setDefaultIcon();
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
        market=new LMH_Market();
        setType(LMHGridEnum.MARKET);
        setIcon(LMH_Constant.MARKET);
    }

    @Override
    public void setObstacle() {
        canPass=false;
        setIcon(LMH_Constant.OBSTACLE);
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

    public IMarket<IItem> getMarket() {
        return market;
    }

    @Override
    public void setPosition(Vector2 pos) {
        position.setX(pos.getX());
        position.setY(pos.getY());
    }

    public void setDefaultIcon(){
        String space="";
        for(int i = 0; i< gridWidth; i++)
        {
            space+=" ";
        }
        setIcon(space);
    }

    @Override
    public String getIcon() {
        return icon;
    }

    @Override
    public void setIcon(String icon) {
        this.icon = icon;
    }
}
