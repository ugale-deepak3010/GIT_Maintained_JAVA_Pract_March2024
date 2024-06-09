package E_StreamAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.stream.Stream;

public class E_ParallelStreams {

	public static void main(String[] args) {

//15
		int totalNor= Stream.of(1,2,3,4,5).reduce(100, (a,b)->a+b);
		int totalPar= Stream.of(1,2,3,4,5).parallel().reduce(100, (a,b)->a+b);
		// result vary because it's adding every time identity ^ 
		
		System.out.println(totalNor);
		System.out.println(totalPar);
		
		// performance test - On lower load seq stream is fast and heavy load parallel is fast
		LocalTime startTime1= LocalTime.now();
		
		int totalNor1= Stream.of(1,2,3,4,5).reduce(100, (a,b)->a+b);
		
		LocalTime endTime1= LocalTime.now(); 
		int totalTime1 = Duration.between(startTime1, endTime1).getNano();
		System.out.println(totalTime1);
		
		//--------2---------
		LocalTime startTime2= LocalTime.now();
		
		int totalNor2= Stream.of(1,2,3,4,5).parallel().reduce(100, (a,b)->a+b);
		
		LocalTime endTime2= LocalTime.now(); 
		int totalTime2 = Duration.between(startTime2, endTime2).getNano();
		System.out.println(totalTime2);
		
		String faster= totalTime1<totalTime2?"normal Stream":"Parallel Stream";
		System.out.println(faster+" is fast");
		
		//-----------------------------
		
		Long startTime3= System.currentTimeMillis();
		
		int totalNor3= Stream.of(1,2,3,4,5).reduce(100, (a,b)->a+b);
		
		Long endTime3= System.currentTimeMillis();
		Long totalTime3 = endTime3-startTime3;
		System.out.println("Sequential Stream takes: "+totalTime3);
		
		//--------2---------
		Long startTime4= System.currentTimeMillis();
		
		int totalNor4= Stream.of(1,2,3,4,5).parallel().reduce(100, (a,b)->a+b);
		
		Long endTime4= System.currentTimeMillis(); 
		Long totalTime4 = endTime4-startTime4;
		System.out.println("Parallel Stream takes: "+totalTime4);
				
		//String faster2= totalTime1<totalTime2?"normal Stream":"Parallel Stream";
		//System.out.println(faster+" is fast");
		
	}

}
