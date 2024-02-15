package lesson4.Shape;

//Constructor for Rectangle
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //Implementation of calculateArea for Rectangle
    @Override
    public double calculateArea(){
        return length*width;
    }
}
