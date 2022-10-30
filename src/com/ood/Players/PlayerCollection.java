package com.ood.Players;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public abstract class PlayerCollection <T extends IPlayer>{
    protected List<T> playerList;

    private int playersize;

    public PlayerCollection(int size) {
        this.playerList = new ArrayList<>();
        playersize=size;
    }

    public int getPlayersize() {
        return playersize;
    }

    public void setPlayersize(int playersize) {
        this.playersize = playersize;
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

    abstract void initPlayerList();


}
