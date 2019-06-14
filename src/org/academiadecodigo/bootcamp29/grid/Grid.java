package org.academiadecodigo.bootcamp29.grid;

import org.academiadecodigo.bootcamp29.cursor.Cursor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class Grid {

    /*

    criar uma grid c simple gfx

    padding?
    cell size
    cols rows
    desenhar linhas


    definir tamanho do background (linhas traçadas)


    mets:
    init
    gets rows, cols, hweight, width, cell size, x(?), y(?)

    row e col to pixel

    criar cursor
     */

    private int cols;
    private int rows;
    private static final int CELLSIZE = 25;
    public static final int PADDING = 10;

    public Grid (int cols, int rows) {

        this.rows = rows;
        this.cols = cols;
        Cursor cursor = new Cursor(this);

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

    public void paintGrid() {

    }
}
