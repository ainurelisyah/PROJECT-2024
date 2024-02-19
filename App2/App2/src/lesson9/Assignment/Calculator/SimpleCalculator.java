package lesson9.Assignment.Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public abstract class SimpleCalculator extends JFrame implements ActionListener {  //interfaces

    protected JTextField displayField;
    protected String currentInput; // USe string bcs user input for numerical values & operators (+-/*)
    protected char lastOperator;
    protected double result;

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
                "C", "+/-", "%", "1/x", // C is clear button & another function ("+/-", "%" ) dont have function yet
                "x^2", "sqrt", "x^n", "/", 
                "7", "8", "9", "*",
                "4", "5", "6", "-", // how the button will display
                "1", "2", "3", "+",
                "0", ".", "=", "Del" // delete button
                
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

    //ActionListener inner class 
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

    protected abstract void calculateResult(); 
        
    protected abstract void handleOperator(char operator);

    protected abstract void clearInput();

    protected abstract void deleteInput();

    protected abstract void square();

    protected abstract void squareRoot();

    protected abstract void power(); 

    protected abstract void reciprocal();

    protected abstract boolean isOperator(char ch);

    protected void saveHistoryToFile(){
        try (PrintWriter writer = new PrintWriter(new FileWriter("calculator_history.txt" , true))) {
            writer.println("Expression: " + currentInput + ", Result: " + result);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    //inner class 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new MainCalculator();
            calculator.setVisible(true);
        });
    }
}
