package com.design.patterns.singleton;




/**
 * @author mohit
 * 
 * 
 *  this implementation works fine in case of the single-threaded environment but when it comes 
 *  to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the 
 *  same time. It will destroy the singleton pattern and both threads 
 *  will get the different instances of the singleton class
 *  
 */
public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instace;
	
	private LazyInitializedSingleton() {};
	
	public static LazyInitializedSingleton getInstance() {
		if(instace==null) {
			instace = new LazyInitializedSingleton();
		}
		return instace;
	}
	
}
