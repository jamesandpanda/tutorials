package calculator.expressions;

public class Number implements Expression {
    public double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public double evaluate() {
        return number;
    }
}
