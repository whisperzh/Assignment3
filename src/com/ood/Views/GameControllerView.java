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
        int choice=0;
        do
        {
            try {
                choice=jin_Int();
                if(choice>=0&&choice<range)
                    break;
                else
                    displayInvalidInputMessage();
            }catch (Exception e)
            {
                displayInvalidInputMessage();
            }


        }while(choice<0||choice>=range);

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
