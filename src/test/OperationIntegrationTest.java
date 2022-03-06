import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.Assert.*;
public class OperationIntegrationTest {

    public void actionPerformed(ActionEvent e) {
        //Nothing
    }

    @Test
    public void testSomeFakeInputs()
    {
        //Setup
        Operations op = new Operations();
        UserInterface ui = new UserInterface();
        ui.m_texttWindow = new JTextField(16);


        //Test
        ActionEvent fakeEvent = new ActionEvent(ui, 1001, "1");
        op.actionPerformed(fakeEvent);

        fakeEvent = new ActionEvent(ui, 1001, "1");
        op.actionPerformed(fakeEvent);

        fakeEvent = new ActionEvent(ui, 1001, "+");
        op.actionPerformed(fakeEvent);

        fakeEvent = new ActionEvent(ui, 1001, "9");
        op.actionPerformed(fakeEvent);

        fakeEvent = new ActionEvent(ui, 1001, "=");
        op.actionPerformed(fakeEvent);

        double answer = 20;
        assertEquals(op.finalAnswer,answer, 0.0);
        //Teardown
    }

}
