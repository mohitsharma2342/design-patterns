package com.design.patterns.singleton;

/**
 * @author mohit
 *
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	};

	
	
	/**
	 * he easier way to create a thread-safe singleton class is to make the global access method synchronized, 
	 * so that only one thread can execute this method at a time.
	 * 
	 * However works fine and provides thread-safety but it reduces the performance because of the cost associated
	 *  with the synchronized method, although we need
	 *  it only for the first few threads who might create the separate instances
	 *  
	 *  So we will use double checked locking principle 
	 */
	public static synchronized ThreadSafeSingleton getInstanceSingleCheck() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	/**
	 * The second check is inside the synchronized block and only executes one time
	 * during the lifespan of Singleton . That's why you get the performance boost
	 * becuase locking only happens one time during the lifespan of the Singleton
	 * instance.
	 * 
	 */
	public static ThreadSafeSingleton getInstanceDoubleCheck() {
		if (instance == null) {  //FirstCheck
			synchronized (ThreadSafeSingleton.class) { //SecondCheck
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}

			}
		}
		return instance;

	}

}
