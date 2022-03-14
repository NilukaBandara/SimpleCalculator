import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {
    public Operations operations = new Operations();
    @Test
    public void testMultiplicationFail() {
        //Setup
        Operations operations = new Operations();
        double expected = 37.0;
        //Test
        double actual = operations.performMultiplication("6","6");
        assertNotEquals(expected, actual, 0.0);

    }
    @Test
    public void testMultiplicationPass() {
        //Setup
        Operations operations = new Operations();
        double expected = 36.0;
        //Test
        double actual = operations.performMultiplication("6", Double.toString(operations.performMultiplication("3","2")));
        assertEquals(expected, actual, 0.0);

    }
}