package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class HappyHourStrategy implements ChargingStrategy {
    private static final double MODIFIER = 0.7;
    private static final double MEMBER_MODIFIER = 0.6;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        // TODO
        return 0;
    }

    @Override
    public double getModifier(boolean isMember) {
        // TODO
        return 0;
    }
}
