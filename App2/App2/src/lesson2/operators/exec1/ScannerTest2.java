package lesson2.operators.exec1;
import java.util.Scanner;

public class ScannerTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter p:");
        boolean p = scanner.nextBoolean();

        System.out.println("Enter q:");
        boolean q = scanner.nextBoolean();

        if(p && q){
            q=false;
        } else {
            if(!q)
            System.out.println(p);
            if(p==q)
            System.out.println(p || q);
        }
        scanner.close();
        System.out.println(q);
    }
    
}
