package A_DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 	Represent the amount of time in days, months, years not a time!
 * 
 * 	only for day!! not for time
 * 
 */
public class F_Period {

	public static void main(String[] args) {

		LocalDate ld1= LocalDate.of(2000,1,1);
		LocalDate ld2= LocalDate.of(2001,12,30);
		
		Period p1= Period.of(2, 1, 1);
		Period p2= Period.between(ld1, ld2);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
		Period p3= Period.between(ld1, ld2);
		int days1= p3.getDays();// only day number
		
		long days2= ChronoUnit.DAYS.between(ld1, ld2);// all days calculated
		
		System.out.println(days1);
		System.out.println(days2);
			
	}

}
