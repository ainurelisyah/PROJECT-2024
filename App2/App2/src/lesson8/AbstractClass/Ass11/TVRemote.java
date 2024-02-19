package lesson8.AbstractClass.Ass11;

public class TVRemote implements RemoteControl {

    private boolean powerOn;
    private int volume; 

    //Constructor
    public TVRemote(){
        this.powerOn = false;
        this.volume = 0;
    }

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("TV is powered on.");
    }

    @Override
    public void powerOff() {
        powerOn = false;
        System.out.println("TV is powered off.");
    }

    @Override
    public void volumeUp() {
       if(powerOn) {
        volume++;
        System.out.println("Volume increased:" + volume);
       } else {
        System.out.println("Cannot adjust volume. TV is power off.");
       }
    }

    @Override
    public void volumeDOwn() {
        if (powerOn && volume > 0){
            volume--;
            System.out.println("Volume decreased:" + volume); 
        } else {
            System.out.println("Cannot adjust volume. TV is either powered off or already at minimum volume.");
        }
    }
    
}
