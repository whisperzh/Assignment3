package com.ood.Players;

/**
 * abstract class of players
 */
public abstract class BoardGamePlayer implements IPlayer{
    private String name;

    private boolean isActive;

    private int points;

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
}
