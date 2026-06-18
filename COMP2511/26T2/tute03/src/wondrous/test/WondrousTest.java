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
    // on the left next to the line numbers, you will see red dots
    // this is how you add break points
    @Test
    public void testBasic() {
        // to go into debug mode, right click/control click the button you see
        // next to the test name, and then click Debug Test.
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 10, 5, 16, 8, 4, 2, 1));

        // assertDoesNotThrow acts like a try-catch block when dealing with tests
        assertDoesNotThrow(() -> {
            assertEquals(expected, w.wondrous(3));
        });
    }

    @Test
    public void testGivenOne() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>();

        assertDoesNotThrow(() -> {
            assertEquals(expected, w.wondrous(1));
        });
    }

    @Test
    public void testThrowsException() {
        Wondrous w = new Wondrous();

        assertThrows(IllegalArgumentException.class, () -> {
            w.wondrous(0);
        });
    }

    @Test
    public void testDoesNotThrowException() {
        Wondrous w = new Wondrous();

        assertDoesNotThrow(() -> w.wondrous(1));
    }
}
