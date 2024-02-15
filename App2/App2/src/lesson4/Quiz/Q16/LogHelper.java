package lesson4.Quiz.Q16;

public class LogHelper extends Helper {
     int num = 200;
    protected String operation = "LOGGING";

    protected void help(){
        System.out.println("LogHelper-help");
    }

    public void log(){
        System.out.println("LogHelper-log");
    }

    public static void main(String[] args) {
        new LogHelper().help();
    }
    
}
