package com.ood.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamManager<T extends ITeam> {
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
