package restaurant;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class RestaurantApp {
    public static Restaurant initialiseRestaurant() {
        Map<String, Double> menu = Map.of(
            "Avocado on Toast", 20.0,
            "Iced Matcha Latte", 10.0,
            "Dubai Chocolate Cup", 50.0,
            "Crumbl Cookie", 100.0,
            "Labubu Cake", 500.0
        );

        return new Restaurant(menu);
    }

    public static void main(String[] args) {
        Restaurant r = initialiseRestaurant();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please select a charging strategy (standard/holiday/membersDiscount): ");
        String chargingStrategy = sc.nextLine();
        r.setChargingStrategy(chargingStrategy);

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
