package lesson4.Quiz.Q16;

abstract class Helper {
    int num = 100;
    String operation = null;

    protected abstract void help();

    void log(){
        System.out.println("Helper-log");
    }
    
}
