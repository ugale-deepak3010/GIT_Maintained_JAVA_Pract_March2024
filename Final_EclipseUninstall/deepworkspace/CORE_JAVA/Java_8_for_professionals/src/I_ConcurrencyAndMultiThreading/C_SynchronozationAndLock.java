package I_ConcurrencyAndMultiThreading;

import java.util.Iterator;

/**
 * <pre>
 * 
 * Synchronization & Lock
 * 
 * When Resource must be thread exclusive
 * -	file resource must be use at a time once! 
 * -	Once one thread close resource then and then next thread can access.
 * -	Hence Thread must be in synchronized.
 * 
 * 	"Synchronize" word allow one thread at a time
 * 
 * </pre>
 */

public class C_SynchronozationAndLock extends Thread {

	static int num = 0;

	// try to remove "synchronized" word
	public synchronized void run() {

		for (int i = 0; i < 10000000; i++) {
			num++;
		}

		System.out.println(" Thread ID:" + Thread.currentThread().getName() + " num = " + num);
		num = 0;
	}

	public static void main(String[] args) {

		// run this class multiple time

		C_SynchronozationAndLock obj1 = new C_SynchronozationAndLock();

		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj1);
		Thread thread3 = new Thread(obj1);
		Thread thread4 = new Thread(obj1);
		Thread thread5 = new Thread(obj1);

		thread1.setName("1");
		thread2.setName("2");
		thread3.setName("3");
		thread4.setName("4");
		thread5.setName("5");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

	}

}
