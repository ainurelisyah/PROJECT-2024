package lesson11.QUIZ.Q70;

public class Test {
    public static void main(String[] args) {
        String arr1 = new String[2];
        arr1[0] = "A";
        arr1[1] = "B";
        arr2 = arr3 = arr1;
        log (arr2);
    }

    private static void log (String... vals) {
        for (String s : vals)
        System.out.println(s);
    }
}
