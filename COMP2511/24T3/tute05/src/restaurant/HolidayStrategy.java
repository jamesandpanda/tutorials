package restaurant;

import java.util.List;

public class HolidayStrategy implements ChargingStrategy {
    public static final double STANDARD_RATE = 1.15;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * STANDARD_RATE).sum();
    }

    @Override
    public double getStandardRate() {
        return STANDARD_RATE;
    }
}
