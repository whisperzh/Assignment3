package com.ood;

import com.ood.Enums.ViewEnum;
import com.ood.Factories.ViewFactory;
import com.ood.Views.GameControllerView;

public class GameController {

    private GameControllerView gameControllerView;

    public GameController() {
        gameControllerView= ViewFactory.getView(ViewEnum.CONTROLLER);
    }

    public void chooseGame(){
        gameControllerView.displayGameChoose();
        int gameChoice=gameControllerView.collectUsersGameChoice();
    }

    public void play() {

    }

    public void endGame(){
    }

}
