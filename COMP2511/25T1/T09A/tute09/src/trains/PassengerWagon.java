package trains;

public class PassengerWagon extends Wagon {
    public static final String TYPE = "Passenger Wagon";
    public static final int POWER_REQUIRED = 500;

    public PassengerWagon() {
        super(TYPE);
    }
}
