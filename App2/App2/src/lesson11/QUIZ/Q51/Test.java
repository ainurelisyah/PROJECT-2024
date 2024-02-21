package lesson11.QUIZ.Q51;

public class Test {
    public static void main(String[] args) {
        int var = 3;
        String [] [] arr = new String [--var] [var++];
        arr[1][1] = "X";
        arr[1][2] = "Y";
        for(String [] arr1 : arr) {
            for(String s : arr1) {
                if(s!= null)
                System.out.println(s);
            }
        }
    }
}
