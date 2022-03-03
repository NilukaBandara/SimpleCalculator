import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {
    Operations operations = new Operations();

    @Test
    public void testPerformAddition() {
        double obj1= 4.0;
        double obj2= operations.performAddition("2", "3");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformSubtraction() {
        double obj1= 5.0;
        double obj2= operations.performSubtraction("15", "10");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformMultiplication() {
        double obj1= 30.0;
        double obj2= operations.performMultiplication("5", "6");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformDivision() {
        double obj1= 6.0;
        double obj2= operations.performDivision("30", "5");
        assertEquals(obj1,obj2, 0.0);
    }
}