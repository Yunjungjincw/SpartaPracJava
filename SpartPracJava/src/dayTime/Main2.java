package dayTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("now usages");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime= LocalDateTime.now();
        
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        
        System.out.println("of() usage");
        LocalDate dateOf = LocalDate.of(2022, 11, 23);
        LocalTime timeOf = LocalTime.of(00, 13, 0);
        
        System.out.println(dateOf);
        System.out.println(timeOf);
    }
}