package at.technikumwien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PlayerTest{
    @Test
    void testMarker(){
        Player player1 = new Player('X');
        char result = player1.getMarker();
        assertEquals('X',result);

        Player player2 = new Player('O');
        char result2 = player2.getMarker();
        assertEquals('O',result2);
    }
}