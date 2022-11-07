package com.ood.Team;

public class LMH_TeamCollection extends TeamCollection<LMH_Team>{
    @Override
    public void teamsChooseHero() {
        for(int i=0;i<size();i++)
        {
            getTeamAt(i).playerChooseHero();
        }
    }
}
