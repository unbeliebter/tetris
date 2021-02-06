package playfield;

import tetrominos.Tetromino;

public class PlayField extends PlayFieldCanvas {

    public static int xMax;
    public static int yMax;
    public int[][] array;
    public int points;
    public Tetromino liveTetromino;

    public PlayField() {
        xMax = 10;
        yMax = 40;
        array = new int[xMax + 2][yMax + 2];
    }
}
