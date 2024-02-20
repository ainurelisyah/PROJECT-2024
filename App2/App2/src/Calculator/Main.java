package Calculator;

import java.sql.SQLException;

import javax.swing.SwingUtilities;

public class Main {
    // inner class
    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new MainCalculator();
            calculator.setVisible(true);
        });
    }
}
