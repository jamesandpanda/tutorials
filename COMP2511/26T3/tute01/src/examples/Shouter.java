package examples;

public class Shouter {
    // make a class that stores a message (as a String) and has a method to
    // print the String in ALL-CAPS

    // setting an instance field
    private String message;

    // writing a constructor that takes in an argument
    public Shouter(String message) {
        // this.message refers to the one stored inside of the class (the private one above)
        // message on its own refers to the one LOCAL in scope (the parameter passed in)
        this.message = message;
    }

    // writing an instance method
    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("Hello from H13A"); // making an instance
        shouter.shout(); // calling an instance method
    }
}
