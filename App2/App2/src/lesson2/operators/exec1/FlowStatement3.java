package lesson2.operators.exec1;
import java.util.Scanner;

public class FlowStatement3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, nFact;
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        scanner.close();

        i = 1;
        nFact = 1;

        while (i<=n) {
            nFact *= i;
            i += 1;
        }

        System.out.println("n!="+ nFact);
    }
}
