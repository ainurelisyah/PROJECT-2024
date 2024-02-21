package lesson11;

import java.util.Arrays;
import java.util.List;

public class Lambda { 

     static List<Integer> ary = Arrays.asList(1,2);
     static List<Integer> ary_filtered;

    public static void main(String[] args) {
         ary.forEach((a) -> System.out.println(a));
        
    }
}