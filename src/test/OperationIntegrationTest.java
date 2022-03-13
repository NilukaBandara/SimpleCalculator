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
    public void OperationsIntegrationTest()
    {
        //Setup
        Operations op = new Operations();
        UserInterface ui = new UserInterface();
        ui.m_texttWindow = new JTextField();
        ActionEvent event;
        double answer = 0;

        //Test
        event = new ActionEvent(ui, 1001, "1");
        op.actionPerformed(event);

        event = new ActionEvent(ui, 1001, "1");
        op.actionPerformed(event);

        event = new ActionEvent(ui, 1001, "+");
        op.actionPerformed(event);

        event = new ActionEvent(ui, 1001, "9");
        op.actionPerformed(event);

        //11 + 9  = 20
        answer = 11 + 9;

        event = new ActionEvent(ui, 1001, "*");
        op.actionPerformed(event);

        event = new ActionEvent(ui, 1001, "4");
        op.actionPerformed(event);

        //20 * 4 = 80
        answer = answer * 4;

        event = new ActionEvent(ui, 1001, "/");
        op.actionPerformed(event);

        event = new ActionEvent(ui, 1001, "8");
        op.actionPerformed(event);

        // 80 / 8 = 10
        answer = answer / 8;

        event = new ActionEvent(ui, 1001, "-");
        op.actionPerformed(event);

        event = new ActionEvent(ui, 1001, "3");
        op.actionPerformed(event);

        //10 - 3 = 7
        answer = answer - 3;

        event = new ActionEvent(ui, 1001, "=");
        op.actionPerformed(event);

        assertEquals(answer, op.finalAnswer, 0.0);

        //Teardown
        //...
    }
    @Test
    public void performintegrationTest()
    {
        //Setup
        Operations operations = new Operations();
        double expected = 12.0;
        //Test  10 + 3
        double actual = operations.performAddition(Double.toString(operations.performMultiplication("5","2")), Double.toString(operations.performAddition(Double.toString(operations.performSubtraction("3","2")),Double.toString(operations.performDivision("4","2")))));
        assertNotEquals(expected, actual, 0.0);

    }

    @Test
    public void performintegrationPassTest()
    {
        //Setup
        Operations operations = new Operations();
        double expected = 10.0;
        //Test  2 + (-2 + 10)
        double actual = operations.performAddition(Double.toString(operations.performMultiplication("1","2")), Double.toString(operations.performAddition(Double.toString(operations.performSubtraction("3","5")),Double.toString(operations.performDivision("10","1")))));
        assertEquals(expected, actual, 0.0);

    }

}
