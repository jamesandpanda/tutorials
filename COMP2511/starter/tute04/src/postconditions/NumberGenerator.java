package postconditions;

import java.util.Random;

public class NumberGenerator {
    private Random r = new Random(); // generates its own seed to create random numbers

    /**
     * Generates a random double.
     *
     * @pre none
     * @post outputs a double between 0 (inclusive) and 10 (exclusive)
     */
    public double generateNumber() {
        return r.nextDouble(0, 10);
    }

    protected Random getRandom() {
        return r;
    }
}
