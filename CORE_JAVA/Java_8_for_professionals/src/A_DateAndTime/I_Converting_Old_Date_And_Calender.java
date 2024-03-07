package A_DateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;


public class I_Converting_Old_Date_And_Calender {

	public static void main(String[] args) {


		@SuppressWarnings("deprecation")
		Date dt= new Date(2024, 3, 1);	//1900
		
		System.out.println("dt: "+dt);
		System.out.println("dt instant: "+dt.toInstant());// 3924
		
		@SuppressWarnings("deprecation")
		Date dt2= new Date(124, 3, 1);	
				
		System.out.println("dt2 instant: "+dt2.toInstant());
		
		
		
		LocalDateTime ld1 = dt2.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		Calendar calendar= Calendar.getInstance();
		
		System.out.println(calendar.toInstant());
		
		LocalDateTime cl = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		System.out.println(cl);
		System.out.println(ld1);
		
		
		
		
		

	}

}
