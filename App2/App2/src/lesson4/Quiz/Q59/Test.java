package lesson4.Quiz.Q59;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012,1,11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");
        System.out.println(formatter.format(date.minus(period)));
    }
}
