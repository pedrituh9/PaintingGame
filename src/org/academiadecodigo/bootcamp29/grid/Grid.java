package org.academiadecodigo.bootcamp29.grid;

import org.academiadecodigo.bootcamp29.cursor.Cursor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;
import java.io.*;

public class Grid {


    private int cols;
    private int rows;
    private static final int CELLSIZE = 25;
    public static final int PADDING = 10;
    private int [][] isPainted;

    public Grid (int cols, int rows) {

        this.rows = rows;
        this.cols = cols;
        isPainted = new int [cols][rows];

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

        if (isPainted[col][row] == 1) {
            Rectangle paintedSquare = new Rectangle(col*CELLSIZE+PADDING, row*CELLSIZE+PADDING, CELLSIZE, CELLSIZE);
            paintedSquare.setColor(Color.WHITE);
            paintedSquare.fill();
            isPainted[col][row] = 0;
        }

        isPainted[col][row] = 1;
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
                isPainted[i][j] = 0;

            }
        }


    }

    public void saveGrid () throws IOException {


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("resources/save");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i =0; i < isPainted.length; i++) {
            for (int j= 0; j < isPainted[i].length; j++) {
                try {
                    bufferedWriter.write(isPainted[i][j]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedWriter.close();

    }


    public void loadGrid () {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("resources/save");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);


    }
}
