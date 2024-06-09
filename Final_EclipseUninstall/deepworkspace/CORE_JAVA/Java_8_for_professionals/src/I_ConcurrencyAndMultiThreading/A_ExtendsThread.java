package I_ConcurrencyAndMultiThreading;

public class A_ExtendsThread extends Thread {
	
	public void run() {
		long id= Thread.currentThread().getId();
		String name= Thread.currentThread().getName();
		
		System.out.println("Running the thread! #"+id+" Name= "+name);
	}

	public static void main(String[] args) {
		
		
		
		A_ExtendsThread extendsThread= new A_ExtendsThread();
		extendsThread.start();
		

		// way 2
		Thread thread2= new Thread(extendsThread);
		thread2.run();
		
		
		
		

	}

}
