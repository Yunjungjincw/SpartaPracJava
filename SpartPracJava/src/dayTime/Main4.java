package dayTime;

import java.time.LocalDate;
import java.time.Period;

public class Main4 {
    public static void main(String[] args) {
       LocalDate today = LocalDate.now();
       LocalDate birthdy = LocalDate.of(1993, 11, 28);
       Period period = Period.between(today, birthdy);
       
       System.out.println(period.getMonths());
       System.out.println(period.getDays());
    	}
    }