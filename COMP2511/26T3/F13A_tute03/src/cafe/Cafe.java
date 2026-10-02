package cafe;

import java.util.Map;
import java.util.List;

public class Cafe {
    private static final Map<String, Double> menuPrices = Map.of(
        "Iced Latte", 6.00,
        "Iced Matcha", 7.00,
        "Jasmine Milk Tea", 7.90
    );

    public static double calculateCost(List<String> order) throws MenuException {
        double totalCost = 0.0;

        for (String item : order) {
            if (!menuPrices.containsKey(item)) {
                throw new MenuException("The item " + item + " is not on the menu.");
            }

            double itemCost = menuPrices.getOrDefault(item, 0.0);
            totalCost += itemCost;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        List<String> order = List.of("Cortado");

        // "try-catch block"
        try {
            Cafe.calculateCost(order);
            // specific lines of code
        } catch (Exception e) {
            // these lines of code get run as soon as an exception gets thrown (and caught)
            System.err.println(e.getMessage());
        }
    }
}
