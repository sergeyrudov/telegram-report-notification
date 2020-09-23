import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class MoreSimpleTests {
    @Test
    void firstTest() {
        assertTrue(false);
    }

    @Test
    void secondTest() {
        assertTrue(false);
    }

    @Test
    void thirdTest() {
        assertTrue(true);
    }

    @Test
    void forthTest() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void fifthTest() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void sixTest() {
        assertTrue(false);
    }
}