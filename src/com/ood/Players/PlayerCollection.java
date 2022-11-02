package com.ood.Players;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerCollection <T extends IPlayer>{
    protected List<T> playerList;

    private int playerSize;

    private boolean isPCPlayer;

    public PlayerCollection(int size,boolean isPCPlayer) {
        this.isPCPlayer=isPCPlayer;
        this.playerList = new ArrayList<>();
        playerSize =size;
    }

    public int getPlayerSize() {
        return playerSize;
    }

    public void setPlayerSize(int playerSize) {
        this.playerSize = playerSize;
    }

    public void addPlayer(T p){
        playerList.add(p);
    }

    public List<T> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<T> playerList) {
        this.playerList = playerList;
    }

    public boolean getIsPCPlayer() {
        return isPCPlayer;
    }

    public void setPCPlayer(boolean PCPlayer) {
        isPCPlayer = PCPlayer;
    }

    abstract void initPlayerList();


}
