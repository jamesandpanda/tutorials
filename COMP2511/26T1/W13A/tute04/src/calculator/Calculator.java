package calculator;

import calculator.expressions.Addition;
import calculator.expressions.Expression;
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
        Expression expr = new Addition(new Number(7), new Number(5));
        Calculator c = new Calculator(expr);

        System.out.println(c.evaluate());
    }
}
