import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class OperationsTest {
    @Test
    public void DataDrivenOperationsTest()
    {
        //Setup
        Operations op = new Operations();
        UserInterface ui = new UserInterface();
        ui.m_texttWindow = new JTextField();
        ActionEvent event;
        String testData = "";
        double answer = Double.NEGATIVE_INFINITY;

        //Read the test data
        File testDataFile = new File("testingData/operationsIntegrationTest");
        try {
            Scanner fileReader = new Scanner(testDataFile);
            testData = fileReader.nextLine();
            answer = fileReader.nextDouble();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occurred reading a file.");
            e.printStackTrace();
        }

        //Test
        //Iterate through chars in testData and produce events
        for(int i = 0; i < testData.length(); i++)
        {
            String symbol = new String(testData.substring(i));

            event = new ActionEvent(ui, 1001, symbol);
            op.actionPerformed(event);
        }

        System.out.println("Jalapeno");
        System.out.println(op.finalAnswer);
        System.out.println(answer);

        assertEquals(answer, op.finalAnswer, 0.0);
        //Teardown
        //...
    }

}