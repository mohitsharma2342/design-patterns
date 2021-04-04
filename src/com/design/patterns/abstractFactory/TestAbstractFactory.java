package com.design.patterns.abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.SEDAN, Location.ASIA));
	}

}
