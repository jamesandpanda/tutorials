package restaurant;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Restaurant {
    private String chargingStrategy = "standard";
    private Map<String, Double> menu = new HashMap<String, Double>();
    private List<String> members = List.of("James");

    public Restaurant(Map<String, Double> menu) {
        this.menu = menu;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void setChargingStrategy(String chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    public void completeOrder(List<String> order, String customer) {
        System.out.println("========================");
        System.out.println("Order for " + customer + ":");
        System.out.println("========================");

        double modifier = switch (chargingStrategy) {
            case "standard" -> 1;
            case "holiday" -> 1.15;
            case "membersDiscount" -> {
                if (members.contains(customer)) {
                    yield 0.8;
                } else {
                    yield 1;
                }
            }
            default -> 0;
        };

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

        menu.forEach((item, cost) -> {
            switch (chargingStrategy) {
                case "standard":
                    System.out.printf("%s - $%.2f\n", item, cost);
                    break;
                case "holiday":
                    System.out.printf("%s - $%.2f\n", item, cost * 1.15);
                    break;
                case "membersDiscount":
                    System.out.printf("%s - $%.2f ($%.2f discount for members)\n", item,
                        cost, cost * 0.2);
                    break;
            }
        });
    }
}
