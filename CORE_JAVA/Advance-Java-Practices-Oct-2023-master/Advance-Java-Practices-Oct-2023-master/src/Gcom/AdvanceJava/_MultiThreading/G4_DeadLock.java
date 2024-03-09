package Gcom.AdvanceJava._MultiThreading;

/*

synchronized(Monitor_Object){
	// it will allow to enter only one thread at a time.
}


Solution for handling this situation:
1. don't use nested synchronized.
2. while call use same object in both synchronized block.

 */

public class G4_DeadLock {

	public static void main(String[] args) {
		Thread cook1 = new Thread(()->{
			synchronized (Kitchen.spoonObject) {
				System.out.println("Cook1: holding the spoon...");
				System.out.println("Cook1: Waiting for bowl...");
				synchronized (Kitchen.bawlObject) {
					System.out.println("Cook1: Holding Spoon and Bowl.");	
					// until no one release object it will not execute.
				}
			}
		} );
		Thread cook2 = new Thread(()->{
			synchronized (Kitchen.bawlObject) {
				System.out.println("Cook2: holding the bowl...");
				System.out.println("Cook2: Waiting for spoon...");
				synchronized (Kitchen.spoonObject) {
					System.out.println("Cook2: Holding Spoon and Bowl.");
				}
			}
		} );
		
		cook1.start();
		cook2.start();

	}

}

class Kitchen{
	public static Object spoonObject= new Object();
	public static Object bawlObject= new Object();
}