package cafe;

// extends Exception - makes a checked exception
// extends RuntimeException - makes a unchecked exception
public class MenuException extends Exception {
    public MenuException(String message) {
        super(message);
    }
}
