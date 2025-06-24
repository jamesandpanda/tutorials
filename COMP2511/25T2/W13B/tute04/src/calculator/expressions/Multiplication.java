package calculator.expressions;

public class Multiplication implements Expression {
    private Expression expr1;
    private Expression expr2;

    public Multiplication(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
}
