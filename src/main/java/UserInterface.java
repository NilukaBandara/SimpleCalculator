import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Class for the UI
class UserInterface 
{
    public static void createWindow() 
    {
        // Setup
        JFrame frame = new JFrame("TestFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("TestLabel");
        label.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Display
        frame.pack();
        frame.setVisible(true);
    }
}