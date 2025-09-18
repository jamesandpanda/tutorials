package shouter;

public class Shouter {
    // Declaring an instance field (each shouter will store
    // its own message)
    private String message;

    // Constructor
    public Shouter(String message) {
        this.message = message;
    }

    // Defining an instance method - we can invoke this method
    // from objects of type Shouter.
    public void shout() {
        System.out.println(message.toUpperCase());
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello COMP2511!");
        s.shout();
    }
}
