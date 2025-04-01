package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Expression e = new Addition(new Number(2), new Number(5));
        assertEquals(7.0, e.evaluate());
    }

    @Test
    public void testSubtraction() {
        Expression e = new Subtraction(new Number(2), new Number(5));
        assertEquals(-3.0, e.evaluate());
    }
}
