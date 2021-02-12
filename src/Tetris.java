import playfield.PlayField;
import playfield.PlayFieldJframe;
import tetrominos.Tetromino;

import javax.swing.*;

public class Tetris {

    public Tetris() {

    }
    public static void main(String[] args) {
        Tetromino test = new Tetromino(0);
        Tetris tetris = new Tetris();
        test.rotate();
        System.out.println(test.getX1()+"/"+test.getY1());
        System.out.println(test.getX2()+"/"+test.getY2());
        System.out.println(test.getX3()+"/"+test.getY3());
        System.out.println(test.getX4()+"/"+test.getY4());

        SwingUtilities.invokeLater(() -> {
            PlayFieldJframe.createPlayFieldJFrame();
        });
    }


}