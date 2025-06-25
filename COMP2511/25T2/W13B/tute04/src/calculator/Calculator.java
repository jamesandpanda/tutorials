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
        Calculator c = new Calculator(new Subtraction(new Number(42), new Multiplication(new Number(8), new Number(5))));
        System.out.println(c.evaluate());
    }
}
