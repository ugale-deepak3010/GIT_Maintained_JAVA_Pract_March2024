package I_ConcurrencyAndMultiThreading;


public class B_MultiThreading extends Thread {
	
	
	public void run() {
					
		long id= Thread.currentThread().getId();
		String name= Thread.currentThread().getName();
		
		System.out.println("Running the thread! #"+id+" Name= "+name);
	}

	public static void main(String[] args) {
		
		B_MultiThreading myClass= new B_MultiThreading();
		
		Thread thread1= new Thread(myClass);
		Thread thread2= new Thread(myClass);
		Thread thread3= new Thread(myClass);
		Thread thread4= new Thread(myClass);
		Thread thread5= new Thread(myClass);
		Thread thread6= new Thread(myClass);
		
		thread1.start();
		thread6.start();
		
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		// no order is maintained for execute thread, try to run multiple times

	}

}
