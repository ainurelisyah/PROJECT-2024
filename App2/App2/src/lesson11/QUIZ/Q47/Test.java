package lesson11.QUIZ.Q47;

class Calculator {
    int calculate(int i1, int i2) {
        return i1 + i2;
    }
}
public class Test {
    public static void main(String[] args) {
        byte b = 100;
        int i = 20;
        System.out.println(new Calculator().calculate(b,i));
    }
}
