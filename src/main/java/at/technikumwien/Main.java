package at.technikumwien;


public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        TicTacToeWindow window = new TicTacToeWindow(game);
        window.setVisible(true);
        game.start();
        window.dispose();
    }
}

