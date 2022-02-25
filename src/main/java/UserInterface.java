import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Class for the UI
class UserInterface {
    static JFrame m_frame;
    public static JTextField m_texttWindow;

    UserInterface() {
        m_frame = new JFrame("Simple calculator");
    }

    public static void createWindow(Operations op) {
        // Setup
        m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m_frame.setDefaultLookAndFeelDecorated(true);

        fillWindow(op);
    }

    public static void showWindow() {
        // Display
        m_frame.pack(); // Set the size of the window appropriate for the contents
        m_frame.setSize(230, 210);
        m_frame.setLocationRelativeTo ( null );
        m_frame.setResizable(false);
        m_frame.setVisible(true);
    }

    public static void fillWindow(Operations op) {
        // Panel
        JPanel m_panel = new JPanel();

        // Calculator text window
        m_texttWindow = new JTextField(16);
        m_texttWindow.setEditable(false);
        m_panel.add(m_texttWindow);

        // Setup numerical buttons
        JButton[] numButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(op);
            m_panel.add(numButtons[i]);
        }

        // Setup calculator actions: + - / * = C
        JButton addButton = new JButton("+");
        addButton.addActionListener(op);
        m_panel.add(addButton);

        JButton subButton = new JButton("-");
        subButton.addActionListener(op);
        m_panel.add(subButton);

        JButton divButton = new JButton("/");
        divButton.addActionListener(op);
        m_panel.add(divButton);

        JButton mulButton = new JButton("*");
        mulButton.addActionListener(op);
        m_panel.add(mulButton);

        JButton equButton = new JButton("=");
        equButton.addActionListener(op);
        m_panel.add(equButton);

        JButton delButton = new JButton("C");
        delButton.addActionListener(op);
        m_panel.add(delButton);

        m_frame.add(m_panel);
    }
}