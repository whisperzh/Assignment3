package com.ood.Team;

public class Team implements ITeam {
    private String name;
    private int points;

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
    public void reset() {

    }
}
