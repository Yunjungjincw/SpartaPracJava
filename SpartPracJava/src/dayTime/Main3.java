package dayTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main3 {
    public static void main(String[] args) {
      DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM-dd");
      String myDate = myFormatter.format(LocalDate.now());
      System.out.println(myDate);
    }
}