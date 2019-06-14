package org.academiadecodigo.bootcamp29;

import org.academiadecodigo.bootcamp29.cursor.Cursor;
import org.academiadecodigo.bootcamp29.grid.Grid;

public class Game {

    private Grid grid;
    private int delay;
    private Cursor cursor;

    public Game (int cols, int rows) {


        grid = new Grid(cols,rows);
        cursor = new Cursor(grid);
        delay = 200;

    }

    public void start () {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //esperar keyboard
    }

    public void init () {

        grid.init();

    }

    private void moveCursor () {

    }

    private void paintGridSquare (int row, int col) {

       grid.paintGrid(col, row);

    }
}
