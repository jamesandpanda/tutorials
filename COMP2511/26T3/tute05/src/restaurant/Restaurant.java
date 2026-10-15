package restaurant;

import java.util.Map;

import restaurant.strategies.ChargingStrategy;
import restaurant.strategies.StandardStrategy;

import java.util.HashMap;
import java.util.List;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardStrategy();
    private Map<String, Double> menu = new HashMap<String, Double>();
    private List<String> members = List.of("James");

    public Restaurant(Map<String, Double> menu) {
        this.menu = menu;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void setChargingStrategy(ChargingStrategy chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    public void completeOrder(List<String> order, String customer) {
        System.out.println("========================");
        System.out.println("Order for " + customer + ":");
        System.out.println("========================");

        double modifier = chargingStrategy.getModifier(members.contains(customer));

        for (String item : order) {
            double cost = menu.getOrDefault(item, 0.0);
            System.out.printf("%s - $%.2f\n", item, cost * modifier);
        }

        double cost = order.stream().mapToDouble(item -> menu.getOrDefault(item, 0.0) * modifier).sum();
        System.out.printf("Total: $%.2f\n", cost);
    }

    public void displayMenu() {
        System.out.println("========================");
        System.out.println("Welcome to 2511 Cafe!");
        System.out.println("========================");

        chargingStrategy.printMenu(menu);
    }
}
