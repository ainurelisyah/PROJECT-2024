package lesson4.Quiz.Q54;

public class Test {
    private static void m1() throws Exception{
        throw new Exception();

    }

    public static void main(String[] args) {
        try{
            m1();
        } finally{
            System.out.println("A");
        }
    }
}
