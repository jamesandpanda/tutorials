package cafe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cafe.Cafe;

import java.util.List;

public class CafeTest {
    @Test
    public void testBasic() {
        List<String> order = List.of("Iced Latte");
        double expected = 6.00;

        assertEquals(expected, Cafe.calculateCost(order));
    }

    @Test
    public void testLargerOrder() {
        List<String> order = List.of("Jasmine Milk Tea", "Iced Latte", "Iced Matcha");
        double expected = 20.90;

        assertEquals(expected, Cafe.calculateCost(order));
    }
}
