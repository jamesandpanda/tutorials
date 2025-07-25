package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {
    private static final double MODIFIER = 1;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double getModifier(boolean isMember) {
        return MODIFIER;
    }
}
