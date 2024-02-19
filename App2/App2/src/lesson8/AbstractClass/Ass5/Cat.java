package lesson8.AbstractClass.Ass5;

public class Cat extends Animal {

    //Constructor
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meoww!");
    } 
}
