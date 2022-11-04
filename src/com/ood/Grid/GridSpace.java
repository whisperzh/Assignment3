package com.ood.Grid;

import com.ood.AttributesItems.Vector2;
import com.ood.Characters.GeneralHero;
import com.ood.Characters.ICharacter;
import com.ood.FunctionInterfaces.IGridContent;
import com.ood.Item.IItem;
import com.ood.Market.IMarket;

/**
 * the interface for all kinds of grids
 */
public interface GridSpace<T extends Enum> {
    T getType();
    void setCharacter(ICharacter character);
    void setMarket();
    IMarket<IItem> getMarket();
    void setObstacle();
    ICharacter getCharacter();
    boolean isCanPass();
    void setCanPass(boolean canPass);
    String getIcon();
    void setDefaultIcon();
    void setIcon(String icon);
    IGridContent getGridContent();
}
