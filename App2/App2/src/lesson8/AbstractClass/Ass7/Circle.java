package lesson8.AbstractClass.Ass7;

public class Circle implements SortableShape {

    private double radius;
    private String name = "Circle";

    //Constructor
    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
       return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
