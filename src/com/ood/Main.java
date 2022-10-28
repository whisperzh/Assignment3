package com.ood;

import com.ood.Views.MainView;
import com.ood.Views.View;

/**
 * main class
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        View view=new MainView();
        view.displayWelcomeMessage();

        GameManager gameManager=new GameManager();
        gameManager.chooseGame();
        gameManager.play();

        view.displayGoodByeMessage();


    }
}
