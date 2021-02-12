package playfield;

import java.awt.*;
import javax.swing.*;

class PlayFieldJframe extends JPanel {
    private static int xAxe = 10;
    private static int yAxe = 30;
    private JTextField[][] fieldGrid = new JTextField[yAxe][xAxe];

    public PlayFieldJframe() {
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
    }

    private JTextField createField() {
        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(30, 20));
        field.setEditable(false);

        return field;
    }

    private static void createAndShowGui() {
        PlayFieldJframe mainPanel = new PlayFieldJframe();

        JFrame frame = new JFrame("Tetris");
        frame.setSize(500, 1000);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGui();
        });
    }
}
