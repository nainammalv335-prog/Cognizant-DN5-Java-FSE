
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise2_TestingAssertions {

    @Test
    void testAssertions() {

        assertEquals(10, 5 + 5);

        assertTrue(10 > 5);

        assertFalse(5 > 10);

        assertNull(null);

        assertNotNull("JUnit");
    }
}
