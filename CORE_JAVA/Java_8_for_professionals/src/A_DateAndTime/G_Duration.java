package A_DateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * Represent an amount of time in seconds or nanoseconds 
 * Minutes & Hours and the DAYS (not month) unit can be used to work with duration.
 *   
 */
public class G_Duration {

	public static void main(String[] args) {
		
		LocalTime executionStart= LocalTime.now();
		
		LocalTime lt1= LocalTime.now();
		LocalTime lt2= LocalTime.of(1, 30);
		LocalTime lt3= LocalTime.of(2, 45);
		
		Duration d1= Duration.of(2, ChronoUnit.DAYS);
		Duration d2= Duration.ofMinutes(65);
		Duration d3= Duration.between(lt1, lt2);
		Duration d4= Duration.between(lt2, lt3);
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
				
		try {
			@SuppressWarnings("unused")
			Duration errorDur= Duration.of(2, ChronoUnit.MONTHS);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		LocalTime executionEnd= LocalTime.now();
		
		Duration totalExecutionTime= Duration.between(executionStart, executionEnd);
		System.out.println(totalExecutionTime);
		
		
	}

}
