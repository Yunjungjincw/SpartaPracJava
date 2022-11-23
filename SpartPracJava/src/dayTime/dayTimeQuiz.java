package dayTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class dayTimeQuiz {

	public static void main(String[] args) {
		
		//년 월 일
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	      String myDate = myFormatter.format(LocalDate.now());
		
		// 현재시간
		DateTimeFormatter fomatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	       String fulltFormat = fomatter.format(LocalTime.now());
		
		
		// 맨마지막 일자
		DateTimeFormatter mFormatter = DateTimeFormatter.ofPattern("MM-dd");
	      String mDate = mFormatter.format(LocalDate.now());
		
	      System.out.println(myDate+" "+fulltFormat+" "+mDate);
	}

}
