package lesson8.AbstractClass.Ass6;

public class Intern extends Employee {

    public Intern(String name, int id) {
        super(name, id);
    }

    @Override
    public void calculateSalary() {
        setSalary(2000);
    }
}
