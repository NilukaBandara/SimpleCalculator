import java.awt.event.*;

//Class that performs the calculations
public class Operations implements ActionListener {

    static double answer = 0;
    // store operator and operands
    String s0, s1, s2;

    Operations(){
        s0 = s1 = s2 = "";
    }


    // Function that catches the click of a button
    public void actionPerformed(ActionEvent event) {
        String s = event.getActionCommand();
        System.out.println(s);
        UserInterface.m_texttWindow.setText(s);

        // If a number
            if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                // if operand is present then add to second no
                if (!s1.equals(""))
                    s2 = s2 + s;
                else
                    s0 = s0 + s;

                // set the value of text

                UserInterface.m_texttWindow.setText(s0 + s1 + s2);

            }


        // Equals
        else if (s.charAt(0) == '=') {

            double ans = doOperations(s1);

                // set the value of text
            UserInterface.m_texttWindow.setText(s0 + s1 + s2 + "=" + ans);

            // convert it to string
            s0 = Double.toString(ans);

            s1 = s2 = "";
        }
        // Deletion
        else if (s.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";

            // set the value of text
            UserInterface.m_texttWindow.setText(s0 + s1 + s2);
        }
        // Other
        else {
                // System.out.println("Unhandled input: " + s);
                // if there is no operand
                if (s1.equals("") || s2.equals(""))
                    s1 = s;
                else {
                    double ans;

                    ans = doOperations(s1);

                    // convert it to string
                    s0 = Double.toString(ans);

                    // place the operator
                    s1 = s;

                    // make the operand blank
                    s2 = "";
                }

                // set the value of text
                UserInterface.m_texttWindow.setText(s0 + s1 + s2);
            }

        }

    public double performAddition(String x, String y){
        return (Double.parseDouble(x) + Double.parseDouble(y));
    }

    public double performSubtraction(String x, String y){
        return (Double.parseDouble(x) - Double.parseDouble(y));
    }

    public double performMultiplication(String x, String y){
        return (Double.parseDouble(x) * Double.parseDouble(y));
    }

    public double performDivision(String x, String y){
        return (Double.parseDouble(x) / Double.parseDouble(y));
    }

    public double doOperations(String operation) {

        switch (operation) {
            // Addition
            case "+" -> answer = performAddition(s0, s2);

            // Subtraction
            case "-" -> answer = performSubtraction(s0, s2);

            // Division
            case "/" -> answer = performDivision(s0, s2);

            // Multiplication
            case "*" -> answer = performMultiplication(s0, s2);
        }

        return answer;
    }
}
