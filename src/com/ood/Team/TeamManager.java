package com.ood.Team;

import com.ood.Players.IPlayer;

import java.util.ArrayList;
import java.util.List;

/**
 * Used for manage the team
 * @param <T>
 */
public class TeamManager<T extends ITeam<? extends IPlayer>> {
    private List<T> teamList;

    public TeamManager() {
        this.teamList =new ArrayList<>();
    }

    public List<T> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<T> teamList) {
        this.teamList = teamList;
    }

    public void addTeam(T team){
        teamList.add(team);
    }


}
