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
        // 2 - (3 + 6)
        Calculator c = new Calculator(new Subtraction(new Number(2), new Addition(new Number(3), new Number(6))));
        System.out.println(c.evaluate());
    }
}
