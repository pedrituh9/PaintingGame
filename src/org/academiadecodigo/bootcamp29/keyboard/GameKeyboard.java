package org.academiadecodigo.bootcamp29.keyboard;

import org.academiadecodigo.bootcamp29.cursor.Cursor;
import org.academiadecodigo.bootcamp29.grid.Grid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class GameKeyboard implements KeyboardHandler {

    private Cursor cursor;
    private Grid grid;

    public GameKeyboard (Cursor cursor, Grid grid) {

        this.cursor = cursor;
        this.grid = grid;

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int key = keyboardEvent.getKey();

        switch (key) {
            case KeyboardEvent.KEY_RIGHT:
                cursor.moveCursor(1, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveCursor(-1, 0);
                break;
            case KeyboardEvent.KEY_UP:
                cursor.moveCursor(0, -1);
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveCursor(0, 1);
                break;
            case KeyboardEvent.KEY_SPACE:
                grid.paintGrid(cursor.getCol(), cursor.getRow());
                break;
            case KeyboardEvent.KEY_C:
                grid.clearGrid();
                break;
            case  KeyboardEvent.KEY_L:
                // load grid;
                break;
            case KeyboardEvent.KEY_S:
                // save grid;
                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
