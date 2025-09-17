package shouter;

public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void convertToUpperCase() {

    }

    public static void main(String[] args) {
        Shouter s = new Shouter("I am going overtime on this lab");
        s.shout();

        s.setMessage("Thank you Saakshi!");
        s.shout();

        System.out.println(s.getMessage());
    }
}
