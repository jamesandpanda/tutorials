package postconditions;

public class NumberGeneratorC extends NumberGenerator {
    /**
     * Generates a random double.
     *
     * @pre none
     * @post outputs a whole number between 0 (inclusive) and 10 (exclusive)
     */
    @Override
    public double generateNumber() {
        // Q: Are the preconditions and postconditions valid under LSP?
        return Double.valueOf(getRandom().nextInt(0, 10));
    }
}
