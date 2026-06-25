package restaurant;

import java.util.List;

import restaurant.strategies.*;

public class RestaurantTest {
    public static Restaurant initialiseRestaurant() {
        List<Meal> menu = List.of(
            new Meal("Avocado on Toast", 20),
            new Meal("Iced Matcha Latte", 10),
            new Meal("Dubai Chocolate Strawberry Cup", 50),
            new Meal("200g Sugar Crumbl Cookie", 100),
            new Meal("Labubu Cake", 500));

        return new Restaurant("2511 Cafe", menu);
    }

    public static void main(String[] args) {
        Restaurant r = initialiseRestaurant();
        r.displayMenu();

        List<Meal> order = List.of(
            new Meal("Iced Matcha Latte", 10),
            new Meal("Labubu Cake", 500));
        r.completeOrder(order, "James");

        r.setChargingStrategy(new HappyHourStrategy());
        r.completeOrder(order, "James");

        r.addMember("James");
        r.completeOrder(order, "James");
    }
}
