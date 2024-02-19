package lesson8.AbstractClass.Ass1;

public class Square extends Shape {

    private double height;
    private double width;

    public Square(String color, boolean filled, double width, double height) {
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
        return "Square[" + super.toString() + ", width = " + width + ", height=" + height + "]";
    }

    
}
