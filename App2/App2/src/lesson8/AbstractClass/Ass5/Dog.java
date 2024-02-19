package lesson8.AbstractClass.Ass5;

public class Dog extends Animal {

    //Constructor
    public Dog(String name, int age){
        super (name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof!");
    }  
}
