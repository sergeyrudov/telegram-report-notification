import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class SimpleTests {
    @Test
    void firstTest() {
        assertTrue(true);
    }

    @Test
    void secondTest() {
        assertTrue(true);
    }

    @Test
    void thirdTest() {
        assertTrue(false);
    }

    @Test
    void forthTest() {
        assertTrue(false);
    }

    @Test
    void fifthTest() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void sixTest() {
        assertTrue(false);
    }
}