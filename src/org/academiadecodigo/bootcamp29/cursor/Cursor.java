package org.academiadecodigo.bootcamp29.cursor;

import org.academiadecodigo.bootcamp29.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {
    /*

    vai ter uma grid
    vai ser um rectangle

    mets:
    mover
    confirmar se esta no limite


     */

    private Grid grid;
    private Rectangle pointer;
    private  int col;
    private int row;


    public Cursor (Grid grid) {

        this.grid = grid;
        col = (int) (Math.random()*((grid.getCols()+1)));
        row = (int) (Math.random()*((grid.getRows()+1)));
        pointer = new Rectangle(Grid.PADDING+col, Grid.PADDING+row, Grid.getCELLSIZE(), Grid.getCELLSIZE());

    }

    public void moveCursor() {

    }



}
