package restaurant.strategies;

import java.util.Map;

public class HolidayStrategy implements ChargingStrategy {
    @Override
    public double getModifier(boolean isMember) {
        return 1.15;
    }

    @Override
    public void printMenu(Map<String, Double> menu) {
        menu.forEach((item, cost) -> {
            System.out.printf("%s - $%.2f\n", item, cost * 1.15);
        });
    }
}
