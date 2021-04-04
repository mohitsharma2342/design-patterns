package com.design.patterns.singleton;

public class SingletonPatternTest {

	public static void main(String[] args) {
		
		//Lazy initialization
		LazyInitializedSingleton object1 = LazyInitializedSingleton.getInstance();
		
		
		//ENUM
		 SingletonEnum singleton = SingletonEnum.INSTANCE;
		 System.out.println(singleton.getValue());
	     singleton.setValue(2);
	     System.out.println(singleton.getValue());
		
	}
	
}
