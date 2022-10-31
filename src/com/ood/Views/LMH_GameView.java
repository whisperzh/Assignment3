package com.ood.Views;

import com.ood.Characters.GeneralHero;

import java.util.ArrayList;
import java.util.List;

public class LMH_GameView extends AbsGameView {

    @Override
    public void displayGameTitle() {
        jout("--------------WELCOME TO Legends: Monsters and Heroes-------------");
    }

    @Override
    public void displayPlayerScoreTable() {

    }

    @Override
    public void joutHelp() {

    }

    @Override
    public List<String> collectPlayersName(int size) {
        List<String> names=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            String name=jin_Str("Please enter a name for the player");

            while(name.equals(""))
            {
                displayInvalidInputMessage("You cannot input an empty name.");
                name=jin_Str("Please enter a name for the player");
            }

            names.add(name);
        }
        return names;
    }

    @Override
    public int collectPlayersCount() {
        int pc=jin_Int("Please input Player Size");
        while(pc<=0)
        {
            displayInvalidInputMessage();
            pc=jin_Int("Please input Player Size");
        }
        return pc;
    }

    public void displayAllHeroAttributes(List<String> schema, List<GeneralHero> heros){


    }

    @Override
    public int collectPlayersCount(int lowerBound, int upperBound) {
        jout("Please input count of players");
        return jin_BorderedInt(lowerBound,upperBound);
    }
}
