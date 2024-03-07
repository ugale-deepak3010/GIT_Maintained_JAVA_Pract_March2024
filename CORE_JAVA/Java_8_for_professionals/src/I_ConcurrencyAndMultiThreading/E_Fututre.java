package I_ConcurrencyAndMultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class E_Fututre {

	public static void main(String[] args) {
		
		System.out.println("--");

		ExecutorService executor= Executors.newFixedThreadPool(2);
		
		Callable<Integer> task= ()->{
			Thread.sleep(1000);
			System.out.println("kk");
			return 123;
		};
		
		Future<Integer> future= executor.submit(task);
		
		try {
			Integer result= future.get(2, TimeUnit.SECONDS);
			System.out.println("ResultL: "+result);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
