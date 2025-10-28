package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class PrizeDrawStrategy implements ChargingStrategy {
    private int count;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        if (count % 2 == 0) {
            return 0;
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double getModifier(boolean isMember) {
        ++count;
        if (count % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
