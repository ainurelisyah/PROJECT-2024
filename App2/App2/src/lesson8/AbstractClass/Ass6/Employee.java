package lesson8.AbstractClass.Ass6;

abstract class Employee {

    private String name;
    private int id;
    private double salary;

    //Constructor 
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    // Abstract Method
    public abstract void calculateSalary();

    //Method 
    public void displayDetails(){
        System.out.println("Employee Details: ");
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: RM " + salary);
    }

    //Getter
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    //Setters 
    public void setSalary(double salary){
        this.salary = salary;
    }
}
