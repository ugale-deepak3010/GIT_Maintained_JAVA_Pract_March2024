package myPackage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.ejb.Singleton;



@Singleton
public class PoolManager {

	Queue<Object> poolObjects = new LinkedBlockingQueue<Object>(1_000);

	public PoolManager() {
		
		System.out.println("const");
		
		for (int i = 0; i < 1_000; i++) {
			poolObjects.offer(new Object());
			System.err.print(i);
		}
	}

	public void retunObject(Object object) {
		System.out.println("I am retunObject");
		poolObjects.offer(object);
	}
	
	public Object borrowObject() {
		System.out.println("I am borrow");
		return poolObjects.poll();
	}

}
