package restaurant.strategies;

import java.util.List;
import java.util.Map;

public class HolidayStrategy implements ChargingStrategy {
    private static final double MODIFIER = 1.15;

    @Override
    public double completeOrder(Map<String, Double> menu, List<String> order) {
        // TODO
        return 0;
    }

    @Override
    public void printMenu(Map<String, Double> menu) {
        // TODO
    }
}
