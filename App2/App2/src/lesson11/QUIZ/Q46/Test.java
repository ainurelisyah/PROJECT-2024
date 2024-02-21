package lesson11.QUIZ.Q46;

import java.util.List;

class A {}
class B extends A{}

abstract class Super {
    abstract List<A> get() throws IndexOutOfBoundsException;
}

abstract class Sub extends Super {
    abstract List<A> get() throws ArrayIndexOutOfBoundsException;
}



public class Test {
    
}
