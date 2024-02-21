package lesson11.QUIZ.Q54;

import java.sql.SQLException;

public class Test {
    private static void getReport() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e){
            throw null;
        }
    }

    public static void main(String[] args) {
        try {
            getReport();
        } catch(SQLException e) {
            System.out.println("REPORT ERROR");
        }
    }
}
