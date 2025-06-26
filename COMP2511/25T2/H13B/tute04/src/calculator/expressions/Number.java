package calculator.expressions;

public class Number implements Expression {
    private double number;

    @Override
    public double evaluate() {
        return number;
    }
}
