package restaurant.strategies;

import java.util.Map;
import java.util.List;

public interface ChargingStrategy {
    public void completeOrder(Map<String, Double> menu, List<String> order);

    public void printMenu(Map<String, Double> menu);
}
