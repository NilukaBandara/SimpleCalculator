import org.junit.Test;

import java.awt.event.ActionEvent;

import static org.junit.Assert.*;
public class OperationIntegrationTest {

    @Test
    public void testSomeFakeInputs()
    {
        //Setup
        Operations op = new Operations();
        ActionEvent fakeEvent = new ActionEvent(op, 1001, "1");

        //Test
        op.actionPerformed(fakeEvent);

        fakeEvent = new ActionEvent(op, 1001, "+");
        op.actionPerformed(fakeEvent);

        fakeEvent = new ActionEvent(op, 1001, "1");
        op.actionPerformed(fakeEvent);

        double two = 2;
        assertEquals(op.finalAnswer,two, 0.0);
        //Teardown
    }

}
