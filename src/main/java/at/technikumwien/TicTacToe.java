package at.technikumwien;

import java.util.Scanner;

public class TicTacToe {
    Player player1;
    Player player2;

    Player currentPlayer;
    Board board;

    boolean gameover = false;
    boolean quit = false;

    TicTacToe() {
        this.player1 = new Player('X');
        this.player2 = new Player('O');
        this.currentPlayer = player1;
        this.board = new Board();
    }

    public void start() {
        //board.print();
        Scanner scanner = new Scanner(System.in);
        Scanner menueScanner = new Scanner(System.in);

        int inputRow, inputCol;

        while (!quit) {

            System.out.println("Current Player: " + currentPlayer.getMarker());
            board.print();

            do {
                do {
                    System.out.print("row (0-2):");
                    inputRow = scanner.nextInt();
                    System.out.print("column (0-2):");
                    inputCol = scanner.nextInt();
                } while ( !verifyInput(inputRow, inputCol));

                if (!board.isCellEmpty(inputRow, inputCol)) {
                    System.out.println("cell is occupied");
                }

            } while (!board.isCellEmpty(inputRow, inputCol) );


            board.place(inputRow, inputCol, currentPlayer.getMarker());

            if(hasWinner()){
                System.out.println("Current Player "+currentPlayer.getMarker()+" has won!");
                gameover =true;
            }else if(board.isFull()){
                System.out.println("Game Over, nobody has won!");
                gameover =true;
            }

            switchCurrentPlayer();

            if(gameover) {
                String input;
                do {
                    System.out.println("To restart Game, enter 'n'");
                    System.out.println("To quit playing, enter 'q'");
                    input = menueScanner.nextLine();
                    if(input.equals("q")) {
                        quit = true;
                    }
                } while (!(input.equals("n") || input.equals("q")));
                board.clear();
                gameover=false;
            }
        }

    }

    public boolean verifyInput(int inputRow, int inputCol) {

        if (inputRow < 0 || inputRow > 2) {
            System.out.println("Invalid input");
            return false;
        }
        if (inputCol < 0 || inputCol > 2) {
            System.out.println("Invalid input");
            return false;
        }
        return true;

    }


    public void switchCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else currentPlayer = player1;
    }

    public Board getBoard() {
        return board;
    }

    public boolean hasWinner() {

    char[][] cells = board.getCells();

    // Check rows and columns for a win
        for (int i = 0; i < 3; i++) {
        if (cells[i][0] != ' ' && cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) {
            return true;
        }
        if (cells[0][i] != ' ' && cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]) {
            return true;
        }
    }

    // Check diagonals for a win
        if (cells[0][0] != ' ' && cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2]) {
        return true;
    }
        if (cells[0][2] != ' ' && cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0]) {
        return true;
    }

        return false;
}



}
