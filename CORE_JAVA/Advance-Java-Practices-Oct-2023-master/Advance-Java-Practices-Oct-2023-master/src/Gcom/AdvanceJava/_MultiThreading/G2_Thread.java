package Gcom.AdvanceJava._MultiThreading;

/*
 
 Two way for Thread
 1. use extends Thread class.
 
 */

public class G2_Thread {

	public static void main(String[] args) {
		
		System.out.println(Thread.activeCount());
		
		G1_ThreadUsingExtendsThread thread1 = new G1_ThreadUsingExtendsThread();
		thread1.start();
		
		G1_ThreadUsingExtendsThread thread2 = new G1_ThreadUsingExtendsThread();
		thread2.setName("My Custom Thread Name");
		thread2.start();
		System.out.println(Thread.activeCount());
		
		// in above example both thread start randomly sometime 1 then 2, or 2 then 1st.  
		
		
		Thread thread3= new Thread(new G1_ThreadUsingImplementRunnable());
		thread3.start();
	}

}
