package lesson8.example;

public class Rectangle extends Border implements Shape, Filler {

    private double height;
    private double width;

    //constructir rectangle
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * height + width;
    }
    @Override
    public boolean fillable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fillable'");
    }

    

   
    
}
