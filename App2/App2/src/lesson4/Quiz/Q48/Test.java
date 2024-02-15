package lesson4.Quiz.Q48;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

        if(list.remove(2)) {
            list.remove("THREE");
        }

        System.out.println(list);

    }
}
