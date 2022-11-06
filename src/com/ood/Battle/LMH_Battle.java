package com.ood.Battle;

import com.ood.Judge.LMH_Judge;
import com.ood.Players.LMH_Player;
import com.ood.Players.LMH_PlayerCollection;
import com.ood.Players.PlayerCollection;
import com.ood.Team.TeamCollection;

import java.util.ArrayList;
import java.util.List;

public class LMH_Battle implements IBattle{

    private TeamCollection teamCollection;

    private List<LMH_Player> playerCollection;

    private LMH_Judge judge;

    public LMH_Battle(TeamCollection teamCollection) {
        this.teamCollection = teamCollection;
        judge=new LMH_Judge();
    }

    private void initPlayerCollection(){
        playerCollection=new ArrayList<>();
        int playerinTeamIndex=0;
        while (playerinTeamIndex<teamCollection.getTeamAt(0).getPlayerSize()) {
            for (int i = 0; i < teamCollection.getTeamList().size(); i++) {
                playerCollection.add((LMH_Player) teamCollection.getTeamAt(i).getPlayerAt(playerinTeamIndex));
            }
            playerinTeamIndex++;
        }

    }


    public TeamCollection getTeamCollection() {
        return teamCollection;
    }

    public void setTeamCollection(TeamCollection teamCollection) {
        this.teamCollection = teamCollection;
    }

    @Override
    public void fight() {
        int playerSize=playerCollection.size();
        int index=0;
        while(judge.allTeamAlive(teamCollection))
        {
            LMH_Player p=playerCollection.get(index);
            if(p.isActive())
            {
                p
            }
        }
    }
}
