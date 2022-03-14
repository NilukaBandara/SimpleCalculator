import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractionTest {
    @Test
    public void testSubtractionFail() {
        //Setup
        Operations operations = new Operations();
        double expected = 8.0;
        //Test
        double actual = operations.performSubtraction("12","6");
        assertNotEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
    @Test
    public void testSubtractionPass() {
        //Setup
        Operations operations = new Operations();
        double expected = 6.0;
        //Test
        double actual = operations.performSubtraction("12", Double.toString(operations.performSubtraction("12","6")));
        assertEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
}