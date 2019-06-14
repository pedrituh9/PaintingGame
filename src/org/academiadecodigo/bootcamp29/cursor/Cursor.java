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

    public void moveCursor(int cols, int rows) {

        /*if (!isInLimit()) {

            pointer.translate(cols * Grid.getCELLSIZE(), rows * Grid.getCELLSIZE());
            col += cols;
            row += rows;
        }*/

        if (cols + col < 0 || cols + col > grid.getCols()-1) {
            return;
        }

        if (rows + row < 0 || rows + row > grid.getRows()-1) {
            return;
        }

        pointer.translate(cols * Grid.getCELLSIZE(), rows * Grid.getCELLSIZE());
        col += cols;
        row += rows;


    }


    /*private boolean isInLimit () {
        //boolean inLimit;

        if (col == 0 || col == grid.getCols()-1) {
            return true;
        }

        if (row == 0 || row == grid.getRows()-1) {
            return true;
        }

        return false;
    }*/



    public int getCol() {
        return col;
    }


    public int getRow() {
        return row;
    }


    //public Rectangle getPointer() {
        //return pointer;
    //}
}
