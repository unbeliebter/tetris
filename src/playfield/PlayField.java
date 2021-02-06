package playfield;

public class PlayField extends PlayFieldCanvas {

    public static int xMax = 10;
    public static int yMax = 40;
    public static int[][] array = new int[xMax + 2][yMax + 2];
    public static int points;

    public PlayField() {
        super();
    }
}
