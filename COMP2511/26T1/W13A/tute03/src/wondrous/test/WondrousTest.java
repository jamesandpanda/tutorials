package wondrous.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import wondrous.Wondrous;

public class WondrousTest {
    @Test
    public void testBasic() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 10, 5, 16, 8, 4, 2, 1));
        
        // assertDoesNotThrow is required to call methods that could potentially
        // throw checked exceptions
        // think of this argument as a code block that actually gets run
        assertDoesNotThrow(() -> {
            assertEquals(expected, w.wondrous(3));
        });
    }

    @Test
    public void testGivenOne() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<>();

        assertDoesNotThrow(() -> {
            assertEquals(expected, w.wondrous(1));
        });
    }

    @Test
    public void testThrowsExceptions() {
        Wondrous w = new Wondrous();

        assertThrows(IllegalArgumentException.class, () -> {
            w.wondrous(0);
        });
    }
}
