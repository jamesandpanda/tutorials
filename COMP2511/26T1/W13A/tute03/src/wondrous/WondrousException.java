package wondrous;

// checked exception - extends Exception
// unchecked exception - extends RuntimeException
public class WondrousException extends Exception {
    public WondrousException(String message) {
        super(message);
    }
}
