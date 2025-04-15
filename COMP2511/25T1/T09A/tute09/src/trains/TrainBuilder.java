package trains;

import java.util.ArrayList;
import java.util.List;

public class TrainBuilder {
    private int availablePower;
    private List<Wagon> wagons = new ArrayList<>();

    public TrainBuilder addHighPoweredEngine() {
        wagons.add(new HighPoweredEngine());
        availablePower += HighPoweredEngine.POWER_PROVIDED;

        return this;
    }

    public TrainBuilder addStandardEngine() {
        wagons.add(new StandardEngine());
        availablePower += StandardEngine.POWER_PROVIDED;

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

    public TrainBuilder addPassengerWagon() {
        if (availablePower < PassengerWagon.POWER_REQUIRED) {
            throw new IllegalStateException("Not enough power to add passenger wagon");
        }

        wagons.add(new PassengerWagon());
        availablePower -= PassengerWagon.POWER_REQUIRED;

        return this;
    }

    public Train createTrain() {
        return new Train(wagons);
    }
}
