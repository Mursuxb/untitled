package t2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test completed");
    }

    @Test
    void add() {
        calculator.add(1, 2);
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void subtract() {
        calculator.subtract(2, 1);
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    void multiply() {
        calculator.multiply(2, 3);
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divide() {
        calculator.divide(6, 3);
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
    }
}