package playfield;

import tetrominos.Tetromino;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PlayFieldJFrame extends JPanel {
    private static int xAxe = 10;
    private static int yAxe = 30;
    private JTextField[][] fieldGrid = new JTextField[yAxe][xAxe];

    public PlayFieldJFrame(JFrame frame) {
        JPanel mainPanel = new JPanel(new GridLayout(yAxe, xAxe));
        JPanel[][] panels = new JPanel[yAxe][xAxe];
        for (int i = 0; i < panels.length; i++) {
            for (int j = 0; j < panels[i].length; j++) {
                panels[i][j] = new JPanel();
                mainPanel.add(panels[i][j]);
            }
        }

        for (int row = 0; row < fieldGrid.length; row++) {
            for (int col = 0; col < fieldGrid[row].length; col++) {
                fieldGrid[row][col] = createField();
                panels[row][col].add(fieldGrid[row][col]);
            }
        }
        add(mainPanel);

        //LABEL MUSS NOCH DYNAMISCHE PUNKTE ERHALTEN
        JLabel pointsLabel = new JLabel("PUNKTE");
        JButton stopGameButton = new JButton("Stop");
        JButton closeGameButton = new JButton("Close Game");

        add(pointsLabel);
        add(stopGameButton);
        add(closeGameButton);

        closeGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    private JTextField createField() {
        JTextField field = new JTextField();
       // field.setBackground(Color.RED);
        field.setPreferredSize(new Dimension(30, 20));
        field.setEditable(false);

        return field;
    }

    //MAYBE WORKS BUT DON'T COLOR A FIELD AT ONCE
    public static void colorField(JTextField field, Tetromino tetromino, JTextField fieldGrid, JPanel panel) {

        Color color = Color.WHITE;
        int colorCode = Tetromino.colorCode;

        switch (colorCode) {
            case (0) -> {
                color = Color.RED;
            }

            case (1) -> {
                color = Color.PINK;
            }

            case (2) -> {
                color = Color.CYAN;
            }

            case (3) -> {
                color = Color.ORANGE;
            }

            case (4) -> {
                color = Color.MAGENTA;
            }

            case (5) -> {
                color = Color.GREEN;
            }

            case (6) -> {
                color = Color.blue;
            }
        }

        field.setBackground(color);
    }

    public static void createPlayFieldJFrame() {
        JFrame frame = new JFrame("Tetris");
        PlayFieldJFrame mainPanel = new PlayFieldJFrame(frame);
        frame.setSize(450, 1000);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);

        frame.setVisible(true);

    }
}