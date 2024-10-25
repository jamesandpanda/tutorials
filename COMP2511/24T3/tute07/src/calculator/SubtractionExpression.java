package calculator;

// Composite, takes in two expressions and returns their difference.
public class SubtractionExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public SubtractionExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public Double compute() {
        return expr1.compute() - expr2.compute();
    }
}
