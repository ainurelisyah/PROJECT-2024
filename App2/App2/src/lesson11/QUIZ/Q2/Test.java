package lesson11.QUIZ.Q2;

class Base {
    String msg = "INHALE";
}

class Derived extends Base {
    Object msg = "EXHALE";
}

public class Test {
    public static void main(String[] args) {
        Base obj1 = new Base();
        Base obj2 = new Derived(); //polymorphism (upcasting) //Base class is accedded, so obj2 refers to msg in BASE 
        Derived obj3 = (Derived) obj2; //Reference type Derived class
        String text = obj1.msg + "-" + obj2.msg + "-" + obj3.msg;
                      // INHALE   -   INHALE    - EXHALE   
        System.out.println(text);
    }
}
