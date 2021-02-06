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

        frame.add(panel);
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
