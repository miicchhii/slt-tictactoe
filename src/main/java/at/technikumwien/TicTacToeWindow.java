package at.technikumwien;

import javax.swing.*;

public class TicTacToeWindow extends JFrame {
    public TicTacToeWindow(TicTacToe game) {
        setTitle("TicTacToe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true); // Set the window to always be on top

        TicTacToePanel panel = new TicTacToePanel(game);
        add(panel);
    }


}
