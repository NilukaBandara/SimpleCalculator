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
        File testDataFile = new File("src/test/testingData/operationsIntegrationTest");
        try {
            Scanner fileReader = new Scanner(testDataFile);
            testData = fileReader.nextLine();
            answer = Double.parseDouble(fileReader.nextLine());
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
            String symbol = testData.substring(i, i+1);
            event = new ActionEvent(ui, 1001, symbol);
            op.actionPerformed(event);
        }

        assertEquals(answer, op.finalAnswer, 0.0);
        //Teardown
        //...
    }

}