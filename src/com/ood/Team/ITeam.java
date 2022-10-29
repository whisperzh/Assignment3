package com.ood.Team;

import com.ood.Players.IPlayer;

public interface ITeam {
    String getName();
    void setName(String name);
    int getPoints();
    void setPoints(int points);
    void addPlayer();
    IPlayer getPlayerAt(int index);
    void reset();
}
