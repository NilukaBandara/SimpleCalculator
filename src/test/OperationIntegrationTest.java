import org.junit.Test;

import java.awt.event.ActionEvent;

import static org.junit.Assert.*;
public class OperationIntegrationTest {

    public void actionPerformed(ActionEvent e) {
        //Nothing
    }

    @Test
    public void performIntegrationFailTest()
    {
        //Setup
        Operations operations = new Operations();
        double expected = 12.0;
        //Test  10 + 3
        double actual = operations.performAddition(Double.toString(operations.performMultiplication("5","2")), Double.toString(operations.performAddition(Double.toString(operations.performSubtraction("3","2")),Double.toString(operations.performDivision("4","2")))));
        assertNotEquals(expected, actual, 0.0);

    }

    @Test
    public void performIntegrationPassTest()
    {
        //Setup
        Operations operations = new Operations();
        double expected = 10.0;
        //Test  2 + (-2 + 10)
        double actual = operations.performAddition(Double.toString(operations.performMultiplication("1","2")), Double.toString(operations.performAddition(Double.toString(operations.performSubtraction("3","5")),Double.toString(operations.performDivision("10","1")))));
        assertEquals(expected, actual, 0.0);

    }

}
