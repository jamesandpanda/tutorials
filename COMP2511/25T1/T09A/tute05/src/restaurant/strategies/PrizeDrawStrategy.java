package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class PrizeDrawStrategy implements ChargingStrategy {
    private int numCustomers;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        // The assumption is that each time this is called, this is a new transaction
        ++numCustomers;
        if (numCustomers % 100 == 0) {
            return 0;
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }
    @Override
    public double getModifier() {
        return 1.0;
    }
}
