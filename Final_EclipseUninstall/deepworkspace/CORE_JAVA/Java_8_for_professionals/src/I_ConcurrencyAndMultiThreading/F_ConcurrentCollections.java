package I_ConcurrencyAndMultiThreading;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <pre>

Concurrent collection is execute on concurrent way.
it Designed concurrently run and manipulate

Example:
ConcurrentHashMap
ConcurrentLinkedQueue
ConcurrentSkipListQueue

 * </pre>
 * 
 * <sub>Created By Deepak Ugale on 07-Mar-2024 12:50:35 pm<sub>
 */

public class F_ConcurrentCollections extends Thread {

	HashMap<Integer, Integer> concurrentHashMap = new HashMap<Integer, Integer>();
	// ConcurrentHashMap<Integer, Integer> concurrentHashMap= new	// Synchronized 
	// ConcurrentHashMap<Integer, Integer>();

	static int i = 1;

	public void run() {
		int x = 0;
		for (int i = 0; i < 1000000; i++) {
			concurrentHashMap.put(i, x);
			x = x + i;
		}
		System.out.println("x= " + x + " Id" + Thread.currentThread().getId());
	}

	public void show() {
		concurrentHashMap.forEach((k, v) -> System.out.println(k + " : " + v));
	}

	public static void main(String[] args) {

		F_ConcurrentCollections con = new F_ConcurrentCollections();
		Thread thread1 = new Thread(con);

		thread1.start();// another thread
		
		con.show();
	}
}
