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

    }
}
