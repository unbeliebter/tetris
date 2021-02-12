import playfield.PlayField;
import playfield.PlayFieldCanvas;
import tetrominos.Tetromino;

import javax.swing.*;
import java.awt.*;

public class Tetris {

    public Tetris() {

    }

    public static void main(String[] args) {
        Tetromino test = new Tetromino(0);
        Tetris tetris = new Tetris();
        test.rotate();
        System.out.println(test.getX1() + "/" + test.getY1());
        System.out.println(test.getX2() + "/" + test.getY2());
        System.out.println(test.getX3() + "/" + test.getY3());
        System.out.println(test.getX4() + "/" + test.getY4());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PlayField playField = new PlayField();
        System.out.println("TEST");
        frame.add(new PlayFieldCanvas(playField));
        frame.setSize(900, 800);
        System.out.println("TEST2");
        frame.setVisible(true);
        playField.newTetromino(1);
        playField.deleterow(1);


    }
}
