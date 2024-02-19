package lesson8.AbstractClass.Ass3;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.start();
        bicycle.accelerate(100);
        System.out.println("");
        bicycle.brake(10);
        bicycle.stop();
        System.out.println("");

        Car car = new Car();
        car.start();
        car.accelerate(120);
        System.out.println("");
        car.brake(30);
        car.stop();

    }
    
}
