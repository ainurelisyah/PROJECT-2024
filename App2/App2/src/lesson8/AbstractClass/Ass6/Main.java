package lesson8.AbstractClass.Ass6;

public class Main {
    public static void main(String[] args) {
        //create instance object
        Manager manager = new Manager("Zaid", 101);
        Developer developer = new Developer("Ainur", 272);
        Intern intern = new Intern("Atiqah", 162);

        //calculate and display details for each employee
        manager.calculateSalary();
        manager.displayDetails();
        System.out.println("");

        developer.calculateSalary();
        developer.displayDetails();
        System.out.println("");

        intern.calculateSalary();
        intern.displayDetails();
    }
}
