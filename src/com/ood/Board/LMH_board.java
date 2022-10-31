package com.ood.Board;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.Characters.GeneralMonster;
import com.ood.Enums.MonsterEnum;
import com.ood.Factories.MonsterFactory;
import com.ood.Grid.GridSpace;
import com.ood.Views.LMH_BoardView;

import java.util.Random;

/**
 * concrete board for Legends: Monsters and Heroes game
 */
public class LMH_board extends MovableBoard{

    private LMH_BoardView view;

    private int monsterCount=1;

    public LMH_board() {
        view=new LMH_BoardView();
        generateObstacles();
        generateMarkets();
//        setMonsterCount(view.jin_BorderedInt(LMH_Constant.MONSTER_COUNT_LOWER_BOUND, LMH_Constant.MONSTER_COUNT_UPPER_BOUND));
    }

    public LMH_BoardView getView() {
        return view;
    }

    public void setView(LMH_BoardView view) {
        this.view = view;
    }

    public void generateObstacles(){
        for(int i = 0; i< LMH_Constant.OBSTACLE_LIST.size(); i++)
        {
            GridSpace gridSpace = getGridCollections().getGrid(LMH_Constant.OBSTACLE_LIST.get(i));
            gridSpace.setObstacle();
        }

    }

    public void generateMarkets(){
        for(int i = 0; i< LMH_Constant.MARKET_LIST.size(); i++)
        {
            GridSpace gridSpace = getGridCollections().getGrid(LMH_Constant.MARKET_LIST.get(i));
            gridSpace.setMarket();
        }
    }

    public int getMonsterCount() {
        return monsterCount;
    }

    public void setMonsterCount(int monsterCount) {
        this.monsterCount = monsterCount;
    }

    public void generateMonster(){
        Random random=new Random();
        for(int i=0;i<monsterCount;i++)
        {
            int col = random.nextInt(getGridCollections().getCol()-2+1)+2;
            for(int j=0;j<getGridCollections().getRow();j++)
            {
                if(getGridCollections().getGrid(col,j).getMarket()==null&&
                        getGridCollections().getGrid(col,j).getCharacter()==null&&
                        getGridCollections().getGrid(col,j).isCanPass())
                {
                    MonsterEnum me=MonsterEnum.getRandomMonsterType();
                    GeneralMonster monster= MonsterFactory.spawnPlayer(me,me.toString());
                }
            }
        }
    }

    @Override
    public void show() {
        getView().displayBoard();
    }
}
