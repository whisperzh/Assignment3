package com.ood.Views;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.Characters.ICharacter;
import com.ood.Util.IConfigParser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public abstract int displayPlayerChooseCharacter();

    public abstract void displayCharacterInfo(ICharacter hero);

    public char collectPlayersAction() {
        char action=' ';
        String reminder="Please input an action\n";
        Set<Character> validSet=new HashSet();
        for(var v : LMH_Constant.VALID_ACTIONS)
            validSet.add(v);
        do {
            String act = jin_Str(reminder+ LMH_Constant.ACTION_HELP);
            if (act.length()==1&&validSet.contains(act.charAt(0))) {
                action=act.charAt(0);
                break;
            }
            displayInvalidInputMessage();
        }while (true);
        return action;
    }


    public abstract void showMarketView();
}
