package com.ood.Views;

import com.ood.Characters.ICharacter;
import com.ood.Util.ParseCollection;

import java.util.List;

public class MarketView extends AbsGameView{
    public void showMenu(List<List<String>> data){
        joutAsTable(data);
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
    public int displayPlayerChooseCharacter(int bound) {
        return 0;
    }

    @Override
    public void displayCharacterInfo(ICharacter hero) {

    }

    public int collectCustomersChoice(int upperBound){
        jout("Please choose one item");
        int choice = jin_BorderedInt(0,upperBound);
        return choice;
    }

    @Override
    public void showMarketView() {

    }
}
