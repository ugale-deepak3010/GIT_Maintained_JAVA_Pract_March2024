package Gcom.AdvanceJava._MultiThreading;

/*
Threads:

One process have multiple threads. 
--------Memory------------
core1	core2	core3	coreN ..
thread1	thread12	...
thread2	thread22
thread1	thread2	

When threads useful in java
	Blocking i/o= When program ask user i/p but so execution is on hold 
					but in this time we can do some another process.
	GUI processing= AWT or Swing App's 
	Independent tasks


 */
public class G1_ThreadUsingExtendsThread extends Thread {

	@Override
	public void run() {
		for(int i=0; i<=100;i++) {
			System.out.println(" running on ->"+this.getName()+"<- thread i= "+i);
		}
	}

}
