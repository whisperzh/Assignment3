package com.ood.Buff;

import com.ood.Players.IPlayer;

public interface IBuff<T extends IPlayer> {
    void doEffect(T player);
}
