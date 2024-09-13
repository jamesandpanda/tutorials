package example;

public class Shouter {
    // Our class just needs to store a message.
    // By default, basically all of the attributes
    // stored within a class should be private in
    // this course. The exception is constants.
    private String message;

    // This is a constructor that we have defined
    // so that we can instantiate the object and
    // initialise the string all at once.
    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String shout() {
        return message.toUpperCase();
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("hello world");
        System.out.println(s.shout());
    }
}
