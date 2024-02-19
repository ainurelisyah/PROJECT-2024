package lesson8.AbstractClass.Ass7;

public class Rectangle implements SortableShape {

    private double length;
    private double width;
    private String name = "Rectangle";

    //Constructor 
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String getName() {
        return name;
    }

}
