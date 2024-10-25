package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for composite calculator.
 * 
 * @author Nick Patrikeos
 */
public class CalculatorTest {
    @Test
    public void testAddition() {
        Expression e = new AdditionExpression(new Number(1.0), new Number(2.0));
        assertEquals(3, e.compute(), 0.001);
    }

    @Test
    public void testSubtraction() {
        Expression e = new SubtractionExpression(new Number(1.0), new Number(2.0));
        assertEquals(-1, e.compute(), 0.001);
    }

    @Test
    public void testMultiplication() {
        Expression e = new MultiplicationExpression(new Number(4.0), new Number(3.0));
        assertEquals(12, e.compute(), 0.001);
    }

    @Test
    public void testDivision() {
        Expression e = new DivisionExpression(new Number(5.0), new Number(2.0));
        assertEquals(2.5, e.compute(), 0.001);
    }

    @Test
    public void testIntegration() {
        // ((1 + 2) + (3 / 4)) - ((5 / 10) * (7 * 8)) = -24.25
        Calculator calculator = new Calculator(new SubtractionExpression(
                new AdditionExpression(
                        new AdditionExpression(new Number(1.0), new Number(2.0)),
                        new DivisionExpression(new Number(3.0), new Number(4.0))),
                new MultiplicationExpression(
                        new DivisionExpression(new Number(5.0), new Number(10.0)),
                        new MultiplicationExpression(new Number(7.0), new Number(8.0)))));
        assertEquals(-24.25, calculator.calculate(), 0.001);
    }
}

