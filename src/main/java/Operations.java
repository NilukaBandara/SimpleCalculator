import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Class that performs the calculations
public class Operations implements ActionListener {

    static int summary = 0;
    static int currentLeft = 0;
    static int currentRight = 0;
    static boolean onLeft = true;

    // Function that catches the click of a button
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        System.out.println(command);

        // If a number
        if (isNumeric(command)) {
            if(onLeft)
            {
                currentLeft = (currentLeft * 10) + Integer.parseInt(command);
            }
            else
            {
                currentRight = (currentRight * 10) + Integer.parseInt(command);
            }
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

    // Helper function to figure out of if the string is a numerical
    // https://www.baeldung.com/java-check-string-number
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // Functions for calculations
    public int addition(int left, int right) {
        return left + right;
    }

    public int subraction(int left, int right) {
        return left - right;
    }

    public int division(int left, int right) {
        return left / right;
    }

    public int multiplication(int left, int right) {
        return left * right;
    }

    public int equals() {
        return -1;
    }

    public void deletion() {
    }
}
