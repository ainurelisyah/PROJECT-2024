package lesson8.AbstractClass.Ass11;

public class StereoRemote implements RemoteControl {

    private boolean powerOn;
    private int volume; 

    //COntructor 
    public StereoRemote(){
        this.powerOn = false;
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("Stereo is powered on.");
    }

    @Override
    public void powerOff() {
        powerOn = false;
        System.out.println("Stereo is powered off.");
    }

    @Override
    public void volumeUp() {
        if (powerOn) {
            volume++;
            System.out.println("Volume increased: " + volume);
        } else {
            System.out.println("Cannot adjust volume. Stereo is powered off.");
        }
    }

    @Override
    public void volumeDOwn() {
        if (powerOn && volume > 0){
            volume--;
            System.out.println("Volume decreased: " + volume);
        } else {
            System.out.println("Cannot adjust volume. Stereo is either powered off or already at minimum volume.");
        }
    }
    
}
