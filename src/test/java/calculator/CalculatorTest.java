package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(9, calc.add(4, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(6, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calc.divide(6, 2));
    }

    @Test
    public void testIsEvenTrue() {
        assertTrue(calc.isEven(10));
    }

    @Test
    public void testIsEvenFalse() {
        assertFalse(calc.isEven(7));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
