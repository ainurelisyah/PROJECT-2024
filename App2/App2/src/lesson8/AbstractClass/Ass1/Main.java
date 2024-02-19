package lesson8.AbstractClass.Ass1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 3.5);
        double area= circle.getArea();
        double perimeter = circle.getPerimeter();
        System.out.printf("Circle - Area: %f, Perimeter: %f ", area, perimeter);
        System.out.println("");
        
        Rectangle rectangle = new Rectangle("Blue", true, 2.5, 5.7);
        double area2= rectangle.getArea();
        double perimeter2 = rectangle.getPerimeter();
        System.out.printf("\nRectangle - Area: %f, Perimeter: %f ", area2, perimeter2);
        System.out.println("");

        Square square = new Square("Green", true, 1.5, 5.5);
        double area3= square.getArea();
        double perimeter3 = square.getPerimeter();
        System.out.printf("\nSquare - Area: %f, Perimeter: %f ", area3, perimeter3);

        
    }
}
