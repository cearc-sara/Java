package com.qa.garage;

public class Car extends Vehicle {

	public Car(String manufacturer, String model, int doors) {
		super(manufacturer, model, doors);
		
	}

	@Override
	public void accelerate() {
		System.out.println("Increasing fuel flow");
		System.out.println("Clutch connected");
		System.out.println("Accelerating");
		
	}

	@Override
	public void breaking() {
		System.out.println("Applying break disks");
		
	}
	
}
