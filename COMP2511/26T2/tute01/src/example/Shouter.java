package example;

public class Shouter {
    // This is how to declare the fields that we are storing in the class
    private String message;

    // Constructor
    public Shouter(String message) {
        this.message = message;
    }

    // Defining a class method
    // We can call this method from any Shouter object
    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello World");
        s.shout();
    }
}
