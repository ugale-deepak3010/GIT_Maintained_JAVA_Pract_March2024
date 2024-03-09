package Gcom.AdvanceJava._MultiThreading;

/*
Runnable implement using advantages is we can extends another class!

 */
public class G1_ThreadUsingImplementRunnable implements Runnable {

	public void run() {
		for(int i=0; i<=100;i++) {
			System.out.println(" running on -==>"+Thread.currentThread().getName()+"<==- thread i= "+i);
		}
	}

}
