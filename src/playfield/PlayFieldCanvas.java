package playfield;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class PlayFieldCanvas extends JComponent {

    private static int wide = PlayField.getyMax();
    private static PlayField playField;

    public PlayFieldCanvas(PlayField actualPlayField) {
        Graphics graphics = new Graphics() {
            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color c) {

            }

            @Override
            public void setPaintMode() {

            }

            @Override
            public void setXORMode(Color c1) {

            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(Font font) {

            }

            @Override
            public FontMetrics getFontMetrics(Font f) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {

            }

            @Override
            public void setClip(int x, int y, int width, int height) {

            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(Shape clip) {

            }

            @Override
            public void copyArea(int x, int y, int width, int height, int dx, int dy) {

            }

            @Override
            public void drawLine(int x1, int y1, int x2, int y2) {

            }

            @Override
            public void fillRect(int x, int y, int width, int height) {

            }

            @Override
            public void clearRect(int x, int y, int width, int height) {

            }

            @Override
            public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void drawOval(int x, int y, int width, int height) {

            }

            @Override
            public void fillOval(int x, int y, int width, int height) {

            }

            @Override
            public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawString(String str, int x, int y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, int x, int y) {

            }

            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public void dispose() {

            }
        };
        playField = actualPlayField;
        paint(graphics);
    }

    public PlayFieldCanvas() {
    }

    public static Color CodeToColor() {
        return Color.GRAY;
    }

    public static void drawRects(Graphics graphics, int wide, int height) {
        graphics.fillRect(wide * PlayFieldCanvas.wide + 1, height + PlayFieldCanvas.wide + 1, PlayFieldCanvas.wide - 1, PlayFieldCanvas.wide - 1);
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        for (int i = 0; i <= PlayField.xMax; i++) {
            graphics.drawLine(i * wide, 0, i * wide, PlayField.yMax * wide);
        }
        for (int i = 0; i <= PlayField.yMax; i++) {
            graphics.drawLine(0,i * wide, PlayField.xMax * wide, i * wide);
        }

        for (int i = 0; i < PlayField.xMax; i++) {
            for (int j = 0; j < PlayField.yMax; j++) {
                Color color = CodeToColor();
                graphics.setColor(color);
                drawRects(graphics, i, j);
            }
        }
    }

    public static PlayField getPlayField(PlayField playField) {
        return PlayFieldCanvas.playField;
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