package example;

// In this exercise, we're creating a class that stores a message
// and has a function to print out the same message, but in all capital letters
public class Shouter {
    // this is an *instance field* (i.e. each instance of the
    // Shouter class will store its own message)
    // !!! remember that all internal fields should be private !!!
    // this is because classes should know as little information as
    // possible about other classes, and shouldn't have to interact with
    // the internal details of other classes.s
    private String message;

    // this is the constructor we are defining for the Shouter object!
    public Shouter(String message) {
        // because we are storing a instance field called message and
        // are accepting a method parameter called message, we need to
        // use "this.message" to explicitly refer to the message being
        // stored inside the actual Shouter object. if you don't include
        // "this", Java will default to the one that is local in scope,
        // i.e. the method parameter in this example.
        this.message = message;
    }

    // this is called a "getter", which just returns the value of
    // a specific instance field.
    // you should only write getters where it would be appropriate to do so!
    // not all fields need to have a getter or setter (below)
    public String getMessage() {
        return message;
    }

    // this is called a "setter", which changes the value of a
    // specific instance field.
    // the same principle to getters applies here as well. you should only
    // write getters where it would be appropriate to do so!
    public void setMessage(String message) {
        this.message = message;
    }

    // this is the actual method to print out the stored message in
    // upper case - don't overcomplicate string operations! if you need
    // to do something with strings, Java likely already has an in-built
    // method to do so.
    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s1 = new Shouter("Hello COMP2511!");
        Shouter s2 = new Shouter("Second shouter");

        s1.shout(); // invoking an instance method, prints "HELLO COMP2511!"

        s1.setMessage("Changed message");
        s1.shout(); // prints "CHANGED MESSAGE"

        s2.shout(); // setting the message for s1 doesn't change the
        // message for s2 because the message is an instance field - in contrast to a *static* field
    }
}
