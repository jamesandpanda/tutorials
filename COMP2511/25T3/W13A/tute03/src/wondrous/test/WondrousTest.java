package wondrous.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import wondrous.Wondrous;
import wondrous.WondrousException;

public class WondrousTest {
    @Test
    public void testBasic() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 10, 5, 16, 8, 4, 2, 1));

        assertDoesNotThrow(() -> {
            assertEquals(expected, w.wondrous(3));
        });
    }

    @Test
    public void testGiveOne() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>();

        assertDoesNotThrow(() -> {
            assertEquals(expected, w.wondrous(1));
        });
    }

    @Test
    public void testThrowsException() {
        Wondrous w = new Wondrous();

        assertThrows(WondrousException.class, () -> {
            w.wondrous(0);
        });
    }
}
