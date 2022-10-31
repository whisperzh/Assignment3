package com.ood.Views;

import com.ood.Grid.GridCollections;
import com.ood.Grid.GridSpace;

import java.util.Arrays;

public class BoardView extends View{
    private char [][] boardGraphicalGrid;

    private int logicalSizeX;

    private int logicalSizeY;

    public char[][] getBoardGraphicalGrid() {
        return boardGraphicalGrid;
    }

    public void setBoardGraphicalGrid(char[][] boardGraphicalGrid) {
        this.boardGraphicalGrid = boardGraphicalGrid;
    }

    public void setBoardGraphicalGridAt(int x, int y, char tgt) {
        this.boardGraphicalGrid[x][y] = tgt;
    }

    public void initBoardView(int xsize,int ysize){
        logicalSizeX = xsize;
        logicalSizeY = ysize;
        int row=1+ysize*2;
        int col=1+xsize*3;
        boardGraphicalGrid =new char[row][col];
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                boardGraphicalGrid[i][j]=' ';
            }
        }
        for(int r=0;r<row-1;r+=2) {
            for (int i = 0; i < col-1; i += 3) {
                boardGraphicalGrid[r][i] = '+';
                boardGraphicalGrid[r+2][i] = '+';
                boardGraphicalGrid[r][i+3] = '+';
                boardGraphicalGrid[r+2][i+3] = '+';

                boardGraphicalGrid[r+1][i] = '|';
                boardGraphicalGrid[r+1][i+3] = '|';

                boardGraphicalGrid[r][i+1] = '-';
                boardGraphicalGrid[r][i+2] = '-';

                boardGraphicalGrid[r+2][i+1] = '-';
                boardGraphicalGrid[r+2][i+2] = '-';
            }
        }


    }

    public void displayBoard()
    {
        int row=1+logicalSizeY*2;
        int col=1+logicalSizeX*3;
        String horIdx="";
        for (int i=0;i<col;i++)
        {
            horIdx+=" "+i+" ";
        }
        jout(horIdx);
        for(int i=0;i<row;i++)
        {
            String line= Arrays.toString(boardGraphicalGrid[i]);
            jout(line+"\t"+i);
        }
    }

    public void updateGraphicalGridAt(int i,int j, String tgt) {
        int row=2*i+1;
        int col=3*j+1;
        boardGraphicalGrid[row][col]=tgt.charAt(0);
        if(tgt.length()>1)
            boardGraphicalGrid[row][col+1]=tgt.charAt(1);
    }

    public void updateGraphicalGrid(GridCollections gridCollections){
        for(int i=0;i<logicalSizeY;i++)
        {
            for(int j=0;j<logicalSizeX;j++)
            {
                GridSpace gridSpace=gridCollections.getGrid(i,j);
                String icon=gridSpace.getIcon();
                updateGraphicalGridAt(i,j,icon);
            }
        }
    }
}
