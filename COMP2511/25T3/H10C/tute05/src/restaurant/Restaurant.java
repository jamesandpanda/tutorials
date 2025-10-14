package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String chargingStrategy = "standard";
    private String name;
    private List<String> members = new ArrayList<String>();
    private List<Meal> menu = new ArrayList<Meal>();

    public Restaurant(String name, List<Meal> menu) {
        this.name = name;
        this.menu = menu;
    }

    public void displayOrder(List<Meal> order, String customer) {
        System.out.println("========================");
        System.out.println("Order for " + customer + ":");
        System.out.println("========================");

        double modifier = switch (chargingStrategy) {
            case "standard" -> 1;
            case "holiday" -> 1.15;
            case "happyHour" -> {
                if (members.contains(customer)) {
                    yield 0.6;
                } else {
                    yield 0.7;
                }
            }
            default -> 0;
        };

        for (Meal meal : order) {
            System.out.println(meal.getName() + " - " + "$" + meal.getCost() * modifier);
        }

        double cost = switch (chargingStrategy) {
            case "standard" -> order.stream().mapToDouble(meal -> meal.getCost()).sum();
            case "holiday" -> order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
            case "happyHour" -> {
                if (members.contains(customer)) {
                    yield order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
                } else {
                    yield order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
                }
            }
            default -> 0;
        };

        System.out.println("Total: " + "$" + cost);
    }

    public void displayMenu() {
        System.out.println("========================");
        System.out.println("Welcome to " + name + "!");
        System.out.println("========================");

        double modifier = switch (chargingStrategy) {
            case "standard" -> 1;
            case "holiday" -> 1.15;
            case "happyHour" -> 0.7;
            default -> 0;
        };

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + "$" + meal.getCost() * modifier);
        }
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void setChargingStrategy(String chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    public static void main(String[] args) {
        List<Meal> menu = List.of(
            new Meal("Avocado on Toast", 20),
            new Meal("Strawberry Matcha", 10),
            new Meal("Dubai Chocolate Strawberry Cup", 50),
            new Meal("6 7 Yogurt", 6.7),
            new Meal("Labubu Cake", 1000));
        Restaurant r = new Restaurant("2511 Cafe", menu);
        r.displayMenu();

        List<Meal> order = List.of(
            new Meal("Strawberry Matcha", 10),
            new Meal("Labubu Cake", 1000));
        r.displayOrder(order, "James");

        // r.setChargingStrategy("happyHour");
        // r.displayOrder(order, "James");

        // r.addMember("James");
        // r.displayOrder(order, "James");
    }
}
