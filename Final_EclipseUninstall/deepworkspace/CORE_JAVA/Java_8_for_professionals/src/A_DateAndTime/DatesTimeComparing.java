package A_DateAndTime;

import java.time.LocalDateTime;

/**
 * 
 * 	CompareTo
 * 	isAfter
 * 	isBefore
 * 	isEqual
 * 
 */
public class DatesTimeComparing {

	public static void main(String[] args) {

		LocalDateTime ldt1= LocalDateTime.now();
		LocalDateTime ldt2= LocalDateTime.of(2000, 1, 1, 1, 1);
		
		System.out.println(ldt1+"\n"+ldt2);
		
		System.out.println(" compareTo: "+ldt1.compareTo(ldt2));	//years
		System.out.println(" Before "+ldt1.isBefore(ldt2));
		System.out.println(" After "+ldt1.isAfter(ldt2));
		System.out.println(" Equal "+ldt1.isEqual(ldt2));
		
	}

}
