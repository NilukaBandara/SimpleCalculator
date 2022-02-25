import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Class that performs the calculations
public class Operations implements ActionListener {

    static int summary = 0;

    // Function that catches the click of a button
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        System.out.println(command);

        // If a number
        if () {
        }
        // Addition
        else if (command == "+") {

        }
        // Subtraction
        else if (command == "-") {

        }
        // Division
        else if (command == "/") {

        }
        // Multiplication
        else if (command == "*") {

        }
        // Equals
        else if (command == "=") {

        }
        // Deletion
        else if (command == "C") {
        }
        // Other
        else {
            System.out.println("Unhandled input: " + command);
        }
    }
}
