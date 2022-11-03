package com.ood.Battle;

import com.ood.Team.TeamCollection;

public class LMH_Battle implements IBattle{

    private TeamCollection teamCollection;


    public LMH_Battle(TeamCollection teamCollection) {
        this.teamCollection = teamCollection;
    }

    public TeamCollection getTeamCollection() {
        return teamCollection;
    }

    public void setTeamCollection(TeamCollection teamCollection) {
        this.teamCollection = teamCollection;
    }

    @Override
    public void fight() {

    }
}
