package A_DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;

public class A_Date_Time_DateTime {

	public static void main(String[] args) {

		System.out.println("-----");

		
		LocalDate ld1= LocalDate.now();
		LocalDate ld2= LocalDate.of(2024, 2, 29);
		LocalDate ld3= LocalDate.of(2024, Month.FEBRUARY, 29);
		
		System.out.println(ld1);
		System.out.println(ld2);
		System.out.println(ld3);
		
		LocalTime lt1= LocalTime.now();
		LocalTime lt2= LocalTime.of(3, 33); // H, m
		
		System.out.println(lt1);
		System.out.println(lt2);
		
		LocalDateTime dt1= LocalDateTime.now();
		LocalDateTime dt2= LocalDateTime.of(2024, 2, 29, 3, 33);
		LocalDateTime dt3= LocalDateTime.of(ld3, lt2);
		
		System.out.println(dt1);
		System.out.println(dt2);
		System.out.println(dt3);
		
		YearMonth ym= YearMonth.of(2024, 2);//others for practices
		System.out.println(ym);
		DayOfWeek dw= DayOfWeek.of(1);
		System.out.println(dw);
		
		//Error
		//LocalDate invalidDate= LocalDate.of(2024, 2, 32);
		//System.out.println(invalidDate);
		
		
		
	}
}
