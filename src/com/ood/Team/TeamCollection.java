package com.ood.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamCollection<T> {

    private List<T> teamList;

    public TeamCollection() {
        this.teamList = new ArrayList<>();
        //need to set team size and add teams into teamCollection Now
    }

    public void addTeam(T t) {
        teamList.add(t);
    }

    public List<T> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<T> teamList) {
        this.teamList = teamList;
    }

}
