package restaurant;

import java.util.List;

public class HappyHourStrategy implements ChargingStrategy {
    public static final double MEMBER_RATE = 0.6;
    public static final double STANDARD_RATE = 0.7;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * (payeeIsMember ? MEMBER_RATE : STANDARD_RATE)).sum();
    }

    @Override
    public double getStandardRate() {
        return STANDARD_RATE;
    }
}
