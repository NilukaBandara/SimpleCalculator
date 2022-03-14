import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {
    @Test
    public void testAdditionFail() {
        //Setup
        Operations operations = new Operations();
        double expected = 0.0;
        //Test
        double actual = operations.performAddition("9","7");
        assertNotEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
    @Test
    public void testAdditionPass() { //Happy path
        //Setup
        Operations operations = new Operations();
        double expected = 12.0;
        //Test
        double actual = operations.performAddition("9", Double.toString(operations.performAddition("1","2")));
        assertEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
    public void testAdditionMax() { //very high values
        //Setup
        Operations operations = new Operations();
        double expected = 2.0 * Double.MAX_VALUE;
        //Test
        double actual = operations.performAddition(Double.toString(Double.MAX_VALUE), Double.toString(Double.MAX_VALUE));
        assertEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
}