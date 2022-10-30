package com.ood.Game;

import com.ood.Board.IBoard;
import com.ood.Judge.IGameJudge;
import com.ood.Players.IPlayer;
import com.ood.Team.TeamCollection;
import com.ood.Views.AbsGameView;

/**
 * abstract  board game class
 */
public abstract class BoardGame<TP extends IPlayer> implements IGame{
    private int playerNums;

    private int teamNums;

    private IBoard board;

    private TeamCollection<TP> teamCollection;

    private IGameJudge judge;

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
