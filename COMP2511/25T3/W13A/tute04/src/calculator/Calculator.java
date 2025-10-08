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
        Expression lhs = new Addition(new Number(2), new Number(3));
        Expression rhs = new Number(3);
        Expression overall = new Subtraction(lhs, rhs);
        Calculator c = new Calculator(overall);

        System.out.println(c.evaluate());
    }
}
