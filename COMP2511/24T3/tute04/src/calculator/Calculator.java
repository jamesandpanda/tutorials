package calculator;

public class Calculator {
    // double = primitive type
    // Double = a double wrapped as an Object, so it can use methods like
    // .equals(), .toString(), ...
    // Since Doubles are Objects, Double can be null (double cannot be null!)

    /**
     * @preconditions    a, b != null
     * @postconditions   returns a + b
     */
    public static Double add(Double a, Double b) {
        return a + b;
    }

    /**
     * @preconditions    a, b != null
     * @postconditions   returns a - b
     */
    public static Double subtract(Double a, Double b) {
        return a - b;
    }

    /**
     * @preconditions    a, b != null
     * @postconditions   returns a * b
     */
    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    /**
     * @precondition     a, b != null, b != 0
     * @postconditions   returns a / b
     */
    public static Double divide(Double a, Double b) {
        return a / b;
    }

    /**
     * @precondition     angle != null
     * @postconditions   returns sin(a)
     */
    public static Double sin(Double angle) {
        return Math.sin(angle);
    }

    /**
     * @precondition     angle != null
     * @postconditions   returns cos(a)
     */
    public static Double cos(Double angle) {
        return Math.cos(angle);
    }

    /**
     * @precondition     angle != null, angle != 90, 270 degrees
     * @postconditions   returns tan(angle)
     */
    public static Double tan(Double angle) {
        return Math.tan(angle);
    }

}