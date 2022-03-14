import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
    @Test
    public void testDivisionFail() {
        //Setup
        Operations operations = new Operations();
        double expected = 0.0;
        //Test
        double actual = operations.performDivision("10","0"); //Dividing by zero should always fail
        assertNotEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
    @Test
    public void testDivisionPass() {
        //Setup
        Operations operations = new Operations();
        double expected = 5.0;
        //Test
        double actual = operations.performDivision("10", Double.toString(operations.performDivision("10","5")));
        assertEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
}