package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class HolidayStrategy implements ChargingStrategy {
    private static final double MODIFIER = 1.15;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * MODIFIER).sum();
    }

    @Override
    public double getModifier(boolean payeeIsMember) {
        return MODIFIER;
    }
}
