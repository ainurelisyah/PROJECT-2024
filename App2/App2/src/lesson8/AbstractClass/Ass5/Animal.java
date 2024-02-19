package lesson8.AbstractClass.Ass5;

abstract class Animal {
    private String name;
    private int age;

    //Constructor
    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Methods 
    public void eat(){
        System.out.println(name + "is eating.");
    }

    public void sleep(){
        System.out.println(name + "is sleeping.");
    }

    //Abstract method
    public abstract void makeSound(); 

    //Getters 
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
