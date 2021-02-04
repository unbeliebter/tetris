import javax.swing.*;

public class Tetris {
    public static void main(String[] args) {
        Tetromino test = new Tetromino(1);

        JFrame frame = new JFrame("Tetris");
        frame.setSize(600, 800);
        frame.setTitle("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setVisible(true);
    }
}
