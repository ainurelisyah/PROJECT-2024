package lesson4.Shape;

//Constructor for Circle
class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    //Implementation of calculateArea for Circle
    @Override
    public double calculateArea(){
        return PI * radius * radius;
    }
}
