package restaurant;

import java.util.ArrayList;
import java.util.List;

import restaurant.strategies.ChargingStrategy;
import restaurant.strategies.StandardStrategy;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardStrategy();
    private String name;
    private List<String> members = new ArrayList<String>();
    private List<Meal> menu = new ArrayList<Meal>();

    public Restaurant(String name, List<Meal> menu) {
        this.name = name;
        this.menu = menu;
    }

    public void completeOrder(List<Meal> order, String customer) {
        System.out.println("========================");
        System.out.println("Order for " + customer + ":");
        System.out.println("========================");

        double modifier = chargingStrategy.getModifier(members.contains(customer));

        for (Meal meal : order) {
            System.out.println(meal.getName() + " - " + "$" + meal.getCost() * modifier);
        }

        double cost = chargingStrategy.cost(order, members.contains(customer));

        System.out.println("Total: " + "$" + cost);
    }

    public void displayMenu() {
        System.out.println("========================");
        System.out.println("Welcome to " + name + "!");
        System.out.println("========================");

        double modifier = chargingStrategy.getModifier(false);

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + "$" + meal.getCost() * modifier);
        }
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void setChargingStrategy(ChargingStrategy chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }
}
