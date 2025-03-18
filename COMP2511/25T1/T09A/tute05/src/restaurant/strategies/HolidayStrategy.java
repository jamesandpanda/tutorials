package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class HolidayStrategy implements ChargingStrategy {
    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }

    @Override
    public double getModifier() {
        return 1.15;
    }
}
