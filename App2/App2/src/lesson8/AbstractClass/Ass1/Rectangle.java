package lesson8.AbstractClass.Ass1;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public String toString(){
        return "Rectangle[" + super.toString() + ", width = " + width + ", height=" + height + "]";
    }

    

    
    
}
