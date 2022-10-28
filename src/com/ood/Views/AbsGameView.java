package com.ood.Views;

import java.security.PublicKey;
import java.util.Scanner;

/**
 * An abstract class used for displaying
 */
public abstract class AbsGameView extends View{

    public void displayInvalidInputMessage(){
        jout("Your Input is Invalid Please Input Again!");
    }

    abstract public void displayGameTitle();

    public void displayGameChoose(){
        joutDivider();
        jout("Press [1] to play <Legends: Monsters and Heroes>");
    }

    public void displayGameOver(){
        joutDivider();
        jout("-----------------------GAME OVER-----------------------");
        joutDivider();
    }

    abstract public void displayerPlayerScore(int score);

    abstract public void joutHelp();
}
