package A_DateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class B_ZoneDateTime_ZoneID {

	public static void main(String[] args) {

		for (String zoneId : ZoneId.getAvailableZoneIds()) {

			String zoneIdDispAs = ZoneId.of(zoneId).getDisplayName(TextStyle.FULL, Locale.US);

			System.out.println(zoneId + " ---- " + zoneIdDispAs);
		}

		LocalDateTime ldt1 = LocalDateTime.now();
		ZonedDateTime zdt1 = ZonedDateTime.now();
		ZonedDateTime zdt2 = ZonedDateTime.of(ldt1, ZoneId.of("Asia/Kolkata"));
		ZonedDateTime zdt3 = ZonedDateTime.of(ldt1, ZoneId.of("US/Pacific"));

		System.out.println(ldt1);
		System.out.println(zdt1);
		System.out.println(zdt2);
		System.out.println(zdt3);

	}

}
