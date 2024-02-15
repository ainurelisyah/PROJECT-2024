package lesson4.Quiz.Q17;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";

        System.out.println(s1.equals(s2)); //after modified
        System.out.println(s1==s2);
    }
}
