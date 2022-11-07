package com.ood.Game;

import com.ood.Enums.GameEnum;
import com.ood.Enums.ViewEnum;
import com.ood.Factories.GameFactory;
import com.ood.Factories.ViewFactory;
import com.ood.Judge.BoardGameJudge;
import com.ood.Judge.LMH_Judge;
import com.ood.Views.GameControllerView;

public class GameController {

    private GameControllerView gameControllerView;

    private int gameChoice;

    private IGame game;

    public GameController() {
        gameControllerView= ViewFactory.createView(ViewEnum.CONTROLLER);
    }

    public void chooseGame(){
        gameControllerView.displayGameChoose();
        gameChoice=gameControllerView.collectUsersGameChoice();
        game= GameFactory.createGame(GameEnum.intToGameType(gameChoice));
    }

    public void play() {
        game.start();
    }

    public void endGame(){

    }

    public int getGameChoice() {
        return gameChoice;
    }

    public void setGameChoice(int gameChoice) {
        this.gameChoice = gameChoice;
    }
}
