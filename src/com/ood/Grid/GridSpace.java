package com.ood.Grid;

import com.ood.FunctionInterfaces.IGridContent;
import com.ood.Item.IItem;
import com.ood.Market.IMarket;
import com.ood.Players.IPlayer;

/**
 * Encapsulated all of the Grid Space(cell) methods
 */
public interface GridSpace<T extends Enum> {
    T getType();
    void setPlayer(IPlayer player);
    void setMarket();
    IMarket<IItem> getMarket();
    void setObstacle();
    IPlayer getPlayer();
    boolean isCanPass();
    void setCanPass(boolean canPass);
    String getIcon();
    void setDefaultIcon();
    void setIcon(String icon);
    IGridContent getGridContent();
}
