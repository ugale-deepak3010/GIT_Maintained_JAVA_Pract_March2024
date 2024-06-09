package OtherTests;


/**
 * 	Thread can implement in two way!
 * 	extends Thread or implements Runnable 
 * 
 *  overriding run() method.
 *  
 */
public class ThreadPractice extends Thread {

	public void run() {
		System.out.println("Running the Thread");
	}
	
	public void hello() {
		System.out.println("Hello!");
	}
	
	public static void main(String[] args) {
		ThreadPractice o = new ThreadPractice();
		o.start();
		System.out.println("--------");
		o.hello();
		System.out.println("--------------------");
		o.run();
		
	}

}
