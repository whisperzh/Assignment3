package com.ood.Game;

import com.ood.Board.IBoard;
import com.ood.Judge.IGameJudge;
import com.ood.Players.IPlayer;
import com.ood.Team.ITeam;
import com.ood.Team.LMH_Team;
import com.ood.Team.TeamCollection;
import com.ood.Views.AbsGameView;

/**
 * abstract  board game class
 */
public abstract class BoardGame<T extends ITeam> implements IGame{
    private int playerNums;

    private int teamNums;

    private IBoard board;

    protected TeamCollection<T> teamCollection;

    protected static IGameJudge judge;

    private AbsGameView view;

    public BoardGame() {
        initTeamCollection();
    }

    public TeamCollection<T> getTeamCollection() {
        return teamCollection;
    }

    @Override
    public void setBoard(IBoard board) {
        this.board=board;
    }

    @Override
    public abstract void initTeamCollection();
//    {
//        teamCollection=new TeamCollection<>();
//    }

    @Override
    public void setView(AbsGameView view) {
        this.view=view;
    }


    @Override
    public AbsGameView getView() {
        return view;
    }

    public IGameJudge getJudge() {
        return judge;
    }

    public void setJudge(IGameJudge judge) {
        this.judge = judge;
    }

    @Override
    public IBoard getBoard() {
        return board;
    }

    public int getPlayerNums() {
        return playerNums;
    }

    public int getTeamNums() {
        return teamNums;
    }

    public void setTeamCollection(TeamCollection<T> teamCollection) {
        this.teamCollection = teamCollection;
    }

    public void setTeamNums(int teamNums) {
        this.teamNums = teamNums;
    }

    public void setPlayerNums(int playerNums) {
        this.playerNums = playerNums;
    }
}
