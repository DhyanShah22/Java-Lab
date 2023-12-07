import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorGUI {
private JFrame frame;
private JPanel panel;
private JTextField display;
private String operator;
private double num1, num2;
public CalculatorGUI() {
    
frame = new JFrame("Calculator");
frame.setLayout(new BorderLayout());
panel = new JPanel();
panel.setLayout(new GridLayout(4, 4));
display = new JTextField(20);
display.setEditable(false);
display.setHorizontalAlignment(JTextField.RIGHT);
frame.add(display, BorderLayout.NORTH);
frame.add(panel, BorderLayout.CENTER);
createButtons();
addActionListeners();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 300);
frame.setVisible(true);
}
private void createButtons() {
String[] buttonLabels = {
"7", "8", "9", "/",
"4", "5", "6", "*",
"1", "2", "3", "-",
"0", ".", "=", "+"
};
for (String label : buttonLabels) {
JButton button = new JButton(label);
panel.add(button);} }
private void addActionListeners() {
Component[] components = panel.getComponents();
for (Component component : components) {
if (component instanceof JButton) {
JButton button = (JButton) component;
button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
String text = button.getText();
if (text.matches("[0-9]")) {
display.setText(display.getText() + text);
} else if (text.matches("[+\\-*/]")) {
if (operator == null) {
num1 = Double.parseDouble(display.getText());
operator = text;
display.setText("");}
} else if (text.equals("=")) {
if (operator != null) {
num2 = Double.parseDouble(display.getText());
switch (operator) {
case "+":
display.setText(String.valueOf(num1 + num2));
break;
case "-":
display.setText(String.valueOf(num1 - num2));
break;
case "*":
display.setText(String.valueOf(num1 * num2));
break;
case "/":
if (num2 != 0) {
display.setText(String.valueOf(num1 / num2));
} else {
display.setText("Error");}
break;}
operator = null;}
} else if (text.equals(".")) {
if (!display.getText().contains(".")) {
display.setText(display.getText() + ".");
}
} else if (text.equals("C")) {
display.setText("");
operator = null;}}});}}}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
public void run() {
new CalculatorGUI();}});}}