package ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 1200;

    private BoardPanel boardPanel;

    public MainFrame() {
        this.setTitle("Go");
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.boardPanel = new BoardPanel();
        this.add(boardPanel);

        this.setVisible(true);
    }
}
