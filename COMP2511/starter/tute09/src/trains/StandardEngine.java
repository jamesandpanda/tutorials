package trains;

public class StandardEngine extends Wagon {
    public static String TYPE = "Standard Engine";
    public static final int POWER_PROVIDED = 1000;

    public StandardEngine() {
        super(TYPE);
    }
}
