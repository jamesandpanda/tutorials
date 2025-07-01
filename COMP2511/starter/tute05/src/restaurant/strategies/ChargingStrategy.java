package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public interface ChargingStrategy {
    /**
     * The cost of a meal.
     */
    public double cost(List<Meal> order, boolean isMember);

    /**
     * Modifying factor of charges for customers.
     */
    public double getModifier(boolean isMember);
}
