package lesson9.Assignment.Calculator;

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
        } catch (NumberFormatException ex) {
            displayField.setText("Error");
            currentInput = "";
        }

        //save calculation history to a file
        saveHistoryToFile(); 
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
