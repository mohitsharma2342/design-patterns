package com.design.patterns.abstractFactory;

public abstract class Car {


	private CarType carType;
	private Location location;
	
	
	protected abstract void construct() ;
	
	
	public Car(CarType carType, Location location) {
		super();
		this.carType = carType;
		this.location = location;
	}


	@Override
	public String toString() {
		return "Car [carType=" + carType + ", location=" + location + "]";
	}
	
}
