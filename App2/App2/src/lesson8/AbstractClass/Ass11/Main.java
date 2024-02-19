package lesson8.AbstractClass.Ass11;

public class Main {
    public static void main(String[] args) {
        
        RemoteControl tvRemote = new TVRemote();
        RemoteControl streoRemote = new StereoRemote();

        System.out.println("Testing TVRemote: ");
        tvRemote.powerOn();
        tvRemote.volumeUp();
        tvRemote.volumeDOwn();
        tvRemote.powerOff();
        System.out.println(""); // separator

        System.out.println("Testing StereoRemote: ");
        streoRemote.powerOn();
        streoRemote.volumeUp();
        streoRemote.volumeDOwn();
        streoRemote.powerOff();
    }
}
