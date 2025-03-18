package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {
    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double getModifier() {
        return 1.0;
    }
}
