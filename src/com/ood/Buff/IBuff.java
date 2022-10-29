package com.ood.Buff;

import com.ood.Characters.ICharacter;
import com.ood.Players.IPlayer;

/**
 * buff interface
 * @param <T>
 */
public interface IBuff<T extends ICharacter> {
    void doEffect(T character);
}
