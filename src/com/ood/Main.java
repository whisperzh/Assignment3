package com.ood;

import com.ood.Game.GameController;
import com.ood.Util.AttributeParser;
import com.ood.Util.IConfigParser;
import com.ood.Views.MainView;
import com.ood.Views.View;

import java.io.IOException;

/**
 * main class
 */
public class Main {

    public static void main(String[] args) {

        // write your code here
        View view = new MainView();
        view.displayWelcomeMessage();
        GameController gameController = new GameController();
        boolean cont=true;

        while (cont) {
            gameController.chooseGame();
            gameController.play();
            view.jout("Do you want to continue the game?");
            cont=view.jin_YesOrNo();
        }
        view.displayGoodByeMessage();

    }



}
