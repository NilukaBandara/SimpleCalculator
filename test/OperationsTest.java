import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {
    Operations testAdd = new Operations();

    @Test
    public void testPerformAddition() {
        double obj1= 5.0;
        double obj2= testAdd.performAddition("2", "3");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformSubtraction() {
        double obj1= 5.0;
        double obj2= testAdd.performSubtraction("15", "10");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformMultiplication() {
        double obj1= 30.0;
        double obj2= testAdd.performMultiplication("5", "6");
        assertEquals(obj1,obj2, 0.0);
    }

    @Test
    public void testPerformDivision() {
        double obj1= 6.0;
        double obj2= testAdd.performDivision("30", "5");
        assertEquals(obj1,obj2, 0.0);
    }
}