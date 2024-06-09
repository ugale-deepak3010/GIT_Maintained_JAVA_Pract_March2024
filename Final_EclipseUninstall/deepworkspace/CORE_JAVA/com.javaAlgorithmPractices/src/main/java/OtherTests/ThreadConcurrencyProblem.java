package OtherTests;

public class ThreadConcurrencyProblem extends Thread {
	
	public static int amount = 0;
	
	public void run() {
		System.out.println(amount);
		amount++;
	}

	public static void main(String[] args) {
		
		ThreadConcurrencyProblem o= new ThreadConcurrencyProblem();
		o.start();
		o.stop();
		
		System.out.println(o.isAlive());
		
		System.out.println(amount);
		
		for (int i = 0; i < 10; i++) {
			amount = amount +10;
		}
		
		System.out.println(amount);
	}

}
