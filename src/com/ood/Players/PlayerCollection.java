package com.ood.Players;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class PlayerCollection <T extends IPlayer>{
    private List<T> playerList;

    public PlayerCollection() {
        this.playerList = new ArrayList<>();
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
}
