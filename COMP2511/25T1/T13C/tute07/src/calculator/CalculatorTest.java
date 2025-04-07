package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        // 2 + 3
        Expression e = new Addition(new Number(2.0), new Number(3.0));
        assertEquals(5.0, e.evaluate());
    }

    @Test
    public void testComplicatedExpression() {
        // 2 - 3 * 6
        // 2 - 18
        Expression e = new Subtraction(new Number(2.0), new Multiplication(new Number(3.0), new Number(6.0)));
        assertEquals(-16.0, e.evaluate());

    }
}
