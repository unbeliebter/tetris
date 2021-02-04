public class PlayFieldCanvas {

    private static int wide;
    private static PlayField playField;

    public PlayFieldCanvas() {

    }

    //setter & getter

    public static PlayField getPlayField() {
        return playField;
    }

    public static void setPlayField(PlayField playField) {
        PlayFieldCanvas.playField = playField;
    }

    public static int getWide() {
        return wide;
    }

    public static void setWide(int wide) {
        PlayFieldCanvas.wide = wide;
    }
}
