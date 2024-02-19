package lesson8.AbstractClass.Ass5;

public class AnimalHierarchyTest {
    public static void main(String[] args) {
        //Test the Animal Hierarchy
        Dog dog = new Dog("Goofy", 3);
        Cat cat = new Cat("Nobita", 2);
        Bird bird = new Bird("Tweety", 2);

        dog.eat();
        dog.sleep();
        dog.makeSound();
        System.out.println("");

        cat.eat();
        cat.sleep();
        cat.makeSound();
        System.out.println("");

        bird.eat();
        bird.sleep();
        bird.makeSound();
    }
}
