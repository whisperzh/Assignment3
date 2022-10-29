package com.ood.Players;

import com.ood.AttributesItems.Wallet;
import com.ood.Team.ITeam;

public class LMH_Player extends BoardGamePlayer{
    private ITeam team;
    @Override
    public void reset() {

    }

    @Override
    public ITeam getTeam() {
        return team;
    }

}
