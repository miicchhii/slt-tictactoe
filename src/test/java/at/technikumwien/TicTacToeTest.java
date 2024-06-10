package at.technikumwien;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe game;

    @BeforeEach
    void setUp() {
        game = new TicTacToe();
    }

    @Test
    void testVerifyInputValid() {
        assertTrue(game.verifyInput(0, 0));
        assertTrue(game.verifyInput(1, 2));
        assertTrue(game.verifyInput(2, 1));
    }

    @Test
    void testVerifyInputInvalidRow() {
        assertFalse(game.verifyInput(-1, 0));
        assertFalse(game.verifyInput(3, 1));
    }

    @Test
    void testVerifyInputInvalidCol() {
        assertFalse(game.verifyInput(0, -1));
        assertFalse(game.verifyInput(1, 3));
    }

    @Test
    void testSwitchCurrentPlayer() {
        Player player1 = game.player1;
        Player player2 = game.player2;

        game.currentPlayer = player1;
        game.switchCurrentPlayer();
        assertEquals(player2, game.currentPlayer);

        game.switchCurrentPlayer();
        assertEquals(player1, game.currentPlayer);
    }
}
