package com.ood.Grid;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.AttributesItems.Vector2;
import com.ood.Characters.ICharacter;
import com.ood.Enums.LMHGridEnum;
import com.ood.FunctionInterfaces.IGridContent;
import com.ood.Game.IGame;
import com.ood.Item.IItem;
import com.ood.Market.IMarket;
import com.ood.Market.LMH_Market;

/**
 * concrete class of grid, used for LMH
 */
public class LMH_Grid implements GridSpace<LMHGridEnum>{

    private LMHGridEnum type;

    private boolean canPass;

    private int gridWidth =LMH_Constant.GRID_WIDTH;

    private IGridContent content =null;

    private String icon;

    private ICharacter character=null;

    public LMH_Grid() {
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
        setIcon(LMH_Constant.HERO_ICON);
    }

    public ICharacter getCharacter(){
        return character;
    }

    @Override
    public void setMarket() {
        content =new LMH_Market();
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

    public boolean isCanPass() {
        return canPass&&character==null;
    }

    public void setCanPass(boolean canPass) {
        this.canPass = canPass;
    }

    @Override
    public IMarket<IItem> getMarket() {
        return (IMarket<IItem>)content;
    }

    public void setDefaultIcon(){
        character=null;
        if(type==null)
        {
            String space="";
            for(int i = 0; i< gridWidth; i++)
            {
                space+=" ";
            }
            setIcon(space);
            return;
        }
        if(type.equals(LMHGridEnum.OBSTACLE))
        {
            setIcon(LMH_Constant.OBSTACLE);
        }else if(type.equals(LMHGridEnum.MARKET))
        {
            setIcon(LMH_Constant.MARKET);
        }else
        {
            String space="";
            for(int i = 0; i< gridWidth; i++)
            {
                space+=" ";
            }
            setIcon(space);
        }

    }

    @Override
    public String getIcon() {
        return icon;
    }

    @Override
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public IGridContent getGridContent() {
        return content;
    }


}
