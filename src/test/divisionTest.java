import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class divisionTest {
    public Operations operations = new Operations();
    @Test
    public void testDivisionFail() {
        //Setup
        Operations operations = new Operations();
        double expected = 3.0;
        //Test
        double actual = operations.performDivision("10","0");
        assertNotEquals(expected, actual, 0.0);

    }
    @Test
    public void testDivisionPass() {
        //Setup
        Operations operations = new Operations();
        double expected = 5.0;
        //Test
        double actual = operations.performDivision("10", Double.toString(operations.performDivision("10","5")));
        assertEquals(expected, actual, 0.0);

    }
}