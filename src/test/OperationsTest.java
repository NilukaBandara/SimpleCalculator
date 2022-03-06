import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {
    Operations operations = new Operations();

    @Test
    public void testPerformAddition() {
        double obj1= 5.0;
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

    @Test
    public void testPerformAdditionOne() {
        double obj1= 7.0;
        double obj2= operations.performAddition("6", "7");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformMultiplicationTwo() {
        double obj1= 20.0;
        double obj2= operations.performMultiplication("7", "8");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformSubtractionTwo() {
        double obj1= 7.0;
        double obj2= operations.performSubtraction("8", "13");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformDivisionTwo() {
        double obj1= 6.0;
        double obj2= operations.performDivision("40", "5");
        assertEquals(obj1,obj2, 0.0);
    }

}