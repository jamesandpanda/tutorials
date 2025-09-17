package shouter;

public class Shouter {
    // This is how we declare an *instance field* - all objects of type Shouter
    // will store a field of type String, called message.
    private String message;

    // This is us defining the constructor for the Shouter. Remember that constructors
    // are how we create objects.
    public Shouter(String message) {
        this.message = message;
    }

    // This is an *instance field* - if we have an object of type Shouter, we can
    // invoke this method.
    public void shout() {
        System.out.println(message.toUpperCase());
    }

    // A getter - just returns the internal field
    // An important idea with OOP is that classes should know as little as possible about
    // other classes - in some cases, it may not be appropriate to write a getter for
    // a specific field.
    public String getMessage() {
        return message;
    }

    // A setter - just changes the value of the field being stored. Same thing applies
    // with getters in that sometimes it may not be appropriate to include this.
    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        // This is how we call the constructor; the `new` keyword is sort of like malloc.
        Shouter s = new Shouter("I am going overtime on this lab");
        s.shout();

        s.setMessage("Thank you Saakshi!");
        s.shout();

        System.out.println(s.getMessage());
    }
}
