package org.academiadecodigo.bootcamp29.grid;

import org.academiadecodigo.bootcamp29.cursor.Cursor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class Grid {


    private int cols;
    private int rows;
    private static final int CELLSIZE = 25;
    public static final int PADDING = 10;

    public Grid (int cols, int rows) {

        this.rows = rows;
        this.cols = cols;

    }

    public void init () {
        for (int i = 0; i<rows; i++) {

            int line = i;

            for (int j = 0; j<cols; j++){

                int collumn = j;
                Rectangle square = new Rectangle(PADDING+collumn*CELLSIZE, PADDING+line*CELLSIZE, CELLSIZE, CELLSIZE);
                square.setColor(Color.BLACK);
                square.draw();

            }
        }
    }

    public static int getCELLSIZE() {
        return CELLSIZE;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public void paintGrid(int col, int row) {

        Rectangle paintedSquare = new Rectangle(col*CELLSIZE+PADDING, row*CELLSIZE+PADDING, CELLSIZE, CELLSIZE);
        paintedSquare.setColor(Color.BLACK);
        paintedSquare.fill();

    }

    public void clearGrid () {
        for (int i = 0; i<rows; i++) {

            int line = i;

            for (int j = 0; j<cols; j++){

                int collumn = j;
                Rectangle square = new Rectangle(PADDING+collumn*CELLSIZE, PADDING+line*CELLSIZE, CELLSIZE, CELLSIZE);
                square.setColor(Color.WHITE);
                square.fill();

            }
        }

        for (int i = 0; i<rows; i++) {

            int line = i;

            for (int j = 0; j<cols; j++){

                int collumn = j;
                Rectangle square = new Rectangle(PADDING+collumn*CELLSIZE, PADDING+line*CELLSIZE, CELLSIZE, CELLSIZE);
                square.setColor(Color.BLACK);
                square.draw();

            }
        }
    }
}
