package lesson8.Ass1;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * Math.pow(this.radius, 2);
    }

    public String toString(){
        return "Circle[" + super.toString() + ", radius = " + radius + "]";
    }

   


    
}
