package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class PrizeDrawStrategy implements ChargingStrategy {
    private static final double MODIFIER = 1;
    private int orderNum;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        ++orderNum;

        if (orderNum % 100 == 0) {
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
