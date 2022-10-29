package com.ood.Team;

import com.ood.Players.IPlayer;

/**
 * Team interface
 * @param <T>
 */
public interface ITeam<T extends IPlayer>{
    String getName();
    void setName(String name);
    int getPoints();
    void setPoints(int points);
    void addPlayer(T player);
    IPlayer getPlayerAt(int index);
    void reset();
}
