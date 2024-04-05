import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.crpypst.Calculator;

public class CalculatorTest {
    
    @Test
    void twoPlusTwo() {
        Calculator calculator = new Calculator();
        assertEquals(4.0,calculator.sum(2, 2));
    }

    @Test
    void twoPlus1() {
        Calculator calculator = new Calculator();
        assertEquals(3.0,calculator.sum(2, 1));
    }
    
    @Test
    void twoMinusTwo() {
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.subtraction(2, 2));
    }
    
    @Test
    void twoByFive() {
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.multiplication(2, 5));
    }

    @Test
    void fourInto2() {
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.division(4, 2));
    }
    
    @Test
    void fourIntoZero() {
        Calculator calculator = new Calculator();
        assertEquals(-1,calculator.division(4, 1));
    }


}