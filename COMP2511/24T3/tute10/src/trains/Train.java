package trains;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Wagon> wagons = new ArrayList<>();

    public Train(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    @Override
    public String toString() {
        String s = "Train Components:\n";

        for (Wagon wagon : wagons) {
            s += wagon.getType() + '\n';
        }

        return s;
    }

    public static void main(String[] args) {
        TrainBuilder builder = new TrainBuilder()
            .addHighPoweredEngine()
            .addCargoWagon()
            .addPassengerWagon()
            .addPassengerWagon()
            .addStandardEngine();

        Train train1 = builder.build();
        System.out.println(train1);

        // We can still use the same builder to generate multiple of the same train
        // as t.
        Train train2 = builder.build();
        System.out.println(train2);

        // If we didn't want to be able to re-use the same builder, we can do
        // something like:
        Train train3 = new TrainBuilder()
            .addHighPoweredEngine()
            .addPassengerWagon()
            .addCargoWagon()
            .build();
        System.out.println(train3);

        // This train is invalid (an exception will be thrown) since there isn't
        // enough power for the first cargo wagon.
        Train train4 = new TrainBuilder()
            .addCargoWagon()
            .addHighPoweredEngine()
            .build();
    }
}
