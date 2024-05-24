package at.technikumwien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest{
    @Test
    void testSum(){
        Calculator calculator = new Calculator();
        int result = calculator.sum(1,2);
        assertEquals(3,result);
    }
}