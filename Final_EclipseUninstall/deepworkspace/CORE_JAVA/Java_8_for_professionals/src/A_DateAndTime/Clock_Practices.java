package A_DateAndTime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Clock_Practices {

	public static void main(String[] args) {

		Clock clock1 = Clock.systemDefaultZone();
		Instant instant = clock1.instant();
		

		System.out.println(clock1);
		System.out.println(instant);

		System.out.println("--------");

		Clock clock2 = Clock.offset(clock1, Duration.ofHours(2));
		Instant instant2 = clock2.instant();

		System.out.println(clock2);
		System.out.println(instant2);

	}

}
