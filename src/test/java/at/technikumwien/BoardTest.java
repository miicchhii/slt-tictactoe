package at.technikumwien;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    @Test
    void testBoard(){
        Player player1 = new Player('X');
        Player player2 = new Player('O');

        Board board = new Board();

        //Test that cells aren't empty after placing a marker
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                //Control
                boolean result = board.isCellEmpty(x,y);
                assertEquals(true,result);
                //Test
                board.place(x, y, player1.getMarker());
                result = board.isCellEmpty(x,y);
                assertEquals(false,result);
                //Overwrite Test
                board.place(x, y, player2.getMarker());
                result = board.isCellEmpty(x,y);
                assertEquals(false,result);
                //Test that the board is only full when last cell has been placed
                result = board.isFull();
                if(x==2 && y==2){
                    assertEquals(true,result);
                }else {
                    assertEquals(false, result);
                }
            }
        }



        //Test if all cells are cleared using Board.clear()
        board.clear();
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                boolean result = board.isCellEmpty(x,y);
                assertEquals(true,result);
            }
        }




    }
}
