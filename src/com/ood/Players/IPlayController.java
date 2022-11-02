package com.ood.Players;

/**
 * The controller of player
 */
public interface IPlayController<T extends BoardGamePlayer> {
    void setPlayer(T player);
    T getPlayer();
    void playerRollDice();

}
