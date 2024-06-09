package A_DateAndTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.concurrent.TimeUnit;

/**
 * 
 * 
 * 
 */
public class H_AlteringDatesAndTimes {

	public static void main(String[] args) {

		LocalDateTime dt1= LocalDateTime.now();
		
		System.err.println("Now: "+dt1);
		
		
		LocalDateTime dt2= dt1.plusHours(2);
		LocalDateTime dtm= dt1.minusHours(2);
		
		System.out.println("Plus 2hr: "+dt2);
		System.out.println("Minus 2hr: "+dtm);
		
		
		LocalDateTime dt3= dt1.plus(Period.ofWeeks(2));
		LocalDateTime dtd= dt1.plus(Duration.ofHours(12));
		
		System.out.println("+2weeks Period: "+dt3);
		System.out.println("+2hours Duration: "+dtd);
		
		
		LocalDateTime dt4= dt1.withHour(3);	// editing existing hour value
				
		System.out.println("with '3' Hour: "+dt4);
		
		
		
		
		
		
		
		
		
		
		try {
			System.out.println("\n\n\n\n\n---*---");
			LocalDateTime intitialize= LocalDateTime.now();
			System.out.println(intitialize);
			TimeUnit.SECONDS.sleep(5);
			intitialize=LocalDateTime.now();
			System.out.println(intitialize);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
