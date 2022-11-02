package com.ood.Players;

/**
 * specific player controller for LMH
 */
public class LMH_PlayerController implements IPlayController<LMH_Player> {
    private LMH_Player player;

    public void playerRollDice(){
        player.rollDice();
    }
    @Override
    public void setPlayer(LMH_Player player) {
        this.player=player;
    }

    @Override
    public LMH_Player getPlayer() {
        return player;
    }
}
