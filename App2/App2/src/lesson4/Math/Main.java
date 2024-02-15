package lesson4.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result of adding 10 + 5 = " + MathUtils.add(10,5));
        System.out.println("Result of substracting 8 from 15 = " + MathUtils.sub(15,8));
        
        int number = 17;
        if (MathUtils.isEven(number))
        System.out.println(number + " is even.");
        else
        System.out.println(number + " is odd.");
    }
}
