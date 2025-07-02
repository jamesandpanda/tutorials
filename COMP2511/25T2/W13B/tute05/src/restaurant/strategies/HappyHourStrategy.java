package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class HappyHourStrategy implements ChargingStrategy {
    private static final double MODIFIER = 0.7;
    private static final double MEMBER_MODIFIER = 0.6;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        if (isMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double getModifier(boolean isMember) {
        if (isMember) {
            return MEMBER_MODIFIER;
        } else {
            return MODIFIER;
        }
    }
}
