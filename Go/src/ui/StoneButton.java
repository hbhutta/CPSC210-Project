package ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class StoneButton extends JButton {
    private static final int BUTTON_WIDTH = 50;
    private static final int BUTTON_HEIGHT = 50;
    private static final int BORDER_LINE_THICKNESS = 1;

    public StoneButton() {
        this.initialize();
    }

    public void initialize() {
        this.setSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        this.setBorder(new LineBorder(Color.BLACK, BORDER_LINE_THICKNESS));
        this.setOpaque(true);
        this.setFocusPainted(false);
        this.setVisible(true);
    }
}
