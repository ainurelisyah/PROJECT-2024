package Calculator2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class MainCalculator extends SimpleCalculator {

    @Override
    protected void calculateResult() {
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

            // Save calculation history to MySQL database
            saveHistoryToDatabase(); // Add this line to save the history to the database
        } catch (NumberFormatException ex) {
            displayField.setText("Error");
            currentInput = "";
        }
    }

    //Save history to MySQL database 
    private void saveHistoryToDatabase(){
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            String url = "jdbc:mysql://localhost:3306/calculator"; 
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement
            String sql = "INSERT INTO data (data, date) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, "Expression: " + currentInput + ", Result: " + result);
                preparedStatement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));

                // Execute the statement
                preparedStatement.executeUpdate();
            }

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void handleOperator(char operator) {
        if (!currentInput.isEmpty()) { // condition: to ensure that there is a numeric input before performing the
                                       // operation
            calculateResult();
            lastOperator = operator;
        }
    }

    @Override
    protected void clearInput() {
        currentInput = "";
        displayField.setText("");
        result = 0.0;
        lastOperator = ' ';
    }

    @Override
    protected void deleteInput() {
        if (!currentInput.isEmpty()) {
            currentInput = currentInput.substring(0, currentInput.length() - 1);
            displayField.setText(currentInput);
        }
    }

    @Override
    protected void square() {
        if (!currentInput.isEmpty()) {
            double value = Double.parseDouble(currentInput);
            result = Math.pow(value, 2);
            displayField.setText(Double.toString(result));
            currentInput = "";
        }
    }

    @Override
    protected void squareRoot() {
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

    @Override
    protected void power() {
        if (!currentInput.isEmpty()) {
            lastOperator = '^';
            result = Double.parseDouble(currentInput);
            currentInput = "";
        }
    }

    @Override
    protected void reciprocal() {
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

    @Override
    protected boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || (currentInput.equals("x^n") && ch == '^');
    }

}
