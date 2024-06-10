package at.technikumwien;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    @Test
    void testBoard() {
        Player player1 = new Player('X');
        Player player2 = new Player('O');

        Board board = new Board();

        //Test that cells aren't empty after placing a marker
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                //Control
                boolean result = board.isCellEmpty(x, y);
                assertTrue(result);
                //Test
                board.place(x, y, player1.getMarker());
                result = board.isCellEmpty(x, y);
                assertFalse(result);
                //Overwrite Test
                board.place(x, y, player2.getMarker());
                result = board.isCellEmpty(x, y);
                assertFalse(result);
                //Test that the board is only full when last cell has been placed
                result = board.isFull();
                if (x == 2 && y == 2) {
                    assertTrue(result);
                } else {
                    assertFalse(result);
                }
            }
        }


        //Test if all cells are cleared using Board.clear()
        board.clear();
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                boolean result = board.isCellEmpty(x, y);
                assertTrue(result);
            }
        }
    }

        //Test if the print method works correctly



    @Test
        void testPrint() {
            // Arrange
           Board board = new Board();
            board.place(0, 0, 'X');
            board.place(1, 1, 'O');
            board.place(2, 2, 'X');

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            System.setOut(printStream);

            // Act
            board.print();

            // Assert
            String expectedOutput =
                    "▁ ▁ ▁ ▁" + System.lineSeparator() +
                    "|X| | |" + System.lineSeparator() +
                    "| |O| |" + System.lineSeparator() +
                    "| | |X|" + System.lineSeparator() +
                    "▔ ▔ ▔ ▔" + System.lineSeparator();
            assertEquals(expectedOutput, outputStream.toString());
        }





}
