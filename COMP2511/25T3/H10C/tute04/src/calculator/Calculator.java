package calculator;

import calculator.expressions.Addition;
import calculator.expressions.Expression;
import calculator.expressions.Number;
import calculator.expressions.Subtraction;

public class Calculator {
    private Expression expr;

    public Calculator(Expression expr) {
        this.expr = expr;
    }

    public double evaluate() {
        return expr.evaluate();
    }

    public static void main(String[] args) {
        // (2 + 3) - 5
        Expression lhs = new Addition(new Number(2), new Number(3));
        Expression rhs = new Number(5);
        Expression overall = new Subtraction(lhs, rhs);
    }
}
