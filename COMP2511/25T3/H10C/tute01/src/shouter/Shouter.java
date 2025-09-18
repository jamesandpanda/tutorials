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

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello COMP2511!");
        s.shout();
    }
}
