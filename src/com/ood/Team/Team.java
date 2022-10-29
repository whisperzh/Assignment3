package com.ood.Team;

import com.ood.Players.IPlayer;
import com.ood.Players.PlayerCollection;

public class Team<T extends IPlayer> implements ITeam {
    private String name;
    private PlayerCollection playerCollection;
    private int points;

    public Team(String name) {
        this.name = name;
        playerCollection =new PlayerCollection();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void setPoints(int points) {
        this.points=points;
    }

    @Override
    public void addPlayer() {

    }

    @Override
    public IPlayer getPlayerAt(int index) {
        return null;
    }

    @Override
    public void reset() {

    }
}
