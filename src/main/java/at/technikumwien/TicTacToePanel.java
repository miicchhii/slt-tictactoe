package at.technikumwien;

import javax.swing.*;
import java.awt.*;

public class TicTacToePanel extends JPanel {
    private TicTacToe game;
    private Board board=null;

    public TicTacToePanel(TicTacToe game) {
        this.game = game;
        this.board = game.getBoard(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the board
        int cellSize = Math.min(getWidth(), getHeight()) / 3;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int x = col * cellSize;
                int y = row * cellSize;
                g2d.drawRect(x, y, cellSize, cellSize);
            }
        }

        // Draw the markers
        Board board = game.getBoard(this);
        char[][] cells = board.getCells();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int x = col * cellSize + cellSize / 2;
                int y = row * cellSize + cellSize / 2;
                char marker = cells[row][col];
                if (marker != ' ') {
                    g2d.setFont(new Font("Arial", Font.BOLD, cellSize / 2));
                    g2d.drawString(String.valueOf(marker), x - cellSize / 4, y + cellSize / 4);
                }
            }
        }
    }
}
