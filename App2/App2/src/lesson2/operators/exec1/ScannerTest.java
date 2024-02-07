package lesson2.operators.exec1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        if(x!=y){
            System.out.println("1");
        }
        if (x>y) {
            System.out.println("2");
        }
        if (x%y == 0) {
            System.out.println("3");
        }

        scanner.close();

    }


}
