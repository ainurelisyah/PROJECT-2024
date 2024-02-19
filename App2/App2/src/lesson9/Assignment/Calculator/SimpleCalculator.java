package lesson9.Assignment.Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    private JTextField displayField;
    private String currentInput; // USe string bcs user input for numerical values & operators (+-/*)
    private char lastOperator;
    private double result;

    public SimpleCalculator() {
        currentInput = "";
        lastOperator = ' ';
        result = 0.0;

        // Set up the JFrame
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // specifies that when the user clicks the close button (usually
                                                        // an 'X' in the window's title bar) to close the JFrame, the
                                                        // program should exit
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Display field
        displayField = new JTextField(); // create new instance of JTextField
        displayField.setEditable(false); // false bcs user cannot directly edit text in the field
        add(displayField, BorderLayout.NORTH); // text field will be in positioned at the top north of the borderlayout
                                               // within JFrame

        // Button panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(6, 4)); // grid layout size for button

        // Button labels
        String[] buttonLabels = {
                "C", "+/-", "%", "/", // C is clear button & another function ("+/-", "%" ) dont have function yet
                "7", "8", "9", "*",
                "4", "5", "6", "-", // how the button will display
                "1", "2", "3", "+",
                "0", ".", "=", "Del", // delete button
                "x^2", "sqrt", "x^n", "1/x"
        };

        // Add button to the panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this); // refers to the instance of the class that implements th ActionListener
                                            // interface
            buttonsPanel.add(button);
        }

        add(buttonsPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // method of the actionListener interface
        String command = e.getActionCommand(); // retrieve action command associated with the action

        switch (command) { // why use switch? used to perform different actions based on value of the
                           // command
            case "=":
                calculateResult(); // display the result
                break;

            case "C":
                clearInput(); // use to start new calculation
                break;

            case "Del":
                deleteInput(); // delete the last entered char (backspace function)
                break;

            case "x^2":
                square();
                break;

            case "sqrt":
                squareRoot();
                break;

            case "x^n":
                power();
                break;

            case "1/x":
                reciprocal();
                break;

            default:
                if (isOperator(command.charAt(0))) { // check if the command is an operator using
                    handleOperator(command.charAt(0)); // handleoperator will assume it's a digit or other input &
                                                       // update the display
                } else {
                    currentInput += command;
                    displayField.setText(currentInput);
                }
                break;
        }
    }

    private void calculateResult() {
        try {
            double operand = Double.parseDouble(currentInput);
            // switch statement on the lastoperator
            switch (lastOperator) {
                case '+':
                    result += operand;
                    break;

                case '-':
                    result -= operand;
                    break;

                case '*':
                    result *= operand;
                    break;

                case '/':
                    if (operand != 0) {
                        result /= operand;
                    } else {
                        displayField.setText("Error : Division by zero");
                        return;
                    }
                    break;

                case '^':
                    result = Math.pow(result, operand);
                    break;

                default:
                    result = operand;
            }

            if (Double.isFinite(result)) {
                displayField.setText(Double.toString(result));
            } else {
                displayField.setText("Error: Invalid result");
            }

            if (result % 1 == 0) { // check if the value is int or not
                displayField.setText(Integer.toString((int) result)); // true : it'll show text int
            } else {
                displayField.setText(Double.toString(result)); // double value
            }

            currentInput = "";
        } catch (NumberFormatException ex) {
            displayField.setText("Error");
            currentInput = "";
        }
    }

    private void handleOperator(char operator) {
        if (!currentInput.isEmpty()) { // condition: to ensure that there is a numeric input before performing the
                                       // operation
            calculateResult();
            lastOperator = operator;
        }
    }

    private void clearInput() {
        currentInput = "";
        displayField.setText("");
        result = 0.0;
        lastOperator = ' ';
    }

    private void deleteInput() {
        if (!currentInput.isEmpty()) {
            currentInput = currentInput.substring(0, currentInput.length() - 1);
            displayField.setText(currentInput);
        }
    }

    private void square() {
        if (!currentInput.isEmpty()) {
            double value = Double.parseDouble(currentInput);
            result = Math.pow(value, 2);
            displayField.setText(Double.toString(result));
            currentInput = "";
        }
    }

    private void squareRoot() {
        if (!currentInput.isEmpty()) {
            double value = Double.parseDouble(currentInput);
            if (value >= 0) {
                result = Math.sqrt(value);
                displayField.setText(Double.toString(result));
                currentInput = "";
            } else {
                displayField.setText("Error: Invalid input for sqrt");
            }
        }
    }

    private void power() {
        if (!currentInput.isEmpty()) {
            lastOperator = '^';
            result = Double.parseDouble(currentInput);
            currentInput = "";
        }
    }

    private void reciprocal() {
        if (!currentInput.isEmpty()) {
            double value = Double.parseDouble(currentInput);
            if (value != 0) {
                result = 1 / value;
                displayField.setText(Double.toString(result));
                currentInput = "";
            } else {
                displayField.setText("Error: Division by zero");
            }
        }
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || (currentInput.equals("x^n") && ch == '^');
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setVisible(true);
        });
    }
}
