package postconditions;

public class NumberGeneratorA extends NumberGenerator {
    /**
     * Generates a random double.
     *
     * @pre none
     * @post outputs a double between 0 (inclusive) and 5 (exclusive)
     */
    @Override
    public double generateNumber() {
        // Q: Are the preconditions and postconditions valid under LSP?
        return getRandom().nextDouble(0, 5);
    }
}
