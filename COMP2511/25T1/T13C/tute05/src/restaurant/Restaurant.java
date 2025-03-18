package restaurant;

import java.util.ArrayList;
import java.util.List;

import restaurant.strategies.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardStrategy();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public void setStrategy(ChargingStrategy strategy) {
        chargingStrategy = strategy;
    }

    public double cost(List<Meal> order, String payee) {
        boolean payeeIsMember = members.contains(payee);
        return chargingStrategy.cost(order, payeeIsMember);
    }

    public void displayMenu() {
        System.out.println("Welcome to " + name + "!");
        System.out.println("========================");

        double modifier = chargingStrategy.getModifier();
        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public void addMember(String member) {
        members.add(member);
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
        r.setStrategy(new HolidayStrategy());
        r.displayMenu();
    }
}
