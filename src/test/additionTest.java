import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class additionTest {
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
        double expected = 15.0;
        //Test
        double actual = operations.performAddition("9", Double.toString(operations.performAddition("1","2")));
        assertNotEquals(expected, actual, 0.0);

    }
}