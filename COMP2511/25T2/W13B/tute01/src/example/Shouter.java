package example;

// write a program that stores a message and has methods for getting the message,
// updating the message and printing it out in all caps. Write a main() method for testing this class.
public class Shouter {
    // This is how we will store the message inside of this class.
    // This is an instance field (i.e. each Shouter will contain its own message).
    private String message;

    // This is the constructor for the Shouter. It provides a way to instantiate this class,
    // i.e. create objects of type Shouter.
    public Shouter(String message) {
        // The 'this' keyword is required, because we have 2 variables named 'message'.
        // Java needs to know if you're referring to the instance field named message, or
        // the message that is passed in as a parameter. By default, if you do not include
        // 'this', Java will treat it as the one that is *locally* defined (i.e. the parameter here).
        this.message = message;
    }

    // The following methods (not the main function) are all *instance methods*
    // They can be called through an instance of a Shouter.
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
        Shouter s = new Shouter("hello W13B!");
        s.shout();
    }
}
