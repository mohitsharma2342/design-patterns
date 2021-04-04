package com.design.patterns.abstractFactory;

public class AsiaCarFactory {


	public static Car builCar(CarType model) {
		Car car = null;
		switch (model) {
		case SEDAN:
			car = new Sedan(Location.ASIA);
			break;
		case LUXURY:
			car = new luxury(Location.ASIA);			
		default:
			break;
		}
		return car;
	
	
	}

}
