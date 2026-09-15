package wondrous;

// defining your own exceptions
// checked exception - extends Exception
// unchecked exception - extends RuntimeException
public class WondrousException extends Exception {
    public WondrousException(String message) {
        super(message);
    }
}
