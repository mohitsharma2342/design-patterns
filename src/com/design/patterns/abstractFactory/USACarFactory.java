package com.design.patterns.abstractFactory;

public class USACarFactory {


	public static Car build(CarType model) {
		
		Car car = null;
		switch (model) {
		case SEDAN:
			car = new Sedan(Location.USA);
			break;
		case LUXURY:
			car = new luxury(Location.USA);			
		default:
			break;
		}
		return car;
	}
	
	
	
}
