import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField inputField;
    private JPanel buttonPanel;
    private String currentInput = "";
    private double result = 0;
    private char operator = ' ';
    private boolean newInput = true;

    public Calculator() {
        frame = new JFrame("GUI Math Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        inputField = new JTextField(15);
        inputField.setEditable(false);
        frame.add(inputField, BorderLayout.NORTH);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2));

        createButtons();
        frame.add(buttonPanel);

        frame.setVisible(true);
    }

    private void createButtons() {
        String[] buttonLabels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
            button.addActionListener(new ButtonClickListener(label));
        }
    }

    private void updateInputField() {
        inputField.setText(currentInput);
    }

    private class ButtonClickListener implements ActionListener {
        private String label;

        public ButtonClickListener(String label) {
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (label) {
                case "+":
                case "-":
                case "*":
                case "/":
                    if (!newInput) {
                        compute();
                    }
                    operator = label.charAt(0);
                    newInput = true;
                    break;
                case "=":
                    compute();
                    operator = ' ';
                    newInput = true;
                    break;
                case "C":
                    currentInput = "";
                    operator = ' ';
                    newInput = true;
                    break;
                default:
                    if (newInput) {
                        currentInput = label;
                        newInput = false;
                    } else {
                        currentInput += label;
                    }
            }
            updateInputField();
        }
    }

    private void compute() {
        try {
            double input = Double.parseDouble(currentInput);
            switch (operator) {
                case '+':
                    result += input;
                    break;
                case '-':
                    result -= input;
                    break;
                case '*':
                    result *= input;
                    break;
                case '/':
                    if (input == 0) {
                        currentInput = "Error";
                        updateInputField();
                        return;
                    }
                    result /= input;
                    break;
                default:
                    result = input;
            }
            currentInput = Double.toString(result);
        } catch (NumberFormatException e) {
            currentInput = "Error";
        }
        updateInputField();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}