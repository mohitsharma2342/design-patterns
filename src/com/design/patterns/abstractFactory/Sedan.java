package com.design.patterns.abstractFactory;

public class Sedan extends Car{

	
	Sedan(Location location){
		super(CarType.SEDAN, location);
	}
	
	@Override
	protected void construct() {
	
		System.out.println("Sedan Car");
	}

	
	
}
