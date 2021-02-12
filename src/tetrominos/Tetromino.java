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
    static int shape;


    public Tetromino(int n) {
        switch (n) {
//L-Shape
            case (0) -> {
                x1 = 0;
                y1 = 28;
                x2 = 0;
                y2 = 29;
                x3 = 1;
                y3 = 28;
                x4 = 2;
                y4 = 28;
                shape = n;

            }
//L-Mirrored_Shape
            case (1) -> {
                x1 = 0;
                y1 = 29;
                x2 = 0;
                y2 = 28;
                x3 = 1;
                y3 = 28;
                x4 = 2;
                y4 = 28;
                shape = n;

            }
//S-Shape
            case (2) -> {
                x1 = 0;
                y1 = 28;
                x2 = 1;
                y2 = 28;
                x3 = 1;
                y3 = 29;
                x4 = 2;
                y4 = 292;
                shape = n;

            }
//S-Mirrored-Shape
            case (3) -> {
                x1 = 0;
                y1 = 29;
                x2 = 1;
                y2 = 29;
                x3 = 1;
                y3 = 28;
                x4 = 2;
                y4 = 28;
                shape = n;

            }
//T-Shape
            case (4) -> {
                x1 = 0;
                y1 = 29;
                x2 = 1;
                y2 = 29;
                x3 = 1;
                y3 = 28;
                x4 = 2;
                y4 = 29;
                shape = n;

            }
//Square-Shape
            case (5) -> {
                x1 = 0;
                y1 = 29;
                x2 = 1;
                y2 = 29;
                x3 = 0;
                y3 = 28;
                x4 = 1;
                y4 = 28;
                shape = n;

            }
//Line-Shape
            case (6) -> {
                x1 = 0;
                y1 = 29;
                x2 = 1;
                y2 = 29;
                x3 = 2;
                y3 = 29;
                x4 = 3;
                y4 = 29;
                shape = n;

            }
        }

    }

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getX4() {
        return x4;
    }

    public static int getY1() {
        return y1;
    }

    public static int getY2() {
        return y2;
    }

    public static int getY3() {
        return y3;
    }

    public static int getY4() {
        return y4;
    }

    public static void setX1(int x1) {
        Tetromino.x1 = x1;
    }

    public static void setX2(int x2) {
        Tetromino.x2 = x2;
    }

    public static void setX3(int x3) {
        Tetromino.x3 = x3;
    }

    public static void setX4(int x4) {
        Tetromino.x4 = x4;
    }

    public static void setY1(int y1) {
        Tetromino.y1 = y1;
    }

    public static void setY2(int y2) {
        Tetromino.y2 = y2;
    }

    public static void setY3(int y3) {
        Tetromino.y3 = y3;
    }

    public static void setY4(int y4) {
        Tetromino.y4 = y4;
    }

    //move tetrominos around the grid
    public static void move(int x, int y) {
        if (x1 + x <= 9 && x1 + x >= 0 && y1 + y <= 39 && y1 + x >= 0
                && x2 + x <= 9 && x2 + x >= 0 && y2 + y <= 39 && y2 + x >= 0
                && x3 + x <= 9 && x3 + x >= 0 && y3 + y <= 39 && y3 + x >= 0
                && x4 + x <= 9 && x4 + x >= 0 && y4 + y <= 39 && y4 + x >= 0) {

            x1 += x;
            x2 += x;
            x3 += x;
            x4 += x;
            y1 += y;
            y2 += y;
            y3 += y;
            y4 += y;
        } else {
            System.out.println("Can't move out of board");
        }
    }

    public static int rotatexcoords(int n) {
        return x1 + n - y1;
    }

    public static int rotateycoords(int n) {
        return y1 - n + x1;
    }

    public static void rotate() {
        if (shape == 5) {
            return;
        }
        int x,y;
        x = rotatexcoords(y2);
        y = rotateycoords(x2);
        x2 = x;
        y2 = y;
        x = rotatexcoords(y1);
        y = rotateycoords(x1);
        x1 = x;
        y1 = y;
        x = rotatexcoords(y3);
        y = rotateycoords(x3);
        x3 = x;
        y3 = y;
        x = rotatexcoords(y4);
        y = rotateycoords(x4);
        x4 = x;
        y4 = y;
    }
}


