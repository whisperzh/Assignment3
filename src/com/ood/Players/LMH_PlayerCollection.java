package com.ood.Players;

import com.ood.Enums.GameEnum;
import com.ood.Factories.PlayerFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Views.AbsGameView;

import java.util.ArrayList;
import java.util.List;

public class LMH_PlayerCollection extends PlayerCollection<LMH_Player>{

    private AbsGameView view;

    private List<String> playersName;

    public LMH_PlayerCollection(int size) {
        super(size);
        view= ViewFactory.createGameView(GameEnum.LMH);
        playersName=view.collectPlayersName(getPlayerSize());
        initPlayerList();
    }

    @Override
    void initPlayerList() {
        playerList=new ArrayList<>();
        for(int i = 0; i< getPlayerSize(); i++)
        {
            String playerName=playersName.get(i);
            playerList.add((LMH_Player) PlayerFactory.spawnPlayer(GameEnum.LMH,playerName));
        }
    }
}
