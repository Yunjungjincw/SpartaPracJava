package dayTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
       DateTimeFormatter fomatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
       String fulltFormat = fomatter.format(LocalTime.now());
       System.out.println(fulltFormat);
    }
}