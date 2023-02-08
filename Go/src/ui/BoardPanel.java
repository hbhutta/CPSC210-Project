package ui;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {
    private static final int SIZE = 19;
    private StoneButton[][] stoneButtonGrid;

    public BoardPanel() {
        this.stoneButtonGrid = new StoneButton[SIZE][SIZE];
        this.initialize();
        this.initializeStoneButtons();
        this.addStoneButtons();
    }

    private void initialize() {
        this.setSize(new Dimension(1200, 1200));
        this.setBackground(new Color(239, 206, 113));
        this.setLayout(new GridLayout());
        this.setFocusable(false);
        this.setVisible(true);
    }

    private void initializeStoneButtons() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                StoneButton stoneButton = new StoneButton();
                stoneButton.initialize();
                this.stoneButtonGrid[i][j] = stoneButton;
            }
        }
    }

    private void addStoneButtons() {
        for (StoneButton[] stoneButtons : this.stoneButtonGrid) {
            for (StoneButton stoneButton : stoneButtons) {
                this.add(stoneButton);
            }
        }
    }
}
