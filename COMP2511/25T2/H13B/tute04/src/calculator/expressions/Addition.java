package calculator.expressions;

public class Addition implements Expression {
    private Expression expr1;
    private Expression expr2;

    public Addition(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public double evaluate() {
        return expr1.evaluate() + expr2.evaluate();
    }
}
