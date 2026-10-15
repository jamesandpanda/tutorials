package calculator;

public class Calculator {
    private Expression expression;

    public Calculator(Expression expression) {
        this.expression = expression;
    }

    public double evaluate() {
        return expression.evaluate();
    }

    public static void main(String[] args) {
        // (6 + 7)
        Expression expr1 = new Addition(new Number(6), new Number(7)); // (6 + 7)
        // (6 + 7) - 5
        Expression expr2 = new Subtraction(expr1, new Number(5)); // (6 + 7) - 5
        Expression expr3 = new Multiplication(new Number(2), expr2); // 2 * ((6 + 7) - 5)

        Calculator c = new Calculator(expr3);
        System.out.println(c.evaluate());
    }
}
