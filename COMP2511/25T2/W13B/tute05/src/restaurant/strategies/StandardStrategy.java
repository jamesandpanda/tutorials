package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {
    private static final double MODIFIER = 1;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        // TODO
        return 0;
    }

    @Override
    public double getModifier(boolean isMember) {
        // TODO
        return 0;
    }
}
