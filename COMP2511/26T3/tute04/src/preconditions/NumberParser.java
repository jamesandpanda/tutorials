package preconditions;

public class NumberParser {
    /**
     * Converts an English word into an integer.
     *
     * @pre word is "one", "two" or "three", case-sensitive.
     * @post outputs the number represented by the word
     */
    public int parse(String word) {
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
