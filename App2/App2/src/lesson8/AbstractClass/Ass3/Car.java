package lesson8.AbstractClass.Ass3;

public class Car implements Vehicle {

    private boolean carStart;
    private double currentSpeed;

    public Car(){
        this.carStart = false;
        this.currentSpeed = 0.0;
    }

    @Override
    public void start() {
        if(!carStart) {
            System.out.println("Car started");
            carStart = true;
        } else {
            System.out.println("Car is already moving.");
        }    
    }

    @Override
    public void stop() {
        if(carStart) {
            System.out.println("Car stopped");
            carStart = false;
            currentSpeed = 0.0;
        } else {
            System.out.println("Car is already stopped.");
        }  
    }

    @Override
    public void accelerate(double speed) {
        if (carStart){
            currentSpeed += speed;
            System.out.println("Car is accelerating. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Car cannot accelerate. Car is stopped.");
        }
    }

    @Override
    public void brake(double speed) {
        if(carStart) {
            currentSpeed -= speed;
            if (currentSpeed < 0) {
                currentSpeed = 0;
            }

            System.out.println("Car is braking. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Car cannot brake. The car is not moving.");
        }
        
    }
    
}
