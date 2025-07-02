package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class PrizeDrawStrategy implements ChargingStrategy {
    private int currOrder = 0;
    private static final double MODIFIER = 1;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        ++currOrder;
        if (currOrder % 2 == 0) {
            return 0;
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double getModifier(boolean isMember) {
        return MODIFIER;
    }
}
