package trains;

import java.util.ArrayList;
import java.util.List;

// As a reminder, the Builder pattern aims to separate the construction of complex
// objects into different steps.

public class TrainBuilder {
    private List<Wagon> wagons = new ArrayList<>();
    private int availablePower;

    // Each of the following methods below to do with adding the components of the
    // train will return a TrainBuilder back, just so that methods can be chained
    // (see the main function in Train.java). This chaining is definitely not a
    // requirement and making them return void is also fine.

    public TrainBuilder addPassengerWagon() {
        // IllegalStateException is an unchecked exception, so we don't need to
        // declare that it throws in the method signature.
        if (availablePower < PassengerWagon.POWER_REQUIRED) {
            throw new IllegalStateException("Not enough power to add passenger wagon");
        }

        wagons.add(new PassengerWagon());
        availablePower -= PassengerWagon.POWER_REQUIRED;

        return this;
    }

    public TrainBuilder addCargoWagon() {
        if (availablePower < CargoWagon.POWER_REQUIRED) {
            throw new IllegalStateException("Not enough power to add cargo wagon");
        }

        wagons.add(new CargoWagon());
        availablePower -= CargoWagon.POWER_REQUIRED;

        return this;
    }

    public TrainBuilder addStandardEngine() {
        wagons.add(new StandardEngine());
        availablePower += StandardEngine.POWER_PROVIDED;

        return this;
    }

    public TrainBuilder addHighPoweredEngine() {
        wagons.add(new HighPoweredEngine());
        availablePower += HighPoweredEngine.POWER_PROVIDED;

        return this;
    }

    public Train build() {
        // This train should be 'well-formed' (i.e. has enough power to supply
        // all of the wagons) since the checks are already performed when the
        // cargo/passenger wagons are added.
        return new Train(wagons);
    }
}
