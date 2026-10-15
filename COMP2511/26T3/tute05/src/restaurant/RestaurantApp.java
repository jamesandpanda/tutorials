package restaurant;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import restaurant.strategies.*;

public class RestaurantApp {
    public static Restaurant initialiseRestaurant() {
        Map<String, Double> menu = Map.of(
            "Avo on Toast", 20.0,
            "Matcha Latte", 8.0,
            "Coffee", 5.5,
            "Trains Fried Rice", 25.0,
            "Labubu Cookie", 1000.0
        );

        return new Restaurant(menu);
    }

    public static void main(String[] args) {
        Restaurant r = initialiseRestaurant();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please select a charging strategy (standard/holiday/membersDiscount): ");
        String chargingStrategy = sc.nextLine();

        switch (chargingStrategy) {
            case "standard":
                r.setChargingStrategy(new StandardStrategy());
                break;
            case "holiday":
                r.setChargingStrategy(new HolidayStrategy());
                break;
            case "membersDiscount":
                r.setChargingStrategy(new MembersDiscountStrategy());
                break;
        }

        r.displayMenu();

        System.out.println("Please input all the items you would like to order:");
        List<String> order = new ArrayList<>();
        while (sc.hasNextLine()) {
            String orderedItem = sc.nextLine();
            order.add(orderedItem);
        }

        r.completeOrder(order, "James");
        sc.close();
    }
}
