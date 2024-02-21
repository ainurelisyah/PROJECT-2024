package lesson11.QUIZ.Q5;

class X {
    void A() {
        System.out.println("A");
    }
}

class Y extends X {
    void A() {
        System.out.println("A-");
    }

    void B() {
        System.out.println("B-");
    }

    void C() {
        System.out.println("C-");
    }
}


public class Test {
    public static void main(String[] args) {
        X obj = new Y(); // cannot bcs Y has many obj than X has
        obj.A();
        //obj.B(); //error bcs class X doesnt have obj B
        //obj.C(); //error bcs class X doesnt have obj C
    }
    
}
