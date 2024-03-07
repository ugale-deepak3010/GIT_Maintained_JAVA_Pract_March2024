package I_ConcurrencyAndMultiThreading;

public class A_ImplementsRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.print("Running the thread! #"+Thread.currentThread().getId());
		System.out.println(" Name= "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		A_ImplementsRunnable implementsRunnable= new A_ImplementsRunnable();
		implementsRunnable.run();
		
		
		//	way 2
		Thread thread2= new Thread(implementsRunnable);
		thread2.start();
		

		
	}

	

}
