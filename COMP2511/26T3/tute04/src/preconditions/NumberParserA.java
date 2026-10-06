package preconditions;

public class NumberParserA extends NumberParser {
    /**
     * Converts an English word into an integer.
     *
     * @pre word is "one", "two" or "three", not case-sensitive.
     * @post outputs the number represented by the word
     */
    @Override
    public int parse(String word) {
        // Q: Are the preconditions and postconditions valid under LSP?

        word = word.toLowerCase();
        switch (word) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            default:
                return -1;
        }
    }
}
