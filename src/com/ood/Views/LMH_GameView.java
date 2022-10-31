package com.ood.Views;

import java.util.ArrayList;
import java.util.List;

public class LMH_GameView extends AbsGameView {

    @Override
    public void displayGameTitle() {
        jout("--------------WELCOME TO Legends: Monsters and Heroes-------------");
    }

    @Override
    public void displayerPlayerScoreTable() {

    }

    @Override
    public void joutHelp() {

    }

    @Override
    public List<String> collectPlayersName(int size) {
        List<String> names=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            String name=jin_Str("Please give yourself a name");

            while(name.equals(""))
            {
                displayInvalidInputMessage("You cannot input an empty name.");
                name=jin_Str("Please give yourself a name");
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

    @Override
    public int collectPlayersCount(int lowerBound, int upperBound) {
        int pc=jin_Int("Please input Player Size [ "+lowerBound+ " ~ "+upperBound +"] ");
        while(pc>=1&&pc<=3)
        {
            displayInvalidInputMessage();
            pc=jin_Int("Please input Player Size [ "+lowerBound+ " ~ "+upperBound +"] ");
        }
        return pc;
    }
}
