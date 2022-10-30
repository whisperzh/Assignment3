package com.ood.Board;

import com.ood.Views.LMH_BoardView;
import com.ood.Views.View;

/**
 * concrete board for Legends: Monsters and Heroes game
 */
public class LMH_board extends MovableBoard{

    private LMH_BoardView view;

    public LMH_board() {
        view=new LMH_BoardView();
    }

    public LMH_BoardView getView() {
        return view;
    }

    public void setView(LMH_BoardView view) {
        this.view = view;
    }


}
