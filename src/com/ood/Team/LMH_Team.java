package com.ood.Team;

import com.ood.Players.LMH_Player;
import com.ood.Players.LMH_PlayerCollection;

public class LMH_Team extends Team<LMH_Player>{
    private boolean isComputerTeam =false;

    public LMH_Team(String name, int size, boolean isPCPlayer) {
        super(name, size);
        setPlayerCollection(new LMH_PlayerCollection(getPlayerSize()));
    }

    @Override
    public void move() {

    }

}
