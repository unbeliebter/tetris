package playfield;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

class PlayFieldJframe extends JPanel {
    private static int xAxe = 10;
    private static int yAxe = 40;
    private JTextField[][] fieldGrid = new JTextField[xAxe][yAxe];

    public PlayFieldJframe() {
        JPanel mainPanel = new JPanel(new GridLayout(xAxe, yAxe));
        JPanel[][] panels = new JPanel[xAxe][yAxe];
        for (int i = 0; i < panels.length; i++) {
            for (int j = 0; j < panels[i].length; j++) {
                panels[i][j] = new JPanel();
                mainPanel.add(panels[i][j]);
            }
        }

        for (int row = 0; row < fieldGrid.length; row++) {
            for (int col = 0; col < fieldGrid[row].length; col++) {
                fieldGrid[row][col] = createField(row, col);
                panels[row][col].add(fieldGrid[row][col]);
            }
        }

        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
    }

    private JTextField createField(int row, int col) {
        JTextField field = new JTextField();
        field.setBackground(Color.BLUE);
        field.setHorizontalAlignment(JTextField.CENTER);

        return field;
    }

    private static void createAndShowGui() {
        PlayFieldJframe mainPanel = new PlayFieldJframe();

        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGui();
        });
    }
}
