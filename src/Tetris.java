import playfield.PlayField;
import playfield.PlayFieldCanvas;
import tetrominos.Tetromino;

import javax.swing.*;
import java.awt.*;

public class Tetris {

    public Tetris() {
        JFrame frame = new JFrame("Tetris");
        frame.setSize(800, 1000);
        frame.setTitle("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        PlayField playField = new PlayField();
        Component add = frame.add(new PlayFieldCanvas(playField));
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Tetromino test = new Tetromino(0);
        Tetris tetris = new Tetris();
        test.rotate();
        System.out.println(test.getX1()+"/"+test.getY1());
        System.out.println(test.getX2()+"/"+test.getY2());
        System.out.println(test.getX3()+"/"+test.getY3());
        System.out.println(test.getX4()+"/"+test.getY4());

    }


}
