package restaurant;

import java.util.List;

public class StandardStrategy implements ChargingStrategy {
    public static final double STANDARD_RATE = 1.0;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double getStandardRate() {
        return STANDARD_RATE;
    }
}
