package calculator;

// The 'base case' of the recursive structure, since the computation of a
// number is just the number itself.
public class Number implements Expression {
    private Double number;

    public Number(Double number) {
        this.number = number;
    }

    @Override
    public Double compute() {
        return number;
    }
}
