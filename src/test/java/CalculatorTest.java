import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-2, 1));
        assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(-3, calc.subtract(-2, 1));
        assertEquals(1, calc.subtract(-2, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(0, calc.multiply(0, 5));
        assertEquals(-10, calc.multiply(-2, 5));
        assertEquals(6, calc.multiply(-2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calc.divide(5, 2));
        assertEquals(-2, calc.divide(-10, 5));
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}