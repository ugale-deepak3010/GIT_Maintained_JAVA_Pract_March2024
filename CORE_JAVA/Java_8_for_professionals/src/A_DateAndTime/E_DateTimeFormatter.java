package A_DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class E_DateTimeFormatter {

	public static void main(String[] args) {

		LocalDateTime ldt1= LocalDateTime.now();
		
		String formattedDateTime= DateTimeFormatter.ISO_DATE_TIME.format(ldt1);
		String formattedDate= DateTimeFormatter.ISO_DATE.format(ldt1);
		
		System.out.println(ldt1);
		System.out.println(formattedDateTime);
		System.out.println(formattedDate);
	
		DateTimeFormatter custom_formatter= DateTimeFormatter.ofPattern("dd-MMMM-yyyy"); 
		String custom_formattedDateTime= custom_formatter.format(ldt1);
		
		System.out.println(custom_formattedDateTime);
		
		// FormatStyle.Long will not work with ofLocalizedDateTime must use ofLocalizedDate`
		String formatStyleDate= DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt1);
		
		System.out.println(formatStyleDate);
		
	}

}
