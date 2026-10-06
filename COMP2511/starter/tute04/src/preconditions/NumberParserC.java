package preconditions;

public class NumberParserC extends NumberParser {
    /**
     * Converts an English word into an integer.
     *
     * @pre word is "zero", "one" or "two", not case-sensitive.
     * @post outputs the number represented by the word
     */
    @Override
    public int parse(String word) {
        // Q: Are the preconditions and postconditions valid under LSP?

        word = word.toLowerCase();
        switch (word) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            default:
                return -1;
        }
    }
}
