package lesson11.QUIZ.Q24;

public class Test {
    
    public static void convert(String s)
    throws IllegalArgumentException, RuntimeException, Exception {
        if(s.length() == 0){
            throw new RuntimeException("LENGTH SHOULD BE GRATER THAN 0");
        }
    }

    public static void main(String [] args) {
        try {
            convert("");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
