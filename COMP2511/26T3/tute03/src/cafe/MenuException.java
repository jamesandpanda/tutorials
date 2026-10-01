package cafe;

// CHECKED exception - extends Exception
// UNCHECKED exception - extends RuntimeException

public class MenuException extends Exception {
    public MenuException(String message) {
        super(message);
    }
}
