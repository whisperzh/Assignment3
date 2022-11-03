package com.ood.Views;

import com.ood.Characters.ICharacter;
import com.ood.Util.ParseCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Override
    public void displayParserInfo(ParseCollection parseCollection, boolean showIndex){
        joutDivider();
        for(int i=0;i<parseCollection.getParserSize();i++)
        {
            var parser=parseCollection.getParserAt(i);
            String fileName=parser.getFileName();
            jout(fileName);

            List<List<String >> rows=new ArrayList<>();
            List<String> schema = new ArrayList<>(parser.getOrderedSchema());

            if (showIndex)
                schema.add(0,"index");
            rows.add(schema);

            for(int e :parser.getAttributeDataBase().keySet())
            {
                List<String> attr=new ArrayList<>(parser.getAttributeDataBase().get(e));
                if(showIndex)
                    attr.add(0,new String("["+Integer.toString(e)+"]"));
                rows.add(attr);
            }
            joutAsTable(rows);
            jout("\n");
        }
        joutDivider();

    }


    @Override
    public int collectPlayersCount(int lowerBound, int upperBound) {
        jout("Please input count of players");
        return jin_BorderedInt(lowerBound,upperBound);
    }

    @Override
    public int displayPlayerChooseCharacter() {
        int ans= jin_BorderedInt(0,10);
        return ans;
    }

    @Override
    public void displayCharacterInfo(ICharacter hero) {
        Map<String ,String> attri=hero.getAllAttribute();
        jout("This is your hero's info:");
        joutDivider();
        List<List<String>> row=new ArrayList();
        for(String key : attri.keySet())
        {
            List<String> l=new ArrayList<>();
            l.add(key);
            l.add(attri.get(key));
            row.add(l);
        }
        joutAsTable(row);
    }

    @Override
    public void showMarketView() {

    }
}
