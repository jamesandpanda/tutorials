package restaurant.strategies;

import java.util.Map;

public interface ChargingStrategy {
    public double getModifier();

    public void printMenu(Map<String, Double> menu);
}
