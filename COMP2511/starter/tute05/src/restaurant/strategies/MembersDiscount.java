package restaurant.strategies;

import java.util.List;
import java.util.Map;

public class MembersDiscount implements ChargingStrategy {
    private static final double MODIFIER = 1;
    private static final double MEMBER_MODIFIER = 0.8;

    @Override
    public void completeOrder(Map<String, Double> menu, List<String> order) {
        // TODO
    }

    @Override
    public void printMenu(Map<String, Double> menu) {
        // TODO
    }
}
