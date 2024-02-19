package lesson8.AbstractClass.Ass3;

public class Bicycle implements Vehicle {

    private boolean bicycleStart;
    private double bcurrentSpeed;

    public Bicycle(){
        this.bicycleStart = false;
        this.bcurrentSpeed = 0.0;
    }

    @Override
    public void start() {
        if(!bicycleStart) {
            System.out.println("Bicycle started");
            bicycleStart = true;
        } else {
            System.out.println("Bicycle is already moving.");
        } 
    }

    @Override
    public void stop() {
        if(bicycleStart) {
            System.out.println("Bicycle stopped");
            bicycleStart = false;
            bcurrentSpeed = 0.0;
        } else {
            System.out.println("Bicycle is not moving.");
        }  
    }

    @Override
    public void accelerate(double speed) {
        if (bicycleStart){
            bcurrentSpeed += speed;
            System.out.println("Bicycle is accelerating. Current speed: " + bcurrentSpeed + " km/h");
        } else {
            System.out.println("Bicycle cannot accelerate. Bicycle is stopped.");
        }
    }


    @Override
    public void brake(double speed) {
            if(bicycleStart) {
                bcurrentSpeed -= speed;
                if (bcurrentSpeed < 0) {
                    bcurrentSpeed = 0;
                }
    
                System.out.println("Bicycle is stopped. Current speed: " + bcurrentSpeed + " km/h");
            } else {
                System.out.println("Bicycle cannot brake. The bicycle is not moving.");
            }
    }
    
}
