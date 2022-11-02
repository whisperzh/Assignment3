package com.ood.Factories;

import com.ood.Enums.GameEnum;
import com.ood.Players.IPlayer;
import com.ood.Players.LMH_Player;

public class PlayerFactory {
    public static IPlayer spawnPlayer(GameEnum game, String playerName,boolean isPCPlayer){
        IPlayer player;
        switch (game)
        {
            case LMH:
                player=new LMH_Player(isPCPlayer);
                player.setName(playerName);
                break;
            default:
                player=null;
        }
        return player;
    }

}
