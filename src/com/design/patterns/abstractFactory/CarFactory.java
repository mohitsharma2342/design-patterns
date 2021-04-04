package com.design.patterns.abstractFactory;

public class CarFactory {

	public static Car buildCar(CarType model,Location location) {
		Car car =null;
		switch (location) {
		case USA:
			car = USACarFactory.build(model);
		case ASIA:
			car = AsiaCarFactory.builCar(model);
		
		default:
			break;
		}
		return car;
		
	}


}
