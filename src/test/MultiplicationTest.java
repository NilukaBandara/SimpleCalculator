import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {
    @Test
    public void testMultiplicationFail() {
        //Setup
        Operations operations = new Operations();
        double expected = 0.0;
        //Test
        double actual = operations.performMultiplication("6","6");
        assertNotEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
    @Test
    public void testMultiplicationPass() {
        //Setup
        Operations operations = new Operations();
        double expected = 36.0;
        //Test
        double actual = operations.performMultiplication("6", Double.toString(operations.performMultiplication("3","2")));
        assertEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
    @Test
    public void testMultiplicationMax() { //very high values
        //Setup
        Operations operations = new Operations();
        double expected = Double.MAX_VALUE * Double.MAX_VALUE;
        //Test
        double actual = operations.performMultiplication(Double.toString(Double.MAX_VALUE), Double.toString(Double.MAX_VALUE));
        assertEquals(expected, actual, 0.0);
        //Teardown
        //...
    }
}