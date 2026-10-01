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
        // this method should throw an exception if one of the items in the order
        // is not on the menu
        double totalCost = 0.0;

        for (String item : order) {
            if (!menuPrices.containsKey(item)) {
                throw new MenuException("The menu item " + item + " is not on the menu.");
            }
            double itemCost = menuPrices.getOrDefault(item, 0.0);
            totalCost += itemCost;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        List<String> order = List.of("Cappuccino");

        try {
            double cost = Cafe.calculateCost(order);
            System.out.println("Cost is " + cost);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
