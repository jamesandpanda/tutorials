package cafe;

import java.util.Map;
import java.util.List;

public class Cafe {
    private static final Map<String, Double> menuPrices = Map.of(
        "Iced Latte", 6.00,
        "lced Matcha", 7.00,
        "Jasmine Milk Tea", 7.90
    );

    public static double calculateCost(List<String> order) {
        double totalCost = 0.0;

        for (String item : order) {
            double itemCost = menuPrices.getOrDefault(item, 0.0);
            totalCost += itemCost;
        }

        return totalCost;
    }
}
