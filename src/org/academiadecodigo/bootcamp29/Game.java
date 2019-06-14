package org.academiadecodigo.bootcamp29;

import org.academiadecodigo.bootcamp29.cursor.Cursor;
import org.academiadecodigo.bootcamp29.grid.Grid;
import org.academiadecodigo.bootcamp29.keyboard.GameKeyboard;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

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
        /*try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //esperar keyboard

        KeyboardHandler handler = new GameKeyboard(cursor, grid);
        Keyboard keyboard = new Keyboard(handler);
        keyAdder(keyboard, KeyboardEvent.KEY_LEFT);
        keyAdder(keyboard, KeyboardEvent.KEY_UP);
        keyAdder(keyboard, KeyboardEvent.KEY_DOWN);
        keyAdder(keyboard, KeyboardEvent.KEY_RIGHT);
        keyAdder(keyboard, KeyboardEvent.KEY_SPACE);
        keyAdder(keyboard, KeyboardEvent.KEY_S);
        keyAdder(keyboard, KeyboardEvent.KEY_C);
        keyAdder(keyboard, KeyboardEvent.KEY_L);


    }

    private static void keyAdder (Keyboard key, int keyboardEvent ) {
        KeyboardEvent keyEv = new KeyboardEvent();
        keyEv.setKey(keyboardEvent);
        keyEv.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        key.addEventListener(keyEv);

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
