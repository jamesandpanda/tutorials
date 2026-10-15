package restaurant.strategies;

import java.util.Map;

public class MembersDiscountStrategy implements ChargingStrategy {
    @Override
    public double getModifier(boolean isMember) {
        if (isMember) {
            return 0.8;
        } else {
            return 1;
        }
    }

    @Override
    public void printMenu(Map<String, Double> menu) {
        menu.forEach((item, cost) -> {
            System.out.printf("%s - $%.2f ($%.2f discount for members)\n", item,
                cost, cost * 0.2);
        });
    }
}
