package com.ood.Game;

import com.ood.Board.IBoard;
import com.ood.Judge.IGameJudge;
import com.ood.Players.IPlayer;
import com.ood.Team.TeamCollection;
import com.ood.Views.AbsGameView;

/**
 * abstract  board game class
 */
public abstract class BoardGame implements IGame{
    private int playerNums;

    private int teamNums;

    private IBoard board;

    private TeamCollection teamCollection;

    private IGameJudge judge;

    private AbsGameView view;

    public BoardGame() {
        initTeams();
    }

    public TeamCollection getTeamCollection() {
        return teamCollection;
    }

    @Override
    public void setBoard(IBoard board) {
        this.board=board;
    }

    @Override
    public void initTeams() {
        teamCollection=new TeamCollection<>();
    }

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

    public void setTeamNums(int teamNums) {
        this.teamNums = teamNums;
    }

    public void setPlayerNums(int playerNums) {
        this.playerNums = playerNums;
    }
}
