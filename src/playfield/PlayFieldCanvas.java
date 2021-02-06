package playfield;

import java.awt.*;

public class PlayFieldCanvas {

    private static int wide;
    private static PlayField playField;

    public PlayFieldCanvas(PlayField actualPlayField) {
        playField = actualPlayField;
    }

    public PlayFieldCanvas() {
    }

    public static Color CodeToColor() {
        return Color.BLACK;
    }

    public static void drawRects(Graphics graphics, int wide, int height) {
        graphics.fillRect(wide * PlayFieldCanvas.wide + 1, height + PlayFieldCanvas.wide + 1, PlayFieldCanvas.wide - 1, PlayFieldCanvas.wide - 1);
    }

    public static void paint(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        for (int i = 0; i <= PlayField.xMax; i++) {
            graphics.drawLine(i * wide, 0, i * wide, PlayField.yMax * wide);
        }
        for (int i = 0; i <= PlayField.yMax; i++) {
            graphics.drawLine(i * wide, 0, PlayField.xMax * wide, i* wide);
        }

        for (int i = 0; i < PlayField.xMax; i++) {
            for (int j = 0; j < PlayField.yMax; j++) {
                Color color = CodeToColor();
                graphics.setColor(color);
                drawRects(graphics, i, j);
            }
        }
    }

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
