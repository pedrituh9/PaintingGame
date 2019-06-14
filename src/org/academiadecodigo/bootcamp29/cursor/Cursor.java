package org.academiadecodigo.bootcamp29.cursor;

import org.academiadecodigo.bootcamp29.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {
    /*


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
        col = (int) (Math.random()*((grid.getCols())));
        row = (int) (Math.random()*((grid.getRows())));
        pointer = new Rectangle(Grid.PADDING+(col*Grid.getCELLSIZE()), Grid.PADDING+(row*Grid.getCELLSIZE()), Grid.getCELLSIZE(), Grid.getCELLSIZE());
        pointer.setColor(Color.PINK);
        pointer.fill();

    }

    public void moveCursor() {

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
