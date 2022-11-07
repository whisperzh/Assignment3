package com.ood.Battle;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.Characters.GeneralHero;
import com.ood.Characters.GeneralMonster;
import com.ood.Characters.ICharacter;
import com.ood.Enums.ViewEnum;
import com.ood.Factories.ViewFactory;
import com.ood.Judge.LMH_Judge;
import com.ood.Players.IPlayer;
import com.ood.Players.LMH_Player;
import com.ood.Team.ITeam;
import com.ood.Team.LMH_Team;
import com.ood.Team.TeamCollection;
import com.ood.Views.LMH_BattleView;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.Stack;

public class LMH_Battle implements IBattle{

    private TeamCollection teamCollection;

    private List<GeneralHero> heros;

    private List<GeneralMonster> monsters;

    private LMH_Judge judge;

    private LMH_BattleView view;

    private LMH_Team monsterTeam;

    private Stack<NavigableMap<String ,String >> battleStack;

    public LMH_Battle(TeamCollection teamCollection) {
        this.teamCollection = teamCollection;
        judge=new LMH_Judge();
        monsterTeam=new LMH_Team("MONSTER_TEAM",teamCollection.getTeamAt(0).getPlayerSize(),true,teamCollection.getTeamAt(0).getGame());//Computer Player
        monsterTeam.playerChooseHero();
        view= ViewFactory.createView(ViewEnum.BATTLEFIELD);
        initPlayerCollection();
    }

    private void initPlayerCollection(){
        heros=new ArrayList<>();
        monsters=new ArrayList<>();

        for (int i = 0; i < teamCollection.getTeamList().size(); i++) {
            ITeam team=teamCollection.getTeamAt(i);
            for (int j=0;j<team.getPlayerSize();j++)
            {
                heros.add((GeneralHero) team.getPlayerAt(j).getMyCharacter());
            }
        }
        for(int j=0;j<monsterTeam.getPlayerSize();j++)
        {
            monsters.add((GeneralMonster) monsterTeam.getPlayerAt(j).getMyCharacter());
        }

    }


    public TeamCollection getTeamCollection() {
        return teamCollection;
    }

    public void setTeamCollection(TeamCollection teamCollection) {
        this.teamCollection = teamCollection;
    }

    @Override
    public void fight() {
        view.displayFight();
        int hindex=0;
        int mindex=0;
        while(!judge.battleOver(heros,monsters))
        {
            GeneralHero h=heros.get(hindex);
            while (!h.isAlive())
            {
                hindex++;
                hindex%=heros.size();
                h= heros.get(hindex);
            }

            view.displayCharactersTurn(h);
            chooseActionAndDo(h);
            if(judge.battleOver(heros,monsters))
                break;
            GeneralMonster m=monsters.get(hindex);
            while (!m.isAlive())
            {
                mindex++;
                mindex%=monsters.size();
                m= monsters.get(mindex);
            }
            attackRandomLivingHero(m);

        }
        view.displayFightOverMessage();
    }

    private void chooseActionAndDo(GeneralHero hero){
        //get player's choice.
        char action=view.collectPlayersAction(LMH_Constant.VALID_ACTIONS_INBATTLE, LMH_Constant.ACTION_HELP_INBATTLE);
        switch (action)
        {
            case 'A'|'a':
                view.displayAttackMonsterChoices(monsterTeam);//display choice
                int num=view.jin_BorderedInt(0,monsterTeam.getPlayerSize()-1);
                GeneralMonster tobeAttacked= monsters.get(num);
                float dmg=hero.physicalAttack(tobeAttacked);
                view.displayAttackInfo(hero, tobeAttacked, dmg);
                break;
            case 'I'|'i':
                if(hero.getInventory().getSize()!=0){
                    view.displayHeroInventory(hero);
                    int input=view.jin_Int("Please input a num to equip/use");
                    hero.use(input);
                }else
                {
                    view.displayEmptyInventoryMessage();
                    chooseActionAndDo(hero);
                }
                break;
            case 'V'|'v':           //view statistics
                break;
            case 'Q'|'q':
                view.displayGoodByeMessage();
                System.exit(0);
                break;
        }
        //execute player's choice

    }

    private void attackRandomLivingHero(GeneralMonster monster){

        for(int i=0;i<heros.size();i++)
        {
            ICharacter hero=heros.get(i);
            if(hero.isAlive())
            {
                float dmg=monster.physicalAttack(hero);
                view.displayAttackInfo(monster,hero,dmg);
                return;
            }
        }
    }

}
