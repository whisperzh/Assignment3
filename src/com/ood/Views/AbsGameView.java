package com.ood.Views;

import com.ood.Util.IConfigParser;

import java.security.PublicKey;
import java.util.List;
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

    abstract public void displayPlayerScoreTable();

    abstract public void joutHelp();

    public abstract List<String> collectPlayersName(int size);

    public abstract int collectPlayersCount();

    public abstract int collectPlayersCount(int lowerBound,int upperBound);

    public abstract void displayParserInfo(IConfigParser parser);

    public abstract void displayParserInfo(List<IConfigParser> l);

}
