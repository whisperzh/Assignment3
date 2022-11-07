package com.ood.Team;

import java.util.ArrayList;
import java.util.List;

public abstract class TeamCollection<T extends ITeam> {

    private List<T> teamList;

    public TeamCollection() {
        this.teamList = new ArrayList<>();
        //need to set team size and add teams into teamCollection Now
    }

    public T getTeamAt(int index){
        return teamList.get(index);
    }

    public T getTeamByName(String name){
        T ans=null;
        for(int i=0;i<teamList.size();i++)
        {
            if(teamList.get(i).getName().equals(name)){
                ans=teamList.get(i);
                return ans;
            }
        }
        return ans;
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

    public int size(){
        return teamList.size();
    }

    public abstract void teamsChooseHero();

}
