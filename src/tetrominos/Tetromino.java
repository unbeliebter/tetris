package tetrominos;

public class Tetromino {

    static int x1;
    static int y1;
    static int x2;
    static int y2;
    static int x3;
    static int y3;
    static int x4;
    static int y4;

    public Tetromino(int n) {
        switch (n) {
//L-Shape
            case (1) -> {
                x1 = 0;
                y1 = 38;
                x2 = 0;
                y2 = 39;
                x3 = 1;
                y3 = 39;
                x4 = 2;
                y4 = 39;
            }
//L-Mirrored_Shape
            case (2) -> {
                x1 = 0;
                y1 = 39;
                x2 = 0;
                y2 = 38;
                x3 = 1;
                y3 = 38;
                x4 = 2;
                y4 = 38;
            }
//S-Shape
            case (3) -> {
                x1 = 0;
                y1 = 38;
                x2 = 1;
                y2 = 38;
                x3 = 1;
                y3 = 39;
                x4 = 2;
                y4 = 39;
            }
//S-Mirrored-Shape
            case (4) -> {
                x1 = 0;
                y1 = 39;
                x2 = 1;
                y2 = 39;
                x3 = 1;
                y3 = 38;
                x4 = 2;
                y4 = 38;
            }
//T-Shape
            case (5) -> {
                x1 = 0;
                y1 = 39;
                x2 = 1;
                y2 = 39;
                x3 = 1;
                y3 = 38;
                x4 = 2;
                y4 = 39;
            }
//Square-Shape
            case (6) -> {
                x1 = 0;
                y1 = 39;
                x2 = 1;
                y2 = 39;
                x3 = 0;
                y3 = 38;
                x4 = 1;
                y4 = 38;
            }
//Line-Shape
            case (7) -> {
                x1 = 0;
                y1 = 39;
                x2 = 1;
                y2 = 39;
                x3 = 2;
                y3 = 39;
                x4 = 3;
                y4 = 39;
            }
        }

    }
}
