package lesson8.AbstractClass.Ass7;

public class Triangle implements SortableShape {

    private double base;
    private double height;
    private String name = "Triangle";

    //Constructor 
    public Triangle( double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String getName() {
        return name;
    }
}
