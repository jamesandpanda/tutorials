package calculator;

import calculator.expressions.*;
import calculator.expressions.Number;

public class Calculator {
    private Expression expr;

    public Calculator(Expression expr) {
        this.expr = expr;
    }

    public double evaluate() {
        return expr.evaluate();
    }

    public static void main(String[] args) {
        // Added after the tute: an example of representing 6 + 5 * 2
        // Addition node, left child = 6, right child = 5 * 2 (order of operations)

        Expression expr = new Addition(new Number(6), new Multiplication(new Number(5), new Number(2)));
        Calculator c = new Calculator(expr);
        System.out.println(c.evaluate());
    }
}
