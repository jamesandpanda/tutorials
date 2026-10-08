package postconditions;

public class NumberGeneratorB extends NumberGenerator {
    /**
     * Generates a random double.
     *
     * @pre none
     * @post outputs a double between 0 (inclusive) and 20 (exclusive)
     */
    @Override
    public double generateNumber() {
        // Q: Are the preconditions and postconditions valid under LSP?
        // no - not all numbers between 0 and 20 are between 0 and 10.
        return getRandom().nextDouble(0, 20);
    }
}
