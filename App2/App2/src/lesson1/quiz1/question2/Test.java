package lesson1.quiz1.question2;

public class Test {
    //static int i1 =10;  *should this
    int i1 =10; 
    int i2 = 20;

    int add(){
        return this.i1 + this.i2; //Line n1
    }

    public static void main(String[] args) {
        System.out.println(new Test().add()); //Line n2
    }
    
}

//i1 is a static variable and i2 is an instance variable. 
//Preferred way to access static variable i1 inside add() method is by using 'i1' or 'Test i1'.
//Even though 'this.i7' is not the recommended way but it works.

//And instance variable i2 can be accessed inside add() method by using 'i2' or 'this.i2'.
//Hence, Line n1 compiles successfully.

//As add() is an instance method of Test class, so an instance of Test class is needed to invoke the add() method.
//'new Test().add()' correctly invokes the add() method of the Test class and returns 30. 
//Line n2 prints 30 on to the console.
