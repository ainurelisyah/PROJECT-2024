package lesson4.Shape;

public class Main{
    public static void main(String[] args) {
        //Create instances of Rectangle and Circle 
        Rectangle rectangle = new Rectangle(5,8);
        Circle circle = new Circle(3);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}