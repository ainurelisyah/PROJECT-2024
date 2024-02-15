package lesson4.Quiz.Q61;

public class Test {
    private static boolean flag = !true;
    public static void main(String[] args) {
        System.out.println(!flag ? args[0] : args[1]);
    }
}
