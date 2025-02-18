package example;

public class Shouter {
    // Class fields should be kept private, with things like constants being
    // exceptions (which can still be private)
    // Remember that a class should not need to expose its internal representation
    // to other classes.
    private String message;

    // A constructor.
    public Shouter(String message) {
        this.message = message;
    }

    // Getters and setters are how other classes can interact with private fields.
    // While this isn't really considered in this example, make sure to think about
    // which fields it actually makes sense to have getters and setters for.
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello World!");
        s.shout();
    }
}
