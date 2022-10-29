package com.ood.Views;

import java.security.PublicKey;
import java.util.Scanner;

/**
 * An abstract class used for displaying
 */
public abstract class AbsGameView extends View{

    abstract public void displayGameTitle();

    public void displayGameOver(){
        joutDivider();
        jout("-----------------------GAME OVER-----------------------");
        joutDivider();
    }

    abstract public void displayerPlayerScore(int score);

    abstract public void joutHelp();
}
