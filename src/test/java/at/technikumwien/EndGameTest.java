package at.technikumwien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EndGameTest {


    @Test
    void testhasWinner(){
        TicTacToe game;
        game = new TicTacToe();
        Board board = game.getBoard();

        // Test horizontal win
        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');
        assertTrue(game.hasWinner());

        board.clear();

        // Test vertical win
        board.place(0, 0, 'O');
        board.place(1, 0, 'O');
        board.place(2, 0, 'O');
        assertTrue(game.hasWinner());

        board.clear();

        // Test diagonal win
        board.place(0, 0, 'X');
        board.place(1, 1, 'X');
        board.place(2, 2, 'X');
        assertTrue(game.hasWinner());

        board.clear();

        // Test reverse diagonal win
        board.place(0, 2, 'O');
        board.place(1, 1, 'O');
        board.place(2, 0, 'O');
        assertTrue(game.hasWinner());

        board.clear();

        // Test no win
        board.place(0, 0, 'X');
        board.place(0, 1, 'O');
        board.place(0, 2, 'X');
        board.place(1, 0, 'X');
        board.place(1, 1, 'O');
        board.place(1, 2, 'O');
        board.place(2, 0, 'O');
        board.place(2, 1, 'X');
        board.place(2, 2, 'X');
        assertFalse(game.hasWinner());
    }


}






