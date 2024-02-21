package lesson11.QUIZ.Q65;

interface I1 {
    public static void print (String str) {
        System.out.println("I1:" + str.toUpperCase());
    }
}

class C1 implements I1 {
    void print(String str) {
        System.out.println("C1:" + str.toLowerCase());
    }
}

public class Test {
    public static void main(String[] args) {
        I1 obj = new C1();
        obj.print("Java");
    }
}
