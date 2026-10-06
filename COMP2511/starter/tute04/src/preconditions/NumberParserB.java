package preconditions;

public class NumberParserB extends NumberParser {
    /**
     * Converts an English word into an integer.
     *
     * @pre word is "one", "two", "three", "four" or "five", case-sensitive.
     * @post outputs the number represented by the word
     */
    @Override
    public int parse(String word) {
        // Q: Are the preconditions and postconditions valid under LSP?

        switch (word) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            default:
                return -1;
        }
    }
}
