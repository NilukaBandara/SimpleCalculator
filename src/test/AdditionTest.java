import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {
    public Operations operations = new Operations();
    @Test
    public void testAdditionFail() {
        //Setup
        Operations operations = new Operations();
        double expected = 7.0;
        //Test
        double actual = operations.performAddition("9","7");
        assertNotEquals(expected, actual, 0.0);

    }
    @Test
    public void testAdditionPass() {
        //Setup
        Operations operations = new Operations();
        double expected = 12.0;
        //Test
        double actual = operations.performAddition("9", Double.toString(operations.performAddition("1","2")));
        assertEquals(expected, actual, 0.0);

    }
}