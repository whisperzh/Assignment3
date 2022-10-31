package com.ood.Team;

import com.ood.Players.IPlayer;
import com.ood.Players.PlayerCollection;

/**
 * Team Concrete class
 * @param <T> player
 */
public abstract class Team<T extends IPlayer> implements ITeam<IPlayer> {

    private String name;

    private int playerSize;

    private PlayerCollection<T> playerCollection;

    private int points;

    private boolean isActive=true;


    public Team(String name, int size) {
        this.name = name;
        playerSize=size;
    }

    public PlayerCollection<T> getPlayerCollection() {
        return playerCollection;
    }

    public void setPlayerCollection(PlayerCollection<T> playerCollection) {
        this.playerCollection = playerCollection;
    }

    public int getPlayerSize() {
        return playerSize;
    }

    public void setPlayerSize(int playerSize) {
        this.playerSize = playerSize;
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
    public void addPlayer(IPlayer player) {
        playerCollection.addPlayer((T) player);
    }

    @Override
    public IPlayer getPlayerAt(int index) {
        return null;
    }

    @Override
    public void reset() {

    }

    @Override
    public boolean getIsActive() {
        return isActive;
    }

    @Override
    public void setIsActive(boolean active) {
        isActive = active;
    }
}
