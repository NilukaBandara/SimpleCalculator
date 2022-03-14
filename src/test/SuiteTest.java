import org.junit.Test;

import static org.junit.Assert.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Scanner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AdditionTest.class, OperationIntegrationTest.class, DivisionTest.class, MultiplicationTest.class, SubtractionTest.class, AdditionTest.class, OperationIntegrationTest.class, DivisionTest.class, MultiplicationTest.class, SubtractionTest.class})

public class SuiteTest {
    @Test
    public void OperationsTestSuite()
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
    public void runDataDrivenTest()
    {
        File testDataFile = new File("testingData/operationsIntegrationTest");
        Scanner fileReader = new Scanner(testDataFile);
        String operations = fileReader.nextLine();
        double expectedAnswer = fileReader.nextDouble();
        DataDrivenOperationsTest(operations, expectedAnswer);
    }

    public void DataDrivenOperationsTest(String testData, double answer)
    {
        //Setup
        Operations op = new Operations();
        UserInterface ui = new UserInterface();
        ui.m_texttWindow = new JTextField();
        ActionEvent event;

        //Test
        //Iterate through chars in testData and produce events
        for(int i = 0; i < testData.length(); i++)
        {
            String symbol = new String(testData.substring(i));

            event = new ActionEvent(ui, 1001, symbol);
            op.actionPerformed(event);
        }

        assertEquals(answer, op.finalAnswer, 0.0);
        //Teardown
        //...
    }

}