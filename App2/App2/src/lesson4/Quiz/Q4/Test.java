package lesson4.Quiz.Q4;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        processStringArray(arr, p->!false);
    }

    private static void processStringArray(String[] arr, Predicate<String>predicate){
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
