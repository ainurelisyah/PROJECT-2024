package lesson8.AbstractClass.Ass6;

public class Developer extends Employee {

    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    public void calculateSalary() {
        setSalary(10000);
    }
    
}
