import java.awt.event.*;

//Class that performs the calculations
public class Operations implements ActionListener {

    static double finalAnswer = 0;
    // store operator and operands
    String firstOperator, operand, secondOperator;

    Operations() {
        firstOperator = operand = secondOperator = "";
    }

    // Function that catches the click of a button
    public void actionPerformed(ActionEvent event) {
        String m_inputString = event.getActionCommand();
        UserInterface.m_texttWindow.setText(m_inputString);

        // If a number
        if (isNumeric(m_inputString)) {
            // if operand is present then add to second no
            if (!operand.equals(""))
                secondOperator = secondOperator + m_inputString;
            else
                firstOperator = firstOperator + m_inputString;

            // set the value of text
            UserInterface.m_texttWindow.setText(firstOperator + operand + secondOperator);
        }

        // Equals
        else if (m_inputString.equals("=")) {

            double m_answer = doOperations(operand);

            // set the value of text
            UserInterface.m_texttWindow.setText(firstOperator + operand + secondOperator + "=" + m_answer);

            // convert it to string
            firstOperator = Double.toString(m_answer);

            operand = secondOperator = "";
        }
        // Deletion
        else if (m_inputString.equals("C")) {
            // clear the one letter
            firstOperator = operand = secondOperator = "";

            // set the value of text
            UserInterface.m_texttWindow.setText(firstOperator + operand + secondOperator);
        }
        // Other
        else {
            // if there is no operand
            if (operand.equals("") || secondOperator.equals(""))
                operand = m_inputString;
            else {
                double m_answer;

                m_answer = doOperations(operand);

                // convert it to string
                firstOperator = Double.toString(m_answer);

                // place the operator
                operand = m_inputString;

                // make the operand blank
                secondOperator = "";
            }

            // set the value of text
            UserInterface.m_texttWindow.setText(firstOperator + operand + secondOperator);
        }
    }

    // To check the input string is a number or not
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public double performAddition(String x, String y) {
        return (Double.parseDouble(x) + Double.parseDouble(y));
    }

    public double performSubtraction(String x, String y) {
        return (Double.parseDouble(x) - Double.parseDouble(y));
    }

    public double performMultiplication(String x, String y) {
        return (Double.parseDouble(x) * Double.parseDouble(y));
    }

    public double performDivision(String x, String y) {

        return (Double.parseDouble(x) / Double.parseDouble(y));
    }

    public double doOperations(String operation) {

        switch (operation) {
            // Addition
            case "+" -> finalAnswer = performAddition(firstOperator, secondOperator);

            // Subtraction
            case "-" -> finalAnswer = performSubtraction(firstOperator, secondOperator);

            // Division
            case "/" -> finalAnswer = performDivision(firstOperator, secondOperator);

            // Multiplication
            case "*" -> finalAnswer = performMultiplication(firstOperator, secondOperator);
        }

        return finalAnswer;
    }
}
