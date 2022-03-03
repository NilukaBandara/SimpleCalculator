public class Calculator {
    public static void main(String[] args) {
        Operations op = new Operations();
        UserInterface ui = new UserInterface();
        ui.createWindow(op);
        ui.showWindow();
    }
}