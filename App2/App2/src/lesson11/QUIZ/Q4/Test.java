package lesson11.QUIZ.Q4;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("M");
        sb.append(sb.append("A"));  //(sb.append) become MA
        System.out.println(sb);          //MAMA
    }
}
