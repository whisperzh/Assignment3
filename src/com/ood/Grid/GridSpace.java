package com.ood.Grid;

import com.ood.AttributesItems.Vector2;
import com.ood.Characters.GeneralHero;
import com.ood.Characters.ICharacter;

/**
 * the interface for all kinds of grids
 */
public interface GridSpace<T extends Enum> {
    Vector2 getPosition();
    void setPosition(Vector2 position);
    T getType();
    void setCharacter(ICharacter character);
    void setMarket();
    void setObstacle();
    ICharacter getCharacter();
}
