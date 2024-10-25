package calculator;

// Expressions are things like 5, 7, 5 + 7, 5 * 8, 2 / (3 + 4) etc.
// Particularly, they all evaluate to a single number.
public interface Expression {
    public Double compute();
}
