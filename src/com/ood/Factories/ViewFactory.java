package com.ood.Factories;

import com.ood.Enums.GameEnum;
import com.ood.Views.*;
import com.ood.Enums.ViewEnum;

/**
 * produce View
 */
public class ViewFactory {

    public static <T extends View> T createView(ViewEnum viewEnum) {
        View v=null;
        switch (viewEnum)
        {
            case CONTROLLER:
                v=new GameControllerView();
                break;
            case MARKET:
                v=new MarketView();
                break;
            default:
                v=new MainView();
                break;
        }
        return (T) v;
    }

    public static <T extends AbsGameView> T createGameView(GameEnum gameEnum){
        View v=null;
        switch (gameEnum)
        {
            case LMH:
                v = new LMH_GameView();
            default:
                break;
        }
        return (T) v;
    }


}
