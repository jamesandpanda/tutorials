package calculator;

public class Calculator {
    private Expression expr;

    public Calculator(Expression expr) {
        this.expr = expr;
    }

    public Double calculate() {
        return expr.compute();
    }
}

