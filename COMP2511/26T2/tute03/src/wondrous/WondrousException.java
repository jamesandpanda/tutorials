package wondrous;

// extends Exception - makes this a checked exception
// extends RuntimeException - makes this an unchecked exception
public class WondrousException extends Exception {
    public WondrousException(String message) {
        super(message);
    }
}
