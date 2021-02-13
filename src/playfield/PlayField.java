package playfield;

import tetrominos.Tetromino;

public class PlayField extends Object {

    public static int xMax;
    public static int yMax;
    public static int points;
    public int counter;
    Tetromino crtTetromino;
    int rngshape;

    public PlayField() {
        array = new int[30][10];
        counter = 1;
    }

    public static int[][] array = new int[yMax + 2][xMax + 2];

    public static int getyMax() {
        return yMax;
    }

    public static void deleterow(int y) {

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = 0;
            }
        }
    }
    public void putdown() {
        rngshape = (int)(Math.random()*6+1);
        newTetromino(rngshape);
    }
    public void move(int x,int y){
        crtTetromino.move(x,y);
    }

    public void newTetromino(int shape) {
        Tetromino add = new Tetromino(shape);
        array[add.getY1()][add.getX1()] = counter;
        array[add.getY2()][add.getX2()] = counter;
        array[add.getY3()][add.getX3()] = counter;
        array[add.getY4()][add.getX4()] = counter;
        counter++;
        crtTetromino = add;
    }
}

