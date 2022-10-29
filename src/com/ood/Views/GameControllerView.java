package com.ood.Views;

import java.util.List;

/**
 * View of GameController
 */
public class GameControllerView extends View{
    String [] gameList={
            "<Legends: Monsters and Heroes>",
    };
    public GameControllerView() {

    }

    public int collectUsersGameChoice(){
        int range=gameList.length;
        int choice=-1;
        while (true)
        {
            choice = jin_Int();
            if(choice<0||choice>=range)
                displayInvalidInputMessage();
            else
                break;
        }

        return choice;
    }

    public void displayGameChoose(){
        joutDivider();
        for (int i=0;i<gameList.length;i++)
        {
            jout("Press ["+Integer.toString(i)+"] to play "+gameList[i]);
        }

    }


}
