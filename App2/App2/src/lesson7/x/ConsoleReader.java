package lesson7.x;

import java.util.Scanner;

public class ConsoleReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num = sc.nextInt();
        System.out.println("Your age is : " + num);
        sc.close();

    }
}
