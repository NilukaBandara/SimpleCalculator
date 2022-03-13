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
    public static void testPerformSubtraction(String a, String b, String c) {
        double expected= Double.parseDouble(a);
        double actual= operations.performSubtraction(b, c);
        assertEquals(expected,actual, 0.0);
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
    //test case of addition 
    @Test
    public void testPerformAdditionTwo() {
        double foo= 13.0;
        //test 
        double bar= operations.performAddition("6", "7");
        assertEquals(foo,bar, 0.0);
        //teardown
    }
    //test case of Multiplication
    @Test
    public void testPerformMultiplicationTwo() {
        double foo= 56.0;
        //test 
        double bar= operations.performMultiplication("7", "8");
        assertEquals(foo,bar, 0.0);
        //teardown
    }
    //test case of Subtraction
    @Test
    public void testPerformSubtractionTwo() {
        double foo= 3.0;
        //test 
        double bar= operations.performSubtraction("13", "10");
        assertEquals(foo,bar, 0.0);
        //teardown
    }
    //test case of Division
    @Test
    public void testPerformDivisionTwo() {
        double foo= 4.0;
        //test 
        double bar= operations.performDivision("24", "6");
        assertEquals(foo,bar, 0.0);
        //teardown
    }

}