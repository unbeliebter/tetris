package playfield;

public class PlayField extends Object{

    public static int xMax;
    public static int yMax;
    public static int[][] array = new int[xMax + 2][yMax + 2];
    public static int points;

    public PlayField() {
        xMax = 10;
        yMax = 40;

    }

    public static int getyMax() {
        return yMax;
    }
}
