package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {
    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cost'");
    }

    @Override
    public double getModifier() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModifier'");
    }
}
