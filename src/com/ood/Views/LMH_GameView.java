package com.ood.Views;

import com.ood.Characters.GeneralHero;
import com.ood.Characters.ICharacter;
import com.ood.Inventory.IInventory;
import com.ood.Item.IItem;
import com.ood.Util.ParseCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * the concrete game view class for LMH
 */
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
        int startIndex=0;
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

            for(int j=0;j<parser.getAttributeDataBase().size();j++)
            {
                List<String> attr=new ArrayList<>(parser.getAttributeDataBase().get(j));
                if(showIndex)
                    attr.add(0,new String("["+Integer.toString(j+startIndex)+"]"));
                rows.add(attr);

            }
            startIndex+=parser.getAttributeDataBase().size();
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
    public int displayPlayerChooseCharacter(int bound, String name) {
        jout(name+", Please choose your hero!");
        int ans= jin_BorderedInt(0,bound);
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

    @Override
    public void displayHeroInventory(GeneralHero hero) {
        IInventory<IItem> inv=hero.getInventory();
        for(int i=0;i<inv.getSize();i++)
        {
            jout("["+i+"]"+inv.get(i).getName());
        }
    }

    public void displayHeroFaintMessage(ICharacter character) {
        joutDivider();
        jout(character.getName()+" fainted!");
    }

    public void displayCannotEquipMessage() {
        joutDivider();
        jout("You cannot equip this item!");
    }
}
