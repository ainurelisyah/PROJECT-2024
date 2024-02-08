package lesson3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
        // Code that might throw an exception
        FileInputStream file = new FileInputStream("myfile.txt");
        } catch (FileNotFoundException e) {
        // Exception handling     

            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace();
        } finally {
        // Cleanup code
            System.out.println("Finally block executed.");
        }
    }
}
    
