package com.ood.Views;

import com.ood.Characters.GeneralHero;
import com.ood.Characters.ICharacter;
import com.ood.Inventory.IInventory;
import com.ood.Item.IItem;
import com.ood.Team.SimpleCollection;
import com.ood.Util.ParseCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * view component for market
 */
public class MarketView extends AbsGameView{
    public void showMenu(List<List<List<String>>> data){
        int index=0;
        for(var lines:data)
        {
            List<List<String>> newLine=new ArrayList(lines);
            newLine.get(0).add(0,"index");
            for(int i=1;i<newLine.size();i++)
            {
                newLine.get(i).add(0,"["+index+"]");
                index++;
            }
            joutAsTable(newLine);
        }
    }

    @Override
    public void displayGameTitle() {

    }

    @Override
    public void displayPlayerScoreTable() {

    }

    @Override
    public void joutHelp() {

    }

    public void disPlayCheckoutInfo(GeneralHero customer, IItem checkoutItem){
        String name=customer.getName();
        float price=checkoutItem.getOriginalPrice();
        jout(name+" spend "+price+", and got "+checkoutItem.getName());
    }
    @Override
    public void displayCharacterInventory(ICharacter customer){
        IInventory<IItem> inv=customer.getInventory();
        for(int i=0;i<inv.getSize();i++)
        {
            jout("["+i+"]"+inv.get(i).getName()+" sell price: "+inv.get(i).getSellPrice());
        }
    }

    /**
     * do nothing
     * @return
     */
    @Override
    public int collectCharactersCount() {
        return 0;
    }

    @Override
    public List<String> collectPlayersName(int size) {
        return null;
    }

    @Override
    public int collectPlayersCount() {
        return 0;
    }

    @Override
    public int collectPlayersCount(int lowerBound, int upperBound) {
        return 0;
    }

    @Override
    public void displayParserInfo(ParseCollection parseCollection, boolean showIndex) {

    }

    @Override
    public int displayPlayerChooseCharacter(int bound, String name) {
        return 0;
    }

    @Override
    public void displayCharactersInfo(SimpleCollection<ICharacter> characterCollection) {

    }

    public int collectCustomersChoice(int upperBound){
        jout("Please choose one item");
        int choice = jin_BorderedInt(0,upperBound);
        return choice;
    }

    @Override
    public void showMarketView() {

    }


    public void disPlayCannotSellInfo() {
        joutDivider();
        jout("You got nothing to sell!");
        joutDivider();
    }

    public void disPlayCannotBuyInfo() {
        joutDivider();
        jout("You don't have enough money!");
        joutDivider();
    }


    public void displayMarketWelcomeMessage(String name) {
        jout(name+", Welcome!");
    }
}
