package playfield;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

class PlayFieldJframe extends JPanel {
    private static int CLUSTER = 3;
    private static int MAX_ROWS = 9;
    private static float FIELD_PTS = 32f;
    private static int GAP = 3;
    private static Color BG = Color.BLACK;
    private static Color SOLVED_BG = Color.LIGHT_GRAY;
    public static int TIMER_DELAY = 2 * 1000;
    private JTextField[][] fieldGrid = new JTextField[MAX_ROWS][MAX_ROWS];

    public PlayFieldJframe() {
        JPanel mainPanel = new JPanel(new GridLayout(CLUSTER, CLUSTER));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
        mainPanel.setBackground(BG);
        JPanel[][] panels = new JPanel[CLUSTER][CLUSTER];
        for (int i = 0; i < panels.length; i++) {
            for (int j = 0; j < panels[i].length; j++) {
                panels[i][j] = new JPanel(new GridLayout(CLUSTER, CLUSTER, 1, 1));
                panels[i][j].setBackground(BG);
                panels[i][j].setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
                mainPanel.add(panels[i][j]);
            }
        }

        for (int row = 0; row < fieldGrid.length; row++) {
            for (int col = 0; col < fieldGrid[row].length; col++) {
                fieldGrid[row][col] = createField(row, col);
                int i = row / 3;
                int j = col / 3;
                panels[i][j].add(fieldGrid[row][col]);
            }
        }

        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
    }

    private JTextField createField(int row, int col) {
        JTextField field = new JTextField(2);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setFont(field.getFont().deriveFont(Font.BOLD, FIELD_PTS));

        return field;
    }

    private static void createAndShowGui() {
        PlayFieldJframe mainPanel = new PlayFieldJframe();

        JFrame frame = new JFrame("SudokuMCVE");
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
