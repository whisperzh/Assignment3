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

        IConfigParser parser=new AttributeParser("Legends_Monsters_and_Heroes/Armory.txt");
        try {
            parser.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        parser.reset();


        // write your code here
        View view=new MainView();
        view.displayWelcomeMessage();
        GameController gameController =new GameController();
        gameController.chooseGame();
        gameController.play();
        view.displayGoodByeMessage();


    }



}
