package cafe.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import cafe.Cafe;
import cafe.MenuException;

import java.util.List;

public class CafeTest {
    @Test
    public void testSimpleOrder() {
        List<String> order = List.of("Iced Latte");
        double expected = 6;

        assertDoesNotThrow(() -> {
            assertEquals(expected, Cafe.calculateCost(order));
        });
    }

    @Test
    public void testOrderThreeItems() {
        List<String> order = List.of("Jasmine Milk Tea", "Iced Matcha", "Iced Latte");
        double expected = 20.90;

        assertDoesNotThrow(() -> {
            assertEquals(expected, Cafe.calculateCost(order));
        });
    }

    @Test
    public void testInvalidItem() {
        List<String> order = List.of("Iced Vanilla Latte");
        
        assertThrows(MenuException.class, () -> {
            Cafe.calculateCost(order);
        });
    }
}
