package com.ood.Factories;

import com.ood.Enums.GameEnum;
import com.ood.Views.GameCliUserInterface;
import com.ood.Views.LMH_GameView;

public class GameViewFactory {

    public static GameCliUserInterface getView(GameEnum game) {
        switch (game)
        {
            case LMH:
                return new LMH_GameView();
            default:
                break;
        }
        return null;
    }


}
