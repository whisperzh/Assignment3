package com.ood.Views;

import com.ood.Characters.GeneralHero;
import com.ood.Characters.GeneralMonster;
import com.ood.Characters.ICharacter;
import com.ood.Players.IPlayer;
import com.ood.Players.LMH_Player;
import com.ood.Team.LMH_Team;
import com.ood.Util.ParseCollection;

import java.util.ArrayList;
import java.util.List;

public class LMH_BattleView extends AbsGameView{
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
    public int displayPlayerChooseCharacter(int bound, String name) {
        return 0;
    }

    @Override
    public void displayCharacterInfo(ICharacter hero) {

    }

    @Override
    public void showMarketView() {

    }

    @Override
    public void displayHeroInventory(GeneralHero customer) {

    }

    public void displayFight(){
        joutDivider();
        jout("Ready, Fight!");
        joutDivider();
    }

    public void displayAttackMonsterChoices(LMH_Team mon_team){
        List<List<String >> rows=new ArrayList<>();
        List<String > title=new ArrayList<>();
        title.add("index");
        title.add("name");
        title.add("HP");
        title.add("defense");
        rows.add(title);
        for(int i=0;i<mon_team.getPlayerSize();i++)
        {
            IPlayer player=mon_team.getPlayerAt(i);
            GeneralMonster monster=(GeneralMonster) ((LMH_Player)player).getMyCharacter();
            List<String > line=new ArrayList<>();
            line.add("["+i+"]");
            line.add(monster.getName());
            line.add(Float.toString(monster.getHP()));
            line.add(Float.toString(monster.getDefense()));
            rows.add(line);

        }
        joutAsTable(rows);
    }

    public void displayAttackInfo(ICharacter offender,ICharacter victim,float dmg)
    {
        joutDivider();
        jout(offender.getName()+" attacked the "+victim.getName()+" for "+dmg+" damage!");
        joutDivider();
    }
    public void displayCharactersTurn(ICharacter character)
    {
        jout(character.getName()+", it's your turn!");
    }

    public void displayFightOverMessage() {
        jout("The Battle is over");
    }
}
