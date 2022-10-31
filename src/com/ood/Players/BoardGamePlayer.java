package com.ood.Players;

import com.ood.Team.ITeam;

/**
 * abstract class of players
 */
public abstract class BoardGamePlayer implements IPlayer{
    private String name;

    private boolean isActive;// whether player can move in next/current round

    private int points;

    private ITeam team;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    public void setTeam(ITeam team) {
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
    }
}
