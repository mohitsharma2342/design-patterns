package com.design.patterns.abstractFactory;

public class luxury extends Car{

	luxury(Location location){
		super(CarType.LUXURY,location);
	}

	@Override
	protected void construct() {
	System.out.println("Luxury Car");
		
	}
}
