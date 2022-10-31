package com.ood.Grid;

import com.ood.AttributesItems.Vector2;

/**
 * the interface for all kinds of grids
 */
public interface GridSpace<T extends Enum> {
    Vector2 getPosition();
    void setPosition(Vector2 position);
    T getType();
}
