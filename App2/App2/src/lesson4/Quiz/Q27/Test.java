package lesson4.Quiz.Q27;

class Parent {
    public String toString(){
        return "Inner";
    }
}

class Child extends Parent {
    public String toString(){
        return super.toString().concat("Peace!");
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(new Child());
    }
}
