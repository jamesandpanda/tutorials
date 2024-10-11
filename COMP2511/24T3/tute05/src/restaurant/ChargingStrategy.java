package restaurant;

import java.util.List;

public interface ChargingStrategy {
    public double cost(List<Meal> order, boolean payeeIsMember);

    public double getStandardRate();
}
