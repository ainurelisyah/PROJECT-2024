package lesson8.AbstractClass.Ass6;

public class Manager extends Employee{

    //Constructor
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void calculateSalary() {
        setSalary(50000);
    }
}
