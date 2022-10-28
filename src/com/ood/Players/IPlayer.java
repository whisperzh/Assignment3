package com.ood.Players;

/**
 * player interface
 */
public interface IPlayer {
    String getName();
    void setName(String name);
    int getPoints();
    void setPoints(int points);
    boolean isActive();//whether the player can control the game
    void setActive(boolean status);
    void reset();
}
