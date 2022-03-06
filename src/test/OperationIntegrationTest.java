import org.junit.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.Assert.*;
public class OperationIntegrationTest implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //Nothing
    }

    @Test
    public void testSomeFakeInputs()
    {
        //Setup
        Operations op = new Operations();
        OperationIntegrationTest fakeObj = new OperationIntegrationTest();
        ActionEvent fakeEvent = new ActionEvent(fakeObj, 1001, "1");

        //Test
        op.actionPerformed(fakeEvent);

        fakeEvent = new ActionEvent(fakeObj, 1001, "+");
        op.actionPerformed(fakeEvent);

        fakeEvent = new ActionEvent(fakeObj, 1001, "1");
        op.actionPerformed(fakeEvent);

        double two = 2;
        assertEquals(op.finalAnswer,two, 0.0);
        //Teardown
    }

}
