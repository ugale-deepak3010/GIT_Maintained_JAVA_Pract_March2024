package myPackage;

import javax.inject.Inject;

public class UsePoolManager {

	@Inject
	public PoolManager poolManager;


	public void usePooledManager() {

		System.out.println("Inside usePooledManager ");

		Object object = poolManager.borrowObject();

		// use Object
		poolManager.retunObject(object);
	}

}
