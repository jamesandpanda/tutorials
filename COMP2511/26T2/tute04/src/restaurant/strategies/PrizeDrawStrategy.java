package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class PrizeDrawStrategy implements ChargingStrategy {
    private static final double MODIFIER = 1;
    private static final int NUM_FOR_PRIZE = 100;
    private int orderCount = 0;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        // assume this method gets called everytime an order is calculated
        ++orderCount;

        if (orderCount % NUM_FOR_PRIZE == 0) {
            return 0;
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double getModifier(boolean isMember) {
        // would be good if this returned 0 on each 100th order, but assume
        // that orders are only counted when calling cost().
        // so for this, just return the normal modifier
        return MODIFIER;
    }
}
