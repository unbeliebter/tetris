import playfield.PlayField;
import playfield.PlayFieldCanvas;
import tetrominos.Tetromino;

import javax.swing.*;

public class Tetris {

    public Tetris() {
        JFrame frame = new JFrame("Tetris");
        frame.setSize(600, 800);
        frame.setTitle("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        JButton buttonEnd = new JButton("End Game");
        panel.add(buttonEnd);

        PlayField playField = new PlayField();

        frame.add(new PlayFieldCanvas(playField));
        System.out.println("TEST3");
        //frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Tetromino test = new Tetromino(1);
        Tetris tetris = new Tetris();
        test.move(5, -2);
    }
}
