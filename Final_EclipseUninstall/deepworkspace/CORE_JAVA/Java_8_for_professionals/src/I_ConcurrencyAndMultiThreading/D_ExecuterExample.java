package I_ConcurrencyAndMultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class D_ExecuterExample {

	public static void main(String[] args) {

		// 10 tasks executing using utilizing 5 threads.

		ExecutorService executor= Executors.newFixedThreadPool(5);
		
		Runnable task= ()->System.out.println("From executor on thread "+Thread.currentThread().getId());

		for(int i=0; i<10;i++) {
			executor.execute(task);
		}
		
		executor.shutdown();
		
	}

}
